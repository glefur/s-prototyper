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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'proto'", "'{'", "'qualifier'", "'}'", "'viewpoint'", "'shortcut'", "'ext'", "'table'", "'label'", "'title'", "'root'", "'creatable'", "'recursive'", "'element'", "'accessibleThrough'", "'property'", "'expression'", "'diagram'", "'container'", "'['", "','", "']'", "'freeform'", "'list'", "'color'", "'gradient from'", "'to'", "'size'", "'bold'", "'italic'", "'border '", "'acc:'", "'var:'", "'feature:'", "'use'", "'white'", "'black'", "'blue'", "'light blue'", "'dark blue'", "'chocolate'", "'light chocolate'", "'dark chocolate'", "'gray'", "'light gray'", "'dark gray'", "'green'", "'light green'", "'dark green'", "'orange'", "'light orange'", "'dark orange'", "'purple'", "'light purple'", "'dark purple'", "'red'", "'light red'", "'dark red'", "'yellow'", "'light yellow'", "'dark yellow'"
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
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:77:1: ruleSPrototyper returns [EObject current=null] : (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? ( (lv_viewpoints_5_0= ruleSPViewpoint ) )* otherlv_6= '}' ) ;
    public final EObject ruleSPrototyper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_qualifier_4_0=null;
        Token otherlv_6=null;
        EObject lv_viewpoints_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:80:28: ( (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? ( (lv_viewpoints_5_0= ruleSPViewpoint ) )* otherlv_6= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:81:1: (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? ( (lv_viewpoints_5_0= ruleSPViewpoint ) )* otherlv_6= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:81:1: (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? ( (lv_viewpoints_5_0= ruleSPViewpoint ) )* otherlv_6= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:81:3: otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? ( (lv_viewpoints_5_0= ruleSPViewpoint ) )* otherlv_6= '}'
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:129:4: ( (lv_viewpoints_5_0= ruleSPViewpoint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:130:1: (lv_viewpoints_5_0= ruleSPViewpoint )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:130:1: (lv_viewpoints_5_0= ruleSPViewpoint )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:131:3: lv_viewpoints_5_0= ruleSPViewpoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPrototyperAccess().getViewpointsSPViewpointParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSPViewpoint_in_ruleSPrototyper214);
            	    lv_viewpoints_5_0=ruleSPViewpoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPrototyperRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"viewpoints",
            	            		lv_viewpoints_5_0, 
            	            		"SPViewpoint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleSPrototyper227); 

                	newLeafNode(otherlv_6, grammarAccess.getSPrototyperAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:159:1: entryRuleSPViewpoint returns [EObject current=null] : iv_ruleSPViewpoint= ruleSPViewpoint EOF ;
    public final EObject entryRuleSPViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPViewpoint = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:160:2: (iv_ruleSPViewpoint= ruleSPViewpoint EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:161:2: iv_ruleSPViewpoint= ruleSPViewpoint EOF
            {
             newCompositeNode(grammarAccess.getSPViewpointRule()); 
            pushFollow(FOLLOW_ruleSPViewpoint_in_entryRuleSPViewpoint263);
            iv_ruleSPViewpoint=ruleSPViewpoint();

            state._fsp--;

             current =iv_ruleSPViewpoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPViewpoint273); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:168:1: ruleSPViewpoint returns [EObject current=null] : (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_representations_7_0= ruleSPRepresentation ) )* otherlv_8= '}' ) ;
    public final EObject ruleSPViewpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_shortcut_4_0=null;
        Token otherlv_5=null;
        Token lv_extension_6_0=null;
        Token otherlv_8=null;
        EObject lv_representations_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:171:28: ( (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_representations_7_0= ruleSPRepresentation ) )* otherlv_8= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:172:1: (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_representations_7_0= ruleSPRepresentation ) )* otherlv_8= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:172:1: (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_representations_7_0= ruleSPRepresentation ) )* otherlv_8= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:172:3: otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_representations_7_0= ruleSPRepresentation ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSPViewpoint310); 

                	newLeafNode(otherlv_0, grammarAccess.getSPViewpointAccess().getViewpointKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:176:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:177:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:177:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:178:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPViewpoint327); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSPViewpoint344); 

                	newLeafNode(otherlv_2, grammarAccess.getSPViewpointAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:198:1: (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:198:3: otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSPViewpoint357); 

                        	newLeafNode(otherlv_3, grammarAccess.getSPViewpointAccess().getShortcutKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:202:1: ( (lv_shortcut_4_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:203:1: (lv_shortcut_4_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:203:1: (lv_shortcut_4_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:204:3: lv_shortcut_4_0= RULE_STRING
                    {
                    lv_shortcut_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPViewpoint374); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:220:4: (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:220:6: otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSPViewpoint394); 

                        	newLeafNode(otherlv_5, grammarAccess.getSPViewpointAccess().getExtKeyword_4_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:224:1: ( (lv_extension_6_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:225:1: (lv_extension_6_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:225:1: (lv_extension_6_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:226:3: lv_extension_6_0= RULE_STRING
                    {
                    lv_extension_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPViewpoint411); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:242:4: ( (lv_representations_7_0= ruleSPRepresentation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18||LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:243:1: (lv_representations_7_0= ruleSPRepresentation )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:243:1: (lv_representations_7_0= ruleSPRepresentation )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:244:3: lv_representations_7_0= ruleSPRepresentation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPViewpointAccess().getRepresentationsSPRepresentationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSPRepresentation_in_ruleSPViewpoint439);
            	    lv_representations_7_0=ruleSPRepresentation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPViewpointRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"representations",
            	            		lv_representations_7_0, 
            	            		"SPRepresentation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleSPViewpoint452); 

                	newLeafNode(otherlv_8, grammarAccess.getSPViewpointAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:272:1: entryRuleSPRepresentation returns [EObject current=null] : iv_ruleSPRepresentation= ruleSPRepresentation EOF ;
    public final EObject entryRuleSPRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPRepresentation = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:273:2: (iv_ruleSPRepresentation= ruleSPRepresentation EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:274:2: iv_ruleSPRepresentation= ruleSPRepresentation EOF
            {
             newCompositeNode(grammarAccess.getSPRepresentationRule()); 
            pushFollow(FOLLOW_ruleSPRepresentation_in_entryRuleSPRepresentation488);
            iv_ruleSPRepresentation=ruleSPRepresentation();

            state._fsp--;

             current =iv_ruleSPRepresentation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPRepresentation498); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:281:1: ruleSPRepresentation returns [EObject current=null] : (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram ) ;
    public final EObject ruleSPRepresentation() throws RecognitionException {
        EObject current = null;

        EObject this_SPTable_0 = null;

        EObject this_SPDiagram_1 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:284:28: ( (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:285:1: (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:285:1: (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:286:5: this_SPTable_0= ruleSPTable
                    {
                     
                            newCompositeNode(grammarAccess.getSPRepresentationAccess().getSPTableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSPTable_in_ruleSPRepresentation545);
                    this_SPTable_0=ruleSPTable();

                    state._fsp--;

                     
                            current = this_SPTable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:296:5: this_SPDiagram_1= ruleSPDiagram
                    {
                     
                            newCompositeNode(grammarAccess.getSPRepresentationAccess().getSPDiagramParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSPDiagram_in_ruleSPRepresentation572);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:312:1: entryRuleSPTable returns [EObject current=null] : iv_ruleSPTable= ruleSPTable EOF ;
    public final EObject entryRuleSPTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPTable = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:313:2: (iv_ruleSPTable= ruleSPTable EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:314:2: iv_ruleSPTable= ruleSPTable EOF
            {
             newCompositeNode(grammarAccess.getSPTableRule()); 
            pushFollow(FOLLOW_ruleSPTable_in_entryRuleSPTable607);
            iv_ruleSPTable=ruleSPTable();

            state._fsp--;

             current =iv_ruleSPTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPTable617); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:321:1: ruleSPTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' ) ;
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
        Token lv_root_9_0=null;
        Token otherlv_12=null;
        EObject lv_metamodels_7_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_properties_11_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:324:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:325:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:325:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:325:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSPTable654); 

                	newLeafNode(otherlv_0, grammarAccess.getSPTableAccess().getTableKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:329:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:330:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:330:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:331:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPTable671); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSPTable688); 

                	newLeafNode(otherlv_2, grammarAccess.getSPTableAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:351:1: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:351:3: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSPTable701); 

                        	newLeafNode(otherlv_3, grammarAccess.getSPTableAccess().getLabelKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:355:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:356:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:356:1: (lv_label_4_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:357:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPTable718); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:373:4: (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:373:6: otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSPTable738); 

                        	newLeafNode(otherlv_5, grammarAccess.getSPTableAccess().getTitleKeyword_4_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:377:1: ( (lv_title_6_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:378:1: (lv_title_6_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:378:1: (lv_title_6_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:379:3: lv_title_6_0= RULE_STRING
                    {
                    lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPTable755); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:395:4: ( (lv_metamodels_7_0= ruleMetamodelRef ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==45) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:396:1: (lv_metamodels_7_0= ruleMetamodelRef )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:396:1: (lv_metamodels_7_0= ruleMetamodelRef )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:397:3: lv_metamodels_7_0= ruleMetamodelRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPTableAccess().getMetamodelsMetamodelRefParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetamodelRef_in_ruleSPTable783);
            	    lv_metamodels_7_0=ruleMetamodelRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metamodels",
            	            		lv_metamodels_7_0, 
            	            		"MetamodelRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleSPTable796); 

                	newLeafNode(otherlv_8, grammarAccess.getSPTableAccess().getRootKeyword_6());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:417:1: ( (lv_root_9_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:418:1: (lv_root_9_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:418:1: (lv_root_9_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:419:3: lv_root_9_0= RULE_STRING
            {
            lv_root_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPTable813); 

            			newLeafNode(lv_root_9_0, grammarAccess.getSPTableAccess().getRootSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSPTableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"root",
                    		lv_root_9_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:435:2: ( (lv_elements_10_0= ruleTableElement ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=22 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:436:1: (lv_elements_10_0= ruleTableElement )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:436:1: (lv_elements_10_0= ruleTableElement )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:437:3: lv_elements_10_0= ruleTableElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPTableAccess().getElementsTableElementParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableElement_in_ruleSPTable839);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:453:3: ( (lv_properties_11_0= ruleTableProperty ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:454:1: (lv_properties_11_0= ruleTableProperty )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:454:1: (lv_properties_11_0= ruleTableProperty )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:455:3: lv_properties_11_0= ruleTableProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPTableAccess().getPropertiesTablePropertyParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableProperty_in_ruleSPTable861);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleSPTable874); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:483:1: entryRuleTableElement returns [EObject current=null] : iv_ruleTableElement= ruleTableElement EOF ;
    public final EObject entryRuleTableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableElement = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:484:2: (iv_ruleTableElement= ruleTableElement EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:485:2: iv_ruleTableElement= ruleTableElement EOF
            {
             newCompositeNode(grammarAccess.getTableElementRule()); 
            pushFollow(FOLLOW_ruleTableElement_in_entryRuleTableElement910);
            iv_ruleTableElement=ruleTableElement();

            state._fsp--;

             current =iv_ruleTableElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableElement920); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:492:1: ruleTableElement returns [EObject current=null] : ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? otherlv_2= 'element' ( (lv_eClass_3_0= RULE_STRING ) ) otherlv_4= 'accessibleThrough' ( (lv_expression_5_0= ruleSPExpression ) ) (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )? ) ;
    public final EObject ruleTableElement() throws RecognitionException {
        EObject current = null;

        Token lv_creatable_0_0=null;
        Token lv_recursive_1_0=null;
        Token otherlv_2=null;
        Token lv_eClass_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_expression_5_0 = null;

        EObject lv_subElements_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:495:28: ( ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? otherlv_2= 'element' ( (lv_eClass_3_0= RULE_STRING ) ) otherlv_4= 'accessibleThrough' ( (lv_expression_5_0= ruleSPExpression ) ) (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:496:1: ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? otherlv_2= 'element' ( (lv_eClass_3_0= RULE_STRING ) ) otherlv_4= 'accessibleThrough' ( (lv_expression_5_0= ruleSPExpression ) ) (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:496:1: ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? otherlv_2= 'element' ( (lv_eClass_3_0= RULE_STRING ) ) otherlv_4= 'accessibleThrough' ( (lv_expression_5_0= ruleSPExpression ) ) (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:496:2: ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? otherlv_2= 'element' ( (lv_eClass_3_0= RULE_STRING ) ) otherlv_4= 'accessibleThrough' ( (lv_expression_5_0= ruleSPExpression ) ) (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )?
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:496:2: ( (lv_creatable_0_0= 'creatable' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:497:1: (lv_creatable_0_0= 'creatable' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:497:1: (lv_creatable_0_0= 'creatable' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:498:3: lv_creatable_0_0= 'creatable'
                    {
                    lv_creatable_0_0=(Token)match(input,22,FOLLOW_22_in_ruleTableElement963); 

                            newLeafNode(lv_creatable_0_0, grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableElementRule());
                    	        }
                           		setWithLastConsumed(current, "creatable", true, "creatable");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:511:3: ( (lv_recursive_1_0= 'recursive' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:512:1: (lv_recursive_1_0= 'recursive' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:512:1: (lv_recursive_1_0= 'recursive' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:513:3: lv_recursive_1_0= 'recursive'
                    {
                    lv_recursive_1_0=(Token)match(input,23,FOLLOW_23_in_ruleTableElement995); 

                            newLeafNode(lv_recursive_1_0, grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableElementRule());
                    	        }
                           		setWithLastConsumed(current, "recursive", true, "recursive");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleTableElement1021); 

                	newLeafNode(otherlv_2, grammarAccess.getTableElementAccess().getElementKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:530:1: ( (lv_eClass_3_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:531:1: (lv_eClass_3_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:531:1: (lv_eClass_3_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:532:3: lv_eClass_3_0= RULE_STRING
            {
            lv_eClass_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableElement1038); 

            			newLeafNode(lv_eClass_3_0, grammarAccess.getTableElementAccess().getEClassSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eClass",
                    		lv_eClass_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleTableElement1055); 

                	newLeafNode(otherlv_4, grammarAccess.getTableElementAccess().getAccessibleThroughKeyword_4());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:552:1: ( (lv_expression_5_0= ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:553:1: (lv_expression_5_0= ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:553:1: (lv_expression_5_0= ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:554:3: lv_expression_5_0= ruleSPExpression
            {
             
            	        newCompositeNode(grammarAccess.getTableElementAccess().getExpressionSPExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleSPExpression_in_ruleTableElement1076);
            lv_expression_5_0=ruleSPExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableElementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_5_0, 
                    		"SPExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:570:2: (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:570:4: otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleTableElement1089); 

                        	newLeafNode(otherlv_6, grammarAccess.getTableElementAccess().getLeftCurlyBracketKeyword_6_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:574:1: ( (lv_subElements_7_0= ruleTableElement ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=22 && LA14_0<=24)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:575:1: (lv_subElements_7_0= ruleTableElement )
                    	    {
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:575:1: (lv_subElements_7_0= ruleTableElement )
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:576:3: lv_subElements_7_0= ruleTableElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTableElementAccess().getSubElementsTableElementParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTableElement_in_ruleTableElement1110);
                    	    lv_subElements_7_0=ruleTableElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTableElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subElements",
                    	            		lv_subElements_7_0, 
                    	            		"TableElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleTableElement1123); 

                        	newLeafNode(otherlv_8, grammarAccess.getTableElementAccess().getRightCurlyBracketKeyword_6_2());
                        

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:604:1: entryRuleTableProperty returns [EObject current=null] : iv_ruleTableProperty= ruleTableProperty EOF ;
    public final EObject entryRuleTableProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableProperty = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:605:2: (iv_ruleTableProperty= ruleTableProperty EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:606:2: iv_ruleTableProperty= ruleTableProperty EOF
            {
             newCompositeNode(grammarAccess.getTablePropertyRule()); 
            pushFollow(FOLLOW_ruleTableProperty_in_entryRuleTableProperty1161);
            iv_ruleTableProperty=ruleTableProperty();

            state._fsp--;

             current =iv_ruleTableProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableProperty1171); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:613:1: ruleTableProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:616:28: ( (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:617:1: (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:617:1: (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:617:3: otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTableProperty1208); 

                	newLeafNode(otherlv_0, grammarAccess.getTablePropertyAccess().getPropertyKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:621:1: ( (lv_feature_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:622:1: (lv_feature_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:622:1: (lv_feature_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:623:3: lv_feature_1_0= RULE_STRING
            {
            lv_feature_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableProperty1225); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:639:2: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:639:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTableProperty1243); 

                        	newLeafNode(otherlv_2, grammarAccess.getTablePropertyAccess().getLabelKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:643:1: ( (lv_label_3_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:644:1: (lv_label_3_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:644:1: (lv_label_3_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:645:3: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTableProperty1260); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:661:4: (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:661:6: otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleTableProperty1280); 

                        	newLeafNode(otherlv_4, grammarAccess.getTablePropertyAccess().getExpressionKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:665:1: ( (lv_expression_5_0= ruleSPExpression ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:666:1: (lv_expression_5_0= ruleSPExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:666:1: (lv_expression_5_0= ruleSPExpression )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:667:3: lv_expression_5_0= ruleSPExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTablePropertyAccess().getExpressionSPExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSPExpression_in_ruleTableProperty1301);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:691:1: entryRuleSPDiagram returns [EObject current=null] : iv_ruleSPDiagram= ruleSPDiagram EOF ;
    public final EObject entryRuleSPDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPDiagram = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:692:2: (iv_ruleSPDiagram= ruleSPDiagram EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:693:2: iv_ruleSPDiagram= ruleSPDiagram EOF
            {
             newCompositeNode(grammarAccess.getSPDiagramRule()); 
            pushFollow(FOLLOW_ruleSPDiagram_in_entryRuleSPDiagram1339);
            iv_ruleSPDiagram=ruleSPDiagram();

            state._fsp--;

             current =iv_ruleSPDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPDiagram1349); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:700:1: ruleSPDiagram returns [EObject current=null] : (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:703:28: ( (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:704:1: (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:704:1: (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:704:3: otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleSPDiagram1386); 

                	newLeafNode(otherlv_0, grammarAccess.getSPDiagramAccess().getDiagramKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:708:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:709:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:709:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:710:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPDiagram1403); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSPDiagram1420); 

                	newLeafNode(otherlv_2, grammarAccess.getSPDiagramAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:730:1: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:730:3: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSPDiagram1433); 

                        	newLeafNode(otherlv_3, grammarAccess.getSPDiagramAccess().getLabelKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:734:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:735:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:735:1: (lv_label_4_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:736:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPDiagram1450); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:752:4: (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:752:6: otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSPDiagram1470); 

                        	newLeafNode(otherlv_5, grammarAccess.getSPDiagramAccess().getTitleKeyword_4_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:756:1: ( (lv_title_6_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:757:1: (lv_title_6_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:757:1: (lv_title_6_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:758:3: lv_title_6_0= RULE_STRING
                    {
                    lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPDiagram1487); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:774:4: ( (lv_metamodels_7_0= ruleMetamodelRef ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==45) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:775:1: (lv_metamodels_7_0= ruleMetamodelRef )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:775:1: (lv_metamodels_7_0= ruleMetamodelRef )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:776:3: lv_metamodels_7_0= ruleMetamodelRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPDiagramAccess().getMetamodelsMetamodelRefParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetamodelRef_in_ruleSPDiagram1515);
            	    lv_metamodels_7_0=ruleMetamodelRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSPDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metamodels",
            	            		lv_metamodels_7_0, 
            	            		"MetamodelRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleSPDiagram1528); 

                	newLeafNode(otherlv_8, grammarAccess.getSPDiagramAccess().getRootKeyword_6());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:796:1: ( (lv_root_9_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:797:1: (lv_root_9_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:797:1: (lv_root_9_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:798:3: lv_root_9_0= RULE_STRING
            {
            lv_root_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPDiagram1545); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:814:2: ( (lv_elements_10_0= ruleDiagramElement ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=22 && LA21_0<=23)||LA21_0==29||(LA21_0>=33 && LA21_0<=34)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:815:1: (lv_elements_10_0= ruleDiagramElement )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:815:1: (lv_elements_10_0= ruleDiagramElement )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:816:3: lv_elements_10_0= ruleDiagramElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPDiagramAccess().getElementsDiagramElementParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDiagramElement_in_ruleSPDiagram1571);
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleSPDiagram1584); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:844:1: entryRuleDiagramElement returns [EObject current=null] : iv_ruleDiagramElement= ruleDiagramElement EOF ;
    public final EObject entryRuleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramElement = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:845:2: (iv_ruleDiagramElement= ruleDiagramElement EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:846:2: iv_ruleDiagramElement= ruleDiagramElement EOF
            {
             newCompositeNode(grammarAccess.getDiagramElementRule()); 
            pushFollow(FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement1620);
            iv_ruleDiagramElement=ruleDiagramElement();

            state._fsp--;

             current =iv_ruleDiagramElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramElement1630); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:853:1: ruleDiagramElement returns [EObject current=null] : this_Container_0= ruleContainer ;
    public final EObject ruleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:856:28: (this_Container_0= ruleContainer )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:858:5: this_Container_0= ruleContainer
            {
             
                    newCompositeNode(grammarAccess.getDiagramElementAccess().getContainerParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleContainer_in_ruleDiagramElement1676);
            this_Container_0=ruleContainer();

            state._fsp--;

             
                    current = this_Container_0; 
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
    // $ANTLR end "ruleDiagramElement"


    // $ANTLR start "entryRuleContainer"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:874:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:875:2: (iv_ruleContainer= ruleContainer EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:876:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer1710);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer1720); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:883:1: ruleContainer returns [EObject current=null] : ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleContainerStyleDefinition ) )? (otherlv_8= '{' ( (lv_elements_9_0= ruleDiagramElement ) )+ otherlv_10= '}' )? ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token lv_creatable_0_0=null;
        Token lv_recursive_1_0=null;
        Token otherlv_3=null;
        Token lv_eClass_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_containerType_2_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_style_7_0 = null;

        EObject lv_elements_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:886:28: ( ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleContainerStyleDefinition ) )? (otherlv_8= '{' ( (lv_elements_9_0= ruleDiagramElement ) )+ otherlv_10= '}' )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:887:1: ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleContainerStyleDefinition ) )? (otherlv_8= '{' ( (lv_elements_9_0= ruleDiagramElement ) )+ otherlv_10= '}' )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:887:1: ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleContainerStyleDefinition ) )? (otherlv_8= '{' ( (lv_elements_9_0= ruleDiagramElement ) )+ otherlv_10= '}' )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:887:2: ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleContainerStyleDefinition ) )? (otherlv_8= '{' ( (lv_elements_9_0= ruleDiagramElement ) )+ otherlv_10= '}' )?
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:887:2: ( (lv_creatable_0_0= 'creatable' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:888:1: (lv_creatable_0_0= 'creatable' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:888:1: (lv_creatable_0_0= 'creatable' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:889:3: lv_creatable_0_0= 'creatable'
                    {
                    lv_creatable_0_0=(Token)match(input,22,FOLLOW_22_in_ruleContainer1763); 

                            newLeafNode(lv_creatable_0_0, grammarAccess.getContainerAccess().getCreatableCreatableKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(current, "creatable", true, "creatable");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:902:3: ( (lv_recursive_1_0= 'recursive' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:903:1: (lv_recursive_1_0= 'recursive' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:903:1: (lv_recursive_1_0= 'recursive' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:904:3: lv_recursive_1_0= 'recursive'
                    {
                    lv_recursive_1_0=(Token)match(input,23,FOLLOW_23_in_ruleContainer1795); 

                            newLeafNode(lv_recursive_1_0, grammarAccess.getContainerAccess().getRecursiveRecursiveKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(current, "recursive", true, "recursive");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:917:3: ( (lv_containerType_2_0= ruleContainerType ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=33 && LA24_0<=34)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:918:1: (lv_containerType_2_0= ruleContainerType )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:918:1: (lv_containerType_2_0= ruleContainerType )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:919:3: lv_containerType_2_0= ruleContainerType
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getContainerTypeContainerTypeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContainerType_in_ruleContainer1830);
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleContainer1843); 

                	newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getContainerKeyword_3());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:939:1: ( (lv_eClass_4_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:940:1: (lv_eClass_4_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:940:1: (lv_eClass_4_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:941:3: lv_eClass_4_0= RULE_STRING
            {
            lv_eClass_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer1860); 

            			newLeafNode(lv_eClass_4_0, grammarAccess.getContainerAccess().getEClassSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eClass",
                    		lv_eClass_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleContainer1877); 

                	newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getAccessibleThroughKeyword_5());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:961:1: ( (lv_expression_6_0= ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:962:1: (lv_expression_6_0= ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:962:1: (lv_expression_6_0= ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:963:3: lv_expression_6_0= ruleSPExpression
            {
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getExpressionSPExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSPExpression_in_ruleContainer1898);
            lv_expression_6_0=ruleSPExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_6_0, 
                    		"SPExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:979:2: ( (lv_style_7_0= ruleContainerStyleDefinition ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:980:1: (lv_style_7_0= ruleContainerStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:980:1: (lv_style_7_0= ruleContainerStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:981:3: lv_style_7_0= ruleContainerStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getStyleContainerStyleDefinitionParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContainerStyleDefinition_in_ruleContainer1919);
                    lv_style_7_0=ruleContainerStyleDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_7_0, 
                            		"ContainerStyleDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:997:3: (otherlv_8= '{' ( (lv_elements_9_0= ruleDiagramElement ) )+ otherlv_10= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:997:5: otherlv_8= '{' ( (lv_elements_9_0= ruleDiagramElement ) )+ otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleContainer1933); 

                        	newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_8_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1001:1: ( (lv_elements_9_0= ruleDiagramElement ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=22 && LA26_0<=23)||LA26_0==29||(LA26_0>=33 && LA26_0<=34)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1002:1: (lv_elements_9_0= ruleDiagramElement )
                    	    {
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1002:1: (lv_elements_9_0= ruleDiagramElement )
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1003:3: lv_elements_9_0= ruleDiagramElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainerAccess().getElementsDiagramElementParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDiagramElement_in_ruleContainer1954);
                    	    lv_elements_9_0=ruleDiagramElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_9_0, 
                    	            		"DiagramElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleContainer1967); 

                        	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_8_2());
                        

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1031:1: entryRuleContainerStyleDefinition returns [EObject current=null] : iv_ruleContainerStyleDefinition= ruleContainerStyleDefinition EOF ;
    public final EObject entryRuleContainerStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1032:2: (iv_ruleContainerStyleDefinition= ruleContainerStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1033:2: iv_ruleContainerStyleDefinition= ruleContainerStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getContainerStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleContainerStyleDefinition_in_entryRuleContainerStyleDefinition2005);
            iv_ruleContainerStyleDefinition=ruleContainerStyleDefinition();

            state._fsp--;

             current =iv_ruleContainerStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerStyleDefinition2015); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1040:1: ruleContainerStyleDefinition returns [EObject current=null] : (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1043:28: ( (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1044:1: (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1044:1: (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1044:3: otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleContainerStyleDefinition2052); 

                	newLeafNode(otherlv_0, grammarAccess.getContainerStyleDefinitionAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1048:1: ( (lv_color_1_0= ruleContainerColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1049:1: (lv_color_1_0= ruleContainerColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1049:1: (lv_color_1_0= ruleContainerColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1050:3: lv_color_1_0= ruleContainerColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getContainerStyleDefinitionAccess().getColorContainerColorDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_ruleContainerStyleDefinition2073);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1066:2: (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==19) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1066:4: otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleContainerStyleDefinition2086); 

                        	newLeafNode(otherlv_2, grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1070:1: ( (lv_label_3_0= ruleLabelStyleDefinition ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1071:1: (lv_label_3_0= ruleLabelStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1071:1: (lv_label_3_0= ruleLabelStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1072:3: lv_label_3_0= ruleLabelStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelStyleDefinition_in_ruleContainerStyleDefinition2107);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1088:4: (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1088:6: otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleContainerStyleDefinition2122); 

                        	newLeafNode(otherlv_4, grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1092:1: ( (lv_border_5_0= ruleBorderStyleDefinition ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1093:1: (lv_border_5_0= ruleBorderStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1093:1: (lv_border_5_0= ruleBorderStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1094:3: lv_border_5_0= ruleBorderStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBorderStyleDefinition_in_ruleContainerStyleDefinition2143);
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

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleContainerStyleDefinition2157); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1122:1: entryRuleContainerType returns [String current=null] : iv_ruleContainerType= ruleContainerType EOF ;
    public final String entryRuleContainerType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContainerType = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1123:2: (iv_ruleContainerType= ruleContainerType EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1124:2: iv_ruleContainerType= ruleContainerType EOF
            {
             newCompositeNode(grammarAccess.getContainerTypeRule()); 
            pushFollow(FOLLOW_ruleContainerType_in_entryRuleContainerType2194);
            iv_ruleContainerType=ruleContainerType();

            state._fsp--;

             current =iv_ruleContainerType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerType2205); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1131:1: ruleContainerType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'freeform' | kw= 'list' ) ;
    public final AntlrDatatypeRuleToken ruleContainerType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1134:28: ( (kw= 'freeform' | kw= 'list' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1135:1: (kw= 'freeform' | kw= 'list' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1135:1: (kw= 'freeform' | kw= 'list' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            else if ( (LA30_0==34) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1136:2: kw= 'freeform'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleContainerType2243); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getContainerTypeAccess().getFreeformKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1143:2: kw= 'list'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleContainerType2262); 

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


    // $ANTLR start "entryRuleSolidColorDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1156:1: entryRuleSolidColorDefinition returns [EObject current=null] : iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF ;
    public final EObject entryRuleSolidColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolidColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1157:2: (iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1158:2: iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getSolidColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_entryRuleSolidColorDefinition2302);
            iv_ruleSolidColorDefinition=ruleSolidColorDefinition();

            state._fsp--;

             current =iv_ruleSolidColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolidColorDefinition2312); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1165:1: ruleSolidColorDefinition returns [EObject current=null] : (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) ) ;
    public final EObject ruleSolidColorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_color_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1168:28: ( (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1169:1: (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1169:1: (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1169:3: otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleSolidColorDefinition2349); 

                	newLeafNode(otherlv_0, grammarAccess.getSolidColorDefinitionAccess().getColorKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1173:1: ( (lv_color_1_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1174:1: (lv_color_1_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1174:1: (lv_color_1_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1175:3: lv_color_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getSolidColorDefinitionAccess().getColorColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleSolidColorDefinition2370);
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


    // $ANTLR start "entryRuleContainerColorDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1199:1: entryRuleContainerColorDefinition returns [EObject current=null] : iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF ;
    public final EObject entryRuleContainerColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1200:2: (iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1201:2: iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getContainerColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_entryRuleContainerColorDefinition2406);
            iv_ruleContainerColorDefinition=ruleContainerColorDefinition();

            state._fsp--;

             current =iv_ruleContainerColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerColorDefinition2416); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1208:1: ruleContainerColorDefinition returns [EObject current=null] : (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition ) ;
    public final EObject ruleContainerColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_SolidColorDefinition_0 = null;

        EObject this_GradientColorDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1211:28: ( (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1212:1: (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1212:1: (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            else if ( (LA31_0==36) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1213:5: this_SolidColorDefinition_0= ruleSolidColorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getContainerColorDefinitionAccess().getSolidColorDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleContainerColorDefinition2463);
                    this_SolidColorDefinition_0=ruleSolidColorDefinition();

                    state._fsp--;

                     
                            current = this_SolidColorDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1223:5: this_GradientColorDefinition_1= ruleGradientColorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getContainerColorDefinitionAccess().getGradientColorDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGradientColorDefinition_in_ruleContainerColorDefinition2490);
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


    // $ANTLR start "entryRuleGradientColorDefinition"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1239:1: entryRuleGradientColorDefinition returns [EObject current=null] : iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF ;
    public final EObject entryRuleGradientColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradientColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1240:2: (iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1241:2: iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getGradientColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleGradientColorDefinition_in_entryRuleGradientColorDefinition2525);
            iv_ruleGradientColorDefinition=ruleGradientColorDefinition();

            state._fsp--;

             current =iv_ruleGradientColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGradientColorDefinition2535); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1248:1: ruleGradientColorDefinition returns [EObject current=null] : (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) ) ;
    public final EObject ruleGradientColorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_from_1_0 = null;

        EObject lv_to_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1251:28: ( (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1252:1: (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1252:1: (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1252:3: otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleGradientColorDefinition2572); 

                	newLeafNode(otherlv_0, grammarAccess.getGradientColorDefinitionAccess().getGradientFromKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1256:1: ( (lv_from_1_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1257:1: (lv_from_1_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1257:1: (lv_from_1_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1258:3: lv_from_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getGradientColorDefinitionAccess().getFromColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleGradientColorDefinition2593);
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

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleGradientColorDefinition2605); 

                	newLeafNode(otherlv_2, grammarAccess.getGradientColorDefinitionAccess().getToKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1278:1: ( (lv_to_3_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1279:1: (lv_to_3_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1279:1: (lv_to_3_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1280:3: lv_to_3_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getGradientColorDefinitionAccess().getToColorParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleGradientColorDefinition2626);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1304:1: entryRuleLabelStyleDefinition returns [EObject current=null] : iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF ;
    public final EObject entryRuleLabelStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1305:2: (iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1306:2: iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelStyleDefinition_in_entryRuleLabelStyleDefinition2662);
            iv_ruleLabelStyleDefinition=ruleLabelStyleDefinition();

            state._fsp--;

             current =iv_ruleLabelStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelStyleDefinition2672); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1313:1: ruleLabelStyleDefinition returns [EObject current=null] : (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1316:28: ( (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1317:1: (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1317:1: (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1317:3: otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleLabelStyleDefinition2709); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelStyleDefinitionAccess().getLabelKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1321:1: ( (lv_expression_1_0= ruleSPExpression ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=42 && LA32_0<=44)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1322:1: (lv_expression_1_0= ruleSPExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1322:1: (lv_expression_1_0= ruleSPExpression )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1323:3: lv_expression_1_0= ruleSPExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelStyleDefinitionAccess().getExpressionSPExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSPExpression_in_ruleLabelStyleDefinition2730);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1339:3: ( (lv_color_2_0= ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1340:1: (lv_color_2_0= ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1340:1: (lv_color_2_0= ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1341:3: lv_color_2_0= ruleSolidColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getLabelStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleLabelStyleDefinition2752);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1357:2: (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1357:4: otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleLabelStyleDefinition2765); 

                        	newLeafNode(otherlv_3, grammarAccess.getLabelStyleDefinitionAccess().getSizeKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1361:1: ( (lv_size_4_0= RULE_INT ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1362:1: (lv_size_4_0= RULE_INT )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1362:1: (lv_size_4_0= RULE_INT )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1363:3: lv_size_4_0= RULE_INT
                    {
                    lv_size_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLabelStyleDefinition2782); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1379:4: ( (lv_bold_5_0= 'bold' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1380:1: (lv_bold_5_0= 'bold' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1380:1: (lv_bold_5_0= 'bold' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1381:3: lv_bold_5_0= 'bold'
                    {
                    lv_bold_5_0=(Token)match(input,39,FOLLOW_39_in_ruleLabelStyleDefinition2807); 

                            newLeafNode(lv_bold_5_0, grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelStyleDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "bold", true, "bold");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1394:3: ( (lv_italic_6_0= 'italic' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1395:1: (lv_italic_6_0= 'italic' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1395:1: (lv_italic_6_0= 'italic' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1396:3: lv_italic_6_0= 'italic'
                    {
                    lv_italic_6_0=(Token)match(input,40,FOLLOW_40_in_ruleLabelStyleDefinition2839); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1417:1: entryRuleBorderStyleDefinition returns [EObject current=null] : iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF ;
    public final EObject entryRuleBorderStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorderStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1418:2: (iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1419:2: iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getBorderStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleBorderStyleDefinition_in_entryRuleBorderStyleDefinition2889);
            iv_ruleBorderStyleDefinition=ruleBorderStyleDefinition();

            state._fsp--;

             current =iv_ruleBorderStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderStyleDefinition2899); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1426:1: ruleBorderStyleDefinition returns [EObject current=null] : (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleBorderStyleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        EObject lv_color_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1429:28: ( (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1430:1: (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1430:1: (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1430:3: otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleBorderStyleDefinition2936); 

                	newLeafNode(otherlv_0, grammarAccess.getBorderStyleDefinitionAccess().getBorderKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1434:1: ( (lv_color_1_0= ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1435:1: (lv_color_1_0= ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1435:1: (lv_color_1_0= ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1436:3: lv_color_1_0= ruleSolidColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getBorderStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleBorderStyleDefinition2957);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1452:2: (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1452:4: otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleBorderStyleDefinition2970); 

                        	newLeafNode(otherlv_2, grammarAccess.getBorderStyleDefinitionAccess().getSizeKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1456:1: ( (lv_size_3_0= RULE_INT ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1457:1: (lv_size_3_0= RULE_INT )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1457:1: (lv_size_3_0= RULE_INT )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1458:3: lv_size_3_0= RULE_INT
                    {
                    lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBorderStyleDefinition2987); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1482:1: entryRuleSPExpression returns [EObject current=null] : iv_ruleSPExpression= ruleSPExpression EOF ;
    public final EObject entryRuleSPExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPExpression = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1483:2: (iv_ruleSPExpression= ruleSPExpression EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1484:2: iv_ruleSPExpression= ruleSPExpression EOF
            {
             newCompositeNode(grammarAccess.getSPExpressionRule()); 
            pushFollow(FOLLOW_ruleSPExpression_in_entryRuleSPExpression3030);
            iv_ruleSPExpression=ruleSPExpression();

            state._fsp--;

             current =iv_ruleSPExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPExpression3040); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1491:1: ruleSPExpression returns [EObject current=null] : (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef ) ;
    public final EObject ruleSPExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AcceleoExpression_0 = null;

        EObject this_VarRef_1 = null;

        EObject this_FeatureRef_2 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1494:28: ( (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1495:1: (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1495:1: (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt37=1;
                }
                break;
            case 43:
                {
                alt37=2;
                }
                break;
            case 44:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1496:5: this_AcceleoExpression_0= ruleAcceleoExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAcceleoExpression_in_ruleSPExpression3087);
                    this_AcceleoExpression_0=ruleAcceleoExpression();

                    state._fsp--;

                     
                            current = this_AcceleoExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1506:5: this_VarRef_1= ruleVarRef
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getVarRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVarRef_in_ruleSPExpression3114);
                    this_VarRef_1=ruleVarRef();

                    state._fsp--;

                     
                            current = this_VarRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1516:5: this_FeatureRef_2= ruleFeatureRef
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getFeatureRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFeatureRef_in_ruleSPExpression3141);
                    this_FeatureRef_2=ruleFeatureRef();

                    state._fsp--;

                     
                            current = this_FeatureRef_2; 
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1532:1: entryRuleAcceleoExpression returns [EObject current=null] : iv_ruleAcceleoExpression= ruleAcceleoExpression EOF ;
    public final EObject entryRuleAcceleoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceleoExpression = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1533:2: (iv_ruleAcceleoExpression= ruleAcceleoExpression EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1534:2: iv_ruleAcceleoExpression= ruleAcceleoExpression EOF
            {
             newCompositeNode(grammarAccess.getAcceleoExpressionRule()); 
            pushFollow(FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression3176);
            iv_ruleAcceleoExpression=ruleAcceleoExpression();

            state._fsp--;

             current =iv_ruleAcceleoExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcceleoExpression3186); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1541:1: ruleAcceleoExpression returns [EObject current=null] : (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAcceleoExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1544:28: ( (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1545:1: (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1545:1: (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1545:3: otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleAcceleoExpression3223); 

                	newLeafNode(otherlv_0, grammarAccess.getAcceleoExpressionAccess().getAccKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1549:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1550:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1550:1: (lv_value_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1551:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAcceleoExpression3240); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1575:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1576:2: (iv_ruleVarRef= ruleVarRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1577:2: iv_ruleVarRef= ruleVarRef EOF
            {
             newCompositeNode(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef3281);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;

             current =iv_ruleVarRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef3291); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1584:1: ruleVarRef returns [EObject current=null] : (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1587:28: ( (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1588:1: (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1588:1: (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1588:3: otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleVarRef3328); 

                	newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getVarKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1592:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1593:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1593:1: (lv_value_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1594:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVarRef3345); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1618:1: entryRuleFeatureRef returns [EObject current=null] : iv_ruleFeatureRef= ruleFeatureRef EOF ;
    public final EObject entryRuleFeatureRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1619:2: (iv_ruleFeatureRef= ruleFeatureRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1620:2: iv_ruleFeatureRef= ruleFeatureRef EOF
            {
             newCompositeNode(grammarAccess.getFeatureRefRule()); 
            pushFollow(FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef3386);
            iv_ruleFeatureRef=ruleFeatureRef();

            state._fsp--;

             current =iv_ruleFeatureRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRef3396); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1627:1: ruleFeatureRef returns [EObject current=null] : (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFeatureRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1630:28: ( (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1631:1: (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1631:1: (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1631:3: otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleFeatureRef3433); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureRefAccess().getFeatureKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1635:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1636:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1636:1: (lv_value_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1637:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureRef3450); 

            			newLeafNode(lv_value_1_0, grammarAccess.getFeatureRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRefRule());
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
    // $ANTLR end "ruleFeatureRef"


    // $ANTLR start "entryRuleMetamodelRef"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1661:1: entryRuleMetamodelRef returns [EObject current=null] : iv_ruleMetamodelRef= ruleMetamodelRef EOF ;
    public final EObject entryRuleMetamodelRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1662:2: (iv_ruleMetamodelRef= ruleMetamodelRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1663:2: iv_ruleMetamodelRef= ruleMetamodelRef EOF
            {
             newCompositeNode(grammarAccess.getMetamodelRefRule()); 
            pushFollow(FOLLOW_ruleMetamodelRef_in_entryRuleMetamodelRef3491);
            iv_ruleMetamodelRef=ruleMetamodelRef();

            state._fsp--;

             current =iv_ruleMetamodelRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelRef3501); 

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
    // $ANTLR end "entryRuleMetamodelRef"


    // $ANTLR start "ruleMetamodelRef"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1670:1: ruleMetamodelRef returns [EObject current=null] : (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetamodelRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_metamodel_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1673:28: ( (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1674:1: (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1674:1: (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1674:3: otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleMetamodelRef3538); 

                	newLeafNode(otherlv_0, grammarAccess.getMetamodelRefAccess().getUseKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1678:1: ( (lv_metamodel_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1679:1: (lv_metamodel_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1679:1: (lv_metamodel_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1680:3: lv_metamodel_1_0= RULE_STRING
            {
            lv_metamodel_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetamodelRef3555); 

            			newLeafNode(lv_metamodel_1_0, grammarAccess.getMetamodelRefAccess().getMetamodelSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetamodelRefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"metamodel",
                    		lv_metamodel_1_0, 
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
    // $ANTLR end "ruleMetamodelRef"


    // $ANTLR start "entryRuleColor"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1704:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1705:2: (iv_ruleColor= ruleColor EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1706:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor3596);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor3606); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1713:1: ruleColor returns [EObject current=null] : this_PreDefinedColorDefinition_0= rulePreDefinedColorDefinition ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        EObject this_PreDefinedColorDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1716:28: (this_PreDefinedColorDefinition_0= rulePreDefinedColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1718:5: this_PreDefinedColorDefinition_0= rulePreDefinedColorDefinition
            {
             
                    newCompositeNode(grammarAccess.getColorAccess().getPreDefinedColorDefinitionParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePreDefinedColorDefinition_in_ruleColor3652);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1734:1: entryRulePreDefinedColorDefinition returns [EObject current=null] : iv_rulePreDefinedColorDefinition= rulePreDefinedColorDefinition EOF ;
    public final EObject entryRulePreDefinedColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreDefinedColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1735:2: (iv_rulePreDefinedColorDefinition= rulePreDefinedColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1736:2: iv_rulePreDefinedColorDefinition= rulePreDefinedColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getPreDefinedColorDefinitionRule()); 
            pushFollow(FOLLOW_rulePreDefinedColorDefinition_in_entryRulePreDefinedColorDefinition3686);
            iv_rulePreDefinedColorDefinition=rulePreDefinedColorDefinition();

            state._fsp--;

             current =iv_rulePreDefinedColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreDefinedColorDefinition3696); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1743:1: rulePreDefinedColorDefinition returns [EObject current=null] : ( (lv_color_0_0= rulePreDefinedColor ) ) ;
    public final EObject rulePreDefinedColorDefinition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_color_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1746:28: ( ( (lv_color_0_0= rulePreDefinedColor ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1747:1: ( (lv_color_0_0= rulePreDefinedColor ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1747:1: ( (lv_color_0_0= rulePreDefinedColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1748:1: (lv_color_0_0= rulePreDefinedColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1748:1: (lv_color_0_0= rulePreDefinedColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1749:3: lv_color_0_0= rulePreDefinedColor
            {
             
            	        newCompositeNode(grammarAccess.getPreDefinedColorDefinitionAccess().getColorPreDefinedColorEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePreDefinedColor_in_rulePreDefinedColorDefinition3741);
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


    // $ANTLR start "rulePreDefinedColor"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1773:1: rulePreDefinedColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1775:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1776:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1776:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) )
            int alt38=26;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt38=1;
                }
                break;
            case 47:
                {
                alt38=2;
                }
                break;
            case 48:
                {
                alt38=3;
                }
                break;
            case 49:
                {
                alt38=4;
                }
                break;
            case 50:
                {
                alt38=5;
                }
                break;
            case 51:
                {
                alt38=6;
                }
                break;
            case 52:
                {
                alt38=7;
                }
                break;
            case 53:
                {
                alt38=8;
                }
                break;
            case 54:
                {
                alt38=9;
                }
                break;
            case 55:
                {
                alt38=10;
                }
                break;
            case 56:
                {
                alt38=11;
                }
                break;
            case 57:
                {
                alt38=12;
                }
                break;
            case 58:
                {
                alt38=13;
                }
                break;
            case 59:
                {
                alt38=14;
                }
                break;
            case 60:
                {
                alt38=15;
                }
                break;
            case 61:
                {
                alt38=16;
                }
                break;
            case 62:
                {
                alt38=17;
                }
                break;
            case 63:
                {
                alt38=18;
                }
                break;
            case 64:
                {
                alt38=19;
                }
                break;
            case 65:
                {
                alt38=20;
                }
                break;
            case 66:
                {
                alt38=21;
                }
                break;
            case 67:
                {
                alt38=22;
                }
                break;
            case 68:
                {
                alt38=23;
                }
                break;
            case 69:
                {
                alt38=24;
                }
                break;
            case 70:
                {
                alt38=25;
                }
                break;
            case 71:
                {
                alt38=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1776:2: (enumLiteral_0= 'white' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1776:2: (enumLiteral_0= 'white' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1776:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_rulePreDefinedColor3790); 

                            current = grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1782:6: (enumLiteral_1= 'black' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1782:6: (enumLiteral_1= 'black' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1782:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_rulePreDefinedColor3807); 

                            current = grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1788:6: (enumLiteral_2= 'blue' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1788:6: (enumLiteral_2= 'blue' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1788:8: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_rulePreDefinedColor3824); 

                            current = grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1794:6: (enumLiteral_3= 'light blue' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1794:6: (enumLiteral_3= 'light blue' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1794:8: enumLiteral_3= 'light blue'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_49_in_rulePreDefinedColor3841); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1800:6: (enumLiteral_4= 'dark blue' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1800:6: (enumLiteral_4= 'dark blue' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1800:8: enumLiteral_4= 'dark blue'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_50_in_rulePreDefinedColor3858); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1806:6: (enumLiteral_5= 'chocolate' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1806:6: (enumLiteral_5= 'chocolate' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1806:8: enumLiteral_5= 'chocolate'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_51_in_rulePreDefinedColor3875); 

                            current = grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1812:6: (enumLiteral_6= 'light chocolate' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1812:6: (enumLiteral_6= 'light chocolate' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1812:8: enumLiteral_6= 'light chocolate'
                    {
                    enumLiteral_6=(Token)match(input,52,FOLLOW_52_in_rulePreDefinedColor3892); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1818:6: (enumLiteral_7= 'dark chocolate' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1818:6: (enumLiteral_7= 'dark chocolate' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1818:8: enumLiteral_7= 'dark chocolate'
                    {
                    enumLiteral_7=(Token)match(input,53,FOLLOW_53_in_rulePreDefinedColor3909); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1824:6: (enumLiteral_8= 'gray' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1824:6: (enumLiteral_8= 'gray' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1824:8: enumLiteral_8= 'gray'
                    {
                    enumLiteral_8=(Token)match(input,54,FOLLOW_54_in_rulePreDefinedColor3926); 

                            current = grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1830:6: (enumLiteral_9= 'light gray' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1830:6: (enumLiteral_9= 'light gray' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1830:8: enumLiteral_9= 'light gray'
                    {
                    enumLiteral_9=(Token)match(input,55,FOLLOW_55_in_rulePreDefinedColor3943); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1836:6: (enumLiteral_10= 'dark gray' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1836:6: (enumLiteral_10= 'dark gray' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1836:8: enumLiteral_10= 'dark gray'
                    {
                    enumLiteral_10=(Token)match(input,56,FOLLOW_56_in_rulePreDefinedColor3960); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1842:6: (enumLiteral_11= 'green' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1842:6: (enumLiteral_11= 'green' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1842:8: enumLiteral_11= 'green'
                    {
                    enumLiteral_11=(Token)match(input,57,FOLLOW_57_in_rulePreDefinedColor3977); 

                            current = grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1848:6: (enumLiteral_12= 'light green' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1848:6: (enumLiteral_12= 'light green' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1848:8: enumLiteral_12= 'light green'
                    {
                    enumLiteral_12=(Token)match(input,58,FOLLOW_58_in_rulePreDefinedColor3994); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1854:6: (enumLiteral_13= 'dark green' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1854:6: (enumLiteral_13= 'dark green' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1854:8: enumLiteral_13= 'dark green'
                    {
                    enumLiteral_13=(Token)match(input,59,FOLLOW_59_in_rulePreDefinedColor4011); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1860:6: (enumLiteral_14= 'orange' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1860:6: (enumLiteral_14= 'orange' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1860:8: enumLiteral_14= 'orange'
                    {
                    enumLiteral_14=(Token)match(input,60,FOLLOW_60_in_rulePreDefinedColor4028); 

                            current = grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1866:6: (enumLiteral_15= 'light orange' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1866:6: (enumLiteral_15= 'light orange' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1866:8: enumLiteral_15= 'light orange'
                    {
                    enumLiteral_15=(Token)match(input,61,FOLLOW_61_in_rulePreDefinedColor4045); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1872:6: (enumLiteral_16= 'dark orange' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1872:6: (enumLiteral_16= 'dark orange' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1872:8: enumLiteral_16= 'dark orange'
                    {
                    enumLiteral_16=(Token)match(input,62,FOLLOW_62_in_rulePreDefinedColor4062); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1878:6: (enumLiteral_17= 'purple' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1878:6: (enumLiteral_17= 'purple' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1878:8: enumLiteral_17= 'purple'
                    {
                    enumLiteral_17=(Token)match(input,63,FOLLOW_63_in_rulePreDefinedColor4079); 

                            current = grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1884:6: (enumLiteral_18= 'light purple' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1884:6: (enumLiteral_18= 'light purple' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1884:8: enumLiteral_18= 'light purple'
                    {
                    enumLiteral_18=(Token)match(input,64,FOLLOW_64_in_rulePreDefinedColor4096); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1890:6: (enumLiteral_19= 'dark purple' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1890:6: (enumLiteral_19= 'dark purple' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1890:8: enumLiteral_19= 'dark purple'
                    {
                    enumLiteral_19=(Token)match(input,65,FOLLOW_65_in_rulePreDefinedColor4113); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1896:6: (enumLiteral_20= 'red' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1896:6: (enumLiteral_20= 'red' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1896:8: enumLiteral_20= 'red'
                    {
                    enumLiteral_20=(Token)match(input,66,FOLLOW_66_in_rulePreDefinedColor4130); 

                            current = grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1902:6: (enumLiteral_21= 'light red' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1902:6: (enumLiteral_21= 'light red' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1902:8: enumLiteral_21= 'light red'
                    {
                    enumLiteral_21=(Token)match(input,67,FOLLOW_67_in_rulePreDefinedColor4147); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1908:6: (enumLiteral_22= 'dark red' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1908:6: (enumLiteral_22= 'dark red' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1908:8: enumLiteral_22= 'dark red'
                    {
                    enumLiteral_22=(Token)match(input,68,FOLLOW_68_in_rulePreDefinedColor4164); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1914:6: (enumLiteral_23= 'yellow' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1914:6: (enumLiteral_23= 'yellow' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1914:8: enumLiteral_23= 'yellow'
                    {
                    enumLiteral_23=(Token)match(input,69,FOLLOW_69_in_rulePreDefinedColor4181); 

                            current = grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1920:6: (enumLiteral_24= 'light yellow' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1920:6: (enumLiteral_24= 'light yellow' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1920:8: enumLiteral_24= 'light yellow'
                    {
                    enumLiteral_24=(Token)match(input,70,FOLLOW_70_in_rulePreDefinedColor4198); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1926:6: (enumLiteral_25= 'dark yellow' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1926:6: (enumLiteral_25= 'dark yellow' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1926:8: enumLiteral_25= 'dark yellow'
                    {
                    enumLiteral_25=(Token)match(input,71,FOLLOW_71_in_rulePreDefinedColor4215); 

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
    public static final BitSet FOLLOW_12_in_ruleSPrototyper156 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_13_in_ruleSPrototyper169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPrototyper186 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleSPViewpoint_in_ruleSPrototyper214 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleSPrototyper227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPViewpoint_in_entryRuleSPViewpoint263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPViewpoint273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSPViewpoint310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPViewpoint327 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSPViewpoint344 = new BitSet(new long[]{0x0000000010074000L});
    public static final BitSet FOLLOW_16_in_ruleSPViewpoint357 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPViewpoint374 = new BitSet(new long[]{0x0000000010064000L});
    public static final BitSet FOLLOW_17_in_ruleSPViewpoint394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPViewpoint411 = new BitSet(new long[]{0x0000000010044000L});
    public static final BitSet FOLLOW_ruleSPRepresentation_in_ruleSPViewpoint439 = new BitSet(new long[]{0x0000000010044000L});
    public static final BitSet FOLLOW_14_in_ruleSPViewpoint452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPRepresentation_in_entryRuleSPRepresentation488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPRepresentation498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPTable_in_ruleSPRepresentation545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPDiagram_in_ruleSPRepresentation572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPTable_in_entryRuleSPTable607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPTable617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSPTable654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPTable671 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSPTable688 = new BitSet(new long[]{0x0000200000180000L});
    public static final BitSet FOLLOW_19_in_ruleSPTable701 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPTable718 = new BitSet(new long[]{0x0000200000180000L});
    public static final BitSet FOLLOW_20_in_ruleSPTable738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPTable755 = new BitSet(new long[]{0x0000200000180000L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_ruleSPTable783 = new BitSet(new long[]{0x0000200000380000L});
    public static final BitSet FOLLOW_21_in_ruleSPTable796 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPTable813 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_ruleTableElement_in_ruleSPTable839 = new BitSet(new long[]{0x0000000005C00000L});
    public static final BitSet FOLLOW_ruleTableProperty_in_ruleSPTable861 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_14_in_ruleSPTable874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_entryRuleTableElement910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableElement920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTableElement963 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleTableElement995 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTableElement1021 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableElement1038 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTableElement1055 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleTableElement1076 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleTableElement1089 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_ruleTableElement_in_ruleTableElement1110 = new BitSet(new long[]{0x0000000001C04000L});
    public static final BitSet FOLLOW_14_in_ruleTableElement1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableProperty_in_entryRuleTableProperty1161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableProperty1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTableProperty1208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableProperty1225 = new BitSet(new long[]{0x0000000008080002L});
    public static final BitSet FOLLOW_19_in_ruleTableProperty1243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTableProperty1260 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleTableProperty1280 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleTableProperty1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPDiagram_in_entryRuleSPDiagram1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPDiagram1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSPDiagram1386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPDiagram1403 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSPDiagram1420 = new BitSet(new long[]{0x0000200000180000L});
    public static final BitSet FOLLOW_19_in_ruleSPDiagram1433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1450 = new BitSet(new long[]{0x0000200000180000L});
    public static final BitSet FOLLOW_20_in_ruleSPDiagram1470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1487 = new BitSet(new long[]{0x0000200000180000L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_ruleSPDiagram1515 = new BitSet(new long[]{0x0000200000380000L});
    public static final BitSet FOLLOW_21_in_ruleSPDiagram1528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1545 = new BitSet(new long[]{0x0000000620C00000L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_ruleSPDiagram1571 = new BitSet(new long[]{0x0000000620C04000L});
    public static final BitSet FOLLOW_14_in_ruleSPDiagram1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramElement1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleDiagramElement1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer1710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleContainer1763 = new BitSet(new long[]{0x0000000620800000L});
    public static final BitSet FOLLOW_23_in_ruleContainer1795 = new BitSet(new long[]{0x0000000620000000L});
    public static final BitSet FOLLOW_ruleContainerType_in_ruleContainer1830 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleContainer1843 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer1860 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleContainer1877 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleContainer1898 = new BitSet(new long[]{0x0000000040001002L});
    public static final BitSet FOLLOW_ruleContainerStyleDefinition_in_ruleContainer1919 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleContainer1933 = new BitSet(new long[]{0x0000000620C00000L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_ruleContainer1954 = new BitSet(new long[]{0x0000000620C04000L});
    public static final BitSet FOLLOW_14_in_ruleContainer1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerStyleDefinition_in_entryRuleContainerStyleDefinition2005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerStyleDefinition2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleContainerStyleDefinition2052 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_ruleContainerStyleDefinition2073 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleContainerStyleDefinition2086 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_ruleContainerStyleDefinition2107 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleContainerStyleDefinition2122 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_ruleContainerStyleDefinition2143 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleContainerStyleDefinition2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerType_in_entryRuleContainerType2194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerType2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleContainerType2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleContainerType2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_entryRuleSolidColorDefinition2302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolidColorDefinition2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSolidColorDefinition2349 = new BitSet(new long[]{0xFFFFC00000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleColor_in_ruleSolidColorDefinition2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_entryRuleContainerColorDefinition2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerColorDefinition2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleContainerColorDefinition2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_ruleContainerColorDefinition2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_entryRuleGradientColorDefinition2525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGradientColorDefinition2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleGradientColorDefinition2572 = new BitSet(new long[]{0xFFFFC00000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleColor_in_ruleGradientColorDefinition2593 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleGradientColorDefinition2605 = new BitSet(new long[]{0xFFFFC00000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleColor_in_ruleGradientColorDefinition2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_entryRuleLabelStyleDefinition2662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelStyleDefinition2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleLabelStyleDefinition2709 = new BitSet(new long[]{0x00001C0800000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleLabelStyleDefinition2730 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleLabelStyleDefinition2752 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_ruleLabelStyleDefinition2765 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLabelStyleDefinition2782 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleLabelStyleDefinition2807 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleLabelStyleDefinition2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_entryRuleBorderStyleDefinition2889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderStyleDefinition2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBorderStyleDefinition2936 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleBorderStyleDefinition2957 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleBorderStyleDefinition2970 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBorderStyleDefinition2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_entryRuleSPExpression3030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPExpression3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_ruleSPExpression3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_ruleSPExpression3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_ruleSPExpression3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression3176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcceleoExpression3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAcceleoExpression3223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAcceleoExpression3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef3281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVarRef3328 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVarRef3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef3386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRef3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleFeatureRef3433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureRef3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_entryRuleMetamodelRef3491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelRef3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMetamodelRef3538 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetamodelRef3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor3596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColorDefinition_in_ruleColor3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColorDefinition_in_entryRulePreDefinedColorDefinition3686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreDefinedColorDefinition3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColor_in_rulePreDefinedColorDefinition3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePreDefinedColor3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePreDefinedColor3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePreDefinedColor3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePreDefinedColor3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePreDefinedColor3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePreDefinedColor3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePreDefinedColor3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePreDefinedColor3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePreDefinedColor3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePreDefinedColor3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePreDefinedColor3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePreDefinedColor3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePreDefinedColor3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePreDefinedColor4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePreDefinedColor4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePreDefinedColor4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePreDefinedColor4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePreDefinedColor4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePreDefinedColor4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePreDefinedColor4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePreDefinedColor4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePreDefinedColor4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePreDefinedColor4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePreDefinedColor4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePreDefinedColor4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePreDefinedColor4215 = new BitSet(new long[]{0x0000000000000002L});

}