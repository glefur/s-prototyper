package fr.obeo.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'proto'", "'{'", "'qualifier'", "'}'", "'viewpoint'", "'shortcut'", "'ext'", "'table'", "'label'", "'title'", "'root'", "'creatable'", "'recursive'", "'element'", "'accessibleThrough'", "'property'", "'expression'", "'diagram'", "'container'", "'style {'", "'freeform'", "'list'", "'color'", "'gradient from'", "'to'", "'size'", "'bold'", "'italic'", "'border '", "'acc:'", "'var:'", "'feature:'", "'use'", "'white'", "'black'", "'blue'", "'light blue'", "'dark blue'", "'chocolate'", "'light chocolate'", "'dark chocolate'", "'gray'", "'light gray'", "'dark gray'", "'green'", "'light green'", "'dark green'", "'orange'", "'light orange'", "'dark orange'", "'purple'", "'light purple'", "'dark purple'", "'red'", "'light red'", "'dark red'", "'yellow'", "'light yellow'", "'dark yellow'"
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
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:67:1: entryRuleSPrototyper returns [EObject current=null] : iv_ruleSPrototyper= ruleSPrototyper EOF ;
    public final EObject entryRuleSPrototyper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPrototyper = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:68:2: (iv_ruleSPrototyper= ruleSPrototyper EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:69:2: iv_ruleSPrototyper= ruleSPrototyper EOF
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:76:1: ruleSPrototyper returns [EObject current=null] : (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? ( (lv_viewpoints_5_0= ruleSPViewpoint ) )* otherlv_6= '}' ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:79:28: ( (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? ( (lv_viewpoints_5_0= ruleSPViewpoint ) )* otherlv_6= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:80:1: (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? ( (lv_viewpoints_5_0= ruleSPViewpoint ) )* otherlv_6= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:80:1: (otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? ( (lv_viewpoints_5_0= ruleSPViewpoint ) )* otherlv_6= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:80:3: otherlv_0= 'proto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )? ( (lv_viewpoints_5_0= ruleSPViewpoint ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSPrototyper122); 

                	newLeafNode(otherlv_0, grammarAccess.getSPrototyperAccess().getProtoKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:85:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:86:3: lv_name_1_0= RULE_ID
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
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:106:1: (otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:106:3: otherlv_3= 'qualifier' ( (lv_qualifier_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSPrototyper169); 

                        	newLeafNode(otherlv_3, grammarAccess.getSPrototyperAccess().getQualifierKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:110:1: ( (lv_qualifier_4_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:111:1: (lv_qualifier_4_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:111:1: (lv_qualifier_4_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:112:3: lv_qualifier_4_0= RULE_STRING
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:128:4: ( (lv_viewpoints_5_0= ruleSPViewpoint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:129:1: (lv_viewpoints_5_0= ruleSPViewpoint )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:129:1: (lv_viewpoints_5_0= ruleSPViewpoint )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:130:3: lv_viewpoints_5_0= ruleSPViewpoint
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:158:1: entryRuleSPViewpoint returns [EObject current=null] : iv_ruleSPViewpoint= ruleSPViewpoint EOF ;
    public final EObject entryRuleSPViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPViewpoint = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:159:2: (iv_ruleSPViewpoint= ruleSPViewpoint EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:160:2: iv_ruleSPViewpoint= ruleSPViewpoint EOF
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:167:1: ruleSPViewpoint returns [EObject current=null] : (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_representations_7_0= ruleSPRepresentation ) )* otherlv_8= '}' ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:170:28: ( (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_representations_7_0= ruleSPRepresentation ) )* otherlv_8= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:171:1: (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_representations_7_0= ruleSPRepresentation ) )* otherlv_8= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:171:1: (otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_representations_7_0= ruleSPRepresentation ) )* otherlv_8= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:171:3: otherlv_0= 'viewpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )? (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )? ( (lv_representations_7_0= ruleSPRepresentation ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSPViewpoint310); 

                	newLeafNode(otherlv_0, grammarAccess.getSPViewpointAccess().getViewpointKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:175:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:176:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:176:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:177:3: lv_name_1_0= RULE_ID
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
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:197:1: (otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:197:3: otherlv_3= 'shortcut' ( (lv_shortcut_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSPViewpoint357); 

                        	newLeafNode(otherlv_3, grammarAccess.getSPViewpointAccess().getShortcutKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:201:1: ( (lv_shortcut_4_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:202:1: (lv_shortcut_4_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:202:1: (lv_shortcut_4_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:203:3: lv_shortcut_4_0= RULE_STRING
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:219:4: (otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:219:6: otherlv_5= 'ext' ( (lv_extension_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSPViewpoint394); 

                        	newLeafNode(otherlv_5, grammarAccess.getSPViewpointAccess().getExtKeyword_4_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:223:1: ( (lv_extension_6_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:224:1: (lv_extension_6_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:224:1: (lv_extension_6_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:225:3: lv_extension_6_0= RULE_STRING
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:241:4: ( (lv_representations_7_0= ruleSPRepresentation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18||LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:242:1: (lv_representations_7_0= ruleSPRepresentation )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:242:1: (lv_representations_7_0= ruleSPRepresentation )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:243:3: lv_representations_7_0= ruleSPRepresentation
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:271:1: entryRuleSPRepresentation returns [EObject current=null] : iv_ruleSPRepresentation= ruleSPRepresentation EOF ;
    public final EObject entryRuleSPRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPRepresentation = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:272:2: (iv_ruleSPRepresentation= ruleSPRepresentation EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:273:2: iv_ruleSPRepresentation= ruleSPRepresentation EOF
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:280:1: ruleSPRepresentation returns [EObject current=null] : (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram ) ;
    public final EObject ruleSPRepresentation() throws RecognitionException {
        EObject current = null;

        EObject this_SPTable_0 = null;

        EObject this_SPDiagram_1 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:283:28: ( (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:284:1: (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:284:1: (this_SPTable_0= ruleSPTable | this_SPDiagram_1= ruleSPDiagram )
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
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:285:5: this_SPTable_0= ruleSPTable
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
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:295:5: this_SPDiagram_1= ruleSPDiagram
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:311:1: entryRuleSPTable returns [EObject current=null] : iv_ruleSPTable= ruleSPTable EOF ;
    public final EObject entryRuleSPTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPTable = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:312:2: (iv_ruleSPTable= ruleSPTable EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:313:2: iv_ruleSPTable= ruleSPTable EOF
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:320:1: ruleSPTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:323:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:324:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:324:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:324:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSPTable654); 

                	newLeafNode(otherlv_0, grammarAccess.getSPTableAccess().getTableKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:328:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:329:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:329:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:330:3: lv_name_1_0= RULE_ID
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
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:350:1: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:350:3: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSPTable701); 

                        	newLeafNode(otherlv_3, grammarAccess.getSPTableAccess().getLabelKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:354:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:355:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:355:1: (lv_label_4_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:356:3: lv_label_4_0= RULE_STRING
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:372:4: (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:372:6: otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSPTable738); 

                        	newLeafNode(otherlv_5, grammarAccess.getSPTableAccess().getTitleKeyword_4_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:376:1: ( (lv_title_6_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:377:1: (lv_title_6_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:377:1: (lv_title_6_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:378:3: lv_title_6_0= RULE_STRING
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:394:4: ( (lv_metamodels_7_0= ruleMetamodelRef ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==43) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:395:1: (lv_metamodels_7_0= ruleMetamodelRef )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:395:1: (lv_metamodels_7_0= ruleMetamodelRef )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:396:3: lv_metamodels_7_0= ruleMetamodelRef
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
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:416:1: ( (lv_root_9_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:417:1: (lv_root_9_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:417:1: (lv_root_9_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:418:3: lv_root_9_0= RULE_STRING
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:434:2: ( (lv_elements_10_0= ruleTableElement ) )+
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
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:435:1: (lv_elements_10_0= ruleTableElement )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:435:1: (lv_elements_10_0= ruleTableElement )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:436:3: lv_elements_10_0= ruleTableElement
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:452:3: ( (lv_properties_11_0= ruleTableProperty ) )+
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
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:453:1: (lv_properties_11_0= ruleTableProperty )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:453:1: (lv_properties_11_0= ruleTableProperty )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:454:3: lv_properties_11_0= ruleTableProperty
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:482:1: entryRuleTableElement returns [EObject current=null] : iv_ruleTableElement= ruleTableElement EOF ;
    public final EObject entryRuleTableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableElement = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:483:2: (iv_ruleTableElement= ruleTableElement EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:484:2: iv_ruleTableElement= ruleTableElement EOF
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:491:1: ruleTableElement returns [EObject current=null] : ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? otherlv_2= 'element' ( (lv_eClass_3_0= RULE_STRING ) ) otherlv_4= 'accessibleThrough' ( (lv_expression_5_0= ruleSPExpression ) ) (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )? ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:494:28: ( ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? otherlv_2= 'element' ( (lv_eClass_3_0= RULE_STRING ) ) otherlv_4= 'accessibleThrough' ( (lv_expression_5_0= ruleSPExpression ) ) (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:495:1: ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? otherlv_2= 'element' ( (lv_eClass_3_0= RULE_STRING ) ) otherlv_4= 'accessibleThrough' ( (lv_expression_5_0= ruleSPExpression ) ) (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:495:1: ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? otherlv_2= 'element' ( (lv_eClass_3_0= RULE_STRING ) ) otherlv_4= 'accessibleThrough' ( (lv_expression_5_0= ruleSPExpression ) ) (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:495:2: ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? otherlv_2= 'element' ( (lv_eClass_3_0= RULE_STRING ) ) otherlv_4= 'accessibleThrough' ( (lv_expression_5_0= ruleSPExpression ) ) (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )?
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:495:2: ( (lv_creatable_0_0= 'creatable' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:496:1: (lv_creatable_0_0= 'creatable' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:496:1: (lv_creatable_0_0= 'creatable' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:497:3: lv_creatable_0_0= 'creatable'
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:510:3: ( (lv_recursive_1_0= 'recursive' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:511:1: (lv_recursive_1_0= 'recursive' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:511:1: (lv_recursive_1_0= 'recursive' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:512:3: lv_recursive_1_0= 'recursive'
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
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:529:1: ( (lv_eClass_3_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:530:1: (lv_eClass_3_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:530:1: (lv_eClass_3_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:531:3: lv_eClass_3_0= RULE_STRING
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
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:551:1: ( (lv_expression_5_0= ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:552:1: (lv_expression_5_0= ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:552:1: (lv_expression_5_0= ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:553:3: lv_expression_5_0= ruleSPExpression
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:569:2: (otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:569:4: otherlv_6= '{' ( (lv_subElements_7_0= ruleTableElement ) )+ otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleTableElement1089); 

                        	newLeafNode(otherlv_6, grammarAccess.getTableElementAccess().getLeftCurlyBracketKeyword_6_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:573:1: ( (lv_subElements_7_0= ruleTableElement ) )+
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
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:574:1: (lv_subElements_7_0= ruleTableElement )
                    	    {
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:574:1: (lv_subElements_7_0= ruleTableElement )
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:575:3: lv_subElements_7_0= ruleTableElement
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:603:1: entryRuleTableProperty returns [EObject current=null] : iv_ruleTableProperty= ruleTableProperty EOF ;
    public final EObject entryRuleTableProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableProperty = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:604:2: (iv_ruleTableProperty= ruleTableProperty EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:605:2: iv_ruleTableProperty= ruleTableProperty EOF
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:612:1: ruleTableProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:615:28: ( (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:616:1: (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:616:1: (otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:616:3: otherlv_0= 'property' ( (lv_feature_1_0= RULE_STRING ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTableProperty1208); 

                	newLeafNode(otherlv_0, grammarAccess.getTablePropertyAccess().getPropertyKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:620:1: ( (lv_feature_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:621:1: (lv_feature_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:621:1: (lv_feature_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:622:3: lv_feature_1_0= RULE_STRING
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:638:2: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:638:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTableProperty1243); 

                        	newLeafNode(otherlv_2, grammarAccess.getTablePropertyAccess().getLabelKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:642:1: ( (lv_label_3_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:643:1: (lv_label_3_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:643:1: (lv_label_3_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:644:3: lv_label_3_0= RULE_STRING
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:660:4: (otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:660:6: otherlv_4= 'expression' ( (lv_expression_5_0= ruleSPExpression ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleTableProperty1280); 

                        	newLeafNode(otherlv_4, grammarAccess.getTablePropertyAccess().getExpressionKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:664:1: ( (lv_expression_5_0= ruleSPExpression ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:665:1: (lv_expression_5_0= ruleSPExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:665:1: (lv_expression_5_0= ruleSPExpression )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:666:3: lv_expression_5_0= ruleSPExpression
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:690:1: entryRuleSPDiagram returns [EObject current=null] : iv_ruleSPDiagram= ruleSPDiagram EOF ;
    public final EObject entryRuleSPDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPDiagram = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:691:2: (iv_ruleSPDiagram= ruleSPDiagram EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:692:2: iv_ruleSPDiagram= ruleSPDiagram EOF
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:699:1: ruleSPDiagram returns [EObject current=null] : (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:702:28: ( (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:703:1: (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:703:1: (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:703:3: otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_metamodels_7_0= ruleMetamodelRef ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleDiagramElement ) )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleSPDiagram1386); 

                	newLeafNode(otherlv_0, grammarAccess.getSPDiagramAccess().getDiagramKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:707:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:708:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:708:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:709:3: lv_name_1_0= RULE_ID
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
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:729:1: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:729:3: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSPDiagram1433); 

                        	newLeafNode(otherlv_3, grammarAccess.getSPDiagramAccess().getLabelKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:733:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:734:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:734:1: (lv_label_4_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:735:3: lv_label_4_0= RULE_STRING
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:751:4: (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:751:6: otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSPDiagram1470); 

                        	newLeafNode(otherlv_5, grammarAccess.getSPDiagramAccess().getTitleKeyword_4_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:755:1: ( (lv_title_6_0= RULE_STRING ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:756:1: (lv_title_6_0= RULE_STRING )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:756:1: (lv_title_6_0= RULE_STRING )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:757:3: lv_title_6_0= RULE_STRING
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:773:4: ( (lv_metamodels_7_0= ruleMetamodelRef ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==43) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:774:1: (lv_metamodels_7_0= ruleMetamodelRef )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:774:1: (lv_metamodels_7_0= ruleMetamodelRef )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:775:3: lv_metamodels_7_0= ruleMetamodelRef
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
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:795:1: ( (lv_root_9_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:796:1: (lv_root_9_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:796:1: (lv_root_9_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:797:3: lv_root_9_0= RULE_STRING
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:813:2: ( (lv_elements_10_0= ruleDiagramElement ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29||(LA21_0>=31 && LA21_0<=32)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:814:1: (lv_elements_10_0= ruleDiagramElement )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:814:1: (lv_elements_10_0= ruleDiagramElement )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:815:3: lv_elements_10_0= ruleDiagramElement
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:843:1: entryRuleDiagramElement returns [EObject current=null] : iv_ruleDiagramElement= ruleDiagramElement EOF ;
    public final EObject entryRuleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramElement = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:844:2: (iv_ruleDiagramElement= ruleDiagramElement EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:845:2: iv_ruleDiagramElement= ruleDiagramElement EOF
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:852:1: ruleDiagramElement returns [EObject current=null] : this_Container_0= ruleContainer ;
    public final EObject ruleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:855:28: (this_Container_0= ruleContainer )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:857:5: this_Container_0= ruleContainer
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:873:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:874:2: (iv_ruleContainer= ruleContainer EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:875:2: iv_ruleContainer= ruleContainer EOF
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:882:1: ruleContainer returns [EObject current=null] : ( ( (lv_containerType_0_0= ruleContainerType ) )? otherlv_1= 'container' ( (lv_eClass_2_0= RULE_STRING ) ) otherlv_3= 'accessibleThrough' ( (lv_expression_4_0= ruleSPExpression ) ) otherlv_5= 'style {' ( (lv_color_6_0= ruleContainerColorDefinition ) ) ( (lv_label_7_0= ruleLabelStyleDefinition ) )? ( (lv_border_8_0= ruleBorderStyleDefinition ) )? otherlv_9= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_eClass_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_containerType_0_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_color_6_0 = null;

        EObject lv_label_7_0 = null;

        EObject lv_border_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:885:28: ( ( ( (lv_containerType_0_0= ruleContainerType ) )? otherlv_1= 'container' ( (lv_eClass_2_0= RULE_STRING ) ) otherlv_3= 'accessibleThrough' ( (lv_expression_4_0= ruleSPExpression ) ) otherlv_5= 'style {' ( (lv_color_6_0= ruleContainerColorDefinition ) ) ( (lv_label_7_0= ruleLabelStyleDefinition ) )? ( (lv_border_8_0= ruleBorderStyleDefinition ) )? otherlv_9= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:886:1: ( ( (lv_containerType_0_0= ruleContainerType ) )? otherlv_1= 'container' ( (lv_eClass_2_0= RULE_STRING ) ) otherlv_3= 'accessibleThrough' ( (lv_expression_4_0= ruleSPExpression ) ) otherlv_5= 'style {' ( (lv_color_6_0= ruleContainerColorDefinition ) ) ( (lv_label_7_0= ruleLabelStyleDefinition ) )? ( (lv_border_8_0= ruleBorderStyleDefinition ) )? otherlv_9= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:886:1: ( ( (lv_containerType_0_0= ruleContainerType ) )? otherlv_1= 'container' ( (lv_eClass_2_0= RULE_STRING ) ) otherlv_3= 'accessibleThrough' ( (lv_expression_4_0= ruleSPExpression ) ) otherlv_5= 'style {' ( (lv_color_6_0= ruleContainerColorDefinition ) ) ( (lv_label_7_0= ruleLabelStyleDefinition ) )? ( (lv_border_8_0= ruleBorderStyleDefinition ) )? otherlv_9= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:886:2: ( (lv_containerType_0_0= ruleContainerType ) )? otherlv_1= 'container' ( (lv_eClass_2_0= RULE_STRING ) ) otherlv_3= 'accessibleThrough' ( (lv_expression_4_0= ruleSPExpression ) ) otherlv_5= 'style {' ( (lv_color_6_0= ruleContainerColorDefinition ) ) ( (lv_label_7_0= ruleLabelStyleDefinition ) )? ( (lv_border_8_0= ruleBorderStyleDefinition ) )? otherlv_9= '}'
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:886:2: ( (lv_containerType_0_0= ruleContainerType ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=31 && LA22_0<=32)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:887:1: (lv_containerType_0_0= ruleContainerType )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:887:1: (lv_containerType_0_0= ruleContainerType )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:888:3: lv_containerType_0_0= ruleContainerType
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getContainerTypeContainerTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContainerType_in_ruleContainer1766);
                    lv_containerType_0_0=ruleContainerType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"containerType",
                            		lv_containerType_0_0, 
                            		"ContainerType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleContainer1779); 

                	newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:908:1: ( (lv_eClass_2_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:909:1: (lv_eClass_2_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:909:1: (lv_eClass_2_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:910:3: lv_eClass_2_0= RULE_STRING
            {
            lv_eClass_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer1796); 

            			newLeafNode(lv_eClass_2_0, grammarAccess.getContainerAccess().getEClassSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eClass",
                    		lv_eClass_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleContainer1813); 

                	newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getAccessibleThroughKeyword_3());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:930:1: ( (lv_expression_4_0= ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:931:1: (lv_expression_4_0= ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:931:1: (lv_expression_4_0= ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:932:3: lv_expression_4_0= ruleSPExpression
            {
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getExpressionSPExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSPExpression_in_ruleContainer1834);
            lv_expression_4_0=ruleSPExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"SPExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleContainer1846); 

                	newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getStyleKeyword_5());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:952:1: ( (lv_color_6_0= ruleContainerColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:953:1: (lv_color_6_0= ruleContainerColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:953:1: (lv_color_6_0= ruleContainerColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:954:3: lv_color_6_0= ruleContainerColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getColorContainerColorDefinitionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_ruleContainer1867);
            lv_color_6_0=ruleContainerColorDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_6_0, 
                    		"ContainerColorDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:970:2: ( (lv_label_7_0= ruleLabelStyleDefinition ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:971:1: (lv_label_7_0= ruleLabelStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:971:1: (lv_label_7_0= ruleLabelStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:972:3: lv_label_7_0= ruleLabelStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getLabelLabelStyleDefinitionParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelStyleDefinition_in_ruleContainer1888);
                    lv_label_7_0=ruleLabelStyleDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_7_0, 
                            		"LabelStyleDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:988:3: ( (lv_border_8_0= ruleBorderStyleDefinition ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:989:1: (lv_border_8_0= ruleBorderStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:989:1: (lv_border_8_0= ruleBorderStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:990:3: lv_border_8_0= ruleBorderStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getBorderBorderStyleDefinitionParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBorderStyleDefinition_in_ruleContainer1910);
                    lv_border_8_0=ruleBorderStyleDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"border",
                            		lv_border_8_0, 
                            		"BorderStyleDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleContainer1923); 

                	newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_9());
                

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


    // $ANTLR start "entryRuleContainerType"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1018:1: entryRuleContainerType returns [String current=null] : iv_ruleContainerType= ruleContainerType EOF ;
    public final String entryRuleContainerType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContainerType = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1019:2: (iv_ruleContainerType= ruleContainerType EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1020:2: iv_ruleContainerType= ruleContainerType EOF
            {
             newCompositeNode(grammarAccess.getContainerTypeRule()); 
            pushFollow(FOLLOW_ruleContainerType_in_entryRuleContainerType1960);
            iv_ruleContainerType=ruleContainerType();

            state._fsp--;

             current =iv_ruleContainerType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerType1971); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1027:1: ruleContainerType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'freeform' | kw= 'list' ) ;
    public final AntlrDatatypeRuleToken ruleContainerType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1030:28: ( (kw= 'freeform' | kw= 'list' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1031:1: (kw= 'freeform' | kw= 'list' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1031:1: (kw= 'freeform' | kw= 'list' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            else if ( (LA25_0==32) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1032:2: kw= 'freeform'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleContainerType2009); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getContainerTypeAccess().getFreeformKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1039:2: kw= 'list'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleContainerType2028); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1052:1: entryRuleSolidColorDefinition returns [EObject current=null] : iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF ;
    public final EObject entryRuleSolidColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolidColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1053:2: (iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1054:2: iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getSolidColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_entryRuleSolidColorDefinition2068);
            iv_ruleSolidColorDefinition=ruleSolidColorDefinition();

            state._fsp--;

             current =iv_ruleSolidColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolidColorDefinition2078); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1061:1: ruleSolidColorDefinition returns [EObject current=null] : (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) ) ;
    public final EObject ruleSolidColorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_color_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1064:28: ( (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1065:1: (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1065:1: (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1065:3: otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleSolidColorDefinition2115); 

                	newLeafNode(otherlv_0, grammarAccess.getSolidColorDefinitionAccess().getColorKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1069:1: ( (lv_color_1_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1070:1: (lv_color_1_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1070:1: (lv_color_1_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1071:3: lv_color_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getSolidColorDefinitionAccess().getColorColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleSolidColorDefinition2136);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1095:1: entryRuleContainerColorDefinition returns [EObject current=null] : iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF ;
    public final EObject entryRuleContainerColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1096:2: (iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1097:2: iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getContainerColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_entryRuleContainerColorDefinition2172);
            iv_ruleContainerColorDefinition=ruleContainerColorDefinition();

            state._fsp--;

             current =iv_ruleContainerColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerColorDefinition2182); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1104:1: ruleContainerColorDefinition returns [EObject current=null] : (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition ) ;
    public final EObject ruleContainerColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_SolidColorDefinition_0 = null;

        EObject this_GradientColorDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1107:28: ( (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1108:1: (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1108:1: (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            else if ( (LA26_0==34) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1109:5: this_SolidColorDefinition_0= ruleSolidColorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getContainerColorDefinitionAccess().getSolidColorDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleContainerColorDefinition2229);
                    this_SolidColorDefinition_0=ruleSolidColorDefinition();

                    state._fsp--;

                     
                            current = this_SolidColorDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1119:5: this_GradientColorDefinition_1= ruleGradientColorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getContainerColorDefinitionAccess().getGradientColorDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGradientColorDefinition_in_ruleContainerColorDefinition2256);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1135:1: entryRuleGradientColorDefinition returns [EObject current=null] : iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF ;
    public final EObject entryRuleGradientColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradientColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1136:2: (iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1137:2: iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getGradientColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleGradientColorDefinition_in_entryRuleGradientColorDefinition2291);
            iv_ruleGradientColorDefinition=ruleGradientColorDefinition();

            state._fsp--;

             current =iv_ruleGradientColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGradientColorDefinition2301); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1144:1: ruleGradientColorDefinition returns [EObject current=null] : (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) ) ;
    public final EObject ruleGradientColorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_from_1_0 = null;

        AntlrDatatypeRuleToken lv_to_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1147:28: ( (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1148:1: (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1148:1: (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1148:3: otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleGradientColorDefinition2338); 

                	newLeafNode(otherlv_0, grammarAccess.getGradientColorDefinitionAccess().getGradientFromKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1152:1: ( (lv_from_1_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1153:1: (lv_from_1_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1153:1: (lv_from_1_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1154:3: lv_from_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getGradientColorDefinitionAccess().getFromColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleGradientColorDefinition2359);
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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleGradientColorDefinition2371); 

                	newLeafNode(otherlv_2, grammarAccess.getGradientColorDefinitionAccess().getToKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1174:1: ( (lv_to_3_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1175:1: (lv_to_3_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1175:1: (lv_to_3_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1176:3: lv_to_3_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getGradientColorDefinitionAccess().getToColorParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleGradientColorDefinition2392);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1200:1: entryRuleLabelStyleDefinition returns [EObject current=null] : iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF ;
    public final EObject entryRuleLabelStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1201:2: (iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1202:2: iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelStyleDefinition_in_entryRuleLabelStyleDefinition2428);
            iv_ruleLabelStyleDefinition=ruleLabelStyleDefinition();

            state._fsp--;

             current =iv_ruleLabelStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelStyleDefinition2438); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1209:1: ruleLabelStyleDefinition returns [EObject current=null] : (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1212:28: ( (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1213:1: (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1213:1: (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1213:3: otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleLabelStyleDefinition2475); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelStyleDefinitionAccess().getLabelKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1217:1: ( (lv_expression_1_0= ruleSPExpression ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=40 && LA27_0<=42)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1218:1: (lv_expression_1_0= ruleSPExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1218:1: (lv_expression_1_0= ruleSPExpression )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1219:3: lv_expression_1_0= ruleSPExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelStyleDefinitionAccess().getExpressionSPExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSPExpression_in_ruleLabelStyleDefinition2496);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1235:3: ( (lv_color_2_0= ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1236:1: (lv_color_2_0= ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1236:1: (lv_color_2_0= ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1237:3: lv_color_2_0= ruleSolidColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getLabelStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleLabelStyleDefinition2518);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1253:2: (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1253:4: otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleLabelStyleDefinition2531); 

                        	newLeafNode(otherlv_3, grammarAccess.getLabelStyleDefinitionAccess().getSizeKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1257:1: ( (lv_size_4_0= RULE_INT ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1258:1: (lv_size_4_0= RULE_INT )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1258:1: (lv_size_4_0= RULE_INT )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1259:3: lv_size_4_0= RULE_INT
                    {
                    lv_size_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLabelStyleDefinition2548); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1275:4: ( (lv_bold_5_0= 'bold' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1276:1: (lv_bold_5_0= 'bold' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1276:1: (lv_bold_5_0= 'bold' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1277:3: lv_bold_5_0= 'bold'
                    {
                    lv_bold_5_0=(Token)match(input,37,FOLLOW_37_in_ruleLabelStyleDefinition2573); 

                            newLeafNode(lv_bold_5_0, grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelStyleDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "bold", true, "bold");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1290:3: ( (lv_italic_6_0= 'italic' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1291:1: (lv_italic_6_0= 'italic' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1291:1: (lv_italic_6_0= 'italic' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1292:3: lv_italic_6_0= 'italic'
                    {
                    lv_italic_6_0=(Token)match(input,38,FOLLOW_38_in_ruleLabelStyleDefinition2605); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1313:1: entryRuleBorderStyleDefinition returns [EObject current=null] : iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF ;
    public final EObject entryRuleBorderStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorderStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1314:2: (iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1315:2: iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getBorderStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleBorderStyleDefinition_in_entryRuleBorderStyleDefinition2655);
            iv_ruleBorderStyleDefinition=ruleBorderStyleDefinition();

            state._fsp--;

             current =iv_ruleBorderStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderStyleDefinition2665); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1322:1: ruleBorderStyleDefinition returns [EObject current=null] : (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleBorderStyleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        EObject lv_color_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1325:28: ( (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1326:1: (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1326:1: (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1326:3: otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleBorderStyleDefinition2702); 

                	newLeafNode(otherlv_0, grammarAccess.getBorderStyleDefinitionAccess().getBorderKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1330:1: ( (lv_color_1_0= ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1331:1: (lv_color_1_0= ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1331:1: (lv_color_1_0= ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1332:3: lv_color_1_0= ruleSolidColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getBorderStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleBorderStyleDefinition2723);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1348:2: (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1348:4: otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleBorderStyleDefinition2736); 

                        	newLeafNode(otherlv_2, grammarAccess.getBorderStyleDefinitionAccess().getSizeKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1352:1: ( (lv_size_3_0= RULE_INT ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1353:1: (lv_size_3_0= RULE_INT )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1353:1: (lv_size_3_0= RULE_INT )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1354:3: lv_size_3_0= RULE_INT
                    {
                    lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBorderStyleDefinition2753); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1378:1: entryRuleSPExpression returns [EObject current=null] : iv_ruleSPExpression= ruleSPExpression EOF ;
    public final EObject entryRuleSPExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPExpression = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1379:2: (iv_ruleSPExpression= ruleSPExpression EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1380:2: iv_ruleSPExpression= ruleSPExpression EOF
            {
             newCompositeNode(grammarAccess.getSPExpressionRule()); 
            pushFollow(FOLLOW_ruleSPExpression_in_entryRuleSPExpression2796);
            iv_ruleSPExpression=ruleSPExpression();

            state._fsp--;

             current =iv_ruleSPExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPExpression2806); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1387:1: ruleSPExpression returns [EObject current=null] : (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef ) ;
    public final EObject ruleSPExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AcceleoExpression_0 = null;

        EObject this_VarRef_1 = null;

        EObject this_FeatureRef_2 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1390:28: ( (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1391:1: (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1391:1: (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt32=1;
                }
                break;
            case 41:
                {
                alt32=2;
                }
                break;
            case 42:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1392:5: this_AcceleoExpression_0= ruleAcceleoExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAcceleoExpression_in_ruleSPExpression2853);
                    this_AcceleoExpression_0=ruleAcceleoExpression();

                    state._fsp--;

                     
                            current = this_AcceleoExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1402:5: this_VarRef_1= ruleVarRef
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getVarRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVarRef_in_ruleSPExpression2880);
                    this_VarRef_1=ruleVarRef();

                    state._fsp--;

                     
                            current = this_VarRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1412:5: this_FeatureRef_2= ruleFeatureRef
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getFeatureRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFeatureRef_in_ruleSPExpression2907);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1428:1: entryRuleAcceleoExpression returns [EObject current=null] : iv_ruleAcceleoExpression= ruleAcceleoExpression EOF ;
    public final EObject entryRuleAcceleoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceleoExpression = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1429:2: (iv_ruleAcceleoExpression= ruleAcceleoExpression EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1430:2: iv_ruleAcceleoExpression= ruleAcceleoExpression EOF
            {
             newCompositeNode(grammarAccess.getAcceleoExpressionRule()); 
            pushFollow(FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression2942);
            iv_ruleAcceleoExpression=ruleAcceleoExpression();

            state._fsp--;

             current =iv_ruleAcceleoExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcceleoExpression2952); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1437:1: ruleAcceleoExpression returns [EObject current=null] : (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAcceleoExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1440:28: ( (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1441:1: (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1441:1: (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1441:3: otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleAcceleoExpression2989); 

                	newLeafNode(otherlv_0, grammarAccess.getAcceleoExpressionAccess().getAccKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1445:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1446:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1446:1: (lv_value_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1447:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAcceleoExpression3006); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1471:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1472:2: (iv_ruleVarRef= ruleVarRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1473:2: iv_ruleVarRef= ruleVarRef EOF
            {
             newCompositeNode(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef3047);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;

             current =iv_ruleVarRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef3057); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1480:1: ruleVarRef returns [EObject current=null] : (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1483:28: ( (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1484:1: (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1484:1: (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1484:3: otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleVarRef3094); 

                	newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getVarKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1488:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1489:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1489:1: (lv_value_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1490:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVarRef3111); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1514:1: entryRuleFeatureRef returns [EObject current=null] : iv_ruleFeatureRef= ruleFeatureRef EOF ;
    public final EObject entryRuleFeatureRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1515:2: (iv_ruleFeatureRef= ruleFeatureRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1516:2: iv_ruleFeatureRef= ruleFeatureRef EOF
            {
             newCompositeNode(grammarAccess.getFeatureRefRule()); 
            pushFollow(FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef3152);
            iv_ruleFeatureRef=ruleFeatureRef();

            state._fsp--;

             current =iv_ruleFeatureRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRef3162); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1523:1: ruleFeatureRef returns [EObject current=null] : (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFeatureRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1526:28: ( (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1527:1: (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1527:1: (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1527:3: otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleFeatureRef3199); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureRefAccess().getFeatureKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1531:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1532:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1532:1: (lv_value_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1533:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureRef3216); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1557:1: entryRuleMetamodelRef returns [EObject current=null] : iv_ruleMetamodelRef= ruleMetamodelRef EOF ;
    public final EObject entryRuleMetamodelRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1558:2: (iv_ruleMetamodelRef= ruleMetamodelRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1559:2: iv_ruleMetamodelRef= ruleMetamodelRef EOF
            {
             newCompositeNode(grammarAccess.getMetamodelRefRule()); 
            pushFollow(FOLLOW_ruleMetamodelRef_in_entryRuleMetamodelRef3257);
            iv_ruleMetamodelRef=ruleMetamodelRef();

            state._fsp--;

             current =iv_ruleMetamodelRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelRef3267); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1566:1: ruleMetamodelRef returns [EObject current=null] : (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetamodelRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_metamodel_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1569:28: ( (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1570:1: (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1570:1: (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1570:3: otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleMetamodelRef3304); 

                	newLeafNode(otherlv_0, grammarAccess.getMetamodelRefAccess().getUseKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1574:1: ( (lv_metamodel_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1575:1: (lv_metamodel_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1575:1: (lv_metamodel_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1576:3: lv_metamodel_1_0= RULE_STRING
            {
            lv_metamodel_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetamodelRef3321); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1600:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1601:2: (iv_ruleColor= ruleColor EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1602:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor3363);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor3374); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1609:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PreDefinedColor_0= rulePreDefinedColor ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PreDefinedColor_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1612:28: (this_PreDefinedColor_0= rulePreDefinedColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1614:5: this_PreDefinedColor_0= rulePreDefinedColor
            {
             
                    newCompositeNode(grammarAccess.getColorAccess().getPreDefinedColorParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePreDefinedColor_in_ruleColor3420);
            this_PreDefinedColor_0=rulePreDefinedColor();

            state._fsp--;


            		current.merge(this_PreDefinedColor_0);
                
             
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


    // $ANTLR start "entryRulePreDefinedColor"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1632:1: entryRulePreDefinedColor returns [String current=null] : iv_rulePreDefinedColor= rulePreDefinedColor EOF ;
    public final String entryRulePreDefinedColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreDefinedColor = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1633:2: (iv_rulePreDefinedColor= rulePreDefinedColor EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1634:2: iv_rulePreDefinedColor= rulePreDefinedColor EOF
            {
             newCompositeNode(grammarAccess.getPreDefinedColorRule()); 
            pushFollow(FOLLOW_rulePreDefinedColor_in_entryRulePreDefinedColor3465);
            iv_rulePreDefinedColor=rulePreDefinedColor();

            state._fsp--;

             current =iv_rulePreDefinedColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreDefinedColor3476); 

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
    // $ANTLR end "entryRulePreDefinedColor"


    // $ANTLR start "rulePreDefinedColor"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1641:1: rulePreDefinedColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'white' | kw= 'black' | kw= 'blue' | kw= 'light blue' | kw= 'dark blue' | kw= 'chocolate' | kw= 'light chocolate' | kw= 'dark chocolate' | kw= 'gray' | kw= 'light gray' | kw= 'dark gray' | kw= 'green' | kw= 'light green' | kw= 'dark green' | kw= 'orange' | kw= 'light orange' | kw= 'dark orange' | kw= 'purple' | kw= 'light purple' | kw= 'dark purple' | kw= 'red' | kw= 'light red' | kw= 'dark red' | kw= 'yellow' | kw= 'light yellow' | kw= 'dark yellow' ) ;
    public final AntlrDatatypeRuleToken rulePreDefinedColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1644:28: ( (kw= 'white' | kw= 'black' | kw= 'blue' | kw= 'light blue' | kw= 'dark blue' | kw= 'chocolate' | kw= 'light chocolate' | kw= 'dark chocolate' | kw= 'gray' | kw= 'light gray' | kw= 'dark gray' | kw= 'green' | kw= 'light green' | kw= 'dark green' | kw= 'orange' | kw= 'light orange' | kw= 'dark orange' | kw= 'purple' | kw= 'light purple' | kw= 'dark purple' | kw= 'red' | kw= 'light red' | kw= 'dark red' | kw= 'yellow' | kw= 'light yellow' | kw= 'dark yellow' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1645:1: (kw= 'white' | kw= 'black' | kw= 'blue' | kw= 'light blue' | kw= 'dark blue' | kw= 'chocolate' | kw= 'light chocolate' | kw= 'dark chocolate' | kw= 'gray' | kw= 'light gray' | kw= 'dark gray' | kw= 'green' | kw= 'light green' | kw= 'dark green' | kw= 'orange' | kw= 'light orange' | kw= 'dark orange' | kw= 'purple' | kw= 'light purple' | kw= 'dark purple' | kw= 'red' | kw= 'light red' | kw= 'dark red' | kw= 'yellow' | kw= 'light yellow' | kw= 'dark yellow' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1645:1: (kw= 'white' | kw= 'black' | kw= 'blue' | kw= 'light blue' | kw= 'dark blue' | kw= 'chocolate' | kw= 'light chocolate' | kw= 'dark chocolate' | kw= 'gray' | kw= 'light gray' | kw= 'dark gray' | kw= 'green' | kw= 'light green' | kw= 'dark green' | kw= 'orange' | kw= 'light orange' | kw= 'dark orange' | kw= 'purple' | kw= 'light purple' | kw= 'dark purple' | kw= 'red' | kw= 'light red' | kw= 'dark red' | kw= 'yellow' | kw= 'light yellow' | kw= 'dark yellow' )
            int alt33=26;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt33=1;
                }
                break;
            case 45:
                {
                alt33=2;
                }
                break;
            case 46:
                {
                alt33=3;
                }
                break;
            case 47:
                {
                alt33=4;
                }
                break;
            case 48:
                {
                alt33=5;
                }
                break;
            case 49:
                {
                alt33=6;
                }
                break;
            case 50:
                {
                alt33=7;
                }
                break;
            case 51:
                {
                alt33=8;
                }
                break;
            case 52:
                {
                alt33=9;
                }
                break;
            case 53:
                {
                alt33=10;
                }
                break;
            case 54:
                {
                alt33=11;
                }
                break;
            case 55:
                {
                alt33=12;
                }
                break;
            case 56:
                {
                alt33=13;
                }
                break;
            case 57:
                {
                alt33=14;
                }
                break;
            case 58:
                {
                alt33=15;
                }
                break;
            case 59:
                {
                alt33=16;
                }
                break;
            case 60:
                {
                alt33=17;
                }
                break;
            case 61:
                {
                alt33=18;
                }
                break;
            case 62:
                {
                alt33=19;
                }
                break;
            case 63:
                {
                alt33=20;
                }
                break;
            case 64:
                {
                alt33=21;
                }
                break;
            case 65:
                {
                alt33=22;
                }
                break;
            case 66:
                {
                alt33=23;
                }
                break;
            case 67:
                {
                alt33=24;
                }
                break;
            case 68:
                {
                alt33=25;
                }
                break;
            case 69:
                {
                alt33=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1646:2: kw= 'white'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulePreDefinedColor3514); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getWhiteKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1653:2: kw= 'black'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_rulePreDefinedColor3533); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getBlackKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1660:2: kw= 'blue'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_rulePreDefinedColor3552); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getBlueKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1667:2: kw= 'light blue'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_rulePreDefinedColor3571); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getLightBlueKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1674:2: kw= 'dark blue'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_rulePreDefinedColor3590); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getDarkBlueKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1681:2: kw= 'chocolate'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_rulePreDefinedColor3609); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getChocolateKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1688:2: kw= 'light chocolate'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_rulePreDefinedColor3628); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getLightChocolateKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1695:2: kw= 'dark chocolate'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_rulePreDefinedColor3647); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getDarkChocolateKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1702:2: kw= 'gray'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_rulePreDefinedColor3666); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getGrayKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1709:2: kw= 'light gray'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_rulePreDefinedColor3685); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getLightGrayKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1716:2: kw= 'dark gray'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_rulePreDefinedColor3704); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getDarkGrayKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1723:2: kw= 'green'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_rulePreDefinedColor3723); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getGreenKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1730:2: kw= 'light green'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_rulePreDefinedColor3742); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getLightGreenKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1737:2: kw= 'dark green'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_rulePreDefinedColor3761); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getDarkGreenKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1744:2: kw= 'orange'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_rulePreDefinedColor3780); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getOrangeKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1751:2: kw= 'light orange'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_rulePreDefinedColor3799); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getLightOrangeKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1758:2: kw= 'dark orange'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_rulePreDefinedColor3818); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getDarkOrangeKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1765:2: kw= 'purple'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_rulePreDefinedColor3837); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getPurpleKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1772:2: kw= 'light purple'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_rulePreDefinedColor3856); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getLightPurpleKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1779:2: kw= 'dark purple'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_rulePreDefinedColor3875); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getDarkPurpleKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1786:2: kw= 'red'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_rulePreDefinedColor3894); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getRedKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1793:2: kw= 'light red'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_rulePreDefinedColor3913); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getLightRedKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1800:2: kw= 'dark red'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_rulePreDefinedColor3932); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getDarkRedKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1807:2: kw= 'yellow'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_rulePreDefinedColor3951); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getYellowKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1814:2: kw= 'light yellow'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_rulePreDefinedColor3970); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getLightYellowKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1821:2: kw= 'dark yellow'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_rulePreDefinedColor3989); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPreDefinedColorAccess().getDarkYellowKeyword_25()); 
                        

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
    public static final BitSet FOLLOW_12_in_ruleSPTable688 = new BitSet(new long[]{0x0000080000180000L});
    public static final BitSet FOLLOW_19_in_ruleSPTable701 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPTable718 = new BitSet(new long[]{0x0000080000180000L});
    public static final BitSet FOLLOW_20_in_ruleSPTable738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPTable755 = new BitSet(new long[]{0x0000080000180000L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_ruleSPTable783 = new BitSet(new long[]{0x0000080000380000L});
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
    public static final BitSet FOLLOW_25_in_ruleTableElement1055 = new BitSet(new long[]{0x0000070000000000L});
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
    public static final BitSet FOLLOW_27_in_ruleTableProperty1280 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleTableProperty1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPDiagram_in_entryRuleSPDiagram1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPDiagram1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSPDiagram1386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPDiagram1403 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSPDiagram1420 = new BitSet(new long[]{0x0000080000180000L});
    public static final BitSet FOLLOW_19_in_ruleSPDiagram1433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1450 = new BitSet(new long[]{0x0000080000180000L});
    public static final BitSet FOLLOW_20_in_ruleSPDiagram1470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1487 = new BitSet(new long[]{0x0000080000180000L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_ruleSPDiagram1515 = new BitSet(new long[]{0x0000080000380000L});
    public static final BitSet FOLLOW_21_in_ruleSPDiagram1528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1545 = new BitSet(new long[]{0x00000001A0000000L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_ruleSPDiagram1571 = new BitSet(new long[]{0x00000001A0004000L});
    public static final BitSet FOLLOW_14_in_ruleSPDiagram1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramElement1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleDiagramElement1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer1710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerType_in_ruleContainer1766 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleContainer1779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer1796 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleContainer1813 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleContainer1834 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleContainer1846 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_ruleContainer1867 = new BitSet(new long[]{0x0000008000084000L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_ruleContainer1888 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_ruleContainer1910 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainer1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerType_in_entryRuleContainerType1960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerType1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleContainerType2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleContainerType2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_entryRuleSolidColorDefinition2068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolidColorDefinition2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSolidColorDefinition2115 = new BitSet(new long[]{0xFFFFF00000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleSolidColorDefinition2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_entryRuleContainerColorDefinition2172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerColorDefinition2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleContainerColorDefinition2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_ruleContainerColorDefinition2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_entryRuleGradientColorDefinition2291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGradientColorDefinition2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGradientColorDefinition2338 = new BitSet(new long[]{0xFFFFF00000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleGradientColorDefinition2359 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleGradientColorDefinition2371 = new BitSet(new long[]{0xFFFFF00000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleGradientColorDefinition2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_entryRuleLabelStyleDefinition2428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelStyleDefinition2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleLabelStyleDefinition2475 = new BitSet(new long[]{0x0000070200000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleLabelStyleDefinition2496 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleLabelStyleDefinition2518 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_36_in_ruleLabelStyleDefinition2531 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLabelStyleDefinition2548 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleLabelStyleDefinition2573 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleLabelStyleDefinition2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_entryRuleBorderStyleDefinition2655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderStyleDefinition2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBorderStyleDefinition2702 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleBorderStyleDefinition2723 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleBorderStyleDefinition2736 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBorderStyleDefinition2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_entryRuleSPExpression2796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPExpression2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_ruleSPExpression2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_ruleSPExpression2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_ruleSPExpression2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcceleoExpression2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAcceleoExpression2989 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAcceleoExpression3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef3047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleVarRef3094 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVarRef3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef3152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRef3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFeatureRef3199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureRef3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_entryRuleMetamodelRef3257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelRef3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMetamodelRef3304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetamodelRef3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor3363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColor_in_ruleColor3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColor_in_entryRulePreDefinedColor3465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreDefinedColor3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePreDefinedColor3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePreDefinedColor3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePreDefinedColor3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePreDefinedColor3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePreDefinedColor3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePreDefinedColor3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePreDefinedColor3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePreDefinedColor3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePreDefinedColor3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePreDefinedColor3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePreDefinedColor3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePreDefinedColor3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePreDefinedColor3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePreDefinedColor3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePreDefinedColor3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePreDefinedColor3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePreDefinedColor3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePreDefinedColor3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePreDefinedColor3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePreDefinedColor3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePreDefinedColor3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePreDefinedColor3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePreDefinedColor3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePreDefinedColor3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePreDefinedColor3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePreDefinedColor3989 = new BitSet(new long[]{0x0000000000000002L});

}