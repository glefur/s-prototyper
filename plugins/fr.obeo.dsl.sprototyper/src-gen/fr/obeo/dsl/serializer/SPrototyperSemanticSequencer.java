package fr.obeo.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.obeo.dsl.sPrototyper.AcceleoExpression;
import fr.obeo.dsl.sPrototyper.FeatureRef;
import fr.obeo.dsl.sPrototyper.MetamodelRef;
import fr.obeo.dsl.sPrototyper.SPTable;
import fr.obeo.dsl.sPrototyper.SPViewpoint;
import fr.obeo.dsl.sPrototyper.SPrototyper;
import fr.obeo.dsl.sPrototyper.SPrototyperPackage;
import fr.obeo.dsl.sPrototyper.TableElement;
import fr.obeo.dsl.sPrototyper.TableProperty;
import fr.obeo.dsl.sPrototyper.VarRef;
import fr.obeo.dsl.services.SPrototyperGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SPrototyperSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SPrototyperGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SPrototyperPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SPrototyperPackage.ACCELEO_EXPRESSION:
				if(context == grammarAccess.getAcceleoExpressionRule() ||
				   context == grammarAccess.getSPExpressionRule()) {
					sequence_AcceleoExpression(context, (AcceleoExpression) semanticObject); 
					return; 
				}
				else break;
			case SPrototyperPackage.FEATURE_REF:
				if(context == grammarAccess.getFeatureRefRule() ||
				   context == grammarAccess.getSPExpressionRule()) {
					sequence_FeatureRef(context, (FeatureRef) semanticObject); 
					return; 
				}
				else break;
			case SPrototyperPackage.METAMODEL_REF:
				if(context == grammarAccess.getMetamodelRefRule()) {
					sequence_MetamodelRef(context, (MetamodelRef) semanticObject); 
					return; 
				}
				else break;
			case SPrototyperPackage.SP_TABLE:
				if(context == grammarAccess.getSPRepresentationRule() ||
				   context == grammarAccess.getSPTableRule()) {
					sequence_SPTable(context, (SPTable) semanticObject); 
					return; 
				}
				else break;
			case SPrototyperPackage.SP_VIEWPOINT:
				if(context == grammarAccess.getSPViewpointRule()) {
					sequence_SPViewpoint(context, (SPViewpoint) semanticObject); 
					return; 
				}
				else break;
			case SPrototyperPackage.SPROTOTYPER:
				if(context == grammarAccess.getSPrototyperRule()) {
					sequence_SPrototyper(context, (SPrototyper) semanticObject); 
					return; 
				}
				else break;
			case SPrototyperPackage.TABLE_ELEMENT:
				if(context == grammarAccess.getTableElementRule()) {
					sequence_TableElement(context, (TableElement) semanticObject); 
					return; 
				}
				else break;
			case SPrototyperPackage.TABLE_PROPERTY:
				if(context == grammarAccess.getTablePropertyRule()) {
					sequence_TableProperty(context, (TableProperty) semanticObject); 
					return; 
				}
				else break;
			case SPrototyperPackage.VAR_REF:
				if(context == grammarAccess.getSPExpressionRule() ||
				   context == grammarAccess.getVarRefRule()) {
					sequence_VarRef(context, (VarRef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_AcceleoExpression(EObject context, AcceleoExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SPrototyperPackage.Literals.SP_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SPrototyperPackage.Literals.SP_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAcceleoExpressionAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_FeatureRef(EObject context, FeatureRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SPrototyperPackage.Literals.SP_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SPrototyperPackage.Literals.SP_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeatureRefAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     metamodel=STRING
	 */
	protected void sequence_MetamodelRef(EObject context, MetamodelRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SPrototyperPackage.Literals.METAMODEL_REF__METAMODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SPrototyperPackage.Literals.METAMODEL_REF__METAMODEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetamodelRefAccess().getMetamodelSTRINGTerminalRuleCall_1_0(), semanticObject.getMetamodel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         label=STRING? 
	 *         title=STRING? 
	 *         metamodels+=MetamodelRef+ 
	 *         root=STRING 
	 *         elements+=TableElement+ 
	 *         properties+=TableProperty+
	 *     )
	 */
	protected void sequence_SPTable(EObject context, SPTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID shortcut=STRING? extension=STRING? representations+=SPRepresentation*)
	 */
	protected void sequence_SPViewpoint(EObject context, SPViewpoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID qualifier=STRING? viewpoints+=SPViewpoint*)
	 */
	protected void sequence_SPrototyper(EObject context, SPrototyper semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (creatable?='creatable'? recursive?='recursive'? eClass=STRING expression=SPExpression subElements+=TableElement*)
	 */
	protected void sequence_TableElement(EObject context, TableElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=STRING label=STRING? expression=SPExpression?)
	 */
	protected void sequence_TableProperty(EObject context, TableProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_VarRef(EObject context, VarRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SPrototyperPackage.Literals.SP_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SPrototyperPackage.Literals.SP_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarRefAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
}
