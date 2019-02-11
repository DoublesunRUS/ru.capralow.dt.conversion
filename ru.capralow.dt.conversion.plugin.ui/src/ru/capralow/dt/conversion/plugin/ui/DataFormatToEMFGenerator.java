package ru.capralow.dt.conversion.plugin.ui;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
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
		final EPackage ePackage = createPackage(xdtoPackage.getName(), "ed", xdtoPackage.getNamespace());

		Package dataPackage = xdtoPackage.getPackage();

		EList<ObjectType> dataObjects = dataPackage.getObjects();
		Iterator<ObjectType> itrObjects = dataObjects.iterator();
		while (itrObjects.hasNext()) {
			ObjectType object = itrObjects.next();

			String objectName = object.getName();
			if (!objectName.startsWith("Справочник."))
				continue;

			EClass ecObject = createEClass(objectName.replace(".", "_"));
			ePackage.getEClassifiers().add(ecObject);

			EList<Property> objectProperties = object.getProperties();
			Iterator<Property> itrProperties = objectProperties.iterator();
			while (itrProperties.hasNext()) {
				Property property = itrProperties.next();

				String propertyName = property.getName();
				QName propertyType = property.getType();

				boolean isID = propertyName.equals("КлючевыеСвойства");

				if (propertyType == null) {
					addAttribute(ecObject, propertyName, EcorePackage.Literals.ESTRING, isID, property.getLowerBound(),
							property.getUpperBound());

				} else {
					String propertyTypeName = propertyType.getName();
					if (propertyTypeName.equals("boolean"))
						addAttribute(ecObject, propertyName, EcorePackage.Literals.EBOOLEAN, isID,
								property.getLowerBound(), property.getUpperBound());
					else
						addReference(ecObject, propertyName, EcorePackage.Literals.ECLASS, property.getLowerBound(),
								property.getUpperBound());

				}

			}
			// addSuperType(edEClass, ddlPackage, "AbstractRow");

		}

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource outputRes = resourceSet.createResource(URI.createURI(xdtoPackage.getName() + ".ecore"));
		outputRes.getContents().add(ePackage);
		outputRes.save(Collections.emptyMap());

		return outputRes;
	}

	private void addAttribute(EClass object, String name, EClassifier type, boolean isId, int lowerBound,
			int upperBound) {
		final EAttribute attribute = EcoreFactory.eINSTANCE.createEAttribute();
		object.getEStructuralFeatures().add(attribute);
		attribute.setName(name);
		attribute.setEType(type);
		attribute.setID(isId);
		attribute.setLowerBound(lowerBound);
		attribute.setUpperBound(upperBound);
	}

	private void addReference(EClass object, String name, EClassifier type, int lowerBound, int upperBound) {
		final EReference reference = EcoreFactory.eINSTANCE.createEReference();
		object.getEStructuralFeatures().add(reference);
		reference.setName(name);
		reference.setEType(type);
		reference.setLowerBound(lowerBound);
		reference.setUpperBound(upperBound);
	}

	private void addSuperType(EClass object, EPackage ddlPackage, String name) {
		final EClass eSuperClass = (EClass) ddlPackage.getEClassifier(name);
		object.getESuperTypes().add(eSuperClass);
	}

	private EEnum createEEnum(final String name) {
		final EEnum eNum = EcoreFactory.eINSTANCE.createEEnum();
		eNum.setName(name);
		return eNum;

	}

	private EClass createEClass(final String name) {
		final EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(name);
		return eClass;
	}

	private EPackage createPackage(final String name, final String prefix, final String uri) {
		final EPackage epackage = EcoreFactory.eINSTANCE.createEPackage();
		epackage.setName(name);
		epackage.setNsPrefix(prefix);
		epackage.setNsURI(uri);
		return epackage;
	}

}
