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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;
import com._1c.g5.v8.dt.xdto.model.ObjectType;
import com._1c.g5.v8.dt.xdto.model.Package;

public class DataFormatToEMFGenerator {
	public Resource generate(XDTOPackage xdtoPackage) throws IOException {
		// next we will create our own new package to contained what we will generate
		final EPackage newPackage = createPackage(xdtoPackage.getName(), "ed", xdtoPackage.getNamespace());

		// next, create the row class
		EClass edEClass = createEClass("EnterpriseData");
		// add to package before we do anything else
		newPackage.getEClassifiers().add(edEClass);

		Package dataPackage = xdtoPackage.getPackage();

		EList<ObjectType> dataObjects = dataPackage.getObjects();
		Iterator<ObjectType> itrObjects = dataObjects.iterator();
		while (itrObjects.hasNext()) {
			ObjectType object = itrObjects.next();

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

		// next, create the table class
		EClass customers = createEClass("Customers");
		// add to package before we do anything else
		newPackage.getEClassifiers().add(customers);
		// add our super-class
		// addSuperType(customers, ddlPackage, "AbstractTable");
		// add our features
		// addReference(customers, "rows", customerRow, 0, -1);

		// it is very important that we do everything through ResourceSet's
		ResourceSet resourceSet = new ResourceSetImpl();
		// now create a new resource to serialize the ecore model
		Resource outputRes = resourceSet.createResource(URI.createURI(xdtoPackage.getName() + ".ecore"));
		// add our new package to resource contents
		outputRes.getContents().add(newPackage);
		// and at last, we save to standard out. Remove the first argument to save to
		// file specified in pathToOutputFile
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
