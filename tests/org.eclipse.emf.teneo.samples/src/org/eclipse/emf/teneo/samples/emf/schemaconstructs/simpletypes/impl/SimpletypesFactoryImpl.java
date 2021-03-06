/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpletypesFactoryImpl.java,v 1.8 2007/04/23 02:36:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl;

import java.math.BigDecimal;
import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.*;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpletypesFactoryImpl extends EFactoryImpl implements SimpletypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpletypesFactory init() {
		try {
			SimpletypesFactory theSimpletypesFactory = (SimpletypesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/simpletypes"); 
			if (theSimpletypesFactory != null) {
				return theSimpletypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpletypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpletypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimpletypesPackage.SIMPLE_LIST: return createSimpleList();
			case SimpletypesPackage.SIMPLE_TYPE: return createSimpleType();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT: return createSimpleTypeObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimpletypesPackage.SIMPLE_ENUM:
				return createSimpleEnumFromString(eDataType, initialValue);
			case SimpletypesPackage.BOOL:
				return createBoolFromString(eDataType, initialValue);
			case SimpletypesPackage.BYTE:
				return createByteFromString(eDataType, initialValue);
			case SimpletypesPackage.BYTE_ARRAY:
				return createByteArrayFromString(eDataType, initialValue);
			case SimpletypesPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case SimpletypesPackage.DOUBLE:
				return createDoubleFromString(eDataType, initialValue);
			case SimpletypesPackage.DOUBLE_ARRAY:
				return createDoubleArrayFromString(eDataType, initialValue);
			case SimpletypesPackage.EXTRA_LIMITED_STRING:
				return createExtraLimitedStringFromString(eDataType, initialValue);
			case SimpletypesPackage.FLOAT:
				return createFloatFromString(eDataType, initialValue);
			case SimpletypesPackage.INT:
				return createIntFromString(eDataType, initialValue);
			case SimpletypesPackage.INT_ARRAY:
				return createIntArrayFromString(eDataType, initialValue);
			case SimpletypesPackage.LIMITED_DECIMAL:
				return createLimitedDecimalFromString(eDataType, initialValue);
			case SimpletypesPackage.LIMITED_STRING:
				return createLimitedStringFromString(eDataType, initialValue);
			case SimpletypesPackage.LONG:
				return createLongFromString(eDataType, initialValue);
			case SimpletypesPackage.SIMPLE_ENUM_OBJECT:
				return createSimpleEnumObjectFromString(eDataType, initialValue);
			case SimpletypesPackage.STRING_ARRAY:
				return createStringArrayFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimpletypesPackage.SIMPLE_ENUM:
				return convertSimpleEnumToString(eDataType, instanceValue);
			case SimpletypesPackage.BOOL:
				return convertBoolToString(eDataType, instanceValue);
			case SimpletypesPackage.BYTE:
				return convertByteToString(eDataType, instanceValue);
			case SimpletypesPackage.BYTE_ARRAY:
				return convertByteArrayToString(eDataType, instanceValue);
			case SimpletypesPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case SimpletypesPackage.DOUBLE:
				return convertDoubleToString(eDataType, instanceValue);
			case SimpletypesPackage.DOUBLE_ARRAY:
				return convertDoubleArrayToString(eDataType, instanceValue);
			case SimpletypesPackage.EXTRA_LIMITED_STRING:
				return convertExtraLimitedStringToString(eDataType, instanceValue);
			case SimpletypesPackage.FLOAT:
				return convertFloatToString(eDataType, instanceValue);
			case SimpletypesPackage.INT:
				return convertIntToString(eDataType, instanceValue);
			case SimpletypesPackage.INT_ARRAY:
				return convertIntArrayToString(eDataType, instanceValue);
			case SimpletypesPackage.LIMITED_DECIMAL:
				return convertLimitedDecimalToString(eDataType, instanceValue);
			case SimpletypesPackage.LIMITED_STRING:
				return convertLimitedStringToString(eDataType, instanceValue);
			case SimpletypesPackage.LONG:
				return convertLongToString(eDataType, instanceValue);
			case SimpletypesPackage.SIMPLE_ENUM_OBJECT:
				return convertSimpleEnumObjectToString(eDataType, instanceValue);
			case SimpletypesPackage.STRING_ARRAY:
				return convertStringArrayToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleList createSimpleList() {
		SimpleListImpl simpleList = new SimpleListImpl();
		return simpleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType createSimpleType() {
		SimpleTypeImpl simpleType = new SimpleTypeImpl();
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeObject createSimpleTypeObject() {
		SimpleTypeObjectImpl simpleTypeObject = new SimpleTypeObjectImpl();
		return simpleTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleEnum createSimpleEnumFromString(EDataType eDataType, String initialValue) {
		SimpleEnum result = SimpleEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBoolFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoolToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createByteFromString(EDataType eDataType, String initialValue) {
		return (Byte)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertByteToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createByteArrayFromString(EDataType eDataType, String initialValue) {
		return (byte[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertByteArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double[] createDoubleArrayFromString(EDataType eDataType, String initialValue) {
		return (double[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExtraLimitedStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtraLimitedStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] createIntArrayFromString(EDataType eDataType, String initialValue) {
		return (int[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLimitedDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLimitedDecimalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLimitedStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLimitedStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createLongFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleEnum createSimpleEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSimpleEnumFromString(SimpletypesPackage.Literals.SIMPLE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSimpleEnumToString(SimpletypesPackage.Literals.SIMPLE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] createStringArrayFromString(EDataType eDataType, String initialValue) {
		return (String[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpletypesPackage getSimpletypesPackage() {
		return (SimpletypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpletypesPackage getPackage() {
		return SimpletypesPackage.eINSTANCE;
	}

} //SimpletypesFactoryImpl
