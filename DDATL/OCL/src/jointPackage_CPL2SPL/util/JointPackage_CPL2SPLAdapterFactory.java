/**
 */
package jointPackage_CPL2SPL.util;

import jointPackage_CPL2SPL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see JointPackage_CPL2SPLPackage
 * @generated
 */
public class JointPackage_CPL2SPLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_CPL2SPLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_CPL2SPLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JointPackage_CPL2SPLPackage.eINSTANCE;
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
	protected JointPackage_CPL2SPLSwitch<Adapter> modelSwitch =
		new JointPackage_CPL2SPLSwitch<Adapter>() {
			@Override
			public Adapter caseJointMM(JointMM object) {
				return createJointMMAdapter();
			}
			@Override
			public Adapter caseSrcCPLModel(SrcCPLModel object) {
				return createSrcCPLModelAdapter();
			}
			@Override
			public Adapter caseSrcCPL(SrcCPL object) {
				return createSrcCPLAdapter();
			}
			@Override
			public Adapter caseSrcAddressSwitch(SrcAddressSwitch object) {
				return createSrcAddressSwitchAdapter();
			}
			@Override
			public Adapter caseSrcStringSwitch(SrcStringSwitch object) {
				return createSrcStringSwitchAdapter();
			}
			@Override
			public Adapter caseSrcLanguageSwitch(SrcLanguageSwitch object) {
				return createSrcLanguageSwitchAdapter();
			}
			@Override
			public Adapter caseSrcTimeSwitch(SrcTimeSwitch object) {
				return createSrcTimeSwitchAdapter();
			}
			@Override
			public Adapter caseSrcPrioritySwitch(SrcPrioritySwitch object) {
				return createSrcPrioritySwitchAdapter();
			}
			@Override
			public Adapter caseSrcProxy(SrcProxy object) {
				return createSrcProxyAdapter();
			}
			@Override
			public Adapter caseSrcRedirect(SrcRedirect object) {
				return createSrcRedirectAdapter();
			}
			@Override
			public Adapter caseSrcReject(SrcReject object) {
				return createSrcRejectAdapter();
			}
			@Override
			public Adapter caseSrcElement(SrcElement object) {
				return createSrcElementAdapter();
			}
			@Override
			public Adapter caseSrcNodeContainer(SrcNodeContainer object) {
				return createSrcNodeContainerAdapter();
			}
			@Override
			public Adapter caseSrcSubAction(SrcSubAction object) {
				return createSrcSubActionAdapter();
			}
			@Override
			public Adapter caseSrcOutgoing(SrcOutgoing object) {
				return createSrcOutgoingAdapter();
			}
			@Override
			public Adapter caseSrcIncoming(SrcIncoming object) {
				return createSrcIncomingAdapter();
			}
			@Override
			public Adapter caseSrcNotPresent(SrcNotPresent object) {
				return createSrcNotPresentAdapter();
			}
			@Override
			public Adapter caseSrcOtherwise(SrcOtherwise object) {
				return createSrcOtherwiseAdapter();
			}
			@Override
			public Adapter caseSrcSwitchedAddress(SrcSwitchedAddress object) {
				return createSrcSwitchedAddressAdapter();
			}
			@Override
			public Adapter caseSrcSwitchedString(SrcSwitchedString object) {
				return createSrcSwitchedStringAdapter();
			}
			@Override
			public Adapter caseSrcSwitchedLanguage(SrcSwitchedLanguage object) {
				return createSrcSwitchedLanguageAdapter();
			}
			@Override
			public Adapter caseSrcSwitchedTime(SrcSwitchedTime object) {
				return createSrcSwitchedTimeAdapter();
			}
			@Override
			public Adapter caseSrcSwitchedPriority(SrcSwitchedPriority object) {
				return createSrcSwitchedPriorityAdapter();
			}
			@Override
			public Adapter caseSrcBusy(SrcBusy object) {
				return createSrcBusyAdapter();
			}
			@Override
			public Adapter caseSrcNoAnswer(SrcNoAnswer object) {
				return createSrcNoAnswerAdapter();
			}
			@Override
			public Adapter caseSrcRedirection(SrcRedirection object) {
				return createSrcRedirectionAdapter();
			}
			@Override
			public Adapter caseSrcFailure(SrcFailure object) {
				return createSrcFailureAdapter();
			}
			@Override
			public Adapter caseSrcDefault(SrcDefault object) {
				return createSrcDefaultAdapter();
			}
			@Override
			public Adapter caseSrcNode(SrcNode object) {
				return createSrcNodeAdapter();
			}
			@Override
			public Adapter caseSrcSwitch(SrcSwitch object) {
				return createSrcSwitchAdapter();
			}
			@Override
			public Adapter caseSrcLocation(SrcLocation object) {
				return createSrcLocationAdapter();
			}
			@Override
			public Adapter caseSrcSubCall(SrcSubCall object) {
				return createSrcSubCallAdapter();
			}
			@Override
			public Adapter caseSrcAction(SrcAction object) {
				return createSrcActionAdapter();
			}
			@Override
			public Adapter caseSrcSignallingAction(SrcSignallingAction object) {
				return createSrcSignallingActionAdapter();
			}
			@Override
			public Adapter caseTrgProgram(TrgProgram object) {
				return createTrgProgramAdapter();
			}
			@Override
			public Adapter caseTrgStructureProperty(TrgStructureProperty object) {
				return createTrgStructurePropertyAdapter();
			}
			@Override
			public Adapter caseTrgClientErrorResponse(TrgClientErrorResponse object) {
				return createTrgClientErrorResponseAdapter();
			}
			@Override
			public Adapter caseTrgGlobalErrorResponse(TrgGlobalErrorResponse object) {
				return createTrgGlobalErrorResponseAdapter();
			}
			@Override
			public Adapter caseTrgRedirectionErrorResponse(TrgRedirectionErrorResponse object) {
				return createTrgRedirectionErrorResponseAdapter();
			}
			@Override
			public Adapter caseTrgServerErrorResponse(TrgServerErrorResponse object) {
				return createTrgServerErrorResponseAdapter();
			}
			@Override
			public Adapter caseTrgLocatedElement(TrgLocatedElement object) {
				return createTrgLocatedElementAdapter();
			}
			@Override
			public Adapter caseTrgService(TrgService object) {
				return createTrgServiceAdapter();
			}
			@Override
			public Adapter caseTrgSession(TrgSession object) {
				return createTrgSessionAdapter();
			}
			@Override
			public Adapter caseTrgRegistration(TrgRegistration object) {
				return createTrgRegistrationAdapter();
			}
			@Override
			public Adapter caseTrgDialog(TrgDialog object) {
				return createTrgDialogAdapter();
			}
			@Override
			public Adapter caseTrgEvent(TrgEvent object) {
				return createTrgEventAdapter();
			}
			@Override
			public Adapter caseTrgMethod(TrgMethod object) {
				return createTrgMethodAdapter();
			}
			@Override
			public Adapter caseTrgArgument(TrgArgument object) {
				return createTrgArgumentAdapter();
			}
			@Override
			public Adapter caseTrgMethodName(TrgMethodName object) {
				return createTrgMethodNameAdapter();
			}
			@Override
			public Adapter caseTrgSIPMethodName(TrgSIPMethodName object) {
				return createTrgSIPMethodNameAdapter();
			}
			@Override
			public Adapter caseTrgControlMethodName(TrgControlMethodName object) {
				return createTrgControlMethodNameAdapter();
			}
			@Override
			public Adapter caseTrgBranch(TrgBranch object) {
				return createTrgBranchAdapter();
			}
			@Override
			public Adapter caseTrgDefaultBranch(TrgDefaultBranch object) {
				return createTrgDefaultBranchAdapter();
			}
			@Override
			public Adapter caseTrgNamedBranch(TrgNamedBranch object) {
				return createTrgNamedBranchAdapter();
			}
			@Override
			public Adapter caseTrgTypeExpression(TrgTypeExpression object) {
				return createTrgTypeExpressionAdapter();
			}
			@Override
			public Adapter caseTrgSimpleType(TrgSimpleType object) {
				return createTrgSimpleTypeAdapter();
			}
			@Override
			public Adapter caseTrgSequenceType(TrgSequenceType object) {
				return createTrgSequenceTypeAdapter();
			}
			@Override
			public Adapter caseTrgDefinedType(TrgDefinedType object) {
				return createTrgDefinedTypeAdapter();
			}
			@Override
			public Adapter caseTrgDeclaration(TrgDeclaration object) {
				return createTrgDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgVariableDeclaration(TrgVariableDeclaration object) {
				return createTrgVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgFunctionDeclaration(TrgFunctionDeclaration object) {
				return createTrgFunctionDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgRemoteFunctionDeclaration(TrgRemoteFunctionDeclaration object) {
				return createTrgRemoteFunctionDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgLocalFunctionDeclaration(TrgLocalFunctionDeclaration object) {
				return createTrgLocalFunctionDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgStructureDeclaration(TrgStructureDeclaration object) {
				return createTrgStructureDeclarationAdapter();
			}
			@Override
			public Adapter caseTrgFunctionCall(TrgFunctionCall object) {
				return createTrgFunctionCallAdapter();
			}
			@Override
			public Adapter caseTrgStatement(TrgStatement object) {
				return createTrgStatementAdapter();
			}
			@Override
			public Adapter caseTrgCompoundStat(TrgCompoundStat object) {
				return createTrgCompoundStatAdapter();
			}
			@Override
			public Adapter caseTrgSetStat(TrgSetStat object) {
				return createTrgSetStatAdapter();
			}
			@Override
			public Adapter caseTrgDeclarationStat(TrgDeclarationStat object) {
				return createTrgDeclarationStatAdapter();
			}
			@Override
			public Adapter caseTrgReturnStat(TrgReturnStat object) {
				return createTrgReturnStatAdapter();
			}
			@Override
			public Adapter caseTrgIfStat(TrgIfStat object) {
				return createTrgIfStatAdapter();
			}
			@Override
			public Adapter caseTrgWhenStat(TrgWhenStat object) {
				return createTrgWhenStatAdapter();
			}
			@Override
			public Adapter caseTrgForeachStat(TrgForeachStat object) {
				return createTrgForeachStatAdapter();
			}
			@Override
			public Adapter caseTrgSelectStat(TrgSelectStat object) {
				return createTrgSelectStatAdapter();
			}
			@Override
			public Adapter caseTrgFunctionCallStat(TrgFunctionCallStat object) {
				return createTrgFunctionCallStatAdapter();
			}
			@Override
			public Adapter caseTrgContinueStat(TrgContinueStat object) {
				return createTrgContinueStatAdapter();
			}
			@Override
			public Adapter caseTrgBreakStat(TrgBreakStat object) {
				return createTrgBreakStatAdapter();
			}
			@Override
			public Adapter caseTrgPushStat(TrgPushStat object) {
				return createTrgPushStatAdapter();
			}
			@Override
			public Adapter caseTrgWhenHeader(TrgWhenHeader object) {
				return createTrgWhenHeaderAdapter();
			}
			@Override
			public Adapter caseTrgSelectMember(TrgSelectMember object) {
				return createTrgSelectMemberAdapter();
			}
			@Override
			public Adapter caseTrgSelectDefault(TrgSelectDefault object) {
				return createTrgSelectDefaultAdapter();
			}
			@Override
			public Adapter caseTrgSelectCase(TrgSelectCase object) {
				return createTrgSelectCaseAdapter();
			}
			@Override
			public Adapter caseTrgExpression(TrgExpression object) {
				return createTrgExpressionAdapter();
			}
			@Override
			public Adapter caseTrgConstantExp(TrgConstantExp object) {
				return createTrgConstantExpAdapter();
			}
			@Override
			public Adapter caseTrgOperatorExp(TrgOperatorExp object) {
				return createTrgOperatorExpAdapter();
			}
			@Override
			public Adapter caseTrgForwardExp(TrgForwardExp object) {
				return createTrgForwardExpAdapter();
			}
			@Override
			public Adapter caseTrgWithExp(TrgWithExp object) {
				return createTrgWithExpAdapter();
			}
			@Override
			public Adapter caseTrgBlockExp(TrgBlockExp object) {
				return createTrgBlockExpAdapter();
			}
			@Override
			public Adapter caseTrgReasonExp(TrgReasonExp object) {
				return createTrgReasonExpAdapter();
			}
			@Override
			public Adapter caseTrgBODYExp(TrgBODYExp object) {
				return createTrgBODYExpAdapter();
			}
			@Override
			public Adapter caseTrgRequestURIExp(TrgRequestURIExp object) {
				return createTrgRequestURIExpAdapter();
			}
			@Override
			public Adapter caseTrgPopExp(TrgPopExp object) {
				return createTrgPopExpAdapter();
			}
			@Override
			public Adapter caseTrgFunctionCallExp(TrgFunctionCallExp object) {
				return createTrgFunctionCallExpAdapter();
			}
			@Override
			public Adapter caseTrgPlace(TrgPlace object) {
				return createTrgPlaceAdapter();
			}
			@Override
			public Adapter caseTrgSIPHeaderPlace(TrgSIPHeaderPlace object) {
				return createTrgSIPHeaderPlaceAdapter();
			}
			@Override
			public Adapter caseTrgVariablePlace(TrgVariablePlace object) {
				return createTrgVariablePlaceAdapter();
			}
			@Override
			public Adapter caseTrgPropertyCallPlace(TrgPropertyCallPlace object) {
				return createTrgPropertyCallPlaceAdapter();
			}
			@Override
			public Adapter caseTrgVariable(TrgVariable object) {
				return createTrgVariableAdapter();
			}
			@Override
			public Adapter caseTrgMessageField(TrgMessageField object) {
				return createTrgMessageFieldAdapter();
			}
			@Override
			public Adapter caseTrgReasonMessageField(TrgReasonMessageField object) {
				return createTrgReasonMessageFieldAdapter();
			}
			@Override
			public Adapter caseTrgHeadedMessageField(TrgHeadedMessageField object) {
				return createTrgHeadedMessageFieldAdapter();
			}
			@Override
			public Adapter caseTrgConstant(TrgConstant object) {
				return createTrgConstantAdapter();
			}
			@Override
			public Adapter caseTrgBooleanConstant(TrgBooleanConstant object) {
				return createTrgBooleanConstantAdapter();
			}
			@Override
			public Adapter caseTrgIntegerConstant(TrgIntegerConstant object) {
				return createTrgIntegerConstantAdapter();
			}
			@Override
			public Adapter caseTrgStringConstant(TrgStringConstant object) {
				return createTrgStringConstantAdapter();
			}
			@Override
			public Adapter caseTrgURIConstant(TrgURIConstant object) {
				return createTrgURIConstantAdapter();
			}
			@Override
			public Adapter caseTrgSequenceConstant(TrgSequenceConstant object) {
				return createTrgSequenceConstantAdapter();
			}
			@Override
			public Adapter caseTrgResponseConstant(TrgResponseConstant object) {
				return createTrgResponseConstantAdapter();
			}
			@Override
			public Adapter caseTrgResponse(TrgResponse object) {
				return createTrgResponseAdapter();
			}
			@Override
			public Adapter caseTrgSuccessResponse(TrgSuccessResponse object) {
				return createTrgSuccessResponseAdapter();
			}
			@Override
			public Adapter caseTrgErrorResponse(TrgErrorResponse object) {
				return createTrgErrorResponseAdapter();
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
	 * Creates a new adapter for an object of class '{@link SrcCPLModel <em>Src CPL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcCPLModel
	 * @generated
	 */
	public Adapter createSrcCPLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcCPL <em>Src CPL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcCPL
	 * @generated
	 */
	public Adapter createSrcCPLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcAddressSwitch <em>Src Address Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcAddressSwitch
	 * @generated
	 */
	public Adapter createSrcAddressSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcStringSwitch <em>Src String Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcStringSwitch
	 * @generated
	 */
	public Adapter createSrcStringSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcLanguageSwitch <em>Src Language Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcLanguageSwitch
	 * @generated
	 */
	public Adapter createSrcLanguageSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcTimeSwitch <em>Src Time Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcTimeSwitch
	 * @generated
	 */
	public Adapter createSrcTimeSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcPrioritySwitch <em>Src Priority Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcPrioritySwitch
	 * @generated
	 */
	public Adapter createSrcPrioritySwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcProxy <em>Src Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcProxy
	 * @generated
	 */
	public Adapter createSrcProxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcRedirect <em>Src Redirect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcRedirect
	 * @generated
	 */
	public Adapter createSrcRedirectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcReject <em>Src Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcReject
	 * @generated
	 */
	public Adapter createSrcRejectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcElement <em>Src Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcElement
	 * @generated
	 */
	public Adapter createSrcElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcNodeContainer <em>Src Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcNodeContainer
	 * @generated
	 */
	public Adapter createSrcNodeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcSubAction <em>Src Sub Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcSubAction
	 * @generated
	 */
	public Adapter createSrcSubActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcOutgoing <em>Src Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcOutgoing
	 * @generated
	 */
	public Adapter createSrcOutgoingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcIncoming <em>Src Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcIncoming
	 * @generated
	 */
	public Adapter createSrcIncomingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcNotPresent <em>Src Not Present</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcNotPresent
	 * @generated
	 */
	public Adapter createSrcNotPresentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcOtherwise <em>Src Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcOtherwise
	 * @generated
	 */
	public Adapter createSrcOtherwiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcSwitchedAddress <em>Src Switched Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcSwitchedAddress
	 * @generated
	 */
	public Adapter createSrcSwitchedAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcSwitchedString <em>Src Switched String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcSwitchedString
	 * @generated
	 */
	public Adapter createSrcSwitchedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcSwitchedLanguage <em>Src Switched Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcSwitchedLanguage
	 * @generated
	 */
	public Adapter createSrcSwitchedLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcSwitchedTime <em>Src Switched Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcSwitchedTime
	 * @generated
	 */
	public Adapter createSrcSwitchedTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcSwitchedPriority <em>Src Switched Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcSwitchedPriority
	 * @generated
	 */
	public Adapter createSrcSwitchedPriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcBusy <em>Src Busy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcBusy
	 * @generated
	 */
	public Adapter createSrcBusyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcNoAnswer <em>Src No Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcNoAnswer
	 * @generated
	 */
	public Adapter createSrcNoAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcRedirection <em>Src Redirection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcRedirection
	 * @generated
	 */
	public Adapter createSrcRedirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcFailure <em>Src Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcFailure
	 * @generated
	 */
	public Adapter createSrcFailureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcDefault <em>Src Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcDefault
	 * @generated
	 */
	public Adapter createSrcDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcNode <em>Src Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcNode
	 * @generated
	 */
	public Adapter createSrcNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcSwitch <em>Src Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcSwitch
	 * @generated
	 */
	public Adapter createSrcSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcLocation <em>Src Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcLocation
	 * @generated
	 */
	public Adapter createSrcLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcSubCall <em>Src Sub Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcSubCall
	 * @generated
	 */
	public Adapter createSrcSubCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcAction <em>Src Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcAction
	 * @generated
	 */
	public Adapter createSrcActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SrcSignallingAction <em>Src Signalling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SrcSignallingAction
	 * @generated
	 */
	public Adapter createSrcSignallingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgProgram <em>Trg Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgProgram
	 * @generated
	 */
	public Adapter createTrgProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgStructureProperty <em>Trg Structure Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgStructureProperty
	 * @generated
	 */
	public Adapter createTrgStructurePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgClientErrorResponse <em>Trg Client Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgClientErrorResponse
	 * @generated
	 */
	public Adapter createTrgClientErrorResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgGlobalErrorResponse <em>Trg Global Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgGlobalErrorResponse
	 * @generated
	 */
	public Adapter createTrgGlobalErrorResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgRedirectionErrorResponse <em>Trg Redirection Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgRedirectionErrorResponse
	 * @generated
	 */
	public Adapter createTrgRedirectionErrorResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgServerErrorResponse <em>Trg Server Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgServerErrorResponse
	 * @generated
	 */
	public Adapter createTrgServerErrorResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgLocatedElement <em>Trg Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgLocatedElement
	 * @generated
	 */
	public Adapter createTrgLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgService <em>Trg Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgService
	 * @generated
	 */
	public Adapter createTrgServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSession <em>Trg Session</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSession
	 * @generated
	 */
	public Adapter createTrgSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgRegistration <em>Trg Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgRegistration
	 * @generated
	 */
	public Adapter createTrgRegistrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgDialog <em>Trg Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgDialog
	 * @generated
	 */
	public Adapter createTrgDialogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgEvent <em>Trg Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgEvent
	 * @generated
	 */
	public Adapter createTrgEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgMethod <em>Trg Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgMethod
	 * @generated
	 */
	public Adapter createTrgMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgArgument <em>Trg Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgArgument
	 * @generated
	 */
	public Adapter createTrgArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgMethodName <em>Trg Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgMethodName
	 * @generated
	 */
	public Adapter createTrgMethodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSIPMethodName <em>Trg SIP Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSIPMethodName
	 * @generated
	 */
	public Adapter createTrgSIPMethodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgControlMethodName <em>Trg Control Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgControlMethodName
	 * @generated
	 */
	public Adapter createTrgControlMethodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgBranch <em>Trg Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgBranch
	 * @generated
	 */
	public Adapter createTrgBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgDefaultBranch <em>Trg Default Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgDefaultBranch
	 * @generated
	 */
	public Adapter createTrgDefaultBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgNamedBranch <em>Trg Named Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgNamedBranch
	 * @generated
	 */
	public Adapter createTrgNamedBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgTypeExpression <em>Trg Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgTypeExpression
	 * @generated
	 */
	public Adapter createTrgTypeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSimpleType <em>Trg Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSimpleType
	 * @generated
	 */
	public Adapter createTrgSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSequenceType <em>Trg Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSequenceType
	 * @generated
	 */
	public Adapter createTrgSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgDefinedType <em>Trg Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgDefinedType
	 * @generated
	 */
	public Adapter createTrgDefinedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgDeclaration <em>Trg Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgDeclaration
	 * @generated
	 */
	public Adapter createTrgDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgVariableDeclaration <em>Trg Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgVariableDeclaration
	 * @generated
	 */
	public Adapter createTrgVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgFunctionDeclaration <em>Trg Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgFunctionDeclaration
	 * @generated
	 */
	public Adapter createTrgFunctionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgRemoteFunctionDeclaration <em>Trg Remote Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgRemoteFunctionDeclaration
	 * @generated
	 */
	public Adapter createTrgRemoteFunctionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgLocalFunctionDeclaration <em>Trg Local Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgLocalFunctionDeclaration
	 * @generated
	 */
	public Adapter createTrgLocalFunctionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgStructureDeclaration <em>Trg Structure Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgStructureDeclaration
	 * @generated
	 */
	public Adapter createTrgStructureDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgFunctionCall <em>Trg Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgFunctionCall
	 * @generated
	 */
	public Adapter createTrgFunctionCallAdapter() {
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
	 * Creates a new adapter for an object of class '{@link TrgCompoundStat <em>Trg Compound Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgCompoundStat
	 * @generated
	 */
	public Adapter createTrgCompoundStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSetStat <em>Trg Set Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSetStat
	 * @generated
	 */
	public Adapter createTrgSetStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgDeclarationStat <em>Trg Declaration Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgDeclarationStat
	 * @generated
	 */
	public Adapter createTrgDeclarationStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgReturnStat <em>Trg Return Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgReturnStat
	 * @generated
	 */
	public Adapter createTrgReturnStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgIfStat <em>Trg If Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgIfStat
	 * @generated
	 */
	public Adapter createTrgIfStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgWhenStat <em>Trg When Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgWhenStat
	 * @generated
	 */
	public Adapter createTrgWhenStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgForeachStat <em>Trg Foreach Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgForeachStat
	 * @generated
	 */
	public Adapter createTrgForeachStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSelectStat <em>Trg Select Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSelectStat
	 * @generated
	 */
	public Adapter createTrgSelectStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgFunctionCallStat <em>Trg Function Call Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgFunctionCallStat
	 * @generated
	 */
	public Adapter createTrgFunctionCallStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgContinueStat <em>Trg Continue Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgContinueStat
	 * @generated
	 */
	public Adapter createTrgContinueStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgBreakStat <em>Trg Break Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgBreakStat
	 * @generated
	 */
	public Adapter createTrgBreakStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgPushStat <em>Trg Push Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgPushStat
	 * @generated
	 */
	public Adapter createTrgPushStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgWhenHeader <em>Trg When Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgWhenHeader
	 * @generated
	 */
	public Adapter createTrgWhenHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSelectMember <em>Trg Select Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSelectMember
	 * @generated
	 */
	public Adapter createTrgSelectMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSelectDefault <em>Trg Select Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSelectDefault
	 * @generated
	 */
	public Adapter createTrgSelectDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSelectCase <em>Trg Select Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSelectCase
	 * @generated
	 */
	public Adapter createTrgSelectCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgExpression <em>Trg Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgExpression
	 * @generated
	 */
	public Adapter createTrgExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgConstantExp <em>Trg Constant Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgConstantExp
	 * @generated
	 */
	public Adapter createTrgConstantExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgOperatorExp <em>Trg Operator Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgOperatorExp
	 * @generated
	 */
	public Adapter createTrgOperatorExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgForwardExp <em>Trg Forward Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgForwardExp
	 * @generated
	 */
	public Adapter createTrgForwardExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgWithExp <em>Trg With Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgWithExp
	 * @generated
	 */
	public Adapter createTrgWithExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgBlockExp <em>Trg Block Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgBlockExp
	 * @generated
	 */
	public Adapter createTrgBlockExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgReasonExp <em>Trg Reason Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgReasonExp
	 * @generated
	 */
	public Adapter createTrgReasonExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgBODYExp <em>Trg BODY Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgBODYExp
	 * @generated
	 */
	public Adapter createTrgBODYExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgRequestURIExp <em>Trg Request URI Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgRequestURIExp
	 * @generated
	 */
	public Adapter createTrgRequestURIExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgPopExp <em>Trg Pop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgPopExp
	 * @generated
	 */
	public Adapter createTrgPopExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgFunctionCallExp <em>Trg Function Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgFunctionCallExp
	 * @generated
	 */
	public Adapter createTrgFunctionCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgPlace <em>Trg Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgPlace
	 * @generated
	 */
	public Adapter createTrgPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSIPHeaderPlace <em>Trg SIP Header Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSIPHeaderPlace
	 * @generated
	 */
	public Adapter createTrgSIPHeaderPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgVariablePlace <em>Trg Variable Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgVariablePlace
	 * @generated
	 */
	public Adapter createTrgVariablePlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgPropertyCallPlace <em>Trg Property Call Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgPropertyCallPlace
	 * @generated
	 */
	public Adapter createTrgPropertyCallPlaceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link TrgMessageField <em>Trg Message Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgMessageField
	 * @generated
	 */
	public Adapter createTrgMessageFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgReasonMessageField <em>Trg Reason Message Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgReasonMessageField
	 * @generated
	 */
	public Adapter createTrgReasonMessageFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgHeadedMessageField <em>Trg Headed Message Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgHeadedMessageField
	 * @generated
	 */
	public Adapter createTrgHeadedMessageFieldAdapter() {
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
	 * Creates a new adapter for an object of class '{@link TrgBooleanConstant <em>Trg Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgBooleanConstant
	 * @generated
	 */
	public Adapter createTrgBooleanConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgIntegerConstant <em>Trg Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgIntegerConstant
	 * @generated
	 */
	public Adapter createTrgIntegerConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgStringConstant <em>Trg String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgStringConstant
	 * @generated
	 */
	public Adapter createTrgStringConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgURIConstant <em>Trg URI Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgURIConstant
	 * @generated
	 */
	public Adapter createTrgURIConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSequenceConstant <em>Trg Sequence Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSequenceConstant
	 * @generated
	 */
	public Adapter createTrgSequenceConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgResponseConstant <em>Trg Response Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgResponseConstant
	 * @generated
	 */
	public Adapter createTrgResponseConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgResponse <em>Trg Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgResponse
	 * @generated
	 */
	public Adapter createTrgResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgSuccessResponse <em>Trg Success Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgSuccessResponse
	 * @generated
	 */
	public Adapter createTrgSuccessResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TrgErrorResponse <em>Trg Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TrgErrorResponse
	 * @generated
	 */
	public Adapter createTrgErrorResponseAdapter() {
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

} //JointPackage_CPL2SPLAdapterFactory
