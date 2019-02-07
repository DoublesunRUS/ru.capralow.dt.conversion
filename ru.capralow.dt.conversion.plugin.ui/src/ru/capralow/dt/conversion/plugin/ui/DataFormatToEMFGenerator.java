package ru.capralow.dt.conversion.plugin.ui;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com._1c.g5.v8.dt.mcore.QName;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;
import com._1c.g5.v8.dt.xdto.model.ObjectType;
import com._1c.g5.v8.dt.xdto.model.Package;
import com._1c.g5.v8.dt.xdto.model.Property;

public class DataFormatToEMFGenerator {
	public Resource generate(XDTOPackage xdtoPackage) throws IOException {
		final EPackage newPackage = createPackage(xdtoPackage.getName(), "ed", xdtoPackage.getNamespace());

		Package dataPackage = xdtoPackage.getPackage();

		EList<ObjectType> dataObjects = dataPackage.getObjects();
		Iterator<ObjectType> itrObjects = dataObjects.iterator();
		while (itrObjects.hasNext()) {
			ObjectType object = itrObjects.next();

			String objectName = object.getName();

			EClass ecObject = createEClass(objectName);
			newPackage.getEClassifiers().add(ecObject);

			EList<Property> objectProperties = object.getProperties();
			Iterator<Property> itrProperties = objectProperties.iterator();
			while (itrProperties.hasNext()) {
				Property property = itrProperties.next();

				String propertyTypeName = "";
				QName propertyType = property.getType();
				if (propertyType != null)
					propertyTypeName = propertyType.getName();

				addAttribute(ecObject, property.getName(), EcorePackage.Literals.ESTRING, true,
						property.getLowerBound(), property.getUpperBound());
			}
			// addSuperType(edEClass, ddlPackage, "AbstractRow");

			// addAttribute(customerRow, "id", EcorePackage.Literals.ESTRING, true, 1, 1);
			// object.getName()
		}

		// add our super-class
		// addSuperType(customerRow, ddlPackage, "AbstractRow");
		// add our features
		// addAttribute(customerRow, "id", EcorePackage.Literals.ESTRING, true, 1, 1);
		// addAttribute(customerRow, "firstName", EcorePackage.Literals.ESTRING, false,
		// 0, 1);
		// addAttribute(customerRow, "lastName", EcorePackage.Literals.ESTRING, false,
		// 0, 1);

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource outputRes = resourceSet.createResource(URI.createURI(xdtoPackage.getName() + ".ecore"));
		outputRes.getContents().add(newPackage);
		outputRes.save(Collections.emptyMap());

		return outputRes;
	}

	private void addAttribute(EClass customerRow, String name, EClassifier type, boolean isId, int lowerBound,
			int upperBound) {
		final EAttribute attribute = EcoreFactory.eINSTANCE.createEAttribute();
		// always add to container first
		customerRow.getEStructuralFeatures().add(attribute);
		attribute.setName(name);
		attribute.setEType(type);
		attribute.setID(isId);
		attribute.setLowerBound(lowerBound);
		attribute.setUpperBound(upperBound);
	}

	private void addReference(EClass customerRow, String name, EClassifier type, int lowerBound, int upperBound) {
		final EReference reference = EcoreFactory.eINSTANCE.createEReference();
		// always add to container first
		customerRow.getEStructuralFeatures().add(reference);
		reference.setName(name);
		reference.setEType(type);
		reference.setLowerBound(lowerBound);
		reference.setUpperBound(upperBound);
	}

	private EPackage createPackage(final String name, final String prefix, final String uri) {
		final EPackage epackage = EcoreFactory.eINSTANCE.createEPackage();
		epackage.setName(name);
		epackage.setNsPrefix(prefix);
		epackage.setNsURI(uri);
		return epackage;
	}

	private EClass createEClass(final String name) {
		final EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(name);
		return eClass;
	}

	private void addSuperType(EClass customerRow, EPackage ddlPackage, String name) {
		final EClass eSuperClass = (EClass) ddlPackage.getEClassifier(name);
		customerRow.getESuperTypes().add(eSuperClass);
	}

}
