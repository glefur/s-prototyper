package fr.obeo.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.obeo.dsl.services.SPrototyperGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSPrototyperParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'proto'", "'{'", "'qualifier'", "'generate'", "'}'", "'viewpoint'", "'shortcut'", "'ext'", "'table'", "'label'", "'title'", "'root'", "'recursive'", "'element'", "'accessibleThrough'", "'creatable'", "'via'", "'property'", "'expression'", "'diagram'", "'container'", "'for'", "'['", "','", "']'", "'freeform'", "'list'", "'node'", "'color'", "'gradient from'", "'to'", "'size'", "'bold'", "'italic'", "'border '", "'acc:'", "'var:'", "'feature:'", "'service:'", "'metamodel'", "'use'", "'.'", "'white'", "'black'", "'blue'", "'light blue'", "'dark blue'", "'chocolate'", "'light chocolate'", "'dark chocolate'", "'gray'", "'light gray'", "'dark gray'", "'green'", "'light green'", "'dark green'", "'orange'", "'light orange'", "'dark orange'", "'purple'", "'light purple'", "'dark purple'", "'red'", "'light red'", "'dark red'", "'yellow'", "'light yellow'", "'dark yellow'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalSPrototyperParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSPrototyperParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSPrototyperParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g"; }



     	private SPrototyperGrammarAccess grammarAccess;
     	
        public InternalSPrototyperParser(TokenStream input, SPrototyperGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SPrototyper";	
       	}
       	
       	@Override
       	protected SPrototyperGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSPrototyper"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:68:1: entryRuleSPrototyper returns [EObject current=null] : iv_ruleSPrototyper= ruleSPrototyper EOF ;
    public final EObject entryRuleSPrototyper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPrototyper = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:69:2: (iv_ruleSPrototyper= ruleSPrototyper EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:70:2: iv_ruleSPrototyper= ruleSPrototyper EOF
            {
             newCompositeNode(grammarAccess.getSPrototyperRule()); 
            pushFollow(FOLLOW_ruleSPrototyper_in_entryRuleSPrototyper75);
            iv_ruleSPrototyper=ruleSPrototyper();

            state._fsp--;

             current =iv_ruleSPrototyper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPrototyper85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSPrototyper"


    // $ANTLR start "ruleSPrototyper"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:77:1: ruleSPrototyper returns [EObject current=null] : (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? otherlv_5= 'generate' ( (lv_targetURI_6_0= RULE_STRING ) ) ( (lv_viewpoints_7_0= ruleSPViewpoint ) )* otherlv_8= '}' ) ;
    public final EObject ruleSPrototyper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_qualifier_4_0=null;
        Token otherlv_5=null;
        Token lv_targetURI_6_0=null;
        Token otherlv_8=null;
        EObject lv_viewpoints_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:80:28: ( (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? otherlv_5= 'generate' ( (lv_targetURI_6_0= RULE_STRING ) ) ( (lv_viewpoints_7_0= ruleSPViewpoint ) )* otherlv_8= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:81:1: (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? otherlv_5= 'generate' ( (lv_targetURI_6_0= RULE_STRING ) ) ( (lv_viewpoints_7_0= ruleSPViewpoint ) )* otherlv_8= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:81:1: (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? otherlv_5= 'generate' ( (lv_targetURI_6_0= RULE_STRING ) ) ( (lv_viewpoints_7_0= ruleSPViewpoint ) )* otherlv_8= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:81:3: otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? otherlv_5= 'generate' ( (lv_targetURI_6_0= RULE_STRING ) ) ( (lv_viewpoints_7_0= ruleSPViewpoint ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSPrototyper122); 

                	newLeafNode(otherlv_0, grammarAccess.getSPrototyperAccess().getProtoKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:86:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPrototyper139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSPrototyperAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSPrototyperRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSPrototyper156); 

                	newLeafNode(otherlv_2, grammarAccess.getSPrototyperAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:107:1: (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:107:3: otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSPrototyper169); 

                        	newLeafNode(otherlv_3, grammarAccess.getSPrototyperAccess().getQualifierKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:111:1: ( (lv_qualifier_4_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:112:1: (lv_qualifier_4_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:112:1: (lv_qualifier_4_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:113:3: lv_qualifier_4_0= RULE_STRING
                    {
                    lv_qualifier_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPrototyper186); 

                    			newLeafNode(lv_qualifier_4_0, grammarAccess.getSPrototyperAccess().getQualifierSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPrototyperRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"qualifier",
                            		lv_qualifier_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSPrototyper205); 

                	newLeafNode(otherlv_5, grammarAccess.getSPrototyperAccess().getGenerateKeyword_4());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:133:1: ( (lv_targetURI_6_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:134:1: (lv_targetURI_6_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:134:1: (lv_targetURI_6_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:135:3: lv_targetURI_6_0= RULE_STRING
            {
            lv_targetURI_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPrototyper222); 

            			newLeafNode(lv_targetURI_6_0, grammarAccess.getSPrototyperAccess().getTargetURISTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSPrototyperRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetURI",
                    		lv_targetURI_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:151:2: ( (lv_viewpoints_7_0= ruleSPViewpoint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:152:1: (lv_viewpoints_7_0= ruleSPViewpoint )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:152:1: (lv_viewpoints_7_0= ruleSPViewpoint )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:153:3: lv_viewpoints_7_0= ruleSPViewpoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPrototyperAccess().getViewpointsSPViewpointParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSPViewpoint_in_ruleSPrototyper248);
            	    lv_viewpoints_7_0=ruleSPViewpoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPrototyperRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"viewpoints",
            	            		lv_viewpoints_7_0, 
            	            		"SPViewpoint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleSPrototyper261); 

                	newLeafNode(otherlv_8, grammarAccess.getSPrototyperAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSPrototyper"


    // $ANTLR start "entryRuleSPViewpoint"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:181:1: entryRuleSPViewpoint returns [EObject current=null] : iv_ruleSPViewpoint= ruleSPViewpoint EOF ;
    public final EObject entryRuleSPViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPViewpoint = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:182:2: (iv_ruleSPViewpoint= ruleSPViewpoint EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:183:2: iv_ruleSPViewpoint= ruleSPViewpoint EOF
            {
             newCompositeNode(grammarAccess.getSPViewpointRule()); 
            pushFollow(FOLLOW_ruleSPViewpoint_in_entryRuleSPViewpoint297);
            iv_ruleSPViewpoint=ruleSPViewpoint();

            state._fsp--;

             current =iv_ruleSPViewpoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPViewpoint307); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSPViewpoint"


    // $ANTLR start "ruleSPViewpoint"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:190:1: ruleSPViewpoint returns [EObject current=null] : (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_serviceClass_7_0= ruleJavaServiceClassReference ) )* ( (lv_representations_8_0= ruleSPRepresentation ) )* otherlv_9= '}' ) ;
    public final EObject ruleSPViewpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_shortcut_4_0=null;
        Token otherlv_5=null;
        Token lv_extension_6_0=null;
        Token otherlv_9=null;
        EObject lv_serviceClass_7_0 = null;

        EObject lv_representations_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:193:28: ( (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_serviceClass_7_0= ruleJavaServiceClassReference ) )* ( (lv_representations_8_0= ruleSPRepresentation ) )* otherlv_9= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:194:1: (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_serviceClass_7_0= ruleJavaServiceClassReference ) )* ( (lv_representations_8_0= ruleSPRepresentation ) )* otherlv_9= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:194:1: (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_serviceClass_7_0= ruleJavaServiceClassReference ) )* ( (lv_representations_8_0= ruleSPRepresentation ) )* otherlv_9= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:194:3: otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_serviceClass_7_0= ruleJavaServiceClassReference ) )* ( (lv_representations_8_0= ruleSPRepresentation ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSPViewpoint344); 

                	newLeafNode(otherlv_0, grammarAccess.getSPViewpointAccess().getViewpointKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:198:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:199:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:199:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:200:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPViewpoint361); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSPViewpointAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSPViewpointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSPViewpoint378); 

                	newLeafNode(otherlv_2, grammarAccess.getSPViewpointAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:220:1: (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:220:3: otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSPViewpoint391); 

                        	newLeafNode(otherlv_3, grammarAccess.getSPViewpointAccess().getShortcutKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:224:1: ( (lv_shortcut_4_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:225:1: (lv_shortcut_4_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:225:1: (lv_shortcut_4_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:226:3: lv_shortcut_4_0= RULE_STRING
                    {
                    lv_shortcut_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPViewpoint408); 

                    			newLeafNode(lv_shortcut_4_0, grammarAccess.getSPViewpointAccess().getShortcutSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"shortcut",
                            		lv_shortcut_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:242:4: (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:242:6: otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSPViewpoint428); 

                        	newLeafNode(otherlv_5, grammarAccess.getSPViewpointAccess().getExtKeyword_4_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:246:1: ( (lv_extension_6_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:247:1: (lv_extension_6_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:247:1: (lv_extension_6_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:248:3: lv_extension_6_0= RULE_STRING
                    {
                    lv_extension_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPViewpoint445); 

                    			newLeafNode(lv_extension_6_0, grammarAccess.getSPViewpointAccess().getExtensionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"extension",
                            		lv_extension_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:264:4: ( (lv_serviceClass_7_0= ruleJavaServiceClassReference ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==51) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:265:1: (lv_serviceClass_7_0= ruleJavaServiceClassReference )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:265:1: (lv_serviceClass_7_0= ruleJavaServiceClassReference )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:266:3: lv_serviceClass_7_0= ruleJavaServiceClassReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPViewpointAccess().getServiceClassJavaServiceClassReferenceParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJavaServiceClassReference_in_ruleSPViewpoint473);
            	    lv_serviceClass_7_0=ruleJavaServiceClassReference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPViewpointRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"serviceClass",
            	            		lv_serviceClass_7_0, 
            	            		"JavaServiceClassReference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:282:3: ( (lv_representations_8_0= ruleSPRepresentation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19||LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:283:1: (lv_representations_8_0= ruleSPRepresentation )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:283:1: (lv_representations_8_0= ruleSPRepresentation )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:284:3: lv_representations_8_0= ruleSPRepresentation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPViewpointAccess().getRepresentationsSPRepresentationParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSPRepresentation_in_ruleSPViewpoint495);
            	    lv_representations_8_0=ruleSPRepresentation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPViewpointRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"representations",
            	            		lv_representations_8_0, 
            	            		"SPRepresentation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleSPViewpoint508); 

                	newLeafNode(otherlv_9, grammarAccess.getSPViewpointAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSPViewpoint"


    // $ANTLR start "entryRuleSPRepresentation"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:312:1: entryRuleSPRepresentation returns [EObject current=null] : iv_ruleSPRepresentation= ruleSPRepresentation EOF ;
    public final EObject entryRuleSPRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPRepresentation = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:313:2: (iv_ruleSPRepresentation= ruleSPRepresentation EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:314:2: iv_ruleSPRepresentation= ruleSPRepresentation EOF
            {
             newCompositeNode(grammarAccess.getSPRepresentationRule()); 
            pushFollow(FOLLOW_ruleSPRepresentation_in_entryRuleSPRepresentation544);
            iv_ruleSPRepresentation=ruleSPRepresentation();

            state._fsp--;

             current =iv_ruleSPRepresentation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPRepresentation554); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSPRepresentation"


    // $ANTLR start "ruleSPRepresentation"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:321:1: ruleSPRepresentation returns [EObject current=null] : (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram ) ;
    public final EObject ruleSPRepresentation() throws RecognitionException {
        EObject current = null;

        EObject this_SPTable_0 = null;

        EObject this_SPDiagram_1 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:324:28: ( (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:325:1: (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:325:1: (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:326:5: this_SPTable_0= ruleSPTable
                    {
                     
                            newCompositeNode(grammarAccess.getSPRepresentationAccess().getSPTableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSPTable_in_ruleSPRepresentation601);
                    this_SPTable_0=ruleSPTable();

                    state._fsp--;

                     
                            current = this_SPTable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:336:5: this_SPDiagram_1= ruleSPDiagram
                    {
                     
                            newCompositeNode(grammarAccess.getSPRepresentationAccess().getSPDiagramParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSPDiagram_in_ruleSPRepresentation628);
                    this_SPDiagram_1=ruleSPDiagram();

                    state._fsp--;

                     
                            current = this_SPDiagram_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSPRepresentation"


    // $ANTLR start "entryRuleSPTable"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:352:1: entryRuleSPTable returns [EObject current=null] : iv_ruleSPTable= ruleSPTable EOF ;
    public final EObject entryRuleSPTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPTable = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:353:2: (iv_ruleSPTable= ruleSPTable EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:354:2: iv_ruleSPTable= ruleSPTable EOF
            {
             newCompositeNode(grammarAccess.getSPTableRule()); 
            pushFollow(FOLLOW_ruleSPTable_in_entryRuleSPTable663);
            iv_ruleSPTable=ruleSPTable();

            state._fsp--;

             current =iv_ruleSPTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPTable673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSPTable"


    // $ANTLR start "ruleSPTable"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:361:1: ruleSPTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_usages_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (otherlv_9= RULE_ID ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' ) ;
    public final EObject ruleSPTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token lv_title_6_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_usages_7_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_properties_11_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:364:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_usages_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (otherlv_9= RULE_ID ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:365:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_usages_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (otherlv_9= RULE_ID ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:365:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_usages_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (otherlv_9= RULE_ID ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:365:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_usages_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (otherlv_9= RULE_ID ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleSPTable710); 

                	newLeafNode(otherlv_0, grammarAccess.getSPTableAccess().getTableKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:369:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:370:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:370:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:371:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPTable727); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSPTableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSPTableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSPTable744); 

                	newLeafNode(otherlv_2, grammarAccess.getSPTableAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:391:1: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:391:3: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSPTable757); 

                        	newLeafNode(otherlv_3, grammarAccess.getSPTableAccess().getLabelKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:395:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:396:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:396:1: (lv_label_4_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:397:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPTable774); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getSPTableAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPTableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:413:4: (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:413:6: otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleSPTable794); 

                        	newLeafNode(otherlv_5, grammarAccess.getSPTableAccess().getTitleKeyword_4_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:417:1: ( (lv_title_6_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:418:1: (lv_title_6_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:418:1: (lv_title_6_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:419:3: lv_title_6_0= RULE_STRING
                    {
                    lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPTable811); 

                    			newLeafNode(lv_title_6_0, grammarAccess.getSPTableAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPTableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:435:4: ( (lv_usages_7_0= ruleMetamodelUsage ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==50) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:436:1: (lv_usages_7_0= ruleMetamodelUsage )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:436:1: (lv_usages_7_0= ruleMetamodelUsage )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:437:3: lv_usages_7_0= ruleMetamodelUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPTableAccess().getUsagesMetamodelUsageParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetamodelUsage_in_ruleSPTable839);
            	    lv_usages_7_0=ruleMetamodelUsage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usages",
            	            		lv_usages_7_0, 
            	            		"MetamodelUsage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleSPTable852); 

                	newLeafNode(otherlv_8, grammarAccess.getSPTableAccess().getRootKeyword_6());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:457:1: ( (otherlv_9= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:458:1: (otherlv_9= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:458:1: (otherlv_9= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:459:3: otherlv_9= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSPTableRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPTable872); 

            		newLeafNode(otherlv_9, grammarAccess.getSPTableAccess().getRootEClassCrossReference_7_0()); 
            	

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:470:2: ( (lv_elements_10_0= ruleTableElement ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=23 && LA11_0<=24)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:471:1: (lv_elements_10_0= ruleTableElement )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:471:1: (lv_elements_10_0= ruleTableElement )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:472:3: lv_elements_10_0= ruleTableElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPTableAccess().getElementsTableElementParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableElement_in_ruleSPTable893);
            	    lv_elements_10_0=ruleTableElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_10_0, 
            	            		"TableElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:488:3: ( (lv_properties_11_0= ruleTableProperty ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:489:1: (lv_properties_11_0= ruleTableProperty )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:489:1: (lv_properties_11_0= ruleTableProperty )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:490:3: lv_properties_11_0= ruleTableProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPTableAccess().getPropertiesTablePropertyParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableProperty_in_ruleSPTable915);
            	    lv_properties_11_0=ruleTableProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_11_0, 
            	            		"TableProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleSPTable928); 

                	newLeafNode(otherlv_12, grammarAccess.getSPTableAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSPTable"


    // $ANTLR start "entryRuleTableElement"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:518:1: entryRuleTableElement returns [EObject current=null] : iv_ruleTableElement= ruleTableElement EOF ;
    public final EObject entryRuleTableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableElement = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:519:2: (iv_ruleTableElement= ruleTableElement EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:520:2: iv_ruleTableElement= ruleTableElement EOF
            {
             newCompositeNode(grammarAccess.getTableElementRule()); 
            pushFollow(FOLLOW_ruleTableElement_in_entryRuleTableElement964);
            iv_ruleTableElement=ruleTableElement();

            state._fsp--;

             current =iv_ruleTableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableElement974); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableElement"


    // $ANTLR start "ruleTableElement"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:527:1: ruleTableElement returns [EObject current=null] : ( ( (lv_recursive_0_0= 'recursive' ) )? otherlv_1= 'element' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'accessibleThrough' ( (lv_expression_4_0= ruleSPExpression ) ) ( ( (lv_creatable_5_0= 'creatable' ) ) (otherlv_6= 'via' ( (lv_createExpression_7_0= ruleSPExpression ) ) )? )? (otherlv_8= '{' ( (lv_subElements_9_0= ruleTableElement ) )+ otherlv_10= '}' )? ) ;
    public final EObject ruleTableElement() throws RecognitionException {
        EObject current = null;

        Token lv_recursive_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_creatable_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_expression_4_0 = null;

        EObject lv_createExpression_7_0 = null;

        EObject lv_subElements_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:530:28: ( ( ( (lv_recursive_0_0= 'recursive' ) )? otherlv_1= 'element' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'accessibleThrough' ( (lv_expression_4_0= ruleSPExpression ) ) ( ( (lv_creatable_5_0= 'creatable' ) ) (otherlv_6= 'via' ( (lv_createExpression_7_0= ruleSPExpression ) ) )? )? (otherlv_8= '{' ( (lv_subElements_9_0= ruleTableElement ) )+ otherlv_10= '}' )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:531:1: ( ( (lv_recursive_0_0= 'recursive' ) )? otherlv_1= 'element' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'accessibleThrough' ( (lv_expression_4_0= ruleSPExpression ) ) ( ( (lv_creatable_5_0= 'creatable' ) ) (otherlv_6= 'via' ( (lv_createExpression_7_0= ruleSPExpression ) ) )? )? (otherlv_8= '{' ( (lv_subElements_9_0= ruleTableElement ) )+ otherlv_10= '}' )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:531:1: ( ( (lv_recursive_0_0= 'recursive' ) )? otherlv_1= 'element' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'accessibleThrough' ( (lv_expression_4_0= ruleSPExpression ) ) ( ( (lv_creatable_5_0= 'creatable' ) ) (otherlv_6= 'via' ( (lv_createExpression_7_0= ruleSPExpression ) ) )? )? (otherlv_8= '{' ( (lv_subElements_9_0= ruleTableElement ) )+ otherlv_10= '}' )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:531:2: ( (lv_recursive_0_0= 'recursive' ) )? otherlv_1= 'element' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'accessibleThrough' ( (lv_expression_4_0= ruleSPExpression ) ) ( ( (lv_creatable_5_0= 'creatable' ) ) (otherlv_6= 'via' ( (lv_createExpression_7_0= ruleSPExpression ) ) )? )? (otherlv_8= '{' ( (lv_subElements_9_0= ruleTableElement ) )+ otherlv_10= '}' )?
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:531:2: ( (lv_recursive_0_0= 'recursive' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:532:1: (lv_recursive_0_0= 'recursive' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:532:1: (lv_recursive_0_0= 'recursive' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:533:3: lv_recursive_0_0= 'recursive'
                    {
                    lv_recursive_0_0=(Token)match(input,23,FOLLOW_23_in_ruleTableElement1017); 

                            newLeafNode(lv_recursive_0_0, grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableElementRule());
                    	        }
                           		setWithLastConsumed(current, "recursive", true, "recursive");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleTableElement1043); 

                	newLeafNode(otherlv_1, grammarAccess.getTableElementAccess().getElementKeyword_1());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:550:1: ( (otherlv_2= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:551:1: (otherlv_2= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:551:1: (otherlv_2= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:552:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTableElementRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableElement1063); 

            		newLeafNode(otherlv_2, grammarAccess.getTableElementAccess().getEClassEClassCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleTableElement1075); 

                	newLeafNode(otherlv_3, grammarAccess.getTableElementAccess().getAccessibleThroughKeyword_3());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:567:1: ( (lv_expression_4_0= ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:568:1: (lv_expression_4_0= ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:568:1: (lv_expression_4_0= ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:569:3: lv_expression_4_0= ruleSPExpression
            {
             
            	        newCompositeNode(grammarAccess.getTableElementAccess().getExpressionSPExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPExpression_in_ruleTableElement1096);
            lv_expression_4_0=ruleSPExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableElementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"SPExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:585:2: ( ( (lv_creatable_5_0= 'creatable' ) ) (otherlv_6= 'via' ( (lv_createExpression_7_0= ruleSPExpression ) ) )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:585:3: ( (lv_creatable_5_0= 'creatable' ) ) (otherlv_6= 'via' ( (lv_createExpression_7_0= ruleSPExpression ) ) )?
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:585:3: ( (lv_creatable_5_0= 'creatable' ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:586:1: (lv_creatable_5_0= 'creatable' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:586:1: (lv_creatable_5_0= 'creatable' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:587:3: lv_creatable_5_0= 'creatable'
                    {
                    lv_creatable_5_0=(Token)match(input,26,FOLLOW_26_in_ruleTableElement1115); 

                            newLeafNode(lv_creatable_5_0, grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableElementRule());
                    	        }
                           		setWithLastConsumed(current, "creatable", true, "creatable");
                    	    

                    }


                    }

                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:600:2: (otherlv_6= 'via' ( (lv_createExpression_7_0= ruleSPExpression ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==27) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:600:4: otherlv_6= 'via' ( (lv_createExpression_7_0= ruleSPExpression ) )
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleTableElement1141); 

                                	newLeafNode(otherlv_6, grammarAccess.getTableElementAccess().getViaKeyword_5_1_0());
                                
                            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:604:1: ( (lv_createExpression_7_0= ruleSPExpression ) )
                            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:605:1: (lv_createExpression_7_0= ruleSPExpression )
                            {
                            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:605:1: (lv_createExpression_7_0= ruleSPExpression )
                            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:606:3: lv_createExpression_7_0= ruleSPExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getTableElementAccess().getCreateExpressionSPExpressionParserRuleCall_5_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSPExpression_in_ruleTableElement1162);
                            lv_createExpression_7_0=ruleSPExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTableElementRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"createExpression",
                                    		lv_createExpression_7_0, 
                                    		"SPExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:622:6: (otherlv_8= '{' ( (lv_subElements_9_0= ruleTableElement ) )+ otherlv_10= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:622:8: otherlv_8= '{' ( (lv_subElements_9_0= ruleTableElement ) )+ otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleTableElement1179); 

                        	newLeafNode(otherlv_8, grammarAccess.getTableElementAccess().getLeftCurlyBracketKeyword_6_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:626:1: ( (lv_subElements_9_0= ruleTableElement ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=23 && LA16_0<=24)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:627:1: (lv_subElements_9_0= ruleTableElement )
                    	    {
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:627:1: (lv_subElements_9_0= ruleTableElement )
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:628:3: lv_subElements_9_0= ruleTableElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTableElementAccess().getSubElementsTableElementParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTableElement_in_ruleTableElement1200);
                    	    lv_subElements_9_0=ruleTableElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTableElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subElements",
                    	            		lv_subElements_9_0, 
                    	            		"TableElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleTableElement1213); 

                        	newLeafNode(otherlv_10, grammarAccess.getTableElementAccess().getRightCurlyBracketKeyword_6_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableElement"


    // $ANTLR start "entryRuleTableProperty"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:656:1: entryRuleTableProperty returns [EObject current=null] : iv_ruleTableProperty= ruleTableProperty EOF ;
    public final EObject entryRuleTableProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableProperty = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:657:2: (iv_ruleTableProperty= ruleTableProperty EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:658:2: iv_ruleTableProperty= ruleTableProperty EOF
            {
             newCompositeNode(grammarAccess.getTablePropertyRule()); 
            pushFollow(FOLLOW_ruleTableProperty_in_entryRuleTableProperty1251);
            iv_ruleTableProperty=ruleTableProperty();

            state._fsp--;

             current =iv_ruleTableProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableProperty1261); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableProperty"


    // $ANTLR start "ruleTableProperty"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:665:1: ruleTableProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? ) ;
    public final EObject ruleTableProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_feature_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:668:28: ( (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:669:1: (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:669:1: (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:669:3: otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleTableProperty1298); 

                	newLeafNode(otherlv_0, grammarAccess.getTablePropertyAccess().getPropertyKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:673:1: ( (lv_feature_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:674:1: (lv_feature_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:674:1: (lv_feature_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:675:3: lv_feature_1_0= RULE_STRING
            {
            lv_feature_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableProperty1315); 

            			newLeafNode(lv_feature_1_0, grammarAccess.getTablePropertyAccess().getFeatureSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTablePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"feature",
                    		lv_feature_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:691:2: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:691:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTableProperty1333); 

                        	newLeafNode(otherlv_2, grammarAccess.getTablePropertyAccess().getLabelKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:695:1: ( (lv_label_3_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:696:1: (lv_label_3_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:696:1: (lv_label_3_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:697:3: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableProperty1350); 

                    			newLeafNode(lv_label_3_0, grammarAccess.getTablePropertyAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTablePropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:713:4: (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:713:6: otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleTableProperty1370); 

                        	newLeafNode(otherlv_4, grammarAccess.getTablePropertyAccess().getExpressionKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:717:1: ( (lv_expression_5_0= ruleSPExpression ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:718:1: (lv_expression_5_0= ruleSPExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:718:1: (lv_expression_5_0= ruleSPExpression )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:719:3: lv_expression_5_0= ruleSPExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTablePropertyAccess().getExpressionSPExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSPExpression_in_ruleTableProperty1391);
                    lv_expression_5_0=ruleSPExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTablePropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"SPExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableProperty"


    // $ANTLR start "entryRuleSPDiagram"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:743:1: entryRuleSPDiagram returns [EObject current=null] : iv_ruleSPDiagram= ruleSPDiagram EOF ;
    public final EObject entryRuleSPDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPDiagram = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:744:2: (iv_ruleSPDiagram= ruleSPDiagram EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:745:2: iv_ruleSPDiagram= ruleSPDiagram EOF
            {
             newCompositeNode(grammarAccess.getSPDiagramRule()); 
            pushFollow(FOLLOW_ruleSPDiagram_in_entryRuleSPDiagram1429);
            iv_ruleSPDiagram=ruleSPDiagram();

            state._fsp--;

             current =iv_ruleSPDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPDiagram1439); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSPDiagram"


    // $ANTLR start "ruleSPDiagram"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:752:1: ruleSPDiagram returns [EObject current=null] : (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' ) ;
    public final EObject ruleSPDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token lv_title_6_0=null;
        Token otherlv_8=null;
        Token lv_root_9_0=null;
        Token otherlv_11=null;
        EObject lv_metamodels_7_0 = null;

        EObject lv_elements_10_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:755:28: ( (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:756:1: (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:756:1: (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:756:3: otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleSPDiagram1476); 

                	newLeafNode(otherlv_0, grammarAccess.getSPDiagramAccess().getDiagramKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:760:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:761:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:761:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:762:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPDiagram1493); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSPDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSPDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSPDiagram1510); 

                	newLeafNode(otherlv_2, grammarAccess.getSPDiagramAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:782:1: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:782:3: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSPDiagram1523); 

                        	newLeafNode(otherlv_3, grammarAccess.getSPDiagramAccess().getLabelKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:786:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:787:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:787:1: (lv_label_4_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:788:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPDiagram1540); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getSPDiagramAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:804:4: (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:804:6: otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleSPDiagram1560); 

                        	newLeafNode(otherlv_5, grammarAccess.getSPDiagramAccess().getTitleKeyword_4_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:808:1: ( (lv_title_6_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:809:1: (lv_title_6_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:809:1: (lv_title_6_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:810:3: lv_title_6_0= RULE_STRING
                    {
                    lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPDiagram1577); 

                    			newLeafNode(lv_title_6_0, grammarAccess.getSPDiagramAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:826:4: ( (lv_metamodels_7_0= ruleMetamodelUsage ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==50) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:827:1: (lv_metamodels_7_0= ruleMetamodelUsage )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:827:1: (lv_metamodels_7_0= ruleMetamodelUsage )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:828:3: lv_metamodels_7_0= ruleMetamodelUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPDiagramAccess().getMetamodelsMetamodelUsageParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetamodelUsage_in_ruleSPDiagram1605);
            	    lv_metamodels_7_0=ruleMetamodelUsage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metamodels",
            	            		lv_metamodels_7_0, 
            	            		"MetamodelUsage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleSPDiagram1618); 

                	newLeafNode(otherlv_8, grammarAccess.getSPDiagramAccess().getRootKeyword_6());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:848:1: ( (lv_root_9_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:849:1: (lv_root_9_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:849:1: (lv_root_9_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:850:3: lv_root_9_0= RULE_STRING
            {
            lv_root_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPDiagram1635); 

            			newLeafNode(lv_root_9_0, grammarAccess.getSPDiagramAccess().getRootSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSPDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"root",
                    		lv_root_9_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:866:2: ( (lv_elements_10_0= ruleDiagramElement ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23||LA23_0==26||LA23_0==31||(LA23_0>=36 && LA23_0<=38)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:867:1: (lv_elements_10_0= ruleDiagramElement )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:867:1: (lv_elements_10_0= ruleDiagramElement )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:868:3: lv_elements_10_0= ruleDiagramElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPDiagramAccess().getElementsDiagramElementParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDiagramElement_in_ruleSPDiagram1661);
            	    lv_elements_10_0=ruleDiagramElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_10_0, 
            	            		"DiagramElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleSPDiagram1674); 

                	newLeafNode(otherlv_11, grammarAccess.getSPDiagramAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSPDiagram"


    // $ANTLR start "entryRuleDiagramElement"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:896:1: entryRuleDiagramElement returns [EObject current=null] : iv_ruleDiagramElement= ruleDiagramElement EOF ;
    public final EObject entryRuleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramElement = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:897:2: (iv_ruleDiagramElement= ruleDiagramElement EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:898:2: iv_ruleDiagramElement= ruleDiagramElement EOF
            {
             newCompositeNode(grammarAccess.getDiagramElementRule()); 
            pushFollow(FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement1710);
            iv_ruleDiagramElement=ruleDiagramElement();

            state._fsp--;

             current =iv_ruleDiagramElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramElement1720); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagramElement"


    // $ANTLR start "ruleDiagramElement"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:905:1: ruleDiagramElement returns [EObject current=null] : (this_Container_0= ruleContainer | this_Node_1= ruleNode ) ;
    public final EObject ruleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;

        EObject this_Node_1 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:908:28: ( (this_Container_0= ruleContainer | this_Node_1= ruleNode ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:909:1: (this_Container_0= ruleContainer | this_Node_1= ruleNode )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:909:1: (this_Container_0= ruleContainer | this_Node_1= ruleNode )
            int alt24=2;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==38) ) {
                    alt24=2;
                }
                else if ( (LA24_1==23||LA24_1==31||(LA24_1>=36 && LA24_1<=37)) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 31:
            case 36:
            case 37:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:910:5: this_Container_0= ruleContainer
                    {
                     
                            newCompositeNode(grammarAccess.getDiagramElementAccess().getContainerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleContainer_in_ruleDiagramElement1767);
                    this_Container_0=ruleContainer();

                    state._fsp--;

                     
                            current = this_Container_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:920:5: this_Node_1= ruleNode
                    {
                     
                            newCompositeNode(grammarAccess.getDiagramElementAccess().getNodeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNode_in_ruleDiagramElement1794);
                    this_Node_1=ruleNode();

                    state._fsp--;

                     
                            current = this_Node_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiagramElement"


    // $ANTLR start "entryRuleContainer"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:936:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:937:2: (iv_ruleContainer= ruleContainer EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:938:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer1829);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer1839); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:945:1: ruleContainer returns [EObject current=null] : ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'for' ( (lv_eClass_6_0= RULE_STRING ) ) otherlv_7= 'accessibleThrough' ( (lv_expression_8_0= ruleSPExpression ) ) ( (lv_style_9_0= ruleContainerStyleDefinition ) )? (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )? ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token lv_creatable_0_0=null;
        Token lv_recursive_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_eClass_6_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_containerType_2_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_style_9_0 = null;

        EObject lv_elements_11_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:948:28: ( ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'for' ( (lv_eClass_6_0= RULE_STRING ) ) otherlv_7= 'accessibleThrough' ( (lv_expression_8_0= ruleSPExpression ) ) ( (lv_style_9_0= ruleContainerStyleDefinition ) )? (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:949:1: ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'for' ( (lv_eClass_6_0= RULE_STRING ) ) otherlv_7= 'accessibleThrough' ( (lv_expression_8_0= ruleSPExpression ) ) ( (lv_style_9_0= ruleContainerStyleDefinition ) )? (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:949:1: ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'for' ( (lv_eClass_6_0= RULE_STRING ) ) otherlv_7= 'accessibleThrough' ( (lv_expression_8_0= ruleSPExpression ) ) ( (lv_style_9_0= ruleContainerStyleDefinition ) )? (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:949:2: ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'for' ( (lv_eClass_6_0= RULE_STRING ) ) otherlv_7= 'accessibleThrough' ( (lv_expression_8_0= ruleSPExpression ) ) ( (lv_style_9_0= ruleContainerStyleDefinition ) )? (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )?
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:949:2: ( (lv_creatable_0_0= 'creatable' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:950:1: (lv_creatable_0_0= 'creatable' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:950:1: (lv_creatable_0_0= 'creatable' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:951:3: lv_creatable_0_0= 'creatable'
                    {
                    lv_creatable_0_0=(Token)match(input,26,FOLLOW_26_in_ruleContainer1882); 

                            newLeafNode(lv_creatable_0_0, grammarAccess.getContainerAccess().getCreatableCreatableKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(current, "creatable", true, "creatable");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:964:3: ( (lv_recursive_1_0= 'recursive' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:965:1: (lv_recursive_1_0= 'recursive' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:965:1: (lv_recursive_1_0= 'recursive' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:966:3: lv_recursive_1_0= 'recursive'
                    {
                    lv_recursive_1_0=(Token)match(input,23,FOLLOW_23_in_ruleContainer1914); 

                            newLeafNode(lv_recursive_1_0, grammarAccess.getContainerAccess().getRecursiveRecursiveKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(current, "recursive", true, "recursive");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:979:3: ( (lv_containerType_2_0= ruleContainerType ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=36 && LA27_0<=37)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:980:1: (lv_containerType_2_0= ruleContainerType )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:980:1: (lv_containerType_2_0= ruleContainerType )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:981:3: lv_containerType_2_0= ruleContainerType
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getContainerTypeContainerTypeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContainerType_in_ruleContainer1949);
                    lv_containerType_2_0=ruleContainerType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"containerType",
                            		lv_containerType_2_0, 
                            		"ContainerType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleContainer1962); 

                	newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getContainerKeyword_3());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1001:1: ( (lv_name_4_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1002:1: (lv_name_4_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1002:1: (lv_name_4_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1003:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainer1979); 

            			newLeafNode(lv_name_4_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleContainer1996); 

                	newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getForKeyword_5());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1023:1: ( (lv_eClass_6_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1024:1: (lv_eClass_6_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1024:1: (lv_eClass_6_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1025:3: lv_eClass_6_0= RULE_STRING
            {
            lv_eClass_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer2013); 

            			newLeafNode(lv_eClass_6_0, grammarAccess.getContainerAccess().getEClassSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eClass",
                    		lv_eClass_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleContainer2030); 

                	newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getAccessibleThroughKeyword_7());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1045:1: ( (lv_expression_8_0= ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1046:1: (lv_expression_8_0= ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1046:1: (lv_expression_8_0= ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1047:3: lv_expression_8_0= ruleSPExpression
            {
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getExpressionSPExpressionParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleSPExpression_in_ruleContainer2051);
            lv_expression_8_0=ruleSPExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_8_0, 
                    		"SPExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1063:2: ( (lv_style_9_0= ruleContainerStyleDefinition ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1064:1: (lv_style_9_0= ruleContainerStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1064:1: (lv_style_9_0= ruleContainerStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1065:3: lv_style_9_0= ruleContainerStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getStyleContainerStyleDefinitionParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContainerStyleDefinition_in_ruleContainer2072);
                    lv_style_9_0=ruleContainerStyleDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_9_0, 
                            		"ContainerStyleDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1081:3: (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==12) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1081:5: otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleContainer2086); 

                        	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1085:1: ( (lv_elements_11_0= ruleDiagramElement ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==23||LA29_0==26||LA29_0==31||(LA29_0>=36 && LA29_0<=38)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1086:1: (lv_elements_11_0= ruleDiagramElement )
                    	    {
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1086:1: (lv_elements_11_0= ruleDiagramElement )
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1087:3: lv_elements_11_0= ruleDiagramElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainerAccess().getElementsDiagramElementParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDiagramElement_in_ruleContainer2107);
                    	    lv_elements_11_0=ruleDiagramElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_11_0, 
                    	            		"DiagramElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleContainer2120); 

                        	newLeafNode(otherlv_12, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_10_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleContainerStyleDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1115:1: entryRuleContainerStyleDefinition returns [EObject current=null] : iv_ruleContainerStyleDefinition= ruleContainerStyleDefinition EOF ;
    public final EObject entryRuleContainerStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1116:2: (iv_ruleContainerStyleDefinition= ruleContainerStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1117:2: iv_ruleContainerStyleDefinition= ruleContainerStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getContainerStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleContainerStyleDefinition_in_entryRuleContainerStyleDefinition2158);
            iv_ruleContainerStyleDefinition=ruleContainerStyleDefinition();

            state._fsp--;

             current =iv_ruleContainerStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerStyleDefinition2168); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerStyleDefinition"


    // $ANTLR start "ruleContainerStyleDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1124:1: ruleContainerStyleDefinition returns [EObject current=null] : (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' ) ;
    public final EObject ruleContainerStyleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_color_1_0 = null;

        EObject lv_label_3_0 = null;

        EObject lv_border_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1127:28: ( (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1128:1: (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1128:1: (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1128:3: otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleContainerStyleDefinition2205); 

                	newLeafNode(otherlv_0, grammarAccess.getContainerStyleDefinitionAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1132:1: ( (lv_color_1_0= ruleContainerColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1133:1: (lv_color_1_0= ruleContainerColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1133:1: (lv_color_1_0= ruleContainerColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1134:3: lv_color_1_0= ruleContainerColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getContainerStyleDefinitionAccess().getColorContainerColorDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_ruleContainerStyleDefinition2226);
            lv_color_1_0=ruleContainerColorDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainerStyleDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_1_0, 
                    		"ContainerColorDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1150:2: (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==20) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1150:4: otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleContainerStyleDefinition2239); 

                        	newLeafNode(otherlv_2, grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1154:1: ( (lv_label_3_0= ruleLabelStyleDefinition ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1155:1: (lv_label_3_0= ruleLabelStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1155:1: (lv_label_3_0= ruleLabelStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1156:3: lv_label_3_0= ruleLabelStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelStyleDefinition_in_ruleContainerStyleDefinition2260);
                    lv_label_3_0=ruleLabelStyleDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerStyleDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_3_0, 
                            		"LabelStyleDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1172:4: (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1172:6: otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleContainerStyleDefinition2275); 

                        	newLeafNode(otherlv_4, grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1176:1: ( (lv_border_5_0= ruleBorderStyleDefinition ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1177:1: (lv_border_5_0= ruleBorderStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1177:1: (lv_border_5_0= ruleBorderStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1178:3: lv_border_5_0= ruleBorderStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBorderStyleDefinition_in_ruleContainerStyleDefinition2296);
                    lv_border_5_0=ruleBorderStyleDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerStyleDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"border",
                            		lv_border_5_0, 
                            		"BorderStyleDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleContainerStyleDefinition2310); 

                	newLeafNode(otherlv_6, grammarAccess.getContainerStyleDefinitionAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerStyleDefinition"


    // $ANTLR start "entryRuleContainerType"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1206:1: entryRuleContainerType returns [String current=null] : iv_ruleContainerType= ruleContainerType EOF ;
    public final String entryRuleContainerType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContainerType = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1207:2: (iv_ruleContainerType= ruleContainerType EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1208:2: iv_ruleContainerType= ruleContainerType EOF
            {
             newCompositeNode(grammarAccess.getContainerTypeRule()); 
            pushFollow(FOLLOW_ruleContainerType_in_entryRuleContainerType2347);
            iv_ruleContainerType=ruleContainerType();

            state._fsp--;

             current =iv_ruleContainerType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerType2358); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerType"


    // $ANTLR start "ruleContainerType"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1215:1: ruleContainerType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'freeform' | kw= 'list' ) ;
    public final AntlrDatatypeRuleToken ruleContainerType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1218:28: ( (kw= 'freeform' | kw= 'list' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1219:1: (kw= 'freeform' | kw= 'list' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1219:1: (kw= 'freeform' | kw= 'list' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            else if ( (LA33_0==37) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1220:2: kw= 'freeform'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleContainerType2396); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getContainerTypeAccess().getFreeformKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1227:2: kw= 'list'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleContainerType2415); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getContainerTypeAccess().getListKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerType"


    // $ANTLR start "entryRuleContainerColorDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1240:1: entryRuleContainerColorDefinition returns [EObject current=null] : iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF ;
    public final EObject entryRuleContainerColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1241:2: (iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1242:2: iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getContainerColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_entryRuleContainerColorDefinition2455);
            iv_ruleContainerColorDefinition=ruleContainerColorDefinition();

            state._fsp--;

             current =iv_ruleContainerColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerColorDefinition2465); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerColorDefinition"


    // $ANTLR start "ruleContainerColorDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1249:1: ruleContainerColorDefinition returns [EObject current=null] : (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition ) ;
    public final EObject ruleContainerColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_SolidColorDefinition_0 = null;

        EObject this_GradientColorDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1252:28: ( (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1253:1: (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1253:1: (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            else if ( (LA34_0==40) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1254:5: this_SolidColorDefinition_0= ruleSolidColorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getContainerColorDefinitionAccess().getSolidColorDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleContainerColorDefinition2512);
                    this_SolidColorDefinition_0=ruleSolidColorDefinition();

                    state._fsp--;

                     
                            current = this_SolidColorDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1264:5: this_GradientColorDefinition_1= ruleGradientColorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getContainerColorDefinitionAccess().getGradientColorDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGradientColorDefinition_in_ruleContainerColorDefinition2539);
                    this_GradientColorDefinition_1=ruleGradientColorDefinition();

                    state._fsp--;

                     
                            current = this_GradientColorDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerColorDefinition"


    // $ANTLR start "entryRuleNode"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1280:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1281:2: (iv_ruleNode= ruleNode EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1282:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode2574);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode2584); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1289:1: ruleNode returns [EObject current=null] : ( ( (lv_creatable_0_0= 'creatable' ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleNodeStyleDefinition ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_creatable_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_eClass_4_0=null;
        Token otherlv_5=null;
        EObject lv_expression_6_0 = null;

        EObject lv_style_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1292:28: ( ( ( (lv_creatable_0_0= 'creatable' ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleNodeStyleDefinition ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1293:1: ( ( (lv_creatable_0_0= 'creatable' ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleNodeStyleDefinition ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1293:1: ( ( (lv_creatable_0_0= 'creatable' ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleNodeStyleDefinition ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1293:2: ( (lv_creatable_0_0= 'creatable' ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleNodeStyleDefinition ) )?
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1293:2: ( (lv_creatable_0_0= 'creatable' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1294:1: (lv_creatable_0_0= 'creatable' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1294:1: (lv_creatable_0_0= 'creatable' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1295:3: lv_creatable_0_0= 'creatable'
                    {
                    lv_creatable_0_0=(Token)match(input,26,FOLLOW_26_in_ruleNode2627); 

                            newLeafNode(lv_creatable_0_0, grammarAccess.getNodeAccess().getCreatableCreatableKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(current, "creatable", true, "creatable");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleNode2653); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1312:1: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1313:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1313:1: (lv_name_2_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1314:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode2670); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleNode2687); 

                	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getForKeyword_3());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1334:1: ( (lv_eClass_4_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1335:1: (lv_eClass_4_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1335:1: (lv_eClass_4_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1336:3: lv_eClass_4_0= RULE_STRING
            {
            lv_eClass_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode2704); 

            			newLeafNode(lv_eClass_4_0, grammarAccess.getNodeAccess().getEClassSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eClass",
                    		lv_eClass_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleNode2721); 

                	newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getAccessibleThroughKeyword_5());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1356:1: ( (lv_expression_6_0= ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1357:1: (lv_expression_6_0= ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1357:1: (lv_expression_6_0= ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1358:3: lv_expression_6_0= ruleSPExpression
            {
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getExpressionSPExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSPExpression_in_ruleNode2742);
            lv_expression_6_0=ruleSPExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_6_0, 
                    		"SPExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1374:2: ( (lv_style_7_0= ruleNodeStyleDefinition ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1375:1: (lv_style_7_0= ruleNodeStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1375:1: (lv_style_7_0= ruleNodeStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1376:3: lv_style_7_0= ruleNodeStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeAccess().getStyleNodeStyleDefinitionParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeStyleDefinition_in_ruleNode2763);
                    lv_style_7_0=ruleNodeStyleDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_7_0, 
                            		"NodeStyleDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeStyleDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1400:1: entryRuleNodeStyleDefinition returns [EObject current=null] : iv_ruleNodeStyleDefinition= ruleNodeStyleDefinition EOF ;
    public final EObject entryRuleNodeStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1401:2: (iv_ruleNodeStyleDefinition= ruleNodeStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1402:2: iv_ruleNodeStyleDefinition= ruleNodeStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getNodeStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeStyleDefinition_in_entryRuleNodeStyleDefinition2800);
            iv_ruleNodeStyleDefinition=ruleNodeStyleDefinition();

            state._fsp--;

             current =iv_ruleNodeStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeStyleDefinition2810); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeStyleDefinition"


    // $ANTLR start "ruleNodeStyleDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1409:1: ruleNodeStyleDefinition returns [EObject current=null] : (otherlv_0= '[' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' ) ;
    public final EObject ruleNodeStyleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_color_1_0 = null;

        EObject lv_label_3_0 = null;

        EObject lv_border_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1412:28: ( (otherlv_0= '[' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1413:1: (otherlv_0= '[' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1413:1: (otherlv_0= '[' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1413:3: otherlv_0= '[' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleNodeStyleDefinition2847); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeStyleDefinitionAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1417:1: ( (lv_color_1_0= ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1418:1: (lv_color_1_0= ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1418:1: (lv_color_1_0= ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1419:3: lv_color_1_0= ruleSolidColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getNodeStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleNodeStyleDefinition2868);
            lv_color_1_0=ruleSolidColorDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeStyleDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_1_0, 
                    		"SolidColorDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1435:2: (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==20) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1435:4: otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleNodeStyleDefinition2881); 

                        	newLeafNode(otherlv_2, grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1439:1: ( (lv_label_3_0= ruleLabelStyleDefinition ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1440:1: (lv_label_3_0= ruleLabelStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1440:1: (lv_label_3_0= ruleLabelStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1441:3: lv_label_3_0= ruleLabelStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelStyleDefinition_in_ruleNodeStyleDefinition2902);
                    lv_label_3_0=ruleLabelStyleDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeStyleDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_3_0, 
                            		"LabelStyleDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1457:4: (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1457:6: otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleNodeStyleDefinition2917); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1461:1: ( (lv_border_5_0= ruleBorderStyleDefinition ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1462:1: (lv_border_5_0= ruleBorderStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1462:1: (lv_border_5_0= ruleBorderStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1463:3: lv_border_5_0= ruleBorderStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBorderStyleDefinition_in_ruleNodeStyleDefinition2938);
                    lv_border_5_0=ruleBorderStyleDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeStyleDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"border",
                            		lv_border_5_0, 
                            		"BorderStyleDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleNodeStyleDefinition2952); 

                	newLeafNode(otherlv_6, grammarAccess.getNodeStyleDefinitionAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeStyleDefinition"


    // $ANTLR start "entryRuleSolidColorDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1491:1: entryRuleSolidColorDefinition returns [EObject current=null] : iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF ;
    public final EObject entryRuleSolidColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolidColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1492:2: (iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1493:2: iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getSolidColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_entryRuleSolidColorDefinition2988);
            iv_ruleSolidColorDefinition=ruleSolidColorDefinition();

            state._fsp--;

             current =iv_ruleSolidColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolidColorDefinition2998); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSolidColorDefinition"


    // $ANTLR start "ruleSolidColorDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1500:1: ruleSolidColorDefinition returns [EObject current=null] : (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) ) ;
    public final EObject ruleSolidColorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_color_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1503:28: ( (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1504:1: (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1504:1: (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1504:3: otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleSolidColorDefinition3035); 

                	newLeafNode(otherlv_0, grammarAccess.getSolidColorDefinitionAccess().getColorKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1508:1: ( (lv_color_1_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1509:1: (lv_color_1_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1509:1: (lv_color_1_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1510:3: lv_color_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getSolidColorDefinitionAccess().getColorColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleSolidColorDefinition3056);
            lv_color_1_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSolidColorDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_1_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSolidColorDefinition"


    // $ANTLR start "entryRuleGradientColorDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1534:1: entryRuleGradientColorDefinition returns [EObject current=null] : iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF ;
    public final EObject entryRuleGradientColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradientColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1535:2: (iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1536:2: iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getGradientColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleGradientColorDefinition_in_entryRuleGradientColorDefinition3092);
            iv_ruleGradientColorDefinition=ruleGradientColorDefinition();

            state._fsp--;

             current =iv_ruleGradientColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGradientColorDefinition3102); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGradientColorDefinition"


    // $ANTLR start "ruleGradientColorDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1543:1: ruleGradientColorDefinition returns [EObject current=null] : (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) ) ;
    public final EObject ruleGradientColorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_from_1_0 = null;

        EObject lv_to_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1546:28: ( (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1547:1: (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1547:1: (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1547:3: otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleGradientColorDefinition3139); 

                	newLeafNode(otherlv_0, grammarAccess.getGradientColorDefinitionAccess().getGradientFromKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1551:1: ( (lv_from_1_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1552:1: (lv_from_1_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1552:1: (lv_from_1_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1553:3: lv_from_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getGradientColorDefinitionAccess().getFromColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleGradientColorDefinition3160);
            lv_from_1_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradientColorDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_1_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleGradientColorDefinition3172); 

                	newLeafNode(otherlv_2, grammarAccess.getGradientColorDefinitionAccess().getToKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1573:1: ( (lv_to_3_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1574:1: (lv_to_3_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1574:1: (lv_to_3_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1575:3: lv_to_3_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getGradientColorDefinitionAccess().getToColorParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleGradientColorDefinition3193);
            lv_to_3_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradientColorDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_3_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradientColorDefinition"


    // $ANTLR start "entryRuleLabelStyleDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1599:1: entryRuleLabelStyleDefinition returns [EObject current=null] : iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF ;
    public final EObject entryRuleLabelStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1600:2: (iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1601:2: iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelStyleDefinition_in_entryRuleLabelStyleDefinition3229);
            iv_ruleLabelStyleDefinition=ruleLabelStyleDefinition();

            state._fsp--;

             current =iv_ruleLabelStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelStyleDefinition3239); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelStyleDefinition"


    // $ANTLR start "ruleLabelStyleDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1608:1: ruleLabelStyleDefinition returns [EObject current=null] : (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? ) ;
    public final EObject ruleLabelStyleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_size_4_0=null;
        Token lv_bold_5_0=null;
        Token lv_italic_6_0=null;
        EObject lv_expression_1_0 = null;

        EObject lv_color_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1611:28: ( (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1612:1: (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1612:1: (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1612:3: otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleLabelStyleDefinition3276); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelStyleDefinitionAccess().getLabelKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1616:1: ( (lv_expression_1_0= ruleSPExpression ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=46 && LA39_0<=49)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1617:1: (lv_expression_1_0= ruleSPExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1617:1: (lv_expression_1_0= ruleSPExpression )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1618:3: lv_expression_1_0= ruleSPExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelStyleDefinitionAccess().getExpressionSPExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSPExpression_in_ruleLabelStyleDefinition3297);
                    lv_expression_1_0=ruleSPExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLabelStyleDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_1_0, 
                            		"SPExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1634:3: ( (lv_color_2_0= ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1635:1: (lv_color_2_0= ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1635:1: (lv_color_2_0= ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1636:3: lv_color_2_0= ruleSolidColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getLabelStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleLabelStyleDefinition3319);
            lv_color_2_0=ruleSolidColorDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLabelStyleDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_2_0, 
                    		"SolidColorDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1652:2: (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1652:4: otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleLabelStyleDefinition3332); 

                        	newLeafNode(otherlv_3, grammarAccess.getLabelStyleDefinitionAccess().getSizeKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1656:1: ( (lv_size_4_0= RULE_INT ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1657:1: (lv_size_4_0= RULE_INT )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1657:1: (lv_size_4_0= RULE_INT )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1658:3: lv_size_4_0= RULE_INT
                    {
                    lv_size_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLabelStyleDefinition3349); 

                    			newLeafNode(lv_size_4_0, grammarAccess.getLabelStyleDefinitionAccess().getSizeINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelStyleDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"size",
                            		lv_size_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1674:4: ( (lv_bold_5_0= 'bold' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1675:1: (lv_bold_5_0= 'bold' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1675:1: (lv_bold_5_0= 'bold' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1676:3: lv_bold_5_0= 'bold'
                    {
                    lv_bold_5_0=(Token)match(input,43,FOLLOW_43_in_ruleLabelStyleDefinition3374); 

                            newLeafNode(lv_bold_5_0, grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelStyleDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "bold", true, "bold");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1689:3: ( (lv_italic_6_0= 'italic' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1690:1: (lv_italic_6_0= 'italic' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1690:1: (lv_italic_6_0= 'italic' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1691:3: lv_italic_6_0= 'italic'
                    {
                    lv_italic_6_0=(Token)match(input,44,FOLLOW_44_in_ruleLabelStyleDefinition3406); 

                            newLeafNode(lv_italic_6_0, grammarAccess.getLabelStyleDefinitionAccess().getItalicItalicKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelStyleDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "italic", true, "italic");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelStyleDefinition"


    // $ANTLR start "entryRuleBorderStyleDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1712:1: entryRuleBorderStyleDefinition returns [EObject current=null] : iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF ;
    public final EObject entryRuleBorderStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorderStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1713:2: (iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1714:2: iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getBorderStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleBorderStyleDefinition_in_entryRuleBorderStyleDefinition3456);
            iv_ruleBorderStyleDefinition=ruleBorderStyleDefinition();

            state._fsp--;

             current =iv_ruleBorderStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderStyleDefinition3466); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBorderStyleDefinition"


    // $ANTLR start "ruleBorderStyleDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1721:1: ruleBorderStyleDefinition returns [EObject current=null] : (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleBorderStyleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        EObject lv_color_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1724:28: ( (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1725:1: (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1725:1: (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1725:3: otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleBorderStyleDefinition3503); 

                	newLeafNode(otherlv_0, grammarAccess.getBorderStyleDefinitionAccess().getBorderKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1729:1: ( (lv_color_1_0= ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1730:1: (lv_color_1_0= ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1730:1: (lv_color_1_0= ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1731:3: lv_color_1_0= ruleSolidColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getBorderStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleBorderStyleDefinition3524);
            lv_color_1_0=ruleSolidColorDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBorderStyleDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_1_0, 
                    		"SolidColorDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1747:2: (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1747:4: otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleBorderStyleDefinition3537); 

                        	newLeafNode(otherlv_2, grammarAccess.getBorderStyleDefinitionAccess().getSizeKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1751:1: ( (lv_size_3_0= RULE_INT ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1752:1: (lv_size_3_0= RULE_INT )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1752:1: (lv_size_3_0= RULE_INT )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1753:3: lv_size_3_0= RULE_INT
                    {
                    lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBorderStyleDefinition3554); 

                    			newLeafNode(lv_size_3_0, grammarAccess.getBorderStyleDefinitionAccess().getSizeINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBorderStyleDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"size",
                            		lv_size_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBorderStyleDefinition"


    // $ANTLR start "entryRuleSPExpression"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1777:1: entryRuleSPExpression returns [EObject current=null] : iv_ruleSPExpression= ruleSPExpression EOF ;
    public final EObject entryRuleSPExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPExpression = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1778:2: (iv_ruleSPExpression= ruleSPExpression EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1779:2: iv_ruleSPExpression= ruleSPExpression EOF
            {
             newCompositeNode(grammarAccess.getSPExpressionRule()); 
            pushFollow(FOLLOW_ruleSPExpression_in_entryRuleSPExpression3597);
            iv_ruleSPExpression=ruleSPExpression();

            state._fsp--;

             current =iv_ruleSPExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPExpression3607); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSPExpression"


    // $ANTLR start "ruleSPExpression"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1786:1: ruleSPExpression returns [EObject current=null] : (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef | this_ServiceRef_3= ruleServiceRef ) ;
    public final EObject ruleSPExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AcceleoExpression_0 = null;

        EObject this_VarRef_1 = null;

        EObject this_FeatureRef_2 = null;

        EObject this_ServiceRef_3 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1789:28: ( (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef | this_ServiceRef_3= ruleServiceRef ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1790:1: (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef | this_ServiceRef_3= ruleServiceRef )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1790:1: (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef | this_ServiceRef_3= ruleServiceRef )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt44=1;
                }
                break;
            case 47:
                {
                alt44=2;
                }
                break;
            case 48:
                {
                alt44=3;
                }
                break;
            case 49:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1791:5: this_AcceleoExpression_0= ruleAcceleoExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAcceleoExpression_in_ruleSPExpression3654);
                    this_AcceleoExpression_0=ruleAcceleoExpression();

                    state._fsp--;

                     
                            current = this_AcceleoExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1801:5: this_VarRef_1= ruleVarRef
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getVarRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVarRef_in_ruleSPExpression3681);
                    this_VarRef_1=ruleVarRef();

                    state._fsp--;

                     
                            current = this_VarRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1811:5: this_FeatureRef_2= ruleFeatureRef
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getFeatureRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFeatureRef_in_ruleSPExpression3708);
                    this_FeatureRef_2=ruleFeatureRef();

                    state._fsp--;

                     
                            current = this_FeatureRef_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1821:5: this_ServiceRef_3= ruleServiceRef
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getServiceRefParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleServiceRef_in_ruleSPExpression3735);
                    this_ServiceRef_3=ruleServiceRef();

                    state._fsp--;

                     
                            current = this_ServiceRef_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSPExpression"


    // $ANTLR start "entryRuleAcceleoExpression"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1837:1: entryRuleAcceleoExpression returns [EObject current=null] : iv_ruleAcceleoExpression= ruleAcceleoExpression EOF ;
    public final EObject entryRuleAcceleoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceleoExpression = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1838:2: (iv_ruleAcceleoExpression= ruleAcceleoExpression EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1839:2: iv_ruleAcceleoExpression= ruleAcceleoExpression EOF
            {
             newCompositeNode(grammarAccess.getAcceleoExpressionRule()); 
            pushFollow(FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression3770);
            iv_ruleAcceleoExpression=ruleAcceleoExpression();

            state._fsp--;

             current =iv_ruleAcceleoExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcceleoExpression3780); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceleoExpression"


    // $ANTLR start "ruleAcceleoExpression"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1846:1: ruleAcceleoExpression returns [EObject current=null] : (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAcceleoExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1849:28: ( (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1850:1: (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1850:1: (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1850:3: otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleAcceleoExpression3817); 

                	newLeafNode(otherlv_0, grammarAccess.getAcceleoExpressionAccess().getAccKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1854:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1855:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1855:1: (lv_value_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1856:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAcceleoExpression3834); 

            			newLeafNode(lv_value_1_0, grammarAccess.getAcceleoExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAcceleoExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceleoExpression"


    // $ANTLR start "entryRuleVarRef"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1880:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1881:2: (iv_ruleVarRef= ruleVarRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1882:2: iv_ruleVarRef= ruleVarRef EOF
            {
             newCompositeNode(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef3875);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;

             current =iv_ruleVarRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef3885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1889:1: ruleVarRef returns [EObject current=null] : (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1892:28: ( (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1893:1: (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1893:1: (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1893:3: otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleVarRef3922); 

                	newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getVarKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1897:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1898:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1898:1: (lv_value_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1899:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVarRef3939); 

            			newLeafNode(lv_value_1_0, grammarAccess.getVarRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarRefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleFeatureRef"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1923:1: entryRuleFeatureRef returns [EObject current=null] : iv_ruleFeatureRef= ruleFeatureRef EOF ;
    public final EObject entryRuleFeatureRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1924:2: (iv_ruleFeatureRef= ruleFeatureRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1925:2: iv_ruleFeatureRef= ruleFeatureRef EOF
            {
             newCompositeNode(grammarAccess.getFeatureRefRule()); 
            pushFollow(FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef3980);
            iv_ruleFeatureRef=ruleFeatureRef();

            state._fsp--;

             current =iv_ruleFeatureRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRef3990); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureRef"


    // $ANTLR start "ruleFeatureRef"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1932:1: ruleFeatureRef returns [EObject current=null] : (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFeatureRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1935:28: ( (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_ID ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1936:1: (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_ID ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1936:1: (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_ID ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1936:3: otherlv_0= 'feature:' ( (lv_value_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleFeatureRef4027); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureRefAccess().getFeatureKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1940:1: ( (lv_value_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1941:1: (lv_value_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1941:1: (lv_value_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1942:3: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureRef4044); 

            			newLeafNode(lv_value_1_0, grammarAccess.getFeatureRefAccess().getValueIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureRef"


    // $ANTLR start "entryRuleServiceRef"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1966:1: entryRuleServiceRef returns [EObject current=null] : iv_ruleServiceRef= ruleServiceRef EOF ;
    public final EObject entryRuleServiceRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1967:2: (iv_ruleServiceRef= ruleServiceRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1968:2: iv_ruleServiceRef= ruleServiceRef EOF
            {
             newCompositeNode(grammarAccess.getServiceRefRule()); 
            pushFollow(FOLLOW_ruleServiceRef_in_entryRuleServiceRef4085);
            iv_ruleServiceRef=ruleServiceRef();

            state._fsp--;

             current =iv_ruleServiceRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceRef4095); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceRef"


    // $ANTLR start "ruleServiceRef"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1975:1: ruleServiceRef returns [EObject current=null] : (otherlv_0= 'service:' ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleServiceRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1978:28: ( (otherlv_0= 'service:' ( (lv_value_1_0= RULE_ID ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1979:1: (otherlv_0= 'service:' ( (lv_value_1_0= RULE_ID ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1979:1: (otherlv_0= 'service:' ( (lv_value_1_0= RULE_ID ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1979:3: otherlv_0= 'service:' ( (lv_value_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleServiceRef4132); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceRefAccess().getServiceKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1983:1: ( (lv_value_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1984:1: (lv_value_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1984:1: (lv_value_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1985:3: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceRef4149); 

            			newLeafNode(lv_value_1_0, grammarAccess.getServiceRefAccess().getValueIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceRef"


    // $ANTLR start "entryRuleMetamodelUsage"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2009:1: entryRuleMetamodelUsage returns [EObject current=null] : iv_ruleMetamodelUsage= ruleMetamodelUsage EOF ;
    public final EObject entryRuleMetamodelUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelUsage = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2010:2: (iv_ruleMetamodelUsage= ruleMetamodelUsage EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2011:2: iv_ruleMetamodelUsage= ruleMetamodelUsage EOF
            {
             newCompositeNode(grammarAccess.getMetamodelUsageRule()); 
            pushFollow(FOLLOW_ruleMetamodelUsage_in_entryRuleMetamodelUsage4190);
            iv_ruleMetamodelUsage=ruleMetamodelUsage();

            state._fsp--;

             current =iv_ruleMetamodelUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelUsage4200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodelUsage"


    // $ANTLR start "ruleMetamodelUsage"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2018:1: ruleMetamodelUsage returns [EObject current=null] : (otherlv_0= 'metamodel' ( (otherlv_1= RULE_STRING ) ) ) ;
    public final EObject ruleMetamodelUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2021:28: ( (otherlv_0= 'metamodel' ( (otherlv_1= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2022:1: (otherlv_0= 'metamodel' ( (otherlv_1= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2022:1: (otherlv_0= 'metamodel' ( (otherlv_1= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2022:3: otherlv_0= 'metamodel' ( (otherlv_1= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleMetamodelUsage4237); 

                	newLeafNode(otherlv_0, grammarAccess.getMetamodelUsageAccess().getMetamodelKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2026:1: ( (otherlv_1= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2027:1: (otherlv_1= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2027:1: (otherlv_1= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2028:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMetamodelUsageRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetamodelUsage4257); 

            		newLeafNode(otherlv_1, grammarAccess.getMetamodelUsageAccess().getUsageEPackageCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodelUsage"


    // $ANTLR start "entryRuleJavaServiceClassReference"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2047:1: entryRuleJavaServiceClassReference returns [EObject current=null] : iv_ruleJavaServiceClassReference= ruleJavaServiceClassReference EOF ;
    public final EObject entryRuleJavaServiceClassReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaServiceClassReference = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2048:2: (iv_ruleJavaServiceClassReference= ruleJavaServiceClassReference EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2049:2: iv_ruleJavaServiceClassReference= ruleJavaServiceClassReference EOF
            {
             newCompositeNode(grammarAccess.getJavaServiceClassReferenceRule()); 
            pushFollow(FOLLOW_ruleJavaServiceClassReference_in_entryRuleJavaServiceClassReference4293);
            iv_ruleJavaServiceClassReference=ruleJavaServiceClassReference();

            state._fsp--;

             current =iv_ruleJavaServiceClassReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaServiceClassReference4303); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaServiceClassReference"


    // $ANTLR start "ruleJavaServiceClassReference"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2056:1: ruleJavaServiceClassReference returns [EObject current=null] : (otherlv_0= 'use' ( (lv_javaClass_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleJavaServiceClassReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_javaClass_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2059:28: ( (otherlv_0= 'use' ( (lv_javaClass_1_0= ruleQualifiedName ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2060:1: (otherlv_0= 'use' ( (lv_javaClass_1_0= ruleQualifiedName ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2060:1: (otherlv_0= 'use' ( (lv_javaClass_1_0= ruleQualifiedName ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2060:3: otherlv_0= 'use' ( (lv_javaClass_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleJavaServiceClassReference4340); 

                	newLeafNode(otherlv_0, grammarAccess.getJavaServiceClassReferenceAccess().getUseKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2064:1: ( (lv_javaClass_1_0= ruleQualifiedName ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2065:1: (lv_javaClass_1_0= ruleQualifiedName )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2065:1: (lv_javaClass_1_0= ruleQualifiedName )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2066:3: lv_javaClass_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getJavaServiceClassReferenceAccess().getJavaClassQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJavaServiceClassReference4361);
            lv_javaClass_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJavaServiceClassReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"javaClass",
                    		lv_javaClass_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaServiceClassReference"


    // $ANTLR start "entryRuleColor"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2090:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2091:2: (iv_ruleColor= ruleColor EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2092:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor4397);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor4407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2099:1: ruleColor returns [EObject current=null] : this_PreDefinedColorDefinition_0= rulePreDefinedColorDefinition ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        EObject this_PreDefinedColorDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2102:28: (this_PreDefinedColorDefinition_0= rulePreDefinedColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2104:5: this_PreDefinedColorDefinition_0= rulePreDefinedColorDefinition
            {
             
                    newCompositeNode(grammarAccess.getColorAccess().getPreDefinedColorDefinitionParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePreDefinedColorDefinition_in_ruleColor4453);
            this_PreDefinedColorDefinition_0=rulePreDefinedColorDefinition();

            state._fsp--;

             
                    current = this_PreDefinedColorDefinition_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRulePreDefinedColorDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2120:1: entryRulePreDefinedColorDefinition returns [EObject current=null] : iv_rulePreDefinedColorDefinition= rulePreDefinedColorDefinition EOF ;
    public final EObject entryRulePreDefinedColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreDefinedColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2121:2: (iv_rulePreDefinedColorDefinition= rulePreDefinedColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2122:2: iv_rulePreDefinedColorDefinition= rulePreDefinedColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getPreDefinedColorDefinitionRule()); 
            pushFollow(FOLLOW_rulePreDefinedColorDefinition_in_entryRulePreDefinedColorDefinition4487);
            iv_rulePreDefinedColorDefinition=rulePreDefinedColorDefinition();

            state._fsp--;

             current =iv_rulePreDefinedColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreDefinedColorDefinition4497); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreDefinedColorDefinition"


    // $ANTLR start "rulePreDefinedColorDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2129:1: rulePreDefinedColorDefinition returns [EObject current=null] : ( (lv_color_0_0= rulePreDefinedColor ) ) ;
    public final EObject rulePreDefinedColorDefinition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_color_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2132:28: ( ( (lv_color_0_0= rulePreDefinedColor ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2133:1: ( (lv_color_0_0= rulePreDefinedColor ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2133:1: ( (lv_color_0_0= rulePreDefinedColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2134:1: (lv_color_0_0= rulePreDefinedColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2134:1: (lv_color_0_0= rulePreDefinedColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2135:3: lv_color_0_0= rulePreDefinedColor
            {
             
            	        newCompositeNode(grammarAccess.getPreDefinedColorDefinitionAccess().getColorPreDefinedColorEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePreDefinedColor_in_rulePreDefinedColorDefinition4542);
            lv_color_0_0=rulePreDefinedColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPreDefinedColorDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_0_0, 
                    		"PreDefinedColor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreDefinedColorDefinition"


    // $ANTLR start "entryRuleQualifiedName"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2159:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2160:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2161:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4578);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4589); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2168:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2171:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2172:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2172:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2172:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4629); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2179:1: (kw= '.' this_ID_2= RULE_ID )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==52) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2180:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,52,FOLLOW_52_in_ruleQualifiedName4648); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4663); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rulePreDefinedColor"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2200:1: rulePreDefinedColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) ) ;
    public final Enumerator rulePreDefinedColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;

         enterRule(); 
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2202:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2203:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2203:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) )
            int alt46=26;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt46=1;
                }
                break;
            case 54:
                {
                alt46=2;
                }
                break;
            case 55:
                {
                alt46=3;
                }
                break;
            case 56:
                {
                alt46=4;
                }
                break;
            case 57:
                {
                alt46=5;
                }
                break;
            case 58:
                {
                alt46=6;
                }
                break;
            case 59:
                {
                alt46=7;
                }
                break;
            case 60:
                {
                alt46=8;
                }
                break;
            case 61:
                {
                alt46=9;
                }
                break;
            case 62:
                {
                alt46=10;
                }
                break;
            case 63:
                {
                alt46=11;
                }
                break;
            case 64:
                {
                alt46=12;
                }
                break;
            case 65:
                {
                alt46=13;
                }
                break;
            case 66:
                {
                alt46=14;
                }
                break;
            case 67:
                {
                alt46=15;
                }
                break;
            case 68:
                {
                alt46=16;
                }
                break;
            case 69:
                {
                alt46=17;
                }
                break;
            case 70:
                {
                alt46=18;
                }
                break;
            case 71:
                {
                alt46=19;
                }
                break;
            case 72:
                {
                alt46=20;
                }
                break;
            case 73:
                {
                alt46=21;
                }
                break;
            case 74:
                {
                alt46=22;
                }
                break;
            case 75:
                {
                alt46=23;
                }
                break;
            case 76:
                {
                alt46=24;
                }
                break;
            case 77:
                {
                alt46=25;
                }
                break;
            case 78:
                {
                alt46=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2203:2: (enumLiteral_0= 'white' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2203:2: (enumLiteral_0= 'white' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2203:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_rulePreDefinedColor4724); 

                            current = grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2209:6: (enumLiteral_1= 'black' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2209:6: (enumLiteral_1= 'black' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2209:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_rulePreDefinedColor4741); 

                            current = grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2215:6: (enumLiteral_2= 'blue' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2215:6: (enumLiteral_2= 'blue' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2215:8: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_rulePreDefinedColor4758); 

                            current = grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2221:6: (enumLiteral_3= 'light blue' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2221:6: (enumLiteral_3= 'light blue' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2221:8: enumLiteral_3= 'light blue'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_56_in_rulePreDefinedColor4775); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2227:6: (enumLiteral_4= 'dark blue' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2227:6: (enumLiteral_4= 'dark blue' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2227:8: enumLiteral_4= 'dark blue'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_57_in_rulePreDefinedColor4792); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2233:6: (enumLiteral_5= 'chocolate' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2233:6: (enumLiteral_5= 'chocolate' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2233:8: enumLiteral_5= 'chocolate'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_58_in_rulePreDefinedColor4809); 

                            current = grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2239:6: (enumLiteral_6= 'light chocolate' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2239:6: (enumLiteral_6= 'light chocolate' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2239:8: enumLiteral_6= 'light chocolate'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_59_in_rulePreDefinedColor4826); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2245:6: (enumLiteral_7= 'dark chocolate' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2245:6: (enumLiteral_7= 'dark chocolate' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2245:8: enumLiteral_7= 'dark chocolate'
                    {
                    enumLiteral_7=(Token)match(input,60,FOLLOW_60_in_rulePreDefinedColor4843); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2251:6: (enumLiteral_8= 'gray' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2251:6: (enumLiteral_8= 'gray' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2251:8: enumLiteral_8= 'gray'
                    {
                    enumLiteral_8=(Token)match(input,61,FOLLOW_61_in_rulePreDefinedColor4860); 

                            current = grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2257:6: (enumLiteral_9= 'light gray' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2257:6: (enumLiteral_9= 'light gray' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2257:8: enumLiteral_9= 'light gray'
                    {
                    enumLiteral_9=(Token)match(input,62,FOLLOW_62_in_rulePreDefinedColor4877); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2263:6: (enumLiteral_10= 'dark gray' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2263:6: (enumLiteral_10= 'dark gray' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2263:8: enumLiteral_10= 'dark gray'
                    {
                    enumLiteral_10=(Token)match(input,63,FOLLOW_63_in_rulePreDefinedColor4894); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2269:6: (enumLiteral_11= 'green' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2269:6: (enumLiteral_11= 'green' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2269:8: enumLiteral_11= 'green'
                    {
                    enumLiteral_11=(Token)match(input,64,FOLLOW_64_in_rulePreDefinedColor4911); 

                            current = grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2275:6: (enumLiteral_12= 'light green' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2275:6: (enumLiteral_12= 'light green' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2275:8: enumLiteral_12= 'light green'
                    {
                    enumLiteral_12=(Token)match(input,65,FOLLOW_65_in_rulePreDefinedColor4928); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2281:6: (enumLiteral_13= 'dark green' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2281:6: (enumLiteral_13= 'dark green' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2281:8: enumLiteral_13= 'dark green'
                    {
                    enumLiteral_13=(Token)match(input,66,FOLLOW_66_in_rulePreDefinedColor4945); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2287:6: (enumLiteral_14= 'orange' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2287:6: (enumLiteral_14= 'orange' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2287:8: enumLiteral_14= 'orange'
                    {
                    enumLiteral_14=(Token)match(input,67,FOLLOW_67_in_rulePreDefinedColor4962); 

                            current = grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2293:6: (enumLiteral_15= 'light orange' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2293:6: (enumLiteral_15= 'light orange' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2293:8: enumLiteral_15= 'light orange'
                    {
                    enumLiteral_15=(Token)match(input,68,FOLLOW_68_in_rulePreDefinedColor4979); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2299:6: (enumLiteral_16= 'dark orange' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2299:6: (enumLiteral_16= 'dark orange' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2299:8: enumLiteral_16= 'dark orange'
                    {
                    enumLiteral_16=(Token)match(input,69,FOLLOW_69_in_rulePreDefinedColor4996); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2305:6: (enumLiteral_17= 'purple' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2305:6: (enumLiteral_17= 'purple' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2305:8: enumLiteral_17= 'purple'
                    {
                    enumLiteral_17=(Token)match(input,70,FOLLOW_70_in_rulePreDefinedColor5013); 

                            current = grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2311:6: (enumLiteral_18= 'light purple' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2311:6: (enumLiteral_18= 'light purple' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2311:8: enumLiteral_18= 'light purple'
                    {
                    enumLiteral_18=(Token)match(input,71,FOLLOW_71_in_rulePreDefinedColor5030); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2317:6: (enumLiteral_19= 'dark purple' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2317:6: (enumLiteral_19= 'dark purple' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2317:8: enumLiteral_19= 'dark purple'
                    {
                    enumLiteral_19=(Token)match(input,72,FOLLOW_72_in_rulePreDefinedColor5047); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2323:6: (enumLiteral_20= 'red' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2323:6: (enumLiteral_20= 'red' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2323:8: enumLiteral_20= 'red'
                    {
                    enumLiteral_20=(Token)match(input,73,FOLLOW_73_in_rulePreDefinedColor5064); 

                            current = grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2329:6: (enumLiteral_21= 'light red' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2329:6: (enumLiteral_21= 'light red' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2329:8: enumLiteral_21= 'light red'
                    {
                    enumLiteral_21=(Token)match(input,74,FOLLOW_74_in_rulePreDefinedColor5081); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2335:6: (enumLiteral_22= 'dark red' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2335:6: (enumLiteral_22= 'dark red' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2335:8: enumLiteral_22= 'dark red'
                    {
                    enumLiteral_22=(Token)match(input,75,FOLLOW_75_in_rulePreDefinedColor5098); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2341:6: (enumLiteral_23= 'yellow' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2341:6: (enumLiteral_23= 'yellow' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2341:8: enumLiteral_23= 'yellow'
                    {
                    enumLiteral_23=(Token)match(input,76,FOLLOW_76_in_rulePreDefinedColor5115); 

                            current = grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2347:6: (enumLiteral_24= 'light yellow' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2347:6: (enumLiteral_24= 'light yellow' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2347:8: enumLiteral_24= 'light yellow'
                    {
                    enumLiteral_24=(Token)match(input,77,FOLLOW_77_in_rulePreDefinedColor5132); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2353:6: (enumLiteral_25= 'dark yellow' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2353:6: (enumLiteral_25= 'dark yellow' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2353:8: enumLiteral_25= 'dark yellow'
                    {
                    enumLiteral_25=(Token)match(input,78,FOLLOW_78_in_rulePreDefinedColor5149); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_YELLOWEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_25, grammarAccess.getPreDefinedColorAccess().getDARK_YELLOWEnumLiteralDeclaration_25()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreDefinedColor"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSPrototyper_in_entryRuleSPrototyper75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPrototyper85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSPrototyper122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPrototyper139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSPrototyper156 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSPrototyper169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPrototyper186 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSPrototyper205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPrototyper222 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleSPViewpoint_in_ruleSPrototyper248 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleSPrototyper261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPViewpoint_in_entryRuleSPViewpoint297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPViewpoint307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSPViewpoint344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPViewpoint361 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSPViewpoint378 = new BitSet(new long[]{0x00080000400E8000L});
    public static final BitSet FOLLOW_17_in_ruleSPViewpoint391 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPViewpoint408 = new BitSet(new long[]{0x00080000400C8000L});
    public static final BitSet FOLLOW_18_in_ruleSPViewpoint428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPViewpoint445 = new BitSet(new long[]{0x0008000040088000L});
    public static final BitSet FOLLOW_ruleJavaServiceClassReference_in_ruleSPViewpoint473 = new BitSet(new long[]{0x0008000040088000L});
    public static final BitSet FOLLOW_ruleSPRepresentation_in_ruleSPViewpoint495 = new BitSet(new long[]{0x0000000040088000L});
    public static final BitSet FOLLOW_15_in_ruleSPViewpoint508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPRepresentation_in_entryRuleSPRepresentation544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPRepresentation554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPTable_in_ruleSPRepresentation601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPDiagram_in_ruleSPRepresentation628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPTable_in_entryRuleSPTable663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPTable673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSPTable710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPTable727 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSPTable744 = new BitSet(new long[]{0x0004000000300000L});
    public static final BitSet FOLLOW_20_in_ruleSPTable757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPTable774 = new BitSet(new long[]{0x0004000000300000L});
    public static final BitSet FOLLOW_21_in_ruleSPTable794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPTable811 = new BitSet(new long[]{0x0004000000300000L});
    public static final BitSet FOLLOW_ruleMetamodelUsage_in_ruleSPTable839 = new BitSet(new long[]{0x0004000000700000L});
    public static final BitSet FOLLOW_22_in_ruleSPTable852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPTable872 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleTableElement_in_ruleSPTable893 = new BitSet(new long[]{0x0000000011800000L});
    public static final BitSet FOLLOW_ruleTableProperty_in_ruleSPTable915 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_15_in_ruleSPTable928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_entryRuleTableElement964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableElement974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTableElement1017 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTableElement1043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableElement1063 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTableElement1075 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleTableElement1096 = new BitSet(new long[]{0x0000000004001002L});
    public static final BitSet FOLLOW_26_in_ruleTableElement1115 = new BitSet(new long[]{0x0000000008001002L});
    public static final BitSet FOLLOW_27_in_ruleTableElement1141 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleTableElement1162 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleTableElement1179 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleTableElement_in_ruleTableElement1200 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_15_in_ruleTableElement1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableProperty_in_entryRuleTableProperty1251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableProperty1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTableProperty1298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableProperty1315 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_20_in_ruleTableProperty1333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableProperty1350 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTableProperty1370 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleTableProperty1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPDiagram_in_entryRuleSPDiagram1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPDiagram1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSPDiagram1476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPDiagram1493 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSPDiagram1510 = new BitSet(new long[]{0x0004000000300000L});
    public static final BitSet FOLLOW_20_in_ruleSPDiagram1523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1540 = new BitSet(new long[]{0x0004000000300000L});
    public static final BitSet FOLLOW_21_in_ruleSPDiagram1560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1577 = new BitSet(new long[]{0x0004000000300000L});
    public static final BitSet FOLLOW_ruleMetamodelUsage_in_ruleSPDiagram1605 = new BitSet(new long[]{0x0004000000700000L});
    public static final BitSet FOLLOW_22_in_ruleSPDiagram1618 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1635 = new BitSet(new long[]{0x0000007084800000L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_ruleSPDiagram1661 = new BitSet(new long[]{0x0000007084808000L});
    public static final BitSet FOLLOW_15_in_ruleSPDiagram1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement1710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramElement1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleDiagramElement1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleDiagramElement1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer1829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleContainer1882 = new BitSet(new long[]{0x0000003080800000L});
    public static final BitSet FOLLOW_23_in_ruleContainer1914 = new BitSet(new long[]{0x0000003080000000L});
    public static final BitSet FOLLOW_ruleContainerType_in_ruleContainer1949 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleContainer1962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainer1979 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleContainer1996 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer2013 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleContainer2030 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleContainer2051 = new BitSet(new long[]{0x0000000200001002L});
    public static final BitSet FOLLOW_ruleContainerStyleDefinition_in_ruleContainer2072 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleContainer2086 = new BitSet(new long[]{0x0000007084800000L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_ruleContainer2107 = new BitSet(new long[]{0x0000007084808000L});
    public static final BitSet FOLLOW_15_in_ruleContainer2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerStyleDefinition_in_entryRuleContainerStyleDefinition2158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerStyleDefinition2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleContainerStyleDefinition2205 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_ruleContainerStyleDefinition2226 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleContainerStyleDefinition2239 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_ruleContainerStyleDefinition2260 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleContainerStyleDefinition2275 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_ruleContainerStyleDefinition2296 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleContainerStyleDefinition2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerType_in_entryRuleContainerType2347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerType2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleContainerType2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleContainerType2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_entryRuleContainerColorDefinition2455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerColorDefinition2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleContainerColorDefinition2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_ruleContainerColorDefinition2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode2574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleNode2627 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleNode2653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode2670 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleNode2687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode2704 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNode2721 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleNode2742 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleNodeStyleDefinition_in_ruleNode2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeStyleDefinition_in_entryRuleNodeStyleDefinition2800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeStyleDefinition2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleNodeStyleDefinition2847 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleNodeStyleDefinition2868 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleNodeStyleDefinition2881 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_ruleNodeStyleDefinition2902 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleNodeStyleDefinition2917 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_ruleNodeStyleDefinition2938 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleNodeStyleDefinition2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_entryRuleSolidColorDefinition2988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolidColorDefinition2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSolidColorDefinition3035 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_ruleColor_in_ruleSolidColorDefinition3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_entryRuleGradientColorDefinition3092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGradientColorDefinition3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleGradientColorDefinition3139 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_ruleColor_in_ruleGradientColorDefinition3160 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleGradientColorDefinition3172 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_ruleColor_in_ruleGradientColorDefinition3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_entryRuleLabelStyleDefinition3229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelStyleDefinition3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleLabelStyleDefinition3276 = new BitSet(new long[]{0x0003C08000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleLabelStyleDefinition3297 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleLabelStyleDefinition3319 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleLabelStyleDefinition3332 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLabelStyleDefinition3349 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleLabelStyleDefinition3374 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleLabelStyleDefinition3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_entryRuleBorderStyleDefinition3456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderStyleDefinition3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBorderStyleDefinition3503 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleBorderStyleDefinition3524 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleBorderStyleDefinition3537 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBorderStyleDefinition3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_entryRuleSPExpression3597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPExpression3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_ruleSPExpression3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_ruleSPExpression3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_ruleSPExpression3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceRef_in_ruleSPExpression3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression3770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcceleoExpression3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAcceleoExpression3817 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAcceleoExpression3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef3875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVarRef3922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVarRef3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef3980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRef3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFeatureRef4027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureRef4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceRef_in_entryRuleServiceRef4085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceRef4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleServiceRef4132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceRef4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelUsage_in_entryRuleMetamodelUsage4190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelUsage4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMetamodelUsage4237 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetamodelUsage4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaServiceClassReference_in_entryRuleJavaServiceClassReference4293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaServiceClassReference4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleJavaServiceClassReference4340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJavaServiceClassReference4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor4397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColorDefinition_in_ruleColor4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColorDefinition_in_entryRulePreDefinedColorDefinition4487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreDefinedColorDefinition4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColor_in_rulePreDefinedColorDefinition4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4629 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleQualifiedName4648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4663 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_53_in_rulePreDefinedColor4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePreDefinedColor4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePreDefinedColor4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePreDefinedColor4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePreDefinedColor4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePreDefinedColor4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePreDefinedColor4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePreDefinedColor4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePreDefinedColor4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePreDefinedColor4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePreDefinedColor4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePreDefinedColor4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePreDefinedColor4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePreDefinedColor4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePreDefinedColor4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePreDefinedColor4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePreDefinedColor4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePreDefinedColor5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePreDefinedColor5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePreDefinedColor5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePreDefinedColor5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePreDefinedColor5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePreDefinedColor5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePreDefinedColor5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rulePreDefinedColor5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulePreDefinedColor5149 = new BitSet(new long[]{0x0000000000000002L});

}