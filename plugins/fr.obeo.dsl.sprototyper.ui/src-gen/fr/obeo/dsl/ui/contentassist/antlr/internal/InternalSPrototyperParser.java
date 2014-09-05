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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'freeform'", "'list'", "'white'", "'black'", "'blue'", "'light blue'", "'dark blue'", "'chocolate'", "'light chocolate'", "'dark chocolate'", "'gray'", "'light gray'", "'dark gray'", "'green'", "'light green'", "'dark green'", "'orange'", "'light orange'", "'dark orange'", "'purple'", "'light purple'", "'dark purple'", "'red'", "'light red'", "'dark red'", "'yellow'", "'light yellow'", "'dark yellow'", "'proto'", "'{'", "'}'", "'qualifier'", "'viewpoint'", "'shortcut'", "'ext'", "'table'", "'root'", "'label'", "'title'", "'element'", "'accessibleThrough'", "'property'", "'expression'", "'diagram'", "'container'", "'for'", "'['", "']'", "','", "'node'", "'color'", "'gradient from'", "'to'", "'size'", "'border '", "'acc:'", "'var:'", "'feature:'", "'use'", "'creatable'", "'recursive'", "'bold'", "'italic'"
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:125:1: ruleSPRepresentation : ( ( rule__SPRepresentation__Alternatives ) ) ;
    public final void ruleSPRepresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:129:2: ( ( ( rule__SPRepresentation__Alternatives ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:130:1: ( ( rule__SPRepresentation__Alternatives ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:130:1: ( ( rule__SPRepresentation__Alternatives ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:131:1: ( rule__SPRepresentation__Alternatives )
            {
             before(grammarAccess.getSPRepresentationAccess().getAlternatives()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:132:1: ( rule__SPRepresentation__Alternatives )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:132:2: rule__SPRepresentation__Alternatives
            {
            pushFollow(FOLLOW_rule__SPRepresentation__Alternatives_in_ruleSPRepresentation214);
            rule__SPRepresentation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSPRepresentationAccess().getAlternatives()); 

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
            pushFollow(FOLLOW_ruleSPTable_in_entryRuleSPTable241);
            ruleSPTable();

            state._fsp--;

             after(grammarAccess.getSPTableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPTable248); 

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
            pushFollow(FOLLOW_rule__SPTable__Group__0_in_ruleSPTable274);
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
            pushFollow(FOLLOW_ruleTableElement_in_entryRuleTableElement301);
            ruleTableElement();

            state._fsp--;

             after(grammarAccess.getTableElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableElement308); 

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
            pushFollow(FOLLOW_rule__TableElement__Group__0_in_ruleTableElement334);
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
            pushFollow(FOLLOW_ruleTableProperty_in_entryRuleTableProperty361);
            ruleTableProperty();

            state._fsp--;

             after(grammarAccess.getTablePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableProperty368); 

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
            pushFollow(FOLLOW_rule__TableProperty__Group__0_in_ruleTableProperty394);
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


    // $ANTLR start "entryRuleSPDiagram"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:228:1: entryRuleSPDiagram : ruleSPDiagram EOF ;
    public final void entryRuleSPDiagram() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:229:1: ( ruleSPDiagram EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:230:1: ruleSPDiagram EOF
            {
             before(grammarAccess.getSPDiagramRule()); 
            pushFollow(FOLLOW_ruleSPDiagram_in_entryRuleSPDiagram421);
            ruleSPDiagram();

            state._fsp--;

             after(grammarAccess.getSPDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPDiagram428); 

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
    // $ANTLR end "entryRuleSPDiagram"


    // $ANTLR start "ruleSPDiagram"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:237:1: ruleSPDiagram : ( ( rule__SPDiagram__Group__0 ) ) ;
    public final void ruleSPDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:241:2: ( ( ( rule__SPDiagram__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:242:1: ( ( rule__SPDiagram__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:242:1: ( ( rule__SPDiagram__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:243:1: ( rule__SPDiagram__Group__0 )
            {
             before(grammarAccess.getSPDiagramAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:244:1: ( rule__SPDiagram__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:244:2: rule__SPDiagram__Group__0
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__0_in_ruleSPDiagram454);
            rule__SPDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSPDiagramAccess().getGroup()); 

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
    // $ANTLR end "ruleSPDiagram"


    // $ANTLR start "entryRuleDiagramElement"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:256:1: entryRuleDiagramElement : ruleDiagramElement EOF ;
    public final void entryRuleDiagramElement() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:257:1: ( ruleDiagramElement EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:258:1: ruleDiagramElement EOF
            {
             before(grammarAccess.getDiagramElementRule()); 
            pushFollow(FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement481);
            ruleDiagramElement();

            state._fsp--;

             after(grammarAccess.getDiagramElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramElement488); 

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
    // $ANTLR end "entryRuleDiagramElement"


    // $ANTLR start "ruleDiagramElement"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:265:1: ruleDiagramElement : ( ( rule__DiagramElement__Alternatives ) ) ;
    public final void ruleDiagramElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:269:2: ( ( ( rule__DiagramElement__Alternatives ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:270:1: ( ( rule__DiagramElement__Alternatives ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:270:1: ( ( rule__DiagramElement__Alternatives ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:271:1: ( rule__DiagramElement__Alternatives )
            {
             before(grammarAccess.getDiagramElementAccess().getAlternatives()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:272:1: ( rule__DiagramElement__Alternatives )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:272:2: rule__DiagramElement__Alternatives
            {
            pushFollow(FOLLOW_rule__DiagramElement__Alternatives_in_ruleDiagramElement514);
            rule__DiagramElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDiagramElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDiagramElement"


    // $ANTLR start "entryRuleContainer"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:284:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:285:1: ( ruleContainer EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:286:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer541);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer548); 

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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:293:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:297:2: ( ( ( rule__Container__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:298:1: ( ( rule__Container__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:298:1: ( ( rule__Container__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:299:1: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:300:1: ( rule__Container__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:300:2: rule__Container__Group__0
            {
            pushFollow(FOLLOW_rule__Container__Group__0_in_ruleContainer574);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleContainerStyleDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:312:1: entryRuleContainerStyleDefinition : ruleContainerStyleDefinition EOF ;
    public final void entryRuleContainerStyleDefinition() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:313:1: ( ruleContainerStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:314:1: ruleContainerStyleDefinition EOF
            {
             before(grammarAccess.getContainerStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleContainerStyleDefinition_in_entryRuleContainerStyleDefinition601);
            ruleContainerStyleDefinition();

            state._fsp--;

             after(grammarAccess.getContainerStyleDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerStyleDefinition608); 

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
    // $ANTLR end "entryRuleContainerStyleDefinition"


    // $ANTLR start "ruleContainerStyleDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:321:1: ruleContainerStyleDefinition : ( ( rule__ContainerStyleDefinition__Group__0 ) ) ;
    public final void ruleContainerStyleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:325:2: ( ( ( rule__ContainerStyleDefinition__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:326:1: ( ( rule__ContainerStyleDefinition__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:326:1: ( ( rule__ContainerStyleDefinition__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:327:1: ( rule__ContainerStyleDefinition__Group__0 )
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:328:1: ( rule__ContainerStyleDefinition__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:328:2: rule__ContainerStyleDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__0_in_ruleContainerStyleDefinition634);
            rule__ContainerStyleDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerStyleDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleContainerStyleDefinition"


    // $ANTLR start "entryRuleContainerType"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:340:1: entryRuleContainerType : ruleContainerType EOF ;
    public final void entryRuleContainerType() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:341:1: ( ruleContainerType EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:342:1: ruleContainerType EOF
            {
             before(grammarAccess.getContainerTypeRule()); 
            pushFollow(FOLLOW_ruleContainerType_in_entryRuleContainerType661);
            ruleContainerType();

            state._fsp--;

             after(grammarAccess.getContainerTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerType668); 

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
    // $ANTLR end "entryRuleContainerType"


    // $ANTLR start "ruleContainerType"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:349:1: ruleContainerType : ( ( rule__ContainerType__Alternatives ) ) ;
    public final void ruleContainerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:353:2: ( ( ( rule__ContainerType__Alternatives ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:354:1: ( ( rule__ContainerType__Alternatives ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:354:1: ( ( rule__ContainerType__Alternatives ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:355:1: ( rule__ContainerType__Alternatives )
            {
             before(grammarAccess.getContainerTypeAccess().getAlternatives()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:356:1: ( rule__ContainerType__Alternatives )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:356:2: rule__ContainerType__Alternatives
            {
            pushFollow(FOLLOW_rule__ContainerType__Alternatives_in_ruleContainerType694);
            rule__ContainerType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContainerTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleContainerType"


    // $ANTLR start "entryRuleContainerColorDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:368:1: entryRuleContainerColorDefinition : ruleContainerColorDefinition EOF ;
    public final void entryRuleContainerColorDefinition() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:369:1: ( ruleContainerColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:370:1: ruleContainerColorDefinition EOF
            {
             before(grammarAccess.getContainerColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_entryRuleContainerColorDefinition721);
            ruleContainerColorDefinition();

            state._fsp--;

             after(grammarAccess.getContainerColorDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerColorDefinition728); 

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
    // $ANTLR end "entryRuleContainerColorDefinition"


    // $ANTLR start "ruleContainerColorDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:377:1: ruleContainerColorDefinition : ( ( rule__ContainerColorDefinition__Alternatives ) ) ;
    public final void ruleContainerColorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:381:2: ( ( ( rule__ContainerColorDefinition__Alternatives ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:382:1: ( ( rule__ContainerColorDefinition__Alternatives ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:382:1: ( ( rule__ContainerColorDefinition__Alternatives ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:383:1: ( rule__ContainerColorDefinition__Alternatives )
            {
             before(grammarAccess.getContainerColorDefinitionAccess().getAlternatives()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:384:1: ( rule__ContainerColorDefinition__Alternatives )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:384:2: rule__ContainerColorDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ContainerColorDefinition__Alternatives_in_ruleContainerColorDefinition754);
            rule__ContainerColorDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContainerColorDefinitionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleContainerColorDefinition"


    // $ANTLR start "entryRuleNode"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:396:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:397:1: ( ruleNode EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:398:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode781);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode788); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:405:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:409:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:410:1: ( ( rule__Node__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:410:1: ( ( rule__Node__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:411:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:412:1: ( rule__Node__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:412:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode814);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeStyleDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:424:1: entryRuleNodeStyleDefinition : ruleNodeStyleDefinition EOF ;
    public final void entryRuleNodeStyleDefinition() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:425:1: ( ruleNodeStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:426:1: ruleNodeStyleDefinition EOF
            {
             before(grammarAccess.getNodeStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeStyleDefinition_in_entryRuleNodeStyleDefinition841);
            ruleNodeStyleDefinition();

            state._fsp--;

             after(grammarAccess.getNodeStyleDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeStyleDefinition848); 

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
    // $ANTLR end "entryRuleNodeStyleDefinition"


    // $ANTLR start "ruleNodeStyleDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:433:1: ruleNodeStyleDefinition : ( ( rule__NodeStyleDefinition__Group__0 ) ) ;
    public final void ruleNodeStyleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:437:2: ( ( ( rule__NodeStyleDefinition__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:438:1: ( ( rule__NodeStyleDefinition__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:438:1: ( ( rule__NodeStyleDefinition__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:439:1: ( rule__NodeStyleDefinition__Group__0 )
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:440:1: ( rule__NodeStyleDefinition__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:440:2: rule__NodeStyleDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__0_in_ruleNodeStyleDefinition874);
            rule__NodeStyleDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeStyleDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleNodeStyleDefinition"


    // $ANTLR start "entryRuleSolidColorDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:452:1: entryRuleSolidColorDefinition : ruleSolidColorDefinition EOF ;
    public final void entryRuleSolidColorDefinition() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:453:1: ( ruleSolidColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:454:1: ruleSolidColorDefinition EOF
            {
             before(grammarAccess.getSolidColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_entryRuleSolidColorDefinition901);
            ruleSolidColorDefinition();

            state._fsp--;

             after(grammarAccess.getSolidColorDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolidColorDefinition908); 

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
    // $ANTLR end "entryRuleSolidColorDefinition"


    // $ANTLR start "ruleSolidColorDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:461:1: ruleSolidColorDefinition : ( ( rule__SolidColorDefinition__Group__0 ) ) ;
    public final void ruleSolidColorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:465:2: ( ( ( rule__SolidColorDefinition__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:466:1: ( ( rule__SolidColorDefinition__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:466:1: ( ( rule__SolidColorDefinition__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:467:1: ( rule__SolidColorDefinition__Group__0 )
            {
             before(grammarAccess.getSolidColorDefinitionAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:468:1: ( rule__SolidColorDefinition__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:468:2: rule__SolidColorDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__SolidColorDefinition__Group__0_in_ruleSolidColorDefinition934);
            rule__SolidColorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSolidColorDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleSolidColorDefinition"


    // $ANTLR start "entryRuleGradientColorDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:480:1: entryRuleGradientColorDefinition : ruleGradientColorDefinition EOF ;
    public final void entryRuleGradientColorDefinition() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:481:1: ( ruleGradientColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:482:1: ruleGradientColorDefinition EOF
            {
             before(grammarAccess.getGradientColorDefinitionRule()); 
            pushFollow(FOLLOW_ruleGradientColorDefinition_in_entryRuleGradientColorDefinition961);
            ruleGradientColorDefinition();

            state._fsp--;

             after(grammarAccess.getGradientColorDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGradientColorDefinition968); 

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
    // $ANTLR end "entryRuleGradientColorDefinition"


    // $ANTLR start "ruleGradientColorDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:489:1: ruleGradientColorDefinition : ( ( rule__GradientColorDefinition__Group__0 ) ) ;
    public final void ruleGradientColorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:493:2: ( ( ( rule__GradientColorDefinition__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:494:1: ( ( rule__GradientColorDefinition__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:494:1: ( ( rule__GradientColorDefinition__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:495:1: ( rule__GradientColorDefinition__Group__0 )
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:496:1: ( rule__GradientColorDefinition__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:496:2: rule__GradientColorDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__0_in_ruleGradientColorDefinition994);
            rule__GradientColorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGradientColorDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleGradientColorDefinition"


    // $ANTLR start "entryRuleLabelStyleDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:508:1: entryRuleLabelStyleDefinition : ruleLabelStyleDefinition EOF ;
    public final void entryRuleLabelStyleDefinition() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:509:1: ( ruleLabelStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:510:1: ruleLabelStyleDefinition EOF
            {
             before(grammarAccess.getLabelStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleLabelStyleDefinition_in_entryRuleLabelStyleDefinition1021);
            ruleLabelStyleDefinition();

            state._fsp--;

             after(grammarAccess.getLabelStyleDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelStyleDefinition1028); 

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
    // $ANTLR end "entryRuleLabelStyleDefinition"


    // $ANTLR start "ruleLabelStyleDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:517:1: ruleLabelStyleDefinition : ( ( rule__LabelStyleDefinition__Group__0 ) ) ;
    public final void ruleLabelStyleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:521:2: ( ( ( rule__LabelStyleDefinition__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:522:1: ( ( rule__LabelStyleDefinition__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:522:1: ( ( rule__LabelStyleDefinition__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:523:1: ( rule__LabelStyleDefinition__Group__0 )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:524:1: ( rule__LabelStyleDefinition__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:524:2: rule__LabelStyleDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__0_in_ruleLabelStyleDefinition1054);
            rule__LabelStyleDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelStyleDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleLabelStyleDefinition"


    // $ANTLR start "entryRuleBorderStyleDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:536:1: entryRuleBorderStyleDefinition : ruleBorderStyleDefinition EOF ;
    public final void entryRuleBorderStyleDefinition() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:537:1: ( ruleBorderStyleDefinition EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:538:1: ruleBorderStyleDefinition EOF
            {
             before(grammarAccess.getBorderStyleDefinitionRule()); 
            pushFollow(FOLLOW_ruleBorderStyleDefinition_in_entryRuleBorderStyleDefinition1081);
            ruleBorderStyleDefinition();

            state._fsp--;

             after(grammarAccess.getBorderStyleDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderStyleDefinition1088); 

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
    // $ANTLR end "entryRuleBorderStyleDefinition"


    // $ANTLR start "ruleBorderStyleDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:545:1: ruleBorderStyleDefinition : ( ( rule__BorderStyleDefinition__Group__0 ) ) ;
    public final void ruleBorderStyleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:549:2: ( ( ( rule__BorderStyleDefinition__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:550:1: ( ( rule__BorderStyleDefinition__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:550:1: ( ( rule__BorderStyleDefinition__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:551:1: ( rule__BorderStyleDefinition__Group__0 )
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:552:1: ( rule__BorderStyleDefinition__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:552:2: rule__BorderStyleDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__0_in_ruleBorderStyleDefinition1114);
            rule__BorderStyleDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBorderStyleDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleBorderStyleDefinition"


    // $ANTLR start "entryRuleSPExpression"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:564:1: entryRuleSPExpression : ruleSPExpression EOF ;
    public final void entryRuleSPExpression() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:565:1: ( ruleSPExpression EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:566:1: ruleSPExpression EOF
            {
             before(grammarAccess.getSPExpressionRule()); 
            pushFollow(FOLLOW_ruleSPExpression_in_entryRuleSPExpression1141);
            ruleSPExpression();

            state._fsp--;

             after(grammarAccess.getSPExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPExpression1148); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:573:1: ruleSPExpression : ( ( rule__SPExpression__Alternatives ) ) ;
    public final void ruleSPExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:577:2: ( ( ( rule__SPExpression__Alternatives ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:578:1: ( ( rule__SPExpression__Alternatives ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:578:1: ( ( rule__SPExpression__Alternatives ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:579:1: ( rule__SPExpression__Alternatives )
            {
             before(grammarAccess.getSPExpressionAccess().getAlternatives()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:580:1: ( rule__SPExpression__Alternatives )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:580:2: rule__SPExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__SPExpression__Alternatives_in_ruleSPExpression1174);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:592:1: entryRuleAcceleoExpression : ruleAcceleoExpression EOF ;
    public final void entryRuleAcceleoExpression() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:593:1: ( ruleAcceleoExpression EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:594:1: ruleAcceleoExpression EOF
            {
             before(grammarAccess.getAcceleoExpressionRule()); 
            pushFollow(FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression1201);
            ruleAcceleoExpression();

            state._fsp--;

             after(grammarAccess.getAcceleoExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcceleoExpression1208); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:601:1: ruleAcceleoExpression : ( ( rule__AcceleoExpression__Group__0 ) ) ;
    public final void ruleAcceleoExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:605:2: ( ( ( rule__AcceleoExpression__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:606:1: ( ( rule__AcceleoExpression__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:606:1: ( ( rule__AcceleoExpression__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:607:1: ( rule__AcceleoExpression__Group__0 )
            {
             before(grammarAccess.getAcceleoExpressionAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:608:1: ( rule__AcceleoExpression__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:608:2: rule__AcceleoExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__Group__0_in_ruleAcceleoExpression1234);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:620:1: entryRuleVarRef : ruleVarRef EOF ;
    public final void entryRuleVarRef() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:621:1: ( ruleVarRef EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:622:1: ruleVarRef EOF
            {
             before(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef1261);
            ruleVarRef();

            state._fsp--;

             after(grammarAccess.getVarRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef1268); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:629:1: ruleVarRef : ( ( rule__VarRef__Group__0 ) ) ;
    public final void ruleVarRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:633:2: ( ( ( rule__VarRef__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:634:1: ( ( rule__VarRef__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:634:1: ( ( rule__VarRef__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:635:1: ( rule__VarRef__Group__0 )
            {
             before(grammarAccess.getVarRefAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:636:1: ( rule__VarRef__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:636:2: rule__VarRef__Group__0
            {
            pushFollow(FOLLOW_rule__VarRef__Group__0_in_ruleVarRef1294);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:648:1: entryRuleFeatureRef : ruleFeatureRef EOF ;
    public final void entryRuleFeatureRef() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:649:1: ( ruleFeatureRef EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:650:1: ruleFeatureRef EOF
            {
             before(grammarAccess.getFeatureRefRule()); 
            pushFollow(FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef1321);
            ruleFeatureRef();

            state._fsp--;

             after(grammarAccess.getFeatureRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRef1328); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:657:1: ruleFeatureRef : ( ( rule__FeatureRef__Group__0 ) ) ;
    public final void ruleFeatureRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:661:2: ( ( ( rule__FeatureRef__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:662:1: ( ( rule__FeatureRef__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:662:1: ( ( rule__FeatureRef__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:663:1: ( rule__FeatureRef__Group__0 )
            {
             before(grammarAccess.getFeatureRefAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:664:1: ( rule__FeatureRef__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:664:2: rule__FeatureRef__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureRef__Group__0_in_ruleFeatureRef1354);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:676:1: entryRuleMetamodelRef : ruleMetamodelRef EOF ;
    public final void entryRuleMetamodelRef() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:677:1: ( ruleMetamodelRef EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:678:1: ruleMetamodelRef EOF
            {
             before(grammarAccess.getMetamodelRefRule()); 
            pushFollow(FOLLOW_ruleMetamodelRef_in_entryRuleMetamodelRef1381);
            ruleMetamodelRef();

            state._fsp--;

             after(grammarAccess.getMetamodelRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelRef1388); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:685:1: ruleMetamodelRef : ( ( rule__MetamodelRef__Group__0 ) ) ;
    public final void ruleMetamodelRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:689:2: ( ( ( rule__MetamodelRef__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:690:1: ( ( rule__MetamodelRef__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:690:1: ( ( rule__MetamodelRef__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:691:1: ( rule__MetamodelRef__Group__0 )
            {
             before(grammarAccess.getMetamodelRefAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:692:1: ( rule__MetamodelRef__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:692:2: rule__MetamodelRef__Group__0
            {
            pushFollow(FOLLOW_rule__MetamodelRef__Group__0_in_ruleMetamodelRef1414);
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


    // $ANTLR start "entryRuleColor"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:704:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:705:1: ( ruleColor EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:706:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor1441);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor1448); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:713:1: ruleColor : ( rulePreDefinedColorDefinition ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:717:2: ( ( rulePreDefinedColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:718:1: ( rulePreDefinedColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:718:1: ( rulePreDefinedColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:719:1: rulePreDefinedColorDefinition
            {
             before(grammarAccess.getColorAccess().getPreDefinedColorDefinitionParserRuleCall()); 
            pushFollow(FOLLOW_rulePreDefinedColorDefinition_in_ruleColor1474);
            rulePreDefinedColorDefinition();

            state._fsp--;

             after(grammarAccess.getColorAccess().getPreDefinedColorDefinitionParserRuleCall()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRulePreDefinedColorDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:732:1: entryRulePreDefinedColorDefinition : rulePreDefinedColorDefinition EOF ;
    public final void entryRulePreDefinedColorDefinition() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:733:1: ( rulePreDefinedColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:734:1: rulePreDefinedColorDefinition EOF
            {
             before(grammarAccess.getPreDefinedColorDefinitionRule()); 
            pushFollow(FOLLOW_rulePreDefinedColorDefinition_in_entryRulePreDefinedColorDefinition1500);
            rulePreDefinedColorDefinition();

            state._fsp--;

             after(grammarAccess.getPreDefinedColorDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreDefinedColorDefinition1507); 

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
    // $ANTLR end "entryRulePreDefinedColorDefinition"


    // $ANTLR start "rulePreDefinedColorDefinition"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:741:1: rulePreDefinedColorDefinition : ( ( rule__PreDefinedColorDefinition__ColorAssignment ) ) ;
    public final void rulePreDefinedColorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:745:2: ( ( ( rule__PreDefinedColorDefinition__ColorAssignment ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:746:1: ( ( rule__PreDefinedColorDefinition__ColorAssignment ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:746:1: ( ( rule__PreDefinedColorDefinition__ColorAssignment ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:747:1: ( rule__PreDefinedColorDefinition__ColorAssignment )
            {
             before(grammarAccess.getPreDefinedColorDefinitionAccess().getColorAssignment()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:748:1: ( rule__PreDefinedColorDefinition__ColorAssignment )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:748:2: rule__PreDefinedColorDefinition__ColorAssignment
            {
            pushFollow(FOLLOW_rule__PreDefinedColorDefinition__ColorAssignment_in_rulePreDefinedColorDefinition1533);
            rule__PreDefinedColorDefinition__ColorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPreDefinedColorDefinitionAccess().getColorAssignment()); 

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
    // $ANTLR end "rulePreDefinedColorDefinition"


    // $ANTLR start "rulePreDefinedColor"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:761:1: rulePreDefinedColor : ( ( rule__PreDefinedColor__Alternatives ) ) ;
    public final void rulePreDefinedColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:765:1: ( ( ( rule__PreDefinedColor__Alternatives ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:766:1: ( ( rule__PreDefinedColor__Alternatives ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:766:1: ( ( rule__PreDefinedColor__Alternatives ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:767:1: ( rule__PreDefinedColor__Alternatives )
            {
             before(grammarAccess.getPreDefinedColorAccess().getAlternatives()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:768:1: ( rule__PreDefinedColor__Alternatives )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:768:2: rule__PreDefinedColor__Alternatives
            {
            pushFollow(FOLLOW_rule__PreDefinedColor__Alternatives_in_rulePreDefinedColor1570);
            rule__PreDefinedColor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPreDefinedColorAccess().getAlternatives()); 

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
    // $ANTLR end "rulePreDefinedColor"


    // $ANTLR start "rule__SPRepresentation__Alternatives"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:779:1: rule__SPRepresentation__Alternatives : ( ( ruleSPTable ) | ( ruleSPDiagram ) );
    public final void rule__SPRepresentation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:783:1: ( ( ruleSPTable ) | ( ruleSPDiagram ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==46) ) {
                alt1=1;
            }
            else if ( (LA1_0==54) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:784:1: ( ruleSPTable )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:784:1: ( ruleSPTable )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:785:1: ruleSPTable
                    {
                     before(grammarAccess.getSPRepresentationAccess().getSPTableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSPTable_in_rule__SPRepresentation__Alternatives1605);
                    ruleSPTable();

                    state._fsp--;

                     after(grammarAccess.getSPRepresentationAccess().getSPTableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:790:6: ( ruleSPDiagram )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:790:6: ( ruleSPDiagram )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:791:1: ruleSPDiagram
                    {
                     before(grammarAccess.getSPRepresentationAccess().getSPDiagramParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSPDiagram_in_rule__SPRepresentation__Alternatives1622);
                    ruleSPDiagram();

                    state._fsp--;

                     after(grammarAccess.getSPRepresentationAccess().getSPDiagramParserRuleCall_1()); 

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
    // $ANTLR end "rule__SPRepresentation__Alternatives"


    // $ANTLR start "rule__DiagramElement__Alternatives"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:801:1: rule__DiagramElement__Alternatives : ( ( ruleContainer ) | ( ruleNode ) );
    public final void rule__DiagramElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:805:1: ( ( ruleContainer ) | ( ruleNode ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 70:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=11 && LA2_1<=12)||LA2_1==55||LA2_1==71) ) {
                    alt2=1;
                }
                else if ( (LA2_1==60) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 11:
            case 12:
            case 55:
            case 71:
                {
                alt2=1;
                }
                break;
            case 60:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:806:1: ( ruleContainer )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:806:1: ( ruleContainer )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:807:1: ruleContainer
                    {
                     before(grammarAccess.getDiagramElementAccess().getContainerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleContainer_in_rule__DiagramElement__Alternatives1654);
                    ruleContainer();

                    state._fsp--;

                     after(grammarAccess.getDiagramElementAccess().getContainerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:812:6: ( ruleNode )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:812:6: ( ruleNode )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:813:1: ruleNode
                    {
                     before(grammarAccess.getDiagramElementAccess().getNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNode_in_rule__DiagramElement__Alternatives1671);
                    ruleNode();

                    state._fsp--;

                     after(grammarAccess.getDiagramElementAccess().getNodeParserRuleCall_1()); 

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
    // $ANTLR end "rule__DiagramElement__Alternatives"


    // $ANTLR start "rule__ContainerType__Alternatives"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:823:1: rule__ContainerType__Alternatives : ( ( 'freeform' ) | ( 'list' ) );
    public final void rule__ContainerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:827:1: ( ( 'freeform' ) | ( 'list' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:828:1: ( 'freeform' )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:828:1: ( 'freeform' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:829:1: 'freeform'
                    {
                     before(grammarAccess.getContainerTypeAccess().getFreeformKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__ContainerType__Alternatives1704); 
                     after(grammarAccess.getContainerTypeAccess().getFreeformKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:836:6: ( 'list' )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:836:6: ( 'list' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:837:1: 'list'
                    {
                     before(grammarAccess.getContainerTypeAccess().getListKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__ContainerType__Alternatives1724); 
                     after(grammarAccess.getContainerTypeAccess().getListKeyword_1()); 

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
    // $ANTLR end "rule__ContainerType__Alternatives"


    // $ANTLR start "rule__ContainerColorDefinition__Alternatives"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:849:1: rule__ContainerColorDefinition__Alternatives : ( ( ruleSolidColorDefinition ) | ( ruleGradientColorDefinition ) );
    public final void rule__ContainerColorDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:853:1: ( ( ruleSolidColorDefinition ) | ( ruleGradientColorDefinition ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==61) ) {
                alt4=1;
            }
            else if ( (LA4_0==62) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:854:1: ( ruleSolidColorDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:854:1: ( ruleSolidColorDefinition )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:855:1: ruleSolidColorDefinition
                    {
                     before(grammarAccess.getContainerColorDefinitionAccess().getSolidColorDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__ContainerColorDefinition__Alternatives1758);
                    ruleSolidColorDefinition();

                    state._fsp--;

                     after(grammarAccess.getContainerColorDefinitionAccess().getSolidColorDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:860:6: ( ruleGradientColorDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:860:6: ( ruleGradientColorDefinition )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:861:1: ruleGradientColorDefinition
                    {
                     before(grammarAccess.getContainerColorDefinitionAccess().getGradientColorDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGradientColorDefinition_in_rule__ContainerColorDefinition__Alternatives1775);
                    ruleGradientColorDefinition();

                    state._fsp--;

                     after(grammarAccess.getContainerColorDefinitionAccess().getGradientColorDefinitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__ContainerColorDefinition__Alternatives"


    // $ANTLR start "rule__SPExpression__Alternatives"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:871:1: rule__SPExpression__Alternatives : ( ( ruleAcceleoExpression ) | ( ruleVarRef ) | ( ruleFeatureRef ) );
    public final void rule__SPExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:875:1: ( ( ruleAcceleoExpression ) | ( ruleVarRef ) | ( ruleFeatureRef ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt5=1;
                }
                break;
            case 67:
                {
                alt5=2;
                }
                break;
            case 68:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:876:1: ( ruleAcceleoExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:876:1: ( ruleAcceleoExpression )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:877:1: ruleAcceleoExpression
                    {
                     before(grammarAccess.getSPExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAcceleoExpression_in_rule__SPExpression__Alternatives1807);
                    ruleAcceleoExpression();

                    state._fsp--;

                     after(grammarAccess.getSPExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:882:6: ( ruleVarRef )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:882:6: ( ruleVarRef )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:883:1: ruleVarRef
                    {
                     before(grammarAccess.getSPExpressionAccess().getVarRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVarRef_in_rule__SPExpression__Alternatives1824);
                    ruleVarRef();

                    state._fsp--;

                     after(grammarAccess.getSPExpressionAccess().getVarRefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:888:6: ( ruleFeatureRef )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:888:6: ( ruleFeatureRef )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:889:1: ruleFeatureRef
                    {
                     before(grammarAccess.getSPExpressionAccess().getFeatureRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFeatureRef_in_rule__SPExpression__Alternatives1841);
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


    // $ANTLR start "rule__PreDefinedColor__Alternatives"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:899:1: rule__PreDefinedColor__Alternatives : ( ( ( 'white' ) ) | ( ( 'black' ) ) | ( ( 'blue' ) ) | ( ( 'light blue' ) ) | ( ( 'dark blue' ) ) | ( ( 'chocolate' ) ) | ( ( 'light chocolate' ) ) | ( ( 'dark chocolate' ) ) | ( ( 'gray' ) ) | ( ( 'light gray' ) ) | ( ( 'dark gray' ) ) | ( ( 'green' ) ) | ( ( 'light green' ) ) | ( ( 'dark green' ) ) | ( ( 'orange' ) ) | ( ( 'light orange' ) ) | ( ( 'dark orange' ) ) | ( ( 'purple' ) ) | ( ( 'light purple' ) ) | ( ( 'dark purple' ) ) | ( ( 'red' ) ) | ( ( 'light red' ) ) | ( ( 'dark red' ) ) | ( ( 'yellow' ) ) | ( ( 'light yellow' ) ) | ( ( 'dark yellow' ) ) );
    public final void rule__PreDefinedColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:903:1: ( ( ( 'white' ) ) | ( ( 'black' ) ) | ( ( 'blue' ) ) | ( ( 'light blue' ) ) | ( ( 'dark blue' ) ) | ( ( 'chocolate' ) ) | ( ( 'light chocolate' ) ) | ( ( 'dark chocolate' ) ) | ( ( 'gray' ) ) | ( ( 'light gray' ) ) | ( ( 'dark gray' ) ) | ( ( 'green' ) ) | ( ( 'light green' ) ) | ( ( 'dark green' ) ) | ( ( 'orange' ) ) | ( ( 'light orange' ) ) | ( ( 'dark orange' ) ) | ( ( 'purple' ) ) | ( ( 'light purple' ) ) | ( ( 'dark purple' ) ) | ( ( 'red' ) ) | ( ( 'light red' ) ) | ( ( 'dark red' ) ) | ( ( 'yellow' ) ) | ( ( 'light yellow' ) ) | ( ( 'dark yellow' ) ) )
            int alt6=26;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            case 19:
                {
                alt6=7;
                }
                break;
            case 20:
                {
                alt6=8;
                }
                break;
            case 21:
                {
                alt6=9;
                }
                break;
            case 22:
                {
                alt6=10;
                }
                break;
            case 23:
                {
                alt6=11;
                }
                break;
            case 24:
                {
                alt6=12;
                }
                break;
            case 25:
                {
                alt6=13;
                }
                break;
            case 26:
                {
                alt6=14;
                }
                break;
            case 27:
                {
                alt6=15;
                }
                break;
            case 28:
                {
                alt6=16;
                }
                break;
            case 29:
                {
                alt6=17;
                }
                break;
            case 30:
                {
                alt6=18;
                }
                break;
            case 31:
                {
                alt6=19;
                }
                break;
            case 32:
                {
                alt6=20;
                }
                break;
            case 33:
                {
                alt6=21;
                }
                break;
            case 34:
                {
                alt6=22;
                }
                break;
            case 35:
                {
                alt6=23;
                }
                break;
            case 36:
                {
                alt6=24;
                }
                break;
            case 37:
                {
                alt6=25;
                }
                break;
            case 38:
                {
                alt6=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:904:1: ( ( 'white' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:904:1: ( ( 'white' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:905:1: ( 'white' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:906:1: ( 'white' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:906:3: 'white'
                    {
                    match(input,13,FOLLOW_13_in_rule__PreDefinedColor__Alternatives1874); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:911:6: ( ( 'black' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:911:6: ( ( 'black' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:912:1: ( 'black' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:913:1: ( 'black' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:913:3: 'black'
                    {
                    match(input,14,FOLLOW_14_in_rule__PreDefinedColor__Alternatives1895); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:918:6: ( ( 'blue' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:918:6: ( ( 'blue' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:919:1: ( 'blue' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:920:1: ( 'blue' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:920:3: 'blue'
                    {
                    match(input,15,FOLLOW_15_in_rule__PreDefinedColor__Alternatives1916); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:925:6: ( ( 'light blue' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:925:6: ( ( 'light blue' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:926:1: ( 'light blue' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:927:1: ( 'light blue' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:927:3: 'light blue'
                    {
                    match(input,16,FOLLOW_16_in_rule__PreDefinedColor__Alternatives1937); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:932:6: ( ( 'dark blue' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:932:6: ( ( 'dark blue' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:933:1: ( 'dark blue' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:934:1: ( 'dark blue' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:934:3: 'dark blue'
                    {
                    match(input,17,FOLLOW_17_in_rule__PreDefinedColor__Alternatives1958); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:939:6: ( ( 'chocolate' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:939:6: ( ( 'chocolate' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:940:1: ( 'chocolate' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:941:1: ( 'chocolate' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:941:3: 'chocolate'
                    {
                    match(input,18,FOLLOW_18_in_rule__PreDefinedColor__Alternatives1979); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:946:6: ( ( 'light chocolate' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:946:6: ( ( 'light chocolate' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:947:1: ( 'light chocolate' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:948:1: ( 'light chocolate' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:948:3: 'light chocolate'
                    {
                    match(input,19,FOLLOW_19_in_rule__PreDefinedColor__Alternatives2000); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:953:6: ( ( 'dark chocolate' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:953:6: ( ( 'dark chocolate' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:954:1: ( 'dark chocolate' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:955:1: ( 'dark chocolate' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:955:3: 'dark chocolate'
                    {
                    match(input,20,FOLLOW_20_in_rule__PreDefinedColor__Alternatives2021); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:960:6: ( ( 'gray' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:960:6: ( ( 'gray' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:961:1: ( 'gray' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:962:1: ( 'gray' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:962:3: 'gray'
                    {
                    match(input,21,FOLLOW_21_in_rule__PreDefinedColor__Alternatives2042); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:967:6: ( ( 'light gray' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:967:6: ( ( 'light gray' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:968:1: ( 'light gray' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:969:1: ( 'light gray' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:969:3: 'light gray'
                    {
                    match(input,22,FOLLOW_22_in_rule__PreDefinedColor__Alternatives2063); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:974:6: ( ( 'dark gray' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:974:6: ( ( 'dark gray' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:975:1: ( 'dark gray' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:976:1: ( 'dark gray' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:976:3: 'dark gray'
                    {
                    match(input,23,FOLLOW_23_in_rule__PreDefinedColor__Alternatives2084); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:981:6: ( ( 'green' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:981:6: ( ( 'green' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:982:1: ( 'green' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:983:1: ( 'green' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:983:3: 'green'
                    {
                    match(input,24,FOLLOW_24_in_rule__PreDefinedColor__Alternatives2105); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:988:6: ( ( 'light green' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:988:6: ( ( 'light green' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:989:1: ( 'light green' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:990:1: ( 'light green' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:990:3: 'light green'
                    {
                    match(input,25,FOLLOW_25_in_rule__PreDefinedColor__Alternatives2126); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:995:6: ( ( 'dark green' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:995:6: ( ( 'dark green' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:996:1: ( 'dark green' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:997:1: ( 'dark green' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:997:3: 'dark green'
                    {
                    match(input,26,FOLLOW_26_in_rule__PreDefinedColor__Alternatives2147); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1002:6: ( ( 'orange' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1002:6: ( ( 'orange' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1003:1: ( 'orange' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1004:1: ( 'orange' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1004:3: 'orange'
                    {
                    match(input,27,FOLLOW_27_in_rule__PreDefinedColor__Alternatives2168); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1009:6: ( ( 'light orange' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1009:6: ( ( 'light orange' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1010:1: ( 'light orange' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1011:1: ( 'light orange' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1011:3: 'light orange'
                    {
                    match(input,28,FOLLOW_28_in_rule__PreDefinedColor__Alternatives2189); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1016:6: ( ( 'dark orange' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1016:6: ( ( 'dark orange' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1017:1: ( 'dark orange' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1018:1: ( 'dark orange' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1018:3: 'dark orange'
                    {
                    match(input,29,FOLLOW_29_in_rule__PreDefinedColor__Alternatives2210); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1023:6: ( ( 'purple' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1023:6: ( ( 'purple' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1024:1: ( 'purple' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1025:1: ( 'purple' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1025:3: 'purple'
                    {
                    match(input,30,FOLLOW_30_in_rule__PreDefinedColor__Alternatives2231); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1030:6: ( ( 'light purple' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1030:6: ( ( 'light purple' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1031:1: ( 'light purple' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1032:1: ( 'light purple' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1032:3: 'light purple'
                    {
                    match(input,31,FOLLOW_31_in_rule__PreDefinedColor__Alternatives2252); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1037:6: ( ( 'dark purple' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1037:6: ( ( 'dark purple' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1038:1: ( 'dark purple' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1039:1: ( 'dark purple' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1039:3: 'dark purple'
                    {
                    match(input,32,FOLLOW_32_in_rule__PreDefinedColor__Alternatives2273); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1044:6: ( ( 'red' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1044:6: ( ( 'red' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1045:1: ( 'red' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1046:1: ( 'red' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1046:3: 'red'
                    {
                    match(input,33,FOLLOW_33_in_rule__PreDefinedColor__Alternatives2294); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1051:6: ( ( 'light red' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1051:6: ( ( 'light red' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1052:1: ( 'light red' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1053:1: ( 'light red' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1053:3: 'light red'
                    {
                    match(input,34,FOLLOW_34_in_rule__PreDefinedColor__Alternatives2315); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1058:6: ( ( 'dark red' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1058:6: ( ( 'dark red' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1059:1: ( 'dark red' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1060:1: ( 'dark red' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1060:3: 'dark red'
                    {
                    match(input,35,FOLLOW_35_in_rule__PreDefinedColor__Alternatives2336); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1065:6: ( ( 'yellow' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1065:6: ( ( 'yellow' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1066:1: ( 'yellow' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1067:1: ( 'yellow' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1067:3: 'yellow'
                    {
                    match(input,36,FOLLOW_36_in_rule__PreDefinedColor__Alternatives2357); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1072:6: ( ( 'light yellow' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1072:6: ( ( 'light yellow' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1073:1: ( 'light yellow' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1074:1: ( 'light yellow' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1074:3: 'light yellow'
                    {
                    match(input,37,FOLLOW_37_in_rule__PreDefinedColor__Alternatives2378); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1079:6: ( ( 'dark yellow' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1079:6: ( ( 'dark yellow' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1080:1: ( 'dark yellow' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_YELLOWEnumLiteralDeclaration_25()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1081:1: ( 'dark yellow' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1081:3: 'dark yellow'
                    {
                    match(input,38,FOLLOW_38_in_rule__PreDefinedColor__Alternatives2399); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_YELLOWEnumLiteralDeclaration_25()); 

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
    // $ANTLR end "rule__PreDefinedColor__Alternatives"


    // $ANTLR start "rule__SPrototyper__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1093:1: rule__SPrototyper__Group__0 : rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1 ;
    public final void rule__SPrototyper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1097:1: ( rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1098:2: rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__0__Impl_in_rule__SPrototyper__Group__02432);
            rule__SPrototyper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__1_in_rule__SPrototyper__Group__02435);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1105:1: rule__SPrototyper__Group__0__Impl : ( 'proto' ) ;
    public final void rule__SPrototyper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1109:1: ( ( 'proto' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1110:1: ( 'proto' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1110:1: ( 'proto' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1111:1: 'proto'
            {
             before(grammarAccess.getSPrototyperAccess().getProtoKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__SPrototyper__Group__0__Impl2463); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1124:1: rule__SPrototyper__Group__1 : rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2 ;
    public final void rule__SPrototyper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1128:1: ( rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1129:2: rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__1__Impl_in_rule__SPrototyper__Group__12494);
            rule__SPrototyper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__2_in_rule__SPrototyper__Group__12497);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1136:1: rule__SPrototyper__Group__1__Impl : ( ( rule__SPrototyper__NameAssignment_1 ) ) ;
    public final void rule__SPrototyper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1140:1: ( ( ( rule__SPrototyper__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1141:1: ( ( rule__SPrototyper__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1141:1: ( ( rule__SPrototyper__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1142:1: ( rule__SPrototyper__NameAssignment_1 )
            {
             before(grammarAccess.getSPrototyperAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1143:1: ( rule__SPrototyper__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1143:2: rule__SPrototyper__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPrototyper__NameAssignment_1_in_rule__SPrototyper__Group__1__Impl2524);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1153:1: rule__SPrototyper__Group__2 : rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3 ;
    public final void rule__SPrototyper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1157:1: ( rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1158:2: rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__2__Impl_in_rule__SPrototyper__Group__22554);
            rule__SPrototyper__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__3_in_rule__SPrototyper__Group__22557);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1165:1: rule__SPrototyper__Group__2__Impl : ( '{' ) ;
    public final void rule__SPrototyper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1169:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1170:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1170:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1171:1: '{'
            {
             before(grammarAccess.getSPrototyperAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPrototyper__Group__2__Impl2585); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1184:1: rule__SPrototyper__Group__3 : rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4 ;
    public final void rule__SPrototyper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1188:1: ( rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1189:2: rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__3__Impl_in_rule__SPrototyper__Group__32616);
            rule__SPrototyper__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__4_in_rule__SPrototyper__Group__32619);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1196:1: rule__SPrototyper__Group__3__Impl : ( ( rule__SPrototyper__Group_3__0 )? ) ;
    public final void rule__SPrototyper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1200:1: ( ( ( rule__SPrototyper__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1201:1: ( ( rule__SPrototyper__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1201:1: ( ( rule__SPrototyper__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1202:1: ( rule__SPrototyper__Group_3__0 )?
            {
             before(grammarAccess.getSPrototyperAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1203:1: ( rule__SPrototyper__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==42) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1203:2: rule__SPrototyper__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPrototyper__Group_3__0_in_rule__SPrototyper__Group__3__Impl2646);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1213:1: rule__SPrototyper__Group__4 : rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5 ;
    public final void rule__SPrototyper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1217:1: ( rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1218:2: rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__4__Impl_in_rule__SPrototyper__Group__42677);
            rule__SPrototyper__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__5_in_rule__SPrototyper__Group__42680);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1225:1: rule__SPrototyper__Group__4__Impl : ( ( rule__SPrototyper__ViewpointsAssignment_4 )* ) ;
    public final void rule__SPrototyper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1229:1: ( ( ( rule__SPrototyper__ViewpointsAssignment_4 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1230:1: ( ( rule__SPrototyper__ViewpointsAssignment_4 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1230:1: ( ( rule__SPrototyper__ViewpointsAssignment_4 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1231:1: ( rule__SPrototyper__ViewpointsAssignment_4 )*
            {
             before(grammarAccess.getSPrototyperAccess().getViewpointsAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1232:1: ( rule__SPrototyper__ViewpointsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==43) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1232:2: rule__SPrototyper__ViewpointsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SPrototyper__ViewpointsAssignment_4_in_rule__SPrototyper__Group__4__Impl2707);
            	    rule__SPrototyper__ViewpointsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1242:1: rule__SPrototyper__Group__5 : rule__SPrototyper__Group__5__Impl ;
    public final void rule__SPrototyper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1246:1: ( rule__SPrototyper__Group__5__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1247:2: rule__SPrototyper__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__5__Impl_in_rule__SPrototyper__Group__52738);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1253:1: rule__SPrototyper__Group__5__Impl : ( '}' ) ;
    public final void rule__SPrototyper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1257:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1258:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1258:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1259:1: '}'
            {
             before(grammarAccess.getSPrototyperAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__SPrototyper__Group__5__Impl2766); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1284:1: rule__SPrototyper__Group_3__0 : rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1 ;
    public final void rule__SPrototyper__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1288:1: ( rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1289:2: rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group_3__0__Impl_in_rule__SPrototyper__Group_3__02809);
            rule__SPrototyper__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group_3__1_in_rule__SPrototyper__Group_3__02812);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1296:1: rule__SPrototyper__Group_3__0__Impl : ( 'qualifier' ) ;
    public final void rule__SPrototyper__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1300:1: ( ( 'qualifier' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1301:1: ( 'qualifier' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1301:1: ( 'qualifier' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1302:1: 'qualifier'
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierKeyword_3_0()); 
            match(input,42,FOLLOW_42_in_rule__SPrototyper__Group_3__0__Impl2840); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1315:1: rule__SPrototyper__Group_3__1 : rule__SPrototyper__Group_3__1__Impl ;
    public final void rule__SPrototyper__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1319:1: ( rule__SPrototyper__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1320:2: rule__SPrototyper__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group_3__1__Impl_in_rule__SPrototyper__Group_3__12871);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1326:1: rule__SPrototyper__Group_3__1__Impl : ( ( rule__SPrototyper__QualifierAssignment_3_1 ) ) ;
    public final void rule__SPrototyper__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1330:1: ( ( ( rule__SPrototyper__QualifierAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1331:1: ( ( rule__SPrototyper__QualifierAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1331:1: ( ( rule__SPrototyper__QualifierAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1332:1: ( rule__SPrototyper__QualifierAssignment_3_1 )
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1333:1: ( rule__SPrototyper__QualifierAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1333:2: rule__SPrototyper__QualifierAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPrototyper__QualifierAssignment_3_1_in_rule__SPrototyper__Group_3__1__Impl2898);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1347:1: rule__SPViewpoint__Group__0 : rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1 ;
    public final void rule__SPViewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1351:1: ( rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1352:2: rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__0__Impl_in_rule__SPViewpoint__Group__02932);
            rule__SPViewpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__1_in_rule__SPViewpoint__Group__02935);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1359:1: rule__SPViewpoint__Group__0__Impl : ( 'viewpoint' ) ;
    public final void rule__SPViewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1363:1: ( ( 'viewpoint' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1364:1: ( 'viewpoint' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1364:1: ( 'viewpoint' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1365:1: 'viewpoint'
            {
             before(grammarAccess.getSPViewpointAccess().getViewpointKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__SPViewpoint__Group__0__Impl2963); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1378:1: rule__SPViewpoint__Group__1 : rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2 ;
    public final void rule__SPViewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1382:1: ( rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1383:2: rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__1__Impl_in_rule__SPViewpoint__Group__12994);
            rule__SPViewpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__2_in_rule__SPViewpoint__Group__12997);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1390:1: rule__SPViewpoint__Group__1__Impl : ( ( rule__SPViewpoint__NameAssignment_1 ) ) ;
    public final void rule__SPViewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1394:1: ( ( ( rule__SPViewpoint__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1395:1: ( ( rule__SPViewpoint__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1395:1: ( ( rule__SPViewpoint__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1396:1: ( rule__SPViewpoint__NameAssignment_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1397:1: ( rule__SPViewpoint__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1397:2: rule__SPViewpoint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__NameAssignment_1_in_rule__SPViewpoint__Group__1__Impl3024);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1407:1: rule__SPViewpoint__Group__2 : rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3 ;
    public final void rule__SPViewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1411:1: ( rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1412:2: rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__2__Impl_in_rule__SPViewpoint__Group__23054);
            rule__SPViewpoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__3_in_rule__SPViewpoint__Group__23057);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1419:1: rule__SPViewpoint__Group__2__Impl : ( '{' ) ;
    public final void rule__SPViewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1423:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1424:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1424:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1425:1: '{'
            {
             before(grammarAccess.getSPViewpointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPViewpoint__Group__2__Impl3085); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1438:1: rule__SPViewpoint__Group__3 : rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4 ;
    public final void rule__SPViewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1442:1: ( rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1443:2: rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__3__Impl_in_rule__SPViewpoint__Group__33116);
            rule__SPViewpoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__4_in_rule__SPViewpoint__Group__33119);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1450:1: rule__SPViewpoint__Group__3__Impl : ( ( rule__SPViewpoint__Group_3__0 )? ) ;
    public final void rule__SPViewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1454:1: ( ( ( rule__SPViewpoint__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1455:1: ( ( rule__SPViewpoint__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1455:1: ( ( rule__SPViewpoint__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1456:1: ( rule__SPViewpoint__Group_3__0 )?
            {
             before(grammarAccess.getSPViewpointAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1457:1: ( rule__SPViewpoint__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1457:2: rule__SPViewpoint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPViewpoint__Group_3__0_in_rule__SPViewpoint__Group__3__Impl3146);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1467:1: rule__SPViewpoint__Group__4 : rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5 ;
    public final void rule__SPViewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1471:1: ( rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1472:2: rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__4__Impl_in_rule__SPViewpoint__Group__43177);
            rule__SPViewpoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__5_in_rule__SPViewpoint__Group__43180);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1479:1: rule__SPViewpoint__Group__4__Impl : ( ( rule__SPViewpoint__Group_4__0 )? ) ;
    public final void rule__SPViewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1483:1: ( ( ( rule__SPViewpoint__Group_4__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1484:1: ( ( rule__SPViewpoint__Group_4__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1484:1: ( ( rule__SPViewpoint__Group_4__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1485:1: ( rule__SPViewpoint__Group_4__0 )?
            {
             before(grammarAccess.getSPViewpointAccess().getGroup_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1486:1: ( rule__SPViewpoint__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1486:2: rule__SPViewpoint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SPViewpoint__Group_4__0_in_rule__SPViewpoint__Group__4__Impl3207);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1496:1: rule__SPViewpoint__Group__5 : rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6 ;
    public final void rule__SPViewpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1500:1: ( rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1501:2: rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__5__Impl_in_rule__SPViewpoint__Group__53238);
            rule__SPViewpoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__6_in_rule__SPViewpoint__Group__53241);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1508:1: rule__SPViewpoint__Group__5__Impl : ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* ) ;
    public final void rule__SPViewpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1512:1: ( ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1513:1: ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1513:1: ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1514:1: ( rule__SPViewpoint__RepresentationsAssignment_5 )*
            {
             before(grammarAccess.getSPViewpointAccess().getRepresentationsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1515:1: ( rule__SPViewpoint__RepresentationsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==46||LA11_0==54) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1515:2: rule__SPViewpoint__RepresentationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SPViewpoint__RepresentationsAssignment_5_in_rule__SPViewpoint__Group__5__Impl3268);
            	    rule__SPViewpoint__RepresentationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1525:1: rule__SPViewpoint__Group__6 : rule__SPViewpoint__Group__6__Impl ;
    public final void rule__SPViewpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1529:1: ( rule__SPViewpoint__Group__6__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1530:2: rule__SPViewpoint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__6__Impl_in_rule__SPViewpoint__Group__63299);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1536:1: rule__SPViewpoint__Group__6__Impl : ( '}' ) ;
    public final void rule__SPViewpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1540:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1541:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1541:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1542:1: '}'
            {
             before(grammarAccess.getSPViewpointAccess().getRightCurlyBracketKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__SPViewpoint__Group__6__Impl3327); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1569:1: rule__SPViewpoint__Group_3__0 : rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1 ;
    public final void rule__SPViewpoint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1573:1: ( rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1574:2: rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__0__Impl_in_rule__SPViewpoint__Group_3__03372);
            rule__SPViewpoint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__1_in_rule__SPViewpoint__Group_3__03375);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1581:1: rule__SPViewpoint__Group_3__0__Impl : ( 'shortcut' ) ;
    public final void rule__SPViewpoint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1585:1: ( ( 'shortcut' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1586:1: ( 'shortcut' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1586:1: ( 'shortcut' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1587:1: 'shortcut'
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutKeyword_3_0()); 
            match(input,44,FOLLOW_44_in_rule__SPViewpoint__Group_3__0__Impl3403); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1600:1: rule__SPViewpoint__Group_3__1 : rule__SPViewpoint__Group_3__1__Impl ;
    public final void rule__SPViewpoint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1604:1: ( rule__SPViewpoint__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1605:2: rule__SPViewpoint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__1__Impl_in_rule__SPViewpoint__Group_3__13434);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1611:1: rule__SPViewpoint__Group_3__1__Impl : ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) ) ;
    public final void rule__SPViewpoint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1615:1: ( ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1616:1: ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1616:1: ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1617:1: ( rule__SPViewpoint__ShortcutAssignment_3_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1618:1: ( rule__SPViewpoint__ShortcutAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1618:2: rule__SPViewpoint__ShortcutAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__ShortcutAssignment_3_1_in_rule__SPViewpoint__Group_3__1__Impl3461);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1632:1: rule__SPViewpoint__Group_4__0 : rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1 ;
    public final void rule__SPViewpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1636:1: ( rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1637:2: rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__0__Impl_in_rule__SPViewpoint__Group_4__03495);
            rule__SPViewpoint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__1_in_rule__SPViewpoint__Group_4__03498);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1644:1: rule__SPViewpoint__Group_4__0__Impl : ( 'ext' ) ;
    public final void rule__SPViewpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1648:1: ( ( 'ext' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1649:1: ( 'ext' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1649:1: ( 'ext' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1650:1: 'ext'
            {
             before(grammarAccess.getSPViewpointAccess().getExtKeyword_4_0()); 
            match(input,45,FOLLOW_45_in_rule__SPViewpoint__Group_4__0__Impl3526); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1663:1: rule__SPViewpoint__Group_4__1 : rule__SPViewpoint__Group_4__1__Impl ;
    public final void rule__SPViewpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1667:1: ( rule__SPViewpoint__Group_4__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1668:2: rule__SPViewpoint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__1__Impl_in_rule__SPViewpoint__Group_4__13557);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1674:1: rule__SPViewpoint__Group_4__1__Impl : ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) ) ;
    public final void rule__SPViewpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1678:1: ( ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1679:1: ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1679:1: ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1680:1: ( rule__SPViewpoint__ExtensionAssignment_4_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getExtensionAssignment_4_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1681:1: ( rule__SPViewpoint__ExtensionAssignment_4_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1681:2: rule__SPViewpoint__ExtensionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__ExtensionAssignment_4_1_in_rule__SPViewpoint__Group_4__1__Impl3584);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1695:1: rule__SPTable__Group__0 : rule__SPTable__Group__0__Impl rule__SPTable__Group__1 ;
    public final void rule__SPTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1699:1: ( rule__SPTable__Group__0__Impl rule__SPTable__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1700:2: rule__SPTable__Group__0__Impl rule__SPTable__Group__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group__0__Impl_in_rule__SPTable__Group__03618);
            rule__SPTable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__1_in_rule__SPTable__Group__03621);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1707:1: rule__SPTable__Group__0__Impl : ( 'table' ) ;
    public final void rule__SPTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1711:1: ( ( 'table' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1712:1: ( 'table' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1712:1: ( 'table' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1713:1: 'table'
            {
             before(grammarAccess.getSPTableAccess().getTableKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__SPTable__Group__0__Impl3649); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1726:1: rule__SPTable__Group__1 : rule__SPTable__Group__1__Impl rule__SPTable__Group__2 ;
    public final void rule__SPTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1730:1: ( rule__SPTable__Group__1__Impl rule__SPTable__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1731:2: rule__SPTable__Group__1__Impl rule__SPTable__Group__2
            {
            pushFollow(FOLLOW_rule__SPTable__Group__1__Impl_in_rule__SPTable__Group__13680);
            rule__SPTable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__2_in_rule__SPTable__Group__13683);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1738:1: rule__SPTable__Group__1__Impl : ( ( rule__SPTable__NameAssignment_1 ) ) ;
    public final void rule__SPTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1742:1: ( ( ( rule__SPTable__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1743:1: ( ( rule__SPTable__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1743:1: ( ( rule__SPTable__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1744:1: ( rule__SPTable__NameAssignment_1 )
            {
             before(grammarAccess.getSPTableAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1745:1: ( rule__SPTable__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1745:2: rule__SPTable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPTable__NameAssignment_1_in_rule__SPTable__Group__1__Impl3710);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1755:1: rule__SPTable__Group__2 : rule__SPTable__Group__2__Impl rule__SPTable__Group__3 ;
    public final void rule__SPTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1759:1: ( rule__SPTable__Group__2__Impl rule__SPTable__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1760:2: rule__SPTable__Group__2__Impl rule__SPTable__Group__3
            {
            pushFollow(FOLLOW_rule__SPTable__Group__2__Impl_in_rule__SPTable__Group__23740);
            rule__SPTable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__3_in_rule__SPTable__Group__23743);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1767:1: rule__SPTable__Group__2__Impl : ( '{' ) ;
    public final void rule__SPTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1771:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1772:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1772:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1773:1: '{'
            {
             before(grammarAccess.getSPTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPTable__Group__2__Impl3771); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1786:1: rule__SPTable__Group__3 : rule__SPTable__Group__3__Impl rule__SPTable__Group__4 ;
    public final void rule__SPTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1790:1: ( rule__SPTable__Group__3__Impl rule__SPTable__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1791:2: rule__SPTable__Group__3__Impl rule__SPTable__Group__4
            {
            pushFollow(FOLLOW_rule__SPTable__Group__3__Impl_in_rule__SPTable__Group__33802);
            rule__SPTable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__4_in_rule__SPTable__Group__33805);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1798:1: rule__SPTable__Group__3__Impl : ( ( rule__SPTable__Group_3__0 )? ) ;
    public final void rule__SPTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1802:1: ( ( ( rule__SPTable__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1803:1: ( ( rule__SPTable__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1803:1: ( ( rule__SPTable__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1804:1: ( rule__SPTable__Group_3__0 )?
            {
             before(grammarAccess.getSPTableAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1805:1: ( rule__SPTable__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==48) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1805:2: rule__SPTable__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPTable__Group_3__0_in_rule__SPTable__Group__3__Impl3832);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1815:1: rule__SPTable__Group__4 : rule__SPTable__Group__4__Impl rule__SPTable__Group__5 ;
    public final void rule__SPTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1819:1: ( rule__SPTable__Group__4__Impl rule__SPTable__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1820:2: rule__SPTable__Group__4__Impl rule__SPTable__Group__5
            {
            pushFollow(FOLLOW_rule__SPTable__Group__4__Impl_in_rule__SPTable__Group__43863);
            rule__SPTable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__5_in_rule__SPTable__Group__43866);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1827:1: rule__SPTable__Group__4__Impl : ( ( rule__SPTable__Group_4__0 )? ) ;
    public final void rule__SPTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1831:1: ( ( ( rule__SPTable__Group_4__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1832:1: ( ( rule__SPTable__Group_4__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1832:1: ( ( rule__SPTable__Group_4__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1833:1: ( rule__SPTable__Group_4__0 )?
            {
             before(grammarAccess.getSPTableAccess().getGroup_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1834:1: ( rule__SPTable__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1834:2: rule__SPTable__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SPTable__Group_4__0_in_rule__SPTable__Group__4__Impl3893);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1844:1: rule__SPTable__Group__5 : rule__SPTable__Group__5__Impl rule__SPTable__Group__6 ;
    public final void rule__SPTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1848:1: ( rule__SPTable__Group__5__Impl rule__SPTable__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1849:2: rule__SPTable__Group__5__Impl rule__SPTable__Group__6
            {
            pushFollow(FOLLOW_rule__SPTable__Group__5__Impl_in_rule__SPTable__Group__53924);
            rule__SPTable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__6_in_rule__SPTable__Group__53927);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1856:1: rule__SPTable__Group__5__Impl : ( ( ( rule__SPTable__MetamodelsAssignment_5 ) ) ( ( rule__SPTable__MetamodelsAssignment_5 )* ) ) ;
    public final void rule__SPTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1860:1: ( ( ( ( rule__SPTable__MetamodelsAssignment_5 ) ) ( ( rule__SPTable__MetamodelsAssignment_5 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1861:1: ( ( ( rule__SPTable__MetamodelsAssignment_5 ) ) ( ( rule__SPTable__MetamodelsAssignment_5 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1861:1: ( ( ( rule__SPTable__MetamodelsAssignment_5 ) ) ( ( rule__SPTable__MetamodelsAssignment_5 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1862:1: ( ( rule__SPTable__MetamodelsAssignment_5 ) ) ( ( rule__SPTable__MetamodelsAssignment_5 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1862:1: ( ( rule__SPTable__MetamodelsAssignment_5 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1863:1: ( rule__SPTable__MetamodelsAssignment_5 )
            {
             before(grammarAccess.getSPTableAccess().getMetamodelsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1864:1: ( rule__SPTable__MetamodelsAssignment_5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1864:2: rule__SPTable__MetamodelsAssignment_5
            {
            pushFollow(FOLLOW_rule__SPTable__MetamodelsAssignment_5_in_rule__SPTable__Group__5__Impl3956);
            rule__SPTable__MetamodelsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getMetamodelsAssignment_5()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1867:1: ( ( rule__SPTable__MetamodelsAssignment_5 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1868:1: ( rule__SPTable__MetamodelsAssignment_5 )*
            {
             before(grammarAccess.getSPTableAccess().getMetamodelsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1869:1: ( rule__SPTable__MetamodelsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==69) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1869:2: rule__SPTable__MetamodelsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__MetamodelsAssignment_5_in_rule__SPTable__Group__5__Impl3968);
            	    rule__SPTable__MetamodelsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1880:1: rule__SPTable__Group__6 : rule__SPTable__Group__6__Impl rule__SPTable__Group__7 ;
    public final void rule__SPTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1884:1: ( rule__SPTable__Group__6__Impl rule__SPTable__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1885:2: rule__SPTable__Group__6__Impl rule__SPTable__Group__7
            {
            pushFollow(FOLLOW_rule__SPTable__Group__6__Impl_in_rule__SPTable__Group__64001);
            rule__SPTable__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__7_in_rule__SPTable__Group__64004);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1892:1: rule__SPTable__Group__6__Impl : ( 'root' ) ;
    public final void rule__SPTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1896:1: ( ( 'root' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1897:1: ( 'root' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1897:1: ( 'root' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1898:1: 'root'
            {
             before(grammarAccess.getSPTableAccess().getRootKeyword_6()); 
            match(input,47,FOLLOW_47_in_rule__SPTable__Group__6__Impl4032); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1911:1: rule__SPTable__Group__7 : rule__SPTable__Group__7__Impl rule__SPTable__Group__8 ;
    public final void rule__SPTable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1915:1: ( rule__SPTable__Group__7__Impl rule__SPTable__Group__8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1916:2: rule__SPTable__Group__7__Impl rule__SPTable__Group__8
            {
            pushFollow(FOLLOW_rule__SPTable__Group__7__Impl_in_rule__SPTable__Group__74063);
            rule__SPTable__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__8_in_rule__SPTable__Group__74066);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1923:1: rule__SPTable__Group__7__Impl : ( ( rule__SPTable__RootAssignment_7 ) ) ;
    public final void rule__SPTable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1927:1: ( ( ( rule__SPTable__RootAssignment_7 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1928:1: ( ( rule__SPTable__RootAssignment_7 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1928:1: ( ( rule__SPTable__RootAssignment_7 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1929:1: ( rule__SPTable__RootAssignment_7 )
            {
             before(grammarAccess.getSPTableAccess().getRootAssignment_7()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1930:1: ( rule__SPTable__RootAssignment_7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1930:2: rule__SPTable__RootAssignment_7
            {
            pushFollow(FOLLOW_rule__SPTable__RootAssignment_7_in_rule__SPTable__Group__7__Impl4093);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1940:1: rule__SPTable__Group__8 : rule__SPTable__Group__8__Impl rule__SPTable__Group__9 ;
    public final void rule__SPTable__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1944:1: ( rule__SPTable__Group__8__Impl rule__SPTable__Group__9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1945:2: rule__SPTable__Group__8__Impl rule__SPTable__Group__9
            {
            pushFollow(FOLLOW_rule__SPTable__Group__8__Impl_in_rule__SPTable__Group__84123);
            rule__SPTable__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__9_in_rule__SPTable__Group__84126);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1952:1: rule__SPTable__Group__8__Impl : ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) ) ;
    public final void rule__SPTable__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1956:1: ( ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1957:1: ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1957:1: ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1958:1: ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1958:1: ( ( rule__SPTable__ElementsAssignment_8 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1959:1: ( rule__SPTable__ElementsAssignment_8 )
            {
             before(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1960:1: ( rule__SPTable__ElementsAssignment_8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1960:2: rule__SPTable__ElementsAssignment_8
            {
            pushFollow(FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4155);
            rule__SPTable__ElementsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1963:1: ( ( rule__SPTable__ElementsAssignment_8 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1964:1: ( rule__SPTable__ElementsAssignment_8 )*
            {
             before(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1965:1: ( rule__SPTable__ElementsAssignment_8 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==50||(LA15_0>=70 && LA15_0<=71)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1965:2: rule__SPTable__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4167);
            	    rule__SPTable__ElementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1976:1: rule__SPTable__Group__9 : rule__SPTable__Group__9__Impl rule__SPTable__Group__10 ;
    public final void rule__SPTable__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1980:1: ( rule__SPTable__Group__9__Impl rule__SPTable__Group__10 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1981:2: rule__SPTable__Group__9__Impl rule__SPTable__Group__10
            {
            pushFollow(FOLLOW_rule__SPTable__Group__9__Impl_in_rule__SPTable__Group__94200);
            rule__SPTable__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__10_in_rule__SPTable__Group__94203);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1988:1: rule__SPTable__Group__9__Impl : ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) ) ;
    public final void rule__SPTable__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1992:1: ( ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1993:1: ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1993:1: ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1994:1: ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1994:1: ( ( rule__SPTable__PropertiesAssignment_9 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1995:1: ( rule__SPTable__PropertiesAssignment_9 )
            {
             before(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1996:1: ( rule__SPTable__PropertiesAssignment_9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1996:2: rule__SPTable__PropertiesAssignment_9
            {
            pushFollow(FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4232);
            rule__SPTable__PropertiesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1999:1: ( ( rule__SPTable__PropertiesAssignment_9 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2000:1: ( rule__SPTable__PropertiesAssignment_9 )*
            {
             before(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2001:1: ( rule__SPTable__PropertiesAssignment_9 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==52) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2001:2: rule__SPTable__PropertiesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4244);
            	    rule__SPTable__PropertiesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2012:1: rule__SPTable__Group__10 : rule__SPTable__Group__10__Impl ;
    public final void rule__SPTable__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2016:1: ( rule__SPTable__Group__10__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2017:2: rule__SPTable__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group__10__Impl_in_rule__SPTable__Group__104277);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2023:1: rule__SPTable__Group__10__Impl : ( '}' ) ;
    public final void rule__SPTable__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2027:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2028:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2028:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2029:1: '}'
            {
             before(grammarAccess.getSPTableAccess().getRightCurlyBracketKeyword_10()); 
            match(input,41,FOLLOW_41_in_rule__SPTable__Group__10__Impl4305); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2064:1: rule__SPTable__Group_3__0 : rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1 ;
    public final void rule__SPTable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2068:1: ( rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2069:2: rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group_3__0__Impl_in_rule__SPTable__Group_3__04358);
            rule__SPTable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group_3__1_in_rule__SPTable__Group_3__04361);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2076:1: rule__SPTable__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__SPTable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2080:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2081:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2081:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2082:1: 'label'
            {
             before(grammarAccess.getSPTableAccess().getLabelKeyword_3_0()); 
            match(input,48,FOLLOW_48_in_rule__SPTable__Group_3__0__Impl4389); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2095:1: rule__SPTable__Group_3__1 : rule__SPTable__Group_3__1__Impl ;
    public final void rule__SPTable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2099:1: ( rule__SPTable__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2100:2: rule__SPTable__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group_3__1__Impl_in_rule__SPTable__Group_3__14420);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2106:1: rule__SPTable__Group_3__1__Impl : ( ( rule__SPTable__LabelAssignment_3_1 ) ) ;
    public final void rule__SPTable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2110:1: ( ( ( rule__SPTable__LabelAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2111:1: ( ( rule__SPTable__LabelAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2111:1: ( ( rule__SPTable__LabelAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2112:1: ( rule__SPTable__LabelAssignment_3_1 )
            {
             before(grammarAccess.getSPTableAccess().getLabelAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2113:1: ( rule__SPTable__LabelAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2113:2: rule__SPTable__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPTable__LabelAssignment_3_1_in_rule__SPTable__Group_3__1__Impl4447);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2127:1: rule__SPTable__Group_4__0 : rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1 ;
    public final void rule__SPTable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2131:1: ( rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2132:2: rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group_4__0__Impl_in_rule__SPTable__Group_4__04481);
            rule__SPTable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group_4__1_in_rule__SPTable__Group_4__04484);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2139:1: rule__SPTable__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__SPTable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2143:1: ( ( 'title' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2144:1: ( 'title' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2144:1: ( 'title' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2145:1: 'title'
            {
             before(grammarAccess.getSPTableAccess().getTitleKeyword_4_0()); 
            match(input,49,FOLLOW_49_in_rule__SPTable__Group_4__0__Impl4512); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2158:1: rule__SPTable__Group_4__1 : rule__SPTable__Group_4__1__Impl ;
    public final void rule__SPTable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2162:1: ( rule__SPTable__Group_4__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2163:2: rule__SPTable__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group_4__1__Impl_in_rule__SPTable__Group_4__14543);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2169:1: rule__SPTable__Group_4__1__Impl : ( ( rule__SPTable__TitleAssignment_4_1 ) ) ;
    public final void rule__SPTable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2173:1: ( ( ( rule__SPTable__TitleAssignment_4_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2174:1: ( ( rule__SPTable__TitleAssignment_4_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2174:1: ( ( rule__SPTable__TitleAssignment_4_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2175:1: ( rule__SPTable__TitleAssignment_4_1 )
            {
             before(grammarAccess.getSPTableAccess().getTitleAssignment_4_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2176:1: ( rule__SPTable__TitleAssignment_4_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2176:2: rule__SPTable__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SPTable__TitleAssignment_4_1_in_rule__SPTable__Group_4__1__Impl4570);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2190:1: rule__TableElement__Group__0 : rule__TableElement__Group__0__Impl rule__TableElement__Group__1 ;
    public final void rule__TableElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2194:1: ( rule__TableElement__Group__0__Impl rule__TableElement__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2195:2: rule__TableElement__Group__0__Impl rule__TableElement__Group__1
            {
            pushFollow(FOLLOW_rule__TableElement__Group__0__Impl_in_rule__TableElement__Group__04604);
            rule__TableElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__1_in_rule__TableElement__Group__04607);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2202:1: rule__TableElement__Group__0__Impl : ( ( rule__TableElement__CreatableAssignment_0 )? ) ;
    public final void rule__TableElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2206:1: ( ( ( rule__TableElement__CreatableAssignment_0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2207:1: ( ( rule__TableElement__CreatableAssignment_0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2207:1: ( ( rule__TableElement__CreatableAssignment_0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2208:1: ( rule__TableElement__CreatableAssignment_0 )?
            {
             before(grammarAccess.getTableElementAccess().getCreatableAssignment_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2209:1: ( rule__TableElement__CreatableAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==70) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2209:2: rule__TableElement__CreatableAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TableElement__CreatableAssignment_0_in_rule__TableElement__Group__0__Impl4634);
                    rule__TableElement__CreatableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableElementAccess().getCreatableAssignment_0()); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2219:1: rule__TableElement__Group__1 : rule__TableElement__Group__1__Impl rule__TableElement__Group__2 ;
    public final void rule__TableElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2223:1: ( rule__TableElement__Group__1__Impl rule__TableElement__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2224:2: rule__TableElement__Group__1__Impl rule__TableElement__Group__2
            {
            pushFollow(FOLLOW_rule__TableElement__Group__1__Impl_in_rule__TableElement__Group__14665);
            rule__TableElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__2_in_rule__TableElement__Group__14668);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2231:1: rule__TableElement__Group__1__Impl : ( ( rule__TableElement__RecursiveAssignment_1 )? ) ;
    public final void rule__TableElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2235:1: ( ( ( rule__TableElement__RecursiveAssignment_1 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2236:1: ( ( rule__TableElement__RecursiveAssignment_1 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2236:1: ( ( rule__TableElement__RecursiveAssignment_1 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2237:1: ( rule__TableElement__RecursiveAssignment_1 )?
            {
             before(grammarAccess.getTableElementAccess().getRecursiveAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2238:1: ( rule__TableElement__RecursiveAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==71) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2238:2: rule__TableElement__RecursiveAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TableElement__RecursiveAssignment_1_in_rule__TableElement__Group__1__Impl4695);
                    rule__TableElement__RecursiveAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableElementAccess().getRecursiveAssignment_1()); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2248:1: rule__TableElement__Group__2 : rule__TableElement__Group__2__Impl rule__TableElement__Group__3 ;
    public final void rule__TableElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2252:1: ( rule__TableElement__Group__2__Impl rule__TableElement__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2253:2: rule__TableElement__Group__2__Impl rule__TableElement__Group__3
            {
            pushFollow(FOLLOW_rule__TableElement__Group__2__Impl_in_rule__TableElement__Group__24726);
            rule__TableElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__3_in_rule__TableElement__Group__24729);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2260:1: rule__TableElement__Group__2__Impl : ( 'element' ) ;
    public final void rule__TableElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2264:1: ( ( 'element' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2265:1: ( 'element' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2265:1: ( 'element' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2266:1: 'element'
            {
             before(grammarAccess.getTableElementAccess().getElementKeyword_2()); 
            match(input,50,FOLLOW_50_in_rule__TableElement__Group__2__Impl4757); 
             after(grammarAccess.getTableElementAccess().getElementKeyword_2()); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2279:1: rule__TableElement__Group__3 : rule__TableElement__Group__3__Impl rule__TableElement__Group__4 ;
    public final void rule__TableElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2283:1: ( rule__TableElement__Group__3__Impl rule__TableElement__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2284:2: rule__TableElement__Group__3__Impl rule__TableElement__Group__4
            {
            pushFollow(FOLLOW_rule__TableElement__Group__3__Impl_in_rule__TableElement__Group__34788);
            rule__TableElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__4_in_rule__TableElement__Group__34791);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2291:1: rule__TableElement__Group__3__Impl : ( ( rule__TableElement__EClassAssignment_3 ) ) ;
    public final void rule__TableElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2295:1: ( ( ( rule__TableElement__EClassAssignment_3 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2296:1: ( ( rule__TableElement__EClassAssignment_3 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2296:1: ( ( rule__TableElement__EClassAssignment_3 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2297:1: ( rule__TableElement__EClassAssignment_3 )
            {
             before(grammarAccess.getTableElementAccess().getEClassAssignment_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2298:1: ( rule__TableElement__EClassAssignment_3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2298:2: rule__TableElement__EClassAssignment_3
            {
            pushFollow(FOLLOW_rule__TableElement__EClassAssignment_3_in_rule__TableElement__Group__3__Impl4818);
            rule__TableElement__EClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getEClassAssignment_3()); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2308:1: rule__TableElement__Group__4 : rule__TableElement__Group__4__Impl rule__TableElement__Group__5 ;
    public final void rule__TableElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2312:1: ( rule__TableElement__Group__4__Impl rule__TableElement__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2313:2: rule__TableElement__Group__4__Impl rule__TableElement__Group__5
            {
            pushFollow(FOLLOW_rule__TableElement__Group__4__Impl_in_rule__TableElement__Group__44848);
            rule__TableElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__5_in_rule__TableElement__Group__44851);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2320:1: rule__TableElement__Group__4__Impl : ( 'accessibleThrough' ) ;
    public final void rule__TableElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2324:1: ( ( 'accessibleThrough' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2325:1: ( 'accessibleThrough' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2325:1: ( 'accessibleThrough' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2326:1: 'accessibleThrough'
            {
             before(grammarAccess.getTableElementAccess().getAccessibleThroughKeyword_4()); 
            match(input,51,FOLLOW_51_in_rule__TableElement__Group__4__Impl4879); 
             after(grammarAccess.getTableElementAccess().getAccessibleThroughKeyword_4()); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2339:1: rule__TableElement__Group__5 : rule__TableElement__Group__5__Impl rule__TableElement__Group__6 ;
    public final void rule__TableElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2343:1: ( rule__TableElement__Group__5__Impl rule__TableElement__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2344:2: rule__TableElement__Group__5__Impl rule__TableElement__Group__6
            {
            pushFollow(FOLLOW_rule__TableElement__Group__5__Impl_in_rule__TableElement__Group__54910);
            rule__TableElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__6_in_rule__TableElement__Group__54913);
            rule__TableElement__Group__6();

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2351:1: rule__TableElement__Group__5__Impl : ( ( rule__TableElement__ExpressionAssignment_5 ) ) ;
    public final void rule__TableElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2355:1: ( ( ( rule__TableElement__ExpressionAssignment_5 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2356:1: ( ( rule__TableElement__ExpressionAssignment_5 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2356:1: ( ( rule__TableElement__ExpressionAssignment_5 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2357:1: ( rule__TableElement__ExpressionAssignment_5 )
            {
             before(grammarAccess.getTableElementAccess().getExpressionAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2358:1: ( rule__TableElement__ExpressionAssignment_5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2358:2: rule__TableElement__ExpressionAssignment_5
            {
            pushFollow(FOLLOW_rule__TableElement__ExpressionAssignment_5_in_rule__TableElement__Group__5__Impl4940);
            rule__TableElement__ExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getExpressionAssignment_5()); 

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


    // $ANTLR start "rule__TableElement__Group__6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2368:1: rule__TableElement__Group__6 : rule__TableElement__Group__6__Impl ;
    public final void rule__TableElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2372:1: ( rule__TableElement__Group__6__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2373:2: rule__TableElement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TableElement__Group__6__Impl_in_rule__TableElement__Group__64970);
            rule__TableElement__Group__6__Impl();

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
    // $ANTLR end "rule__TableElement__Group__6"


    // $ANTLR start "rule__TableElement__Group__6__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2379:1: rule__TableElement__Group__6__Impl : ( ( rule__TableElement__Group_6__0 )? ) ;
    public final void rule__TableElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2383:1: ( ( ( rule__TableElement__Group_6__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2384:1: ( ( rule__TableElement__Group_6__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2384:1: ( ( rule__TableElement__Group_6__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2385:1: ( rule__TableElement__Group_6__0 )?
            {
             before(grammarAccess.getTableElementAccess().getGroup_6()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2386:1: ( rule__TableElement__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2386:2: rule__TableElement__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__TableElement__Group_6__0_in_rule__TableElement__Group__6__Impl4997);
                    rule__TableElement__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableElementAccess().getGroup_6()); 

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
    // $ANTLR end "rule__TableElement__Group__6__Impl"


    // $ANTLR start "rule__TableElement__Group_6__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2410:1: rule__TableElement__Group_6__0 : rule__TableElement__Group_6__0__Impl rule__TableElement__Group_6__1 ;
    public final void rule__TableElement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2414:1: ( rule__TableElement__Group_6__0__Impl rule__TableElement__Group_6__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2415:2: rule__TableElement__Group_6__0__Impl rule__TableElement__Group_6__1
            {
            pushFollow(FOLLOW_rule__TableElement__Group_6__0__Impl_in_rule__TableElement__Group_6__05042);
            rule__TableElement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group_6__1_in_rule__TableElement__Group_6__05045);
            rule__TableElement__Group_6__1();

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
    // $ANTLR end "rule__TableElement__Group_6__0"


    // $ANTLR start "rule__TableElement__Group_6__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2422:1: rule__TableElement__Group_6__0__Impl : ( '{' ) ;
    public final void rule__TableElement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2426:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2427:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2427:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2428:1: '{'
            {
             before(grammarAccess.getTableElementAccess().getLeftCurlyBracketKeyword_6_0()); 
            match(input,40,FOLLOW_40_in_rule__TableElement__Group_6__0__Impl5073); 
             after(grammarAccess.getTableElementAccess().getLeftCurlyBracketKeyword_6_0()); 

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
    // $ANTLR end "rule__TableElement__Group_6__0__Impl"


    // $ANTLR start "rule__TableElement__Group_6__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2441:1: rule__TableElement__Group_6__1 : rule__TableElement__Group_6__1__Impl rule__TableElement__Group_6__2 ;
    public final void rule__TableElement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2445:1: ( rule__TableElement__Group_6__1__Impl rule__TableElement__Group_6__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2446:2: rule__TableElement__Group_6__1__Impl rule__TableElement__Group_6__2
            {
            pushFollow(FOLLOW_rule__TableElement__Group_6__1__Impl_in_rule__TableElement__Group_6__15104);
            rule__TableElement__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group_6__2_in_rule__TableElement__Group_6__15107);
            rule__TableElement__Group_6__2();

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
    // $ANTLR end "rule__TableElement__Group_6__1"


    // $ANTLR start "rule__TableElement__Group_6__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2453:1: rule__TableElement__Group_6__1__Impl : ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) ) ;
    public final void rule__TableElement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2457:1: ( ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2458:1: ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2458:1: ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2459:1: ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2459:1: ( ( rule__TableElement__SubElementsAssignment_6_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2460:1: ( rule__TableElement__SubElementsAssignment_6_1 )
            {
             before(grammarAccess.getTableElementAccess().getSubElementsAssignment_6_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2461:1: ( rule__TableElement__SubElementsAssignment_6_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2461:2: rule__TableElement__SubElementsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5136);
            rule__TableElement__SubElementsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getSubElementsAssignment_6_1()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2464:1: ( ( rule__TableElement__SubElementsAssignment_6_1 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2465:1: ( rule__TableElement__SubElementsAssignment_6_1 )*
            {
             before(grammarAccess.getTableElementAccess().getSubElementsAssignment_6_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2466:1: ( rule__TableElement__SubElementsAssignment_6_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==50||(LA20_0>=70 && LA20_0<=71)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2466:2: rule__TableElement__SubElementsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5148);
            	    rule__TableElement__SubElementsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTableElementAccess().getSubElementsAssignment_6_1()); 

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
    // $ANTLR end "rule__TableElement__Group_6__1__Impl"


    // $ANTLR start "rule__TableElement__Group_6__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2477:1: rule__TableElement__Group_6__2 : rule__TableElement__Group_6__2__Impl ;
    public final void rule__TableElement__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2481:1: ( rule__TableElement__Group_6__2__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2482:2: rule__TableElement__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__TableElement__Group_6__2__Impl_in_rule__TableElement__Group_6__25181);
            rule__TableElement__Group_6__2__Impl();

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
    // $ANTLR end "rule__TableElement__Group_6__2"


    // $ANTLR start "rule__TableElement__Group_6__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2488:1: rule__TableElement__Group_6__2__Impl : ( '}' ) ;
    public final void rule__TableElement__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2492:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2493:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2493:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2494:1: '}'
            {
             before(grammarAccess.getTableElementAccess().getRightCurlyBracketKeyword_6_2()); 
            match(input,41,FOLLOW_41_in_rule__TableElement__Group_6__2__Impl5209); 
             after(grammarAccess.getTableElementAccess().getRightCurlyBracketKeyword_6_2()); 

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
    // $ANTLR end "rule__TableElement__Group_6__2__Impl"


    // $ANTLR start "rule__TableProperty__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2513:1: rule__TableProperty__Group__0 : rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1 ;
    public final void rule__TableProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2517:1: ( rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2518:2: rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__0__Impl_in_rule__TableProperty__Group__05246);
            rule__TableProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__1_in_rule__TableProperty__Group__05249);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2525:1: rule__TableProperty__Group__0__Impl : ( 'property' ) ;
    public final void rule__TableProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2529:1: ( ( 'property' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2530:1: ( 'property' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2530:1: ( 'property' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2531:1: 'property'
            {
             before(grammarAccess.getTablePropertyAccess().getPropertyKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__TableProperty__Group__0__Impl5277); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2544:1: rule__TableProperty__Group__1 : rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2 ;
    public final void rule__TableProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2548:1: ( rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2549:2: rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__1__Impl_in_rule__TableProperty__Group__15308);
            rule__TableProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__2_in_rule__TableProperty__Group__15311);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2556:1: rule__TableProperty__Group__1__Impl : ( ( rule__TableProperty__FeatureAssignment_1 ) ) ;
    public final void rule__TableProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2560:1: ( ( ( rule__TableProperty__FeatureAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2561:1: ( ( rule__TableProperty__FeatureAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2561:1: ( ( rule__TableProperty__FeatureAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2562:1: ( rule__TableProperty__FeatureAssignment_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getFeatureAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2563:1: ( rule__TableProperty__FeatureAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2563:2: rule__TableProperty__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__TableProperty__FeatureAssignment_1_in_rule__TableProperty__Group__1__Impl5338);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2573:1: rule__TableProperty__Group__2 : rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3 ;
    public final void rule__TableProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2577:1: ( rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2578:2: rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__2__Impl_in_rule__TableProperty__Group__25368);
            rule__TableProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__3_in_rule__TableProperty__Group__25371);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2585:1: rule__TableProperty__Group__2__Impl : ( ( rule__TableProperty__Group_2__0 )? ) ;
    public final void rule__TableProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2589:1: ( ( ( rule__TableProperty__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2590:1: ( ( rule__TableProperty__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2590:1: ( ( rule__TableProperty__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2591:1: ( rule__TableProperty__Group_2__0 )?
            {
             before(grammarAccess.getTablePropertyAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2592:1: ( rule__TableProperty__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2592:2: rule__TableProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TableProperty__Group_2__0_in_rule__TableProperty__Group__2__Impl5398);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2602:1: rule__TableProperty__Group__3 : rule__TableProperty__Group__3__Impl ;
    public final void rule__TableProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2606:1: ( rule__TableProperty__Group__3__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2607:2: rule__TableProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__3__Impl_in_rule__TableProperty__Group__35429);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2613:1: rule__TableProperty__Group__3__Impl : ( ( rule__TableProperty__Group_3__0 )? ) ;
    public final void rule__TableProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2617:1: ( ( ( rule__TableProperty__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2618:1: ( ( rule__TableProperty__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2618:1: ( ( rule__TableProperty__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2619:1: ( rule__TableProperty__Group_3__0 )?
            {
             before(grammarAccess.getTablePropertyAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2620:1: ( rule__TableProperty__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2620:2: rule__TableProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TableProperty__Group_3__0_in_rule__TableProperty__Group__3__Impl5456);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2638:1: rule__TableProperty__Group_2__0 : rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1 ;
    public final void rule__TableProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2642:1: ( rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2643:2: rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_2__0__Impl_in_rule__TableProperty__Group_2__05495);
            rule__TableProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group_2__1_in_rule__TableProperty__Group_2__05498);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2650:1: rule__TableProperty__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__TableProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2654:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2655:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2655:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2656:1: 'label'
            {
             before(grammarAccess.getTablePropertyAccess().getLabelKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__TableProperty__Group_2__0__Impl5526); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2669:1: rule__TableProperty__Group_2__1 : rule__TableProperty__Group_2__1__Impl ;
    public final void rule__TableProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2673:1: ( rule__TableProperty__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2674:2: rule__TableProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_2__1__Impl_in_rule__TableProperty__Group_2__15557);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2680:1: rule__TableProperty__Group_2__1__Impl : ( ( rule__TableProperty__LabelAssignment_2_1 ) ) ;
    public final void rule__TableProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2684:1: ( ( ( rule__TableProperty__LabelAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2685:1: ( ( rule__TableProperty__LabelAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2685:1: ( ( rule__TableProperty__LabelAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2686:1: ( rule__TableProperty__LabelAssignment_2_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getLabelAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2687:1: ( rule__TableProperty__LabelAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2687:2: rule__TableProperty__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TableProperty__LabelAssignment_2_1_in_rule__TableProperty__Group_2__1__Impl5584);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2701:1: rule__TableProperty__Group_3__0 : rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1 ;
    public final void rule__TableProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2705:1: ( rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2706:2: rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_3__0__Impl_in_rule__TableProperty__Group_3__05618);
            rule__TableProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group_3__1_in_rule__TableProperty__Group_3__05621);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2713:1: rule__TableProperty__Group_3__0__Impl : ( 'expression' ) ;
    public final void rule__TableProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2717:1: ( ( 'expression' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2718:1: ( 'expression' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2718:1: ( 'expression' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2719:1: 'expression'
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionKeyword_3_0()); 
            match(input,53,FOLLOW_53_in_rule__TableProperty__Group_3__0__Impl5649); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2732:1: rule__TableProperty__Group_3__1 : rule__TableProperty__Group_3__1__Impl ;
    public final void rule__TableProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2736:1: ( rule__TableProperty__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2737:2: rule__TableProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_3__1__Impl_in_rule__TableProperty__Group_3__15680);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2743:1: rule__TableProperty__Group_3__1__Impl : ( ( rule__TableProperty__ExpressionAssignment_3_1 ) ) ;
    public final void rule__TableProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2747:1: ( ( ( rule__TableProperty__ExpressionAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2748:1: ( ( rule__TableProperty__ExpressionAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2748:1: ( ( rule__TableProperty__ExpressionAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2749:1: ( rule__TableProperty__ExpressionAssignment_3_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2750:1: ( rule__TableProperty__ExpressionAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2750:2: rule__TableProperty__ExpressionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TableProperty__ExpressionAssignment_3_1_in_rule__TableProperty__Group_3__1__Impl5707);
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


    // $ANTLR start "rule__SPDiagram__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2764:1: rule__SPDiagram__Group__0 : rule__SPDiagram__Group__0__Impl rule__SPDiagram__Group__1 ;
    public final void rule__SPDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2768:1: ( rule__SPDiagram__Group__0__Impl rule__SPDiagram__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2769:2: rule__SPDiagram__Group__0__Impl rule__SPDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__0__Impl_in_rule__SPDiagram__Group__05741);
            rule__SPDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__1_in_rule__SPDiagram__Group__05744);
            rule__SPDiagram__Group__1();

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
    // $ANTLR end "rule__SPDiagram__Group__0"


    // $ANTLR start "rule__SPDiagram__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2776:1: rule__SPDiagram__Group__0__Impl : ( 'diagram' ) ;
    public final void rule__SPDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2780:1: ( ( 'diagram' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2781:1: ( 'diagram' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2781:1: ( 'diagram' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2782:1: 'diagram'
            {
             before(grammarAccess.getSPDiagramAccess().getDiagramKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__SPDiagram__Group__0__Impl5772); 
             after(grammarAccess.getSPDiagramAccess().getDiagramKeyword_0()); 

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
    // $ANTLR end "rule__SPDiagram__Group__0__Impl"


    // $ANTLR start "rule__SPDiagram__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2795:1: rule__SPDiagram__Group__1 : rule__SPDiagram__Group__1__Impl rule__SPDiagram__Group__2 ;
    public final void rule__SPDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2799:1: ( rule__SPDiagram__Group__1__Impl rule__SPDiagram__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2800:2: rule__SPDiagram__Group__1__Impl rule__SPDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__1__Impl_in_rule__SPDiagram__Group__15803);
            rule__SPDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__2_in_rule__SPDiagram__Group__15806);
            rule__SPDiagram__Group__2();

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
    // $ANTLR end "rule__SPDiagram__Group__1"


    // $ANTLR start "rule__SPDiagram__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2807:1: rule__SPDiagram__Group__1__Impl : ( ( rule__SPDiagram__NameAssignment_1 ) ) ;
    public final void rule__SPDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2811:1: ( ( ( rule__SPDiagram__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2812:1: ( ( rule__SPDiagram__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2812:1: ( ( rule__SPDiagram__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2813:1: ( rule__SPDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getSPDiagramAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2814:1: ( rule__SPDiagram__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2814:2: rule__SPDiagram__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPDiagram__NameAssignment_1_in_rule__SPDiagram__Group__1__Impl5833);
            rule__SPDiagram__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSPDiagramAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SPDiagram__Group__1__Impl"


    // $ANTLR start "rule__SPDiagram__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2824:1: rule__SPDiagram__Group__2 : rule__SPDiagram__Group__2__Impl rule__SPDiagram__Group__3 ;
    public final void rule__SPDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2828:1: ( rule__SPDiagram__Group__2__Impl rule__SPDiagram__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2829:2: rule__SPDiagram__Group__2__Impl rule__SPDiagram__Group__3
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__2__Impl_in_rule__SPDiagram__Group__25863);
            rule__SPDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__3_in_rule__SPDiagram__Group__25866);
            rule__SPDiagram__Group__3();

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
    // $ANTLR end "rule__SPDiagram__Group__2"


    // $ANTLR start "rule__SPDiagram__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2836:1: rule__SPDiagram__Group__2__Impl : ( '{' ) ;
    public final void rule__SPDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2840:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2841:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2841:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2842:1: '{'
            {
             before(grammarAccess.getSPDiagramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPDiagram__Group__2__Impl5894); 
             after(grammarAccess.getSPDiagramAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SPDiagram__Group__2__Impl"


    // $ANTLR start "rule__SPDiagram__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2855:1: rule__SPDiagram__Group__3 : rule__SPDiagram__Group__3__Impl rule__SPDiagram__Group__4 ;
    public final void rule__SPDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2859:1: ( rule__SPDiagram__Group__3__Impl rule__SPDiagram__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2860:2: rule__SPDiagram__Group__3__Impl rule__SPDiagram__Group__4
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__3__Impl_in_rule__SPDiagram__Group__35925);
            rule__SPDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__4_in_rule__SPDiagram__Group__35928);
            rule__SPDiagram__Group__4();

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
    // $ANTLR end "rule__SPDiagram__Group__3"


    // $ANTLR start "rule__SPDiagram__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2867:1: rule__SPDiagram__Group__3__Impl : ( ( rule__SPDiagram__Group_3__0 )? ) ;
    public final void rule__SPDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2871:1: ( ( ( rule__SPDiagram__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2872:1: ( ( rule__SPDiagram__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2872:1: ( ( rule__SPDiagram__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2873:1: ( rule__SPDiagram__Group_3__0 )?
            {
             before(grammarAccess.getSPDiagramAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2874:1: ( rule__SPDiagram__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2874:2: rule__SPDiagram__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPDiagram__Group_3__0_in_rule__SPDiagram__Group__3__Impl5955);
                    rule__SPDiagram__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSPDiagramAccess().getGroup_3()); 

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
    // $ANTLR end "rule__SPDiagram__Group__3__Impl"


    // $ANTLR start "rule__SPDiagram__Group__4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2884:1: rule__SPDiagram__Group__4 : rule__SPDiagram__Group__4__Impl rule__SPDiagram__Group__5 ;
    public final void rule__SPDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2888:1: ( rule__SPDiagram__Group__4__Impl rule__SPDiagram__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2889:2: rule__SPDiagram__Group__4__Impl rule__SPDiagram__Group__5
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__4__Impl_in_rule__SPDiagram__Group__45986);
            rule__SPDiagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__5_in_rule__SPDiagram__Group__45989);
            rule__SPDiagram__Group__5();

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
    // $ANTLR end "rule__SPDiagram__Group__4"


    // $ANTLR start "rule__SPDiagram__Group__4__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2896:1: rule__SPDiagram__Group__4__Impl : ( ( rule__SPDiagram__Group_4__0 )? ) ;
    public final void rule__SPDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2900:1: ( ( ( rule__SPDiagram__Group_4__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2901:1: ( ( rule__SPDiagram__Group_4__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2901:1: ( ( rule__SPDiagram__Group_4__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2902:1: ( rule__SPDiagram__Group_4__0 )?
            {
             before(grammarAccess.getSPDiagramAccess().getGroup_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2903:1: ( rule__SPDiagram__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2903:2: rule__SPDiagram__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SPDiagram__Group_4__0_in_rule__SPDiagram__Group__4__Impl6016);
                    rule__SPDiagram__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSPDiagramAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SPDiagram__Group__4__Impl"


    // $ANTLR start "rule__SPDiagram__Group__5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2913:1: rule__SPDiagram__Group__5 : rule__SPDiagram__Group__5__Impl rule__SPDiagram__Group__6 ;
    public final void rule__SPDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2917:1: ( rule__SPDiagram__Group__5__Impl rule__SPDiagram__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2918:2: rule__SPDiagram__Group__5__Impl rule__SPDiagram__Group__6
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__5__Impl_in_rule__SPDiagram__Group__56047);
            rule__SPDiagram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__6_in_rule__SPDiagram__Group__56050);
            rule__SPDiagram__Group__6();

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
    // $ANTLR end "rule__SPDiagram__Group__5"


    // $ANTLR start "rule__SPDiagram__Group__5__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2925:1: rule__SPDiagram__Group__5__Impl : ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) ) ;
    public final void rule__SPDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2929:1: ( ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2930:1: ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2930:1: ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2931:1: ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2931:1: ( ( rule__SPDiagram__MetamodelsAssignment_5 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2932:1: ( rule__SPDiagram__MetamodelsAssignment_5 )
            {
             before(grammarAccess.getSPDiagramAccess().getMetamodelsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2933:1: ( rule__SPDiagram__MetamodelsAssignment_5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2933:2: rule__SPDiagram__MetamodelsAssignment_5
            {
            pushFollow(FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6079);
            rule__SPDiagram__MetamodelsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSPDiagramAccess().getMetamodelsAssignment_5()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2936:1: ( ( rule__SPDiagram__MetamodelsAssignment_5 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2937:1: ( rule__SPDiagram__MetamodelsAssignment_5 )*
            {
             before(grammarAccess.getSPDiagramAccess().getMetamodelsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2938:1: ( rule__SPDiagram__MetamodelsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==69) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2938:2: rule__SPDiagram__MetamodelsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6091);
            	    rule__SPDiagram__MetamodelsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getSPDiagramAccess().getMetamodelsAssignment_5()); 

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
    // $ANTLR end "rule__SPDiagram__Group__5__Impl"


    // $ANTLR start "rule__SPDiagram__Group__6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2949:1: rule__SPDiagram__Group__6 : rule__SPDiagram__Group__6__Impl rule__SPDiagram__Group__7 ;
    public final void rule__SPDiagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2953:1: ( rule__SPDiagram__Group__6__Impl rule__SPDiagram__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2954:2: rule__SPDiagram__Group__6__Impl rule__SPDiagram__Group__7
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__6__Impl_in_rule__SPDiagram__Group__66124);
            rule__SPDiagram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__7_in_rule__SPDiagram__Group__66127);
            rule__SPDiagram__Group__7();

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
    // $ANTLR end "rule__SPDiagram__Group__6"


    // $ANTLR start "rule__SPDiagram__Group__6__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2961:1: rule__SPDiagram__Group__6__Impl : ( 'root' ) ;
    public final void rule__SPDiagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2965:1: ( ( 'root' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2966:1: ( 'root' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2966:1: ( 'root' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2967:1: 'root'
            {
             before(grammarAccess.getSPDiagramAccess().getRootKeyword_6()); 
            match(input,47,FOLLOW_47_in_rule__SPDiagram__Group__6__Impl6155); 
             after(grammarAccess.getSPDiagramAccess().getRootKeyword_6()); 

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
    // $ANTLR end "rule__SPDiagram__Group__6__Impl"


    // $ANTLR start "rule__SPDiagram__Group__7"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2980:1: rule__SPDiagram__Group__7 : rule__SPDiagram__Group__7__Impl rule__SPDiagram__Group__8 ;
    public final void rule__SPDiagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2984:1: ( rule__SPDiagram__Group__7__Impl rule__SPDiagram__Group__8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2985:2: rule__SPDiagram__Group__7__Impl rule__SPDiagram__Group__8
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__7__Impl_in_rule__SPDiagram__Group__76186);
            rule__SPDiagram__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__8_in_rule__SPDiagram__Group__76189);
            rule__SPDiagram__Group__8();

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
    // $ANTLR end "rule__SPDiagram__Group__7"


    // $ANTLR start "rule__SPDiagram__Group__7__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2992:1: rule__SPDiagram__Group__7__Impl : ( ( rule__SPDiagram__RootAssignment_7 ) ) ;
    public final void rule__SPDiagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2996:1: ( ( ( rule__SPDiagram__RootAssignment_7 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2997:1: ( ( rule__SPDiagram__RootAssignment_7 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2997:1: ( ( rule__SPDiagram__RootAssignment_7 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2998:1: ( rule__SPDiagram__RootAssignment_7 )
            {
             before(grammarAccess.getSPDiagramAccess().getRootAssignment_7()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2999:1: ( rule__SPDiagram__RootAssignment_7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2999:2: rule__SPDiagram__RootAssignment_7
            {
            pushFollow(FOLLOW_rule__SPDiagram__RootAssignment_7_in_rule__SPDiagram__Group__7__Impl6216);
            rule__SPDiagram__RootAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSPDiagramAccess().getRootAssignment_7()); 

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
    // $ANTLR end "rule__SPDiagram__Group__7__Impl"


    // $ANTLR start "rule__SPDiagram__Group__8"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3009:1: rule__SPDiagram__Group__8 : rule__SPDiagram__Group__8__Impl rule__SPDiagram__Group__9 ;
    public final void rule__SPDiagram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3013:1: ( rule__SPDiagram__Group__8__Impl rule__SPDiagram__Group__9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3014:2: rule__SPDiagram__Group__8__Impl rule__SPDiagram__Group__9
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__8__Impl_in_rule__SPDiagram__Group__86246);
            rule__SPDiagram__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__9_in_rule__SPDiagram__Group__86249);
            rule__SPDiagram__Group__9();

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
    // $ANTLR end "rule__SPDiagram__Group__8"


    // $ANTLR start "rule__SPDiagram__Group__8__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3021:1: rule__SPDiagram__Group__8__Impl : ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) ) ;
    public final void rule__SPDiagram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3025:1: ( ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3026:1: ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3026:1: ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3027:1: ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3027:1: ( ( rule__SPDiagram__ElementsAssignment_8 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3028:1: ( rule__SPDiagram__ElementsAssignment_8 )
            {
             before(grammarAccess.getSPDiagramAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3029:1: ( rule__SPDiagram__ElementsAssignment_8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3029:2: rule__SPDiagram__ElementsAssignment_8
            {
            pushFollow(FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl6278);
            rule__SPDiagram__ElementsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSPDiagramAccess().getElementsAssignment_8()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3032:1: ( ( rule__SPDiagram__ElementsAssignment_8 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3033:1: ( rule__SPDiagram__ElementsAssignment_8 )*
            {
             before(grammarAccess.getSPDiagramAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3034:1: ( rule__SPDiagram__ElementsAssignment_8 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=11 && LA26_0<=12)||LA26_0==55||LA26_0==60||(LA26_0>=70 && LA26_0<=71)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3034:2: rule__SPDiagram__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl6290);
            	    rule__SPDiagram__ElementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSPDiagramAccess().getElementsAssignment_8()); 

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
    // $ANTLR end "rule__SPDiagram__Group__8__Impl"


    // $ANTLR start "rule__SPDiagram__Group__9"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3045:1: rule__SPDiagram__Group__9 : rule__SPDiagram__Group__9__Impl ;
    public final void rule__SPDiagram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3049:1: ( rule__SPDiagram__Group__9__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3050:2: rule__SPDiagram__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__9__Impl_in_rule__SPDiagram__Group__96323);
            rule__SPDiagram__Group__9__Impl();

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
    // $ANTLR end "rule__SPDiagram__Group__9"


    // $ANTLR start "rule__SPDiagram__Group__9__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3056:1: rule__SPDiagram__Group__9__Impl : ( '}' ) ;
    public final void rule__SPDiagram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3060:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3061:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3061:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3062:1: '}'
            {
             before(grammarAccess.getSPDiagramAccess().getRightCurlyBracketKeyword_9()); 
            match(input,41,FOLLOW_41_in_rule__SPDiagram__Group__9__Impl6351); 
             after(grammarAccess.getSPDiagramAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__SPDiagram__Group__9__Impl"


    // $ANTLR start "rule__SPDiagram__Group_3__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3095:1: rule__SPDiagram__Group_3__0 : rule__SPDiagram__Group_3__0__Impl rule__SPDiagram__Group_3__1 ;
    public final void rule__SPDiagram__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3099:1: ( rule__SPDiagram__Group_3__0__Impl rule__SPDiagram__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3100:2: rule__SPDiagram__Group_3__0__Impl rule__SPDiagram__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_3__0__Impl_in_rule__SPDiagram__Group_3__06402);
            rule__SPDiagram__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group_3__1_in_rule__SPDiagram__Group_3__06405);
            rule__SPDiagram__Group_3__1();

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
    // $ANTLR end "rule__SPDiagram__Group_3__0"


    // $ANTLR start "rule__SPDiagram__Group_3__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3107:1: rule__SPDiagram__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__SPDiagram__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3111:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3112:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3112:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3113:1: 'label'
            {
             before(grammarAccess.getSPDiagramAccess().getLabelKeyword_3_0()); 
            match(input,48,FOLLOW_48_in_rule__SPDiagram__Group_3__0__Impl6433); 
             after(grammarAccess.getSPDiagramAccess().getLabelKeyword_3_0()); 

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
    // $ANTLR end "rule__SPDiagram__Group_3__0__Impl"


    // $ANTLR start "rule__SPDiagram__Group_3__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3126:1: rule__SPDiagram__Group_3__1 : rule__SPDiagram__Group_3__1__Impl ;
    public final void rule__SPDiagram__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3130:1: ( rule__SPDiagram__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3131:2: rule__SPDiagram__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_3__1__Impl_in_rule__SPDiagram__Group_3__16464);
            rule__SPDiagram__Group_3__1__Impl();

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
    // $ANTLR end "rule__SPDiagram__Group_3__1"


    // $ANTLR start "rule__SPDiagram__Group_3__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3137:1: rule__SPDiagram__Group_3__1__Impl : ( ( rule__SPDiagram__LabelAssignment_3_1 ) ) ;
    public final void rule__SPDiagram__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3141:1: ( ( ( rule__SPDiagram__LabelAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3142:1: ( ( rule__SPDiagram__LabelAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3142:1: ( ( rule__SPDiagram__LabelAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3143:1: ( rule__SPDiagram__LabelAssignment_3_1 )
            {
             before(grammarAccess.getSPDiagramAccess().getLabelAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3144:1: ( rule__SPDiagram__LabelAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3144:2: rule__SPDiagram__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPDiagram__LabelAssignment_3_1_in_rule__SPDiagram__Group_3__1__Impl6491);
            rule__SPDiagram__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSPDiagramAccess().getLabelAssignment_3_1()); 

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
    // $ANTLR end "rule__SPDiagram__Group_3__1__Impl"


    // $ANTLR start "rule__SPDiagram__Group_4__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3158:1: rule__SPDiagram__Group_4__0 : rule__SPDiagram__Group_4__0__Impl rule__SPDiagram__Group_4__1 ;
    public final void rule__SPDiagram__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3162:1: ( rule__SPDiagram__Group_4__0__Impl rule__SPDiagram__Group_4__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3163:2: rule__SPDiagram__Group_4__0__Impl rule__SPDiagram__Group_4__1
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_4__0__Impl_in_rule__SPDiagram__Group_4__06525);
            rule__SPDiagram__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group_4__1_in_rule__SPDiagram__Group_4__06528);
            rule__SPDiagram__Group_4__1();

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
    // $ANTLR end "rule__SPDiagram__Group_4__0"


    // $ANTLR start "rule__SPDiagram__Group_4__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3170:1: rule__SPDiagram__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__SPDiagram__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3174:1: ( ( 'title' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3175:1: ( 'title' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3175:1: ( 'title' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3176:1: 'title'
            {
             before(grammarAccess.getSPDiagramAccess().getTitleKeyword_4_0()); 
            match(input,49,FOLLOW_49_in_rule__SPDiagram__Group_4__0__Impl6556); 
             after(grammarAccess.getSPDiagramAccess().getTitleKeyword_4_0()); 

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
    // $ANTLR end "rule__SPDiagram__Group_4__0__Impl"


    // $ANTLR start "rule__SPDiagram__Group_4__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3189:1: rule__SPDiagram__Group_4__1 : rule__SPDiagram__Group_4__1__Impl ;
    public final void rule__SPDiagram__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3193:1: ( rule__SPDiagram__Group_4__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3194:2: rule__SPDiagram__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_4__1__Impl_in_rule__SPDiagram__Group_4__16587);
            rule__SPDiagram__Group_4__1__Impl();

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
    // $ANTLR end "rule__SPDiagram__Group_4__1"


    // $ANTLR start "rule__SPDiagram__Group_4__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3200:1: rule__SPDiagram__Group_4__1__Impl : ( ( rule__SPDiagram__TitleAssignment_4_1 ) ) ;
    public final void rule__SPDiagram__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3204:1: ( ( ( rule__SPDiagram__TitleAssignment_4_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3205:1: ( ( rule__SPDiagram__TitleAssignment_4_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3205:1: ( ( rule__SPDiagram__TitleAssignment_4_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3206:1: ( rule__SPDiagram__TitleAssignment_4_1 )
            {
             before(grammarAccess.getSPDiagramAccess().getTitleAssignment_4_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3207:1: ( rule__SPDiagram__TitleAssignment_4_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3207:2: rule__SPDiagram__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SPDiagram__TitleAssignment_4_1_in_rule__SPDiagram__Group_4__1__Impl6614);
            rule__SPDiagram__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSPDiagramAccess().getTitleAssignment_4_1()); 

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
    // $ANTLR end "rule__SPDiagram__Group_4__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3221:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3225:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3226:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__06648);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__1_in_rule__Container__Group__06651);
            rule__Container__Group__1();

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
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3233:1: rule__Container__Group__0__Impl : ( ( rule__Container__CreatableAssignment_0 )? ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3237:1: ( ( ( rule__Container__CreatableAssignment_0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3238:1: ( ( rule__Container__CreatableAssignment_0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3238:1: ( ( rule__Container__CreatableAssignment_0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3239:1: ( rule__Container__CreatableAssignment_0 )?
            {
             before(grammarAccess.getContainerAccess().getCreatableAssignment_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3240:1: ( rule__Container__CreatableAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==70) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3240:2: rule__Container__CreatableAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Container__CreatableAssignment_0_in_rule__Container__Group__0__Impl6678);
                    rule__Container__CreatableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getCreatableAssignment_0()); 

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
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3250:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3254:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3255:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__16709);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__2_in_rule__Container__Group__16712);
            rule__Container__Group__2();

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
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3262:1: rule__Container__Group__1__Impl : ( ( rule__Container__RecursiveAssignment_1 )? ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3266:1: ( ( ( rule__Container__RecursiveAssignment_1 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3267:1: ( ( rule__Container__RecursiveAssignment_1 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3267:1: ( ( rule__Container__RecursiveAssignment_1 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3268:1: ( rule__Container__RecursiveAssignment_1 )?
            {
             before(grammarAccess.getContainerAccess().getRecursiveAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3269:1: ( rule__Container__RecursiveAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==71) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3269:2: rule__Container__RecursiveAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Container__RecursiveAssignment_1_in_rule__Container__Group__1__Impl6739);
                    rule__Container__RecursiveAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getRecursiveAssignment_1()); 

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
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3279:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3283:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3284:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__26770);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__3_in_rule__Container__Group__26773);
            rule__Container__Group__3();

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
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3291:1: rule__Container__Group__2__Impl : ( ( rule__Container__ContainerTypeAssignment_2 )? ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3295:1: ( ( ( rule__Container__ContainerTypeAssignment_2 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3296:1: ( ( rule__Container__ContainerTypeAssignment_2 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3296:1: ( ( rule__Container__ContainerTypeAssignment_2 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3297:1: ( rule__Container__ContainerTypeAssignment_2 )?
            {
             before(grammarAccess.getContainerAccess().getContainerTypeAssignment_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3298:1: ( rule__Container__ContainerTypeAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=11 && LA29_0<=12)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3298:2: rule__Container__ContainerTypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Container__ContainerTypeAssignment_2_in_rule__Container__Group__2__Impl6800);
                    rule__Container__ContainerTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getContainerTypeAssignment_2()); 

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
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3308:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3312:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3313:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__36831);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__4_in_rule__Container__Group__36834);
            rule__Container__Group__4();

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
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3320:1: rule__Container__Group__3__Impl : ( 'container' ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3324:1: ( ( 'container' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3325:1: ( 'container' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3325:1: ( 'container' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3326:1: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_3()); 
            match(input,55,FOLLOW_55_in_rule__Container__Group__3__Impl6862); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_3()); 

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
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3339:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3343:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3344:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_rule__Container__Group__4__Impl_in_rule__Container__Group__46893);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__5_in_rule__Container__Group__46896);
            rule__Container__Group__5();

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
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3351:1: rule__Container__Group__4__Impl : ( ( rule__Container__NameAssignment_4 ) ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3355:1: ( ( ( rule__Container__NameAssignment_4 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3356:1: ( ( rule__Container__NameAssignment_4 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3356:1: ( ( rule__Container__NameAssignment_4 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3357:1: ( rule__Container__NameAssignment_4 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3358:1: ( rule__Container__NameAssignment_4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3358:2: rule__Container__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Container__NameAssignment_4_in_rule__Container__Group__4__Impl6923);
            rule__Container__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3368:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3372:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3373:2: rule__Container__Group__5__Impl rule__Container__Group__6
            {
            pushFollow(FOLLOW_rule__Container__Group__5__Impl_in_rule__Container__Group__56953);
            rule__Container__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__6_in_rule__Container__Group__56956);
            rule__Container__Group__6();

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
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3380:1: rule__Container__Group__5__Impl : ( 'for' ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3384:1: ( ( 'for' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3385:1: ( 'for' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3385:1: ( 'for' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3386:1: 'for'
            {
             before(grammarAccess.getContainerAccess().getForKeyword_5()); 
            match(input,56,FOLLOW_56_in_rule__Container__Group__5__Impl6984); 
             after(grammarAccess.getContainerAccess().getForKeyword_5()); 

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
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group__6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3399:1: rule__Container__Group__6 : rule__Container__Group__6__Impl rule__Container__Group__7 ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3403:1: ( rule__Container__Group__6__Impl rule__Container__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3404:2: rule__Container__Group__6__Impl rule__Container__Group__7
            {
            pushFollow(FOLLOW_rule__Container__Group__6__Impl_in_rule__Container__Group__67015);
            rule__Container__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__7_in_rule__Container__Group__67018);
            rule__Container__Group__7();

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
    // $ANTLR end "rule__Container__Group__6"


    // $ANTLR start "rule__Container__Group__6__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3411:1: rule__Container__Group__6__Impl : ( ( rule__Container__EClassAssignment_6 ) ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3415:1: ( ( ( rule__Container__EClassAssignment_6 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3416:1: ( ( rule__Container__EClassAssignment_6 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3416:1: ( ( rule__Container__EClassAssignment_6 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3417:1: ( rule__Container__EClassAssignment_6 )
            {
             before(grammarAccess.getContainerAccess().getEClassAssignment_6()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3418:1: ( rule__Container__EClassAssignment_6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3418:2: rule__Container__EClassAssignment_6
            {
            pushFollow(FOLLOW_rule__Container__EClassAssignment_6_in_rule__Container__Group__6__Impl7045);
            rule__Container__EClassAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getEClassAssignment_6()); 

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
    // $ANTLR end "rule__Container__Group__6__Impl"


    // $ANTLR start "rule__Container__Group__7"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3428:1: rule__Container__Group__7 : rule__Container__Group__7__Impl rule__Container__Group__8 ;
    public final void rule__Container__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3432:1: ( rule__Container__Group__7__Impl rule__Container__Group__8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3433:2: rule__Container__Group__7__Impl rule__Container__Group__8
            {
            pushFollow(FOLLOW_rule__Container__Group__7__Impl_in_rule__Container__Group__77075);
            rule__Container__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__8_in_rule__Container__Group__77078);
            rule__Container__Group__8();

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
    // $ANTLR end "rule__Container__Group__7"


    // $ANTLR start "rule__Container__Group__7__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3440:1: rule__Container__Group__7__Impl : ( 'accessibleThrough' ) ;
    public final void rule__Container__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3444:1: ( ( 'accessibleThrough' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3445:1: ( 'accessibleThrough' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3445:1: ( 'accessibleThrough' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3446:1: 'accessibleThrough'
            {
             before(grammarAccess.getContainerAccess().getAccessibleThroughKeyword_7()); 
            match(input,51,FOLLOW_51_in_rule__Container__Group__7__Impl7106); 
             after(grammarAccess.getContainerAccess().getAccessibleThroughKeyword_7()); 

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
    // $ANTLR end "rule__Container__Group__7__Impl"


    // $ANTLR start "rule__Container__Group__8"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3459:1: rule__Container__Group__8 : rule__Container__Group__8__Impl rule__Container__Group__9 ;
    public final void rule__Container__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3463:1: ( rule__Container__Group__8__Impl rule__Container__Group__9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3464:2: rule__Container__Group__8__Impl rule__Container__Group__9
            {
            pushFollow(FOLLOW_rule__Container__Group__8__Impl_in_rule__Container__Group__87137);
            rule__Container__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__9_in_rule__Container__Group__87140);
            rule__Container__Group__9();

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
    // $ANTLR end "rule__Container__Group__8"


    // $ANTLR start "rule__Container__Group__8__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3471:1: rule__Container__Group__8__Impl : ( ( rule__Container__ExpressionAssignment_8 ) ) ;
    public final void rule__Container__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3475:1: ( ( ( rule__Container__ExpressionAssignment_8 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3476:1: ( ( rule__Container__ExpressionAssignment_8 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3476:1: ( ( rule__Container__ExpressionAssignment_8 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3477:1: ( rule__Container__ExpressionAssignment_8 )
            {
             before(grammarAccess.getContainerAccess().getExpressionAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3478:1: ( rule__Container__ExpressionAssignment_8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3478:2: rule__Container__ExpressionAssignment_8
            {
            pushFollow(FOLLOW_rule__Container__ExpressionAssignment_8_in_rule__Container__Group__8__Impl7167);
            rule__Container__ExpressionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getExpressionAssignment_8()); 

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
    // $ANTLR end "rule__Container__Group__8__Impl"


    // $ANTLR start "rule__Container__Group__9"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3488:1: rule__Container__Group__9 : rule__Container__Group__9__Impl rule__Container__Group__10 ;
    public final void rule__Container__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3492:1: ( rule__Container__Group__9__Impl rule__Container__Group__10 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3493:2: rule__Container__Group__9__Impl rule__Container__Group__10
            {
            pushFollow(FOLLOW_rule__Container__Group__9__Impl_in_rule__Container__Group__97197);
            rule__Container__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__10_in_rule__Container__Group__97200);
            rule__Container__Group__10();

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
    // $ANTLR end "rule__Container__Group__9"


    // $ANTLR start "rule__Container__Group__9__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3500:1: rule__Container__Group__9__Impl : ( ( rule__Container__StyleAssignment_9 )? ) ;
    public final void rule__Container__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3504:1: ( ( ( rule__Container__StyleAssignment_9 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3505:1: ( ( rule__Container__StyleAssignment_9 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3505:1: ( ( rule__Container__StyleAssignment_9 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3506:1: ( rule__Container__StyleAssignment_9 )?
            {
             before(grammarAccess.getContainerAccess().getStyleAssignment_9()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3507:1: ( rule__Container__StyleAssignment_9 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3507:2: rule__Container__StyleAssignment_9
                    {
                    pushFollow(FOLLOW_rule__Container__StyleAssignment_9_in_rule__Container__Group__9__Impl7227);
                    rule__Container__StyleAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getStyleAssignment_9()); 

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
    // $ANTLR end "rule__Container__Group__9__Impl"


    // $ANTLR start "rule__Container__Group__10"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3517:1: rule__Container__Group__10 : rule__Container__Group__10__Impl ;
    public final void rule__Container__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3521:1: ( rule__Container__Group__10__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3522:2: rule__Container__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Container__Group__10__Impl_in_rule__Container__Group__107258);
            rule__Container__Group__10__Impl();

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
    // $ANTLR end "rule__Container__Group__10"


    // $ANTLR start "rule__Container__Group__10__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3528:1: rule__Container__Group__10__Impl : ( ( rule__Container__Group_10__0 )? ) ;
    public final void rule__Container__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3532:1: ( ( ( rule__Container__Group_10__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3533:1: ( ( rule__Container__Group_10__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3533:1: ( ( rule__Container__Group_10__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3534:1: ( rule__Container__Group_10__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_10()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3535:1: ( rule__Container__Group_10__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3535:2: rule__Container__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Container__Group_10__0_in_rule__Container__Group__10__Impl7285);
                    rule__Container__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Container__Group__10__Impl"


    // $ANTLR start "rule__Container__Group_10__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3567:1: rule__Container__Group_10__0 : rule__Container__Group_10__0__Impl rule__Container__Group_10__1 ;
    public final void rule__Container__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3571:1: ( rule__Container__Group_10__0__Impl rule__Container__Group_10__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3572:2: rule__Container__Group_10__0__Impl rule__Container__Group_10__1
            {
            pushFollow(FOLLOW_rule__Container__Group_10__0__Impl_in_rule__Container__Group_10__07338);
            rule__Container__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group_10__1_in_rule__Container__Group_10__07341);
            rule__Container__Group_10__1();

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
    // $ANTLR end "rule__Container__Group_10__0"


    // $ANTLR start "rule__Container__Group_10__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3579:1: rule__Container__Group_10__0__Impl : ( '{' ) ;
    public final void rule__Container__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3583:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3584:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3584:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3585:1: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10_0()); 
            match(input,40,FOLLOW_40_in_rule__Container__Group_10__0__Impl7369); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10_0()); 

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
    // $ANTLR end "rule__Container__Group_10__0__Impl"


    // $ANTLR start "rule__Container__Group_10__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3598:1: rule__Container__Group_10__1 : rule__Container__Group_10__1__Impl rule__Container__Group_10__2 ;
    public final void rule__Container__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3602:1: ( rule__Container__Group_10__1__Impl rule__Container__Group_10__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3603:2: rule__Container__Group_10__1__Impl rule__Container__Group_10__2
            {
            pushFollow(FOLLOW_rule__Container__Group_10__1__Impl_in_rule__Container__Group_10__17400);
            rule__Container__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group_10__2_in_rule__Container__Group_10__17403);
            rule__Container__Group_10__2();

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
    // $ANTLR end "rule__Container__Group_10__1"


    // $ANTLR start "rule__Container__Group_10__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3610:1: rule__Container__Group_10__1__Impl : ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) ) ;
    public final void rule__Container__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3614:1: ( ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3615:1: ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3615:1: ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3616:1: ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3616:1: ( ( rule__Container__ElementsAssignment_10_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3617:1: ( rule__Container__ElementsAssignment_10_1 )
            {
             before(grammarAccess.getContainerAccess().getElementsAssignment_10_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3618:1: ( rule__Container__ElementsAssignment_10_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3618:2: rule__Container__ElementsAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl7432);
            rule__Container__ElementsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getElementsAssignment_10_1()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3621:1: ( ( rule__Container__ElementsAssignment_10_1 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3622:1: ( rule__Container__ElementsAssignment_10_1 )*
            {
             before(grammarAccess.getContainerAccess().getElementsAssignment_10_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3623:1: ( rule__Container__ElementsAssignment_10_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=11 && LA32_0<=12)||LA32_0==55||LA32_0==60||(LA32_0>=70 && LA32_0<=71)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3623:2: rule__Container__ElementsAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl7444);
            	    rule__Container__ElementsAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getElementsAssignment_10_1()); 

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
    // $ANTLR end "rule__Container__Group_10__1__Impl"


    // $ANTLR start "rule__Container__Group_10__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3634:1: rule__Container__Group_10__2 : rule__Container__Group_10__2__Impl ;
    public final void rule__Container__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3638:1: ( rule__Container__Group_10__2__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3639:2: rule__Container__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Container__Group_10__2__Impl_in_rule__Container__Group_10__27477);
            rule__Container__Group_10__2__Impl();

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
    // $ANTLR end "rule__Container__Group_10__2"


    // $ANTLR start "rule__Container__Group_10__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3645:1: rule__Container__Group_10__2__Impl : ( '}' ) ;
    public final void rule__Container__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3649:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3650:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3650:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3651:1: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_10_2()); 
            match(input,41,FOLLOW_41_in_rule__Container__Group_10__2__Impl7505); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_10_2()); 

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
    // $ANTLR end "rule__Container__Group_10__2__Impl"


    // $ANTLR start "rule__ContainerStyleDefinition__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3670:1: rule__ContainerStyleDefinition__Group__0 : rule__ContainerStyleDefinition__Group__0__Impl rule__ContainerStyleDefinition__Group__1 ;
    public final void rule__ContainerStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3674:1: ( rule__ContainerStyleDefinition__Group__0__Impl rule__ContainerStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3675:2: rule__ContainerStyleDefinition__Group__0__Impl rule__ContainerStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__0__Impl_in_rule__ContainerStyleDefinition__Group__07542);
            rule__ContainerStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__1_in_rule__ContainerStyleDefinition__Group__07545);
            rule__ContainerStyleDefinition__Group__1();

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group__0"


    // $ANTLR start "rule__ContainerStyleDefinition__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3682:1: rule__ContainerStyleDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__ContainerStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3686:1: ( ( '[' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3687:1: ( '[' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3687:1: ( '[' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3688:1: '['
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__ContainerStyleDefinition__Group__0__Impl7573); 
             after(grammarAccess.getContainerStyleDefinitionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group__0__Impl"


    // $ANTLR start "rule__ContainerStyleDefinition__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3701:1: rule__ContainerStyleDefinition__Group__1 : rule__ContainerStyleDefinition__Group__1__Impl rule__ContainerStyleDefinition__Group__2 ;
    public final void rule__ContainerStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3705:1: ( rule__ContainerStyleDefinition__Group__1__Impl rule__ContainerStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3706:2: rule__ContainerStyleDefinition__Group__1__Impl rule__ContainerStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__1__Impl_in_rule__ContainerStyleDefinition__Group__17604);
            rule__ContainerStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__2_in_rule__ContainerStyleDefinition__Group__17607);
            rule__ContainerStyleDefinition__Group__2();

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group__1"


    // $ANTLR start "rule__ContainerStyleDefinition__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3713:1: rule__ContainerStyleDefinition__Group__1__Impl : ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) ) ;
    public final void rule__ContainerStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3717:1: ( ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3718:1: ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3718:1: ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3719:1: ( rule__ContainerStyleDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3720:1: ( rule__ContainerStyleDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3720:2: rule__ContainerStyleDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__ColorAssignment_1_in_rule__ContainerStyleDefinition__Group__1__Impl7634);
            rule__ContainerStyleDefinition__ColorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerStyleDefinitionAccess().getColorAssignment_1()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group__1__Impl"


    // $ANTLR start "rule__ContainerStyleDefinition__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3730:1: rule__ContainerStyleDefinition__Group__2 : rule__ContainerStyleDefinition__Group__2__Impl rule__ContainerStyleDefinition__Group__3 ;
    public final void rule__ContainerStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3734:1: ( rule__ContainerStyleDefinition__Group__2__Impl rule__ContainerStyleDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3735:2: rule__ContainerStyleDefinition__Group__2__Impl rule__ContainerStyleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__2__Impl_in_rule__ContainerStyleDefinition__Group__27664);
            rule__ContainerStyleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__3_in_rule__ContainerStyleDefinition__Group__27667);
            rule__ContainerStyleDefinition__Group__3();

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group__2"


    // $ANTLR start "rule__ContainerStyleDefinition__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3742:1: rule__ContainerStyleDefinition__Group__2__Impl : ( ( rule__ContainerStyleDefinition__Group_2__0 )? ) ;
    public final void rule__ContainerStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3746:1: ( ( ( rule__ContainerStyleDefinition__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3747:1: ( ( rule__ContainerStyleDefinition__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3747:1: ( ( rule__ContainerStyleDefinition__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3748:1: ( rule__ContainerStyleDefinition__Group_2__0 )?
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3749:1: ( rule__ContainerStyleDefinition__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==59) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==48) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3749:2: rule__ContainerStyleDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__0_in_rule__ContainerStyleDefinition__Group__2__Impl7694);
                    rule__ContainerStyleDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerStyleDefinitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group__2__Impl"


    // $ANTLR start "rule__ContainerStyleDefinition__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3759:1: rule__ContainerStyleDefinition__Group__3 : rule__ContainerStyleDefinition__Group__3__Impl rule__ContainerStyleDefinition__Group__4 ;
    public final void rule__ContainerStyleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3763:1: ( rule__ContainerStyleDefinition__Group__3__Impl rule__ContainerStyleDefinition__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3764:2: rule__ContainerStyleDefinition__Group__3__Impl rule__ContainerStyleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__3__Impl_in_rule__ContainerStyleDefinition__Group__37725);
            rule__ContainerStyleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__4_in_rule__ContainerStyleDefinition__Group__37728);
            rule__ContainerStyleDefinition__Group__4();

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group__3"


    // $ANTLR start "rule__ContainerStyleDefinition__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3771:1: rule__ContainerStyleDefinition__Group__3__Impl : ( ( rule__ContainerStyleDefinition__Group_3__0 )? ) ;
    public final void rule__ContainerStyleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3775:1: ( ( ( rule__ContainerStyleDefinition__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3776:1: ( ( rule__ContainerStyleDefinition__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3776:1: ( ( rule__ContainerStyleDefinition__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3777:1: ( rule__ContainerStyleDefinition__Group_3__0 )?
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3778:1: ( rule__ContainerStyleDefinition__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3778:2: rule__ContainerStyleDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__0_in_rule__ContainerStyleDefinition__Group__3__Impl7755);
                    rule__ContainerStyleDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerStyleDefinitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group__3__Impl"


    // $ANTLR start "rule__ContainerStyleDefinition__Group__4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3788:1: rule__ContainerStyleDefinition__Group__4 : rule__ContainerStyleDefinition__Group__4__Impl ;
    public final void rule__ContainerStyleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3792:1: ( rule__ContainerStyleDefinition__Group__4__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3793:2: rule__ContainerStyleDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__4__Impl_in_rule__ContainerStyleDefinition__Group__47786);
            rule__ContainerStyleDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group__4"


    // $ANTLR start "rule__ContainerStyleDefinition__Group__4__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3799:1: rule__ContainerStyleDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__ContainerStyleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3803:1: ( ( ']' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3804:1: ( ']' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3804:1: ( ']' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3805:1: ']'
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getRightSquareBracketKeyword_4()); 
            match(input,58,FOLLOW_58_in_rule__ContainerStyleDefinition__Group__4__Impl7814); 
             after(grammarAccess.getContainerStyleDefinitionAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group__4__Impl"


    // $ANTLR start "rule__ContainerStyleDefinition__Group_2__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3828:1: rule__ContainerStyleDefinition__Group_2__0 : rule__ContainerStyleDefinition__Group_2__0__Impl rule__ContainerStyleDefinition__Group_2__1 ;
    public final void rule__ContainerStyleDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3832:1: ( rule__ContainerStyleDefinition__Group_2__0__Impl rule__ContainerStyleDefinition__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3833:2: rule__ContainerStyleDefinition__Group_2__0__Impl rule__ContainerStyleDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__0__Impl_in_rule__ContainerStyleDefinition__Group_2__07855);
            rule__ContainerStyleDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__1_in_rule__ContainerStyleDefinition__Group_2__07858);
            rule__ContainerStyleDefinition__Group_2__1();

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group_2__0"


    // $ANTLR start "rule__ContainerStyleDefinition__Group_2__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3840:1: rule__ContainerStyleDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ContainerStyleDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3844:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3845:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3845:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3846:1: ','
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,59,FOLLOW_59_in_rule__ContainerStyleDefinition__Group_2__0__Impl7886); 
             after(grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__ContainerStyleDefinition__Group_2__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3859:1: rule__ContainerStyleDefinition__Group_2__1 : rule__ContainerStyleDefinition__Group_2__1__Impl ;
    public final void rule__ContainerStyleDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3863:1: ( rule__ContainerStyleDefinition__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3864:2: rule__ContainerStyleDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__1__Impl_in_rule__ContainerStyleDefinition__Group_2__17917);
            rule__ContainerStyleDefinition__Group_2__1__Impl();

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group_2__1"


    // $ANTLR start "rule__ContainerStyleDefinition__Group_2__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3870:1: rule__ContainerStyleDefinition__Group_2__1__Impl : ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) ) ;
    public final void rule__ContainerStyleDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3874:1: ( ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3875:1: ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3875:1: ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3876:1: ( rule__ContainerStyleDefinition__LabelAssignment_2_1 )
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getLabelAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3877:1: ( rule__ContainerStyleDefinition__LabelAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3877:2: rule__ContainerStyleDefinition__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__LabelAssignment_2_1_in_rule__ContainerStyleDefinition__Group_2__1__Impl7944);
            rule__ContainerStyleDefinition__LabelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerStyleDefinitionAccess().getLabelAssignment_2_1()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__ContainerStyleDefinition__Group_3__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3891:1: rule__ContainerStyleDefinition__Group_3__0 : rule__ContainerStyleDefinition__Group_3__0__Impl rule__ContainerStyleDefinition__Group_3__1 ;
    public final void rule__ContainerStyleDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3895:1: ( rule__ContainerStyleDefinition__Group_3__0__Impl rule__ContainerStyleDefinition__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3896:2: rule__ContainerStyleDefinition__Group_3__0__Impl rule__ContainerStyleDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__0__Impl_in_rule__ContainerStyleDefinition__Group_3__07978);
            rule__ContainerStyleDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__1_in_rule__ContainerStyleDefinition__Group_3__07981);
            rule__ContainerStyleDefinition__Group_3__1();

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group_3__0"


    // $ANTLR start "rule__ContainerStyleDefinition__Group_3__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3903:1: rule__ContainerStyleDefinition__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ContainerStyleDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3907:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3908:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3908:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3909:1: ','
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_3_0()); 
            match(input,59,FOLLOW_59_in_rule__ContainerStyleDefinition__Group_3__0__Impl8009); 
             after(grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__ContainerStyleDefinition__Group_3__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3922:1: rule__ContainerStyleDefinition__Group_3__1 : rule__ContainerStyleDefinition__Group_3__1__Impl ;
    public final void rule__ContainerStyleDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3926:1: ( rule__ContainerStyleDefinition__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3927:2: rule__ContainerStyleDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__1__Impl_in_rule__ContainerStyleDefinition__Group_3__18040);
            rule__ContainerStyleDefinition__Group_3__1__Impl();

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group_3__1"


    // $ANTLR start "rule__ContainerStyleDefinition__Group_3__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3933:1: rule__ContainerStyleDefinition__Group_3__1__Impl : ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) ) ;
    public final void rule__ContainerStyleDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3937:1: ( ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3938:1: ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3938:1: ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3939:1: ( rule__ContainerStyleDefinition__BorderAssignment_3_1 )
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getBorderAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3940:1: ( rule__ContainerStyleDefinition__BorderAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3940:2: rule__ContainerStyleDefinition__BorderAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__BorderAssignment_3_1_in_rule__ContainerStyleDefinition__Group_3__1__Impl8067);
            rule__ContainerStyleDefinition__BorderAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerStyleDefinitionAccess().getBorderAssignment_3_1()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3954:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3958:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3959:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__08101);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__08104);
            rule__Node__Group__1();

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
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3966:1: rule__Node__Group__0__Impl : ( ( rule__Node__CreatableAssignment_0 )? ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3970:1: ( ( ( rule__Node__CreatableAssignment_0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3971:1: ( ( rule__Node__CreatableAssignment_0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3971:1: ( ( rule__Node__CreatableAssignment_0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3972:1: ( rule__Node__CreatableAssignment_0 )?
            {
             before(grammarAccess.getNodeAccess().getCreatableAssignment_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3973:1: ( rule__Node__CreatableAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3973:2: rule__Node__CreatableAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Node__CreatableAssignment_0_in_rule__Node__Group__0__Impl8131);
                    rule__Node__CreatableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getCreatableAssignment_0()); 

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
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3983:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3987:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3988:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__18162);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__18165);
            rule__Node__Group__2();

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
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3995:1: rule__Node__Group__1__Impl : ( 'node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3999:1: ( ( 'node' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4000:1: ( 'node' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4000:1: ( 'node' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4001:1: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__Node__Group__1__Impl8193); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_1()); 

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
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4014:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4018:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4019:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__28224);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__28227);
            rule__Node__Group__3();

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
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4026:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4030:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4031:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4031:1: ( ( rule__Node__NameAssignment_2 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4032:1: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4033:1: ( rule__Node__NameAssignment_2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4033:2: rule__Node__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl8254);
            rule__Node__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4043:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4047:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4048:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__38284);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__4_in_rule__Node__Group__38287);
            rule__Node__Group__4();

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
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4055:1: rule__Node__Group__3__Impl : ( 'for' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4059:1: ( ( 'for' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4060:1: ( 'for' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4060:1: ( 'for' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4061:1: 'for'
            {
             before(grammarAccess.getNodeAccess().getForKeyword_3()); 
            match(input,56,FOLLOW_56_in_rule__Node__Group__3__Impl8315); 
             after(grammarAccess.getNodeAccess().getForKeyword_3()); 

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
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4074:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4078:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4079:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__48346);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__5_in_rule__Node__Group__48349);
            rule__Node__Group__5();

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
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4086:1: rule__Node__Group__4__Impl : ( ( rule__Node__EClassAssignment_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4090:1: ( ( ( rule__Node__EClassAssignment_4 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4091:1: ( ( rule__Node__EClassAssignment_4 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4091:1: ( ( rule__Node__EClassAssignment_4 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4092:1: ( rule__Node__EClassAssignment_4 )
            {
             before(grammarAccess.getNodeAccess().getEClassAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4093:1: ( rule__Node__EClassAssignment_4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4093:2: rule__Node__EClassAssignment_4
            {
            pushFollow(FOLLOW_rule__Node__EClassAssignment_4_in_rule__Node__Group__4__Impl8376);
            rule__Node__EClassAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getEClassAssignment_4()); 

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
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4103:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4107:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4108:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__58406);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__6_in_rule__Node__Group__58409);
            rule__Node__Group__6();

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
    // $ANTLR end "rule__Node__Group__5"


    // $ANTLR start "rule__Node__Group__5__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4115:1: rule__Node__Group__5__Impl : ( 'accessibleThrough' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4119:1: ( ( 'accessibleThrough' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4120:1: ( 'accessibleThrough' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4120:1: ( 'accessibleThrough' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4121:1: 'accessibleThrough'
            {
             before(grammarAccess.getNodeAccess().getAccessibleThroughKeyword_5()); 
            match(input,51,FOLLOW_51_in_rule__Node__Group__5__Impl8437); 
             after(grammarAccess.getNodeAccess().getAccessibleThroughKeyword_5()); 

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
    // $ANTLR end "rule__Node__Group__5__Impl"


    // $ANTLR start "rule__Node__Group__6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4134:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4138:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4139:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__68468);
            rule__Node__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__7_in_rule__Node__Group__68471);
            rule__Node__Group__7();

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
    // $ANTLR end "rule__Node__Group__6"


    // $ANTLR start "rule__Node__Group__6__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4146:1: rule__Node__Group__6__Impl : ( ( rule__Node__ExpressionAssignment_6 ) ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4150:1: ( ( ( rule__Node__ExpressionAssignment_6 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4151:1: ( ( rule__Node__ExpressionAssignment_6 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4151:1: ( ( rule__Node__ExpressionAssignment_6 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4152:1: ( rule__Node__ExpressionAssignment_6 )
            {
             before(grammarAccess.getNodeAccess().getExpressionAssignment_6()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4153:1: ( rule__Node__ExpressionAssignment_6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4153:2: rule__Node__ExpressionAssignment_6
            {
            pushFollow(FOLLOW_rule__Node__ExpressionAssignment_6_in_rule__Node__Group__6__Impl8498);
            rule__Node__ExpressionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getExpressionAssignment_6()); 

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
    // $ANTLR end "rule__Node__Group__6__Impl"


    // $ANTLR start "rule__Node__Group__7"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4163:1: rule__Node__Group__7 : rule__Node__Group__7__Impl ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4167:1: ( rule__Node__Group__7__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4168:2: rule__Node__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__78528);
            rule__Node__Group__7__Impl();

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
    // $ANTLR end "rule__Node__Group__7"


    // $ANTLR start "rule__Node__Group__7__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4174:1: rule__Node__Group__7__Impl : ( ( rule__Node__StyleAssignment_7 )? ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4178:1: ( ( ( rule__Node__StyleAssignment_7 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4179:1: ( ( rule__Node__StyleAssignment_7 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4179:1: ( ( rule__Node__StyleAssignment_7 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4180:1: ( rule__Node__StyleAssignment_7 )?
            {
             before(grammarAccess.getNodeAccess().getStyleAssignment_7()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4181:1: ( rule__Node__StyleAssignment_7 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==57) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4181:2: rule__Node__StyleAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Node__StyleAssignment_7_in_rule__Node__Group__7__Impl8555);
                    rule__Node__StyleAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getStyleAssignment_7()); 

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
    // $ANTLR end "rule__Node__Group__7__Impl"


    // $ANTLR start "rule__NodeStyleDefinition__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4207:1: rule__NodeStyleDefinition__Group__0 : rule__NodeStyleDefinition__Group__0__Impl rule__NodeStyleDefinition__Group__1 ;
    public final void rule__NodeStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4211:1: ( rule__NodeStyleDefinition__Group__0__Impl rule__NodeStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4212:2: rule__NodeStyleDefinition__Group__0__Impl rule__NodeStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__0__Impl_in_rule__NodeStyleDefinition__Group__08602);
            rule__NodeStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__1_in_rule__NodeStyleDefinition__Group__08605);
            rule__NodeStyleDefinition__Group__1();

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
    // $ANTLR end "rule__NodeStyleDefinition__Group__0"


    // $ANTLR start "rule__NodeStyleDefinition__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4219:1: rule__NodeStyleDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__NodeStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4223:1: ( ( '[' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4224:1: ( '[' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4224:1: ( '[' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4225:1: '['
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__NodeStyleDefinition__Group__0__Impl8633); 
             after(grammarAccess.getNodeStyleDefinitionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__Group__0__Impl"


    // $ANTLR start "rule__NodeStyleDefinition__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4238:1: rule__NodeStyleDefinition__Group__1 : rule__NodeStyleDefinition__Group__1__Impl rule__NodeStyleDefinition__Group__2 ;
    public final void rule__NodeStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4242:1: ( rule__NodeStyleDefinition__Group__1__Impl rule__NodeStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4243:2: rule__NodeStyleDefinition__Group__1__Impl rule__NodeStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__1__Impl_in_rule__NodeStyleDefinition__Group__18664);
            rule__NodeStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__2_in_rule__NodeStyleDefinition__Group__18667);
            rule__NodeStyleDefinition__Group__2();

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
    // $ANTLR end "rule__NodeStyleDefinition__Group__1"


    // $ANTLR start "rule__NodeStyleDefinition__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4250:1: rule__NodeStyleDefinition__Group__1__Impl : ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) ) ;
    public final void rule__NodeStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4254:1: ( ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4255:1: ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4255:1: ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4256:1: ( rule__NodeStyleDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4257:1: ( rule__NodeStyleDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4257:2: rule__NodeStyleDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__ColorAssignment_1_in_rule__NodeStyleDefinition__Group__1__Impl8694);
            rule__NodeStyleDefinition__ColorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeStyleDefinitionAccess().getColorAssignment_1()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__Group__1__Impl"


    // $ANTLR start "rule__NodeStyleDefinition__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4267:1: rule__NodeStyleDefinition__Group__2 : rule__NodeStyleDefinition__Group__2__Impl rule__NodeStyleDefinition__Group__3 ;
    public final void rule__NodeStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4271:1: ( rule__NodeStyleDefinition__Group__2__Impl rule__NodeStyleDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4272:2: rule__NodeStyleDefinition__Group__2__Impl rule__NodeStyleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__2__Impl_in_rule__NodeStyleDefinition__Group__28724);
            rule__NodeStyleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__3_in_rule__NodeStyleDefinition__Group__28727);
            rule__NodeStyleDefinition__Group__3();

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
    // $ANTLR end "rule__NodeStyleDefinition__Group__2"


    // $ANTLR start "rule__NodeStyleDefinition__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4279:1: rule__NodeStyleDefinition__Group__2__Impl : ( ( rule__NodeStyleDefinition__Group_2__0 )? ) ;
    public final void rule__NodeStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4283:1: ( ( ( rule__NodeStyleDefinition__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4284:1: ( ( rule__NodeStyleDefinition__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4284:1: ( ( rule__NodeStyleDefinition__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4285:1: ( rule__NodeStyleDefinition__Group_2__0 )?
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4286:1: ( rule__NodeStyleDefinition__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==59) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==48) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4286:2: rule__NodeStyleDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__0_in_rule__NodeStyleDefinition__Group__2__Impl8754);
                    rule__NodeStyleDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeStyleDefinitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__Group__2__Impl"


    // $ANTLR start "rule__NodeStyleDefinition__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4296:1: rule__NodeStyleDefinition__Group__3 : rule__NodeStyleDefinition__Group__3__Impl rule__NodeStyleDefinition__Group__4 ;
    public final void rule__NodeStyleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4300:1: ( rule__NodeStyleDefinition__Group__3__Impl rule__NodeStyleDefinition__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4301:2: rule__NodeStyleDefinition__Group__3__Impl rule__NodeStyleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__3__Impl_in_rule__NodeStyleDefinition__Group__38785);
            rule__NodeStyleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__4_in_rule__NodeStyleDefinition__Group__38788);
            rule__NodeStyleDefinition__Group__4();

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
    // $ANTLR end "rule__NodeStyleDefinition__Group__3"


    // $ANTLR start "rule__NodeStyleDefinition__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4308:1: rule__NodeStyleDefinition__Group__3__Impl : ( ( rule__NodeStyleDefinition__Group_3__0 )? ) ;
    public final void rule__NodeStyleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4312:1: ( ( ( rule__NodeStyleDefinition__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4313:1: ( ( rule__NodeStyleDefinition__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4313:1: ( ( rule__NodeStyleDefinition__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4314:1: ( rule__NodeStyleDefinition__Group_3__0 )?
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4315:1: ( rule__NodeStyleDefinition__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==59) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4315:2: rule__NodeStyleDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__0_in_rule__NodeStyleDefinition__Group__3__Impl8815);
                    rule__NodeStyleDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeStyleDefinitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__Group__3__Impl"


    // $ANTLR start "rule__NodeStyleDefinition__Group__4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4325:1: rule__NodeStyleDefinition__Group__4 : rule__NodeStyleDefinition__Group__4__Impl ;
    public final void rule__NodeStyleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4329:1: ( rule__NodeStyleDefinition__Group__4__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4330:2: rule__NodeStyleDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__4__Impl_in_rule__NodeStyleDefinition__Group__48846);
            rule__NodeStyleDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__NodeStyleDefinition__Group__4"


    // $ANTLR start "rule__NodeStyleDefinition__Group__4__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4336:1: rule__NodeStyleDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__NodeStyleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4340:1: ( ( ']' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4341:1: ( ']' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4341:1: ( ']' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4342:1: ']'
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getRightSquareBracketKeyword_4()); 
            match(input,58,FOLLOW_58_in_rule__NodeStyleDefinition__Group__4__Impl8874); 
             after(grammarAccess.getNodeStyleDefinitionAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__Group__4__Impl"


    // $ANTLR start "rule__NodeStyleDefinition__Group_2__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4365:1: rule__NodeStyleDefinition__Group_2__0 : rule__NodeStyleDefinition__Group_2__0__Impl rule__NodeStyleDefinition__Group_2__1 ;
    public final void rule__NodeStyleDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4369:1: ( rule__NodeStyleDefinition__Group_2__0__Impl rule__NodeStyleDefinition__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4370:2: rule__NodeStyleDefinition__Group_2__0__Impl rule__NodeStyleDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__0__Impl_in_rule__NodeStyleDefinition__Group_2__08915);
            rule__NodeStyleDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__1_in_rule__NodeStyleDefinition__Group_2__08918);
            rule__NodeStyleDefinition__Group_2__1();

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
    // $ANTLR end "rule__NodeStyleDefinition__Group_2__0"


    // $ANTLR start "rule__NodeStyleDefinition__Group_2__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4377:1: rule__NodeStyleDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NodeStyleDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4381:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4382:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4382:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4383:1: ','
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,59,FOLLOW_59_in_rule__NodeStyleDefinition__Group_2__0__Impl8946); 
             after(grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__NodeStyleDefinition__Group_2__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4396:1: rule__NodeStyleDefinition__Group_2__1 : rule__NodeStyleDefinition__Group_2__1__Impl ;
    public final void rule__NodeStyleDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4400:1: ( rule__NodeStyleDefinition__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4401:2: rule__NodeStyleDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__1__Impl_in_rule__NodeStyleDefinition__Group_2__18977);
            rule__NodeStyleDefinition__Group_2__1__Impl();

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
    // $ANTLR end "rule__NodeStyleDefinition__Group_2__1"


    // $ANTLR start "rule__NodeStyleDefinition__Group_2__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4407:1: rule__NodeStyleDefinition__Group_2__1__Impl : ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) ) ;
    public final void rule__NodeStyleDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4411:1: ( ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4412:1: ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4412:1: ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4413:1: ( rule__NodeStyleDefinition__LabelAssignment_2_1 )
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getLabelAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4414:1: ( rule__NodeStyleDefinition__LabelAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4414:2: rule__NodeStyleDefinition__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__LabelAssignment_2_1_in_rule__NodeStyleDefinition__Group_2__1__Impl9004);
            rule__NodeStyleDefinition__LabelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeStyleDefinitionAccess().getLabelAssignment_2_1()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__NodeStyleDefinition__Group_3__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4428:1: rule__NodeStyleDefinition__Group_3__0 : rule__NodeStyleDefinition__Group_3__0__Impl rule__NodeStyleDefinition__Group_3__1 ;
    public final void rule__NodeStyleDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4432:1: ( rule__NodeStyleDefinition__Group_3__0__Impl rule__NodeStyleDefinition__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4433:2: rule__NodeStyleDefinition__Group_3__0__Impl rule__NodeStyleDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__0__Impl_in_rule__NodeStyleDefinition__Group_3__09038);
            rule__NodeStyleDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__1_in_rule__NodeStyleDefinition__Group_3__09041);
            rule__NodeStyleDefinition__Group_3__1();

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
    // $ANTLR end "rule__NodeStyleDefinition__Group_3__0"


    // $ANTLR start "rule__NodeStyleDefinition__Group_3__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4440:1: rule__NodeStyleDefinition__Group_3__0__Impl : ( ',' ) ;
    public final void rule__NodeStyleDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4444:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4445:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4445:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4446:1: ','
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_3_0()); 
            match(input,59,FOLLOW_59_in_rule__NodeStyleDefinition__Group_3__0__Impl9069); 
             after(grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__NodeStyleDefinition__Group_3__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4459:1: rule__NodeStyleDefinition__Group_3__1 : rule__NodeStyleDefinition__Group_3__1__Impl ;
    public final void rule__NodeStyleDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4463:1: ( rule__NodeStyleDefinition__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4464:2: rule__NodeStyleDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__1__Impl_in_rule__NodeStyleDefinition__Group_3__19100);
            rule__NodeStyleDefinition__Group_3__1__Impl();

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
    // $ANTLR end "rule__NodeStyleDefinition__Group_3__1"


    // $ANTLR start "rule__NodeStyleDefinition__Group_3__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4470:1: rule__NodeStyleDefinition__Group_3__1__Impl : ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) ) ;
    public final void rule__NodeStyleDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4474:1: ( ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4475:1: ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4475:1: ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4476:1: ( rule__NodeStyleDefinition__BorderAssignment_3_1 )
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getBorderAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4477:1: ( rule__NodeStyleDefinition__BorderAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4477:2: rule__NodeStyleDefinition__BorderAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__BorderAssignment_3_1_in_rule__NodeStyleDefinition__Group_3__1__Impl9127);
            rule__NodeStyleDefinition__BorderAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeStyleDefinitionAccess().getBorderAssignment_3_1()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__SolidColorDefinition__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4491:1: rule__SolidColorDefinition__Group__0 : rule__SolidColorDefinition__Group__0__Impl rule__SolidColorDefinition__Group__1 ;
    public final void rule__SolidColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4495:1: ( rule__SolidColorDefinition__Group__0__Impl rule__SolidColorDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4496:2: rule__SolidColorDefinition__Group__0__Impl rule__SolidColorDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__SolidColorDefinition__Group__0__Impl_in_rule__SolidColorDefinition__Group__09161);
            rule__SolidColorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SolidColorDefinition__Group__1_in_rule__SolidColorDefinition__Group__09164);
            rule__SolidColorDefinition__Group__1();

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
    // $ANTLR end "rule__SolidColorDefinition__Group__0"


    // $ANTLR start "rule__SolidColorDefinition__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4503:1: rule__SolidColorDefinition__Group__0__Impl : ( 'color' ) ;
    public final void rule__SolidColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4507:1: ( ( 'color' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4508:1: ( 'color' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4508:1: ( 'color' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4509:1: 'color'
            {
             before(grammarAccess.getSolidColorDefinitionAccess().getColorKeyword_0()); 
            match(input,61,FOLLOW_61_in_rule__SolidColorDefinition__Group__0__Impl9192); 
             after(grammarAccess.getSolidColorDefinitionAccess().getColorKeyword_0()); 

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
    // $ANTLR end "rule__SolidColorDefinition__Group__0__Impl"


    // $ANTLR start "rule__SolidColorDefinition__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4522:1: rule__SolidColorDefinition__Group__1 : rule__SolidColorDefinition__Group__1__Impl ;
    public final void rule__SolidColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4526:1: ( rule__SolidColorDefinition__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4527:2: rule__SolidColorDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SolidColorDefinition__Group__1__Impl_in_rule__SolidColorDefinition__Group__19223);
            rule__SolidColorDefinition__Group__1__Impl();

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
    // $ANTLR end "rule__SolidColorDefinition__Group__1"


    // $ANTLR start "rule__SolidColorDefinition__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4533:1: rule__SolidColorDefinition__Group__1__Impl : ( ( rule__SolidColorDefinition__ColorAssignment_1 ) ) ;
    public final void rule__SolidColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4537:1: ( ( ( rule__SolidColorDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4538:1: ( ( rule__SolidColorDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4538:1: ( ( rule__SolidColorDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4539:1: ( rule__SolidColorDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getSolidColorDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4540:1: ( rule__SolidColorDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4540:2: rule__SolidColorDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__SolidColorDefinition__ColorAssignment_1_in_rule__SolidColorDefinition__Group__1__Impl9250);
            rule__SolidColorDefinition__ColorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSolidColorDefinitionAccess().getColorAssignment_1()); 

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
    // $ANTLR end "rule__SolidColorDefinition__Group__1__Impl"


    // $ANTLR start "rule__GradientColorDefinition__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4554:1: rule__GradientColorDefinition__Group__0 : rule__GradientColorDefinition__Group__0__Impl rule__GradientColorDefinition__Group__1 ;
    public final void rule__GradientColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4558:1: ( rule__GradientColorDefinition__Group__0__Impl rule__GradientColorDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4559:2: rule__GradientColorDefinition__Group__0__Impl rule__GradientColorDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__0__Impl_in_rule__GradientColorDefinition__Group__09284);
            rule__GradientColorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__1_in_rule__GradientColorDefinition__Group__09287);
            rule__GradientColorDefinition__Group__1();

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
    // $ANTLR end "rule__GradientColorDefinition__Group__0"


    // $ANTLR start "rule__GradientColorDefinition__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4566:1: rule__GradientColorDefinition__Group__0__Impl : ( 'gradient from' ) ;
    public final void rule__GradientColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4570:1: ( ( 'gradient from' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4571:1: ( 'gradient from' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4571:1: ( 'gradient from' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4572:1: 'gradient from'
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getGradientFromKeyword_0()); 
            match(input,62,FOLLOW_62_in_rule__GradientColorDefinition__Group__0__Impl9315); 
             after(grammarAccess.getGradientColorDefinitionAccess().getGradientFromKeyword_0()); 

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
    // $ANTLR end "rule__GradientColorDefinition__Group__0__Impl"


    // $ANTLR start "rule__GradientColorDefinition__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4585:1: rule__GradientColorDefinition__Group__1 : rule__GradientColorDefinition__Group__1__Impl rule__GradientColorDefinition__Group__2 ;
    public final void rule__GradientColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4589:1: ( rule__GradientColorDefinition__Group__1__Impl rule__GradientColorDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4590:2: rule__GradientColorDefinition__Group__1__Impl rule__GradientColorDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__1__Impl_in_rule__GradientColorDefinition__Group__19346);
            rule__GradientColorDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__2_in_rule__GradientColorDefinition__Group__19349);
            rule__GradientColorDefinition__Group__2();

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
    // $ANTLR end "rule__GradientColorDefinition__Group__1"


    // $ANTLR start "rule__GradientColorDefinition__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4597:1: rule__GradientColorDefinition__Group__1__Impl : ( ( rule__GradientColorDefinition__FromAssignment_1 ) ) ;
    public final void rule__GradientColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4601:1: ( ( ( rule__GradientColorDefinition__FromAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4602:1: ( ( rule__GradientColorDefinition__FromAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4602:1: ( ( rule__GradientColorDefinition__FromAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4603:1: ( rule__GradientColorDefinition__FromAssignment_1 )
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getFromAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4604:1: ( rule__GradientColorDefinition__FromAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4604:2: rule__GradientColorDefinition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__FromAssignment_1_in_rule__GradientColorDefinition__Group__1__Impl9376);
            rule__GradientColorDefinition__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGradientColorDefinitionAccess().getFromAssignment_1()); 

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
    // $ANTLR end "rule__GradientColorDefinition__Group__1__Impl"


    // $ANTLR start "rule__GradientColorDefinition__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4614:1: rule__GradientColorDefinition__Group__2 : rule__GradientColorDefinition__Group__2__Impl rule__GradientColorDefinition__Group__3 ;
    public final void rule__GradientColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4618:1: ( rule__GradientColorDefinition__Group__2__Impl rule__GradientColorDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4619:2: rule__GradientColorDefinition__Group__2__Impl rule__GradientColorDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__2__Impl_in_rule__GradientColorDefinition__Group__29406);
            rule__GradientColorDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__3_in_rule__GradientColorDefinition__Group__29409);
            rule__GradientColorDefinition__Group__3();

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
    // $ANTLR end "rule__GradientColorDefinition__Group__2"


    // $ANTLR start "rule__GradientColorDefinition__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4626:1: rule__GradientColorDefinition__Group__2__Impl : ( 'to' ) ;
    public final void rule__GradientColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4630:1: ( ( 'to' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4631:1: ( 'to' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4631:1: ( 'to' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4632:1: 'to'
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getToKeyword_2()); 
            match(input,63,FOLLOW_63_in_rule__GradientColorDefinition__Group__2__Impl9437); 
             after(grammarAccess.getGradientColorDefinitionAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__GradientColorDefinition__Group__2__Impl"


    // $ANTLR start "rule__GradientColorDefinition__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4645:1: rule__GradientColorDefinition__Group__3 : rule__GradientColorDefinition__Group__3__Impl ;
    public final void rule__GradientColorDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4649:1: ( rule__GradientColorDefinition__Group__3__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4650:2: rule__GradientColorDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__3__Impl_in_rule__GradientColorDefinition__Group__39468);
            rule__GradientColorDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__GradientColorDefinition__Group__3"


    // $ANTLR start "rule__GradientColorDefinition__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4656:1: rule__GradientColorDefinition__Group__3__Impl : ( ( rule__GradientColorDefinition__ToAssignment_3 ) ) ;
    public final void rule__GradientColorDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4660:1: ( ( ( rule__GradientColorDefinition__ToAssignment_3 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4661:1: ( ( rule__GradientColorDefinition__ToAssignment_3 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4661:1: ( ( rule__GradientColorDefinition__ToAssignment_3 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4662:1: ( rule__GradientColorDefinition__ToAssignment_3 )
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getToAssignment_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4663:1: ( rule__GradientColorDefinition__ToAssignment_3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4663:2: rule__GradientColorDefinition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__ToAssignment_3_in_rule__GradientColorDefinition__Group__3__Impl9495);
            rule__GradientColorDefinition__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGradientColorDefinitionAccess().getToAssignment_3()); 

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
    // $ANTLR end "rule__GradientColorDefinition__Group__3__Impl"


    // $ANTLR start "rule__LabelStyleDefinition__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4681:1: rule__LabelStyleDefinition__Group__0 : rule__LabelStyleDefinition__Group__0__Impl rule__LabelStyleDefinition__Group__1 ;
    public final void rule__LabelStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4685:1: ( rule__LabelStyleDefinition__Group__0__Impl rule__LabelStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4686:2: rule__LabelStyleDefinition__Group__0__Impl rule__LabelStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__0__Impl_in_rule__LabelStyleDefinition__Group__09533);
            rule__LabelStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__1_in_rule__LabelStyleDefinition__Group__09536);
            rule__LabelStyleDefinition__Group__1();

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__0"


    // $ANTLR start "rule__LabelStyleDefinition__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4693:1: rule__LabelStyleDefinition__Group__0__Impl : ( 'label' ) ;
    public final void rule__LabelStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4697:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4698:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4698:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4699:1: 'label'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getLabelKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__LabelStyleDefinition__Group__0__Impl9564); 
             after(grammarAccess.getLabelStyleDefinitionAccess().getLabelKeyword_0()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__0__Impl"


    // $ANTLR start "rule__LabelStyleDefinition__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4712:1: rule__LabelStyleDefinition__Group__1 : rule__LabelStyleDefinition__Group__1__Impl rule__LabelStyleDefinition__Group__2 ;
    public final void rule__LabelStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4716:1: ( rule__LabelStyleDefinition__Group__1__Impl rule__LabelStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4717:2: rule__LabelStyleDefinition__Group__1__Impl rule__LabelStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__1__Impl_in_rule__LabelStyleDefinition__Group__19595);
            rule__LabelStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__2_in_rule__LabelStyleDefinition__Group__19598);
            rule__LabelStyleDefinition__Group__2();

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__1"


    // $ANTLR start "rule__LabelStyleDefinition__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4724:1: rule__LabelStyleDefinition__Group__1__Impl : ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? ) ;
    public final void rule__LabelStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4728:1: ( ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4729:1: ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4729:1: ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4730:1: ( rule__LabelStyleDefinition__ExpressionAssignment_1 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getExpressionAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4731:1: ( rule__LabelStyleDefinition__ExpressionAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=66 && LA39_0<=68)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4731:2: rule__LabelStyleDefinition__ExpressionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__ExpressionAssignment_1_in_rule__LabelStyleDefinition__Group__1__Impl9625);
                    rule__LabelStyleDefinition__ExpressionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelStyleDefinitionAccess().getExpressionAssignment_1()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__1__Impl"


    // $ANTLR start "rule__LabelStyleDefinition__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4741:1: rule__LabelStyleDefinition__Group__2 : rule__LabelStyleDefinition__Group__2__Impl rule__LabelStyleDefinition__Group__3 ;
    public final void rule__LabelStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4745:1: ( rule__LabelStyleDefinition__Group__2__Impl rule__LabelStyleDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4746:2: rule__LabelStyleDefinition__Group__2__Impl rule__LabelStyleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__2__Impl_in_rule__LabelStyleDefinition__Group__29656);
            rule__LabelStyleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__3_in_rule__LabelStyleDefinition__Group__29659);
            rule__LabelStyleDefinition__Group__3();

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__2"


    // $ANTLR start "rule__LabelStyleDefinition__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4753:1: rule__LabelStyleDefinition__Group__2__Impl : ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) ) ;
    public final void rule__LabelStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4757:1: ( ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4758:1: ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4758:1: ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4759:1: ( rule__LabelStyleDefinition__ColorAssignment_2 )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getColorAssignment_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4760:1: ( rule__LabelStyleDefinition__ColorAssignment_2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4760:2: rule__LabelStyleDefinition__ColorAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__ColorAssignment_2_in_rule__LabelStyleDefinition__Group__2__Impl9686);
            rule__LabelStyleDefinition__ColorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelStyleDefinitionAccess().getColorAssignment_2()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__2__Impl"


    // $ANTLR start "rule__LabelStyleDefinition__Group__3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4770:1: rule__LabelStyleDefinition__Group__3 : rule__LabelStyleDefinition__Group__3__Impl rule__LabelStyleDefinition__Group__4 ;
    public final void rule__LabelStyleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4774:1: ( rule__LabelStyleDefinition__Group__3__Impl rule__LabelStyleDefinition__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4775:2: rule__LabelStyleDefinition__Group__3__Impl rule__LabelStyleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__3__Impl_in_rule__LabelStyleDefinition__Group__39716);
            rule__LabelStyleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__4_in_rule__LabelStyleDefinition__Group__39719);
            rule__LabelStyleDefinition__Group__4();

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__3"


    // $ANTLR start "rule__LabelStyleDefinition__Group__3__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4782:1: rule__LabelStyleDefinition__Group__3__Impl : ( ( rule__LabelStyleDefinition__Group_3__0 )? ) ;
    public final void rule__LabelStyleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4786:1: ( ( ( rule__LabelStyleDefinition__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4787:1: ( ( rule__LabelStyleDefinition__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4787:1: ( ( rule__LabelStyleDefinition__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4788:1: ( rule__LabelStyleDefinition__Group_3__0 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4789:1: ( rule__LabelStyleDefinition__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==64) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4789:2: rule__LabelStyleDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__0_in_rule__LabelStyleDefinition__Group__3__Impl9746);
                    rule__LabelStyleDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelStyleDefinitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__3__Impl"


    // $ANTLR start "rule__LabelStyleDefinition__Group__4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4799:1: rule__LabelStyleDefinition__Group__4 : rule__LabelStyleDefinition__Group__4__Impl rule__LabelStyleDefinition__Group__5 ;
    public final void rule__LabelStyleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4803:1: ( rule__LabelStyleDefinition__Group__4__Impl rule__LabelStyleDefinition__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4804:2: rule__LabelStyleDefinition__Group__4__Impl rule__LabelStyleDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__4__Impl_in_rule__LabelStyleDefinition__Group__49777);
            rule__LabelStyleDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__5_in_rule__LabelStyleDefinition__Group__49780);
            rule__LabelStyleDefinition__Group__5();

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__4"


    // $ANTLR start "rule__LabelStyleDefinition__Group__4__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4811:1: rule__LabelStyleDefinition__Group__4__Impl : ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? ) ;
    public final void rule__LabelStyleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4815:1: ( ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4816:1: ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4816:1: ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4817:1: ( rule__LabelStyleDefinition__BoldAssignment_4 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getBoldAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4818:1: ( rule__LabelStyleDefinition__BoldAssignment_4 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==72) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4818:2: rule__LabelStyleDefinition__BoldAssignment_4
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__BoldAssignment_4_in_rule__LabelStyleDefinition__Group__4__Impl9807);
                    rule__LabelStyleDefinition__BoldAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelStyleDefinitionAccess().getBoldAssignment_4()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__4__Impl"


    // $ANTLR start "rule__LabelStyleDefinition__Group__5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4828:1: rule__LabelStyleDefinition__Group__5 : rule__LabelStyleDefinition__Group__5__Impl ;
    public final void rule__LabelStyleDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4832:1: ( rule__LabelStyleDefinition__Group__5__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4833:2: rule__LabelStyleDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__5__Impl_in_rule__LabelStyleDefinition__Group__59838);
            rule__LabelStyleDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__5"


    // $ANTLR start "rule__LabelStyleDefinition__Group__5__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4839:1: rule__LabelStyleDefinition__Group__5__Impl : ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? ) ;
    public final void rule__LabelStyleDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4843:1: ( ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4844:1: ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4844:1: ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4845:1: ( rule__LabelStyleDefinition__ItalicAssignment_5 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getItalicAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4846:1: ( rule__LabelStyleDefinition__ItalicAssignment_5 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==73) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4846:2: rule__LabelStyleDefinition__ItalicAssignment_5
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__ItalicAssignment_5_in_rule__LabelStyleDefinition__Group__5__Impl9865);
                    rule__LabelStyleDefinition__ItalicAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelStyleDefinitionAccess().getItalicAssignment_5()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__Group__5__Impl"


    // $ANTLR start "rule__LabelStyleDefinition__Group_3__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4868:1: rule__LabelStyleDefinition__Group_3__0 : rule__LabelStyleDefinition__Group_3__0__Impl rule__LabelStyleDefinition__Group_3__1 ;
    public final void rule__LabelStyleDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4872:1: ( rule__LabelStyleDefinition__Group_3__0__Impl rule__LabelStyleDefinition__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4873:2: rule__LabelStyleDefinition__Group_3__0__Impl rule__LabelStyleDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__0__Impl_in_rule__LabelStyleDefinition__Group_3__09908);
            rule__LabelStyleDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__1_in_rule__LabelStyleDefinition__Group_3__09911);
            rule__LabelStyleDefinition__Group_3__1();

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
    // $ANTLR end "rule__LabelStyleDefinition__Group_3__0"


    // $ANTLR start "rule__LabelStyleDefinition__Group_3__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4880:1: rule__LabelStyleDefinition__Group_3__0__Impl : ( 'size' ) ;
    public final void rule__LabelStyleDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4884:1: ( ( 'size' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4885:1: ( 'size' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4885:1: ( 'size' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4886:1: 'size'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getSizeKeyword_3_0()); 
            match(input,64,FOLLOW_64_in_rule__LabelStyleDefinition__Group_3__0__Impl9939); 
             after(grammarAccess.getLabelStyleDefinitionAccess().getSizeKeyword_3_0()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__LabelStyleDefinition__Group_3__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4899:1: rule__LabelStyleDefinition__Group_3__1 : rule__LabelStyleDefinition__Group_3__1__Impl ;
    public final void rule__LabelStyleDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4903:1: ( rule__LabelStyleDefinition__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4904:2: rule__LabelStyleDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__1__Impl_in_rule__LabelStyleDefinition__Group_3__19970);
            rule__LabelStyleDefinition__Group_3__1__Impl();

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
    // $ANTLR end "rule__LabelStyleDefinition__Group_3__1"


    // $ANTLR start "rule__LabelStyleDefinition__Group_3__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4910:1: rule__LabelStyleDefinition__Group_3__1__Impl : ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) ) ;
    public final void rule__LabelStyleDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4914:1: ( ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4915:1: ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4915:1: ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4916:1: ( rule__LabelStyleDefinition__SizeAssignment_3_1 )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getSizeAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4917:1: ( rule__LabelStyleDefinition__SizeAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4917:2: rule__LabelStyleDefinition__SizeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__SizeAssignment_3_1_in_rule__LabelStyleDefinition__Group_3__1__Impl9997);
            rule__LabelStyleDefinition__SizeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelStyleDefinitionAccess().getSizeAssignment_3_1()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__BorderStyleDefinition__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4931:1: rule__BorderStyleDefinition__Group__0 : rule__BorderStyleDefinition__Group__0__Impl rule__BorderStyleDefinition__Group__1 ;
    public final void rule__BorderStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4935:1: ( rule__BorderStyleDefinition__Group__0__Impl rule__BorderStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4936:2: rule__BorderStyleDefinition__Group__0__Impl rule__BorderStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__0__Impl_in_rule__BorderStyleDefinition__Group__010031);
            rule__BorderStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__1_in_rule__BorderStyleDefinition__Group__010034);
            rule__BorderStyleDefinition__Group__1();

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
    // $ANTLR end "rule__BorderStyleDefinition__Group__0"


    // $ANTLR start "rule__BorderStyleDefinition__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4943:1: rule__BorderStyleDefinition__Group__0__Impl : ( 'border ' ) ;
    public final void rule__BorderStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4947:1: ( ( 'border ' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4948:1: ( 'border ' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4948:1: ( 'border ' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4949:1: 'border '
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getBorderKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__BorderStyleDefinition__Group__0__Impl10062); 
             after(grammarAccess.getBorderStyleDefinitionAccess().getBorderKeyword_0()); 

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
    // $ANTLR end "rule__BorderStyleDefinition__Group__0__Impl"


    // $ANTLR start "rule__BorderStyleDefinition__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4962:1: rule__BorderStyleDefinition__Group__1 : rule__BorderStyleDefinition__Group__1__Impl rule__BorderStyleDefinition__Group__2 ;
    public final void rule__BorderStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4966:1: ( rule__BorderStyleDefinition__Group__1__Impl rule__BorderStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4967:2: rule__BorderStyleDefinition__Group__1__Impl rule__BorderStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__1__Impl_in_rule__BorderStyleDefinition__Group__110093);
            rule__BorderStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__2_in_rule__BorderStyleDefinition__Group__110096);
            rule__BorderStyleDefinition__Group__2();

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
    // $ANTLR end "rule__BorderStyleDefinition__Group__1"


    // $ANTLR start "rule__BorderStyleDefinition__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4974:1: rule__BorderStyleDefinition__Group__1__Impl : ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) ) ;
    public final void rule__BorderStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4978:1: ( ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4979:1: ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4979:1: ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4980:1: ( rule__BorderStyleDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4981:1: ( rule__BorderStyleDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4981:2: rule__BorderStyleDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__ColorAssignment_1_in_rule__BorderStyleDefinition__Group__1__Impl10123);
            rule__BorderStyleDefinition__ColorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBorderStyleDefinitionAccess().getColorAssignment_1()); 

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
    // $ANTLR end "rule__BorderStyleDefinition__Group__1__Impl"


    // $ANTLR start "rule__BorderStyleDefinition__Group__2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4991:1: rule__BorderStyleDefinition__Group__2 : rule__BorderStyleDefinition__Group__2__Impl ;
    public final void rule__BorderStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4995:1: ( rule__BorderStyleDefinition__Group__2__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4996:2: rule__BorderStyleDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__2__Impl_in_rule__BorderStyleDefinition__Group__210153);
            rule__BorderStyleDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__BorderStyleDefinition__Group__2"


    // $ANTLR start "rule__BorderStyleDefinition__Group__2__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5002:1: rule__BorderStyleDefinition__Group__2__Impl : ( ( rule__BorderStyleDefinition__Group_2__0 )? ) ;
    public final void rule__BorderStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5006:1: ( ( ( rule__BorderStyleDefinition__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5007:1: ( ( rule__BorderStyleDefinition__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5007:1: ( ( rule__BorderStyleDefinition__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5008:1: ( rule__BorderStyleDefinition__Group_2__0 )?
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5009:1: ( rule__BorderStyleDefinition__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==64) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5009:2: rule__BorderStyleDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__0_in_rule__BorderStyleDefinition__Group__2__Impl10180);
                    rule__BorderStyleDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBorderStyleDefinitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BorderStyleDefinition__Group__2__Impl"


    // $ANTLR start "rule__BorderStyleDefinition__Group_2__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5025:1: rule__BorderStyleDefinition__Group_2__0 : rule__BorderStyleDefinition__Group_2__0__Impl rule__BorderStyleDefinition__Group_2__1 ;
    public final void rule__BorderStyleDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5029:1: ( rule__BorderStyleDefinition__Group_2__0__Impl rule__BorderStyleDefinition__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5030:2: rule__BorderStyleDefinition__Group_2__0__Impl rule__BorderStyleDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__0__Impl_in_rule__BorderStyleDefinition__Group_2__010217);
            rule__BorderStyleDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__1_in_rule__BorderStyleDefinition__Group_2__010220);
            rule__BorderStyleDefinition__Group_2__1();

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
    // $ANTLR end "rule__BorderStyleDefinition__Group_2__0"


    // $ANTLR start "rule__BorderStyleDefinition__Group_2__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5037:1: rule__BorderStyleDefinition__Group_2__0__Impl : ( 'size' ) ;
    public final void rule__BorderStyleDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5041:1: ( ( 'size' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5042:1: ( 'size' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5042:1: ( 'size' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5043:1: 'size'
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getSizeKeyword_2_0()); 
            match(input,64,FOLLOW_64_in_rule__BorderStyleDefinition__Group_2__0__Impl10248); 
             after(grammarAccess.getBorderStyleDefinitionAccess().getSizeKeyword_2_0()); 

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
    // $ANTLR end "rule__BorderStyleDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__BorderStyleDefinition__Group_2__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5056:1: rule__BorderStyleDefinition__Group_2__1 : rule__BorderStyleDefinition__Group_2__1__Impl ;
    public final void rule__BorderStyleDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5060:1: ( rule__BorderStyleDefinition__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5061:2: rule__BorderStyleDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__1__Impl_in_rule__BorderStyleDefinition__Group_2__110279);
            rule__BorderStyleDefinition__Group_2__1__Impl();

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
    // $ANTLR end "rule__BorderStyleDefinition__Group_2__1"


    // $ANTLR start "rule__BorderStyleDefinition__Group_2__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5067:1: rule__BorderStyleDefinition__Group_2__1__Impl : ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) ) ;
    public final void rule__BorderStyleDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5071:1: ( ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5072:1: ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5072:1: ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5073:1: ( rule__BorderStyleDefinition__SizeAssignment_2_1 )
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getSizeAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5074:1: ( rule__BorderStyleDefinition__SizeAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5074:2: rule__BorderStyleDefinition__SizeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__SizeAssignment_2_1_in_rule__BorderStyleDefinition__Group_2__1__Impl10306);
            rule__BorderStyleDefinition__SizeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBorderStyleDefinitionAccess().getSizeAssignment_2_1()); 

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
    // $ANTLR end "rule__BorderStyleDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__AcceleoExpression__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5088:1: rule__AcceleoExpression__Group__0 : rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1 ;
    public final void rule__AcceleoExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5092:1: ( rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5093:2: rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__Group__0__Impl_in_rule__AcceleoExpression__Group__010340);
            rule__AcceleoExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AcceleoExpression__Group__1_in_rule__AcceleoExpression__Group__010343);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5100:1: rule__AcceleoExpression__Group__0__Impl : ( 'acc:' ) ;
    public final void rule__AcceleoExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5104:1: ( ( 'acc:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5105:1: ( 'acc:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5105:1: ( 'acc:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5106:1: 'acc:'
            {
             before(grammarAccess.getAcceleoExpressionAccess().getAccKeyword_0()); 
            match(input,66,FOLLOW_66_in_rule__AcceleoExpression__Group__0__Impl10371); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5119:1: rule__AcceleoExpression__Group__1 : rule__AcceleoExpression__Group__1__Impl ;
    public final void rule__AcceleoExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5123:1: ( rule__AcceleoExpression__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5124:2: rule__AcceleoExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__Group__1__Impl_in_rule__AcceleoExpression__Group__110402);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5130:1: rule__AcceleoExpression__Group__1__Impl : ( ( rule__AcceleoExpression__ValueAssignment_1 ) ) ;
    public final void rule__AcceleoExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5134:1: ( ( ( rule__AcceleoExpression__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5135:1: ( ( rule__AcceleoExpression__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5135:1: ( ( rule__AcceleoExpression__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5136:1: ( rule__AcceleoExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getAcceleoExpressionAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5137:1: ( rule__AcceleoExpression__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5137:2: rule__AcceleoExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__ValueAssignment_1_in_rule__AcceleoExpression__Group__1__Impl10429);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5151:1: rule__VarRef__Group__0 : rule__VarRef__Group__0__Impl rule__VarRef__Group__1 ;
    public final void rule__VarRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5155:1: ( rule__VarRef__Group__0__Impl rule__VarRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5156:2: rule__VarRef__Group__0__Impl rule__VarRef__Group__1
            {
            pushFollow(FOLLOW_rule__VarRef__Group__0__Impl_in_rule__VarRef__Group__010463);
            rule__VarRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarRef__Group__1_in_rule__VarRef__Group__010466);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5163:1: rule__VarRef__Group__0__Impl : ( 'var:' ) ;
    public final void rule__VarRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5167:1: ( ( 'var:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5168:1: ( 'var:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5168:1: ( 'var:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5169:1: 'var:'
            {
             before(grammarAccess.getVarRefAccess().getVarKeyword_0()); 
            match(input,67,FOLLOW_67_in_rule__VarRef__Group__0__Impl10494); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5182:1: rule__VarRef__Group__1 : rule__VarRef__Group__1__Impl ;
    public final void rule__VarRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5186:1: ( rule__VarRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5187:2: rule__VarRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarRef__Group__1__Impl_in_rule__VarRef__Group__110525);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5193:1: rule__VarRef__Group__1__Impl : ( ( rule__VarRef__ValueAssignment_1 ) ) ;
    public final void rule__VarRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5197:1: ( ( ( rule__VarRef__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5198:1: ( ( rule__VarRef__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5198:1: ( ( rule__VarRef__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5199:1: ( rule__VarRef__ValueAssignment_1 )
            {
             before(grammarAccess.getVarRefAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5200:1: ( rule__VarRef__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5200:2: rule__VarRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__VarRef__ValueAssignment_1_in_rule__VarRef__Group__1__Impl10552);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5214:1: rule__FeatureRef__Group__0 : rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1 ;
    public final void rule__FeatureRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5218:1: ( rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5219:2: rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureRef__Group__0__Impl_in_rule__FeatureRef__Group__010586);
            rule__FeatureRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureRef__Group__1_in_rule__FeatureRef__Group__010589);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5226:1: rule__FeatureRef__Group__0__Impl : ( 'feature:' ) ;
    public final void rule__FeatureRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5230:1: ( ( 'feature:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5231:1: ( 'feature:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5231:1: ( 'feature:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5232:1: 'feature:'
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureKeyword_0()); 
            match(input,68,FOLLOW_68_in_rule__FeatureRef__Group__0__Impl10617); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5245:1: rule__FeatureRef__Group__1 : rule__FeatureRef__Group__1__Impl ;
    public final void rule__FeatureRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5249:1: ( rule__FeatureRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5250:2: rule__FeatureRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureRef__Group__1__Impl_in_rule__FeatureRef__Group__110648);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5256:1: rule__FeatureRef__Group__1__Impl : ( ( rule__FeatureRef__ValueAssignment_1 ) ) ;
    public final void rule__FeatureRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5260:1: ( ( ( rule__FeatureRef__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5261:1: ( ( rule__FeatureRef__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5261:1: ( ( rule__FeatureRef__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5262:1: ( rule__FeatureRef__ValueAssignment_1 )
            {
             before(grammarAccess.getFeatureRefAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5263:1: ( rule__FeatureRef__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5263:2: rule__FeatureRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__FeatureRef__ValueAssignment_1_in_rule__FeatureRef__Group__1__Impl10675);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5277:1: rule__MetamodelRef__Group__0 : rule__MetamodelRef__Group__0__Impl rule__MetamodelRef__Group__1 ;
    public final void rule__MetamodelRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5281:1: ( rule__MetamodelRef__Group__0__Impl rule__MetamodelRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5282:2: rule__MetamodelRef__Group__0__Impl rule__MetamodelRef__Group__1
            {
            pushFollow(FOLLOW_rule__MetamodelRef__Group__0__Impl_in_rule__MetamodelRef__Group__010709);
            rule__MetamodelRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetamodelRef__Group__1_in_rule__MetamodelRef__Group__010712);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5289:1: rule__MetamodelRef__Group__0__Impl : ( 'use' ) ;
    public final void rule__MetamodelRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5293:1: ( ( 'use' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5294:1: ( 'use' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5294:1: ( 'use' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5295:1: 'use'
            {
             before(grammarAccess.getMetamodelRefAccess().getUseKeyword_0()); 
            match(input,69,FOLLOW_69_in_rule__MetamodelRef__Group__0__Impl10740); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5308:1: rule__MetamodelRef__Group__1 : rule__MetamodelRef__Group__1__Impl ;
    public final void rule__MetamodelRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5312:1: ( rule__MetamodelRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5313:2: rule__MetamodelRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelRef__Group__1__Impl_in_rule__MetamodelRef__Group__110771);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5319:1: rule__MetamodelRef__Group__1__Impl : ( ( rule__MetamodelRef__MetamodelAssignment_1 ) ) ;
    public final void rule__MetamodelRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5323:1: ( ( ( rule__MetamodelRef__MetamodelAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5324:1: ( ( rule__MetamodelRef__MetamodelAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5324:1: ( ( rule__MetamodelRef__MetamodelAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5325:1: ( rule__MetamodelRef__MetamodelAssignment_1 )
            {
             before(grammarAccess.getMetamodelRefAccess().getMetamodelAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5326:1: ( rule__MetamodelRef__MetamodelAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5326:2: rule__MetamodelRef__MetamodelAssignment_1
            {
            pushFollow(FOLLOW_rule__MetamodelRef__MetamodelAssignment_1_in_rule__MetamodelRef__Group__1__Impl10798);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5341:1: rule__SPrototyper__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPrototyper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5345:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5346:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5346:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5347:1: RULE_ID
            {
             before(grammarAccess.getSPrototyperAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPrototyper__NameAssignment_110837); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5356:1: rule__SPrototyper__QualifierAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPrototyper__QualifierAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5360:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5361:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5361:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5362:1: RULE_STRING
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPrototyper__QualifierAssignment_3_110868); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5371:1: rule__SPrototyper__ViewpointsAssignment_4 : ( ruleSPViewpoint ) ;
    public final void rule__SPrototyper__ViewpointsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5375:1: ( ( ruleSPViewpoint ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5376:1: ( ruleSPViewpoint )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5376:1: ( ruleSPViewpoint )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5377:1: ruleSPViewpoint
            {
             before(grammarAccess.getSPrototyperAccess().getViewpointsSPViewpointParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSPViewpoint_in_rule__SPrototyper__ViewpointsAssignment_410899);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5386:1: rule__SPViewpoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPViewpoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5390:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5391:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5391:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5392:1: RULE_ID
            {
             before(grammarAccess.getSPViewpointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPViewpoint__NameAssignment_110930); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5401:1: rule__SPViewpoint__ShortcutAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPViewpoint__ShortcutAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5405:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5406:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5406:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5407:1: RULE_STRING
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPViewpoint__ShortcutAssignment_3_110961); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5416:1: rule__SPViewpoint__ExtensionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SPViewpoint__ExtensionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5420:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5421:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5421:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5422:1: RULE_STRING
            {
             before(grammarAccess.getSPViewpointAccess().getExtensionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPViewpoint__ExtensionAssignment_4_110992); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5431:1: rule__SPViewpoint__RepresentationsAssignment_5 : ( ruleSPRepresentation ) ;
    public final void rule__SPViewpoint__RepresentationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5435:1: ( ( ruleSPRepresentation ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5436:1: ( ruleSPRepresentation )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5436:1: ( ruleSPRepresentation )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5437:1: ruleSPRepresentation
            {
             before(grammarAccess.getSPViewpointAccess().getRepresentationsSPRepresentationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSPRepresentation_in_rule__SPViewpoint__RepresentationsAssignment_511023);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5446:1: rule__SPTable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPTable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5450:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5451:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5451:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5452:1: RULE_ID
            {
             before(grammarAccess.getSPTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPTable__NameAssignment_111054); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5461:1: rule__SPTable__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPTable__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5465:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5466:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5466:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5467:1: RULE_STRING
            {
             before(grammarAccess.getSPTableAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPTable__LabelAssignment_3_111085); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5476:1: rule__SPTable__TitleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SPTable__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5480:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5481:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5481:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5482:1: RULE_STRING
            {
             before(grammarAccess.getSPTableAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPTable__TitleAssignment_4_111116); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5491:1: rule__SPTable__MetamodelsAssignment_5 : ( ruleMetamodelRef ) ;
    public final void rule__SPTable__MetamodelsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5495:1: ( ( ruleMetamodelRef ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5496:1: ( ruleMetamodelRef )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5496:1: ( ruleMetamodelRef )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5497:1: ruleMetamodelRef
            {
             before(grammarAccess.getSPTableAccess().getMetamodelsMetamodelRefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMetamodelRef_in_rule__SPTable__MetamodelsAssignment_511147);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5506:1: rule__SPTable__RootAssignment_7 : ( RULE_STRING ) ;
    public final void rule__SPTable__RootAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5510:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5511:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5511:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5512:1: RULE_STRING
            {
             before(grammarAccess.getSPTableAccess().getRootSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPTable__RootAssignment_711178); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5521:1: rule__SPTable__ElementsAssignment_8 : ( ruleTableElement ) ;
    public final void rule__SPTable__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5525:1: ( ( ruleTableElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5526:1: ( ruleTableElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5526:1: ( ruleTableElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5527:1: ruleTableElement
            {
             before(grammarAccess.getSPTableAccess().getElementsTableElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleTableElement_in_rule__SPTable__ElementsAssignment_811209);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5536:1: rule__SPTable__PropertiesAssignment_9 : ( ruleTableProperty ) ;
    public final void rule__SPTable__PropertiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5540:1: ( ( ruleTableProperty ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5541:1: ( ruleTableProperty )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5541:1: ( ruleTableProperty )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5542:1: ruleTableProperty
            {
             before(grammarAccess.getSPTableAccess().getPropertiesTablePropertyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleTableProperty_in_rule__SPTable__PropertiesAssignment_911240);
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


    // $ANTLR start "rule__TableElement__CreatableAssignment_0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5551:1: rule__TableElement__CreatableAssignment_0 : ( ( 'creatable' ) ) ;
    public final void rule__TableElement__CreatableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5555:1: ( ( ( 'creatable' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5556:1: ( ( 'creatable' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5556:1: ( ( 'creatable' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5557:1: ( 'creatable' )
            {
             before(grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_0_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5558:1: ( 'creatable' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5559:1: 'creatable'
            {
             before(grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_0_0()); 
            match(input,70,FOLLOW_70_in_rule__TableElement__CreatableAssignment_011276); 
             after(grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_0_0()); 

            }

             after(grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_0_0()); 

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
    // $ANTLR end "rule__TableElement__CreatableAssignment_0"


    // $ANTLR start "rule__TableElement__RecursiveAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5574:1: rule__TableElement__RecursiveAssignment_1 : ( ( 'recursive' ) ) ;
    public final void rule__TableElement__RecursiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5578:1: ( ( ( 'recursive' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5579:1: ( ( 'recursive' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5579:1: ( ( 'recursive' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5580:1: ( 'recursive' )
            {
             before(grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_1_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5581:1: ( 'recursive' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5582:1: 'recursive'
            {
             before(grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_1_0()); 
            match(input,71,FOLLOW_71_in_rule__TableElement__RecursiveAssignment_111320); 
             after(grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_1_0()); 

            }

             after(grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_1_0()); 

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
    // $ANTLR end "rule__TableElement__RecursiveAssignment_1"


    // $ANTLR start "rule__TableElement__EClassAssignment_3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5597:1: rule__TableElement__EClassAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TableElement__EClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5601:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5602:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5602:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5603:1: RULE_STRING
            {
             before(grammarAccess.getTableElementAccess().getEClassSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableElement__EClassAssignment_311359); 
             after(grammarAccess.getTableElementAccess().getEClassSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__TableElement__EClassAssignment_3"


    // $ANTLR start "rule__TableElement__ExpressionAssignment_5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5612:1: rule__TableElement__ExpressionAssignment_5 : ( ruleSPExpression ) ;
    public final void rule__TableElement__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5616:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5617:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5617:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5618:1: ruleSPExpression
            {
             before(grammarAccess.getTableElementAccess().getExpressionSPExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__TableElement__ExpressionAssignment_511390);
            ruleSPExpression();

            state._fsp--;

             after(grammarAccess.getTableElementAccess().getExpressionSPExpressionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__TableElement__ExpressionAssignment_5"


    // $ANTLR start "rule__TableElement__SubElementsAssignment_6_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5627:1: rule__TableElement__SubElementsAssignment_6_1 : ( ruleTableElement ) ;
    public final void rule__TableElement__SubElementsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5631:1: ( ( ruleTableElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5632:1: ( ruleTableElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5632:1: ( ruleTableElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5633:1: ruleTableElement
            {
             before(grammarAccess.getTableElementAccess().getSubElementsTableElementParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleTableElement_in_rule__TableElement__SubElementsAssignment_6_111421);
            ruleTableElement();

            state._fsp--;

             after(grammarAccess.getTableElementAccess().getSubElementsTableElementParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__TableElement__SubElementsAssignment_6_1"


    // $ANTLR start "rule__TableProperty__FeatureAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5642:1: rule__TableProperty__FeatureAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TableProperty__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5646:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5647:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5647:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5648:1: RULE_STRING
            {
             before(grammarAccess.getTablePropertyAccess().getFeatureSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableProperty__FeatureAssignment_111452); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5657:1: rule__TableProperty__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TableProperty__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5661:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5662:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5662:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5663:1: RULE_STRING
            {
             before(grammarAccess.getTablePropertyAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableProperty__LabelAssignment_2_111483); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5672:1: rule__TableProperty__ExpressionAssignment_3_1 : ( ruleSPExpression ) ;
    public final void rule__TableProperty__ExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5676:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5677:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5677:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5678:1: ruleSPExpression
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionSPExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__TableProperty__ExpressionAssignment_3_111514);
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


    // $ANTLR start "rule__SPDiagram__NameAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5687:1: rule__SPDiagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5691:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5692:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5692:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5693:1: RULE_ID
            {
             before(grammarAccess.getSPDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPDiagram__NameAssignment_111545); 
             after(grammarAccess.getSPDiagramAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SPDiagram__NameAssignment_1"


    // $ANTLR start "rule__SPDiagram__LabelAssignment_3_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5702:1: rule__SPDiagram__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPDiagram__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5706:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5707:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5707:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5708:1: RULE_STRING
            {
             before(grammarAccess.getSPDiagramAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPDiagram__LabelAssignment_3_111576); 
             after(grammarAccess.getSPDiagramAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__SPDiagram__LabelAssignment_3_1"


    // $ANTLR start "rule__SPDiagram__TitleAssignment_4_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5717:1: rule__SPDiagram__TitleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SPDiagram__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5721:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5722:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5722:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5723:1: RULE_STRING
            {
             before(grammarAccess.getSPDiagramAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPDiagram__TitleAssignment_4_111607); 
             after(grammarAccess.getSPDiagramAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SPDiagram__TitleAssignment_4_1"


    // $ANTLR start "rule__SPDiagram__MetamodelsAssignment_5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5732:1: rule__SPDiagram__MetamodelsAssignment_5 : ( ruleMetamodelRef ) ;
    public final void rule__SPDiagram__MetamodelsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5736:1: ( ( ruleMetamodelRef ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5737:1: ( ruleMetamodelRef )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5737:1: ( ruleMetamodelRef )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5738:1: ruleMetamodelRef
            {
             before(grammarAccess.getSPDiagramAccess().getMetamodelsMetamodelRefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMetamodelRef_in_rule__SPDiagram__MetamodelsAssignment_511638);
            ruleMetamodelRef();

            state._fsp--;

             after(grammarAccess.getSPDiagramAccess().getMetamodelsMetamodelRefParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__SPDiagram__MetamodelsAssignment_5"


    // $ANTLR start "rule__SPDiagram__RootAssignment_7"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5747:1: rule__SPDiagram__RootAssignment_7 : ( RULE_STRING ) ;
    public final void rule__SPDiagram__RootAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5751:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5752:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5752:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5753:1: RULE_STRING
            {
             before(grammarAccess.getSPDiagramAccess().getRootSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPDiagram__RootAssignment_711669); 
             after(grammarAccess.getSPDiagramAccess().getRootSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__SPDiagram__RootAssignment_7"


    // $ANTLR start "rule__SPDiagram__ElementsAssignment_8"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5762:1: rule__SPDiagram__ElementsAssignment_8 : ( ruleDiagramElement ) ;
    public final void rule__SPDiagram__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5766:1: ( ( ruleDiagramElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5767:1: ( ruleDiagramElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5767:1: ( ruleDiagramElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5768:1: ruleDiagramElement
            {
             before(grammarAccess.getSPDiagramAccess().getElementsDiagramElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleDiagramElement_in_rule__SPDiagram__ElementsAssignment_811700);
            ruleDiagramElement();

            state._fsp--;

             after(grammarAccess.getSPDiagramAccess().getElementsDiagramElementParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__SPDiagram__ElementsAssignment_8"


    // $ANTLR start "rule__Container__CreatableAssignment_0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5777:1: rule__Container__CreatableAssignment_0 : ( ( 'creatable' ) ) ;
    public final void rule__Container__CreatableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5781:1: ( ( ( 'creatable' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5782:1: ( ( 'creatable' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5782:1: ( ( 'creatable' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5783:1: ( 'creatable' )
            {
             before(grammarAccess.getContainerAccess().getCreatableCreatableKeyword_0_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5784:1: ( 'creatable' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5785:1: 'creatable'
            {
             before(grammarAccess.getContainerAccess().getCreatableCreatableKeyword_0_0()); 
            match(input,70,FOLLOW_70_in_rule__Container__CreatableAssignment_011736); 
             after(grammarAccess.getContainerAccess().getCreatableCreatableKeyword_0_0()); 

            }

             after(grammarAccess.getContainerAccess().getCreatableCreatableKeyword_0_0()); 

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
    // $ANTLR end "rule__Container__CreatableAssignment_0"


    // $ANTLR start "rule__Container__RecursiveAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5800:1: rule__Container__RecursiveAssignment_1 : ( ( 'recursive' ) ) ;
    public final void rule__Container__RecursiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5804:1: ( ( ( 'recursive' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5805:1: ( ( 'recursive' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5805:1: ( ( 'recursive' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5806:1: ( 'recursive' )
            {
             before(grammarAccess.getContainerAccess().getRecursiveRecursiveKeyword_1_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5807:1: ( 'recursive' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5808:1: 'recursive'
            {
             before(grammarAccess.getContainerAccess().getRecursiveRecursiveKeyword_1_0()); 
            match(input,71,FOLLOW_71_in_rule__Container__RecursiveAssignment_111780); 
             after(grammarAccess.getContainerAccess().getRecursiveRecursiveKeyword_1_0()); 

            }

             after(grammarAccess.getContainerAccess().getRecursiveRecursiveKeyword_1_0()); 

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
    // $ANTLR end "rule__Container__RecursiveAssignment_1"


    // $ANTLR start "rule__Container__ContainerTypeAssignment_2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5823:1: rule__Container__ContainerTypeAssignment_2 : ( ruleContainerType ) ;
    public final void rule__Container__ContainerTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5827:1: ( ( ruleContainerType ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5828:1: ( ruleContainerType )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5828:1: ( ruleContainerType )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5829:1: ruleContainerType
            {
             before(grammarAccess.getContainerAccess().getContainerTypeContainerTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleContainerType_in_rule__Container__ContainerTypeAssignment_211819);
            ruleContainerType();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getContainerTypeContainerTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Container__ContainerTypeAssignment_2"


    // $ANTLR start "rule__Container__NameAssignment_4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5838:1: rule__Container__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5842:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5843:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5843:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5844:1: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Container__NameAssignment_411850); 
             after(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Container__NameAssignment_4"


    // $ANTLR start "rule__Container__EClassAssignment_6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5853:1: rule__Container__EClassAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Container__EClassAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5857:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5858:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5858:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5859:1: RULE_STRING
            {
             before(grammarAccess.getContainerAccess().getEClassSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Container__EClassAssignment_611881); 
             after(grammarAccess.getContainerAccess().getEClassSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Container__EClassAssignment_6"


    // $ANTLR start "rule__Container__ExpressionAssignment_8"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5868:1: rule__Container__ExpressionAssignment_8 : ( ruleSPExpression ) ;
    public final void rule__Container__ExpressionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5872:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5873:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5873:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5874:1: ruleSPExpression
            {
             before(grammarAccess.getContainerAccess().getExpressionSPExpressionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__Container__ExpressionAssignment_811912);
            ruleSPExpression();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getExpressionSPExpressionParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Container__ExpressionAssignment_8"


    // $ANTLR start "rule__Container__StyleAssignment_9"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5883:1: rule__Container__StyleAssignment_9 : ( ruleContainerStyleDefinition ) ;
    public final void rule__Container__StyleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5887:1: ( ( ruleContainerStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5888:1: ( ruleContainerStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5888:1: ( ruleContainerStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5889:1: ruleContainerStyleDefinition
            {
             before(grammarAccess.getContainerAccess().getStyleContainerStyleDefinitionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleContainerStyleDefinition_in_rule__Container__StyleAssignment_911943);
            ruleContainerStyleDefinition();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getStyleContainerStyleDefinitionParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Container__StyleAssignment_9"


    // $ANTLR start "rule__Container__ElementsAssignment_10_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5898:1: rule__Container__ElementsAssignment_10_1 : ( ruleDiagramElement ) ;
    public final void rule__Container__ElementsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5902:1: ( ( ruleDiagramElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5903:1: ( ruleDiagramElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5903:1: ( ruleDiagramElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5904:1: ruleDiagramElement
            {
             before(grammarAccess.getContainerAccess().getElementsDiagramElementParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleDiagramElement_in_rule__Container__ElementsAssignment_10_111974);
            ruleDiagramElement();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getElementsDiagramElementParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Container__ElementsAssignment_10_1"


    // $ANTLR start "rule__ContainerStyleDefinition__ColorAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5913:1: rule__ContainerStyleDefinition__ColorAssignment_1 : ( ruleContainerColorDefinition ) ;
    public final void rule__ContainerStyleDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5917:1: ( ( ruleContainerColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5918:1: ( ruleContainerColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5918:1: ( ruleContainerColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5919:1: ruleContainerColorDefinition
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getColorContainerColorDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_rule__ContainerStyleDefinition__ColorAssignment_112005);
            ruleContainerColorDefinition();

            state._fsp--;

             after(grammarAccess.getContainerStyleDefinitionAccess().getColorContainerColorDefinitionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__ColorAssignment_1"


    // $ANTLR start "rule__ContainerStyleDefinition__LabelAssignment_2_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5928:1: rule__ContainerStyleDefinition__LabelAssignment_2_1 : ( ruleLabelStyleDefinition ) ;
    public final void rule__ContainerStyleDefinition__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5932:1: ( ( ruleLabelStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5933:1: ( ruleLabelStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5933:1: ( ruleLabelStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5934:1: ruleLabelStyleDefinition
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleLabelStyleDefinition_in_rule__ContainerStyleDefinition__LabelAssignment_2_112036);
            ruleLabelStyleDefinition();

            state._fsp--;

             after(grammarAccess.getContainerStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__LabelAssignment_2_1"


    // $ANTLR start "rule__ContainerStyleDefinition__BorderAssignment_3_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5943:1: rule__ContainerStyleDefinition__BorderAssignment_3_1 : ( ruleBorderStyleDefinition ) ;
    public final void rule__ContainerStyleDefinition__BorderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5947:1: ( ( ruleBorderStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5948:1: ( ruleBorderStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5948:1: ( ruleBorderStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5949:1: ruleBorderStyleDefinition
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleBorderStyleDefinition_in_rule__ContainerStyleDefinition__BorderAssignment_3_112067);
            ruleBorderStyleDefinition();

            state._fsp--;

             after(grammarAccess.getContainerStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ContainerStyleDefinition__BorderAssignment_3_1"


    // $ANTLR start "rule__Node__CreatableAssignment_0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5958:1: rule__Node__CreatableAssignment_0 : ( ( 'creatable' ) ) ;
    public final void rule__Node__CreatableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5962:1: ( ( ( 'creatable' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5963:1: ( ( 'creatable' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5963:1: ( ( 'creatable' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5964:1: ( 'creatable' )
            {
             before(grammarAccess.getNodeAccess().getCreatableCreatableKeyword_0_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5965:1: ( 'creatable' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5966:1: 'creatable'
            {
             before(grammarAccess.getNodeAccess().getCreatableCreatableKeyword_0_0()); 
            match(input,70,FOLLOW_70_in_rule__Node__CreatableAssignment_012103); 
             after(grammarAccess.getNodeAccess().getCreatableCreatableKeyword_0_0()); 

            }

             after(grammarAccess.getNodeAccess().getCreatableCreatableKeyword_0_0()); 

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
    // $ANTLR end "rule__Node__CreatableAssignment_0"


    // $ANTLR start "rule__Node__NameAssignment_2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5981:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5985:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5986:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5986:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5987:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_212142); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Node__NameAssignment_2"


    // $ANTLR start "rule__Node__EClassAssignment_4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5996:1: rule__Node__EClassAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Node__EClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6000:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6001:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6001:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6002:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getEClassSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__EClassAssignment_412173); 
             after(grammarAccess.getNodeAccess().getEClassSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Node__EClassAssignment_4"


    // $ANTLR start "rule__Node__ExpressionAssignment_6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6011:1: rule__Node__ExpressionAssignment_6 : ( ruleSPExpression ) ;
    public final void rule__Node__ExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6015:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6016:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6016:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6017:1: ruleSPExpression
            {
             before(grammarAccess.getNodeAccess().getExpressionSPExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__Node__ExpressionAssignment_612204);
            ruleSPExpression();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getExpressionSPExpressionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Node__ExpressionAssignment_6"


    // $ANTLR start "rule__Node__StyleAssignment_7"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6026:1: rule__Node__StyleAssignment_7 : ( ruleNodeStyleDefinition ) ;
    public final void rule__Node__StyleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6030:1: ( ( ruleNodeStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6031:1: ( ruleNodeStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6031:1: ( ruleNodeStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6032:1: ruleNodeStyleDefinition
            {
             before(grammarAccess.getNodeAccess().getStyleNodeStyleDefinitionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleNodeStyleDefinition_in_rule__Node__StyleAssignment_712235);
            ruleNodeStyleDefinition();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getStyleNodeStyleDefinitionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Node__StyleAssignment_7"


    // $ANTLR start "rule__NodeStyleDefinition__ColorAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6041:1: rule__NodeStyleDefinition__ColorAssignment_1 : ( ruleSolidColorDefinition ) ;
    public final void rule__NodeStyleDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6045:1: ( ( ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6046:1: ( ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6046:1: ( ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6047:1: ruleSolidColorDefinition
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__NodeStyleDefinition__ColorAssignment_112266);
            ruleSolidColorDefinition();

            state._fsp--;

             after(grammarAccess.getNodeStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__ColorAssignment_1"


    // $ANTLR start "rule__NodeStyleDefinition__LabelAssignment_2_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6056:1: rule__NodeStyleDefinition__LabelAssignment_2_1 : ( ruleLabelStyleDefinition ) ;
    public final void rule__NodeStyleDefinition__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6060:1: ( ( ruleLabelStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6061:1: ( ruleLabelStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6061:1: ( ruleLabelStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6062:1: ruleLabelStyleDefinition
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleLabelStyleDefinition_in_rule__NodeStyleDefinition__LabelAssignment_2_112297);
            ruleLabelStyleDefinition();

            state._fsp--;

             after(grammarAccess.getNodeStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__LabelAssignment_2_1"


    // $ANTLR start "rule__NodeStyleDefinition__BorderAssignment_3_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6071:1: rule__NodeStyleDefinition__BorderAssignment_3_1 : ( ruleBorderStyleDefinition ) ;
    public final void rule__NodeStyleDefinition__BorderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6075:1: ( ( ruleBorderStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6076:1: ( ruleBorderStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6076:1: ( ruleBorderStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6077:1: ruleBorderStyleDefinition
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleBorderStyleDefinition_in_rule__NodeStyleDefinition__BorderAssignment_3_112328);
            ruleBorderStyleDefinition();

            state._fsp--;

             after(grammarAccess.getNodeStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__NodeStyleDefinition__BorderAssignment_3_1"


    // $ANTLR start "rule__SolidColorDefinition__ColorAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6086:1: rule__SolidColorDefinition__ColorAssignment_1 : ( ruleColor ) ;
    public final void rule__SolidColorDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6090:1: ( ( ruleColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6091:1: ( ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6091:1: ( ruleColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6092:1: ruleColor
            {
             before(grammarAccess.getSolidColorDefinitionAccess().getColorColorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__SolidColorDefinition__ColorAssignment_112359);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getSolidColorDefinitionAccess().getColorColorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SolidColorDefinition__ColorAssignment_1"


    // $ANTLR start "rule__GradientColorDefinition__FromAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6101:1: rule__GradientColorDefinition__FromAssignment_1 : ( ruleColor ) ;
    public final void rule__GradientColorDefinition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6105:1: ( ( ruleColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6106:1: ( ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6106:1: ( ruleColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6107:1: ruleColor
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getFromColorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__GradientColorDefinition__FromAssignment_112390);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getGradientColorDefinitionAccess().getFromColorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__GradientColorDefinition__FromAssignment_1"


    // $ANTLR start "rule__GradientColorDefinition__ToAssignment_3"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6116:1: rule__GradientColorDefinition__ToAssignment_3 : ( ruleColor ) ;
    public final void rule__GradientColorDefinition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6120:1: ( ( ruleColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6121:1: ( ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6121:1: ( ruleColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6122:1: ruleColor
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getToColorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__GradientColorDefinition__ToAssignment_312421);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getGradientColorDefinitionAccess().getToColorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GradientColorDefinition__ToAssignment_3"


    // $ANTLR start "rule__LabelStyleDefinition__ExpressionAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6131:1: rule__LabelStyleDefinition__ExpressionAssignment_1 : ( ruleSPExpression ) ;
    public final void rule__LabelStyleDefinition__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6135:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6136:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6136:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6137:1: ruleSPExpression
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getExpressionSPExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__LabelStyleDefinition__ExpressionAssignment_112452);
            ruleSPExpression();

            state._fsp--;

             after(grammarAccess.getLabelStyleDefinitionAccess().getExpressionSPExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__ExpressionAssignment_1"


    // $ANTLR start "rule__LabelStyleDefinition__ColorAssignment_2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6146:1: rule__LabelStyleDefinition__ColorAssignment_2 : ( ruleSolidColorDefinition ) ;
    public final void rule__LabelStyleDefinition__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6150:1: ( ( ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6151:1: ( ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6151:1: ( ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6152:1: ruleSolidColorDefinition
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__LabelStyleDefinition__ColorAssignment_212483);
            ruleSolidColorDefinition();

            state._fsp--;

             after(grammarAccess.getLabelStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__ColorAssignment_2"


    // $ANTLR start "rule__LabelStyleDefinition__SizeAssignment_3_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6161:1: rule__LabelStyleDefinition__SizeAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__LabelStyleDefinition__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6165:1: ( ( RULE_INT ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6166:1: ( RULE_INT )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6166:1: ( RULE_INT )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6167:1: RULE_INT
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getSizeINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LabelStyleDefinition__SizeAssignment_3_112514); 
             after(grammarAccess.getLabelStyleDefinitionAccess().getSizeINTTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__SizeAssignment_3_1"


    // $ANTLR start "rule__LabelStyleDefinition__BoldAssignment_4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6176:1: rule__LabelStyleDefinition__BoldAssignment_4 : ( ( 'bold' ) ) ;
    public final void rule__LabelStyleDefinition__BoldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6180:1: ( ( ( 'bold' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6181:1: ( ( 'bold' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6181:1: ( ( 'bold' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6182:1: ( 'bold' )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6183:1: ( 'bold' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6184:1: 'bold'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0()); 
            match(input,72,FOLLOW_72_in_rule__LabelStyleDefinition__BoldAssignment_412550); 
             after(grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0()); 

            }

             after(grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__BoldAssignment_4"


    // $ANTLR start "rule__LabelStyleDefinition__ItalicAssignment_5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6199:1: rule__LabelStyleDefinition__ItalicAssignment_5 : ( ( 'italic' ) ) ;
    public final void rule__LabelStyleDefinition__ItalicAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6203:1: ( ( ( 'italic' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6204:1: ( ( 'italic' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6204:1: ( ( 'italic' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6205:1: ( 'italic' )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getItalicItalicKeyword_5_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6206:1: ( 'italic' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6207:1: 'italic'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getItalicItalicKeyword_5_0()); 
            match(input,73,FOLLOW_73_in_rule__LabelStyleDefinition__ItalicAssignment_512594); 
             after(grammarAccess.getLabelStyleDefinitionAccess().getItalicItalicKeyword_5_0()); 

            }

             after(grammarAccess.getLabelStyleDefinitionAccess().getItalicItalicKeyword_5_0()); 

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
    // $ANTLR end "rule__LabelStyleDefinition__ItalicAssignment_5"


    // $ANTLR start "rule__BorderStyleDefinition__ColorAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6222:1: rule__BorderStyleDefinition__ColorAssignment_1 : ( ruleSolidColorDefinition ) ;
    public final void rule__BorderStyleDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6226:1: ( ( ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6227:1: ( ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6227:1: ( ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6228:1: ruleSolidColorDefinition
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__BorderStyleDefinition__ColorAssignment_112633);
            ruleSolidColorDefinition();

            state._fsp--;

             after(grammarAccess.getBorderStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BorderStyleDefinition__ColorAssignment_1"


    // $ANTLR start "rule__BorderStyleDefinition__SizeAssignment_2_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6237:1: rule__BorderStyleDefinition__SizeAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__BorderStyleDefinition__SizeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6241:1: ( ( RULE_INT ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6242:1: ( RULE_INT )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6242:1: ( RULE_INT )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6243:1: RULE_INT
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getSizeINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__BorderStyleDefinition__SizeAssignment_2_112664); 
             after(grammarAccess.getBorderStyleDefinitionAccess().getSizeINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__BorderStyleDefinition__SizeAssignment_2_1"


    // $ANTLR start "rule__AcceleoExpression__ValueAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6252:1: rule__AcceleoExpression__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AcceleoExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6256:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6257:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6257:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6258:1: RULE_STRING
            {
             before(grammarAccess.getAcceleoExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AcceleoExpression__ValueAssignment_112695); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6267:1: rule__VarRef__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VarRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6271:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6272:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6272:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6273:1: RULE_STRING
            {
             before(grammarAccess.getVarRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VarRef__ValueAssignment_112726); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6282:1: rule__FeatureRef__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FeatureRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6286:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6287:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6287:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6288:1: RULE_STRING
            {
             before(grammarAccess.getFeatureRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureRef__ValueAssignment_112757); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6297:1: rule__MetamodelRef__MetamodelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MetamodelRef__MetamodelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6301:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6302:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6302:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6303:1: RULE_STRING
            {
             before(grammarAccess.getMetamodelRefAccess().getMetamodelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetamodelRef__MetamodelAssignment_112788); 
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


    // $ANTLR start "rule__PreDefinedColorDefinition__ColorAssignment"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6312:1: rule__PreDefinedColorDefinition__ColorAssignment : ( rulePreDefinedColor ) ;
    public final void rule__PreDefinedColorDefinition__ColorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6316:1: ( ( rulePreDefinedColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6317:1: ( rulePreDefinedColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6317:1: ( rulePreDefinedColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6318:1: rulePreDefinedColor
            {
             before(grammarAccess.getPreDefinedColorDefinitionAccess().getColorPreDefinedColorEnumRuleCall_0()); 
            pushFollow(FOLLOW_rulePreDefinedColor_in_rule__PreDefinedColorDefinition__ColorAssignment12819);
            rulePreDefinedColor();

            state._fsp--;

             after(grammarAccess.getPreDefinedColorDefinitionAccess().getColorPreDefinedColorEnumRuleCall_0()); 

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
    // $ANTLR end "rule__PreDefinedColorDefinition__ColorAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSPrototyper_in_entryRuleSPrototyper61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPrototyper68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__0_in_ruleSPrototyper94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPViewpoint_in_entryRuleSPViewpoint121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPViewpoint128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__0_in_ruleSPViewpoint154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPRepresentation_in_entryRuleSPRepresentation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPRepresentation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPRepresentation__Alternatives_in_ruleSPRepresentation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPTable_in_entryRuleSPTable241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPTable248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__0_in_ruleSPTable274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_entryRuleTableElement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableElement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__0_in_ruleTableElement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableProperty_in_entryRuleTableProperty361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableProperty368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__0_in_ruleTableProperty394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPDiagram_in_entryRuleSPDiagram421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPDiagram428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__0_in_ruleSPDiagram454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_entryRuleDiagramElement481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramElement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DiagramElement__Alternatives_in_ruleDiagramElement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__0_in_ruleContainer574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerStyleDefinition_in_entryRuleContainerStyleDefinition601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerStyleDefinition608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__0_in_ruleContainerStyleDefinition634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerType_in_entryRuleContainerType661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerType__Alternatives_in_ruleContainerType694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_entryRuleContainerColorDefinition721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerColorDefinition728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerColorDefinition__Alternatives_in_ruleContainerColorDefinition754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeStyleDefinition_in_entryRuleNodeStyleDefinition841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeStyleDefinition848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__0_in_ruleNodeStyleDefinition874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_entryRuleSolidColorDefinition901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolidColorDefinition908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__Group__0_in_ruleSolidColorDefinition934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_entryRuleGradientColorDefinition961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGradientColorDefinition968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__0_in_ruleGradientColorDefinition994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_entryRuleLabelStyleDefinition1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelStyleDefinition1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__0_in_ruleLabelStyleDefinition1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_entryRuleBorderStyleDefinition1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderStyleDefinition1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__0_in_ruleBorderStyleDefinition1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_entryRuleSPExpression1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPExpression1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPExpression__Alternatives_in_ruleSPExpression1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcceleoExpression1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__0_in_ruleAcceleoExpression1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__Group__0_in_ruleVarRef1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRef1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__0_in_ruleFeatureRef1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_entryRuleMetamodelRef1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelRef1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelRef__Group__0_in_ruleMetamodelRef1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColorDefinition_in_ruleColor1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColorDefinition_in_entryRulePreDefinedColorDefinition1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreDefinedColorDefinition1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreDefinedColorDefinition__ColorAssignment_in_rulePreDefinedColorDefinition1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreDefinedColor__Alternatives_in_rulePreDefinedColor1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPTable_in_rule__SPRepresentation__Alternatives1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPDiagram_in_rule__SPRepresentation__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_rule__DiagramElement__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__DiagramElement__Alternatives1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ContainerType__Alternatives1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ContainerType__Alternatives1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__ContainerColorDefinition__Alternatives1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_rule__ContainerColorDefinition__Alternatives1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_rule__SPExpression__Alternatives1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_rule__SPExpression__Alternatives1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_rule__SPExpression__Alternatives1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PreDefinedColor__Alternatives1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PreDefinedColor__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PreDefinedColor__Alternatives1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PreDefinedColor__Alternatives1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PreDefinedColor__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PreDefinedColor__Alternatives1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PreDefinedColor__Alternatives2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PreDefinedColor__Alternatives2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PreDefinedColor__Alternatives2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PreDefinedColor__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PreDefinedColor__Alternatives2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PreDefinedColor__Alternatives2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PreDefinedColor__Alternatives2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PreDefinedColor__Alternatives2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PreDefinedColor__Alternatives2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PreDefinedColor__Alternatives2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PreDefinedColor__Alternatives2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PreDefinedColor__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PreDefinedColor__Alternatives2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PreDefinedColor__Alternatives2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PreDefinedColor__Alternatives2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PreDefinedColor__Alternatives2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PreDefinedColor__Alternatives2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PreDefinedColor__Alternatives2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__PreDefinedColor__Alternatives2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__PreDefinedColor__Alternatives2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__0__Impl_in_rule__SPrototyper__Group__02432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__1_in_rule__SPrototyper__Group__02435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SPrototyper__Group__0__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__1__Impl_in_rule__SPrototyper__Group__12494 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__2_in_rule__SPrototyper__Group__12497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__NameAssignment_1_in_rule__SPrototyper__Group__1__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__2__Impl_in_rule__SPrototyper__Group__22554 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__3_in_rule__SPrototyper__Group__22557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPrototyper__Group__2__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__3__Impl_in_rule__SPrototyper__Group__32616 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__4_in_rule__SPrototyper__Group__32619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__0_in_rule__SPrototyper__Group__3__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__4__Impl_in_rule__SPrototyper__Group__42677 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__5_in_rule__SPrototyper__Group__42680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__ViewpointsAssignment_4_in_rule__SPrototyper__Group__4__Impl2707 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__5__Impl_in_rule__SPrototyper__Group__52738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SPrototyper__Group__5__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__0__Impl_in_rule__SPrototyper__Group_3__02809 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__1_in_rule__SPrototyper__Group_3__02812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SPrototyper__Group_3__0__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__1__Impl_in_rule__SPrototyper__Group_3__12871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__QualifierAssignment_3_1_in_rule__SPrototyper__Group_3__1__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__0__Impl_in_rule__SPViewpoint__Group__02932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__1_in_rule__SPViewpoint__Group__02935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SPViewpoint__Group__0__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__1__Impl_in_rule__SPViewpoint__Group__12994 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__2_in_rule__SPViewpoint__Group__12997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__NameAssignment_1_in_rule__SPViewpoint__Group__1__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__2__Impl_in_rule__SPViewpoint__Group__23054 = new BitSet(new long[]{0x0040720000000000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__3_in_rule__SPViewpoint__Group__23057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPViewpoint__Group__2__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__3__Impl_in_rule__SPViewpoint__Group__33116 = new BitSet(new long[]{0x0040720000000000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__4_in_rule__SPViewpoint__Group__33119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__0_in_rule__SPViewpoint__Group__3__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__4__Impl_in_rule__SPViewpoint__Group__43177 = new BitSet(new long[]{0x0040720000000000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__5_in_rule__SPViewpoint__Group__43180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__0_in_rule__SPViewpoint__Group__4__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__5__Impl_in_rule__SPViewpoint__Group__53238 = new BitSet(new long[]{0x0040720000000000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__6_in_rule__SPViewpoint__Group__53241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__RepresentationsAssignment_5_in_rule__SPViewpoint__Group__5__Impl3268 = new BitSet(new long[]{0x0040400000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__6__Impl_in_rule__SPViewpoint__Group__63299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SPViewpoint__Group__6__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__0__Impl_in_rule__SPViewpoint__Group_3__03372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__1_in_rule__SPViewpoint__Group_3__03375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SPViewpoint__Group_3__0__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__1__Impl_in_rule__SPViewpoint__Group_3__13434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__ShortcutAssignment_3_1_in_rule__SPViewpoint__Group_3__1__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__0__Impl_in_rule__SPViewpoint__Group_4__03495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__1_in_rule__SPViewpoint__Group_4__03498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SPViewpoint__Group_4__0__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__1__Impl_in_rule__SPViewpoint__Group_4__13557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__ExtensionAssignment_4_1_in_rule__SPViewpoint__Group_4__1__Impl3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__0__Impl_in_rule__SPTable__Group__03618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPTable__Group__1_in_rule__SPTable__Group__03621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SPTable__Group__0__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__1__Impl_in_rule__SPTable__Group__13680 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__2_in_rule__SPTable__Group__13683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__NameAssignment_1_in_rule__SPTable__Group__1__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__2__Impl_in_rule__SPTable__Group__23740 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group__3_in_rule__SPTable__Group__23743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPTable__Group__2__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__3__Impl_in_rule__SPTable__Group__33802 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group__4_in_rule__SPTable__Group__33805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__0_in_rule__SPTable__Group__3__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__4__Impl_in_rule__SPTable__Group__43863 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group__5_in_rule__SPTable__Group__43866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__0_in_rule__SPTable__Group__4__Impl3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__5__Impl_in_rule__SPTable__Group__53924 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__6_in_rule__SPTable__Group__53927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__MetamodelsAssignment_5_in_rule__SPTable__Group__5__Impl3956 = new BitSet(new long[]{0x0003000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__MetamodelsAssignment_5_in_rule__SPTable__Group__5__Impl3968 = new BitSet(new long[]{0x0003000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group__6__Impl_in_rule__SPTable__Group__64001 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group__7_in_rule__SPTable__Group__64004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__SPTable__Group__6__Impl4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__7__Impl_in_rule__SPTable__Group__74063 = new BitSet(new long[]{0x0004000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPTable__Group__8_in_rule__SPTable__Group__74066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__RootAssignment_7_in_rule__SPTable__Group__7__Impl4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__8__Impl_in_rule__SPTable__Group__84123 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__9_in_rule__SPTable__Group__84126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4155 = new BitSet(new long[]{0x0004000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4167 = new BitSet(new long[]{0x0004000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPTable__Group__9__Impl_in_rule__SPTable__Group__94200 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__10_in_rule__SPTable__Group__94203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4232 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4244 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__10__Impl_in_rule__SPTable__Group__104277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SPTable__Group__10__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__0__Impl_in_rule__SPTable__Group_3__04358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__1_in_rule__SPTable__Group_3__04361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SPTable__Group_3__0__Impl4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__1__Impl_in_rule__SPTable__Group_3__14420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__LabelAssignment_3_1_in_rule__SPTable__Group_3__1__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__0__Impl_in_rule__SPTable__Group_4__04481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__1_in_rule__SPTable__Group_4__04484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SPTable__Group_4__0__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__1__Impl_in_rule__SPTable__Group_4__14543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__TitleAssignment_4_1_in_rule__SPTable__Group_4__1__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__0__Impl_in_rule__TableElement__Group__04604 = new BitSet(new long[]{0x0004000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__TableElement__Group__1_in_rule__TableElement__Group__04607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__CreatableAssignment_0_in_rule__TableElement__Group__0__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__1__Impl_in_rule__TableElement__Group__14665 = new BitSet(new long[]{0x0004000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__TableElement__Group__2_in_rule__TableElement__Group__14668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__RecursiveAssignment_1_in_rule__TableElement__Group__1__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__2__Impl_in_rule__TableElement__Group__24726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TableElement__Group__3_in_rule__TableElement__Group__24729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TableElement__Group__2__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__3__Impl_in_rule__TableElement__Group__34788 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__TableElement__Group__4_in_rule__TableElement__Group__34791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__EClassAssignment_3_in_rule__TableElement__Group__3__Impl4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__4__Impl_in_rule__TableElement__Group__44848 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__TableElement__Group__5_in_rule__TableElement__Group__44851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__TableElement__Group__4__Impl4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__5__Impl_in_rule__TableElement__Group__54910 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TableElement__Group__6_in_rule__TableElement__Group__54913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__ExpressionAssignment_5_in_rule__TableElement__Group__5__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__6__Impl_in_rule__TableElement__Group__64970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__0_in_rule__TableElement__Group__6__Impl4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__0__Impl_in_rule__TableElement__Group_6__05042 = new BitSet(new long[]{0x0004000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__1_in_rule__TableElement__Group_6__05045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TableElement__Group_6__0__Impl5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__1__Impl_in_rule__TableElement__Group_6__15104 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__2_in_rule__TableElement__Group_6__15107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5136 = new BitSet(new long[]{0x0004000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5148 = new BitSet(new long[]{0x0004000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__2__Impl_in_rule__TableElement__Group_6__25181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__TableElement__Group_6__2__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__0__Impl_in_rule__TableProperty__Group__05246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__1_in_rule__TableProperty__Group__05249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__TableProperty__Group__0__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__1__Impl_in_rule__TableProperty__Group__15308 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__2_in_rule__TableProperty__Group__15311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__FeatureAssignment_1_in_rule__TableProperty__Group__1__Impl5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__2__Impl_in_rule__TableProperty__Group__25368 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__3_in_rule__TableProperty__Group__25371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__0_in_rule__TableProperty__Group__2__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__3__Impl_in_rule__TableProperty__Group__35429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__0_in_rule__TableProperty__Group__3__Impl5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__0__Impl_in_rule__TableProperty__Group_2__05495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__1_in_rule__TableProperty__Group_2__05498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TableProperty__Group_2__0__Impl5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__1__Impl_in_rule__TableProperty__Group_2__15557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__LabelAssignment_2_1_in_rule__TableProperty__Group_2__1__Impl5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__0__Impl_in_rule__TableProperty__Group_3__05618 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__1_in_rule__TableProperty__Group_3__05621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__TableProperty__Group_3__0__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__1__Impl_in_rule__TableProperty__Group_3__15680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__ExpressionAssignment_3_1_in_rule__TableProperty__Group_3__1__Impl5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__0__Impl_in_rule__SPDiagram__Group__05741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__1_in_rule__SPDiagram__Group__05744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__SPDiagram__Group__0__Impl5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__1__Impl_in_rule__SPDiagram__Group__15803 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__2_in_rule__SPDiagram__Group__15806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__NameAssignment_1_in_rule__SPDiagram__Group__1__Impl5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__2__Impl_in_rule__SPDiagram__Group__25863 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__3_in_rule__SPDiagram__Group__25866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPDiagram__Group__2__Impl5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__3__Impl_in_rule__SPDiagram__Group__35925 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__4_in_rule__SPDiagram__Group__35928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__0_in_rule__SPDiagram__Group__3__Impl5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__4__Impl_in_rule__SPDiagram__Group__45986 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__5_in_rule__SPDiagram__Group__45989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__0_in_rule__SPDiagram__Group__4__Impl6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__5__Impl_in_rule__SPDiagram__Group__56047 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__6_in_rule__SPDiagram__Group__56050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6079 = new BitSet(new long[]{0x0003000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6091 = new BitSet(new long[]{0x0003000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__6__Impl_in_rule__SPDiagram__Group__66124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__7_in_rule__SPDiagram__Group__66127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__SPDiagram__Group__6__Impl6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__7__Impl_in_rule__SPDiagram__Group__76186 = new BitSet(new long[]{0x1080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__8_in_rule__SPDiagram__Group__76189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__RootAssignment_7_in_rule__SPDiagram__Group__7__Impl6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__8__Impl_in_rule__SPDiagram__Group__86246 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__9_in_rule__SPDiagram__Group__86249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl6278 = new BitSet(new long[]{0x1080000000001802L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl6290 = new BitSet(new long[]{0x1080000000001802L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__9__Impl_in_rule__SPDiagram__Group__96323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SPDiagram__Group__9__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__0__Impl_in_rule__SPDiagram__Group_3__06402 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__1_in_rule__SPDiagram__Group_3__06405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SPDiagram__Group_3__0__Impl6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__1__Impl_in_rule__SPDiagram__Group_3__16464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__LabelAssignment_3_1_in_rule__SPDiagram__Group_3__1__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__0__Impl_in_rule__SPDiagram__Group_4__06525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__1_in_rule__SPDiagram__Group_4__06528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SPDiagram__Group_4__0__Impl6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__1__Impl_in_rule__SPDiagram__Group_4__16587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__TitleAssignment_4_1_in_rule__SPDiagram__Group_4__1__Impl6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__06648 = new BitSet(new long[]{0x0080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__Group__1_in_rule__Container__Group__06651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__CreatableAssignment_0_in_rule__Container__Group__0__Impl6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__16709 = new BitSet(new long[]{0x0080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__Group__2_in_rule__Container__Group__16712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__RecursiveAssignment_1_in_rule__Container__Group__1__Impl6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__26770 = new BitSet(new long[]{0x0080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__Group__3_in_rule__Container__Group__26773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__ContainerTypeAssignment_2_in_rule__Container__Group__2__Impl6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__36831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Container__Group__4_in_rule__Container__Group__36834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Container__Group__3__Impl6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__4__Impl_in_rule__Container__Group__46893 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__5_in_rule__Container__Group__46896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__NameAssignment_4_in_rule__Container__Group__4__Impl6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__5__Impl_in_rule__Container__Group__56953 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Container__Group__6_in_rule__Container__Group__56956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Container__Group__5__Impl6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__6__Impl_in_rule__Container__Group__67015 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__7_in_rule__Container__Group__67018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__EClassAssignment_6_in_rule__Container__Group__6__Impl7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__7__Impl_in_rule__Container__Group__77075 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__Container__Group__8_in_rule__Container__Group__77078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Container__Group__7__Impl7106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__8__Impl_in_rule__Container__Group__87137 = new BitSet(new long[]{0x0200010000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__9_in_rule__Container__Group__87140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__ExpressionAssignment_8_in_rule__Container__Group__8__Impl7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__9__Impl_in_rule__Container__Group__97197 = new BitSet(new long[]{0x0200010000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__10_in_rule__Container__Group__97200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__StyleAssignment_9_in_rule__Container__Group__9__Impl7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__10__Impl_in_rule__Container__Group__107258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group_10__0_in_rule__Container__Group__10__Impl7285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group_10__0__Impl_in_rule__Container__Group_10__07338 = new BitSet(new long[]{0x1080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__Group_10__1_in_rule__Container__Group_10__07341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Container__Group_10__0__Impl7369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group_10__1__Impl_in_rule__Container__Group_10__17400 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Container__Group_10__2_in_rule__Container__Group_10__17403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl7432 = new BitSet(new long[]{0x1080000000001802L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl7444 = new BitSet(new long[]{0x1080000000001802L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__Group_10__2__Impl_in_rule__Container__Group_10__27477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Container__Group_10__2__Impl7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__0__Impl_in_rule__ContainerStyleDefinition__Group__07542 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__1_in_rule__ContainerStyleDefinition__Group__07545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ContainerStyleDefinition__Group__0__Impl7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__1__Impl_in_rule__ContainerStyleDefinition__Group__17604 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__2_in_rule__ContainerStyleDefinition__Group__17607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__ColorAssignment_1_in_rule__ContainerStyleDefinition__Group__1__Impl7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__2__Impl_in_rule__ContainerStyleDefinition__Group__27664 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__3_in_rule__ContainerStyleDefinition__Group__27667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__0_in_rule__ContainerStyleDefinition__Group__2__Impl7694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__3__Impl_in_rule__ContainerStyleDefinition__Group__37725 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__4_in_rule__ContainerStyleDefinition__Group__37728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__0_in_rule__ContainerStyleDefinition__Group__3__Impl7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__4__Impl_in_rule__ContainerStyleDefinition__Group__47786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__ContainerStyleDefinition__Group__4__Impl7814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__0__Impl_in_rule__ContainerStyleDefinition__Group_2__07855 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__1_in_rule__ContainerStyleDefinition__Group_2__07858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ContainerStyleDefinition__Group_2__0__Impl7886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__1__Impl_in_rule__ContainerStyleDefinition__Group_2__17917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__LabelAssignment_2_1_in_rule__ContainerStyleDefinition__Group_2__1__Impl7944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__0__Impl_in_rule__ContainerStyleDefinition__Group_3__07978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__1_in_rule__ContainerStyleDefinition__Group_3__07981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ContainerStyleDefinition__Group_3__0__Impl8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__1__Impl_in_rule__ContainerStyleDefinition__Group_3__18040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__BorderAssignment_3_1_in_rule__ContainerStyleDefinition__Group_3__1__Impl8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__08101 = new BitSet(new long[]{0x1080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__08104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__CreatableAssignment_0_in_rule__Node__Group__0__Impl8131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__18162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__18165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Node__Group__1__Impl8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__28224 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__28227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl8254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__38284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__4_in_rule__Node__Group__38287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Node__Group__3__Impl8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__48346 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__5_in_rule__Node__Group__48349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__EClassAssignment_4_in_rule__Node__Group__4__Impl8376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__58406 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__Node__Group__6_in_rule__Node__Group__58409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Node__Group__5__Impl8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__68468 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__7_in_rule__Node__Group__68471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ExpressionAssignment_6_in_rule__Node__Group__6__Impl8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__78528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__StyleAssignment_7_in_rule__Node__Group__7__Impl8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__0__Impl_in_rule__NodeStyleDefinition__Group__08602 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__1_in_rule__NodeStyleDefinition__Group__08605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__NodeStyleDefinition__Group__0__Impl8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__1__Impl_in_rule__NodeStyleDefinition__Group__18664 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__2_in_rule__NodeStyleDefinition__Group__18667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__ColorAssignment_1_in_rule__NodeStyleDefinition__Group__1__Impl8694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__2__Impl_in_rule__NodeStyleDefinition__Group__28724 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__3_in_rule__NodeStyleDefinition__Group__28727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__0_in_rule__NodeStyleDefinition__Group__2__Impl8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__3__Impl_in_rule__NodeStyleDefinition__Group__38785 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__4_in_rule__NodeStyleDefinition__Group__38788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__0_in_rule__NodeStyleDefinition__Group__3__Impl8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__4__Impl_in_rule__NodeStyleDefinition__Group__48846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__NodeStyleDefinition__Group__4__Impl8874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__0__Impl_in_rule__NodeStyleDefinition__Group_2__08915 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__1_in_rule__NodeStyleDefinition__Group_2__08918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__NodeStyleDefinition__Group_2__0__Impl8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__1__Impl_in_rule__NodeStyleDefinition__Group_2__18977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__LabelAssignment_2_1_in_rule__NodeStyleDefinition__Group_2__1__Impl9004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__0__Impl_in_rule__NodeStyleDefinition__Group_3__09038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__1_in_rule__NodeStyleDefinition__Group_3__09041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__NodeStyleDefinition__Group_3__0__Impl9069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__1__Impl_in_rule__NodeStyleDefinition__Group_3__19100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__BorderAssignment_3_1_in_rule__NodeStyleDefinition__Group_3__1__Impl9127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__Group__0__Impl_in_rule__SolidColorDefinition__Group__09161 = new BitSet(new long[]{0x0000007FFFFFE000L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__Group__1_in_rule__SolidColorDefinition__Group__09164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__SolidColorDefinition__Group__0__Impl9192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__Group__1__Impl_in_rule__SolidColorDefinition__Group__19223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__ColorAssignment_1_in_rule__SolidColorDefinition__Group__1__Impl9250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__0__Impl_in_rule__GradientColorDefinition__Group__09284 = new BitSet(new long[]{0x0000007FFFFFE000L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__1_in_rule__GradientColorDefinition__Group__09287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__GradientColorDefinition__Group__0__Impl9315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__1__Impl_in_rule__GradientColorDefinition__Group__19346 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__2_in_rule__GradientColorDefinition__Group__19349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__FromAssignment_1_in_rule__GradientColorDefinition__Group__1__Impl9376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__2__Impl_in_rule__GradientColorDefinition__Group__29406 = new BitSet(new long[]{0x0000007FFFFFE000L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__3_in_rule__GradientColorDefinition__Group__29409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__GradientColorDefinition__Group__2__Impl9437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__3__Impl_in_rule__GradientColorDefinition__Group__39468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__ToAssignment_3_in_rule__GradientColorDefinition__Group__3__Impl9495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__0__Impl_in_rule__LabelStyleDefinition__Group__09533 = new BitSet(new long[]{0x2000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__1_in_rule__LabelStyleDefinition__Group__09536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__LabelStyleDefinition__Group__0__Impl9564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__1__Impl_in_rule__LabelStyleDefinition__Group__19595 = new BitSet(new long[]{0x2000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__2_in_rule__LabelStyleDefinition__Group__19598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__ExpressionAssignment_1_in_rule__LabelStyleDefinition__Group__1__Impl9625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__2__Impl_in_rule__LabelStyleDefinition__Group__29656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000301L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__3_in_rule__LabelStyleDefinition__Group__29659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__ColorAssignment_2_in_rule__LabelStyleDefinition__Group__2__Impl9686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__3__Impl_in_rule__LabelStyleDefinition__Group__39716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000301L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__4_in_rule__LabelStyleDefinition__Group__39719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__0_in_rule__LabelStyleDefinition__Group__3__Impl9746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__4__Impl_in_rule__LabelStyleDefinition__Group__49777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000301L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__5_in_rule__LabelStyleDefinition__Group__49780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__BoldAssignment_4_in_rule__LabelStyleDefinition__Group__4__Impl9807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__5__Impl_in_rule__LabelStyleDefinition__Group__59838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__ItalicAssignment_5_in_rule__LabelStyleDefinition__Group__5__Impl9865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__0__Impl_in_rule__LabelStyleDefinition__Group_3__09908 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__1_in_rule__LabelStyleDefinition__Group_3__09911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__LabelStyleDefinition__Group_3__0__Impl9939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__1__Impl_in_rule__LabelStyleDefinition__Group_3__19970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__SizeAssignment_3_1_in_rule__LabelStyleDefinition__Group_3__1__Impl9997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__0__Impl_in_rule__BorderStyleDefinition__Group__010031 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__1_in_rule__BorderStyleDefinition__Group__010034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__BorderStyleDefinition__Group__0__Impl10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__1__Impl_in_rule__BorderStyleDefinition__Group__110093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__2_in_rule__BorderStyleDefinition__Group__110096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__ColorAssignment_1_in_rule__BorderStyleDefinition__Group__1__Impl10123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__2__Impl_in_rule__BorderStyleDefinition__Group__210153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__0_in_rule__BorderStyleDefinition__Group__2__Impl10180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__0__Impl_in_rule__BorderStyleDefinition__Group_2__010217 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__1_in_rule__BorderStyleDefinition__Group_2__010220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__BorderStyleDefinition__Group_2__0__Impl10248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__1__Impl_in_rule__BorderStyleDefinition__Group_2__110279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__SizeAssignment_2_1_in_rule__BorderStyleDefinition__Group_2__1__Impl10306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__0__Impl_in_rule__AcceleoExpression__Group__010340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__1_in_rule__AcceleoExpression__Group__010343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__AcceleoExpression__Group__0__Impl10371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__1__Impl_in_rule__AcceleoExpression__Group__110402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__ValueAssignment_1_in_rule__AcceleoExpression__Group__1__Impl10429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__Group__0__Impl_in_rule__VarRef__Group__010463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VarRef__Group__1_in_rule__VarRef__Group__010466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__VarRef__Group__0__Impl10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__Group__1__Impl_in_rule__VarRef__Group__110525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__ValueAssignment_1_in_rule__VarRef__Group__1__Impl10552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__0__Impl_in_rule__FeatureRef__Group__010586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__1_in_rule__FeatureRef__Group__010589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__FeatureRef__Group__0__Impl10617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__1__Impl_in_rule__FeatureRef__Group__110648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__ValueAssignment_1_in_rule__FeatureRef__Group__1__Impl10675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelRef__Group__0__Impl_in_rule__MetamodelRef__Group__010709 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetamodelRef__Group__1_in_rule__MetamodelRef__Group__010712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__MetamodelRef__Group__0__Impl10740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelRef__Group__1__Impl_in_rule__MetamodelRef__Group__110771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelRef__MetamodelAssignment_1_in_rule__MetamodelRef__Group__1__Impl10798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPrototyper__NameAssignment_110837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPrototyper__QualifierAssignment_3_110868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPViewpoint_in_rule__SPrototyper__ViewpointsAssignment_410899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPViewpoint__NameAssignment_110930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPViewpoint__ShortcutAssignment_3_110961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPViewpoint__ExtensionAssignment_4_110992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPRepresentation_in_rule__SPViewpoint__RepresentationsAssignment_511023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPTable__NameAssignment_111054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPTable__LabelAssignment_3_111085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPTable__TitleAssignment_4_111116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_rule__SPTable__MetamodelsAssignment_511147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPTable__RootAssignment_711178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_rule__SPTable__ElementsAssignment_811209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableProperty_in_rule__SPTable__PropertiesAssignment_911240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__TableElement__CreatableAssignment_011276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__TableElement__RecursiveAssignment_111320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableElement__EClassAssignment_311359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__TableElement__ExpressionAssignment_511390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_rule__TableElement__SubElementsAssignment_6_111421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableProperty__FeatureAssignment_111452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableProperty__LabelAssignment_2_111483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__TableProperty__ExpressionAssignment_3_111514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPDiagram__NameAssignment_111545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPDiagram__LabelAssignment_3_111576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPDiagram__TitleAssignment_4_111607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_rule__SPDiagram__MetamodelsAssignment_511638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPDiagram__RootAssignment_711669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_rule__SPDiagram__ElementsAssignment_811700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Container__CreatableAssignment_011736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__Container__RecursiveAssignment_111780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerType_in_rule__Container__ContainerTypeAssignment_211819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Container__NameAssignment_411850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Container__EClassAssignment_611881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__Container__ExpressionAssignment_811912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerStyleDefinition_in_rule__Container__StyleAssignment_911943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_rule__Container__ElementsAssignment_10_111974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_rule__ContainerStyleDefinition__ColorAssignment_112005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_rule__ContainerStyleDefinition__LabelAssignment_2_112036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_rule__ContainerStyleDefinition__BorderAssignment_3_112067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Node__CreatableAssignment_012103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_212142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__EClassAssignment_412173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__Node__ExpressionAssignment_612204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeStyleDefinition_in_rule__Node__StyleAssignment_712235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__NodeStyleDefinition__ColorAssignment_112266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_rule__NodeStyleDefinition__LabelAssignment_2_112297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_rule__NodeStyleDefinition__BorderAssignment_3_112328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__SolidColorDefinition__ColorAssignment_112359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__GradientColorDefinition__FromAssignment_112390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__GradientColorDefinition__ToAssignment_312421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__LabelStyleDefinition__ExpressionAssignment_112452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__LabelStyleDefinition__ColorAssignment_212483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LabelStyleDefinition__SizeAssignment_3_112514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__LabelStyleDefinition__BoldAssignment_412550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__LabelStyleDefinition__ItalicAssignment_512594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__BorderStyleDefinition__ColorAssignment_112633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__BorderStyleDefinition__SizeAssignment_2_112664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AcceleoExpression__ValueAssignment_112695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VarRef__ValueAssignment_112726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureRef__ValueAssignment_112757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetamodelRef__MetamodelAssignment_112788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColor_in_rule__PreDefinedColorDefinition__ColorAssignment12819 = new BitSet(new long[]{0x0000000000000002L});

}