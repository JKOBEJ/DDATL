/**
 */
package ATL.util;

import ATL.*;

import OCL.VariableDeclaration;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ATLPackage
 * @generated
 */
public class ATLSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ATLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATLSwitch() {
		if (modelPackage == null) {
			modelPackage = ATLPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ATLPackage.LOCATED_ELEMENT: {
				LocatedElement locatedElement = (LocatedElement)theEObject;
				Object result = caseLocatedElement(locatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				Object result = caseUnit(unit);
				if (result == null) result = caseLocatedElement(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.LIBRARY: {
				Library library = (Library)theEObject;
				Object result = caseLibrary(library);
				if (result == null) result = caseUnit(library);
				if (result == null) result = caseLocatedElement(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.QUERY: {
				Query query = (Query)theEObject;
				Object result = caseQuery(query);
				if (result == null) result = caseUnit(query);
				if (result == null) result = caseLocatedElement(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.MODULE: {
				Module module = (Module)theEObject;
				Object result = caseModule(module);
				if (result == null) result = caseUnit(module);
				if (result == null) result = caseLocatedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.MODULE_ELEMENT: {
				ModuleElement moduleElement = (ModuleElement)theEObject;
				Object result = caseModuleElement(moduleElement);
				if (result == null) result = caseLocatedElement(moduleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.HELPER: {
				Helper helper = (Helper)theEObject;
				Object result = caseHelper(helper);
				if (result == null) result = caseModuleElement(helper);
				if (result == null) result = caseLocatedElement(helper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.RULE: {
				Rule rule = (Rule)theEObject;
				Object result = caseRule(rule);
				if (result == null) result = caseModuleElement(rule);
				if (result == null) result = caseLocatedElement(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.MATCHED_RULE: {
				MatchedRule matchedRule = (MatchedRule)theEObject;
				Object result = caseMatchedRule(matchedRule);
				if (result == null) result = caseRule(matchedRule);
				if (result == null) result = caseModuleElement(matchedRule);
				if (result == null) result = caseLocatedElement(matchedRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.LAZY_MATCHED_RULE: {
				LazyMatchedRule lazyMatchedRule = (LazyMatchedRule)theEObject;
				Object result = caseLazyMatchedRule(lazyMatchedRule);
				if (result == null) result = caseMatchedRule(lazyMatchedRule);
				if (result == null) result = caseRule(lazyMatchedRule);
				if (result == null) result = caseModuleElement(lazyMatchedRule);
				if (result == null) result = caseLocatedElement(lazyMatchedRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.CALLED_RULE: {
				CalledRule calledRule = (CalledRule)theEObject;
				Object result = caseCalledRule(calledRule);
				if (result == null) result = caseRule(calledRule);
				if (result == null) result = caseModuleElement(calledRule);
				if (result == null) result = caseLocatedElement(calledRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.IN_PATTERN: {
				InPattern inPattern = (InPattern)theEObject;
				Object result = caseInPattern(inPattern);
				if (result == null) result = caseLocatedElement(inPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.OUT_PATTERN: {
				OutPattern outPattern = (OutPattern)theEObject;
				Object result = caseOutPattern(outPattern);
				if (result == null) result = caseLocatedElement(outPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.PATTERN_ELEMENT: {
				PatternElement patternElement = (PatternElement)theEObject;
				Object result = casePatternElement(patternElement);
				if (result == null) result = caseVariableDeclaration(patternElement);
				if (result == null) result = caseLocatedElement(patternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.IN_PATTERN_ELEMENT: {
				InPatternElement inPatternElement = (InPatternElement)theEObject;
				Object result = caseInPatternElement(inPatternElement);
				if (result == null) result = casePatternElement(inPatternElement);
				if (result == null) result = caseVariableDeclaration(inPatternElement);
				if (result == null) result = caseLocatedElement(inPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.SIMPLE_IN_PATTERN_ELEMENT: {
				SimpleInPatternElement simpleInPatternElement = (SimpleInPatternElement)theEObject;
				Object result = caseSimpleInPatternElement(simpleInPatternElement);
				if (result == null) result = caseInPatternElement(simpleInPatternElement);
				if (result == null) result = casePatternElement(simpleInPatternElement);
				if (result == null) result = caseVariableDeclaration(simpleInPatternElement);
				if (result == null) result = caseLocatedElement(simpleInPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.OUT_PATTERN_ELEMENT: {
				OutPatternElement outPatternElement = (OutPatternElement)theEObject;
				Object result = caseOutPatternElement(outPatternElement);
				if (result == null) result = casePatternElement(outPatternElement);
				if (result == null) result = caseVariableDeclaration(outPatternElement);
				if (result == null) result = caseLocatedElement(outPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.SIMPLE_OUT_PATTERN_ELEMENT: {
				SimpleOutPatternElement simpleOutPatternElement = (SimpleOutPatternElement)theEObject;
				Object result = caseSimpleOutPatternElement(simpleOutPatternElement);
				if (result == null) result = caseOutPatternElement(simpleOutPatternElement);
				if (result == null) result = casePatternElement(simpleOutPatternElement);
				if (result == null) result = caseVariableDeclaration(simpleOutPatternElement);
				if (result == null) result = caseLocatedElement(simpleOutPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.FOR_EACH_OUT_PATTERN_ELEMENT: {
				ForEachOutPatternElement forEachOutPatternElement = (ForEachOutPatternElement)theEObject;
				Object result = caseForEachOutPatternElement(forEachOutPatternElement);
				if (result == null) result = caseOutPatternElement(forEachOutPatternElement);
				if (result == null) result = casePatternElement(forEachOutPatternElement);
				if (result == null) result = caseVariableDeclaration(forEachOutPatternElement);
				if (result == null) result = caseLocatedElement(forEachOutPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				Object result = caseBinding(binding);
				if (result == null) result = caseLocatedElement(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.RULE_VARIABLE_DECLARATION: {
				RuleVariableDeclaration ruleVariableDeclaration = (RuleVariableDeclaration)theEObject;
				Object result = caseRuleVariableDeclaration(ruleVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(ruleVariableDeclaration);
				if (result == null) result = caseLocatedElement(ruleVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.LIBRARY_REF: {
				LibraryRef libraryRef = (LibraryRef)theEObject;
				Object result = caseLibraryRef(libraryRef);
				if (result == null) result = caseLocatedElement(libraryRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.ACTION_BLOCK: {
				ActionBlock actionBlock = (ActionBlock)theEObject;
				Object result = caseActionBlock(actionBlock);
				if (result == null) result = caseLocatedElement(actionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				Object result = caseStatement(statement);
				if (result == null) result = caseLocatedElement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.EXPRESSION_STAT: {
				ExpressionStat expressionStat = (ExpressionStat)theEObject;
				Object result = caseExpressionStat(expressionStat);
				if (result == null) result = caseStatement(expressionStat);
				if (result == null) result = caseLocatedElement(expressionStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.BINDING_STAT: {
				BindingStat bindingStat = (BindingStat)theEObject;
				Object result = caseBindingStat(bindingStat);
				if (result == null) result = caseStatement(bindingStat);
				if (result == null) result = caseLocatedElement(bindingStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.IF_STAT: {
				IfStat ifStat = (IfStat)theEObject;
				Object result = caseIfStat(ifStat);
				if (result == null) result = caseStatement(ifStat);
				if (result == null) result = caseLocatedElement(ifStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLPackage.FOR_STAT: {
				ForStat forStat = (ForStat)theEObject;
				Object result = caseForStat(forStat);
				if (result == null) result = caseStatement(forStat);
				if (result == null) result = caseLocatedElement(forStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Element</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModuleElement(ModuleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHelper(Helper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matched Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matched Rule</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMatchedRule(MatchedRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lazy Matched Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lazy Matched Rule</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLazyMatchedRule(LazyMatchedRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Called Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Called Rule</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCalledRule(CalledRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Pattern</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInPattern(InPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Pattern</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutPattern(OutPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePatternElement(PatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Pattern Element</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInPatternElement(InPatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple In Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple In Pattern Element</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimpleInPatternElement(SimpleInPatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Pattern Element</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutPatternElement(OutPatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Out Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Out Pattern Element</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimpleOutPatternElement(SimpleOutPatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Out Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Out Pattern Element</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForEachOutPatternElement(ForEachOutPatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Variable Declaration</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRuleVariableDeclaration(RuleVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Ref</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLibraryRef(LibraryRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Block</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionBlock(ActionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Stat</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpressionStat(ExpressionStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Stat</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBindingStat(BindingStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Stat</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIfStat(IfStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Stat</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForStat(ForStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ATLSwitch
