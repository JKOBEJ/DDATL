/**
 */
package jointPackage_Ecore2Maude.util;

import jointPackage_Ecore2Maude.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see JointPackage_Ecore2MaudePackage
 * @generated
 */
public class JointPackage_Ecore2MaudeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_Ecore2MaudePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_Ecore2MaudeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JointPackage_Ecore2MaudePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointPackage_Ecore2MaudeSwitch<Adapter> modelSwitch =
		new JointPackage_Ecore2MaudeSwitch<Adapter>() {
			@Override
			public Adapter caseJointMM(JointMM object) {
				return createJointMMAdapter();
			}
			@Override
			public Adapter caseSrcEStringToStringMapEntry(SrcEStringToStringMapEntry object) {
				return createSrcEStringToStringMapEntryAdapter();
			}
			@Override
			public Adapter caseSrcEAttribute(SrcEAttribute object) {
				return createSrcEAttributeAdapter();
			}
			@Override
			public Adapter caseSrcEClass(SrcEClass object) {
				return createSrcEClassAdapter();
			}
			@Override
			public Adapter caseSrcEClassifier(SrcEClassifier object) {
				return createSrcEClassifierAdapter();
			}
			@Override
			public Adapter caseSrcEDataType(SrcEDataType object) {
				return createSrcEDataTypeAdapter();
			}
			@Override
			public Adapter caseSrcEEnum(SrcEEnum object) {
				return createSrcEEnumAdapter();
			}
			@Override
			public Adapter caseSrcEEnumLiteral(SrcEEnumLiteral object) {
				return createSrcEEnumLiteralAdapter();
			}
			@Override
			public Adapter caseSrcENamedElement(SrcENamedElement object) {
				return createSrcENamedElementAdapter();
			}
			@Override
			public Adapter caseSrcEOperation(SrcEOperation object) {
				return createSrcEOperationAdapter();
			}
			@Override
			public Adapter caseSrcEPackage(SrcEPackage object) {
				return createSrcEPackageAdapter();
			}
			@Override
			public Adapter caseSrcEParameter(SrcEParameter object) {
				return createSrcEParameterAdapter();
			}
			@Override
			public Adapter caseSrcEReference(SrcEReference object) {
				return createSrcEReferenceAdapter();
			}
			@Override
			public Adapter caseSrcEStructuralFeature(SrcEStructuralFeature object) {
				return createSrcEStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseSrcETypedElement(SrcETypedElement object) {
				return createSrcETypedElementAdapter();
			}
			@Override
			public Adapter caseTrgMaudeSpec(TrgMaudeSpec object) {
				return createTrgMaudeSpecAdapter();
			}
			@Override
			public Adapter caseTrgMembership(TrgMembership object) {
				return createTrgMembershipAdapter();
			}
			@Override
			public Adapter caseTrgEquation(TrgEquation object) {
				return createTrgEquationAdapter();
			}
			@Override
			public Adapter caseTrgRule(TrgRule object) {
				return createTrgRuleAdapter();
			}
			@Override
			public Adapter caseTrgMembershipCond(TrgMembershipCond object) {
				return createTrgMembershipCondAdapter();
			}
			@Override
			public Adapter caseTrgBooleanCond(TrgBooleanCond object) {
				return createTrgBooleanCondAdapter();
			}
			@Override
			public Adapter caseTrgMatchingCond(TrgMatchingCond object) {
				return createTrgMatchingCondAdapter();
			}
			@Override
			public Adapter caseTrgEqualCond(TrgEqualCond object) {
				return createTrgEqualCondAdapter();
			}
			@Override
			public Adapter caseTrgMaudeTopEl(TrgMaudeTopEl object) {
				return createTrgMaudeTopElAdapter();
			}
			@Override
			public Adapter caseTrgModExpression(TrgModExpression object) {
				return createTrgModExpressionAdapter();
			}
			@Override
			public Adapter caseTrgInstModExp(TrgInstModExp object) {
				return createTrgInstModExpAdapter();
			}
			@Override
			public Adapter caseTrgRenModExp(TrgRenModExp object) {
				return createTrgRenModExpAdapter();
			}
			@Override
			public Adapter caseTrgCompModExp(TrgCompModExp object) {
				return createTrgCompModExpAdapter();
			}
			@Override
			public Adapter caseTrgModuleIdModExp(TrgModuleIdModExp object) {
				return createTrgModuleIdModExpAdapter();
			}
			@Override
			public Adapter caseTrgTheoryIdModExp(TrgTheoryIdModExp object) {
				return createTrgTheoryIdModExpAdapter();
			}
			@Override
			public Adapter caseTrgParameter(TrgParameter object) {
				return createTrgParameterAdapter();
			}
			@Override
			public Adapter caseTrgTheory(TrgTheory object) {
				return createTrgTheoryAdapter();
			}
			@Override
			public Adapter caseTrgFTheory(TrgFTheory object) {
				return createTrgFTheoryAdapter();
			}
			@Override
			public Adapter caseTrgSTheory(TrgSTheory object) {
				return createTrgSTheoryAdapter();
			}
			@Override
			public Adapter caseTrgModule(TrgModule object) {
				return createTrgModuleAdapter();
			}
			@Override
			public Adapter caseTrgFModule(TrgFModule object) {
				return createTrgFModuleAdapter();
			}
			@Override
			public Adapter caseTrgSModule(TrgSModule object) {
				return createTrgSModuleAdapter();
			}
			@Override
			public Adapter caseTrgModElement(TrgModElement object) {
				return createTrgModElementAdapter();
			}
			@Override
			public Adapter caseTrgModImportation(TrgModImportation object) {
				return createTrgModImportationAdapter();
			}
			@Override
			public Adapter caseTrgType(TrgType object) {
				return createTrgTypeAdapter();
			}
			@Override
			public Adapter caseTrgSort(TrgSort object) {
				return createTrgSortAdapter();
			}
			@Override
			public Adapter caseTrgKind(TrgKind object) {
				return createTrgKindAdapter();
			}
			@Override
			public Adapter caseTrgSubsortRel(TrgSubsortRel object) {
				return createTrgSubsortRelAdapter();
			}
			@Override
			public Adapter caseTrgOperation(TrgOperation object) {
				return createTrgOperationAdapter();
			}
			@Override
			public Adapter caseTrgStatement(TrgStatement object) {
				return createTrgStatementAdapter();
			}
			@Override
			public Adapter caseTrgCondition(TrgCondition object) {
				return createTrgConditionAdapter();
			}
			@Override
			public Adapter caseTrgEquationalCond(TrgEquationalCond object) {
				return createTrgEquationalCondAdapter();
			}
			@Override
			public Adapter caseTrgRewriteCond(TrgRewriteCond object) {
				return createTrgRewriteCondAdapter();
			}
			@Override
			public Adapter caseTrgTerm(TrgTerm object) {
				return createTrgTermAdapter();
			}
			@Override
			public Adapter caseTrgConstant(TrgConstant object) {
				return createTrgConstantAdapter();
			}
			@Override
			public Adapter caseTrgRecTerm(TrgRecTerm object) {
				return createTrgRecTermAdapter();
			}
			@Override
			public Adapter caseTrgVariable(TrgVariable object) {
				return createTrgVariableAdapter();
			}
			@Override
			public Adapter caseTrgView(TrgView object) {
				return createTrgViewAdapter();
			}
			@Override
			public Adapter caseTrgViewMapping(TrgViewMapping object) {
				return createTrgViewMappingAdapter();
			}
			@Override
			public Adapter caseTrgRenMapping(TrgRenMapping object) {
				return createTrgRenMappingAdapter();
			}
			@Override
			public Adapter caseTrgTermMapping(TrgTermMapping object) {
				return createTrgTermMappingAdapter();
			}
			@Override
			public Adapter caseTrgSortMapping(TrgSortMapping object) {
				return createTrgSortMappingAdapter();
			}
			@Override
			public Adapter caseTrgOpTypedMapping(TrgOpTypedMapping object) {
				return createTrgOpTypedMappingAdapter();
			}
			@Override
			public Adapter caseTrgOpMapping(TrgOpMapping object) {
				return createTrgOpMappingAdapter();
			}
			@Override
			public Adapter caseTrgLabelMapping(TrgLabelMapping object) {
				return createTrgLabelMappingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JointMM
	 * @generated
	 */
	public Adapter createJointMMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEStringToStringMapEntry <em>Src EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEStringToStringMapEntry
	 * @generated
	 */
	public Adapter createSrcEStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEAttribute <em>Src EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEAttribute
	 * @generated
	 */
	public Adapter createSrcEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEClass <em>Src EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEClass
	 * @generated
	 */
	public Adapter createSrcEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEClassifier <em>Src EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEClassifier
	 * @generated
	 */
	public Adapter createSrcEClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEDataType <em>Src EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEDataType
	 * @generated
	 */
	public Adapter createSrcEDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEEnum <em>Src EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEEnum
	 * @generated
	 */
	public Adapter createSrcEEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEEnumLiteral <em>Src EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEEnumLiteral
	 * @generated
	 */
	public Adapter createSrcEEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcENamedElement <em>Src ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcENamedElement
	 * @generated
	 */
	public Adapter createSrcENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEOperation <em>Src EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEOperation
	 * @generated
	 */
	public Adapter createSrcEOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEPackage <em>Src EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEPackage
	 * @generated
	 */
	public Adapter createSrcEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEParameter <em>Src EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEParameter
	 * @generated
	 */
	public Adapter createSrcEParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEReference <em>Src EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEReference
	 * @generated
	 */
	public Adapter createSrcEReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcEStructuralFeature <em>Src EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcEStructuralFeature
	 * @generated
	 */
	public Adapter createSrcEStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcETypedElement <em>Src ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcETypedElement
	 * @generated
	 */
	public Adapter createSrcETypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgMaudeSpec <em>Trg Maude Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgMaudeSpec
	 * @generated
	 */
	public Adapter createTrgMaudeSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgMembership <em>Trg Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgMembership
	 * @generated
	 */
	public Adapter createTrgMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgEquation <em>Trg Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgEquation
	 * @generated
	 */
	public Adapter createTrgEquationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgRule <em>Trg Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgRule
	 * @generated
	 */
	public Adapter createTrgRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgMembershipCond <em>Trg Membership Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgMembershipCond
	 * @generated
	 */
	public Adapter createTrgMembershipCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgBooleanCond <em>Trg Boolean Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgBooleanCond
	 * @generated
	 */
	public Adapter createTrgBooleanCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgMatchingCond <em>Trg Matching Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgMatchingCond
	 * @generated
	 */
	public Adapter createTrgMatchingCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgEqualCond <em>Trg Equal Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgEqualCond
	 * @generated
	 */
	public Adapter createTrgEqualCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgMaudeTopEl <em>Trg Maude Top El</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgMaudeTopEl
	 * @generated
	 */
	public Adapter createTrgMaudeTopElAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgModExpression <em>Trg Mod Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgModExpression
	 * @generated
	 */
	public Adapter createTrgModExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgInstModExp <em>Trg Inst Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgInstModExp
	 * @generated
	 */
	public Adapter createTrgInstModExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgRenModExp <em>Trg Ren Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgRenModExp
	 * @generated
	 */
	public Adapter createTrgRenModExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgCompModExp <em>Trg Comp Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgCompModExp
	 * @generated
	 */
	public Adapter createTrgCompModExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgModuleIdModExp <em>Trg Module Id Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgModuleIdModExp
	 * @generated
	 */
	public Adapter createTrgModuleIdModExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgTheoryIdModExp <em>Trg Theory Id Mod Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgTheoryIdModExp
	 * @generated
	 */
	public Adapter createTrgTheoryIdModExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgParameter <em>Trg Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgParameter
	 * @generated
	 */
	public Adapter createTrgParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgTheory <em>Trg Theory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgTheory
	 * @generated
	 */
	public Adapter createTrgTheoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgFTheory <em>Trg FTheory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgFTheory
	 * @generated
	 */
	public Adapter createTrgFTheoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSTheory <em>Trg STheory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSTheory
	 * @generated
	 */
	public Adapter createTrgSTheoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgModule <em>Trg Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgModule
	 * @generated
	 */
	public Adapter createTrgModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgFModule <em>Trg FModule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgFModule
	 * @generated
	 */
	public Adapter createTrgFModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSModule <em>Trg SModule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSModule
	 * @generated
	 */
	public Adapter createTrgSModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgModElement <em>Trg Mod Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgModElement
	 * @generated
	 */
	public Adapter createTrgModElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgModImportation <em>Trg Mod Importation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgModImportation
	 * @generated
	 */
	public Adapter createTrgModImportationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgType <em>Trg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgType
	 * @generated
	 */
	public Adapter createTrgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSort <em>Trg Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSort
	 * @generated
	 */
	public Adapter createTrgSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgKind <em>Trg Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgKind
	 * @generated
	 */
	public Adapter createTrgKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSubsortRel <em>Trg Subsort Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSubsortRel
	 * @generated
	 */
	public Adapter createTrgSubsortRelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgOperation <em>Trg Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgOperation
	 * @generated
	 */
	public Adapter createTrgOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgStatement <em>Trg Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgStatement
	 * @generated
	 */
	public Adapter createTrgStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgCondition <em>Trg Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgCondition
	 * @generated
	 */
	public Adapter createTrgConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgEquationalCond <em>Trg Equational Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgEquationalCond
	 * @generated
	 */
	public Adapter createTrgEquationalCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgRewriteCond <em>Trg Rewrite Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgRewriteCond
	 * @generated
	 */
	public Adapter createTrgRewriteCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgTerm <em>Trg Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgTerm
	 * @generated
	 */
	public Adapter createTrgTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgConstant <em>Trg Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgConstant
	 * @generated
	 */
	public Adapter createTrgConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgRecTerm <em>Trg Rec Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgRecTerm
	 * @generated
	 */
	public Adapter createTrgRecTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgVariable <em>Trg Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgVariable
	 * @generated
	 */
	public Adapter createTrgVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgView <em>Trg View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgView
	 * @generated
	 */
	public Adapter createTrgViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgViewMapping <em>Trg View Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgViewMapping
	 * @generated
	 */
	public Adapter createTrgViewMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgRenMapping <em>Trg Ren Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgRenMapping
	 * @generated
	 */
	public Adapter createTrgRenMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgTermMapping <em>Trg Term Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgTermMapping
	 * @generated
	 */
	public Adapter createTrgTermMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSortMapping <em>Trg Sort Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSortMapping
	 * @generated
	 */
	public Adapter createTrgSortMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgOpTypedMapping <em>Trg Op Typed Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgOpTypedMapping
	 * @generated
	 */
	public Adapter createTrgOpTypedMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgOpMapping <em>Trg Op Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgOpMapping
	 * @generated
	 */
	public Adapter createTrgOpMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgLabelMapping <em>Trg Label Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgLabelMapping
	 * @generated
	 */
	public Adapter createTrgLabelMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JointPackage_Ecore2MaudeAdapterFactory
