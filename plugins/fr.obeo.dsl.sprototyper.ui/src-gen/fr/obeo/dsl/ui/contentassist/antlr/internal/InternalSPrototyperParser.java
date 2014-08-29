package fr.obeo.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.obeo.dsl.services.SPrototyperGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSPrototyperParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'proto'", "'{'", "'}'", "'qualifier'", "'viewpoint'", "'shortcut'", "'ext'", "'table'", "'root'", "'label'", "'title'", "'element'", "'accessibleThrough'", "'property'", "'expression'", "'acc:'", "'var:'", "'feature:'", "'use'", "'create'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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
    public String getGrammarFileName() { return "../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g"; }


     
     	private SPrototyperGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SPrototyperGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSPrototyper"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:60:1: entryRuleSPrototyper : ruleSPrototyper EOF ;
    public final void entryRuleSPrototyper() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:61:1: ( ruleSPrototyper EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:62:1: ruleSPrototyper EOF
            {
             before(grammarAccess.getSPrototyperRule()); 
            pushFollow(FOLLOW_ruleSPrototyper_in_entryRuleSPrototyper61);
            ruleSPrototyper();

            state._fsp--;

             after(grammarAccess.getSPrototyperRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPrototyper68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSPrototyper"


    // $ANTLR start "ruleSPrototyper"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:69:1: ruleSPrototyper : ( ( rule__SPrototyper__Group__0 ) ) ;
    public final void ruleSPrototyper() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:73:2: ( ( ( rule__SPrototyper__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:74:1: ( ( rule__SPrototyper__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:74:1: ( ( rule__SPrototyper__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:75:1: ( rule__SPrototyper__Group__0 )
            {
             before(grammarAccess.getSPrototyperAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:76:1: ( rule__SPrototyper__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:76:2: rule__SPrototyper__Group__0
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__0_in_ruleSPrototyper94);
            rule__SPrototyper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSPrototyperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSPrototyper"


    // $ANTLR start "entryRuleSPViewpoint"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:88:1: entryRuleSPViewpoint : ruleSPViewpoint EOF ;
    public final void entryRuleSPViewpoint() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:89:1: ( ruleSPViewpoint EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:90:1: ruleSPViewpoint EOF
            {
             before(grammarAccess.getSPViewpointRule()); 
            pushFollow(FOLLOW_ruleSPViewpoint_in_entryRuleSPViewpoint121);
            ruleSPViewpoint();

            state._fsp--;

             after(grammarAccess.getSPViewpointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPViewpoint128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSPViewpoint"


    // $ANTLR start "ruleSPViewpoint"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:97:1: ruleSPViewpoint : ( ( rule__SPViewpoint__Group__0 ) ) ;
    public final void ruleSPViewpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:101:2: ( ( ( rule__SPViewpoint__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:102:1: ( ( rule__SPViewpoint__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:102:1: ( ( rule__SPViewpoint__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:103:1: ( rule__SPViewpoint__Group__0 )
            {
             before(grammarAccess.getSPViewpointAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:104:1: ( rule__SPViewpoint__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:104:2: rule__SPViewpoint__Group__0
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__0_in_ruleSPViewpoint154);
            rule__SPViewpoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSPViewpointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSPViewpoint"


    // $ANTLR start "entryRuleSPRepresentation"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:116:1: entryRuleSPRepresentation : ruleSPRepresentation EOF ;
    public final void entryRuleSPRepresentation() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:117:1: ( ruleSPRepresentation EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:118:1: ruleSPRepresentation EOF
            {
             before(grammarAccess.getSPRepresentationRule()); 
            pushFollow(FOLLOW_ruleSPRepresentation_in_entryRuleSPRepresentation181);
            ruleSPRepresentation();

            state._fsp--;

             after(grammarAccess.getSPRepresentationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPRepresentation188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSPRepresentation"


    // $ANTLR start "ruleSPRepresentation"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:125:1: ruleSPRepresentation : ( ruleSPTable ) ;
    public final void ruleSPRepresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:129:2: ( ( ruleSPTable ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:130:1: ( ruleSPTable )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:130:1: ( ruleSPTable )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:131:1: ruleSPTable
            {
             before(grammarAccess.getSPRepresentationAccess().getSPTableParserRuleCall()); 
            pushFollow(FOLLOW_ruleSPTable_in_ruleSPRepresentation214);
            ruleSPTable();

            state._fsp--;

             after(grammarAccess.getSPRepresentationAccess().getSPTableParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSPRepresentation"


    // $ANTLR start "entryRuleSPTable"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:144:1: entryRuleSPTable : ruleSPTable EOF ;
    public final void entryRuleSPTable() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:145:1: ( ruleSPTable EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:146:1: ruleSPTable EOF
            {
             before(grammarAccess.getSPTableRule()); 
            pushFollow(FOLLOW_ruleSPTable_in_entryRuleSPTable240);
            ruleSPTable();

            state._fsp--;

             after(grammarAccess.getSPTableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPTable247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSPTable"


    // $ANTLR start "ruleSPTable"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:153:1: ruleSPTable : ( ( rule__SPTable__Group__0 ) ) ;
    public final void ruleSPTable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:157:2: ( ( ( rule__SPTable__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:158:1: ( ( rule__SPTable__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:158:1: ( ( rule__SPTable__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:159:1: ( rule__SPTable__Group__0 )
            {
             before(grammarAccess.getSPTableAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:160:1: ( rule__SPTable__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:160:2: rule__SPTable__Group__0
            {
            pushFollow(FOLLOW_rule__SPTable__Group__0_in_ruleSPTable273);
            rule__SPTable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSPTable"


    // $ANTLR start "entryRuleTableElement"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:172:1: entryRuleTableElement : ruleTableElement EOF ;
    public final void entryRuleTableElement() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:173:1: ( ruleTableElement EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:174:1: ruleTableElement EOF
            {
             before(grammarAccess.getTableElementRule()); 
            pushFollow(FOLLOW_ruleTableElement_in_entryRuleTableElement300);
            ruleTableElement();

            state._fsp--;

             after(grammarAccess.getTableElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableElement307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableElement"


    // $ANTLR start "ruleTableElement"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:181:1: ruleTableElement : ( ( rule__TableElement__Group__0 ) ) ;
    public final void ruleTableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:185:2: ( ( ( rule__TableElement__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:186:1: ( ( rule__TableElement__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:186:1: ( ( rule__TableElement__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:187:1: ( rule__TableElement__Group__0 )
            {
             before(grammarAccess.getTableElementAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:188:1: ( rule__TableElement__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:188:2: rule__TableElement__Group__0
            {
            pushFollow(FOLLOW_rule__TableElement__Group__0_in_ruleTableElement333);
            rule__TableElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableElement"


    // $ANTLR start "entryRuleTableProperty"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:200:1: entryRuleTableProperty : ruleTableProperty EOF ;
    public final void entryRuleTableProperty() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:201:1: ( ruleTableProperty EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:202:1: ruleTableProperty EOF
            {
             before(grammarAccess.getTablePropertyRule()); 
            pushFollow(FOLLOW_ruleTableProperty_in_entryRuleTableProperty360);
            ruleTableProperty();

            state._fsp--;

             after(grammarAccess.getTablePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableProperty367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableProperty"


    // $ANTLR start "ruleTableProperty"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:209:1: ruleTableProperty : ( ( rule__TableProperty__Group__0 ) ) ;
    public final void ruleTableProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:213:2: ( ( ( rule__TableProperty__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:214:1: ( ( rule__TableProperty__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:214:1: ( ( rule__TableProperty__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:215:1: ( rule__TableProperty__Group__0 )
            {
             before(grammarAccess.getTablePropertyAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:216:1: ( rule__TableProperty__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:216:2: rule__TableProperty__Group__0
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__0_in_ruleTableProperty393);
            rule__TableProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTablePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableProperty"


    // $ANTLR start "entryRuleSPExpression"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:228:1: entryRuleSPExpression : ruleSPExpression EOF ;
    public final void entryRuleSPExpression() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:229:1: ( ruleSPExpression EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:230:1: ruleSPExpression EOF
            {
             before(grammarAccess.getSPExpressionRule()); 
            pushFollow(FOLLOW_ruleSPExpression_in_entryRuleSPExpression420);
            ruleSPExpression();

            state._fsp--;

             after(grammarAccess.getSPExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPExpression427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSPExpression"


    // $ANTLR start "ruleSPExpression"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:237:1: ruleSPExpression : ( ( rule__SPExpression__Alternatives ) ) ;
    public final void ruleSPExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:241:2: ( ( ( rule__SPExpression__Alternatives ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:242:1: ( ( rule__SPExpression__Alternatives ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:242:1: ( ( rule__SPExpression__Alternatives ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:243:1: ( rule__SPExpression__Alternatives )
            {
             before(grammarAccess.getSPExpressionAccess().getAlternatives()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:244:1: ( rule__SPExpression__Alternatives )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:244:2: rule__SPExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__SPExpression__Alternatives_in_ruleSPExpression453);
            rule__SPExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSPExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSPExpression"


    // $ANTLR start "entryRuleAcceleoExpression"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:256:1: entryRuleAcceleoExpression : ruleAcceleoExpression EOF ;
    public final void entryRuleAcceleoExpression() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:257:1: ( ruleAcceleoExpression EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:258:1: ruleAcceleoExpression EOF
            {
             before(grammarAccess.getAcceleoExpressionRule()); 
            pushFollow(FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression480);
            ruleAcceleoExpression();

            state._fsp--;

             after(grammarAccess.getAcceleoExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcceleoExpression487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAcceleoExpression"


    // $ANTLR start "ruleAcceleoExpression"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:265:1: ruleAcceleoExpression : ( ( rule__AcceleoExpression__Group__0 ) ) ;
    public final void ruleAcceleoExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:269:2: ( ( ( rule__AcceleoExpression__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:270:1: ( ( rule__AcceleoExpression__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:270:1: ( ( rule__AcceleoExpression__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:271:1: ( rule__AcceleoExpression__Group__0 )
            {
             before(grammarAccess.getAcceleoExpressionAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:272:1: ( rule__AcceleoExpression__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:272:2: rule__AcceleoExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__Group__0_in_ruleAcceleoExpression513);
            rule__AcceleoExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAcceleoExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAcceleoExpression"


    // $ANTLR start "entryRuleVarRef"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:284:1: entryRuleVarRef : ruleVarRef EOF ;
    public final void entryRuleVarRef() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:285:1: ( ruleVarRef EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:286:1: ruleVarRef EOF
            {
             before(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef540);
            ruleVarRef();

            state._fsp--;

             after(grammarAccess.getVarRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:293:1: ruleVarRef : ( ( rule__VarRef__Group__0 ) ) ;
    public final void ruleVarRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:297:2: ( ( ( rule__VarRef__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:298:1: ( ( rule__VarRef__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:298:1: ( ( rule__VarRef__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:299:1: ( rule__VarRef__Group__0 )
            {
             before(grammarAccess.getVarRefAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:300:1: ( rule__VarRef__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:300:2: rule__VarRef__Group__0
            {
            pushFollow(FOLLOW_rule__VarRef__Group__0_in_ruleVarRef573);
            rule__VarRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleFeatureRef"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:312:1: entryRuleFeatureRef : ruleFeatureRef EOF ;
    public final void entryRuleFeatureRef() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:313:1: ( ruleFeatureRef EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:314:1: ruleFeatureRef EOF
            {
             before(grammarAccess.getFeatureRefRule()); 
            pushFollow(FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef600);
            ruleFeatureRef();

            state._fsp--;

             after(grammarAccess.getFeatureRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRef607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureRef"


    // $ANTLR start "ruleFeatureRef"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:321:1: ruleFeatureRef : ( ( rule__FeatureRef__Group__0 ) ) ;
    public final void ruleFeatureRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:325:2: ( ( ( rule__FeatureRef__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:326:1: ( ( rule__FeatureRef__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:326:1: ( ( rule__FeatureRef__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:327:1: ( rule__FeatureRef__Group__0 )
            {
             before(grammarAccess.getFeatureRefAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:328:1: ( rule__FeatureRef__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:328:2: rule__FeatureRef__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureRef__Group__0_in_ruleFeatureRef633);
            rule__FeatureRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureRef"


    // $ANTLR start "entryRuleMetamodelRef"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:340:1: entryRuleMetamodelRef : ruleMetamodelRef EOF ;
    public final void entryRuleMetamodelRef() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:341:1: ( ruleMetamodelRef EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:342:1: ruleMetamodelRef EOF
            {
             before(grammarAccess.getMetamodelRefRule()); 
            pushFollow(FOLLOW_ruleMetamodelRef_in_entryRuleMetamodelRef660);
            ruleMetamodelRef();

            state._fsp--;

             after(grammarAccess.getMetamodelRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelRef667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetamodelRef"


    // $ANTLR start "ruleMetamodelRef"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:349:1: ruleMetamodelRef : ( ( rule__MetamodelRef__Group__0 ) ) ;
    public final void ruleMetamodelRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:353:2: ( ( ( rule__MetamodelRef__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:354:1: ( ( rule__MetamodelRef__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:354:1: ( ( rule__MetamodelRef__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:355:1: ( rule__MetamodelRef__Group__0 )
            {
             before(grammarAccess.getMetamodelRefAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:356:1: ( rule__MetamodelRef__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:356:2: rule__MetamodelRef__Group__0
            {
            pushFollow(FOLLOW_rule__MetamodelRef__Group__0_in_ruleMetamodelRef693);
            rule__MetamodelRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodelRef"


    // $ANTLR start "rule__SPExpression__Alternatives"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:368:1: rule__SPExpression__Alternatives : ( ( ruleAcceleoExpression ) | ( ruleVarRef ) | ( ruleFeatureRef ) );
    public final void rule__SPExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:372:1: ( ( ruleAcceleoExpression ) | ( ruleVarRef ) | ( ruleFeatureRef ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:373:1: ( ruleAcceleoExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:373:1: ( ruleAcceleoExpression )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:374:1: ruleAcceleoExpression
                    {
                     before(grammarAccess.getSPExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAcceleoExpression_in_rule__SPExpression__Alternatives729);
                    ruleAcceleoExpression();

                    state._fsp--;

                     after(grammarAccess.getSPExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:379:6: ( ruleVarRef )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:379:6: ( ruleVarRef )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:380:1: ruleVarRef
                    {
                     before(grammarAccess.getSPExpressionAccess().getVarRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVarRef_in_rule__SPExpression__Alternatives746);
                    ruleVarRef();

                    state._fsp--;

                     after(grammarAccess.getSPExpressionAccess().getVarRefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:385:6: ( ruleFeatureRef )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:385:6: ( ruleFeatureRef )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:386:1: ruleFeatureRef
                    {
                     before(grammarAccess.getSPExpressionAccess().getFeatureRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFeatureRef_in_rule__SPExpression__Alternatives763);
                    ruleFeatureRef();

                    state._fsp--;

                     after(grammarAccess.getSPExpressionAccess().getFeatureRefParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPExpression__Alternatives"


    // $ANTLR start "rule__SPrototyper__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:398:1: rule__SPrototyper__Group__0 : rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1 ;
    public final void rule__SPrototyper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:402:1: ( rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:403:2: rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__0__Impl_in_rule__SPrototyper__Group__0793);
            rule__SPrototyper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__1_in_rule__SPrototyper__Group__0796);
            rule__SPrototyper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__0"


    // $ANTLR start "rule__SPrototyper__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:410:1: rule__SPrototyper__Group__0__Impl : ( 'proto' ) ;
    public final void rule__SPrototyper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:414:1: ( ( 'proto' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:415:1: ( 'proto' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:415:1: ( 'proto' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:416:1: 'proto'
            {
             before(grammarAccess.getSPrototyperAccess().getProtoKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__SPrototyper__Group__0__Impl824); 
             after(grammarAccess.getSPrototyperAccess().getProtoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__0__Impl"


    // $ANTLR start "rule__SPrototyper__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:429:1: rule__SPrototyper__Group__1 : rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2 ;
    public final void rule__SPrototyper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:433:1: ( rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:434:2: rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__1__Impl_in_rule__SPrototyper__Group__1855);
            rule__SPrototyper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__2_in_rule__SPrototyper__Group__1858);
            rule__SPrototyper__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__1"


    // $ANTLR start "rule__SPrototyper__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:441:1: rule__SPrototyper__Group__1__Impl : ( ( rule__SPrototyper__NameAssignment_1 ) ) ;
    public final void rule__SPrototyper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:445:1: ( ( ( rule__SPrototyper__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:446:1: ( ( rule__SPrototyper__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:446:1: ( ( rule__SPrototyper__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:447:1: ( rule__SPrototyper__NameAssignment_1 )
            {
             before(grammarAccess.getSPrototyperAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:448:1: ( rule__SPrototyper__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:448:2: rule__SPrototyper__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPrototyper__NameAssignment_1_in_rule__SPrototyper__Group__1__Impl885);
            rule__SPrototyper__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSPrototyperAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__1__Impl"


    // $ANTLR start "rule__SPrototyper__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:458:1: rule__SPrototyper__Group__2 : rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3 ;
    public final void rule__SPrototyper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:462:1: ( rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:463:2: rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__2__Impl_in_rule__SPrototyper__Group__2915);
            rule__SPrototyper__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__3_in_rule__SPrototyper__Group__2918);
            rule__SPrototyper__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__2"


    // $ANTLR start "rule__SPrototyper__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:470:1: rule__SPrototyper__Group__2__Impl : ( '{' ) ;
    public final void rule__SPrototyper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:474:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:475:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:475:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:476:1: '{'
            {
             before(grammarAccess.getSPrototyperAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__SPrototyper__Group__2__Impl946); 
             after(grammarAccess.getSPrototyperAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__2__Impl"


    // $ANTLR start "rule__SPrototyper__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:489:1: rule__SPrototyper__Group__3 : rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4 ;
    public final void rule__SPrototyper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:493:1: ( rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:494:2: rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__3__Impl_in_rule__SPrototyper__Group__3977);
            rule__SPrototyper__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__4_in_rule__SPrototyper__Group__3980);
            rule__SPrototyper__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__3"


    // $ANTLR start "rule__SPrototyper__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:501:1: rule__SPrototyper__Group__3__Impl : ( ( rule__SPrototyper__Group_3__0 )? ) ;
    public final void rule__SPrototyper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:505:1: ( ( ( rule__SPrototyper__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:506:1: ( ( rule__SPrototyper__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:506:1: ( ( rule__SPrototyper__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:507:1: ( rule__SPrototyper__Group_3__0 )?
            {
             before(grammarAccess.getSPrototyperAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:508:1: ( rule__SPrototyper__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:508:2: rule__SPrototyper__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPrototyper__Group_3__0_in_rule__SPrototyper__Group__3__Impl1007);
                    rule__SPrototyper__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSPrototyperAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__3__Impl"


    // $ANTLR start "rule__SPrototyper__Group__4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:518:1: rule__SPrototyper__Group__4 : rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5 ;
    public final void rule__SPrototyper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:522:1: ( rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:523:2: rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__4__Impl_in_rule__SPrototyper__Group__41038);
            rule__SPrototyper__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__5_in_rule__SPrototyper__Group__41041);
            rule__SPrototyper__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__4"


    // $ANTLR start "rule__SPrototyper__Group__4__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:530:1: rule__SPrototyper__Group__4__Impl : ( ( rule__SPrototyper__ViewpointsAssignment_4 )* ) ;
    public final void rule__SPrototyper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:534:1: ( ( ( rule__SPrototyper__ViewpointsAssignment_4 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:535:1: ( ( rule__SPrototyper__ViewpointsAssignment_4 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:535:1: ( ( rule__SPrototyper__ViewpointsAssignment_4 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:536:1: ( rule__SPrototyper__ViewpointsAssignment_4 )*
            {
             before(grammarAccess.getSPrototyperAccess().getViewpointsAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:537:1: ( rule__SPrototyper__ViewpointsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:537:2: rule__SPrototyper__ViewpointsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SPrototyper__ViewpointsAssignment_4_in_rule__SPrototyper__Group__4__Impl1068);
            	    rule__SPrototyper__ViewpointsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSPrototyperAccess().getViewpointsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__4__Impl"


    // $ANTLR start "rule__SPrototyper__Group__5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:547:1: rule__SPrototyper__Group__5 : rule__SPrototyper__Group__5__Impl ;
    public final void rule__SPrototyper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:551:1: ( rule__SPrototyper__Group__5__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:552:2: rule__SPrototyper__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__5__Impl_in_rule__SPrototyper__Group__51099);
            rule__SPrototyper__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__5"


    // $ANTLR start "rule__SPrototyper__Group__5__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:558:1: rule__SPrototyper__Group__5__Impl : ( '}' ) ;
    public final void rule__SPrototyper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:562:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:563:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:563:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:564:1: '}'
            {
             before(grammarAccess.getSPrototyperAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__SPrototyper__Group__5__Impl1127); 
             after(grammarAccess.getSPrototyperAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__5__Impl"


    // $ANTLR start "rule__SPrototyper__Group_3__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:589:1: rule__SPrototyper__Group_3__0 : rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1 ;
    public final void rule__SPrototyper__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:593:1: ( rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:594:2: rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group_3__0__Impl_in_rule__SPrototyper__Group_3__01170);
            rule__SPrototyper__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group_3__1_in_rule__SPrototyper__Group_3__01173);
            rule__SPrototyper__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group_3__0"


    // $ANTLR start "rule__SPrototyper__Group_3__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:601:1: rule__SPrototyper__Group_3__0__Impl : ( 'qualifier' ) ;
    public final void rule__SPrototyper__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:605:1: ( ( 'qualifier' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:606:1: ( 'qualifier' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:606:1: ( 'qualifier' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:607:1: 'qualifier'
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__SPrototyper__Group_3__0__Impl1201); 
             after(grammarAccess.getSPrototyperAccess().getQualifierKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group_3__0__Impl"


    // $ANTLR start "rule__SPrototyper__Group_3__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:620:1: rule__SPrototyper__Group_3__1 : rule__SPrototyper__Group_3__1__Impl ;
    public final void rule__SPrototyper__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:624:1: ( rule__SPrototyper__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:625:2: rule__SPrototyper__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group_3__1__Impl_in_rule__SPrototyper__Group_3__11232);
            rule__SPrototyper__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group_3__1"


    // $ANTLR start "rule__SPrototyper__Group_3__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:631:1: rule__SPrototyper__Group_3__1__Impl : ( ( rule__SPrototyper__QualifierAssignment_3_1 ) ) ;
    public final void rule__SPrototyper__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:635:1: ( ( ( rule__SPrototyper__QualifierAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:636:1: ( ( rule__SPrototyper__QualifierAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:636:1: ( ( rule__SPrototyper__QualifierAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:637:1: ( rule__SPrototyper__QualifierAssignment_3_1 )
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:638:1: ( rule__SPrototyper__QualifierAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:638:2: rule__SPrototyper__QualifierAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPrototyper__QualifierAssignment_3_1_in_rule__SPrototyper__Group_3__1__Impl1259);
            rule__SPrototyper__QualifierAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSPrototyperAccess().getQualifierAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group_3__1__Impl"


    // $ANTLR start "rule__SPViewpoint__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:652:1: rule__SPViewpoint__Group__0 : rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1 ;
    public final void rule__SPViewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:656:1: ( rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:657:2: rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__0__Impl_in_rule__SPViewpoint__Group__01293);
            rule__SPViewpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__1_in_rule__SPViewpoint__Group__01296);
            rule__SPViewpoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__0"


    // $ANTLR start "rule__SPViewpoint__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:664:1: rule__SPViewpoint__Group__0__Impl : ( 'viewpoint' ) ;
    public final void rule__SPViewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:668:1: ( ( 'viewpoint' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:669:1: ( 'viewpoint' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:669:1: ( 'viewpoint' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:670:1: 'viewpoint'
            {
             before(grammarAccess.getSPViewpointAccess().getViewpointKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SPViewpoint__Group__0__Impl1324); 
             after(grammarAccess.getSPViewpointAccess().getViewpointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__0__Impl"


    // $ANTLR start "rule__SPViewpoint__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:683:1: rule__SPViewpoint__Group__1 : rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2 ;
    public final void rule__SPViewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:687:1: ( rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:688:2: rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__1__Impl_in_rule__SPViewpoint__Group__11355);
            rule__SPViewpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__2_in_rule__SPViewpoint__Group__11358);
            rule__SPViewpoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__1"


    // $ANTLR start "rule__SPViewpoint__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:695:1: rule__SPViewpoint__Group__1__Impl : ( ( rule__SPViewpoint__NameAssignment_1 ) ) ;
    public final void rule__SPViewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:699:1: ( ( ( rule__SPViewpoint__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:700:1: ( ( rule__SPViewpoint__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:700:1: ( ( rule__SPViewpoint__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:701:1: ( rule__SPViewpoint__NameAssignment_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:702:1: ( rule__SPViewpoint__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:702:2: rule__SPViewpoint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__NameAssignment_1_in_rule__SPViewpoint__Group__1__Impl1385);
            rule__SPViewpoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSPViewpointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__1__Impl"


    // $ANTLR start "rule__SPViewpoint__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:712:1: rule__SPViewpoint__Group__2 : rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3 ;
    public final void rule__SPViewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:716:1: ( rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:717:2: rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__2__Impl_in_rule__SPViewpoint__Group__21415);
            rule__SPViewpoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__3_in_rule__SPViewpoint__Group__21418);
            rule__SPViewpoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__2"


    // $ANTLR start "rule__SPViewpoint__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:724:1: rule__SPViewpoint__Group__2__Impl : ( '{' ) ;
    public final void rule__SPViewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:728:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:729:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:729:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:730:1: '{'
            {
             before(grammarAccess.getSPViewpointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__SPViewpoint__Group__2__Impl1446); 
             after(grammarAccess.getSPViewpointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__2__Impl"


    // $ANTLR start "rule__SPViewpoint__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:743:1: rule__SPViewpoint__Group__3 : rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4 ;
    public final void rule__SPViewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:747:1: ( rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:748:2: rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__3__Impl_in_rule__SPViewpoint__Group__31477);
            rule__SPViewpoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__4_in_rule__SPViewpoint__Group__31480);
            rule__SPViewpoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__3"


    // $ANTLR start "rule__SPViewpoint__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:755:1: rule__SPViewpoint__Group__3__Impl : ( ( rule__SPViewpoint__Group_3__0 )? ) ;
    public final void rule__SPViewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:759:1: ( ( ( rule__SPViewpoint__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:760:1: ( ( rule__SPViewpoint__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:760:1: ( ( rule__SPViewpoint__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:761:1: ( rule__SPViewpoint__Group_3__0 )?
            {
             before(grammarAccess.getSPViewpointAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:762:1: ( rule__SPViewpoint__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:762:2: rule__SPViewpoint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPViewpoint__Group_3__0_in_rule__SPViewpoint__Group__3__Impl1507);
                    rule__SPViewpoint__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSPViewpointAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__3__Impl"


    // $ANTLR start "rule__SPViewpoint__Group__4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:772:1: rule__SPViewpoint__Group__4 : rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5 ;
    public final void rule__SPViewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:776:1: ( rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:777:2: rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__4__Impl_in_rule__SPViewpoint__Group__41538);
            rule__SPViewpoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__5_in_rule__SPViewpoint__Group__41541);
            rule__SPViewpoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__4"


    // $ANTLR start "rule__SPViewpoint__Group__4__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:784:1: rule__SPViewpoint__Group__4__Impl : ( ( rule__SPViewpoint__Group_4__0 )? ) ;
    public final void rule__SPViewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:788:1: ( ( ( rule__SPViewpoint__Group_4__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:789:1: ( ( rule__SPViewpoint__Group_4__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:789:1: ( ( rule__SPViewpoint__Group_4__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:790:1: ( rule__SPViewpoint__Group_4__0 )?
            {
             before(grammarAccess.getSPViewpointAccess().getGroup_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:791:1: ( rule__SPViewpoint__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:791:2: rule__SPViewpoint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SPViewpoint__Group_4__0_in_rule__SPViewpoint__Group__4__Impl1568);
                    rule__SPViewpoint__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSPViewpointAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__4__Impl"


    // $ANTLR start "rule__SPViewpoint__Group__5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:801:1: rule__SPViewpoint__Group__5 : rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6 ;
    public final void rule__SPViewpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:805:1: ( rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:806:2: rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__5__Impl_in_rule__SPViewpoint__Group__51599);
            rule__SPViewpoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__6_in_rule__SPViewpoint__Group__51602);
            rule__SPViewpoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__5"


    // $ANTLR start "rule__SPViewpoint__Group__5__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:813:1: rule__SPViewpoint__Group__5__Impl : ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* ) ;
    public final void rule__SPViewpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:817:1: ( ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:818:1: ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:818:1: ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:819:1: ( rule__SPViewpoint__RepresentationsAssignment_5 )*
            {
             before(grammarAccess.getSPViewpointAccess().getRepresentationsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:820:1: ( rule__SPViewpoint__RepresentationsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:820:2: rule__SPViewpoint__RepresentationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SPViewpoint__RepresentationsAssignment_5_in_rule__SPViewpoint__Group__5__Impl1629);
            	    rule__SPViewpoint__RepresentationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSPViewpointAccess().getRepresentationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__5__Impl"


    // $ANTLR start "rule__SPViewpoint__Group__6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:830:1: rule__SPViewpoint__Group__6 : rule__SPViewpoint__Group__6__Impl ;
    public final void rule__SPViewpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:834:1: ( rule__SPViewpoint__Group__6__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:835:2: rule__SPViewpoint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__6__Impl_in_rule__SPViewpoint__Group__61660);
            rule__SPViewpoint__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__6"


    // $ANTLR start "rule__SPViewpoint__Group__6__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:841:1: rule__SPViewpoint__Group__6__Impl : ( '}' ) ;
    public final void rule__SPViewpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:845:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:846:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:846:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:847:1: '}'
            {
             before(grammarAccess.getSPViewpointAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__SPViewpoint__Group__6__Impl1688); 
             after(grammarAccess.getSPViewpointAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__6__Impl"


    // $ANTLR start "rule__SPViewpoint__Group_3__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:874:1: rule__SPViewpoint__Group_3__0 : rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1 ;
    public final void rule__SPViewpoint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:878:1: ( rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:879:2: rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__0__Impl_in_rule__SPViewpoint__Group_3__01733);
            rule__SPViewpoint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__1_in_rule__SPViewpoint__Group_3__01736);
            rule__SPViewpoint__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group_3__0"


    // $ANTLR start "rule__SPViewpoint__Group_3__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:886:1: rule__SPViewpoint__Group_3__0__Impl : ( 'shortcut' ) ;
    public final void rule__SPViewpoint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:890:1: ( ( 'shortcut' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:891:1: ( 'shortcut' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:891:1: ( 'shortcut' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:892:1: 'shortcut'
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__SPViewpoint__Group_3__0__Impl1764); 
             after(grammarAccess.getSPViewpointAccess().getShortcutKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group_3__0__Impl"


    // $ANTLR start "rule__SPViewpoint__Group_3__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:905:1: rule__SPViewpoint__Group_3__1 : rule__SPViewpoint__Group_3__1__Impl ;
    public final void rule__SPViewpoint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:909:1: ( rule__SPViewpoint__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:910:2: rule__SPViewpoint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__1__Impl_in_rule__SPViewpoint__Group_3__11795);
            rule__SPViewpoint__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group_3__1"


    // $ANTLR start "rule__SPViewpoint__Group_3__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:916:1: rule__SPViewpoint__Group_3__1__Impl : ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) ) ;
    public final void rule__SPViewpoint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:920:1: ( ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:921:1: ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:921:1: ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:922:1: ( rule__SPViewpoint__ShortcutAssignment_3_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:923:1: ( rule__SPViewpoint__ShortcutAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:923:2: rule__SPViewpoint__ShortcutAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__ShortcutAssignment_3_1_in_rule__SPViewpoint__Group_3__1__Impl1822);
            rule__SPViewpoint__ShortcutAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSPViewpointAccess().getShortcutAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group_3__1__Impl"


    // $ANTLR start "rule__SPViewpoint__Group_4__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:937:1: rule__SPViewpoint__Group_4__0 : rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1 ;
    public final void rule__SPViewpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:941:1: ( rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:942:2: rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__0__Impl_in_rule__SPViewpoint__Group_4__01856);
            rule__SPViewpoint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__1_in_rule__SPViewpoint__Group_4__01859);
            rule__SPViewpoint__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group_4__0"


    // $ANTLR start "rule__SPViewpoint__Group_4__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:949:1: rule__SPViewpoint__Group_4__0__Impl : ( 'ext' ) ;
    public final void rule__SPViewpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:953:1: ( ( 'ext' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:954:1: ( 'ext' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:954:1: ( 'ext' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:955:1: 'ext'
            {
             before(grammarAccess.getSPViewpointAccess().getExtKeyword_4_0()); 
            match(input,17,FOLLOW_17_in_rule__SPViewpoint__Group_4__0__Impl1887); 
             after(grammarAccess.getSPViewpointAccess().getExtKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group_4__0__Impl"


    // $ANTLR start "rule__SPViewpoint__Group_4__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:968:1: rule__SPViewpoint__Group_4__1 : rule__SPViewpoint__Group_4__1__Impl ;
    public final void rule__SPViewpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:972:1: ( rule__SPViewpoint__Group_4__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:973:2: rule__SPViewpoint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__1__Impl_in_rule__SPViewpoint__Group_4__11918);
            rule__SPViewpoint__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group_4__1"


    // $ANTLR start "rule__SPViewpoint__Group_4__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:979:1: rule__SPViewpoint__Group_4__1__Impl : ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) ) ;
    public final void rule__SPViewpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:983:1: ( ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:984:1: ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:984:1: ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:985:1: ( rule__SPViewpoint__ExtensionAssignment_4_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getExtensionAssignment_4_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:986:1: ( rule__SPViewpoint__ExtensionAssignment_4_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:986:2: rule__SPViewpoint__ExtensionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__ExtensionAssignment_4_1_in_rule__SPViewpoint__Group_4__1__Impl1945);
            rule__SPViewpoint__ExtensionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSPViewpointAccess().getExtensionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group_4__1__Impl"


    // $ANTLR start "rule__SPTable__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1000:1: rule__SPTable__Group__0 : rule__SPTable__Group__0__Impl rule__SPTable__Group__1 ;
    public final void rule__SPTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1004:1: ( rule__SPTable__Group__0__Impl rule__SPTable__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1005:2: rule__SPTable__Group__0__Impl rule__SPTable__Group__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group__0__Impl_in_rule__SPTable__Group__01979);
            rule__SPTable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__1_in_rule__SPTable__Group__01982);
            rule__SPTable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__0"


    // $ANTLR start "rule__SPTable__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1012:1: rule__SPTable__Group__0__Impl : ( 'table' ) ;
    public final void rule__SPTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1016:1: ( ( 'table' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1017:1: ( 'table' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1017:1: ( 'table' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1018:1: 'table'
            {
             before(grammarAccess.getSPTableAccess().getTableKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__SPTable__Group__0__Impl2010); 
             after(grammarAccess.getSPTableAccess().getTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__0__Impl"


    // $ANTLR start "rule__SPTable__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1031:1: rule__SPTable__Group__1 : rule__SPTable__Group__1__Impl rule__SPTable__Group__2 ;
    public final void rule__SPTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1035:1: ( rule__SPTable__Group__1__Impl rule__SPTable__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1036:2: rule__SPTable__Group__1__Impl rule__SPTable__Group__2
            {
            pushFollow(FOLLOW_rule__SPTable__Group__1__Impl_in_rule__SPTable__Group__12041);
            rule__SPTable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__2_in_rule__SPTable__Group__12044);
            rule__SPTable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__1"


    // $ANTLR start "rule__SPTable__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1043:1: rule__SPTable__Group__1__Impl : ( ( rule__SPTable__NameAssignment_1 ) ) ;
    public final void rule__SPTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1047:1: ( ( ( rule__SPTable__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1048:1: ( ( rule__SPTable__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1048:1: ( ( rule__SPTable__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1049:1: ( rule__SPTable__NameAssignment_1 )
            {
             before(grammarAccess.getSPTableAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1050:1: ( rule__SPTable__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1050:2: rule__SPTable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPTable__NameAssignment_1_in_rule__SPTable__Group__1__Impl2071);
            rule__SPTable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__1__Impl"


    // $ANTLR start "rule__SPTable__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1060:1: rule__SPTable__Group__2 : rule__SPTable__Group__2__Impl rule__SPTable__Group__3 ;
    public final void rule__SPTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1064:1: ( rule__SPTable__Group__2__Impl rule__SPTable__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1065:2: rule__SPTable__Group__2__Impl rule__SPTable__Group__3
            {
            pushFollow(FOLLOW_rule__SPTable__Group__2__Impl_in_rule__SPTable__Group__22101);
            rule__SPTable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__3_in_rule__SPTable__Group__22104);
            rule__SPTable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__2"


    // $ANTLR start "rule__SPTable__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1072:1: rule__SPTable__Group__2__Impl : ( '{' ) ;
    public final void rule__SPTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1076:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1077:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1077:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1078:1: '{'
            {
             before(grammarAccess.getSPTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__SPTable__Group__2__Impl2132); 
             after(grammarAccess.getSPTableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__2__Impl"


    // $ANTLR start "rule__SPTable__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1091:1: rule__SPTable__Group__3 : rule__SPTable__Group__3__Impl rule__SPTable__Group__4 ;
    public final void rule__SPTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1095:1: ( rule__SPTable__Group__3__Impl rule__SPTable__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1096:2: rule__SPTable__Group__3__Impl rule__SPTable__Group__4
            {
            pushFollow(FOLLOW_rule__SPTable__Group__3__Impl_in_rule__SPTable__Group__32163);
            rule__SPTable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__4_in_rule__SPTable__Group__32166);
            rule__SPTable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__3"


    // $ANTLR start "rule__SPTable__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1103:1: rule__SPTable__Group__3__Impl : ( ( rule__SPTable__Group_3__0 )? ) ;
    public final void rule__SPTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1107:1: ( ( ( rule__SPTable__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1108:1: ( ( rule__SPTable__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1108:1: ( ( rule__SPTable__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1109:1: ( rule__SPTable__Group_3__0 )?
            {
             before(grammarAccess.getSPTableAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1110:1: ( rule__SPTable__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1110:2: rule__SPTable__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPTable__Group_3__0_in_rule__SPTable__Group__3__Impl2193);
                    rule__SPTable__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSPTableAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__3__Impl"


    // $ANTLR start "rule__SPTable__Group__4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1120:1: rule__SPTable__Group__4 : rule__SPTable__Group__4__Impl rule__SPTable__Group__5 ;
    public final void rule__SPTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1124:1: ( rule__SPTable__Group__4__Impl rule__SPTable__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1125:2: rule__SPTable__Group__4__Impl rule__SPTable__Group__5
            {
            pushFollow(FOLLOW_rule__SPTable__Group__4__Impl_in_rule__SPTable__Group__42224);
            rule__SPTable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__5_in_rule__SPTable__Group__42227);
            rule__SPTable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__4"


    // $ANTLR start "rule__SPTable__Group__4__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1132:1: rule__SPTable__Group__4__Impl : ( ( rule__SPTable__Group_4__0 )? ) ;
    public final void rule__SPTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1136:1: ( ( ( rule__SPTable__Group_4__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1137:1: ( ( rule__SPTable__Group_4__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1137:1: ( ( rule__SPTable__Group_4__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1138:1: ( rule__SPTable__Group_4__0 )?
            {
             before(grammarAccess.getSPTableAccess().getGroup_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1139:1: ( rule__SPTable__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1139:2: rule__SPTable__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SPTable__Group_4__0_in_rule__SPTable__Group__4__Impl2254);
                    rule__SPTable__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSPTableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__4__Impl"


    // $ANTLR start "rule__SPTable__Group__5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1149:1: rule__SPTable__Group__5 : rule__SPTable__Group__5__Impl rule__SPTable__Group__6 ;
    public final void rule__SPTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1153:1: ( rule__SPTable__Group__5__Impl rule__SPTable__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1154:2: rule__SPTable__Group__5__Impl rule__SPTable__Group__6
            {
            pushFollow(FOLLOW_rule__SPTable__Group__5__Impl_in_rule__SPTable__Group__52285);
            rule__SPTable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__6_in_rule__SPTable__Group__52288);
            rule__SPTable__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__5"


    // $ANTLR start "rule__SPTable__Group__5__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1161:1: rule__SPTable__Group__5__Impl : ( ( ( rule__SPTable__MetamodelsAssignment_5 ) ) ( ( rule__SPTable__MetamodelsAssignment_5 )* ) ) ;
    public final void rule__SPTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1165:1: ( ( ( ( rule__SPTable__MetamodelsAssignment_5 ) ) ( ( rule__SPTable__MetamodelsAssignment_5 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1166:1: ( ( ( rule__SPTable__MetamodelsAssignment_5 ) ) ( ( rule__SPTable__MetamodelsAssignment_5 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1166:1: ( ( ( rule__SPTable__MetamodelsAssignment_5 ) ) ( ( rule__SPTable__MetamodelsAssignment_5 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1167:1: ( ( rule__SPTable__MetamodelsAssignment_5 ) ) ( ( rule__SPTable__MetamodelsAssignment_5 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1167:1: ( ( rule__SPTable__MetamodelsAssignment_5 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1168:1: ( rule__SPTable__MetamodelsAssignment_5 )
            {
             before(grammarAccess.getSPTableAccess().getMetamodelsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1169:1: ( rule__SPTable__MetamodelsAssignment_5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1169:2: rule__SPTable__MetamodelsAssignment_5
            {
            pushFollow(FOLLOW_rule__SPTable__MetamodelsAssignment_5_in_rule__SPTable__Group__5__Impl2317);
            rule__SPTable__MetamodelsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getMetamodelsAssignment_5()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1172:1: ( ( rule__SPTable__MetamodelsAssignment_5 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1173:1: ( rule__SPTable__MetamodelsAssignment_5 )*
            {
             before(grammarAccess.getSPTableAccess().getMetamodelsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1174:1: ( rule__SPTable__MetamodelsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1174:2: rule__SPTable__MetamodelsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__MetamodelsAssignment_5_in_rule__SPTable__Group__5__Impl2329);
            	    rule__SPTable__MetamodelsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSPTableAccess().getMetamodelsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__5__Impl"


    // $ANTLR start "rule__SPTable__Group__6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1185:1: rule__SPTable__Group__6 : rule__SPTable__Group__6__Impl rule__SPTable__Group__7 ;
    public final void rule__SPTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1189:1: ( rule__SPTable__Group__6__Impl rule__SPTable__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1190:2: rule__SPTable__Group__6__Impl rule__SPTable__Group__7
            {
            pushFollow(FOLLOW_rule__SPTable__Group__6__Impl_in_rule__SPTable__Group__62362);
            rule__SPTable__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__7_in_rule__SPTable__Group__62365);
            rule__SPTable__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__6"


    // $ANTLR start "rule__SPTable__Group__6__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1197:1: rule__SPTable__Group__6__Impl : ( 'root' ) ;
    public final void rule__SPTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1201:1: ( ( 'root' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1202:1: ( 'root' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1202:1: ( 'root' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1203:1: 'root'
            {
             before(grammarAccess.getSPTableAccess().getRootKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__SPTable__Group__6__Impl2393); 
             after(grammarAccess.getSPTableAccess().getRootKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__6__Impl"


    // $ANTLR start "rule__SPTable__Group__7"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1216:1: rule__SPTable__Group__7 : rule__SPTable__Group__7__Impl rule__SPTable__Group__8 ;
    public final void rule__SPTable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1220:1: ( rule__SPTable__Group__7__Impl rule__SPTable__Group__8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1221:2: rule__SPTable__Group__7__Impl rule__SPTable__Group__8
            {
            pushFollow(FOLLOW_rule__SPTable__Group__7__Impl_in_rule__SPTable__Group__72424);
            rule__SPTable__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__8_in_rule__SPTable__Group__72427);
            rule__SPTable__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__7"


    // $ANTLR start "rule__SPTable__Group__7__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1228:1: rule__SPTable__Group__7__Impl : ( ( rule__SPTable__RootAssignment_7 ) ) ;
    public final void rule__SPTable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1232:1: ( ( ( rule__SPTable__RootAssignment_7 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1233:1: ( ( rule__SPTable__RootAssignment_7 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1233:1: ( ( rule__SPTable__RootAssignment_7 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1234:1: ( rule__SPTable__RootAssignment_7 )
            {
             before(grammarAccess.getSPTableAccess().getRootAssignment_7()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1235:1: ( rule__SPTable__RootAssignment_7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1235:2: rule__SPTable__RootAssignment_7
            {
            pushFollow(FOLLOW_rule__SPTable__RootAssignment_7_in_rule__SPTable__Group__7__Impl2454);
            rule__SPTable__RootAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getRootAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__7__Impl"


    // $ANTLR start "rule__SPTable__Group__8"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1245:1: rule__SPTable__Group__8 : rule__SPTable__Group__8__Impl rule__SPTable__Group__9 ;
    public final void rule__SPTable__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1249:1: ( rule__SPTable__Group__8__Impl rule__SPTable__Group__9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1250:2: rule__SPTable__Group__8__Impl rule__SPTable__Group__9
            {
            pushFollow(FOLLOW_rule__SPTable__Group__8__Impl_in_rule__SPTable__Group__82484);
            rule__SPTable__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__9_in_rule__SPTable__Group__82487);
            rule__SPTable__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__8"


    // $ANTLR start "rule__SPTable__Group__8__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1257:1: rule__SPTable__Group__8__Impl : ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) ) ;
    public final void rule__SPTable__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1261:1: ( ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1262:1: ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1262:1: ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1263:1: ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1263:1: ( ( rule__SPTable__ElementsAssignment_8 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1264:1: ( rule__SPTable__ElementsAssignment_8 )
            {
             before(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1265:1: ( rule__SPTable__ElementsAssignment_8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1265:2: rule__SPTable__ElementsAssignment_8
            {
            pushFollow(FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl2516);
            rule__SPTable__ElementsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1268:1: ( ( rule__SPTable__ElementsAssignment_8 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1269:1: ( rule__SPTable__ElementsAssignment_8 )*
            {
             before(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1270:1: ( rule__SPTable__ElementsAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1270:2: rule__SPTable__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl2528);
            	    rule__SPTable__ElementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__8__Impl"


    // $ANTLR start "rule__SPTable__Group__9"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1281:1: rule__SPTable__Group__9 : rule__SPTable__Group__9__Impl rule__SPTable__Group__10 ;
    public final void rule__SPTable__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1285:1: ( rule__SPTable__Group__9__Impl rule__SPTable__Group__10 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1286:2: rule__SPTable__Group__9__Impl rule__SPTable__Group__10
            {
            pushFollow(FOLLOW_rule__SPTable__Group__9__Impl_in_rule__SPTable__Group__92561);
            rule__SPTable__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__10_in_rule__SPTable__Group__92564);
            rule__SPTable__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__9"


    // $ANTLR start "rule__SPTable__Group__9__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1293:1: rule__SPTable__Group__9__Impl : ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) ) ;
    public final void rule__SPTable__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1297:1: ( ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1298:1: ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1298:1: ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1299:1: ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1299:1: ( ( rule__SPTable__PropertiesAssignment_9 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1300:1: ( rule__SPTable__PropertiesAssignment_9 )
            {
             before(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1301:1: ( rule__SPTable__PropertiesAssignment_9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1301:2: rule__SPTable__PropertiesAssignment_9
            {
            pushFollow(FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl2593);
            rule__SPTable__PropertiesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1304:1: ( ( rule__SPTable__PropertiesAssignment_9 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1305:1: ( rule__SPTable__PropertiesAssignment_9 )*
            {
             before(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1306:1: ( rule__SPTable__PropertiesAssignment_9 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1306:2: rule__SPTable__PropertiesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl2605);
            	    rule__SPTable__PropertiesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__9__Impl"


    // $ANTLR start "rule__SPTable__Group__10"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1317:1: rule__SPTable__Group__10 : rule__SPTable__Group__10__Impl ;
    public final void rule__SPTable__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1321:1: ( rule__SPTable__Group__10__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1322:2: rule__SPTable__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group__10__Impl_in_rule__SPTable__Group__102638);
            rule__SPTable__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__10"


    // $ANTLR start "rule__SPTable__Group__10__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1328:1: rule__SPTable__Group__10__Impl : ( '}' ) ;
    public final void rule__SPTable__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1332:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1333:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1333:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1334:1: '}'
            {
             before(grammarAccess.getSPTableAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_13_in_rule__SPTable__Group__10__Impl2666); 
             after(grammarAccess.getSPTableAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group__10__Impl"


    // $ANTLR start "rule__SPTable__Group_3__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1369:1: rule__SPTable__Group_3__0 : rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1 ;
    public final void rule__SPTable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1373:1: ( rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1374:2: rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group_3__0__Impl_in_rule__SPTable__Group_3__02719);
            rule__SPTable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group_3__1_in_rule__SPTable__Group_3__02722);
            rule__SPTable__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group_3__0"


    // $ANTLR start "rule__SPTable__Group_3__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1381:1: rule__SPTable__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__SPTable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1385:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1386:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1386:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1387:1: 'label'
            {
             before(grammarAccess.getSPTableAccess().getLabelKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__SPTable__Group_3__0__Impl2750); 
             after(grammarAccess.getSPTableAccess().getLabelKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group_3__0__Impl"


    // $ANTLR start "rule__SPTable__Group_3__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1400:1: rule__SPTable__Group_3__1 : rule__SPTable__Group_3__1__Impl ;
    public final void rule__SPTable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1404:1: ( rule__SPTable__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1405:2: rule__SPTable__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group_3__1__Impl_in_rule__SPTable__Group_3__12781);
            rule__SPTable__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group_3__1"


    // $ANTLR start "rule__SPTable__Group_3__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1411:1: rule__SPTable__Group_3__1__Impl : ( ( rule__SPTable__LabelAssignment_3_1 ) ) ;
    public final void rule__SPTable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1415:1: ( ( ( rule__SPTable__LabelAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1416:1: ( ( rule__SPTable__LabelAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1416:1: ( ( rule__SPTable__LabelAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1417:1: ( rule__SPTable__LabelAssignment_3_1 )
            {
             before(grammarAccess.getSPTableAccess().getLabelAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1418:1: ( rule__SPTable__LabelAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1418:2: rule__SPTable__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPTable__LabelAssignment_3_1_in_rule__SPTable__Group_3__1__Impl2808);
            rule__SPTable__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getLabelAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group_3__1__Impl"


    // $ANTLR start "rule__SPTable__Group_4__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1432:1: rule__SPTable__Group_4__0 : rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1 ;
    public final void rule__SPTable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1436:1: ( rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1437:2: rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group_4__0__Impl_in_rule__SPTable__Group_4__02842);
            rule__SPTable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group_4__1_in_rule__SPTable__Group_4__02845);
            rule__SPTable__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group_4__0"


    // $ANTLR start "rule__SPTable__Group_4__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1444:1: rule__SPTable__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__SPTable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1448:1: ( ( 'title' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1449:1: ( 'title' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1449:1: ( 'title' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1450:1: 'title'
            {
             before(grammarAccess.getSPTableAccess().getTitleKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__SPTable__Group_4__0__Impl2873); 
             after(grammarAccess.getSPTableAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group_4__0__Impl"


    // $ANTLR start "rule__SPTable__Group_4__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1463:1: rule__SPTable__Group_4__1 : rule__SPTable__Group_4__1__Impl ;
    public final void rule__SPTable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1467:1: ( rule__SPTable__Group_4__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1468:2: rule__SPTable__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group_4__1__Impl_in_rule__SPTable__Group_4__12904);
            rule__SPTable__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group_4__1"


    // $ANTLR start "rule__SPTable__Group_4__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1474:1: rule__SPTable__Group_4__1__Impl : ( ( rule__SPTable__TitleAssignment_4_1 ) ) ;
    public final void rule__SPTable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1478:1: ( ( ( rule__SPTable__TitleAssignment_4_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1479:1: ( ( rule__SPTable__TitleAssignment_4_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1479:1: ( ( rule__SPTable__TitleAssignment_4_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1480:1: ( rule__SPTable__TitleAssignment_4_1 )
            {
             before(grammarAccess.getSPTableAccess().getTitleAssignment_4_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1481:1: ( rule__SPTable__TitleAssignment_4_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1481:2: rule__SPTable__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SPTable__TitleAssignment_4_1_in_rule__SPTable__Group_4__1__Impl2931);
            rule__SPTable__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__Group_4__1__Impl"


    // $ANTLR start "rule__TableElement__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1495:1: rule__TableElement__Group__0 : rule__TableElement__Group__0__Impl rule__TableElement__Group__1 ;
    public final void rule__TableElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1499:1: ( rule__TableElement__Group__0__Impl rule__TableElement__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1500:2: rule__TableElement__Group__0__Impl rule__TableElement__Group__1
            {
            pushFollow(FOLLOW_rule__TableElement__Group__0__Impl_in_rule__TableElement__Group__02965);
            rule__TableElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__1_in_rule__TableElement__Group__02968);
            rule__TableElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__0"


    // $ANTLR start "rule__TableElement__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1507:1: rule__TableElement__Group__0__Impl : ( 'element' ) ;
    public final void rule__TableElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1511:1: ( ( 'element' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1512:1: ( 'element' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1512:1: ( 'element' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1513:1: 'element'
            {
             before(grammarAccess.getTableElementAccess().getElementKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__TableElement__Group__0__Impl2996); 
             after(grammarAccess.getTableElementAccess().getElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__0__Impl"


    // $ANTLR start "rule__TableElement__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1526:1: rule__TableElement__Group__1 : rule__TableElement__Group__1__Impl rule__TableElement__Group__2 ;
    public final void rule__TableElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1530:1: ( rule__TableElement__Group__1__Impl rule__TableElement__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1531:2: rule__TableElement__Group__1__Impl rule__TableElement__Group__2
            {
            pushFollow(FOLLOW_rule__TableElement__Group__1__Impl_in_rule__TableElement__Group__13027);
            rule__TableElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__2_in_rule__TableElement__Group__13030);
            rule__TableElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__1"


    // $ANTLR start "rule__TableElement__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1538:1: rule__TableElement__Group__1__Impl : ( ( rule__TableElement__EClassAssignment_1 ) ) ;
    public final void rule__TableElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1542:1: ( ( ( rule__TableElement__EClassAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1543:1: ( ( rule__TableElement__EClassAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1543:1: ( ( rule__TableElement__EClassAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1544:1: ( rule__TableElement__EClassAssignment_1 )
            {
             before(grammarAccess.getTableElementAccess().getEClassAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1545:1: ( rule__TableElement__EClassAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1545:2: rule__TableElement__EClassAssignment_1
            {
            pushFollow(FOLLOW_rule__TableElement__EClassAssignment_1_in_rule__TableElement__Group__1__Impl3057);
            rule__TableElement__EClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getEClassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__1__Impl"


    // $ANTLR start "rule__TableElement__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1555:1: rule__TableElement__Group__2 : rule__TableElement__Group__2__Impl rule__TableElement__Group__3 ;
    public final void rule__TableElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1559:1: ( rule__TableElement__Group__2__Impl rule__TableElement__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1560:2: rule__TableElement__Group__2__Impl rule__TableElement__Group__3
            {
            pushFollow(FOLLOW_rule__TableElement__Group__2__Impl_in_rule__TableElement__Group__23087);
            rule__TableElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__3_in_rule__TableElement__Group__23090);
            rule__TableElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__2"


    // $ANTLR start "rule__TableElement__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1567:1: rule__TableElement__Group__2__Impl : ( 'accessibleThrough' ) ;
    public final void rule__TableElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1571:1: ( ( 'accessibleThrough' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1572:1: ( 'accessibleThrough' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1572:1: ( 'accessibleThrough' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1573:1: 'accessibleThrough'
            {
             before(grammarAccess.getTableElementAccess().getAccessibleThroughKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__TableElement__Group__2__Impl3118); 
             after(grammarAccess.getTableElementAccess().getAccessibleThroughKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__2__Impl"


    // $ANTLR start "rule__TableElement__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1586:1: rule__TableElement__Group__3 : rule__TableElement__Group__3__Impl rule__TableElement__Group__4 ;
    public final void rule__TableElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1590:1: ( rule__TableElement__Group__3__Impl rule__TableElement__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1591:2: rule__TableElement__Group__3__Impl rule__TableElement__Group__4
            {
            pushFollow(FOLLOW_rule__TableElement__Group__3__Impl_in_rule__TableElement__Group__33149);
            rule__TableElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__4_in_rule__TableElement__Group__33152);
            rule__TableElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__3"


    // $ANTLR start "rule__TableElement__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1598:1: rule__TableElement__Group__3__Impl : ( ( rule__TableElement__ExpressionAssignment_3 ) ) ;
    public final void rule__TableElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1602:1: ( ( ( rule__TableElement__ExpressionAssignment_3 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1603:1: ( ( rule__TableElement__ExpressionAssignment_3 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1603:1: ( ( rule__TableElement__ExpressionAssignment_3 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1604:1: ( rule__TableElement__ExpressionAssignment_3 )
            {
             before(grammarAccess.getTableElementAccess().getExpressionAssignment_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1605:1: ( rule__TableElement__ExpressionAssignment_3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1605:2: rule__TableElement__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__TableElement__ExpressionAssignment_3_in_rule__TableElement__Group__3__Impl3179);
            rule__TableElement__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__3__Impl"


    // $ANTLR start "rule__TableElement__Group__4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1615:1: rule__TableElement__Group__4 : rule__TableElement__Group__4__Impl rule__TableElement__Group__5 ;
    public final void rule__TableElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1619:1: ( rule__TableElement__Group__4__Impl rule__TableElement__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1620:2: rule__TableElement__Group__4__Impl rule__TableElement__Group__5
            {
            pushFollow(FOLLOW_rule__TableElement__Group__4__Impl_in_rule__TableElement__Group__43209);
            rule__TableElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__5_in_rule__TableElement__Group__43212);
            rule__TableElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__4"


    // $ANTLR start "rule__TableElement__Group__4__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1627:1: rule__TableElement__Group__4__Impl : ( ( rule__TableElement__CanCreateAssignment_4 )? ) ;
    public final void rule__TableElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1631:1: ( ( ( rule__TableElement__CanCreateAssignment_4 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1632:1: ( ( rule__TableElement__CanCreateAssignment_4 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1632:1: ( ( rule__TableElement__CanCreateAssignment_4 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1633:1: ( rule__TableElement__CanCreateAssignment_4 )?
            {
             before(grammarAccess.getTableElementAccess().getCanCreateAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1634:1: ( rule__TableElement__CanCreateAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1634:2: rule__TableElement__CanCreateAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TableElement__CanCreateAssignment_4_in_rule__TableElement__Group__4__Impl3239);
                    rule__TableElement__CanCreateAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableElementAccess().getCanCreateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__4__Impl"


    // $ANTLR start "rule__TableElement__Group__5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1644:1: rule__TableElement__Group__5 : rule__TableElement__Group__5__Impl ;
    public final void rule__TableElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1648:1: ( rule__TableElement__Group__5__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1649:2: rule__TableElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__TableElement__Group__5__Impl_in_rule__TableElement__Group__53270);
            rule__TableElement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__5"


    // $ANTLR start "rule__TableElement__Group__5__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1655:1: rule__TableElement__Group__5__Impl : ( ( rule__TableElement__Group_5__0 )? ) ;
    public final void rule__TableElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1659:1: ( ( ( rule__TableElement__Group_5__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1660:1: ( ( rule__TableElement__Group_5__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1660:1: ( ( rule__TableElement__Group_5__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1661:1: ( rule__TableElement__Group_5__0 )?
            {
             before(grammarAccess.getTableElementAccess().getGroup_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1662:1: ( rule__TableElement__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1662:2: rule__TableElement__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__TableElement__Group_5__0_in_rule__TableElement__Group__5__Impl3297);
                    rule__TableElement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableElementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group__5__Impl"


    // $ANTLR start "rule__TableElement__Group_5__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1684:1: rule__TableElement__Group_5__0 : rule__TableElement__Group_5__0__Impl rule__TableElement__Group_5__1 ;
    public final void rule__TableElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1688:1: ( rule__TableElement__Group_5__0__Impl rule__TableElement__Group_5__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1689:2: rule__TableElement__Group_5__0__Impl rule__TableElement__Group_5__1
            {
            pushFollow(FOLLOW_rule__TableElement__Group_5__0__Impl_in_rule__TableElement__Group_5__03340);
            rule__TableElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group_5__1_in_rule__TableElement__Group_5__03343);
            rule__TableElement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group_5__0"


    // $ANTLR start "rule__TableElement__Group_5__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1696:1: rule__TableElement__Group_5__0__Impl : ( '{' ) ;
    public final void rule__TableElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1700:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1701:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1701:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1702:1: '{'
            {
             before(grammarAccess.getTableElementAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,12,FOLLOW_12_in_rule__TableElement__Group_5__0__Impl3371); 
             after(grammarAccess.getTableElementAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group_5__0__Impl"


    // $ANTLR start "rule__TableElement__Group_5__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1715:1: rule__TableElement__Group_5__1 : rule__TableElement__Group_5__1__Impl rule__TableElement__Group_5__2 ;
    public final void rule__TableElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1719:1: ( rule__TableElement__Group_5__1__Impl rule__TableElement__Group_5__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1720:2: rule__TableElement__Group_5__1__Impl rule__TableElement__Group_5__2
            {
            pushFollow(FOLLOW_rule__TableElement__Group_5__1__Impl_in_rule__TableElement__Group_5__13402);
            rule__TableElement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group_5__2_in_rule__TableElement__Group_5__13405);
            rule__TableElement__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group_5__1"


    // $ANTLR start "rule__TableElement__Group_5__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1727:1: rule__TableElement__Group_5__1__Impl : ( ( ( rule__TableElement__SubElementsAssignment_5_1 ) ) ( ( rule__TableElement__SubElementsAssignment_5_1 )* ) ) ;
    public final void rule__TableElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1731:1: ( ( ( ( rule__TableElement__SubElementsAssignment_5_1 ) ) ( ( rule__TableElement__SubElementsAssignment_5_1 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1732:1: ( ( ( rule__TableElement__SubElementsAssignment_5_1 ) ) ( ( rule__TableElement__SubElementsAssignment_5_1 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1732:1: ( ( ( rule__TableElement__SubElementsAssignment_5_1 ) ) ( ( rule__TableElement__SubElementsAssignment_5_1 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1733:1: ( ( rule__TableElement__SubElementsAssignment_5_1 ) ) ( ( rule__TableElement__SubElementsAssignment_5_1 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1733:1: ( ( rule__TableElement__SubElementsAssignment_5_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1734:1: ( rule__TableElement__SubElementsAssignment_5_1 )
            {
             before(grammarAccess.getTableElementAccess().getSubElementsAssignment_5_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1735:1: ( rule__TableElement__SubElementsAssignment_5_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1735:2: rule__TableElement__SubElementsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__TableElement__SubElementsAssignment_5_1_in_rule__TableElement__Group_5__1__Impl3434);
            rule__TableElement__SubElementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getSubElementsAssignment_5_1()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1738:1: ( ( rule__TableElement__SubElementsAssignment_5_1 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1739:1: ( rule__TableElement__SubElementsAssignment_5_1 )*
            {
             before(grammarAccess.getTableElementAccess().getSubElementsAssignment_5_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1740:1: ( rule__TableElement__SubElementsAssignment_5_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1740:2: rule__TableElement__SubElementsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__TableElement__SubElementsAssignment_5_1_in_rule__TableElement__Group_5__1__Impl3446);
            	    rule__TableElement__SubElementsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTableElementAccess().getSubElementsAssignment_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group_5__1__Impl"


    // $ANTLR start "rule__TableElement__Group_5__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1751:1: rule__TableElement__Group_5__2 : rule__TableElement__Group_5__2__Impl ;
    public final void rule__TableElement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1755:1: ( rule__TableElement__Group_5__2__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1756:2: rule__TableElement__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__TableElement__Group_5__2__Impl_in_rule__TableElement__Group_5__23479);
            rule__TableElement__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group_5__2"


    // $ANTLR start "rule__TableElement__Group_5__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1762:1: rule__TableElement__Group_5__2__Impl : ( '}' ) ;
    public final void rule__TableElement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1766:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1767:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1767:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1768:1: '}'
            {
             before(grammarAccess.getTableElementAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,13,FOLLOW_13_in_rule__TableElement__Group_5__2__Impl3507); 
             after(grammarAccess.getTableElementAccess().getRightCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group_5__2__Impl"


    // $ANTLR start "rule__TableProperty__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1787:1: rule__TableProperty__Group__0 : rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1 ;
    public final void rule__TableProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1791:1: ( rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1792:2: rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__0__Impl_in_rule__TableProperty__Group__03544);
            rule__TableProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__1_in_rule__TableProperty__Group__03547);
            rule__TableProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group__0"


    // $ANTLR start "rule__TableProperty__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1799:1: rule__TableProperty__Group__0__Impl : ( 'property' ) ;
    public final void rule__TableProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1803:1: ( ( 'property' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1804:1: ( 'property' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1804:1: ( 'property' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1805:1: 'property'
            {
             before(grammarAccess.getTablePropertyAccess().getPropertyKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__TableProperty__Group__0__Impl3575); 
             after(grammarAccess.getTablePropertyAccess().getPropertyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group__0__Impl"


    // $ANTLR start "rule__TableProperty__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1818:1: rule__TableProperty__Group__1 : rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2 ;
    public final void rule__TableProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1822:1: ( rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1823:2: rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__1__Impl_in_rule__TableProperty__Group__13606);
            rule__TableProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__2_in_rule__TableProperty__Group__13609);
            rule__TableProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group__1"


    // $ANTLR start "rule__TableProperty__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1830:1: rule__TableProperty__Group__1__Impl : ( ( rule__TableProperty__FeatureAssignment_1 ) ) ;
    public final void rule__TableProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1834:1: ( ( ( rule__TableProperty__FeatureAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1835:1: ( ( rule__TableProperty__FeatureAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1835:1: ( ( rule__TableProperty__FeatureAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1836:1: ( rule__TableProperty__FeatureAssignment_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getFeatureAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1837:1: ( rule__TableProperty__FeatureAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1837:2: rule__TableProperty__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__TableProperty__FeatureAssignment_1_in_rule__TableProperty__Group__1__Impl3636);
            rule__TableProperty__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTablePropertyAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group__1__Impl"


    // $ANTLR start "rule__TableProperty__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1847:1: rule__TableProperty__Group__2 : rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3 ;
    public final void rule__TableProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1851:1: ( rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1852:2: rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__2__Impl_in_rule__TableProperty__Group__23666);
            rule__TableProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__3_in_rule__TableProperty__Group__23669);
            rule__TableProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group__2"


    // $ANTLR start "rule__TableProperty__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1859:1: rule__TableProperty__Group__2__Impl : ( ( rule__TableProperty__Group_2__0 )? ) ;
    public final void rule__TableProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1863:1: ( ( ( rule__TableProperty__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1864:1: ( ( rule__TableProperty__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1864:1: ( ( rule__TableProperty__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1865:1: ( rule__TableProperty__Group_2__0 )?
            {
             before(grammarAccess.getTablePropertyAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1866:1: ( rule__TableProperty__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1866:2: rule__TableProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TableProperty__Group_2__0_in_rule__TableProperty__Group__2__Impl3696);
                    rule__TableProperty__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTablePropertyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group__2__Impl"


    // $ANTLR start "rule__TableProperty__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1876:1: rule__TableProperty__Group__3 : rule__TableProperty__Group__3__Impl ;
    public final void rule__TableProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1880:1: ( rule__TableProperty__Group__3__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1881:2: rule__TableProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__3__Impl_in_rule__TableProperty__Group__33727);
            rule__TableProperty__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group__3"


    // $ANTLR start "rule__TableProperty__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1887:1: rule__TableProperty__Group__3__Impl : ( ( rule__TableProperty__Group_3__0 )? ) ;
    public final void rule__TableProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1891:1: ( ( ( rule__TableProperty__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1892:1: ( ( rule__TableProperty__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1892:1: ( ( rule__TableProperty__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1893:1: ( rule__TableProperty__Group_3__0 )?
            {
             before(grammarAccess.getTablePropertyAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1894:1: ( rule__TableProperty__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1894:2: rule__TableProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TableProperty__Group_3__0_in_rule__TableProperty__Group__3__Impl3754);
                    rule__TableProperty__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTablePropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group__3__Impl"


    // $ANTLR start "rule__TableProperty__Group_2__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1912:1: rule__TableProperty__Group_2__0 : rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1 ;
    public final void rule__TableProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1916:1: ( rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1917:2: rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_2__0__Impl_in_rule__TableProperty__Group_2__03793);
            rule__TableProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group_2__1_in_rule__TableProperty__Group_2__03796);
            rule__TableProperty__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group_2__0"


    // $ANTLR start "rule__TableProperty__Group_2__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1924:1: rule__TableProperty__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__TableProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1928:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1929:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1929:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1930:1: 'label'
            {
             before(grammarAccess.getTablePropertyAccess().getLabelKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__TableProperty__Group_2__0__Impl3824); 
             after(grammarAccess.getTablePropertyAccess().getLabelKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group_2__0__Impl"


    // $ANTLR start "rule__TableProperty__Group_2__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1943:1: rule__TableProperty__Group_2__1 : rule__TableProperty__Group_2__1__Impl ;
    public final void rule__TableProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1947:1: ( rule__TableProperty__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1948:2: rule__TableProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_2__1__Impl_in_rule__TableProperty__Group_2__13855);
            rule__TableProperty__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group_2__1"


    // $ANTLR start "rule__TableProperty__Group_2__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1954:1: rule__TableProperty__Group_2__1__Impl : ( ( rule__TableProperty__LabelAssignment_2_1 ) ) ;
    public final void rule__TableProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1958:1: ( ( ( rule__TableProperty__LabelAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1959:1: ( ( rule__TableProperty__LabelAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1959:1: ( ( rule__TableProperty__LabelAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1960:1: ( rule__TableProperty__LabelAssignment_2_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getLabelAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1961:1: ( rule__TableProperty__LabelAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1961:2: rule__TableProperty__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TableProperty__LabelAssignment_2_1_in_rule__TableProperty__Group_2__1__Impl3882);
            rule__TableProperty__LabelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTablePropertyAccess().getLabelAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group_2__1__Impl"


    // $ANTLR start "rule__TableProperty__Group_3__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1975:1: rule__TableProperty__Group_3__0 : rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1 ;
    public final void rule__TableProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1979:1: ( rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1980:2: rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_3__0__Impl_in_rule__TableProperty__Group_3__03916);
            rule__TableProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group_3__1_in_rule__TableProperty__Group_3__03919);
            rule__TableProperty__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group_3__0"


    // $ANTLR start "rule__TableProperty__Group_3__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1987:1: rule__TableProperty__Group_3__0__Impl : ( 'expression' ) ;
    public final void rule__TableProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1991:1: ( ( 'expression' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1992:1: ( 'expression' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1992:1: ( 'expression' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1993:1: 'expression'
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__TableProperty__Group_3__0__Impl3947); 
             after(grammarAccess.getTablePropertyAccess().getExpressionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group_3__0__Impl"


    // $ANTLR start "rule__TableProperty__Group_3__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2006:1: rule__TableProperty__Group_3__1 : rule__TableProperty__Group_3__1__Impl ;
    public final void rule__TableProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2010:1: ( rule__TableProperty__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2011:2: rule__TableProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_3__1__Impl_in_rule__TableProperty__Group_3__13978);
            rule__TableProperty__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group_3__1"


    // $ANTLR start "rule__TableProperty__Group_3__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2017:1: rule__TableProperty__Group_3__1__Impl : ( ( rule__TableProperty__ExpressionAssignment_3_1 ) ) ;
    public final void rule__TableProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2021:1: ( ( ( rule__TableProperty__ExpressionAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2022:1: ( ( rule__TableProperty__ExpressionAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2022:1: ( ( rule__TableProperty__ExpressionAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2023:1: ( rule__TableProperty__ExpressionAssignment_3_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2024:1: ( rule__TableProperty__ExpressionAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2024:2: rule__TableProperty__ExpressionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TableProperty__ExpressionAssignment_3_1_in_rule__TableProperty__Group_3__1__Impl4005);
            rule__TableProperty__ExpressionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTablePropertyAccess().getExpressionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__Group_3__1__Impl"


    // $ANTLR start "rule__AcceleoExpression__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2038:1: rule__AcceleoExpression__Group__0 : rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1 ;
    public final void rule__AcceleoExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2042:1: ( rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2043:2: rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__Group__0__Impl_in_rule__AcceleoExpression__Group__04039);
            rule__AcceleoExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AcceleoExpression__Group__1_in_rule__AcceleoExpression__Group__04042);
            rule__AcceleoExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AcceleoExpression__Group__0"


    // $ANTLR start "rule__AcceleoExpression__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2050:1: rule__AcceleoExpression__Group__0__Impl : ( 'acc:' ) ;
    public final void rule__AcceleoExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2054:1: ( ( 'acc:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2055:1: ( 'acc:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2055:1: ( 'acc:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2056:1: 'acc:'
            {
             before(grammarAccess.getAcceleoExpressionAccess().getAccKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__AcceleoExpression__Group__0__Impl4070); 
             after(grammarAccess.getAcceleoExpressionAccess().getAccKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AcceleoExpression__Group__0__Impl"


    // $ANTLR start "rule__AcceleoExpression__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2069:1: rule__AcceleoExpression__Group__1 : rule__AcceleoExpression__Group__1__Impl ;
    public final void rule__AcceleoExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2073:1: ( rule__AcceleoExpression__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2074:2: rule__AcceleoExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__Group__1__Impl_in_rule__AcceleoExpression__Group__14101);
            rule__AcceleoExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AcceleoExpression__Group__1"


    // $ANTLR start "rule__AcceleoExpression__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2080:1: rule__AcceleoExpression__Group__1__Impl : ( ( rule__AcceleoExpression__ValueAssignment_1 ) ) ;
    public final void rule__AcceleoExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2084:1: ( ( ( rule__AcceleoExpression__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2085:1: ( ( rule__AcceleoExpression__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2085:1: ( ( rule__AcceleoExpression__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2086:1: ( rule__AcceleoExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getAcceleoExpressionAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2087:1: ( rule__AcceleoExpression__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2087:2: rule__AcceleoExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__ValueAssignment_1_in_rule__AcceleoExpression__Group__1__Impl4128);
            rule__AcceleoExpression__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAcceleoExpressionAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AcceleoExpression__Group__1__Impl"


    // $ANTLR start "rule__VarRef__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2101:1: rule__VarRef__Group__0 : rule__VarRef__Group__0__Impl rule__VarRef__Group__1 ;
    public final void rule__VarRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2105:1: ( rule__VarRef__Group__0__Impl rule__VarRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2106:2: rule__VarRef__Group__0__Impl rule__VarRef__Group__1
            {
            pushFollow(FOLLOW_rule__VarRef__Group__0__Impl_in_rule__VarRef__Group__04162);
            rule__VarRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarRef__Group__1_in_rule__VarRef__Group__04165);
            rule__VarRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRef__Group__0"


    // $ANTLR start "rule__VarRef__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2113:1: rule__VarRef__Group__0__Impl : ( 'var:' ) ;
    public final void rule__VarRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2117:1: ( ( 'var:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2118:1: ( 'var:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2118:1: ( 'var:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2119:1: 'var:'
            {
             before(grammarAccess.getVarRefAccess().getVarKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__VarRef__Group__0__Impl4193); 
             after(grammarAccess.getVarRefAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRef__Group__0__Impl"


    // $ANTLR start "rule__VarRef__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2132:1: rule__VarRef__Group__1 : rule__VarRef__Group__1__Impl ;
    public final void rule__VarRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2136:1: ( rule__VarRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2137:2: rule__VarRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarRef__Group__1__Impl_in_rule__VarRef__Group__14224);
            rule__VarRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRef__Group__1"


    // $ANTLR start "rule__VarRef__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2143:1: rule__VarRef__Group__1__Impl : ( ( rule__VarRef__ValueAssignment_1 ) ) ;
    public final void rule__VarRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2147:1: ( ( ( rule__VarRef__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2148:1: ( ( rule__VarRef__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2148:1: ( ( rule__VarRef__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2149:1: ( rule__VarRef__ValueAssignment_1 )
            {
             before(grammarAccess.getVarRefAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2150:1: ( rule__VarRef__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2150:2: rule__VarRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__VarRef__ValueAssignment_1_in_rule__VarRef__Group__1__Impl4251);
            rule__VarRef__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarRefAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRef__Group__1__Impl"


    // $ANTLR start "rule__FeatureRef__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2164:1: rule__FeatureRef__Group__0 : rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1 ;
    public final void rule__FeatureRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2168:1: ( rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2169:2: rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureRef__Group__0__Impl_in_rule__FeatureRef__Group__04285);
            rule__FeatureRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureRef__Group__1_in_rule__FeatureRef__Group__04288);
            rule__FeatureRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureRef__Group__0"


    // $ANTLR start "rule__FeatureRef__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2176:1: rule__FeatureRef__Group__0__Impl : ( 'feature:' ) ;
    public final void rule__FeatureRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2180:1: ( ( 'feature:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2181:1: ( 'feature:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2181:1: ( 'feature:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2182:1: 'feature:'
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__FeatureRef__Group__0__Impl4316); 
             after(grammarAccess.getFeatureRefAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureRef__Group__0__Impl"


    // $ANTLR start "rule__FeatureRef__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2195:1: rule__FeatureRef__Group__1 : rule__FeatureRef__Group__1__Impl ;
    public final void rule__FeatureRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2199:1: ( rule__FeatureRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2200:2: rule__FeatureRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureRef__Group__1__Impl_in_rule__FeatureRef__Group__14347);
            rule__FeatureRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureRef__Group__1"


    // $ANTLR start "rule__FeatureRef__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2206:1: rule__FeatureRef__Group__1__Impl : ( ( rule__FeatureRef__ValueAssignment_1 ) ) ;
    public final void rule__FeatureRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2210:1: ( ( ( rule__FeatureRef__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2211:1: ( ( rule__FeatureRef__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2211:1: ( ( rule__FeatureRef__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2212:1: ( rule__FeatureRef__ValueAssignment_1 )
            {
             before(grammarAccess.getFeatureRefAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2213:1: ( rule__FeatureRef__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2213:2: rule__FeatureRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__FeatureRef__ValueAssignment_1_in_rule__FeatureRef__Group__1__Impl4374);
            rule__FeatureRef__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureRefAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureRef__Group__1__Impl"


    // $ANTLR start "rule__MetamodelRef__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2227:1: rule__MetamodelRef__Group__0 : rule__MetamodelRef__Group__0__Impl rule__MetamodelRef__Group__1 ;
    public final void rule__MetamodelRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2231:1: ( rule__MetamodelRef__Group__0__Impl rule__MetamodelRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2232:2: rule__MetamodelRef__Group__0__Impl rule__MetamodelRef__Group__1
            {
            pushFollow(FOLLOW_rule__MetamodelRef__Group__0__Impl_in_rule__MetamodelRef__Group__04408);
            rule__MetamodelRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetamodelRef__Group__1_in_rule__MetamodelRef__Group__04411);
            rule__MetamodelRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelRef__Group__0"


    // $ANTLR start "rule__MetamodelRef__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2239:1: rule__MetamodelRef__Group__0__Impl : ( 'use' ) ;
    public final void rule__MetamodelRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2243:1: ( ( 'use' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2244:1: ( 'use' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2244:1: ( 'use' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2245:1: 'use'
            {
             before(grammarAccess.getMetamodelRefAccess().getUseKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__MetamodelRef__Group__0__Impl4439); 
             after(grammarAccess.getMetamodelRefAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelRef__Group__0__Impl"


    // $ANTLR start "rule__MetamodelRef__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2258:1: rule__MetamodelRef__Group__1 : rule__MetamodelRef__Group__1__Impl ;
    public final void rule__MetamodelRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2262:1: ( rule__MetamodelRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2263:2: rule__MetamodelRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelRef__Group__1__Impl_in_rule__MetamodelRef__Group__14470);
            rule__MetamodelRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelRef__Group__1"


    // $ANTLR start "rule__MetamodelRef__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2269:1: rule__MetamodelRef__Group__1__Impl : ( ( rule__MetamodelRef__MetamodelAssignment_1 ) ) ;
    public final void rule__MetamodelRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2273:1: ( ( ( rule__MetamodelRef__MetamodelAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2274:1: ( ( rule__MetamodelRef__MetamodelAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2274:1: ( ( rule__MetamodelRef__MetamodelAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2275:1: ( rule__MetamodelRef__MetamodelAssignment_1 )
            {
             before(grammarAccess.getMetamodelRefAccess().getMetamodelAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2276:1: ( rule__MetamodelRef__MetamodelAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2276:2: rule__MetamodelRef__MetamodelAssignment_1
            {
            pushFollow(FOLLOW_rule__MetamodelRef__MetamodelAssignment_1_in_rule__MetamodelRef__Group__1__Impl4497);
            rule__MetamodelRef__MetamodelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelRefAccess().getMetamodelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelRef__Group__1__Impl"


    // $ANTLR start "rule__SPrototyper__NameAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2291:1: rule__SPrototyper__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPrototyper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2295:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2296:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2296:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2297:1: RULE_ID
            {
             before(grammarAccess.getSPrototyperAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPrototyper__NameAssignment_14536); 
             after(grammarAccess.getSPrototyperAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__NameAssignment_1"


    // $ANTLR start "rule__SPrototyper__QualifierAssignment_3_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2306:1: rule__SPrototyper__QualifierAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPrototyper__QualifierAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2310:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2311:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2311:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2312:1: RULE_STRING
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPrototyper__QualifierAssignment_3_14567); 
             after(grammarAccess.getSPrototyperAccess().getQualifierSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__QualifierAssignment_3_1"


    // $ANTLR start "rule__SPrototyper__ViewpointsAssignment_4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2321:1: rule__SPrototyper__ViewpointsAssignment_4 : ( ruleSPViewpoint ) ;
    public final void rule__SPrototyper__ViewpointsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2325:1: ( ( ruleSPViewpoint ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2326:1: ( ruleSPViewpoint )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2326:1: ( ruleSPViewpoint )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2327:1: ruleSPViewpoint
            {
             before(grammarAccess.getSPrototyperAccess().getViewpointsSPViewpointParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSPViewpoint_in_rule__SPrototyper__ViewpointsAssignment_44598);
            ruleSPViewpoint();

            state._fsp--;

             after(grammarAccess.getSPrototyperAccess().getViewpointsSPViewpointParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__ViewpointsAssignment_4"


    // $ANTLR start "rule__SPViewpoint__NameAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2336:1: rule__SPViewpoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPViewpoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2340:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2341:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2341:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2342:1: RULE_ID
            {
             before(grammarAccess.getSPViewpointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPViewpoint__NameAssignment_14629); 
             after(grammarAccess.getSPViewpointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__NameAssignment_1"


    // $ANTLR start "rule__SPViewpoint__ShortcutAssignment_3_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2351:1: rule__SPViewpoint__ShortcutAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPViewpoint__ShortcutAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2355:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2356:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2356:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2357:1: RULE_STRING
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPViewpoint__ShortcutAssignment_3_14660); 
             after(grammarAccess.getSPViewpointAccess().getShortcutSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__ShortcutAssignment_3_1"


    // $ANTLR start "rule__SPViewpoint__ExtensionAssignment_4_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2366:1: rule__SPViewpoint__ExtensionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SPViewpoint__ExtensionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2370:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2371:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2371:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2372:1: RULE_STRING
            {
             before(grammarAccess.getSPViewpointAccess().getExtensionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPViewpoint__ExtensionAssignment_4_14691); 
             after(grammarAccess.getSPViewpointAccess().getExtensionSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__ExtensionAssignment_4_1"


    // $ANTLR start "rule__SPViewpoint__RepresentationsAssignment_5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2381:1: rule__SPViewpoint__RepresentationsAssignment_5 : ( ruleSPRepresentation ) ;
    public final void rule__SPViewpoint__RepresentationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2385:1: ( ( ruleSPRepresentation ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2386:1: ( ruleSPRepresentation )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2386:1: ( ruleSPRepresentation )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2387:1: ruleSPRepresentation
            {
             before(grammarAccess.getSPViewpointAccess().getRepresentationsSPRepresentationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSPRepresentation_in_rule__SPViewpoint__RepresentationsAssignment_54722);
            ruleSPRepresentation();

            state._fsp--;

             after(grammarAccess.getSPViewpointAccess().getRepresentationsSPRepresentationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__RepresentationsAssignment_5"


    // $ANTLR start "rule__SPTable__NameAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2396:1: rule__SPTable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPTable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2400:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2401:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2401:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2402:1: RULE_ID
            {
             before(grammarAccess.getSPTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPTable__NameAssignment_14753); 
             after(grammarAccess.getSPTableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__NameAssignment_1"


    // $ANTLR start "rule__SPTable__LabelAssignment_3_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2411:1: rule__SPTable__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPTable__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2415:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2416:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2416:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2417:1: RULE_STRING
            {
             before(grammarAccess.getSPTableAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPTable__LabelAssignment_3_14784); 
             after(grammarAccess.getSPTableAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__LabelAssignment_3_1"


    // $ANTLR start "rule__SPTable__TitleAssignment_4_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2426:1: rule__SPTable__TitleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SPTable__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2430:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2431:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2431:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2432:1: RULE_STRING
            {
             before(grammarAccess.getSPTableAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPTable__TitleAssignment_4_14815); 
             after(grammarAccess.getSPTableAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__TitleAssignment_4_1"


    // $ANTLR start "rule__SPTable__MetamodelsAssignment_5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2441:1: rule__SPTable__MetamodelsAssignment_5 : ( ruleMetamodelRef ) ;
    public final void rule__SPTable__MetamodelsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2445:1: ( ( ruleMetamodelRef ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2446:1: ( ruleMetamodelRef )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2446:1: ( ruleMetamodelRef )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2447:1: ruleMetamodelRef
            {
             before(grammarAccess.getSPTableAccess().getMetamodelsMetamodelRefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMetamodelRef_in_rule__SPTable__MetamodelsAssignment_54846);
            ruleMetamodelRef();

            state._fsp--;

             after(grammarAccess.getSPTableAccess().getMetamodelsMetamodelRefParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__MetamodelsAssignment_5"


    // $ANTLR start "rule__SPTable__RootAssignment_7"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2456:1: rule__SPTable__RootAssignment_7 : ( RULE_STRING ) ;
    public final void rule__SPTable__RootAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2460:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2461:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2461:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2462:1: RULE_STRING
            {
             before(grammarAccess.getSPTableAccess().getRootSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPTable__RootAssignment_74877); 
             after(grammarAccess.getSPTableAccess().getRootSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__RootAssignment_7"


    // $ANTLR start "rule__SPTable__ElementsAssignment_8"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2471:1: rule__SPTable__ElementsAssignment_8 : ( ruleTableElement ) ;
    public final void rule__SPTable__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2475:1: ( ( ruleTableElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2476:1: ( ruleTableElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2476:1: ( ruleTableElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2477:1: ruleTableElement
            {
             before(grammarAccess.getSPTableAccess().getElementsTableElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleTableElement_in_rule__SPTable__ElementsAssignment_84908);
            ruleTableElement();

            state._fsp--;

             after(grammarAccess.getSPTableAccess().getElementsTableElementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__ElementsAssignment_8"


    // $ANTLR start "rule__SPTable__PropertiesAssignment_9"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2486:1: rule__SPTable__PropertiesAssignment_9 : ( ruleTableProperty ) ;
    public final void rule__SPTable__PropertiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2490:1: ( ( ruleTableProperty ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2491:1: ( ruleTableProperty )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2491:1: ( ruleTableProperty )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2492:1: ruleTableProperty
            {
             before(grammarAccess.getSPTableAccess().getPropertiesTablePropertyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleTableProperty_in_rule__SPTable__PropertiesAssignment_94939);
            ruleTableProperty();

            state._fsp--;

             after(grammarAccess.getSPTableAccess().getPropertiesTablePropertyParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__PropertiesAssignment_9"


    // $ANTLR start "rule__TableElement__EClassAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2501:1: rule__TableElement__EClassAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TableElement__EClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2505:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2506:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2506:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2507:1: RULE_STRING
            {
             before(grammarAccess.getTableElementAccess().getEClassSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableElement__EClassAssignment_14970); 
             after(grammarAccess.getTableElementAccess().getEClassSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__EClassAssignment_1"


    // $ANTLR start "rule__TableElement__ExpressionAssignment_3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2516:1: rule__TableElement__ExpressionAssignment_3 : ( ruleSPExpression ) ;
    public final void rule__TableElement__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2520:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2521:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2521:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2522:1: ruleSPExpression
            {
             before(grammarAccess.getTableElementAccess().getExpressionSPExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__TableElement__ExpressionAssignment_35001);
            ruleSPExpression();

            state._fsp--;

             after(grammarAccess.getTableElementAccess().getExpressionSPExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__ExpressionAssignment_3"


    // $ANTLR start "rule__TableElement__CanCreateAssignment_4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2531:1: rule__TableElement__CanCreateAssignment_4 : ( ( 'create' ) ) ;
    public final void rule__TableElement__CanCreateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2535:1: ( ( ( 'create' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2536:1: ( ( 'create' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2536:1: ( ( 'create' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2537:1: ( 'create' )
            {
             before(grammarAccess.getTableElementAccess().getCanCreateCreateKeyword_4_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2538:1: ( 'create' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2539:1: 'create'
            {
             before(grammarAccess.getTableElementAccess().getCanCreateCreateKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__TableElement__CanCreateAssignment_45037); 
             after(grammarAccess.getTableElementAccess().getCanCreateCreateKeyword_4_0()); 

            }

             after(grammarAccess.getTableElementAccess().getCanCreateCreateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__CanCreateAssignment_4"


    // $ANTLR start "rule__TableElement__SubElementsAssignment_5_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2554:1: rule__TableElement__SubElementsAssignment_5_1 : ( ruleTableElement ) ;
    public final void rule__TableElement__SubElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2558:1: ( ( ruleTableElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2559:1: ( ruleTableElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2559:1: ( ruleTableElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2560:1: ruleTableElement
            {
             before(grammarAccess.getTableElementAccess().getSubElementsTableElementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTableElement_in_rule__TableElement__SubElementsAssignment_5_15076);
            ruleTableElement();

            state._fsp--;

             after(grammarAccess.getTableElementAccess().getSubElementsTableElementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__SubElementsAssignment_5_1"


    // $ANTLR start "rule__TableProperty__FeatureAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2569:1: rule__TableProperty__FeatureAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TableProperty__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2573:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2574:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2574:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2575:1: RULE_STRING
            {
             before(grammarAccess.getTablePropertyAccess().getFeatureSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableProperty__FeatureAssignment_15107); 
             after(grammarAccess.getTablePropertyAccess().getFeatureSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__FeatureAssignment_1"


    // $ANTLR start "rule__TableProperty__LabelAssignment_2_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2584:1: rule__TableProperty__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TableProperty__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2588:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2589:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2589:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2590:1: RULE_STRING
            {
             before(grammarAccess.getTablePropertyAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableProperty__LabelAssignment_2_15138); 
             after(grammarAccess.getTablePropertyAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__LabelAssignment_2_1"


    // $ANTLR start "rule__TableProperty__ExpressionAssignment_3_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2599:1: rule__TableProperty__ExpressionAssignment_3_1 : ( ruleSPExpression ) ;
    public final void rule__TableProperty__ExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2603:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2604:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2604:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2605:1: ruleSPExpression
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionSPExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__TableProperty__ExpressionAssignment_3_15169);
            ruleSPExpression();

            state._fsp--;

             after(grammarAccess.getTablePropertyAccess().getExpressionSPExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableProperty__ExpressionAssignment_3_1"


    // $ANTLR start "rule__AcceleoExpression__ValueAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2614:1: rule__AcceleoExpression__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AcceleoExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2618:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2619:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2619:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2620:1: RULE_STRING
            {
             before(grammarAccess.getAcceleoExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AcceleoExpression__ValueAssignment_15200); 
             after(grammarAccess.getAcceleoExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AcceleoExpression__ValueAssignment_1"


    // $ANTLR start "rule__VarRef__ValueAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2629:1: rule__VarRef__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VarRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2633:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2634:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2634:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2635:1: RULE_STRING
            {
             before(grammarAccess.getVarRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VarRef__ValueAssignment_15231); 
             after(grammarAccess.getVarRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRef__ValueAssignment_1"


    // $ANTLR start "rule__FeatureRef__ValueAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2644:1: rule__FeatureRef__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FeatureRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2648:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2649:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2649:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2650:1: RULE_STRING
            {
             before(grammarAccess.getFeatureRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureRef__ValueAssignment_15262); 
             after(grammarAccess.getFeatureRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureRef__ValueAssignment_1"


    // $ANTLR start "rule__MetamodelRef__MetamodelAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2659:1: rule__MetamodelRef__MetamodelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MetamodelRef__MetamodelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2663:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2664:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2664:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2665:1: RULE_STRING
            {
             before(grammarAccess.getMetamodelRefAccess().getMetamodelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetamodelRef__MetamodelAssignment_15293); 
             after(grammarAccess.getMetamodelRefAccess().getMetamodelSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelRef__MetamodelAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSPrototyper_in_entryRuleSPrototyper61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPrototyper68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__0_in_ruleSPrototyper94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPViewpoint_in_entryRuleSPViewpoint121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPViewpoint128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__0_in_ruleSPViewpoint154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPRepresentation_in_entryRuleSPRepresentation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPRepresentation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPTable_in_ruleSPRepresentation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPTable_in_entryRuleSPTable240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPTable247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__0_in_ruleSPTable273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_entryRuleTableElement300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableElement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__0_in_ruleTableElement333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableProperty_in_entryRuleTableProperty360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableProperty367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__0_in_ruleTableProperty393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_entryRuleSPExpression420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPExpression427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPExpression__Alternatives_in_ruleSPExpression453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcceleoExpression487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__0_in_ruleAcceleoExpression513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__Group__0_in_ruleVarRef573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRef607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__0_in_ruleFeatureRef633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_entryRuleMetamodelRef660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelRef667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelRef__Group__0_in_ruleMetamodelRef693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_rule__SPExpression__Alternatives729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_rule__SPExpression__Alternatives746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_rule__SPExpression__Alternatives763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__0__Impl_in_rule__SPrototyper__Group__0793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__1_in_rule__SPrototyper__Group__0796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SPrototyper__Group__0__Impl824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__1__Impl_in_rule__SPrototyper__Group__1855 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__2_in_rule__SPrototyper__Group__1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__NameAssignment_1_in_rule__SPrototyper__Group__1__Impl885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__2__Impl_in_rule__SPrototyper__Group__2915 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__3_in_rule__SPrototyper__Group__2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SPrototyper__Group__2__Impl946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__3__Impl_in_rule__SPrototyper__Group__3977 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__4_in_rule__SPrototyper__Group__3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__0_in_rule__SPrototyper__Group__3__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__4__Impl_in_rule__SPrototyper__Group__41038 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__5_in_rule__SPrototyper__Group__41041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__ViewpointsAssignment_4_in_rule__SPrototyper__Group__4__Impl1068 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__5__Impl_in_rule__SPrototyper__Group__51099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SPrototyper__Group__5__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__0__Impl_in_rule__SPrototyper__Group_3__01170 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__1_in_rule__SPrototyper__Group_3__01173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SPrototyper__Group_3__0__Impl1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__1__Impl_in_rule__SPrototyper__Group_3__11232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__QualifierAssignment_3_1_in_rule__SPrototyper__Group_3__1__Impl1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__0__Impl_in_rule__SPViewpoint__Group__01293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__1_in_rule__SPViewpoint__Group__01296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SPViewpoint__Group__0__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__1__Impl_in_rule__SPViewpoint__Group__11355 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__2_in_rule__SPViewpoint__Group__11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__NameAssignment_1_in_rule__SPViewpoint__Group__1__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__2__Impl_in_rule__SPViewpoint__Group__21415 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__3_in_rule__SPViewpoint__Group__21418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SPViewpoint__Group__2__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__3__Impl_in_rule__SPViewpoint__Group__31477 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__4_in_rule__SPViewpoint__Group__31480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__0_in_rule__SPViewpoint__Group__3__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__4__Impl_in_rule__SPViewpoint__Group__41538 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__5_in_rule__SPViewpoint__Group__41541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__0_in_rule__SPViewpoint__Group__4__Impl1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__5__Impl_in_rule__SPViewpoint__Group__51599 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__6_in_rule__SPViewpoint__Group__51602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__RepresentationsAssignment_5_in_rule__SPViewpoint__Group__5__Impl1629 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__6__Impl_in_rule__SPViewpoint__Group__61660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SPViewpoint__Group__6__Impl1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__0__Impl_in_rule__SPViewpoint__Group_3__01733 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__1_in_rule__SPViewpoint__Group_3__01736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SPViewpoint__Group_3__0__Impl1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__1__Impl_in_rule__SPViewpoint__Group_3__11795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__ShortcutAssignment_3_1_in_rule__SPViewpoint__Group_3__1__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__0__Impl_in_rule__SPViewpoint__Group_4__01856 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__1_in_rule__SPViewpoint__Group_4__01859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SPViewpoint__Group_4__0__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__1__Impl_in_rule__SPViewpoint__Group_4__11918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__ExtensionAssignment_4_1_in_rule__SPViewpoint__Group_4__1__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__0__Impl_in_rule__SPTable__Group__01979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPTable__Group__1_in_rule__SPTable__Group__01982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SPTable__Group__0__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__1__Impl_in_rule__SPTable__Group__12041 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__2_in_rule__SPTable__Group__12044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__NameAssignment_1_in_rule__SPTable__Group__1__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__2__Impl_in_rule__SPTable__Group__22101 = new BitSet(new long[]{0x0000000020300000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__3_in_rule__SPTable__Group__22104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SPTable__Group__2__Impl2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__3__Impl_in_rule__SPTable__Group__32163 = new BitSet(new long[]{0x0000000020300000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__4_in_rule__SPTable__Group__32166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__0_in_rule__SPTable__Group__3__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__4__Impl_in_rule__SPTable__Group__42224 = new BitSet(new long[]{0x0000000020300000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__5_in_rule__SPTable__Group__42227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__0_in_rule__SPTable__Group__4__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__5__Impl_in_rule__SPTable__Group__52285 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__6_in_rule__SPTable__Group__52288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__MetamodelsAssignment_5_in_rule__SPTable__Group__5__Impl2317 = new BitSet(new long[]{0x0000000020300002L});
    public static final BitSet FOLLOW_rule__SPTable__MetamodelsAssignment_5_in_rule__SPTable__Group__5__Impl2329 = new BitSet(new long[]{0x0000000020300002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__6__Impl_in_rule__SPTable__Group__62362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group__7_in_rule__SPTable__Group__62365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SPTable__Group__6__Impl2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__7__Impl_in_rule__SPTable__Group__72424 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__8_in_rule__SPTable__Group__72427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__RootAssignment_7_in_rule__SPTable__Group__7__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__8__Impl_in_rule__SPTable__Group__82484 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__9_in_rule__SPTable__Group__82487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl2516 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl2528 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__9__Impl_in_rule__SPTable__Group__92561 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__10_in_rule__SPTable__Group__92564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl2593 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl2605 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__10__Impl_in_rule__SPTable__Group__102638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SPTable__Group__10__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__0__Impl_in_rule__SPTable__Group_3__02719 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__1_in_rule__SPTable__Group_3__02722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SPTable__Group_3__0__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__1__Impl_in_rule__SPTable__Group_3__12781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__LabelAssignment_3_1_in_rule__SPTable__Group_3__1__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__0__Impl_in_rule__SPTable__Group_4__02842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__1_in_rule__SPTable__Group_4__02845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SPTable__Group_4__0__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__1__Impl_in_rule__SPTable__Group_4__12904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__TitleAssignment_4_1_in_rule__SPTable__Group_4__1__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__0__Impl_in_rule__TableElement__Group__02965 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TableElement__Group__1_in_rule__TableElement__Group__02968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TableElement__Group__0__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__1__Impl_in_rule__TableElement__Group__13027 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TableElement__Group__2_in_rule__TableElement__Group__13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__EClassAssignment_1_in_rule__TableElement__Group__1__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__2__Impl_in_rule__TableElement__Group__23087 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__TableElement__Group__3_in_rule__TableElement__Group__23090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TableElement__Group__2__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__3__Impl_in_rule__TableElement__Group__33149 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_rule__TableElement__Group__4_in_rule__TableElement__Group__33152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__ExpressionAssignment_3_in_rule__TableElement__Group__3__Impl3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__4__Impl_in_rule__TableElement__Group__43209 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_rule__TableElement__Group__5_in_rule__TableElement__Group__43212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__CanCreateAssignment_4_in_rule__TableElement__Group__4__Impl3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__5__Impl_in_rule__TableElement__Group__53270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5__0_in_rule__TableElement__Group__5__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5__0__Impl_in_rule__TableElement__Group_5__03340 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5__1_in_rule__TableElement__Group_5__03343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__TableElement__Group_5__0__Impl3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5__1__Impl_in_rule__TableElement__Group_5__13402 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5__2_in_rule__TableElement__Group_5__13405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__SubElementsAssignment_5_1_in_rule__TableElement__Group_5__1__Impl3434 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__TableElement__SubElementsAssignment_5_1_in_rule__TableElement__Group_5__1__Impl3446 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5__2__Impl_in_rule__TableElement__Group_5__23479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TableElement__Group_5__2__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__0__Impl_in_rule__TableProperty__Group__03544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__1_in_rule__TableProperty__Group__03547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TableProperty__Group__0__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__1__Impl_in_rule__TableProperty__Group__13606 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__2_in_rule__TableProperty__Group__13609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__FeatureAssignment_1_in_rule__TableProperty__Group__1__Impl3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__2__Impl_in_rule__TableProperty__Group__23666 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__3_in_rule__TableProperty__Group__23669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__0_in_rule__TableProperty__Group__2__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__3__Impl_in_rule__TableProperty__Group__33727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__0_in_rule__TableProperty__Group__3__Impl3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__0__Impl_in_rule__TableProperty__Group_2__03793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__1_in_rule__TableProperty__Group_2__03796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TableProperty__Group_2__0__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__1__Impl_in_rule__TableProperty__Group_2__13855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__LabelAssignment_2_1_in_rule__TableProperty__Group_2__1__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__0__Impl_in_rule__TableProperty__Group_3__03916 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__1_in_rule__TableProperty__Group_3__03919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TableProperty__Group_3__0__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__1__Impl_in_rule__TableProperty__Group_3__13978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__ExpressionAssignment_3_1_in_rule__TableProperty__Group_3__1__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__0__Impl_in_rule__AcceleoExpression__Group__04039 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__1_in_rule__AcceleoExpression__Group__04042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AcceleoExpression__Group__0__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__1__Impl_in_rule__AcceleoExpression__Group__14101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__ValueAssignment_1_in_rule__AcceleoExpression__Group__1__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__Group__0__Impl_in_rule__VarRef__Group__04162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VarRef__Group__1_in_rule__VarRef__Group__04165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VarRef__Group__0__Impl4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__Group__1__Impl_in_rule__VarRef__Group__14224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__ValueAssignment_1_in_rule__VarRef__Group__1__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__0__Impl_in_rule__FeatureRef__Group__04285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__1_in_rule__FeatureRef__Group__04288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FeatureRef__Group__0__Impl4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__1__Impl_in_rule__FeatureRef__Group__14347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__ValueAssignment_1_in_rule__FeatureRef__Group__1__Impl4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelRef__Group__0__Impl_in_rule__MetamodelRef__Group__04408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetamodelRef__Group__1_in_rule__MetamodelRef__Group__04411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MetamodelRef__Group__0__Impl4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelRef__Group__1__Impl_in_rule__MetamodelRef__Group__14470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelRef__MetamodelAssignment_1_in_rule__MetamodelRef__Group__1__Impl4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPrototyper__NameAssignment_14536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPrototyper__QualifierAssignment_3_14567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPViewpoint_in_rule__SPrototyper__ViewpointsAssignment_44598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPViewpoint__NameAssignment_14629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPViewpoint__ShortcutAssignment_3_14660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPViewpoint__ExtensionAssignment_4_14691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPRepresentation_in_rule__SPViewpoint__RepresentationsAssignment_54722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPTable__NameAssignment_14753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPTable__LabelAssignment_3_14784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPTable__TitleAssignment_4_14815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_rule__SPTable__MetamodelsAssignment_54846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPTable__RootAssignment_74877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_rule__SPTable__ElementsAssignment_84908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableProperty_in_rule__SPTable__PropertiesAssignment_94939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableElement__EClassAssignment_14970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__TableElement__ExpressionAssignment_35001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TableElement__CanCreateAssignment_45037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_rule__TableElement__SubElementsAssignment_5_15076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableProperty__FeatureAssignment_15107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableProperty__LabelAssignment_2_15138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__TableProperty__ExpressionAssignment_3_15169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AcceleoExpression__ValueAssignment_15200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VarRef__ValueAssignment_15231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureRef__ValueAssignment_15262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetamodelRef__MetamodelAssignment_15293 = new BitSet(new long[]{0x0000000000000002L});

}