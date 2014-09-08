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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'proto'", "'{'", "'qualifier'", "'}'", "'viewpoint'", "'shortcut'", "'ext'", "'table'", "'label'", "'title'", "'root'", "'creatable'", "'recursive'", "'element'", "'accessibleThrough'", "'property'", "'expression'", "'diagram'", "'container'", "'for'", "'['", "','", "']'", "'freeform'", "'list'", "'node'", "'color'", "'gradient from'", "'to'", "'size'", "'bold'", "'italic'", "'border '", "'acc:'", "'var:'", "'feature:'", "'use'", "'white'", "'black'", "'blue'", "'light blue'", "'dark blue'", "'chocolate'", "'light chocolate'", "'dark chocolate'", "'gray'", "'light gray'", "'dark gray'", "'green'", "'light green'", "'dark green'", "'orange'", "'light orange'", "'dark orange'", "'purple'", "'light purple'", "'dark purple'", "'red'", "'light red'", "'dark red'", "'yellow'", "'light yellow'", "'dark yellow'"
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
    public static final int T__73=73;

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:321:1: ruleSPTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_usages_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' ) ;
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
        EObject lv_usages_7_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_properties_11_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:324:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_usages_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:325:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_usages_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:325:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_usages_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:325:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_usages_7_0= ruleMetamodelUsage ) )+ otherlv_8= 'root' ( (lv_root_9_0= RULE_STRING ) ) ( (lv_elements_10_0= ruleTableElement ) )+ ( (lv_properties_11_0= ruleTableProperty ) )+ otherlv_12= '}'
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:395:4: ( (lv_usages_7_0= ruleMetamodelUsage ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==47) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:396:1: (lv_usages_7_0= ruleMetamodelUsage )
            	    {
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:396:1: (lv_usages_7_0= ruleMetamodelUsage )
            	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:397:3: lv_usages_7_0= ruleMetamodelUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSPTableAccess().getUsagesMetamodelUsageParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetamodelUsage_in_ruleSPTable783);
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

                if ( (LA20_0==47) ) {
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

                if ( ((LA21_0>=22 && LA21_0<=23)||LA21_0==29||(LA21_0>=34 && LA21_0<=36)) ) {
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:853:1: ruleDiagramElement returns [EObject current=null] : (this_Container_0= ruleContainer | this_Node_1= ruleNode ) ;
    public final EObject ruleDiagramElement() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;

        EObject this_Node_1 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:856:28: ( (this_Container_0= ruleContainer | this_Node_1= ruleNode ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:857:1: (this_Container_0= ruleContainer | this_Node_1= ruleNode )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:857:1: (this_Container_0= ruleContainer | this_Node_1= ruleNode )
            int alt22=2;
            switch ( input.LA(1) ) {
            case 22:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==36) ) {
                    alt22=2;
                }
                else if ( (LA22_1==23||LA22_1==29||(LA22_1>=34 && LA22_1<=35)) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 29:
            case 34:
            case 35:
                {
                alt22=1;
                }
                break;
            case 36:
                {
                alt22=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:858:5: this_Container_0= ruleContainer
                    {
                     
                            newCompositeNode(grammarAccess.getDiagramElementAccess().getContainerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleContainer_in_ruleDiagramElement1677);
                    this_Container_0=ruleContainer();

                    state._fsp--;

                     
                            current = this_Container_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:868:5: this_Node_1= ruleNode
                    {
                     
                            newCompositeNode(grammarAccess.getDiagramElementAccess().getNodeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNode_in_ruleDiagramElement1704);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:884:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:885:2: (iv_ruleContainer= ruleContainer EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:886:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer1739);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer1749); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:893:1: ruleContainer returns [EObject current=null] : ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'for' ( (lv_eClass_6_0= RULE_STRING ) ) otherlv_7= 'accessibleThrough' ( (lv_expression_8_0= ruleSPExpression ) ) ( (lv_style_9_0= ruleContainerStyleDefinition ) )? (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )? ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:896:28: ( ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'for' ( (lv_eClass_6_0= RULE_STRING ) ) otherlv_7= 'accessibleThrough' ( (lv_expression_8_0= ruleSPExpression ) ) ( (lv_style_9_0= ruleContainerStyleDefinition ) )? (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:897:1: ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'for' ( (lv_eClass_6_0= RULE_STRING ) ) otherlv_7= 'accessibleThrough' ( (lv_expression_8_0= ruleSPExpression ) ) ( (lv_style_9_0= ruleContainerStyleDefinition ) )? (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:897:1: ( ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'for' ( (lv_eClass_6_0= RULE_STRING ) ) otherlv_7= 'accessibleThrough' ( (lv_expression_8_0= ruleSPExpression ) ) ( (lv_style_9_0= ruleContainerStyleDefinition ) )? (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:897:2: ( (lv_creatable_0_0= 'creatable' ) )? ( (lv_recursive_1_0= 'recursive' ) )? ( (lv_containerType_2_0= ruleContainerType ) )? otherlv_3= 'container' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'for' ( (lv_eClass_6_0= RULE_STRING ) ) otherlv_7= 'accessibleThrough' ( (lv_expression_8_0= ruleSPExpression ) ) ( (lv_style_9_0= ruleContainerStyleDefinition ) )? (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )?
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:897:2: ( (lv_creatable_0_0= 'creatable' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:898:1: (lv_creatable_0_0= 'creatable' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:898:1: (lv_creatable_0_0= 'creatable' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:899:3: lv_creatable_0_0= 'creatable'
                    {
                    lv_creatable_0_0=(Token)match(input,22,FOLLOW_22_in_ruleContainer1792); 

                            newLeafNode(lv_creatable_0_0, grammarAccess.getContainerAccess().getCreatableCreatableKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(current, "creatable", true, "creatable");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:912:3: ( (lv_recursive_1_0= 'recursive' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:913:1: (lv_recursive_1_0= 'recursive' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:913:1: (lv_recursive_1_0= 'recursive' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:914:3: lv_recursive_1_0= 'recursive'
                    {
                    lv_recursive_1_0=(Token)match(input,23,FOLLOW_23_in_ruleContainer1824); 

                            newLeafNode(lv_recursive_1_0, grammarAccess.getContainerAccess().getRecursiveRecursiveKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(current, "recursive", true, "recursive");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:927:3: ( (lv_containerType_2_0= ruleContainerType ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=34 && LA25_0<=35)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:928:1: (lv_containerType_2_0= ruleContainerType )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:928:1: (lv_containerType_2_0= ruleContainerType )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:929:3: lv_containerType_2_0= ruleContainerType
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getContainerTypeContainerTypeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContainerType_in_ruleContainer1859);
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleContainer1872); 

                	newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getContainerKeyword_3());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:949:1: ( (lv_name_4_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:950:1: (lv_name_4_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:950:1: (lv_name_4_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:951:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainer1889); 

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

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleContainer1906); 

                	newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getForKeyword_5());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:971:1: ( (lv_eClass_6_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:972:1: (lv_eClass_6_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:972:1: (lv_eClass_6_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:973:3: lv_eClass_6_0= RULE_STRING
            {
            lv_eClass_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer1923); 

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

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleContainer1940); 

                	newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getAccessibleThroughKeyword_7());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:993:1: ( (lv_expression_8_0= ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:994:1: (lv_expression_8_0= ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:994:1: (lv_expression_8_0= ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:995:3: lv_expression_8_0= ruleSPExpression
            {
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getExpressionSPExpressionParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleSPExpression_in_ruleContainer1961);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1011:2: ( (lv_style_9_0= ruleContainerStyleDefinition ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1012:1: (lv_style_9_0= ruleContainerStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1012:1: (lv_style_9_0= ruleContainerStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1013:3: lv_style_9_0= ruleContainerStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getStyleContainerStyleDefinitionParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContainerStyleDefinition_in_ruleContainer1982);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1029:3: (otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==12) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1029:5: otherlv_10= '{' ( (lv_elements_11_0= ruleDiagramElement ) )+ otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleContainer1996); 

                        	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1033:1: ( (lv_elements_11_0= ruleDiagramElement ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=22 && LA27_0<=23)||LA27_0==29||(LA27_0>=34 && LA27_0<=36)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1034:1: (lv_elements_11_0= ruleDiagramElement )
                    	    {
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1034:1: (lv_elements_11_0= ruleDiagramElement )
                    	    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1035:3: lv_elements_11_0= ruleDiagramElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainerAccess().getElementsDiagramElementParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDiagramElement_in_ruleContainer2017);
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
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleContainer2030); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1063:1: entryRuleContainerStyleDefinition returns [EObject current=null] : iv_ruleContainerStyleDefinition= ruleContainerStyleDefinition EOF ;
    public final EObject entryRuleContainerStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1064:2: (iv_ruleContainerStyleDefinition= ruleContainerStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1065:2: iv_ruleContainerStyleDefinition= ruleContainerStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getContainerStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleContainerStyleDefinition_in_entryRuleContainerStyleDefinition2068);
            iv_ruleContainerStyleDefinition=ruleContainerStyleDefinition();

            state._fsp--;

             current =iv_ruleContainerStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerStyleDefinition2078); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1072:1: ruleContainerStyleDefinition returns [EObject current=null] : (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1075:28: ( (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1076:1: (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1076:1: (otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1076:3: otherlv_0= '[' ( (lv_color_1_0= ruleContainerColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleContainerStyleDefinition2115); 

                	newLeafNode(otherlv_0, grammarAccess.getContainerStyleDefinitionAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1080:1: ( (lv_color_1_0= ruleContainerColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1081:1: (lv_color_1_0= ruleContainerColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1081:1: (lv_color_1_0= ruleContainerColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1082:3: lv_color_1_0= ruleContainerColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getContainerStyleDefinitionAccess().getColorContainerColorDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_ruleContainerStyleDefinition2136);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1098:2: (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==19) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1098:4: otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleContainerStyleDefinition2149); 

                        	newLeafNode(otherlv_2, grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1102:1: ( (lv_label_3_0= ruleLabelStyleDefinition ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1103:1: (lv_label_3_0= ruleLabelStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1103:1: (lv_label_3_0= ruleLabelStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1104:3: lv_label_3_0= ruleLabelStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelStyleDefinition_in_ruleContainerStyleDefinition2170);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1120:4: (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1120:6: otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleContainerStyleDefinition2185); 

                        	newLeafNode(otherlv_4, grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1124:1: ( (lv_border_5_0= ruleBorderStyleDefinition ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1125:1: (lv_border_5_0= ruleBorderStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1125:1: (lv_border_5_0= ruleBorderStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1126:3: lv_border_5_0= ruleBorderStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBorderStyleDefinition_in_ruleContainerStyleDefinition2206);
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

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleContainerStyleDefinition2220); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1154:1: entryRuleContainerType returns [String current=null] : iv_ruleContainerType= ruleContainerType EOF ;
    public final String entryRuleContainerType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContainerType = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1155:2: (iv_ruleContainerType= ruleContainerType EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1156:2: iv_ruleContainerType= ruleContainerType EOF
            {
             newCompositeNode(grammarAccess.getContainerTypeRule()); 
            pushFollow(FOLLOW_ruleContainerType_in_entryRuleContainerType2257);
            iv_ruleContainerType=ruleContainerType();

            state._fsp--;

             current =iv_ruleContainerType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerType2268); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1163:1: ruleContainerType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'freeform' | kw= 'list' ) ;
    public final AntlrDatatypeRuleToken ruleContainerType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1166:28: ( (kw= 'freeform' | kw= 'list' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1167:1: (kw= 'freeform' | kw= 'list' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1167:1: (kw= 'freeform' | kw= 'list' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            else if ( (LA31_0==35) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1168:2: kw= 'freeform'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleContainerType2306); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getContainerTypeAccess().getFreeformKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1175:2: kw= 'list'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleContainerType2325); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1188:1: entryRuleContainerColorDefinition returns [EObject current=null] : iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF ;
    public final EObject entryRuleContainerColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1189:2: (iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1190:2: iv_ruleContainerColorDefinition= ruleContainerColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getContainerColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_entryRuleContainerColorDefinition2365);
            iv_ruleContainerColorDefinition=ruleContainerColorDefinition();

            state._fsp--;

             current =iv_ruleContainerColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerColorDefinition2375); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1197:1: ruleContainerColorDefinition returns [EObject current=null] : (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition ) ;
    public final EObject ruleContainerColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_SolidColorDefinition_0 = null;

        EObject this_GradientColorDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1200:28: ( (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1201:1: (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1201:1: (this_SolidColorDefinition_0= ruleSolidColorDefinition | this_GradientColorDefinition_1= ruleGradientColorDefinition )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            else if ( (LA32_0==38) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1202:5: this_SolidColorDefinition_0= ruleSolidColorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getContainerColorDefinitionAccess().getSolidColorDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleContainerColorDefinition2422);
                    this_SolidColorDefinition_0=ruleSolidColorDefinition();

                    state._fsp--;

                     
                            current = this_SolidColorDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1212:5: this_GradientColorDefinition_1= ruleGradientColorDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getContainerColorDefinitionAccess().getGradientColorDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGradientColorDefinition_in_ruleContainerColorDefinition2449);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1228:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1229:2: (iv_ruleNode= ruleNode EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1230:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode2484);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode2494); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1237:1: ruleNode returns [EObject current=null] : ( ( (lv_creatable_0_0= 'creatable' ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleNodeStyleDefinition ) )? ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1240:28: ( ( ( (lv_creatable_0_0= 'creatable' ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleNodeStyleDefinition ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1241:1: ( ( (lv_creatable_0_0= 'creatable' ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleNodeStyleDefinition ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1241:1: ( ( (lv_creatable_0_0= 'creatable' ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleNodeStyleDefinition ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1241:2: ( (lv_creatable_0_0= 'creatable' ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (lv_eClass_4_0= RULE_STRING ) ) otherlv_5= 'accessibleThrough' ( (lv_expression_6_0= ruleSPExpression ) ) ( (lv_style_7_0= ruleNodeStyleDefinition ) )?
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1241:2: ( (lv_creatable_0_0= 'creatable' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1242:1: (lv_creatable_0_0= 'creatable' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1242:1: (lv_creatable_0_0= 'creatable' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1243:3: lv_creatable_0_0= 'creatable'
                    {
                    lv_creatable_0_0=(Token)match(input,22,FOLLOW_22_in_ruleNode2537); 

                            newLeafNode(lv_creatable_0_0, grammarAccess.getNodeAccess().getCreatableCreatableKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(current, "creatable", true, "creatable");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleNode2563); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1260:1: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1261:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1261:1: (lv_name_2_0= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1262:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode2580); 

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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleNode2597); 

                	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getForKeyword_3());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1282:1: ( (lv_eClass_4_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1283:1: (lv_eClass_4_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1283:1: (lv_eClass_4_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1284:3: lv_eClass_4_0= RULE_STRING
            {
            lv_eClass_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode2614); 

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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleNode2631); 

                	newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getAccessibleThroughKeyword_5());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1304:1: ( (lv_expression_6_0= ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1305:1: (lv_expression_6_0= ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1305:1: (lv_expression_6_0= ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1306:3: lv_expression_6_0= ruleSPExpression
            {
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getExpressionSPExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSPExpression_in_ruleNode2652);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1322:2: ( (lv_style_7_0= ruleNodeStyleDefinition ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1323:1: (lv_style_7_0= ruleNodeStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1323:1: (lv_style_7_0= ruleNodeStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1324:3: lv_style_7_0= ruleNodeStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeAccess().getStyleNodeStyleDefinitionParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeStyleDefinition_in_ruleNode2673);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1348:1: entryRuleNodeStyleDefinition returns [EObject current=null] : iv_ruleNodeStyleDefinition= ruleNodeStyleDefinition EOF ;
    public final EObject entryRuleNodeStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1349:2: (iv_ruleNodeStyleDefinition= ruleNodeStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1350:2: iv_ruleNodeStyleDefinition= ruleNodeStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getNodeStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeStyleDefinition_in_entryRuleNodeStyleDefinition2710);
            iv_ruleNodeStyleDefinition=ruleNodeStyleDefinition();

            state._fsp--;

             current =iv_ruleNodeStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeStyleDefinition2720); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1357:1: ruleNodeStyleDefinition returns [EObject current=null] : (otherlv_0= '[' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1360:28: ( (otherlv_0= '[' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1361:1: (otherlv_0= '[' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1361:1: (otherlv_0= '[' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']' )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1361:3: otherlv_0= '[' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )? (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleNodeStyleDefinition2757); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeStyleDefinitionAccess().getLeftSquareBracketKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1365:1: ( (lv_color_1_0= ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1366:1: (lv_color_1_0= ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1366:1: (lv_color_1_0= ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1367:3: lv_color_1_0= ruleSolidColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getNodeStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleNodeStyleDefinition2778);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1383:2: (otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==19) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1383:4: otherlv_2= ',' ( (lv_label_3_0= ruleLabelStyleDefinition ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleNodeStyleDefinition2791); 

                        	newLeafNode(otherlv_2, grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1387:1: ( (lv_label_3_0= ruleLabelStyleDefinition ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1388:1: (lv_label_3_0= ruleLabelStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1388:1: (lv_label_3_0= ruleLabelStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1389:3: lv_label_3_0= ruleLabelStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelStyleDefinition_in_ruleNodeStyleDefinition2812);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1405:4: (otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1405:6: otherlv_4= ',' ( (lv_border_5_0= ruleBorderStyleDefinition ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleNodeStyleDefinition2827); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1409:1: ( (lv_border_5_0= ruleBorderStyleDefinition ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1410:1: (lv_border_5_0= ruleBorderStyleDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1410:1: (lv_border_5_0= ruleBorderStyleDefinition )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1411:3: lv_border_5_0= ruleBorderStyleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBorderStyleDefinition_in_ruleNodeStyleDefinition2848);
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

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleNodeStyleDefinition2862); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1439:1: entryRuleSolidColorDefinition returns [EObject current=null] : iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF ;
    public final EObject entryRuleSolidColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolidColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1440:2: (iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1441:2: iv_ruleSolidColorDefinition= ruleSolidColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getSolidColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_entryRuleSolidColorDefinition2898);
            iv_ruleSolidColorDefinition=ruleSolidColorDefinition();

            state._fsp--;

             current =iv_ruleSolidColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolidColorDefinition2908); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1448:1: ruleSolidColorDefinition returns [EObject current=null] : (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) ) ;
    public final EObject ruleSolidColorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_color_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1451:28: ( (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1452:1: (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1452:1: (otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1452:3: otherlv_0= 'color' ( (lv_color_1_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleSolidColorDefinition2945); 

                	newLeafNode(otherlv_0, grammarAccess.getSolidColorDefinitionAccess().getColorKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1456:1: ( (lv_color_1_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1457:1: (lv_color_1_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1457:1: (lv_color_1_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1458:3: lv_color_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getSolidColorDefinitionAccess().getColorColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleSolidColorDefinition2966);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1482:1: entryRuleGradientColorDefinition returns [EObject current=null] : iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF ;
    public final EObject entryRuleGradientColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradientColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1483:2: (iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1484:2: iv_ruleGradientColorDefinition= ruleGradientColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getGradientColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleGradientColorDefinition_in_entryRuleGradientColorDefinition3002);
            iv_ruleGradientColorDefinition=ruleGradientColorDefinition();

            state._fsp--;

             current =iv_ruleGradientColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGradientColorDefinition3012); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1491:1: ruleGradientColorDefinition returns [EObject current=null] : (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) ) ;
    public final EObject ruleGradientColorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_from_1_0 = null;

        EObject lv_to_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1494:28: ( (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1495:1: (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1495:1: (otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1495:3: otherlv_0= 'gradient from' ( (lv_from_1_0= ruleColor ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleGradientColorDefinition3049); 

                	newLeafNode(otherlv_0, grammarAccess.getGradientColorDefinitionAccess().getGradientFromKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1499:1: ( (lv_from_1_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1500:1: (lv_from_1_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1500:1: (lv_from_1_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1501:3: lv_from_1_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getGradientColorDefinitionAccess().getFromColorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleGradientColorDefinition3070);
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

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleGradientColorDefinition3082); 

                	newLeafNode(otherlv_2, grammarAccess.getGradientColorDefinitionAccess().getToKeyword_2());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1521:1: ( (lv_to_3_0= ruleColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1522:1: (lv_to_3_0= ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1522:1: (lv_to_3_0= ruleColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1523:3: lv_to_3_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getGradientColorDefinitionAccess().getToColorParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleGradientColorDefinition3103);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1547:1: entryRuleLabelStyleDefinition returns [EObject current=null] : iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF ;
    public final EObject entryRuleLabelStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1548:2: (iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1549:2: iv_ruleLabelStyleDefinition= ruleLabelStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getLabelStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelStyleDefinition_in_entryRuleLabelStyleDefinition3139);
            iv_ruleLabelStyleDefinition=ruleLabelStyleDefinition();

            state._fsp--;

             current =iv_ruleLabelStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelStyleDefinition3149); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1556:1: ruleLabelStyleDefinition returns [EObject current=null] : (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1559:28: ( (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1560:1: (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1560:1: (otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1560:3: otherlv_0= 'label' ( (lv_expression_1_0= ruleSPExpression ) )? ( (lv_color_2_0= ruleSolidColorDefinition ) ) (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )? ( (lv_bold_5_0= 'bold' ) )? ( (lv_italic_6_0= 'italic' ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleLabelStyleDefinition3186); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelStyleDefinitionAccess().getLabelKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1564:1: ( (lv_expression_1_0= ruleSPExpression ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=44 && LA37_0<=46)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1565:1: (lv_expression_1_0= ruleSPExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1565:1: (lv_expression_1_0= ruleSPExpression )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1566:3: lv_expression_1_0= ruleSPExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelStyleDefinitionAccess().getExpressionSPExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSPExpression_in_ruleLabelStyleDefinition3207);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1582:3: ( (lv_color_2_0= ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1583:1: (lv_color_2_0= ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1583:1: (lv_color_2_0= ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1584:3: lv_color_2_0= ruleSolidColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getLabelStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleLabelStyleDefinition3229);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1600:2: (otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1600:4: otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleLabelStyleDefinition3242); 

                        	newLeafNode(otherlv_3, grammarAccess.getLabelStyleDefinitionAccess().getSizeKeyword_3_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1604:1: ( (lv_size_4_0= RULE_INT ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1605:1: (lv_size_4_0= RULE_INT )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1605:1: (lv_size_4_0= RULE_INT )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1606:3: lv_size_4_0= RULE_INT
                    {
                    lv_size_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLabelStyleDefinition3259); 

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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1622:4: ( (lv_bold_5_0= 'bold' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1623:1: (lv_bold_5_0= 'bold' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1623:1: (lv_bold_5_0= 'bold' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1624:3: lv_bold_5_0= 'bold'
                    {
                    lv_bold_5_0=(Token)match(input,41,FOLLOW_41_in_ruleLabelStyleDefinition3284); 

                            newLeafNode(lv_bold_5_0, grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelStyleDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "bold", true, "bold");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1637:3: ( (lv_italic_6_0= 'italic' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1638:1: (lv_italic_6_0= 'italic' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1638:1: (lv_italic_6_0= 'italic' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1639:3: lv_italic_6_0= 'italic'
                    {
                    lv_italic_6_0=(Token)match(input,42,FOLLOW_42_in_ruleLabelStyleDefinition3316); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1660:1: entryRuleBorderStyleDefinition returns [EObject current=null] : iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF ;
    public final EObject entryRuleBorderStyleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorderStyleDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1661:2: (iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1662:2: iv_ruleBorderStyleDefinition= ruleBorderStyleDefinition EOF
            {
             newCompositeNode(grammarAccess.getBorderStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleBorderStyleDefinition_in_entryRuleBorderStyleDefinition3366);
            iv_ruleBorderStyleDefinition=ruleBorderStyleDefinition();

            state._fsp--;

             current =iv_ruleBorderStyleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderStyleDefinition3376); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1669:1: ruleBorderStyleDefinition returns [EObject current=null] : (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleBorderStyleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        EObject lv_color_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1672:28: ( (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1673:1: (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1673:1: (otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )? )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1673:3: otherlv_0= 'border ' ( (lv_color_1_0= ruleSolidColorDefinition ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleBorderStyleDefinition3413); 

                	newLeafNode(otherlv_0, grammarAccess.getBorderStyleDefinitionAccess().getBorderKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1677:1: ( (lv_color_1_0= ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1678:1: (lv_color_1_0= ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1678:1: (lv_color_1_0= ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1679:3: lv_color_1_0= ruleSolidColorDefinition
            {
             
            	        newCompositeNode(grammarAccess.getBorderStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_ruleBorderStyleDefinition3434);
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

            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1695:2: (otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1695:4: otherlv_2= 'size' ( (lv_size_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleBorderStyleDefinition3447); 

                        	newLeafNode(otherlv_2, grammarAccess.getBorderStyleDefinitionAccess().getSizeKeyword_2_0());
                        
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1699:1: ( (lv_size_3_0= RULE_INT ) )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1700:1: (lv_size_3_0= RULE_INT )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1700:1: (lv_size_3_0= RULE_INT )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1701:3: lv_size_3_0= RULE_INT
                    {
                    lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBorderStyleDefinition3464); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1725:1: entryRuleSPExpression returns [EObject current=null] : iv_ruleSPExpression= ruleSPExpression EOF ;
    public final EObject entryRuleSPExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPExpression = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1726:2: (iv_ruleSPExpression= ruleSPExpression EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1727:2: iv_ruleSPExpression= ruleSPExpression EOF
            {
             newCompositeNode(grammarAccess.getSPExpressionRule()); 
            pushFollow(FOLLOW_ruleSPExpression_in_entryRuleSPExpression3507);
            iv_ruleSPExpression=ruleSPExpression();

            state._fsp--;

             current =iv_ruleSPExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPExpression3517); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1734:1: ruleSPExpression returns [EObject current=null] : (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef ) ;
    public final EObject ruleSPExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AcceleoExpression_0 = null;

        EObject this_VarRef_1 = null;

        EObject this_FeatureRef_2 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1737:28: ( (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1738:1: (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1738:1: (this_AcceleoExpression_0= ruleAcceleoExpression | this_VarRef_1= ruleVarRef | this_FeatureRef_2= ruleFeatureRef )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt42=1;
                }
                break;
            case 45:
                {
                alt42=2;
                }
                break;
            case 46:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1739:5: this_AcceleoExpression_0= ruleAcceleoExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAcceleoExpression_in_ruleSPExpression3564);
                    this_AcceleoExpression_0=ruleAcceleoExpression();

                    state._fsp--;

                     
                            current = this_AcceleoExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1749:5: this_VarRef_1= ruleVarRef
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getVarRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVarRef_in_ruleSPExpression3591);
                    this_VarRef_1=ruleVarRef();

                    state._fsp--;

                     
                            current = this_VarRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1759:5: this_FeatureRef_2= ruleFeatureRef
                    {
                     
                            newCompositeNode(grammarAccess.getSPExpressionAccess().getFeatureRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFeatureRef_in_ruleSPExpression3618);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1775:1: entryRuleAcceleoExpression returns [EObject current=null] : iv_ruleAcceleoExpression= ruleAcceleoExpression EOF ;
    public final EObject entryRuleAcceleoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceleoExpression = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1776:2: (iv_ruleAcceleoExpression= ruleAcceleoExpression EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1777:2: iv_ruleAcceleoExpression= ruleAcceleoExpression EOF
            {
             newCompositeNode(grammarAccess.getAcceleoExpressionRule()); 
            pushFollow(FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression3653);
            iv_ruleAcceleoExpression=ruleAcceleoExpression();

            state._fsp--;

             current =iv_ruleAcceleoExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcceleoExpression3663); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1784:1: ruleAcceleoExpression returns [EObject current=null] : (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAcceleoExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1787:28: ( (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1788:1: (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1788:1: (otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1788:3: otherlv_0= 'acc:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleAcceleoExpression3700); 

                	newLeafNode(otherlv_0, grammarAccess.getAcceleoExpressionAccess().getAccKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1792:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1793:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1793:1: (lv_value_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1794:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAcceleoExpression3717); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1818:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1819:2: (iv_ruleVarRef= ruleVarRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1820:2: iv_ruleVarRef= ruleVarRef EOF
            {
             newCompositeNode(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef3758);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;

             current =iv_ruleVarRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef3768); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1827:1: ruleVarRef returns [EObject current=null] : (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1830:28: ( (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1831:1: (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1831:1: (otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1831:3: otherlv_0= 'var:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleVarRef3805); 

                	newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getVarKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1835:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1836:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1836:1: (lv_value_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1837:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVarRef3822); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1861:1: entryRuleFeatureRef returns [EObject current=null] : iv_ruleFeatureRef= ruleFeatureRef EOF ;
    public final EObject entryRuleFeatureRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1862:2: (iv_ruleFeatureRef= ruleFeatureRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1863:2: iv_ruleFeatureRef= ruleFeatureRef EOF
            {
             newCompositeNode(grammarAccess.getFeatureRefRule()); 
            pushFollow(FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef3863);
            iv_ruleFeatureRef=ruleFeatureRef();

            state._fsp--;

             current =iv_ruleFeatureRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRef3873); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1870:1: ruleFeatureRef returns [EObject current=null] : (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFeatureRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1873:28: ( (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1874:1: (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1874:1: (otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1874:3: otherlv_0= 'feature:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleFeatureRef3910); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureRefAccess().getFeatureKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1878:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1879:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1879:1: (lv_value_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1880:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureRef3927); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1904:1: entryRuleMetamodelRef returns [EObject current=null] : iv_ruleMetamodelRef= ruleMetamodelRef EOF ;
    public final EObject entryRuleMetamodelRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelRef = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1905:2: (iv_ruleMetamodelRef= ruleMetamodelRef EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1906:2: iv_ruleMetamodelRef= ruleMetamodelRef EOF
            {
             newCompositeNode(grammarAccess.getMetamodelRefRule()); 
            pushFollow(FOLLOW_ruleMetamodelRef_in_entryRuleMetamodelRef3968);
            iv_ruleMetamodelRef=ruleMetamodelRef();

            state._fsp--;

             current =iv_ruleMetamodelRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelRef3978); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1913:1: ruleMetamodelRef returns [EObject current=null] : (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetamodelRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_metamodel_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1916:28: ( (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1917:1: (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1917:1: (otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1917:3: otherlv_0= 'use' ( (lv_metamodel_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleMetamodelRef4015); 

                	newLeafNode(otherlv_0, grammarAccess.getMetamodelRefAccess().getUseKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1921:1: ( (lv_metamodel_1_0= RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1922:1: (lv_metamodel_1_0= RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1922:1: (lv_metamodel_1_0= RULE_STRING )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1923:3: lv_metamodel_1_0= RULE_STRING
            {
            lv_metamodel_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetamodelRef4032); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1947:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1948:2: (iv_ruleColor= ruleColor EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1949:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor4073);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor4083); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1956:1: ruleColor returns [EObject current=null] : this_PreDefinedColorDefinition_0= rulePreDefinedColorDefinition ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        EObject this_PreDefinedColorDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1959:28: (this_PreDefinedColorDefinition_0= rulePreDefinedColorDefinition )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1961:5: this_PreDefinedColorDefinition_0= rulePreDefinedColorDefinition
            {
             
                    newCompositeNode(grammarAccess.getColorAccess().getPreDefinedColorDefinitionParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePreDefinedColorDefinition_in_ruleColor4129);
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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1977:1: entryRulePreDefinedColorDefinition returns [EObject current=null] : iv_rulePreDefinedColorDefinition= rulePreDefinedColorDefinition EOF ;
    public final EObject entryRulePreDefinedColorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreDefinedColorDefinition = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1978:2: (iv_rulePreDefinedColorDefinition= rulePreDefinedColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1979:2: iv_rulePreDefinedColorDefinition= rulePreDefinedColorDefinition EOF
            {
             newCompositeNode(grammarAccess.getPreDefinedColorDefinitionRule()); 
            pushFollow(FOLLOW_rulePreDefinedColorDefinition_in_entryRulePreDefinedColorDefinition4163);
            iv_rulePreDefinedColorDefinition=rulePreDefinedColorDefinition();

            state._fsp--;

             current =iv_rulePreDefinedColorDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreDefinedColorDefinition4173); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1986:1: rulePreDefinedColorDefinition returns [EObject current=null] : ( (lv_color_0_0= rulePreDefinedColor ) ) ;
    public final EObject rulePreDefinedColorDefinition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_color_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1989:28: ( ( (lv_color_0_0= rulePreDefinedColor ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1990:1: ( (lv_color_0_0= rulePreDefinedColor ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1990:1: ( (lv_color_0_0= rulePreDefinedColor ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1991:1: (lv_color_0_0= rulePreDefinedColor )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1991:1: (lv_color_0_0= rulePreDefinedColor )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:1992:3: lv_color_0_0= rulePreDefinedColor
            {
             
            	        newCompositeNode(grammarAccess.getPreDefinedColorDefinitionAccess().getColorPreDefinedColorEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePreDefinedColor_in_rulePreDefinedColorDefinition4218);
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


    // $ANTLR start "entryRuleMetamodelUsage"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2016:1: entryRuleMetamodelUsage returns [EObject current=null] : iv_ruleMetamodelUsage= ruleMetamodelUsage EOF ;
    public final EObject entryRuleMetamodelUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelUsage = null;


        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2017:2: (iv_ruleMetamodelUsage= ruleMetamodelUsage EOF )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2018:2: iv_ruleMetamodelUsage= ruleMetamodelUsage EOF
            {
             newCompositeNode(grammarAccess.getMetamodelUsageRule()); 
            pushFollow(FOLLOW_ruleMetamodelUsage_in_entryRuleMetamodelUsage4253);
            iv_ruleMetamodelUsage=ruleMetamodelUsage();

            state._fsp--;

             current =iv_ruleMetamodelUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelUsage4263); 

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
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2025:1: ruleMetamodelUsage returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMetamodelUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2028:28: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2029:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2029:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2029:3: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleMetamodelUsage4300); 

                	newLeafNode(otherlv_0, grammarAccess.getMetamodelUsageAccess().getUseKeyword_0());
                
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2033:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2034:1: (otherlv_1= RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2034:1: (otherlv_1= RULE_ID )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2035:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMetamodelUsageRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetamodelUsage4320); 

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


    // $ANTLR start "rulePreDefinedColor"
    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2054:1: rulePreDefinedColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) ) ;
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
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2056:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) ) )
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2057:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) )
            {
            // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2057:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'light blue' ) | (enumLiteral_4= 'dark blue' ) | (enumLiteral_5= 'chocolate' ) | (enumLiteral_6= 'light chocolate' ) | (enumLiteral_7= 'dark chocolate' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'light gray' ) | (enumLiteral_10= 'dark gray' ) | (enumLiteral_11= 'green' ) | (enumLiteral_12= 'light green' ) | (enumLiteral_13= 'dark green' ) | (enumLiteral_14= 'orange' ) | (enumLiteral_15= 'light orange' ) | (enumLiteral_16= 'dark orange' ) | (enumLiteral_17= 'purple' ) | (enumLiteral_18= 'light purple' ) | (enumLiteral_19= 'dark purple' ) | (enumLiteral_20= 'red' ) | (enumLiteral_21= 'light red' ) | (enumLiteral_22= 'dark red' ) | (enumLiteral_23= 'yellow' ) | (enumLiteral_24= 'light yellow' ) | (enumLiteral_25= 'dark yellow' ) )
            int alt43=26;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt43=1;
                }
                break;
            case 49:
                {
                alt43=2;
                }
                break;
            case 50:
                {
                alt43=3;
                }
                break;
            case 51:
                {
                alt43=4;
                }
                break;
            case 52:
                {
                alt43=5;
                }
                break;
            case 53:
                {
                alt43=6;
                }
                break;
            case 54:
                {
                alt43=7;
                }
                break;
            case 55:
                {
                alt43=8;
                }
                break;
            case 56:
                {
                alt43=9;
                }
                break;
            case 57:
                {
                alt43=10;
                }
                break;
            case 58:
                {
                alt43=11;
                }
                break;
            case 59:
                {
                alt43=12;
                }
                break;
            case 60:
                {
                alt43=13;
                }
                break;
            case 61:
                {
                alt43=14;
                }
                break;
            case 62:
                {
                alt43=15;
                }
                break;
            case 63:
                {
                alt43=16;
                }
                break;
            case 64:
                {
                alt43=17;
                }
                break;
            case 65:
                {
                alt43=18;
                }
                break;
            case 66:
                {
                alt43=19;
                }
                break;
            case 67:
                {
                alt43=20;
                }
                break;
            case 68:
                {
                alt43=21;
                }
                break;
            case 69:
                {
                alt43=22;
                }
                break;
            case 70:
                {
                alt43=23;
                }
                break;
            case 71:
                {
                alt43=24;
                }
                break;
            case 72:
                {
                alt43=25;
                }
                break;
            case 73:
                {
                alt43=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2057:2: (enumLiteral_0= 'white' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2057:2: (enumLiteral_0= 'white' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2057:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_rulePreDefinedColor4370); 

                            current = grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2063:6: (enumLiteral_1= 'black' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2063:6: (enumLiteral_1= 'black' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2063:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_rulePreDefinedColor4387); 

                            current = grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2069:6: (enumLiteral_2= 'blue' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2069:6: (enumLiteral_2= 'blue' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2069:8: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_rulePreDefinedColor4404); 

                            current = grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2075:6: (enumLiteral_3= 'light blue' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2075:6: (enumLiteral_3= 'light blue' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2075:8: enumLiteral_3= 'light blue'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_51_in_rulePreDefinedColor4421); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2081:6: (enumLiteral_4= 'dark blue' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2081:6: (enumLiteral_4= 'dark blue' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2081:8: enumLiteral_4= 'dark blue'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_52_in_rulePreDefinedColor4438); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2087:6: (enumLiteral_5= 'chocolate' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2087:6: (enumLiteral_5= 'chocolate' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2087:8: enumLiteral_5= 'chocolate'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_53_in_rulePreDefinedColor4455); 

                            current = grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2093:6: (enumLiteral_6= 'light chocolate' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2093:6: (enumLiteral_6= 'light chocolate' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2093:8: enumLiteral_6= 'light chocolate'
                    {
                    enumLiteral_6=(Token)match(input,54,FOLLOW_54_in_rulePreDefinedColor4472); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2099:6: (enumLiteral_7= 'dark chocolate' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2099:6: (enumLiteral_7= 'dark chocolate' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2099:8: enumLiteral_7= 'dark chocolate'
                    {
                    enumLiteral_7=(Token)match(input,55,FOLLOW_55_in_rulePreDefinedColor4489); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2105:6: (enumLiteral_8= 'gray' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2105:6: (enumLiteral_8= 'gray' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2105:8: enumLiteral_8= 'gray'
                    {
                    enumLiteral_8=(Token)match(input,56,FOLLOW_56_in_rulePreDefinedColor4506); 

                            current = grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2111:6: (enumLiteral_9= 'light gray' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2111:6: (enumLiteral_9= 'light gray' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2111:8: enumLiteral_9= 'light gray'
                    {
                    enumLiteral_9=(Token)match(input,57,FOLLOW_57_in_rulePreDefinedColor4523); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2117:6: (enumLiteral_10= 'dark gray' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2117:6: (enumLiteral_10= 'dark gray' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2117:8: enumLiteral_10= 'dark gray'
                    {
                    enumLiteral_10=(Token)match(input,58,FOLLOW_58_in_rulePreDefinedColor4540); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2123:6: (enumLiteral_11= 'green' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2123:6: (enumLiteral_11= 'green' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2123:8: enumLiteral_11= 'green'
                    {
                    enumLiteral_11=(Token)match(input,59,FOLLOW_59_in_rulePreDefinedColor4557); 

                            current = grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2129:6: (enumLiteral_12= 'light green' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2129:6: (enumLiteral_12= 'light green' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2129:8: enumLiteral_12= 'light green'
                    {
                    enumLiteral_12=(Token)match(input,60,FOLLOW_60_in_rulePreDefinedColor4574); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2135:6: (enumLiteral_13= 'dark green' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2135:6: (enumLiteral_13= 'dark green' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2135:8: enumLiteral_13= 'dark green'
                    {
                    enumLiteral_13=(Token)match(input,61,FOLLOW_61_in_rulePreDefinedColor4591); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2141:6: (enumLiteral_14= 'orange' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2141:6: (enumLiteral_14= 'orange' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2141:8: enumLiteral_14= 'orange'
                    {
                    enumLiteral_14=(Token)match(input,62,FOLLOW_62_in_rulePreDefinedColor4608); 

                            current = grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2147:6: (enumLiteral_15= 'light orange' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2147:6: (enumLiteral_15= 'light orange' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2147:8: enumLiteral_15= 'light orange'
                    {
                    enumLiteral_15=(Token)match(input,63,FOLLOW_63_in_rulePreDefinedColor4625); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2153:6: (enumLiteral_16= 'dark orange' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2153:6: (enumLiteral_16= 'dark orange' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2153:8: enumLiteral_16= 'dark orange'
                    {
                    enumLiteral_16=(Token)match(input,64,FOLLOW_64_in_rulePreDefinedColor4642); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2159:6: (enumLiteral_17= 'purple' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2159:6: (enumLiteral_17= 'purple' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2159:8: enumLiteral_17= 'purple'
                    {
                    enumLiteral_17=(Token)match(input,65,FOLLOW_65_in_rulePreDefinedColor4659); 

                            current = grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2165:6: (enumLiteral_18= 'light purple' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2165:6: (enumLiteral_18= 'light purple' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2165:8: enumLiteral_18= 'light purple'
                    {
                    enumLiteral_18=(Token)match(input,66,FOLLOW_66_in_rulePreDefinedColor4676); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2171:6: (enumLiteral_19= 'dark purple' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2171:6: (enumLiteral_19= 'dark purple' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2171:8: enumLiteral_19= 'dark purple'
                    {
                    enumLiteral_19=(Token)match(input,67,FOLLOW_67_in_rulePreDefinedColor4693); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2177:6: (enumLiteral_20= 'red' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2177:6: (enumLiteral_20= 'red' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2177:8: enumLiteral_20= 'red'
                    {
                    enumLiteral_20=(Token)match(input,68,FOLLOW_68_in_rulePreDefinedColor4710); 

                            current = grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2183:6: (enumLiteral_21= 'light red' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2183:6: (enumLiteral_21= 'light red' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2183:8: enumLiteral_21= 'light red'
                    {
                    enumLiteral_21=(Token)match(input,69,FOLLOW_69_in_rulePreDefinedColor4727); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2189:6: (enumLiteral_22= 'dark red' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2189:6: (enumLiteral_22= 'dark red' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2189:8: enumLiteral_22= 'dark red'
                    {
                    enumLiteral_22=(Token)match(input,70,FOLLOW_70_in_rulePreDefinedColor4744); 

                            current = grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2195:6: (enumLiteral_23= 'yellow' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2195:6: (enumLiteral_23= 'yellow' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2195:8: enumLiteral_23= 'yellow'
                    {
                    enumLiteral_23=(Token)match(input,71,FOLLOW_71_in_rulePreDefinedColor4761); 

                            current = grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2201:6: (enumLiteral_24= 'light yellow' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2201:6: (enumLiteral_24= 'light yellow' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2201:8: enumLiteral_24= 'light yellow'
                    {
                    enumLiteral_24=(Token)match(input,72,FOLLOW_72_in_rulePreDefinedColor4778); 

                            current = grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2207:6: (enumLiteral_25= 'dark yellow' )
                    {
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2207:6: (enumLiteral_25= 'dark yellow' )
                    // ../fr.obeo.dsl.sprototyper/src-gen/fr/obeo/dsl/parser/antlr/internal/InternalSPrototyper.g:2207:8: enumLiteral_25= 'dark yellow'
                    {
                    enumLiteral_25=(Token)match(input,73,FOLLOW_73_in_rulePreDefinedColor4795); 

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
    public static final BitSet FOLLOW_12_in_ruleSPTable688 = new BitSet(new long[]{0x0000800000180000L});
    public static final BitSet FOLLOW_19_in_ruleSPTable701 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPTable718 = new BitSet(new long[]{0x0000800000180000L});
    public static final BitSet FOLLOW_20_in_ruleSPTable738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPTable755 = new BitSet(new long[]{0x0000800000180000L});
    public static final BitSet FOLLOW_ruleMetamodelUsage_in_ruleSPTable783 = new BitSet(new long[]{0x0000800000380000L});
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
    public static final BitSet FOLLOW_25_in_ruleTableElement1055 = new BitSet(new long[]{0x0000700000000000L});
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
    public static final BitSet FOLLOW_27_in_ruleTableProperty1280 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleTableProperty1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPDiagram_in_entryRuleSPDiagram1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPDiagram1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSPDiagram1386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPDiagram1403 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSPDiagram1420 = new BitSet(new long[]{0x0000800000180000L});
    public static final BitSet FOLLOW_19_in_ruleSPDiagram1433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1450 = new BitSet(new long[]{0x0000800000180000L});
    public static final BitSet FOLLOW_20_in_ruleSPDiagram1470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1487 = new BitSet(new long[]{0x0000800000180000L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_ruleSPDiagram1515 = new BitSet(new long[]{0x0000800000380000L});
    public static final BitSet FOLLOW_21_in_ruleSPDiagram1528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPDiagram1545 = new BitSet(new long[]{0x0000001C20C00000L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_ruleSPDiagram1571 = new BitSet(new long[]{0x0000001C20C04000L});
    public static final BitSet FOLLOW_14_in_ruleSPDiagram1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramElement1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleDiagramElement1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleDiagramElement1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer1739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleContainer1792 = new BitSet(new long[]{0x0000000C20800000L});
    public static final BitSet FOLLOW_23_in_ruleContainer1824 = new BitSet(new long[]{0x0000000C20000000L});
    public static final BitSet FOLLOW_ruleContainerType_in_ruleContainer1859 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleContainer1872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainer1889 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleContainer1906 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer1923 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleContainer1940 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleContainer1961 = new BitSet(new long[]{0x0000000080001002L});
    public static final BitSet FOLLOW_ruleContainerStyleDefinition_in_ruleContainer1982 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleContainer1996 = new BitSet(new long[]{0x0000001C20C00000L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_ruleContainer2017 = new BitSet(new long[]{0x0000001C20C04000L});
    public static final BitSet FOLLOW_14_in_ruleContainer2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerStyleDefinition_in_entryRuleContainerStyleDefinition2068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerStyleDefinition2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleContainerStyleDefinition2115 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_ruleContainerStyleDefinition2136 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleContainerStyleDefinition2149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_ruleContainerStyleDefinition2170 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleContainerStyleDefinition2185 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_ruleContainerStyleDefinition2206 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleContainerStyleDefinition2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerType_in_entryRuleContainerType2257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerType2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleContainerType2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleContainerType2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_entryRuleContainerColorDefinition2365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerColorDefinition2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleContainerColorDefinition2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_ruleContainerColorDefinition2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode2484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNode2537 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleNode2563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode2580 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNode2597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode2614 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNode2631 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleNode2652 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleNodeStyleDefinition_in_ruleNode2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeStyleDefinition_in_entryRuleNodeStyleDefinition2710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeStyleDefinition2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleNodeStyleDefinition2757 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleNodeStyleDefinition2778 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleNodeStyleDefinition2791 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_ruleNodeStyleDefinition2812 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleNodeStyleDefinition2827 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_ruleNodeStyleDefinition2848 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleNodeStyleDefinition2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_entryRuleSolidColorDefinition2898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolidColorDefinition2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSolidColorDefinition2945 = new BitSet(new long[]{0xFFFF000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleColor_in_ruleSolidColorDefinition2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_entryRuleGradientColorDefinition3002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGradientColorDefinition3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleGradientColorDefinition3049 = new BitSet(new long[]{0xFFFF000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleColor_in_ruleGradientColorDefinition3070 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleGradientColorDefinition3082 = new BitSet(new long[]{0xFFFF000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleColor_in_ruleGradientColorDefinition3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_entryRuleLabelStyleDefinition3139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelStyleDefinition3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleLabelStyleDefinition3186 = new BitSet(new long[]{0x0000702000000000L});
    public static final BitSet FOLLOW_ruleSPExpression_in_ruleLabelStyleDefinition3207 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleLabelStyleDefinition3229 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_ruleLabelStyleDefinition3242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLabelStyleDefinition3259 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleLabelStyleDefinition3284 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleLabelStyleDefinition3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_entryRuleBorderStyleDefinition3366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderStyleDefinition3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBorderStyleDefinition3413 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_ruleBorderStyleDefinition3434 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleBorderStyleDefinition3447 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBorderStyleDefinition3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_entryRuleSPExpression3507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPExpression3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_ruleSPExpression3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_ruleSPExpression3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_ruleSPExpression3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression3653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcceleoExpression3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAcceleoExpression3700 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAcceleoExpression3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef3758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVarRef3805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVarRef3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef3863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRef3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFeatureRef3910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureRef3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_entryRuleMetamodelRef3968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelRef3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMetamodelRef4015 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetamodelRef4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor4073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColorDefinition_in_ruleColor4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColorDefinition_in_entryRulePreDefinedColorDefinition4163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreDefinedColorDefinition4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColor_in_rulePreDefinedColorDefinition4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelUsage_in_entryRuleMetamodelUsage4253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelUsage4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMetamodelUsage4300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetamodelUsage4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePreDefinedColor4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePreDefinedColor4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePreDefinedColor4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePreDefinedColor4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePreDefinedColor4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePreDefinedColor4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePreDefinedColor4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePreDefinedColor4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePreDefinedColor4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePreDefinedColor4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePreDefinedColor4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePreDefinedColor4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePreDefinedColor4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePreDefinedColor4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePreDefinedColor4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePreDefinedColor4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePreDefinedColor4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePreDefinedColor4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePreDefinedColor4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePreDefinedColor4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePreDefinedColor4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePreDefinedColor4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePreDefinedColor4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePreDefinedColor4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePreDefinedColor4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePreDefinedColor4795 = new BitSet(new long[]{0x0000000000000002L});

}