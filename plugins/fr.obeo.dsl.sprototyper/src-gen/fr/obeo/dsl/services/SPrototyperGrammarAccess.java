/*
* generated by Xtext
*/

package fr.obeo.dsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SPrototyperGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SPrototyperElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SPrototyper");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProtoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cQualifierKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cQualifierAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cQualifierSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cQualifierAssignment_3_1.eContents().get(0);
		private final Assignment cViewpointsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cViewpointsSPViewpointParserRuleCall_4_0 = (RuleCall)cViewpointsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SPrototyper:
		//	"proto" name=ID "{" ("qualifier" qualifier=STRING)? viewpoints+=SPViewpoint* "}";
		public ParserRule getRule() { return rule; }

		//"proto" name=ID "{" ("qualifier" qualifier=STRING)? viewpoints+=SPViewpoint* "}"
		public Group getGroup() { return cGroup; }

		//"proto"
		public Keyword getProtoKeyword_0() { return cProtoKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("qualifier" qualifier=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//"qualifier"
		public Keyword getQualifierKeyword_3_0() { return cQualifierKeyword_3_0; }

		//qualifier=STRING
		public Assignment getQualifierAssignment_3_1() { return cQualifierAssignment_3_1; }

		//STRING
		public RuleCall getQualifierSTRINGTerminalRuleCall_3_1_0() { return cQualifierSTRINGTerminalRuleCall_3_1_0; }

		//viewpoints+=SPViewpoint*
		public Assignment getViewpointsAssignment_4() { return cViewpointsAssignment_4; }

		//SPViewpoint
		public RuleCall getViewpointsSPViewpointParserRuleCall_4_0() { return cViewpointsSPViewpointParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class SPViewpointElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SPViewpoint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cViewpointKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cShortcutKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cShortcutAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cShortcutSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cShortcutAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cExtKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cExtensionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cExtensionSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cExtensionAssignment_4_1.eContents().get(0);
		private final Assignment cRepresentationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRepresentationsSPRepresentationParserRuleCall_5_0 = (RuleCall)cRepresentationsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//SPViewpoint:
		//	"viewpoint" name=ID "{" ("shortcut" shortcut=STRING)? ("ext" extension=STRING)? representations+=SPRepresentation*
		//	"}";
		public ParserRule getRule() { return rule; }

		//"viewpoint" name=ID "{" ("shortcut" shortcut=STRING)? ("ext" extension=STRING)? representations+=SPRepresentation* "}"
		public Group getGroup() { return cGroup; }

		//"viewpoint"
		public Keyword getViewpointKeyword_0() { return cViewpointKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("shortcut" shortcut=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//"shortcut"
		public Keyword getShortcutKeyword_3_0() { return cShortcutKeyword_3_0; }

		//shortcut=STRING
		public Assignment getShortcutAssignment_3_1() { return cShortcutAssignment_3_1; }

		//STRING
		public RuleCall getShortcutSTRINGTerminalRuleCall_3_1_0() { return cShortcutSTRINGTerminalRuleCall_3_1_0; }

		//("ext" extension=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//"ext"
		public Keyword getExtKeyword_4_0() { return cExtKeyword_4_0; }

		//extension=STRING
		public Assignment getExtensionAssignment_4_1() { return cExtensionAssignment_4_1; }

		//STRING
		public RuleCall getExtensionSTRINGTerminalRuleCall_4_1_0() { return cExtensionSTRINGTerminalRuleCall_4_1_0; }

		//representations+=SPRepresentation*
		public Assignment getRepresentationsAssignment_5() { return cRepresentationsAssignment_5; }

		//SPRepresentation
		public RuleCall getRepresentationsSPRepresentationParserRuleCall_5_0() { return cRepresentationsSPRepresentationParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class SPRepresentationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SPRepresentation");
		private final RuleCall cSPTableParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//SPRepresentation:
		//	SPTable;
		public ParserRule getRule() { return rule; }

		//SPTable
		public RuleCall getSPTableParserRuleCall() { return cSPTableParserRuleCall; }
	}

	public class SPTableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SPTable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLabelKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cLabelAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cLabelSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cLabelAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cTitleKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTitleAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTitleSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cTitleAssignment_4_1.eContents().get(0);
		private final Assignment cMetamodelsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cMetamodelsMetamodelRefParserRuleCall_5_0 = (RuleCall)cMetamodelsAssignment_5.eContents().get(0);
		private final Keyword cRootKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cRootAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cRootSTRINGTerminalRuleCall_7_0 = (RuleCall)cRootAssignment_7.eContents().get(0);
		private final Assignment cElementsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cElementsTableElementParserRuleCall_8_0 = (RuleCall)cElementsAssignment_8.eContents().get(0);
		private final Assignment cPropertiesAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cPropertiesTablePropertyParserRuleCall_9_0 = (RuleCall)cPropertiesAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//SPTable:
		//	"table" name=ID "{" ("label" label=STRING)? ("title" title=STRING)? metamodels+=MetamodelRef+ "root" root=STRING
		//	elements+=TableElement+ properties+=TableProperty+ "}";
		public ParserRule getRule() { return rule; }

		//"table" name=ID "{" ("label" label=STRING)? ("title" title=STRING)? metamodels+=MetamodelRef+ "root" root=STRING
		//elements+=TableElement+ properties+=TableProperty+ "}"
		public Group getGroup() { return cGroup; }

		//"table"
		public Keyword getTableKeyword_0() { return cTableKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("label" label=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//"label"
		public Keyword getLabelKeyword_3_0() { return cLabelKeyword_3_0; }

		//label=STRING
		public Assignment getLabelAssignment_3_1() { return cLabelAssignment_3_1; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_3_1_0() { return cLabelSTRINGTerminalRuleCall_3_1_0; }

		//("title" title=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//"title"
		public Keyword getTitleKeyword_4_0() { return cTitleKeyword_4_0; }

		//title=STRING
		public Assignment getTitleAssignment_4_1() { return cTitleAssignment_4_1; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_4_1_0() { return cTitleSTRINGTerminalRuleCall_4_1_0; }

		//metamodels+=MetamodelRef+
		public Assignment getMetamodelsAssignment_5() { return cMetamodelsAssignment_5; }

		//MetamodelRef
		public RuleCall getMetamodelsMetamodelRefParserRuleCall_5_0() { return cMetamodelsMetamodelRefParserRuleCall_5_0; }

		//"root"
		public Keyword getRootKeyword_6() { return cRootKeyword_6; }

		//root=STRING
		public Assignment getRootAssignment_7() { return cRootAssignment_7; }

		//STRING
		public RuleCall getRootSTRINGTerminalRuleCall_7_0() { return cRootSTRINGTerminalRuleCall_7_0; }

		//elements+=TableElement+
		public Assignment getElementsAssignment_8() { return cElementsAssignment_8; }

		//TableElement
		public RuleCall getElementsTableElementParserRuleCall_8_0() { return cElementsTableElementParserRuleCall_8_0; }

		//properties+=TableProperty+
		public Assignment getPropertiesAssignment_9() { return cPropertiesAssignment_9; }

		//TableProperty
		public RuleCall getPropertiesTablePropertyParserRuleCall_9_0() { return cPropertiesTablePropertyParserRuleCall_9_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}

	public class TableElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TableElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCreatableAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cCreatableCreatableKeyword_0_0 = (Keyword)cCreatableAssignment_0.eContents().get(0);
		private final Assignment cRecursiveAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cRecursiveRecursiveKeyword_1_0 = (Keyword)cRecursiveAssignment_1.eContents().get(0);
		private final Keyword cElementKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEClassAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEClassSTRINGTerminalRuleCall_3_0 = (RuleCall)cEClassAssignment_3.eContents().get(0);
		private final Keyword cAccessibleThroughKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExpressionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExpressionSPExpressionParserRuleCall_5_0 = (RuleCall)cExpressionAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cLeftCurlyBracketKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cSubElementsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cSubElementsTableElementParserRuleCall_6_1_0 = (RuleCall)cSubElementsAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_2 = (Keyword)cGroup_6.eContents().get(2);
		
		//TableElement:
		//	creatable?="creatable"? recursive?="recursive"? "element" eClass=STRING "accessibleThrough" expression=SPExpression
		//	("{" subElements+=TableElement+ "}")?;
		public ParserRule getRule() { return rule; }

		//creatable?="creatable"? recursive?="recursive"? "element" eClass=STRING "accessibleThrough" expression=SPExpression ("{"
		//subElements+=TableElement+ "}")?
		public Group getGroup() { return cGroup; }

		//creatable?="creatable"?
		public Assignment getCreatableAssignment_0() { return cCreatableAssignment_0; }

		//"creatable"
		public Keyword getCreatableCreatableKeyword_0_0() { return cCreatableCreatableKeyword_0_0; }

		//recursive?="recursive"?
		public Assignment getRecursiveAssignment_1() { return cRecursiveAssignment_1; }

		//"recursive"
		public Keyword getRecursiveRecursiveKeyword_1_0() { return cRecursiveRecursiveKeyword_1_0; }

		//"element"
		public Keyword getElementKeyword_2() { return cElementKeyword_2; }

		//eClass=STRING
		public Assignment getEClassAssignment_3() { return cEClassAssignment_3; }

		//STRING
		public RuleCall getEClassSTRINGTerminalRuleCall_3_0() { return cEClassSTRINGTerminalRuleCall_3_0; }

		//"accessibleThrough"
		public Keyword getAccessibleThroughKeyword_4() { return cAccessibleThroughKeyword_4; }

		//expression=SPExpression
		public Assignment getExpressionAssignment_5() { return cExpressionAssignment_5; }

		//SPExpression
		public RuleCall getExpressionSPExpressionParserRuleCall_5_0() { return cExpressionSPExpressionParserRuleCall_5_0; }

		//("{" subElements+=TableElement+ "}")?
		public Group getGroup_6() { return cGroup_6; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6_0() { return cLeftCurlyBracketKeyword_6_0; }

		//subElements+=TableElement+
		public Assignment getSubElementsAssignment_6_1() { return cSubElementsAssignment_6_1; }

		//TableElement
		public RuleCall getSubElementsTableElementParserRuleCall_6_1_0() { return cSubElementsTableElementParserRuleCall_6_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6_2() { return cRightCurlyBracketKeyword_6_2; }
	}

	public class TablePropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TableProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFeatureAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFeatureSTRINGTerminalRuleCall_1_0 = (RuleCall)cFeatureAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLabelKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cLabelAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cLabelSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cLabelAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExpressionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cExpressionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cExpressionSPExpressionParserRuleCall_3_1_0 = (RuleCall)cExpressionAssignment_3_1.eContents().get(0);
		
		//TableProperty:
		//	"property" feature=STRING ("label" label=STRING)? ("expression" expression=SPExpression)?;
		public ParserRule getRule() { return rule; }

		//"property" feature=STRING ("label" label=STRING)? ("expression" expression=SPExpression)?
		public Group getGroup() { return cGroup; }

		//"property"
		public Keyword getPropertyKeyword_0() { return cPropertyKeyword_0; }

		//feature=STRING
		public Assignment getFeatureAssignment_1() { return cFeatureAssignment_1; }

		//STRING
		public RuleCall getFeatureSTRINGTerminalRuleCall_1_0() { return cFeatureSTRINGTerminalRuleCall_1_0; }

		//("label" label=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//"label"
		public Keyword getLabelKeyword_2_0() { return cLabelKeyword_2_0; }

		//label=STRING
		public Assignment getLabelAssignment_2_1() { return cLabelAssignment_2_1; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_2_1_0() { return cLabelSTRINGTerminalRuleCall_2_1_0; }

		//("expression" expression=SPExpression)?
		public Group getGroup_3() { return cGroup_3; }

		//"expression"
		public Keyword getExpressionKeyword_3_0() { return cExpressionKeyword_3_0; }

		//expression=SPExpression
		public Assignment getExpressionAssignment_3_1() { return cExpressionAssignment_3_1; }

		//SPExpression
		public RuleCall getExpressionSPExpressionParserRuleCall_3_1_0() { return cExpressionSPExpressionParserRuleCall_3_1_0; }
	}

	public class SPExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SPExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAcceleoExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cVarRefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFeatureRefParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//SPExpression:
		//	AcceleoExpression | VarRef | FeatureRef;
		public ParserRule getRule() { return rule; }

		//AcceleoExpression | VarRef | FeatureRef
		public Alternatives getAlternatives() { return cAlternatives; }

		//AcceleoExpression
		public RuleCall getAcceleoExpressionParserRuleCall_0() { return cAcceleoExpressionParserRuleCall_0; }

		//VarRef
		public RuleCall getVarRefParserRuleCall_1() { return cVarRefParserRuleCall_1; }

		//FeatureRef
		public RuleCall getFeatureRefParserRuleCall_2() { return cFeatureRefParserRuleCall_2; }
	}

	public class AcceleoExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AcceleoExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAccKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//AcceleoExpression:
		//	"acc:" value=STRING;
		public ParserRule getRule() { return rule; }

		//"acc:" value=STRING
		public Group getGroup() { return cGroup; }

		//"acc:"
		public Keyword getAccKeyword_0() { return cAccKeyword_0; }

		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}

	public class VarRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VarRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//VarRef:
		//	"var:" value=STRING;
		public ParserRule getRule() { return rule; }

		//"var:" value=STRING
		public Group getGroup() { return cGroup; }

		//"var:"
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }

		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}

	public class FeatureRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FeatureRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFeatureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//FeatureRef:
		//	"feature:" value=STRING;
		public ParserRule getRule() { return rule; }

		//"feature:" value=STRING
		public Group getGroup() { return cGroup; }

		//"feature:"
		public Keyword getFeatureKeyword_0() { return cFeatureKeyword_0; }

		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}

	public class MetamodelRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MetamodelRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMetamodelAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMetamodelSTRINGTerminalRuleCall_1_0 = (RuleCall)cMetamodelAssignment_1.eContents().get(0);
		
		//MetamodelRef:
		//	"use" metamodel=STRING;
		public ParserRule getRule() { return rule; }

		//"use" metamodel=STRING
		public Group getGroup() { return cGroup; }

		//"use"
		public Keyword getUseKeyword_0() { return cUseKeyword_0; }

		//metamodel=STRING
		public Assignment getMetamodelAssignment_1() { return cMetamodelAssignment_1; }

		//STRING
		public RuleCall getMetamodelSTRINGTerminalRuleCall_1_0() { return cMetamodelSTRINGTerminalRuleCall_1_0; }
	}
	
	
	private SPrototyperElements pSPrototyper;
	private SPViewpointElements pSPViewpoint;
	private SPRepresentationElements pSPRepresentation;
	private SPTableElements pSPTable;
	private TableElementElements pTableElement;
	private TablePropertyElements pTableProperty;
	private SPExpressionElements pSPExpression;
	private AcceleoExpressionElements pAcceleoExpression;
	private VarRefElements pVarRef;
	private FeatureRefElements pFeatureRef;
	private MetamodelRefElements pMetamodelRef;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SPrototyperGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.obeo.dsl.SPrototyper".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SPrototyper:
	//	"proto" name=ID "{" ("qualifier" qualifier=STRING)? viewpoints+=SPViewpoint* "}";
	public SPrototyperElements getSPrototyperAccess() {
		return (pSPrototyper != null) ? pSPrototyper : (pSPrototyper = new SPrototyperElements());
	}
	
	public ParserRule getSPrototyperRule() {
		return getSPrototyperAccess().getRule();
	}

	//SPViewpoint:
	//	"viewpoint" name=ID "{" ("shortcut" shortcut=STRING)? ("ext" extension=STRING)? representations+=SPRepresentation*
	//	"}";
	public SPViewpointElements getSPViewpointAccess() {
		return (pSPViewpoint != null) ? pSPViewpoint : (pSPViewpoint = new SPViewpointElements());
	}
	
	public ParserRule getSPViewpointRule() {
		return getSPViewpointAccess().getRule();
	}

	//SPRepresentation:
	//	SPTable;
	public SPRepresentationElements getSPRepresentationAccess() {
		return (pSPRepresentation != null) ? pSPRepresentation : (pSPRepresentation = new SPRepresentationElements());
	}
	
	public ParserRule getSPRepresentationRule() {
		return getSPRepresentationAccess().getRule();
	}

	//SPTable:
	//	"table" name=ID "{" ("label" label=STRING)? ("title" title=STRING)? metamodels+=MetamodelRef+ "root" root=STRING
	//	elements+=TableElement+ properties+=TableProperty+ "}";
	public SPTableElements getSPTableAccess() {
		return (pSPTable != null) ? pSPTable : (pSPTable = new SPTableElements());
	}
	
	public ParserRule getSPTableRule() {
		return getSPTableAccess().getRule();
	}

	//TableElement:
	//	creatable?="creatable"? recursive?="recursive"? "element" eClass=STRING "accessibleThrough" expression=SPExpression
	//	("{" subElements+=TableElement+ "}")?;
	public TableElementElements getTableElementAccess() {
		return (pTableElement != null) ? pTableElement : (pTableElement = new TableElementElements());
	}
	
	public ParserRule getTableElementRule() {
		return getTableElementAccess().getRule();
	}

	//TableProperty:
	//	"property" feature=STRING ("label" label=STRING)? ("expression" expression=SPExpression)?;
	public TablePropertyElements getTablePropertyAccess() {
		return (pTableProperty != null) ? pTableProperty : (pTableProperty = new TablePropertyElements());
	}
	
	public ParserRule getTablePropertyRule() {
		return getTablePropertyAccess().getRule();
	}

	//SPExpression:
	//	AcceleoExpression | VarRef | FeatureRef;
	public SPExpressionElements getSPExpressionAccess() {
		return (pSPExpression != null) ? pSPExpression : (pSPExpression = new SPExpressionElements());
	}
	
	public ParserRule getSPExpressionRule() {
		return getSPExpressionAccess().getRule();
	}

	//AcceleoExpression:
	//	"acc:" value=STRING;
	public AcceleoExpressionElements getAcceleoExpressionAccess() {
		return (pAcceleoExpression != null) ? pAcceleoExpression : (pAcceleoExpression = new AcceleoExpressionElements());
	}
	
	public ParserRule getAcceleoExpressionRule() {
		return getAcceleoExpressionAccess().getRule();
	}

	//VarRef:
	//	"var:" value=STRING;
	public VarRefElements getVarRefAccess() {
		return (pVarRef != null) ? pVarRef : (pVarRef = new VarRefElements());
	}
	
	public ParserRule getVarRefRule() {
		return getVarRefAccess().getRule();
	}

	//FeatureRef:
	//	"feature:" value=STRING;
	public FeatureRefElements getFeatureRefAccess() {
		return (pFeatureRef != null) ? pFeatureRef : (pFeatureRef = new FeatureRefElements());
	}
	
	public ParserRule getFeatureRefRule() {
		return getFeatureRefAccess().getRule();
	}

	//MetamodelRef:
	//	"use" metamodel=STRING;
	public MetamodelRefElements getMetamodelRefAccess() {
		return (pMetamodelRef != null) ? pMetamodelRef : (pMetamodelRef = new MetamodelRefElements());
	}
	
	public ParserRule getMetamodelRefRule() {
		return getMetamodelRefAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}