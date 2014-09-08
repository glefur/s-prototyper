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


    // $ANTLR start "entryRuleMetamodelUsage"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:760:1: entryRuleMetamodelUsage : ruleMetamodelUsage EOF ;
    public final void entryRuleMetamodelUsage() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:761:1: ( ruleMetamodelUsage EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:762:1: ruleMetamodelUsage EOF
            {
             before(grammarAccess.getMetamodelUsageRule()); 
            pushFollow(FOLLOW_ruleMetamodelUsage_in_entryRuleMetamodelUsage1560);
            ruleMetamodelUsage();

            state._fsp--;

             after(grammarAccess.getMetamodelUsageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelUsage1567); 

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
    // $ANTLR end "entryRuleMetamodelUsage"


    // $ANTLR start "ruleMetamodelUsage"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:769:1: ruleMetamodelUsage : ( ( rule__MetamodelUsage__Group__0 ) ) ;
    public final void ruleMetamodelUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:773:2: ( ( ( rule__MetamodelUsage__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:774:1: ( ( rule__MetamodelUsage__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:774:1: ( ( rule__MetamodelUsage__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:775:1: ( rule__MetamodelUsage__Group__0 )
            {
             before(grammarAccess.getMetamodelUsageAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:776:1: ( rule__MetamodelUsage__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:776:2: rule__MetamodelUsage__Group__0
            {
            pushFollow(FOLLOW_rule__MetamodelUsage__Group__0_in_ruleMetamodelUsage1593);
            rule__MetamodelUsage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelUsageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodelUsage"


    // $ANTLR start "rulePreDefinedColor"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:789:1: rulePreDefinedColor : ( ( rule__PreDefinedColor__Alternatives ) ) ;
    public final void rulePreDefinedColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:793:1: ( ( ( rule__PreDefinedColor__Alternatives ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:794:1: ( ( rule__PreDefinedColor__Alternatives ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:794:1: ( ( rule__PreDefinedColor__Alternatives ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:795:1: ( rule__PreDefinedColor__Alternatives )
            {
             before(grammarAccess.getPreDefinedColorAccess().getAlternatives()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:796:1: ( rule__PreDefinedColor__Alternatives )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:796:2: rule__PreDefinedColor__Alternatives
            {
            pushFollow(FOLLOW_rule__PreDefinedColor__Alternatives_in_rulePreDefinedColor1630);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:807:1: rule__SPRepresentation__Alternatives : ( ( ruleSPTable ) | ( ruleSPDiagram ) );
    public final void rule__SPRepresentation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:811:1: ( ( ruleSPTable ) | ( ruleSPDiagram ) )
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
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:812:1: ( ruleSPTable )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:812:1: ( ruleSPTable )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:813:1: ruleSPTable
                    {
                     before(grammarAccess.getSPRepresentationAccess().getSPTableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSPTable_in_rule__SPRepresentation__Alternatives1665);
                    ruleSPTable();

                    state._fsp--;

                     after(grammarAccess.getSPRepresentationAccess().getSPTableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:818:6: ( ruleSPDiagram )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:818:6: ( ruleSPDiagram )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:819:1: ruleSPDiagram
                    {
                     before(grammarAccess.getSPRepresentationAccess().getSPDiagramParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSPDiagram_in_rule__SPRepresentation__Alternatives1682);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:829:1: rule__DiagramElement__Alternatives : ( ( ruleContainer ) | ( ruleNode ) );
    public final void rule__DiagramElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:833:1: ( ( ruleContainer ) | ( ruleNode ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 70:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==60) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=11 && LA2_1<=12)||LA2_1==55||LA2_1==71) ) {
                    alt2=1;
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
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:834:1: ( ruleContainer )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:834:1: ( ruleContainer )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:835:1: ruleContainer
                    {
                     before(grammarAccess.getDiagramElementAccess().getContainerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleContainer_in_rule__DiagramElement__Alternatives1714);
                    ruleContainer();

                    state._fsp--;

                     after(grammarAccess.getDiagramElementAccess().getContainerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:840:6: ( ruleNode )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:840:6: ( ruleNode )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:841:1: ruleNode
                    {
                     before(grammarAccess.getDiagramElementAccess().getNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNode_in_rule__DiagramElement__Alternatives1731);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:851:1: rule__ContainerType__Alternatives : ( ( 'freeform' ) | ( 'list' ) );
    public final void rule__ContainerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:855:1: ( ( 'freeform' ) | ( 'list' ) )
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
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:856:1: ( 'freeform' )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:856:1: ( 'freeform' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:857:1: 'freeform'
                    {
                     before(grammarAccess.getContainerTypeAccess().getFreeformKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__ContainerType__Alternatives1764); 
                     after(grammarAccess.getContainerTypeAccess().getFreeformKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:864:6: ( 'list' )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:864:6: ( 'list' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:865:1: 'list'
                    {
                     before(grammarAccess.getContainerTypeAccess().getListKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__ContainerType__Alternatives1784); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:877:1: rule__ContainerColorDefinition__Alternatives : ( ( ruleSolidColorDefinition ) | ( ruleGradientColorDefinition ) );
    public final void rule__ContainerColorDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:881:1: ( ( ruleSolidColorDefinition ) | ( ruleGradientColorDefinition ) )
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
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:882:1: ( ruleSolidColorDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:882:1: ( ruleSolidColorDefinition )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:883:1: ruleSolidColorDefinition
                    {
                     before(grammarAccess.getContainerColorDefinitionAccess().getSolidColorDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__ContainerColorDefinition__Alternatives1818);
                    ruleSolidColorDefinition();

                    state._fsp--;

                     after(grammarAccess.getContainerColorDefinitionAccess().getSolidColorDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:888:6: ( ruleGradientColorDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:888:6: ( ruleGradientColorDefinition )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:889:1: ruleGradientColorDefinition
                    {
                     before(grammarAccess.getContainerColorDefinitionAccess().getGradientColorDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGradientColorDefinition_in_rule__ContainerColorDefinition__Alternatives1835);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:899:1: rule__SPExpression__Alternatives : ( ( ruleAcceleoExpression ) | ( ruleVarRef ) | ( ruleFeatureRef ) );
    public final void rule__SPExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:903:1: ( ( ruleAcceleoExpression ) | ( ruleVarRef ) | ( ruleFeatureRef ) )
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
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:904:1: ( ruleAcceleoExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:904:1: ( ruleAcceleoExpression )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:905:1: ruleAcceleoExpression
                    {
                     before(grammarAccess.getSPExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAcceleoExpression_in_rule__SPExpression__Alternatives1867);
                    ruleAcceleoExpression();

                    state._fsp--;

                     after(grammarAccess.getSPExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:910:6: ( ruleVarRef )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:910:6: ( ruleVarRef )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:911:1: ruleVarRef
                    {
                     before(grammarAccess.getSPExpressionAccess().getVarRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVarRef_in_rule__SPExpression__Alternatives1884);
                    ruleVarRef();

                    state._fsp--;

                     after(grammarAccess.getSPExpressionAccess().getVarRefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:916:6: ( ruleFeatureRef )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:916:6: ( ruleFeatureRef )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:917:1: ruleFeatureRef
                    {
                     before(grammarAccess.getSPExpressionAccess().getFeatureRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFeatureRef_in_rule__SPExpression__Alternatives1901);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:927:1: rule__PreDefinedColor__Alternatives : ( ( ( 'white' ) ) | ( ( 'black' ) ) | ( ( 'blue' ) ) | ( ( 'light blue' ) ) | ( ( 'dark blue' ) ) | ( ( 'chocolate' ) ) | ( ( 'light chocolate' ) ) | ( ( 'dark chocolate' ) ) | ( ( 'gray' ) ) | ( ( 'light gray' ) ) | ( ( 'dark gray' ) ) | ( ( 'green' ) ) | ( ( 'light green' ) ) | ( ( 'dark green' ) ) | ( ( 'orange' ) ) | ( ( 'light orange' ) ) | ( ( 'dark orange' ) ) | ( ( 'purple' ) ) | ( ( 'light purple' ) ) | ( ( 'dark purple' ) ) | ( ( 'red' ) ) | ( ( 'light red' ) ) | ( ( 'dark red' ) ) | ( ( 'yellow' ) ) | ( ( 'light yellow' ) ) | ( ( 'dark yellow' ) ) );
    public final void rule__PreDefinedColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:931:1: ( ( ( 'white' ) ) | ( ( 'black' ) ) | ( ( 'blue' ) ) | ( ( 'light blue' ) ) | ( ( 'dark blue' ) ) | ( ( 'chocolate' ) ) | ( ( 'light chocolate' ) ) | ( ( 'dark chocolate' ) ) | ( ( 'gray' ) ) | ( ( 'light gray' ) ) | ( ( 'dark gray' ) ) | ( ( 'green' ) ) | ( ( 'light green' ) ) | ( ( 'dark green' ) ) | ( ( 'orange' ) ) | ( ( 'light orange' ) ) | ( ( 'dark orange' ) ) | ( ( 'purple' ) ) | ( ( 'light purple' ) ) | ( ( 'dark purple' ) ) | ( ( 'red' ) ) | ( ( 'light red' ) ) | ( ( 'dark red' ) ) | ( ( 'yellow' ) ) | ( ( 'light yellow' ) ) | ( ( 'dark yellow' ) ) )
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
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:932:1: ( ( 'white' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:932:1: ( ( 'white' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:933:1: ( 'white' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:934:1: ( 'white' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:934:3: 'white'
                    {
                    match(input,13,FOLLOW_13_in_rule__PreDefinedColor__Alternatives1934); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:939:6: ( ( 'black' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:939:6: ( ( 'black' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:940:1: ( 'black' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:941:1: ( 'black' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:941:3: 'black'
                    {
                    match(input,14,FOLLOW_14_in_rule__PreDefinedColor__Alternatives1955); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:946:6: ( ( 'blue' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:946:6: ( ( 'blue' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:947:1: ( 'blue' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:948:1: ( 'blue' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:948:3: 'blue'
                    {
                    match(input,15,FOLLOW_15_in_rule__PreDefinedColor__Alternatives1976); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:953:6: ( ( 'light blue' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:953:6: ( ( 'light blue' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:954:1: ( 'light blue' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:955:1: ( 'light blue' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:955:3: 'light blue'
                    {
                    match(input,16,FOLLOW_16_in_rule__PreDefinedColor__Alternatives1997); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:960:6: ( ( 'dark blue' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:960:6: ( ( 'dark blue' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:961:1: ( 'dark blue' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:962:1: ( 'dark blue' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:962:3: 'dark blue'
                    {
                    match(input,17,FOLLOW_17_in_rule__PreDefinedColor__Alternatives2018); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:967:6: ( ( 'chocolate' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:967:6: ( ( 'chocolate' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:968:1: ( 'chocolate' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:969:1: ( 'chocolate' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:969:3: 'chocolate'
                    {
                    match(input,18,FOLLOW_18_in_rule__PreDefinedColor__Alternatives2039); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:974:6: ( ( 'light chocolate' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:974:6: ( ( 'light chocolate' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:975:1: ( 'light chocolate' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:976:1: ( 'light chocolate' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:976:3: 'light chocolate'
                    {
                    match(input,19,FOLLOW_19_in_rule__PreDefinedColor__Alternatives2060); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:981:6: ( ( 'dark chocolate' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:981:6: ( ( 'dark chocolate' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:982:1: ( 'dark chocolate' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:983:1: ( 'dark chocolate' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:983:3: 'dark chocolate'
                    {
                    match(input,20,FOLLOW_20_in_rule__PreDefinedColor__Alternatives2081); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:988:6: ( ( 'gray' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:988:6: ( ( 'gray' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:989:1: ( 'gray' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:990:1: ( 'gray' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:990:3: 'gray'
                    {
                    match(input,21,FOLLOW_21_in_rule__PreDefinedColor__Alternatives2102); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:995:6: ( ( 'light gray' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:995:6: ( ( 'light gray' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:996:1: ( 'light gray' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:997:1: ( 'light gray' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:997:3: 'light gray'
                    {
                    match(input,22,FOLLOW_22_in_rule__PreDefinedColor__Alternatives2123); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1002:6: ( ( 'dark gray' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1002:6: ( ( 'dark gray' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1003:1: ( 'dark gray' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1004:1: ( 'dark gray' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1004:3: 'dark gray'
                    {
                    match(input,23,FOLLOW_23_in_rule__PreDefinedColor__Alternatives2144); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1009:6: ( ( 'green' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1009:6: ( ( 'green' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1010:1: ( 'green' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1011:1: ( 'green' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1011:3: 'green'
                    {
                    match(input,24,FOLLOW_24_in_rule__PreDefinedColor__Alternatives2165); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1016:6: ( ( 'light green' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1016:6: ( ( 'light green' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1017:1: ( 'light green' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1018:1: ( 'light green' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1018:3: 'light green'
                    {
                    match(input,25,FOLLOW_25_in_rule__PreDefinedColor__Alternatives2186); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1023:6: ( ( 'dark green' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1023:6: ( ( 'dark green' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1024:1: ( 'dark green' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1025:1: ( 'dark green' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1025:3: 'dark green'
                    {
                    match(input,26,FOLLOW_26_in_rule__PreDefinedColor__Alternatives2207); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1030:6: ( ( 'orange' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1030:6: ( ( 'orange' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1031:1: ( 'orange' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1032:1: ( 'orange' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1032:3: 'orange'
                    {
                    match(input,27,FOLLOW_27_in_rule__PreDefinedColor__Alternatives2228); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1037:6: ( ( 'light orange' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1037:6: ( ( 'light orange' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1038:1: ( 'light orange' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1039:1: ( 'light orange' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1039:3: 'light orange'
                    {
                    match(input,28,FOLLOW_28_in_rule__PreDefinedColor__Alternatives2249); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1044:6: ( ( 'dark orange' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1044:6: ( ( 'dark orange' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1045:1: ( 'dark orange' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1046:1: ( 'dark orange' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1046:3: 'dark orange'
                    {
                    match(input,29,FOLLOW_29_in_rule__PreDefinedColor__Alternatives2270); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1051:6: ( ( 'purple' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1051:6: ( ( 'purple' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1052:1: ( 'purple' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1053:1: ( 'purple' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1053:3: 'purple'
                    {
                    match(input,30,FOLLOW_30_in_rule__PreDefinedColor__Alternatives2291); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1058:6: ( ( 'light purple' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1058:6: ( ( 'light purple' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1059:1: ( 'light purple' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1060:1: ( 'light purple' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1060:3: 'light purple'
                    {
                    match(input,31,FOLLOW_31_in_rule__PreDefinedColor__Alternatives2312); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1065:6: ( ( 'dark purple' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1065:6: ( ( 'dark purple' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1066:1: ( 'dark purple' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1067:1: ( 'dark purple' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1067:3: 'dark purple'
                    {
                    match(input,32,FOLLOW_32_in_rule__PreDefinedColor__Alternatives2333); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1072:6: ( ( 'red' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1072:6: ( ( 'red' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1073:1: ( 'red' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1074:1: ( 'red' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1074:3: 'red'
                    {
                    match(input,33,FOLLOW_33_in_rule__PreDefinedColor__Alternatives2354); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1079:6: ( ( 'light red' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1079:6: ( ( 'light red' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1080:1: ( 'light red' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1081:1: ( 'light red' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1081:3: 'light red'
                    {
                    match(input,34,FOLLOW_34_in_rule__PreDefinedColor__Alternatives2375); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1086:6: ( ( 'dark red' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1086:6: ( ( 'dark red' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1087:1: ( 'dark red' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1088:1: ( 'dark red' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1088:3: 'dark red'
                    {
                    match(input,35,FOLLOW_35_in_rule__PreDefinedColor__Alternatives2396); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1093:6: ( ( 'yellow' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1093:6: ( ( 'yellow' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1094:1: ( 'yellow' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1095:1: ( 'yellow' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1095:3: 'yellow'
                    {
                    match(input,36,FOLLOW_36_in_rule__PreDefinedColor__Alternatives2417); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1100:6: ( ( 'light yellow' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1100:6: ( ( 'light yellow' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1101:1: ( 'light yellow' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1102:1: ( 'light yellow' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1102:3: 'light yellow'
                    {
                    match(input,37,FOLLOW_37_in_rule__PreDefinedColor__Alternatives2438); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1107:6: ( ( 'dark yellow' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1107:6: ( ( 'dark yellow' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1108:1: ( 'dark yellow' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_YELLOWEnumLiteralDeclaration_25()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1109:1: ( 'dark yellow' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1109:3: 'dark yellow'
                    {
                    match(input,38,FOLLOW_38_in_rule__PreDefinedColor__Alternatives2459); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1121:1: rule__SPrototyper__Group__0 : rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1 ;
    public final void rule__SPrototyper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1125:1: ( rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1126:2: rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__0__Impl_in_rule__SPrototyper__Group__02492);
            rule__SPrototyper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__1_in_rule__SPrototyper__Group__02495);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1133:1: rule__SPrototyper__Group__0__Impl : ( 'proto' ) ;
    public final void rule__SPrototyper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1137:1: ( ( 'proto' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1138:1: ( 'proto' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1138:1: ( 'proto' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1139:1: 'proto'
            {
             before(grammarAccess.getSPrototyperAccess().getProtoKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__SPrototyper__Group__0__Impl2523); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1152:1: rule__SPrototyper__Group__1 : rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2 ;
    public final void rule__SPrototyper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1156:1: ( rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1157:2: rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__1__Impl_in_rule__SPrototyper__Group__12554);
            rule__SPrototyper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__2_in_rule__SPrototyper__Group__12557);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1164:1: rule__SPrototyper__Group__1__Impl : ( ( rule__SPrototyper__NameAssignment_1 ) ) ;
    public final void rule__SPrototyper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1168:1: ( ( ( rule__SPrototyper__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1169:1: ( ( rule__SPrototyper__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1169:1: ( ( rule__SPrototyper__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1170:1: ( rule__SPrototyper__NameAssignment_1 )
            {
             before(grammarAccess.getSPrototyperAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1171:1: ( rule__SPrototyper__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1171:2: rule__SPrototyper__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPrototyper__NameAssignment_1_in_rule__SPrototyper__Group__1__Impl2584);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1181:1: rule__SPrototyper__Group__2 : rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3 ;
    public final void rule__SPrototyper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1185:1: ( rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1186:2: rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__2__Impl_in_rule__SPrototyper__Group__22614);
            rule__SPrototyper__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__3_in_rule__SPrototyper__Group__22617);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1193:1: rule__SPrototyper__Group__2__Impl : ( '{' ) ;
    public final void rule__SPrototyper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1197:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1198:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1198:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1199:1: '{'
            {
             before(grammarAccess.getSPrototyperAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPrototyper__Group__2__Impl2645); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1212:1: rule__SPrototyper__Group__3 : rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4 ;
    public final void rule__SPrototyper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1216:1: ( rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1217:2: rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__3__Impl_in_rule__SPrototyper__Group__32676);
            rule__SPrototyper__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__4_in_rule__SPrototyper__Group__32679);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1224:1: rule__SPrototyper__Group__3__Impl : ( ( rule__SPrototyper__Group_3__0 )? ) ;
    public final void rule__SPrototyper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1228:1: ( ( ( rule__SPrototyper__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1229:1: ( ( rule__SPrototyper__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1229:1: ( ( rule__SPrototyper__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1230:1: ( rule__SPrototyper__Group_3__0 )?
            {
             before(grammarAccess.getSPrototyperAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1231:1: ( rule__SPrototyper__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==42) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1231:2: rule__SPrototyper__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPrototyper__Group_3__0_in_rule__SPrototyper__Group__3__Impl2706);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1241:1: rule__SPrototyper__Group__4 : rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5 ;
    public final void rule__SPrototyper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1245:1: ( rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1246:2: rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__4__Impl_in_rule__SPrototyper__Group__42737);
            rule__SPrototyper__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__5_in_rule__SPrototyper__Group__42740);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1253:1: rule__SPrototyper__Group__4__Impl : ( ( rule__SPrototyper__ViewpointsAssignment_4 )* ) ;
    public final void rule__SPrototyper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1257:1: ( ( ( rule__SPrototyper__ViewpointsAssignment_4 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1258:1: ( ( rule__SPrototyper__ViewpointsAssignment_4 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1258:1: ( ( rule__SPrototyper__ViewpointsAssignment_4 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1259:1: ( rule__SPrototyper__ViewpointsAssignment_4 )*
            {
             before(grammarAccess.getSPrototyperAccess().getViewpointsAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1260:1: ( rule__SPrototyper__ViewpointsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==43) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1260:2: rule__SPrototyper__ViewpointsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SPrototyper__ViewpointsAssignment_4_in_rule__SPrototyper__Group__4__Impl2767);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1270:1: rule__SPrototyper__Group__5 : rule__SPrototyper__Group__5__Impl ;
    public final void rule__SPrototyper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1274:1: ( rule__SPrototyper__Group__5__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1275:2: rule__SPrototyper__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__5__Impl_in_rule__SPrototyper__Group__52798);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1281:1: rule__SPrototyper__Group__5__Impl : ( '}' ) ;
    public final void rule__SPrototyper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1285:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1286:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1286:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1287:1: '}'
            {
             before(grammarAccess.getSPrototyperAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__SPrototyper__Group__5__Impl2826); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1312:1: rule__SPrototyper__Group_3__0 : rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1 ;
    public final void rule__SPrototyper__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1316:1: ( rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1317:2: rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group_3__0__Impl_in_rule__SPrototyper__Group_3__02869);
            rule__SPrototyper__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group_3__1_in_rule__SPrototyper__Group_3__02872);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1324:1: rule__SPrototyper__Group_3__0__Impl : ( 'qualifier' ) ;
    public final void rule__SPrototyper__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1328:1: ( ( 'qualifier' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1329:1: ( 'qualifier' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1329:1: ( 'qualifier' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1330:1: 'qualifier'
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierKeyword_3_0()); 
            match(input,42,FOLLOW_42_in_rule__SPrototyper__Group_3__0__Impl2900); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1343:1: rule__SPrototyper__Group_3__1 : rule__SPrototyper__Group_3__1__Impl ;
    public final void rule__SPrototyper__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1347:1: ( rule__SPrototyper__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1348:2: rule__SPrototyper__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group_3__1__Impl_in_rule__SPrototyper__Group_3__12931);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1354:1: rule__SPrototyper__Group_3__1__Impl : ( ( rule__SPrototyper__QualifierAssignment_3_1 ) ) ;
    public final void rule__SPrototyper__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1358:1: ( ( ( rule__SPrototyper__QualifierAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1359:1: ( ( rule__SPrototyper__QualifierAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1359:1: ( ( rule__SPrototyper__QualifierAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1360:1: ( rule__SPrototyper__QualifierAssignment_3_1 )
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1361:1: ( rule__SPrototyper__QualifierAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1361:2: rule__SPrototyper__QualifierAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPrototyper__QualifierAssignment_3_1_in_rule__SPrototyper__Group_3__1__Impl2958);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1375:1: rule__SPViewpoint__Group__0 : rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1 ;
    public final void rule__SPViewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1379:1: ( rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1380:2: rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__0__Impl_in_rule__SPViewpoint__Group__02992);
            rule__SPViewpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__1_in_rule__SPViewpoint__Group__02995);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1387:1: rule__SPViewpoint__Group__0__Impl : ( 'viewpoint' ) ;
    public final void rule__SPViewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1391:1: ( ( 'viewpoint' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1392:1: ( 'viewpoint' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1392:1: ( 'viewpoint' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1393:1: 'viewpoint'
            {
             before(grammarAccess.getSPViewpointAccess().getViewpointKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__SPViewpoint__Group__0__Impl3023); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1406:1: rule__SPViewpoint__Group__1 : rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2 ;
    public final void rule__SPViewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1410:1: ( rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1411:2: rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__1__Impl_in_rule__SPViewpoint__Group__13054);
            rule__SPViewpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__2_in_rule__SPViewpoint__Group__13057);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1418:1: rule__SPViewpoint__Group__1__Impl : ( ( rule__SPViewpoint__NameAssignment_1 ) ) ;
    public final void rule__SPViewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1422:1: ( ( ( rule__SPViewpoint__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1423:1: ( ( rule__SPViewpoint__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1423:1: ( ( rule__SPViewpoint__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1424:1: ( rule__SPViewpoint__NameAssignment_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1425:1: ( rule__SPViewpoint__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1425:2: rule__SPViewpoint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__NameAssignment_1_in_rule__SPViewpoint__Group__1__Impl3084);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1435:1: rule__SPViewpoint__Group__2 : rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3 ;
    public final void rule__SPViewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1439:1: ( rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1440:2: rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__2__Impl_in_rule__SPViewpoint__Group__23114);
            rule__SPViewpoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__3_in_rule__SPViewpoint__Group__23117);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1447:1: rule__SPViewpoint__Group__2__Impl : ( '{' ) ;
    public final void rule__SPViewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1451:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1452:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1452:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1453:1: '{'
            {
             before(grammarAccess.getSPViewpointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPViewpoint__Group__2__Impl3145); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1466:1: rule__SPViewpoint__Group__3 : rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4 ;
    public final void rule__SPViewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1470:1: ( rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1471:2: rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__3__Impl_in_rule__SPViewpoint__Group__33176);
            rule__SPViewpoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__4_in_rule__SPViewpoint__Group__33179);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1478:1: rule__SPViewpoint__Group__3__Impl : ( ( rule__SPViewpoint__Group_3__0 )? ) ;
    public final void rule__SPViewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1482:1: ( ( ( rule__SPViewpoint__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1483:1: ( ( rule__SPViewpoint__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1483:1: ( ( rule__SPViewpoint__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1484:1: ( rule__SPViewpoint__Group_3__0 )?
            {
             before(grammarAccess.getSPViewpointAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1485:1: ( rule__SPViewpoint__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1485:2: rule__SPViewpoint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPViewpoint__Group_3__0_in_rule__SPViewpoint__Group__3__Impl3206);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1495:1: rule__SPViewpoint__Group__4 : rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5 ;
    public final void rule__SPViewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1499:1: ( rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1500:2: rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__4__Impl_in_rule__SPViewpoint__Group__43237);
            rule__SPViewpoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__5_in_rule__SPViewpoint__Group__43240);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1507:1: rule__SPViewpoint__Group__4__Impl : ( ( rule__SPViewpoint__Group_4__0 )? ) ;
    public final void rule__SPViewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1511:1: ( ( ( rule__SPViewpoint__Group_4__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1512:1: ( ( rule__SPViewpoint__Group_4__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1512:1: ( ( rule__SPViewpoint__Group_4__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1513:1: ( rule__SPViewpoint__Group_4__0 )?
            {
             before(grammarAccess.getSPViewpointAccess().getGroup_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1514:1: ( rule__SPViewpoint__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1514:2: rule__SPViewpoint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SPViewpoint__Group_4__0_in_rule__SPViewpoint__Group__4__Impl3267);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1524:1: rule__SPViewpoint__Group__5 : rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6 ;
    public final void rule__SPViewpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1528:1: ( rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1529:2: rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__5__Impl_in_rule__SPViewpoint__Group__53298);
            rule__SPViewpoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__6_in_rule__SPViewpoint__Group__53301);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1536:1: rule__SPViewpoint__Group__5__Impl : ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* ) ;
    public final void rule__SPViewpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1540:1: ( ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1541:1: ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1541:1: ( ( rule__SPViewpoint__RepresentationsAssignment_5 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1542:1: ( rule__SPViewpoint__RepresentationsAssignment_5 )*
            {
             before(grammarAccess.getSPViewpointAccess().getRepresentationsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1543:1: ( rule__SPViewpoint__RepresentationsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==46||LA11_0==54) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1543:2: rule__SPViewpoint__RepresentationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SPViewpoint__RepresentationsAssignment_5_in_rule__SPViewpoint__Group__5__Impl3328);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1553:1: rule__SPViewpoint__Group__6 : rule__SPViewpoint__Group__6__Impl ;
    public final void rule__SPViewpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1557:1: ( rule__SPViewpoint__Group__6__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1558:2: rule__SPViewpoint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__6__Impl_in_rule__SPViewpoint__Group__63359);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1564:1: rule__SPViewpoint__Group__6__Impl : ( '}' ) ;
    public final void rule__SPViewpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1568:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1569:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1569:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1570:1: '}'
            {
             before(grammarAccess.getSPViewpointAccess().getRightCurlyBracketKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__SPViewpoint__Group__6__Impl3387); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1597:1: rule__SPViewpoint__Group_3__0 : rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1 ;
    public final void rule__SPViewpoint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1601:1: ( rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1602:2: rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__0__Impl_in_rule__SPViewpoint__Group_3__03432);
            rule__SPViewpoint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__1_in_rule__SPViewpoint__Group_3__03435);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1609:1: rule__SPViewpoint__Group_3__0__Impl : ( 'shortcut' ) ;
    public final void rule__SPViewpoint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1613:1: ( ( 'shortcut' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1614:1: ( 'shortcut' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1614:1: ( 'shortcut' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1615:1: 'shortcut'
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutKeyword_3_0()); 
            match(input,44,FOLLOW_44_in_rule__SPViewpoint__Group_3__0__Impl3463); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1628:1: rule__SPViewpoint__Group_3__1 : rule__SPViewpoint__Group_3__1__Impl ;
    public final void rule__SPViewpoint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1632:1: ( rule__SPViewpoint__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1633:2: rule__SPViewpoint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__1__Impl_in_rule__SPViewpoint__Group_3__13494);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1639:1: rule__SPViewpoint__Group_3__1__Impl : ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) ) ;
    public final void rule__SPViewpoint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1643:1: ( ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1644:1: ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1644:1: ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1645:1: ( rule__SPViewpoint__ShortcutAssignment_3_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1646:1: ( rule__SPViewpoint__ShortcutAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1646:2: rule__SPViewpoint__ShortcutAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__ShortcutAssignment_3_1_in_rule__SPViewpoint__Group_3__1__Impl3521);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1660:1: rule__SPViewpoint__Group_4__0 : rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1 ;
    public final void rule__SPViewpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1664:1: ( rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1665:2: rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__0__Impl_in_rule__SPViewpoint__Group_4__03555);
            rule__SPViewpoint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__1_in_rule__SPViewpoint__Group_4__03558);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1672:1: rule__SPViewpoint__Group_4__0__Impl : ( 'ext' ) ;
    public final void rule__SPViewpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1676:1: ( ( 'ext' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1677:1: ( 'ext' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1677:1: ( 'ext' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1678:1: 'ext'
            {
             before(grammarAccess.getSPViewpointAccess().getExtKeyword_4_0()); 
            match(input,45,FOLLOW_45_in_rule__SPViewpoint__Group_4__0__Impl3586); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1691:1: rule__SPViewpoint__Group_4__1 : rule__SPViewpoint__Group_4__1__Impl ;
    public final void rule__SPViewpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1695:1: ( rule__SPViewpoint__Group_4__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1696:2: rule__SPViewpoint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__1__Impl_in_rule__SPViewpoint__Group_4__13617);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1702:1: rule__SPViewpoint__Group_4__1__Impl : ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) ) ;
    public final void rule__SPViewpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1706:1: ( ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1707:1: ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1707:1: ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1708:1: ( rule__SPViewpoint__ExtensionAssignment_4_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getExtensionAssignment_4_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1709:1: ( rule__SPViewpoint__ExtensionAssignment_4_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1709:2: rule__SPViewpoint__ExtensionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__ExtensionAssignment_4_1_in_rule__SPViewpoint__Group_4__1__Impl3644);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1723:1: rule__SPTable__Group__0 : rule__SPTable__Group__0__Impl rule__SPTable__Group__1 ;
    public final void rule__SPTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1727:1: ( rule__SPTable__Group__0__Impl rule__SPTable__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1728:2: rule__SPTable__Group__0__Impl rule__SPTable__Group__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group__0__Impl_in_rule__SPTable__Group__03678);
            rule__SPTable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__1_in_rule__SPTable__Group__03681);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1735:1: rule__SPTable__Group__0__Impl : ( 'table' ) ;
    public final void rule__SPTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1739:1: ( ( 'table' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1740:1: ( 'table' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1740:1: ( 'table' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1741:1: 'table'
            {
             before(grammarAccess.getSPTableAccess().getTableKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__SPTable__Group__0__Impl3709); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1754:1: rule__SPTable__Group__1 : rule__SPTable__Group__1__Impl rule__SPTable__Group__2 ;
    public final void rule__SPTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1758:1: ( rule__SPTable__Group__1__Impl rule__SPTable__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1759:2: rule__SPTable__Group__1__Impl rule__SPTable__Group__2
            {
            pushFollow(FOLLOW_rule__SPTable__Group__1__Impl_in_rule__SPTable__Group__13740);
            rule__SPTable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__2_in_rule__SPTable__Group__13743);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1766:1: rule__SPTable__Group__1__Impl : ( ( rule__SPTable__NameAssignment_1 ) ) ;
    public final void rule__SPTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1770:1: ( ( ( rule__SPTable__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1771:1: ( ( rule__SPTable__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1771:1: ( ( rule__SPTable__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1772:1: ( rule__SPTable__NameAssignment_1 )
            {
             before(grammarAccess.getSPTableAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1773:1: ( rule__SPTable__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1773:2: rule__SPTable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPTable__NameAssignment_1_in_rule__SPTable__Group__1__Impl3770);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1783:1: rule__SPTable__Group__2 : rule__SPTable__Group__2__Impl rule__SPTable__Group__3 ;
    public final void rule__SPTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1787:1: ( rule__SPTable__Group__2__Impl rule__SPTable__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1788:2: rule__SPTable__Group__2__Impl rule__SPTable__Group__3
            {
            pushFollow(FOLLOW_rule__SPTable__Group__2__Impl_in_rule__SPTable__Group__23800);
            rule__SPTable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__3_in_rule__SPTable__Group__23803);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1795:1: rule__SPTable__Group__2__Impl : ( '{' ) ;
    public final void rule__SPTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1799:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1800:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1800:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1801:1: '{'
            {
             before(grammarAccess.getSPTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPTable__Group__2__Impl3831); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1814:1: rule__SPTable__Group__3 : rule__SPTable__Group__3__Impl rule__SPTable__Group__4 ;
    public final void rule__SPTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1818:1: ( rule__SPTable__Group__3__Impl rule__SPTable__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1819:2: rule__SPTable__Group__3__Impl rule__SPTable__Group__4
            {
            pushFollow(FOLLOW_rule__SPTable__Group__3__Impl_in_rule__SPTable__Group__33862);
            rule__SPTable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__4_in_rule__SPTable__Group__33865);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1826:1: rule__SPTable__Group__3__Impl : ( ( rule__SPTable__Group_3__0 )? ) ;
    public final void rule__SPTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1830:1: ( ( ( rule__SPTable__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1831:1: ( ( rule__SPTable__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1831:1: ( ( rule__SPTable__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1832:1: ( rule__SPTable__Group_3__0 )?
            {
             before(grammarAccess.getSPTableAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1833:1: ( rule__SPTable__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==48) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1833:2: rule__SPTable__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPTable__Group_3__0_in_rule__SPTable__Group__3__Impl3892);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1843:1: rule__SPTable__Group__4 : rule__SPTable__Group__4__Impl rule__SPTable__Group__5 ;
    public final void rule__SPTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1847:1: ( rule__SPTable__Group__4__Impl rule__SPTable__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1848:2: rule__SPTable__Group__4__Impl rule__SPTable__Group__5
            {
            pushFollow(FOLLOW_rule__SPTable__Group__4__Impl_in_rule__SPTable__Group__43923);
            rule__SPTable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__5_in_rule__SPTable__Group__43926);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1855:1: rule__SPTable__Group__4__Impl : ( ( rule__SPTable__Group_4__0 )? ) ;
    public final void rule__SPTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1859:1: ( ( ( rule__SPTable__Group_4__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1860:1: ( ( rule__SPTable__Group_4__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1860:1: ( ( rule__SPTable__Group_4__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1861:1: ( rule__SPTable__Group_4__0 )?
            {
             before(grammarAccess.getSPTableAccess().getGroup_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1862:1: ( rule__SPTable__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1862:2: rule__SPTable__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SPTable__Group_4__0_in_rule__SPTable__Group__4__Impl3953);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1872:1: rule__SPTable__Group__5 : rule__SPTable__Group__5__Impl rule__SPTable__Group__6 ;
    public final void rule__SPTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1876:1: ( rule__SPTable__Group__5__Impl rule__SPTable__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1877:2: rule__SPTable__Group__5__Impl rule__SPTable__Group__6
            {
            pushFollow(FOLLOW_rule__SPTable__Group__5__Impl_in_rule__SPTable__Group__53984);
            rule__SPTable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__6_in_rule__SPTable__Group__53987);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1884:1: rule__SPTable__Group__5__Impl : ( ( ( rule__SPTable__UsagesAssignment_5 ) ) ( ( rule__SPTable__UsagesAssignment_5 )* ) ) ;
    public final void rule__SPTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1888:1: ( ( ( ( rule__SPTable__UsagesAssignment_5 ) ) ( ( rule__SPTable__UsagesAssignment_5 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1889:1: ( ( ( rule__SPTable__UsagesAssignment_5 ) ) ( ( rule__SPTable__UsagesAssignment_5 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1889:1: ( ( ( rule__SPTable__UsagesAssignment_5 ) ) ( ( rule__SPTable__UsagesAssignment_5 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1890:1: ( ( rule__SPTable__UsagesAssignment_5 ) ) ( ( rule__SPTable__UsagesAssignment_5 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1890:1: ( ( rule__SPTable__UsagesAssignment_5 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1891:1: ( rule__SPTable__UsagesAssignment_5 )
            {
             before(grammarAccess.getSPTableAccess().getUsagesAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1892:1: ( rule__SPTable__UsagesAssignment_5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1892:2: rule__SPTable__UsagesAssignment_5
            {
            pushFollow(FOLLOW_rule__SPTable__UsagesAssignment_5_in_rule__SPTable__Group__5__Impl4016);
            rule__SPTable__UsagesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getUsagesAssignment_5()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1895:1: ( ( rule__SPTable__UsagesAssignment_5 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1896:1: ( rule__SPTable__UsagesAssignment_5 )*
            {
             before(grammarAccess.getSPTableAccess().getUsagesAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1897:1: ( rule__SPTable__UsagesAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==69) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1897:2: rule__SPTable__UsagesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__UsagesAssignment_5_in_rule__SPTable__Group__5__Impl4028);
            	    rule__SPTable__UsagesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSPTableAccess().getUsagesAssignment_5()); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1908:1: rule__SPTable__Group__6 : rule__SPTable__Group__6__Impl rule__SPTable__Group__7 ;
    public final void rule__SPTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1912:1: ( rule__SPTable__Group__6__Impl rule__SPTable__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1913:2: rule__SPTable__Group__6__Impl rule__SPTable__Group__7
            {
            pushFollow(FOLLOW_rule__SPTable__Group__6__Impl_in_rule__SPTable__Group__64061);
            rule__SPTable__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__7_in_rule__SPTable__Group__64064);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1920:1: rule__SPTable__Group__6__Impl : ( 'root' ) ;
    public final void rule__SPTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1924:1: ( ( 'root' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1925:1: ( 'root' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1925:1: ( 'root' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1926:1: 'root'
            {
             before(grammarAccess.getSPTableAccess().getRootKeyword_6()); 
            match(input,47,FOLLOW_47_in_rule__SPTable__Group__6__Impl4092); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1939:1: rule__SPTable__Group__7 : rule__SPTable__Group__7__Impl rule__SPTable__Group__8 ;
    public final void rule__SPTable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1943:1: ( rule__SPTable__Group__7__Impl rule__SPTable__Group__8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1944:2: rule__SPTable__Group__7__Impl rule__SPTable__Group__8
            {
            pushFollow(FOLLOW_rule__SPTable__Group__7__Impl_in_rule__SPTable__Group__74123);
            rule__SPTable__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__8_in_rule__SPTable__Group__74126);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1951:1: rule__SPTable__Group__7__Impl : ( ( rule__SPTable__RootAssignment_7 ) ) ;
    public final void rule__SPTable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1955:1: ( ( ( rule__SPTable__RootAssignment_7 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1956:1: ( ( rule__SPTable__RootAssignment_7 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1956:1: ( ( rule__SPTable__RootAssignment_7 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1957:1: ( rule__SPTable__RootAssignment_7 )
            {
             before(grammarAccess.getSPTableAccess().getRootAssignment_7()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1958:1: ( rule__SPTable__RootAssignment_7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1958:2: rule__SPTable__RootAssignment_7
            {
            pushFollow(FOLLOW_rule__SPTable__RootAssignment_7_in_rule__SPTable__Group__7__Impl4153);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1968:1: rule__SPTable__Group__8 : rule__SPTable__Group__8__Impl rule__SPTable__Group__9 ;
    public final void rule__SPTable__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1972:1: ( rule__SPTable__Group__8__Impl rule__SPTable__Group__9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1973:2: rule__SPTable__Group__8__Impl rule__SPTable__Group__9
            {
            pushFollow(FOLLOW_rule__SPTable__Group__8__Impl_in_rule__SPTable__Group__84183);
            rule__SPTable__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__9_in_rule__SPTable__Group__84186);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1980:1: rule__SPTable__Group__8__Impl : ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) ) ;
    public final void rule__SPTable__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1984:1: ( ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1985:1: ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1985:1: ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1986:1: ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1986:1: ( ( rule__SPTable__ElementsAssignment_8 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1987:1: ( rule__SPTable__ElementsAssignment_8 )
            {
             before(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1988:1: ( rule__SPTable__ElementsAssignment_8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1988:2: rule__SPTable__ElementsAssignment_8
            {
            pushFollow(FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4215);
            rule__SPTable__ElementsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1991:1: ( ( rule__SPTable__ElementsAssignment_8 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1992:1: ( rule__SPTable__ElementsAssignment_8 )*
            {
             before(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1993:1: ( rule__SPTable__ElementsAssignment_8 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==50||(LA15_0>=70 && LA15_0<=71)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1993:2: rule__SPTable__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4227);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2004:1: rule__SPTable__Group__9 : rule__SPTable__Group__9__Impl rule__SPTable__Group__10 ;
    public final void rule__SPTable__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2008:1: ( rule__SPTable__Group__9__Impl rule__SPTable__Group__10 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2009:2: rule__SPTable__Group__9__Impl rule__SPTable__Group__10
            {
            pushFollow(FOLLOW_rule__SPTable__Group__9__Impl_in_rule__SPTable__Group__94260);
            rule__SPTable__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__10_in_rule__SPTable__Group__94263);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2016:1: rule__SPTable__Group__9__Impl : ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) ) ;
    public final void rule__SPTable__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2020:1: ( ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2021:1: ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2021:1: ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2022:1: ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2022:1: ( ( rule__SPTable__PropertiesAssignment_9 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2023:1: ( rule__SPTable__PropertiesAssignment_9 )
            {
             before(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2024:1: ( rule__SPTable__PropertiesAssignment_9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2024:2: rule__SPTable__PropertiesAssignment_9
            {
            pushFollow(FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4292);
            rule__SPTable__PropertiesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2027:1: ( ( rule__SPTable__PropertiesAssignment_9 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2028:1: ( rule__SPTable__PropertiesAssignment_9 )*
            {
             before(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2029:1: ( rule__SPTable__PropertiesAssignment_9 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==52) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2029:2: rule__SPTable__PropertiesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4304);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2040:1: rule__SPTable__Group__10 : rule__SPTable__Group__10__Impl ;
    public final void rule__SPTable__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2044:1: ( rule__SPTable__Group__10__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2045:2: rule__SPTable__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group__10__Impl_in_rule__SPTable__Group__104337);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2051:1: rule__SPTable__Group__10__Impl : ( '}' ) ;
    public final void rule__SPTable__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2055:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2056:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2056:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2057:1: '}'
            {
             before(grammarAccess.getSPTableAccess().getRightCurlyBracketKeyword_10()); 
            match(input,41,FOLLOW_41_in_rule__SPTable__Group__10__Impl4365); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2092:1: rule__SPTable__Group_3__0 : rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1 ;
    public final void rule__SPTable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2096:1: ( rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2097:2: rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group_3__0__Impl_in_rule__SPTable__Group_3__04418);
            rule__SPTable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group_3__1_in_rule__SPTable__Group_3__04421);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2104:1: rule__SPTable__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__SPTable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2108:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2109:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2109:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2110:1: 'label'
            {
             before(grammarAccess.getSPTableAccess().getLabelKeyword_3_0()); 
            match(input,48,FOLLOW_48_in_rule__SPTable__Group_3__0__Impl4449); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2123:1: rule__SPTable__Group_3__1 : rule__SPTable__Group_3__1__Impl ;
    public final void rule__SPTable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2127:1: ( rule__SPTable__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2128:2: rule__SPTable__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group_3__1__Impl_in_rule__SPTable__Group_3__14480);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2134:1: rule__SPTable__Group_3__1__Impl : ( ( rule__SPTable__LabelAssignment_3_1 ) ) ;
    public final void rule__SPTable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2138:1: ( ( ( rule__SPTable__LabelAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2139:1: ( ( rule__SPTable__LabelAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2139:1: ( ( rule__SPTable__LabelAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2140:1: ( rule__SPTable__LabelAssignment_3_1 )
            {
             before(grammarAccess.getSPTableAccess().getLabelAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2141:1: ( rule__SPTable__LabelAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2141:2: rule__SPTable__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPTable__LabelAssignment_3_1_in_rule__SPTable__Group_3__1__Impl4507);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2155:1: rule__SPTable__Group_4__0 : rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1 ;
    public final void rule__SPTable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2159:1: ( rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2160:2: rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group_4__0__Impl_in_rule__SPTable__Group_4__04541);
            rule__SPTable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group_4__1_in_rule__SPTable__Group_4__04544);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2167:1: rule__SPTable__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__SPTable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2171:1: ( ( 'title' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2172:1: ( 'title' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2172:1: ( 'title' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2173:1: 'title'
            {
             before(grammarAccess.getSPTableAccess().getTitleKeyword_4_0()); 
            match(input,49,FOLLOW_49_in_rule__SPTable__Group_4__0__Impl4572); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2186:1: rule__SPTable__Group_4__1 : rule__SPTable__Group_4__1__Impl ;
    public final void rule__SPTable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2190:1: ( rule__SPTable__Group_4__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2191:2: rule__SPTable__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group_4__1__Impl_in_rule__SPTable__Group_4__14603);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2197:1: rule__SPTable__Group_4__1__Impl : ( ( rule__SPTable__TitleAssignment_4_1 ) ) ;
    public final void rule__SPTable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2201:1: ( ( ( rule__SPTable__TitleAssignment_4_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2202:1: ( ( rule__SPTable__TitleAssignment_4_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2202:1: ( ( rule__SPTable__TitleAssignment_4_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2203:1: ( rule__SPTable__TitleAssignment_4_1 )
            {
             before(grammarAccess.getSPTableAccess().getTitleAssignment_4_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2204:1: ( rule__SPTable__TitleAssignment_4_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2204:2: rule__SPTable__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SPTable__TitleAssignment_4_1_in_rule__SPTable__Group_4__1__Impl4630);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2218:1: rule__TableElement__Group__0 : rule__TableElement__Group__0__Impl rule__TableElement__Group__1 ;
    public final void rule__TableElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2222:1: ( rule__TableElement__Group__0__Impl rule__TableElement__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2223:2: rule__TableElement__Group__0__Impl rule__TableElement__Group__1
            {
            pushFollow(FOLLOW_rule__TableElement__Group__0__Impl_in_rule__TableElement__Group__04664);
            rule__TableElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__1_in_rule__TableElement__Group__04667);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2230:1: rule__TableElement__Group__0__Impl : ( ( rule__TableElement__CreatableAssignment_0 )? ) ;
    public final void rule__TableElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2234:1: ( ( ( rule__TableElement__CreatableAssignment_0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2235:1: ( ( rule__TableElement__CreatableAssignment_0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2235:1: ( ( rule__TableElement__CreatableAssignment_0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2236:1: ( rule__TableElement__CreatableAssignment_0 )?
            {
             before(grammarAccess.getTableElementAccess().getCreatableAssignment_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2237:1: ( rule__TableElement__CreatableAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==70) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2237:2: rule__TableElement__CreatableAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TableElement__CreatableAssignment_0_in_rule__TableElement__Group__0__Impl4694);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2247:1: rule__TableElement__Group__1 : rule__TableElement__Group__1__Impl rule__TableElement__Group__2 ;
    public final void rule__TableElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2251:1: ( rule__TableElement__Group__1__Impl rule__TableElement__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2252:2: rule__TableElement__Group__1__Impl rule__TableElement__Group__2
            {
            pushFollow(FOLLOW_rule__TableElement__Group__1__Impl_in_rule__TableElement__Group__14725);
            rule__TableElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__2_in_rule__TableElement__Group__14728);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2259:1: rule__TableElement__Group__1__Impl : ( ( rule__TableElement__RecursiveAssignment_1 )? ) ;
    public final void rule__TableElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2263:1: ( ( ( rule__TableElement__RecursiveAssignment_1 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2264:1: ( ( rule__TableElement__RecursiveAssignment_1 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2264:1: ( ( rule__TableElement__RecursiveAssignment_1 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2265:1: ( rule__TableElement__RecursiveAssignment_1 )?
            {
             before(grammarAccess.getTableElementAccess().getRecursiveAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2266:1: ( rule__TableElement__RecursiveAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==71) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2266:2: rule__TableElement__RecursiveAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TableElement__RecursiveAssignment_1_in_rule__TableElement__Group__1__Impl4755);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2276:1: rule__TableElement__Group__2 : rule__TableElement__Group__2__Impl rule__TableElement__Group__3 ;
    public final void rule__TableElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2280:1: ( rule__TableElement__Group__2__Impl rule__TableElement__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2281:2: rule__TableElement__Group__2__Impl rule__TableElement__Group__3
            {
            pushFollow(FOLLOW_rule__TableElement__Group__2__Impl_in_rule__TableElement__Group__24786);
            rule__TableElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__3_in_rule__TableElement__Group__24789);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2288:1: rule__TableElement__Group__2__Impl : ( 'element' ) ;
    public final void rule__TableElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2292:1: ( ( 'element' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2293:1: ( 'element' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2293:1: ( 'element' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2294:1: 'element'
            {
             before(grammarAccess.getTableElementAccess().getElementKeyword_2()); 
            match(input,50,FOLLOW_50_in_rule__TableElement__Group__2__Impl4817); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2307:1: rule__TableElement__Group__3 : rule__TableElement__Group__3__Impl rule__TableElement__Group__4 ;
    public final void rule__TableElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2311:1: ( rule__TableElement__Group__3__Impl rule__TableElement__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2312:2: rule__TableElement__Group__3__Impl rule__TableElement__Group__4
            {
            pushFollow(FOLLOW_rule__TableElement__Group__3__Impl_in_rule__TableElement__Group__34848);
            rule__TableElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__4_in_rule__TableElement__Group__34851);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2319:1: rule__TableElement__Group__3__Impl : ( ( rule__TableElement__EClassAssignment_3 ) ) ;
    public final void rule__TableElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2323:1: ( ( ( rule__TableElement__EClassAssignment_3 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2324:1: ( ( rule__TableElement__EClassAssignment_3 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2324:1: ( ( rule__TableElement__EClassAssignment_3 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2325:1: ( rule__TableElement__EClassAssignment_3 )
            {
             before(grammarAccess.getTableElementAccess().getEClassAssignment_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2326:1: ( rule__TableElement__EClassAssignment_3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2326:2: rule__TableElement__EClassAssignment_3
            {
            pushFollow(FOLLOW_rule__TableElement__EClassAssignment_3_in_rule__TableElement__Group__3__Impl4878);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2336:1: rule__TableElement__Group__4 : rule__TableElement__Group__4__Impl rule__TableElement__Group__5 ;
    public final void rule__TableElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2340:1: ( rule__TableElement__Group__4__Impl rule__TableElement__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2341:2: rule__TableElement__Group__4__Impl rule__TableElement__Group__5
            {
            pushFollow(FOLLOW_rule__TableElement__Group__4__Impl_in_rule__TableElement__Group__44908);
            rule__TableElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__5_in_rule__TableElement__Group__44911);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2348:1: rule__TableElement__Group__4__Impl : ( 'accessibleThrough' ) ;
    public final void rule__TableElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2352:1: ( ( 'accessibleThrough' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2353:1: ( 'accessibleThrough' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2353:1: ( 'accessibleThrough' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2354:1: 'accessibleThrough'
            {
             before(grammarAccess.getTableElementAccess().getAccessibleThroughKeyword_4()); 
            match(input,51,FOLLOW_51_in_rule__TableElement__Group__4__Impl4939); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2367:1: rule__TableElement__Group__5 : rule__TableElement__Group__5__Impl rule__TableElement__Group__6 ;
    public final void rule__TableElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2371:1: ( rule__TableElement__Group__5__Impl rule__TableElement__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2372:2: rule__TableElement__Group__5__Impl rule__TableElement__Group__6
            {
            pushFollow(FOLLOW_rule__TableElement__Group__5__Impl_in_rule__TableElement__Group__54970);
            rule__TableElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__6_in_rule__TableElement__Group__54973);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2379:1: rule__TableElement__Group__5__Impl : ( ( rule__TableElement__ExpressionAssignment_5 ) ) ;
    public final void rule__TableElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2383:1: ( ( ( rule__TableElement__ExpressionAssignment_5 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2384:1: ( ( rule__TableElement__ExpressionAssignment_5 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2384:1: ( ( rule__TableElement__ExpressionAssignment_5 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2385:1: ( rule__TableElement__ExpressionAssignment_5 )
            {
             before(grammarAccess.getTableElementAccess().getExpressionAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2386:1: ( rule__TableElement__ExpressionAssignment_5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2386:2: rule__TableElement__ExpressionAssignment_5
            {
            pushFollow(FOLLOW_rule__TableElement__ExpressionAssignment_5_in_rule__TableElement__Group__5__Impl5000);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2396:1: rule__TableElement__Group__6 : rule__TableElement__Group__6__Impl ;
    public final void rule__TableElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2400:1: ( rule__TableElement__Group__6__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2401:2: rule__TableElement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TableElement__Group__6__Impl_in_rule__TableElement__Group__65030);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2407:1: rule__TableElement__Group__6__Impl : ( ( rule__TableElement__Group_6__0 )? ) ;
    public final void rule__TableElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2411:1: ( ( ( rule__TableElement__Group_6__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2412:1: ( ( rule__TableElement__Group_6__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2412:1: ( ( rule__TableElement__Group_6__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2413:1: ( rule__TableElement__Group_6__0 )?
            {
             before(grammarAccess.getTableElementAccess().getGroup_6()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2414:1: ( rule__TableElement__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2414:2: rule__TableElement__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__TableElement__Group_6__0_in_rule__TableElement__Group__6__Impl5057);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2438:1: rule__TableElement__Group_6__0 : rule__TableElement__Group_6__0__Impl rule__TableElement__Group_6__1 ;
    public final void rule__TableElement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2442:1: ( rule__TableElement__Group_6__0__Impl rule__TableElement__Group_6__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2443:2: rule__TableElement__Group_6__0__Impl rule__TableElement__Group_6__1
            {
            pushFollow(FOLLOW_rule__TableElement__Group_6__0__Impl_in_rule__TableElement__Group_6__05102);
            rule__TableElement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group_6__1_in_rule__TableElement__Group_6__05105);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2450:1: rule__TableElement__Group_6__0__Impl : ( '{' ) ;
    public final void rule__TableElement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2454:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2455:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2455:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2456:1: '{'
            {
             before(grammarAccess.getTableElementAccess().getLeftCurlyBracketKeyword_6_0()); 
            match(input,40,FOLLOW_40_in_rule__TableElement__Group_6__0__Impl5133); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2469:1: rule__TableElement__Group_6__1 : rule__TableElement__Group_6__1__Impl rule__TableElement__Group_6__2 ;
    public final void rule__TableElement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2473:1: ( rule__TableElement__Group_6__1__Impl rule__TableElement__Group_6__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2474:2: rule__TableElement__Group_6__1__Impl rule__TableElement__Group_6__2
            {
            pushFollow(FOLLOW_rule__TableElement__Group_6__1__Impl_in_rule__TableElement__Group_6__15164);
            rule__TableElement__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group_6__2_in_rule__TableElement__Group_6__15167);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2481:1: rule__TableElement__Group_6__1__Impl : ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) ) ;
    public final void rule__TableElement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2485:1: ( ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2486:1: ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2486:1: ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2487:1: ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2487:1: ( ( rule__TableElement__SubElementsAssignment_6_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2488:1: ( rule__TableElement__SubElementsAssignment_6_1 )
            {
             before(grammarAccess.getTableElementAccess().getSubElementsAssignment_6_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2489:1: ( rule__TableElement__SubElementsAssignment_6_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2489:2: rule__TableElement__SubElementsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5196);
            rule__TableElement__SubElementsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getSubElementsAssignment_6_1()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2492:1: ( ( rule__TableElement__SubElementsAssignment_6_1 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2493:1: ( rule__TableElement__SubElementsAssignment_6_1 )*
            {
             before(grammarAccess.getTableElementAccess().getSubElementsAssignment_6_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2494:1: ( rule__TableElement__SubElementsAssignment_6_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==50||(LA20_0>=70 && LA20_0<=71)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2494:2: rule__TableElement__SubElementsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5208);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2505:1: rule__TableElement__Group_6__2 : rule__TableElement__Group_6__2__Impl ;
    public final void rule__TableElement__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2509:1: ( rule__TableElement__Group_6__2__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2510:2: rule__TableElement__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__TableElement__Group_6__2__Impl_in_rule__TableElement__Group_6__25241);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2516:1: rule__TableElement__Group_6__2__Impl : ( '}' ) ;
    public final void rule__TableElement__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2520:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2521:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2521:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2522:1: '}'
            {
             before(grammarAccess.getTableElementAccess().getRightCurlyBracketKeyword_6_2()); 
            match(input,41,FOLLOW_41_in_rule__TableElement__Group_6__2__Impl5269); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2541:1: rule__TableProperty__Group__0 : rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1 ;
    public final void rule__TableProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2545:1: ( rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2546:2: rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__0__Impl_in_rule__TableProperty__Group__05306);
            rule__TableProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__1_in_rule__TableProperty__Group__05309);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2553:1: rule__TableProperty__Group__0__Impl : ( 'property' ) ;
    public final void rule__TableProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2557:1: ( ( 'property' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2558:1: ( 'property' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2558:1: ( 'property' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2559:1: 'property'
            {
             before(grammarAccess.getTablePropertyAccess().getPropertyKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__TableProperty__Group__0__Impl5337); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2572:1: rule__TableProperty__Group__1 : rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2 ;
    public final void rule__TableProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2576:1: ( rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2577:2: rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__1__Impl_in_rule__TableProperty__Group__15368);
            rule__TableProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__2_in_rule__TableProperty__Group__15371);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2584:1: rule__TableProperty__Group__1__Impl : ( ( rule__TableProperty__FeatureAssignment_1 ) ) ;
    public final void rule__TableProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2588:1: ( ( ( rule__TableProperty__FeatureAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2589:1: ( ( rule__TableProperty__FeatureAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2589:1: ( ( rule__TableProperty__FeatureAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2590:1: ( rule__TableProperty__FeatureAssignment_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getFeatureAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2591:1: ( rule__TableProperty__FeatureAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2591:2: rule__TableProperty__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__TableProperty__FeatureAssignment_1_in_rule__TableProperty__Group__1__Impl5398);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2601:1: rule__TableProperty__Group__2 : rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3 ;
    public final void rule__TableProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2605:1: ( rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2606:2: rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__2__Impl_in_rule__TableProperty__Group__25428);
            rule__TableProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__3_in_rule__TableProperty__Group__25431);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2613:1: rule__TableProperty__Group__2__Impl : ( ( rule__TableProperty__Group_2__0 )? ) ;
    public final void rule__TableProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2617:1: ( ( ( rule__TableProperty__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2618:1: ( ( rule__TableProperty__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2618:1: ( ( rule__TableProperty__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2619:1: ( rule__TableProperty__Group_2__0 )?
            {
             before(grammarAccess.getTablePropertyAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2620:1: ( rule__TableProperty__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2620:2: rule__TableProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TableProperty__Group_2__0_in_rule__TableProperty__Group__2__Impl5458);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2630:1: rule__TableProperty__Group__3 : rule__TableProperty__Group__3__Impl ;
    public final void rule__TableProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2634:1: ( rule__TableProperty__Group__3__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2635:2: rule__TableProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__3__Impl_in_rule__TableProperty__Group__35489);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2641:1: rule__TableProperty__Group__3__Impl : ( ( rule__TableProperty__Group_3__0 )? ) ;
    public final void rule__TableProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2645:1: ( ( ( rule__TableProperty__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2646:1: ( ( rule__TableProperty__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2646:1: ( ( rule__TableProperty__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2647:1: ( rule__TableProperty__Group_3__0 )?
            {
             before(grammarAccess.getTablePropertyAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2648:1: ( rule__TableProperty__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2648:2: rule__TableProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TableProperty__Group_3__0_in_rule__TableProperty__Group__3__Impl5516);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2666:1: rule__TableProperty__Group_2__0 : rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1 ;
    public final void rule__TableProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2670:1: ( rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2671:2: rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_2__0__Impl_in_rule__TableProperty__Group_2__05555);
            rule__TableProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group_2__1_in_rule__TableProperty__Group_2__05558);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2678:1: rule__TableProperty__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__TableProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2682:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2683:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2683:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2684:1: 'label'
            {
             before(grammarAccess.getTablePropertyAccess().getLabelKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__TableProperty__Group_2__0__Impl5586); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2697:1: rule__TableProperty__Group_2__1 : rule__TableProperty__Group_2__1__Impl ;
    public final void rule__TableProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2701:1: ( rule__TableProperty__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2702:2: rule__TableProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_2__1__Impl_in_rule__TableProperty__Group_2__15617);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2708:1: rule__TableProperty__Group_2__1__Impl : ( ( rule__TableProperty__LabelAssignment_2_1 ) ) ;
    public final void rule__TableProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2712:1: ( ( ( rule__TableProperty__LabelAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2713:1: ( ( rule__TableProperty__LabelAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2713:1: ( ( rule__TableProperty__LabelAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2714:1: ( rule__TableProperty__LabelAssignment_2_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getLabelAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2715:1: ( rule__TableProperty__LabelAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2715:2: rule__TableProperty__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TableProperty__LabelAssignment_2_1_in_rule__TableProperty__Group_2__1__Impl5644);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2729:1: rule__TableProperty__Group_3__0 : rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1 ;
    public final void rule__TableProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2733:1: ( rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2734:2: rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_3__0__Impl_in_rule__TableProperty__Group_3__05678);
            rule__TableProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group_3__1_in_rule__TableProperty__Group_3__05681);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2741:1: rule__TableProperty__Group_3__0__Impl : ( 'expression' ) ;
    public final void rule__TableProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2745:1: ( ( 'expression' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2746:1: ( 'expression' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2746:1: ( 'expression' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2747:1: 'expression'
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionKeyword_3_0()); 
            match(input,53,FOLLOW_53_in_rule__TableProperty__Group_3__0__Impl5709); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2760:1: rule__TableProperty__Group_3__1 : rule__TableProperty__Group_3__1__Impl ;
    public final void rule__TableProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2764:1: ( rule__TableProperty__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2765:2: rule__TableProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_3__1__Impl_in_rule__TableProperty__Group_3__15740);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2771:1: rule__TableProperty__Group_3__1__Impl : ( ( rule__TableProperty__ExpressionAssignment_3_1 ) ) ;
    public final void rule__TableProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2775:1: ( ( ( rule__TableProperty__ExpressionAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2776:1: ( ( rule__TableProperty__ExpressionAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2776:1: ( ( rule__TableProperty__ExpressionAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2777:1: ( rule__TableProperty__ExpressionAssignment_3_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2778:1: ( rule__TableProperty__ExpressionAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2778:2: rule__TableProperty__ExpressionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TableProperty__ExpressionAssignment_3_1_in_rule__TableProperty__Group_3__1__Impl5767);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2792:1: rule__SPDiagram__Group__0 : rule__SPDiagram__Group__0__Impl rule__SPDiagram__Group__1 ;
    public final void rule__SPDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2796:1: ( rule__SPDiagram__Group__0__Impl rule__SPDiagram__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2797:2: rule__SPDiagram__Group__0__Impl rule__SPDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__0__Impl_in_rule__SPDiagram__Group__05801);
            rule__SPDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__1_in_rule__SPDiagram__Group__05804);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2804:1: rule__SPDiagram__Group__0__Impl : ( 'diagram' ) ;
    public final void rule__SPDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2808:1: ( ( 'diagram' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2809:1: ( 'diagram' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2809:1: ( 'diagram' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2810:1: 'diagram'
            {
             before(grammarAccess.getSPDiagramAccess().getDiagramKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__SPDiagram__Group__0__Impl5832); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2823:1: rule__SPDiagram__Group__1 : rule__SPDiagram__Group__1__Impl rule__SPDiagram__Group__2 ;
    public final void rule__SPDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2827:1: ( rule__SPDiagram__Group__1__Impl rule__SPDiagram__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2828:2: rule__SPDiagram__Group__1__Impl rule__SPDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__1__Impl_in_rule__SPDiagram__Group__15863);
            rule__SPDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__2_in_rule__SPDiagram__Group__15866);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2835:1: rule__SPDiagram__Group__1__Impl : ( ( rule__SPDiagram__NameAssignment_1 ) ) ;
    public final void rule__SPDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2839:1: ( ( ( rule__SPDiagram__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2840:1: ( ( rule__SPDiagram__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2840:1: ( ( rule__SPDiagram__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2841:1: ( rule__SPDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getSPDiagramAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2842:1: ( rule__SPDiagram__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2842:2: rule__SPDiagram__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPDiagram__NameAssignment_1_in_rule__SPDiagram__Group__1__Impl5893);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2852:1: rule__SPDiagram__Group__2 : rule__SPDiagram__Group__2__Impl rule__SPDiagram__Group__3 ;
    public final void rule__SPDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2856:1: ( rule__SPDiagram__Group__2__Impl rule__SPDiagram__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2857:2: rule__SPDiagram__Group__2__Impl rule__SPDiagram__Group__3
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__2__Impl_in_rule__SPDiagram__Group__25923);
            rule__SPDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__3_in_rule__SPDiagram__Group__25926);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2864:1: rule__SPDiagram__Group__2__Impl : ( '{' ) ;
    public final void rule__SPDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2868:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2869:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2869:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2870:1: '{'
            {
             before(grammarAccess.getSPDiagramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPDiagram__Group__2__Impl5954); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2883:1: rule__SPDiagram__Group__3 : rule__SPDiagram__Group__3__Impl rule__SPDiagram__Group__4 ;
    public final void rule__SPDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2887:1: ( rule__SPDiagram__Group__3__Impl rule__SPDiagram__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2888:2: rule__SPDiagram__Group__3__Impl rule__SPDiagram__Group__4
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__3__Impl_in_rule__SPDiagram__Group__35985);
            rule__SPDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__4_in_rule__SPDiagram__Group__35988);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2895:1: rule__SPDiagram__Group__3__Impl : ( ( rule__SPDiagram__Group_3__0 )? ) ;
    public final void rule__SPDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2899:1: ( ( ( rule__SPDiagram__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2900:1: ( ( rule__SPDiagram__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2900:1: ( ( rule__SPDiagram__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2901:1: ( rule__SPDiagram__Group_3__0 )?
            {
             before(grammarAccess.getSPDiagramAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2902:1: ( rule__SPDiagram__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2902:2: rule__SPDiagram__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPDiagram__Group_3__0_in_rule__SPDiagram__Group__3__Impl6015);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2912:1: rule__SPDiagram__Group__4 : rule__SPDiagram__Group__4__Impl rule__SPDiagram__Group__5 ;
    public final void rule__SPDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2916:1: ( rule__SPDiagram__Group__4__Impl rule__SPDiagram__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2917:2: rule__SPDiagram__Group__4__Impl rule__SPDiagram__Group__5
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__4__Impl_in_rule__SPDiagram__Group__46046);
            rule__SPDiagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__5_in_rule__SPDiagram__Group__46049);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2924:1: rule__SPDiagram__Group__4__Impl : ( ( rule__SPDiagram__Group_4__0 )? ) ;
    public final void rule__SPDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2928:1: ( ( ( rule__SPDiagram__Group_4__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2929:1: ( ( rule__SPDiagram__Group_4__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2929:1: ( ( rule__SPDiagram__Group_4__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2930:1: ( rule__SPDiagram__Group_4__0 )?
            {
             before(grammarAccess.getSPDiagramAccess().getGroup_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2931:1: ( rule__SPDiagram__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2931:2: rule__SPDiagram__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SPDiagram__Group_4__0_in_rule__SPDiagram__Group__4__Impl6076);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2941:1: rule__SPDiagram__Group__5 : rule__SPDiagram__Group__5__Impl rule__SPDiagram__Group__6 ;
    public final void rule__SPDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2945:1: ( rule__SPDiagram__Group__5__Impl rule__SPDiagram__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2946:2: rule__SPDiagram__Group__5__Impl rule__SPDiagram__Group__6
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__5__Impl_in_rule__SPDiagram__Group__56107);
            rule__SPDiagram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__6_in_rule__SPDiagram__Group__56110);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2953:1: rule__SPDiagram__Group__5__Impl : ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) ) ;
    public final void rule__SPDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2957:1: ( ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2958:1: ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2958:1: ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2959:1: ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2959:1: ( ( rule__SPDiagram__MetamodelsAssignment_5 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2960:1: ( rule__SPDiagram__MetamodelsAssignment_5 )
            {
             before(grammarAccess.getSPDiagramAccess().getMetamodelsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2961:1: ( rule__SPDiagram__MetamodelsAssignment_5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2961:2: rule__SPDiagram__MetamodelsAssignment_5
            {
            pushFollow(FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6139);
            rule__SPDiagram__MetamodelsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSPDiagramAccess().getMetamodelsAssignment_5()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2964:1: ( ( rule__SPDiagram__MetamodelsAssignment_5 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2965:1: ( rule__SPDiagram__MetamodelsAssignment_5 )*
            {
             before(grammarAccess.getSPDiagramAccess().getMetamodelsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2966:1: ( rule__SPDiagram__MetamodelsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==69) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2966:2: rule__SPDiagram__MetamodelsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6151);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2977:1: rule__SPDiagram__Group__6 : rule__SPDiagram__Group__6__Impl rule__SPDiagram__Group__7 ;
    public final void rule__SPDiagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2981:1: ( rule__SPDiagram__Group__6__Impl rule__SPDiagram__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2982:2: rule__SPDiagram__Group__6__Impl rule__SPDiagram__Group__7
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__6__Impl_in_rule__SPDiagram__Group__66184);
            rule__SPDiagram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__7_in_rule__SPDiagram__Group__66187);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2989:1: rule__SPDiagram__Group__6__Impl : ( 'root' ) ;
    public final void rule__SPDiagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2993:1: ( ( 'root' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2994:1: ( 'root' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2994:1: ( 'root' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2995:1: 'root'
            {
             before(grammarAccess.getSPDiagramAccess().getRootKeyword_6()); 
            match(input,47,FOLLOW_47_in_rule__SPDiagram__Group__6__Impl6215); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3008:1: rule__SPDiagram__Group__7 : rule__SPDiagram__Group__7__Impl rule__SPDiagram__Group__8 ;
    public final void rule__SPDiagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3012:1: ( rule__SPDiagram__Group__7__Impl rule__SPDiagram__Group__8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3013:2: rule__SPDiagram__Group__7__Impl rule__SPDiagram__Group__8
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__7__Impl_in_rule__SPDiagram__Group__76246);
            rule__SPDiagram__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__8_in_rule__SPDiagram__Group__76249);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3020:1: rule__SPDiagram__Group__7__Impl : ( ( rule__SPDiagram__RootAssignment_7 ) ) ;
    public final void rule__SPDiagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3024:1: ( ( ( rule__SPDiagram__RootAssignment_7 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3025:1: ( ( rule__SPDiagram__RootAssignment_7 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3025:1: ( ( rule__SPDiagram__RootAssignment_7 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3026:1: ( rule__SPDiagram__RootAssignment_7 )
            {
             before(grammarAccess.getSPDiagramAccess().getRootAssignment_7()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3027:1: ( rule__SPDiagram__RootAssignment_7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3027:2: rule__SPDiagram__RootAssignment_7
            {
            pushFollow(FOLLOW_rule__SPDiagram__RootAssignment_7_in_rule__SPDiagram__Group__7__Impl6276);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3037:1: rule__SPDiagram__Group__8 : rule__SPDiagram__Group__8__Impl rule__SPDiagram__Group__9 ;
    public final void rule__SPDiagram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3041:1: ( rule__SPDiagram__Group__8__Impl rule__SPDiagram__Group__9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3042:2: rule__SPDiagram__Group__8__Impl rule__SPDiagram__Group__9
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__8__Impl_in_rule__SPDiagram__Group__86306);
            rule__SPDiagram__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__9_in_rule__SPDiagram__Group__86309);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3049:1: rule__SPDiagram__Group__8__Impl : ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) ) ;
    public final void rule__SPDiagram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3053:1: ( ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3054:1: ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3054:1: ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3055:1: ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3055:1: ( ( rule__SPDiagram__ElementsAssignment_8 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3056:1: ( rule__SPDiagram__ElementsAssignment_8 )
            {
             before(grammarAccess.getSPDiagramAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3057:1: ( rule__SPDiagram__ElementsAssignment_8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3057:2: rule__SPDiagram__ElementsAssignment_8
            {
            pushFollow(FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl6338);
            rule__SPDiagram__ElementsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSPDiagramAccess().getElementsAssignment_8()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3060:1: ( ( rule__SPDiagram__ElementsAssignment_8 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3061:1: ( rule__SPDiagram__ElementsAssignment_8 )*
            {
             before(grammarAccess.getSPDiagramAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3062:1: ( rule__SPDiagram__ElementsAssignment_8 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=11 && LA26_0<=12)||LA26_0==55||LA26_0==60||(LA26_0>=70 && LA26_0<=71)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3062:2: rule__SPDiagram__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl6350);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3073:1: rule__SPDiagram__Group__9 : rule__SPDiagram__Group__9__Impl ;
    public final void rule__SPDiagram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3077:1: ( rule__SPDiagram__Group__9__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3078:2: rule__SPDiagram__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__9__Impl_in_rule__SPDiagram__Group__96383);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3084:1: rule__SPDiagram__Group__9__Impl : ( '}' ) ;
    public final void rule__SPDiagram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3088:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3089:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3089:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3090:1: '}'
            {
             before(grammarAccess.getSPDiagramAccess().getRightCurlyBracketKeyword_9()); 
            match(input,41,FOLLOW_41_in_rule__SPDiagram__Group__9__Impl6411); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3123:1: rule__SPDiagram__Group_3__0 : rule__SPDiagram__Group_3__0__Impl rule__SPDiagram__Group_3__1 ;
    public final void rule__SPDiagram__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3127:1: ( rule__SPDiagram__Group_3__0__Impl rule__SPDiagram__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3128:2: rule__SPDiagram__Group_3__0__Impl rule__SPDiagram__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_3__0__Impl_in_rule__SPDiagram__Group_3__06462);
            rule__SPDiagram__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group_3__1_in_rule__SPDiagram__Group_3__06465);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3135:1: rule__SPDiagram__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__SPDiagram__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3139:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3140:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3140:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3141:1: 'label'
            {
             before(grammarAccess.getSPDiagramAccess().getLabelKeyword_3_0()); 
            match(input,48,FOLLOW_48_in_rule__SPDiagram__Group_3__0__Impl6493); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3154:1: rule__SPDiagram__Group_3__1 : rule__SPDiagram__Group_3__1__Impl ;
    public final void rule__SPDiagram__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3158:1: ( rule__SPDiagram__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3159:2: rule__SPDiagram__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_3__1__Impl_in_rule__SPDiagram__Group_3__16524);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3165:1: rule__SPDiagram__Group_3__1__Impl : ( ( rule__SPDiagram__LabelAssignment_3_1 ) ) ;
    public final void rule__SPDiagram__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3169:1: ( ( ( rule__SPDiagram__LabelAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3170:1: ( ( rule__SPDiagram__LabelAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3170:1: ( ( rule__SPDiagram__LabelAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3171:1: ( rule__SPDiagram__LabelAssignment_3_1 )
            {
             before(grammarAccess.getSPDiagramAccess().getLabelAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3172:1: ( rule__SPDiagram__LabelAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3172:2: rule__SPDiagram__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPDiagram__LabelAssignment_3_1_in_rule__SPDiagram__Group_3__1__Impl6551);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3186:1: rule__SPDiagram__Group_4__0 : rule__SPDiagram__Group_4__0__Impl rule__SPDiagram__Group_4__1 ;
    public final void rule__SPDiagram__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3190:1: ( rule__SPDiagram__Group_4__0__Impl rule__SPDiagram__Group_4__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3191:2: rule__SPDiagram__Group_4__0__Impl rule__SPDiagram__Group_4__1
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_4__0__Impl_in_rule__SPDiagram__Group_4__06585);
            rule__SPDiagram__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group_4__1_in_rule__SPDiagram__Group_4__06588);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3198:1: rule__SPDiagram__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__SPDiagram__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3202:1: ( ( 'title' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3203:1: ( 'title' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3203:1: ( 'title' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3204:1: 'title'
            {
             before(grammarAccess.getSPDiagramAccess().getTitleKeyword_4_0()); 
            match(input,49,FOLLOW_49_in_rule__SPDiagram__Group_4__0__Impl6616); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3217:1: rule__SPDiagram__Group_4__1 : rule__SPDiagram__Group_4__1__Impl ;
    public final void rule__SPDiagram__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3221:1: ( rule__SPDiagram__Group_4__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3222:2: rule__SPDiagram__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_4__1__Impl_in_rule__SPDiagram__Group_4__16647);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3228:1: rule__SPDiagram__Group_4__1__Impl : ( ( rule__SPDiagram__TitleAssignment_4_1 ) ) ;
    public final void rule__SPDiagram__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3232:1: ( ( ( rule__SPDiagram__TitleAssignment_4_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3233:1: ( ( rule__SPDiagram__TitleAssignment_4_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3233:1: ( ( rule__SPDiagram__TitleAssignment_4_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3234:1: ( rule__SPDiagram__TitleAssignment_4_1 )
            {
             before(grammarAccess.getSPDiagramAccess().getTitleAssignment_4_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3235:1: ( rule__SPDiagram__TitleAssignment_4_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3235:2: rule__SPDiagram__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SPDiagram__TitleAssignment_4_1_in_rule__SPDiagram__Group_4__1__Impl6674);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3249:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3253:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3254:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__06708);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__1_in_rule__Container__Group__06711);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3261:1: rule__Container__Group__0__Impl : ( ( rule__Container__CreatableAssignment_0 )? ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3265:1: ( ( ( rule__Container__CreatableAssignment_0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3266:1: ( ( rule__Container__CreatableAssignment_0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3266:1: ( ( rule__Container__CreatableAssignment_0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3267:1: ( rule__Container__CreatableAssignment_0 )?
            {
             before(grammarAccess.getContainerAccess().getCreatableAssignment_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3268:1: ( rule__Container__CreatableAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==70) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3268:2: rule__Container__CreatableAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Container__CreatableAssignment_0_in_rule__Container__Group__0__Impl6738);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3278:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3282:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3283:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__16769);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__2_in_rule__Container__Group__16772);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3290:1: rule__Container__Group__1__Impl : ( ( rule__Container__RecursiveAssignment_1 )? ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3294:1: ( ( ( rule__Container__RecursiveAssignment_1 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3295:1: ( ( rule__Container__RecursiveAssignment_1 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3295:1: ( ( rule__Container__RecursiveAssignment_1 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3296:1: ( rule__Container__RecursiveAssignment_1 )?
            {
             before(grammarAccess.getContainerAccess().getRecursiveAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3297:1: ( rule__Container__RecursiveAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==71) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3297:2: rule__Container__RecursiveAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Container__RecursiveAssignment_1_in_rule__Container__Group__1__Impl6799);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3307:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3311:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3312:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__26830);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__3_in_rule__Container__Group__26833);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3319:1: rule__Container__Group__2__Impl : ( ( rule__Container__ContainerTypeAssignment_2 )? ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3323:1: ( ( ( rule__Container__ContainerTypeAssignment_2 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3324:1: ( ( rule__Container__ContainerTypeAssignment_2 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3324:1: ( ( rule__Container__ContainerTypeAssignment_2 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3325:1: ( rule__Container__ContainerTypeAssignment_2 )?
            {
             before(grammarAccess.getContainerAccess().getContainerTypeAssignment_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3326:1: ( rule__Container__ContainerTypeAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=11 && LA29_0<=12)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3326:2: rule__Container__ContainerTypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Container__ContainerTypeAssignment_2_in_rule__Container__Group__2__Impl6860);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3336:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3340:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3341:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__36891);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__4_in_rule__Container__Group__36894);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3348:1: rule__Container__Group__3__Impl : ( 'container' ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3352:1: ( ( 'container' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3353:1: ( 'container' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3353:1: ( 'container' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3354:1: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_3()); 
            match(input,55,FOLLOW_55_in_rule__Container__Group__3__Impl6922); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3367:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3371:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3372:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_rule__Container__Group__4__Impl_in_rule__Container__Group__46953);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__5_in_rule__Container__Group__46956);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3379:1: rule__Container__Group__4__Impl : ( ( rule__Container__NameAssignment_4 ) ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3383:1: ( ( ( rule__Container__NameAssignment_4 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3384:1: ( ( rule__Container__NameAssignment_4 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3384:1: ( ( rule__Container__NameAssignment_4 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3385:1: ( rule__Container__NameAssignment_4 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3386:1: ( rule__Container__NameAssignment_4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3386:2: rule__Container__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Container__NameAssignment_4_in_rule__Container__Group__4__Impl6983);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3396:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3400:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3401:2: rule__Container__Group__5__Impl rule__Container__Group__6
            {
            pushFollow(FOLLOW_rule__Container__Group__5__Impl_in_rule__Container__Group__57013);
            rule__Container__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__6_in_rule__Container__Group__57016);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3408:1: rule__Container__Group__5__Impl : ( 'for' ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3412:1: ( ( 'for' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3413:1: ( 'for' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3413:1: ( 'for' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3414:1: 'for'
            {
             before(grammarAccess.getContainerAccess().getForKeyword_5()); 
            match(input,56,FOLLOW_56_in_rule__Container__Group__5__Impl7044); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3427:1: rule__Container__Group__6 : rule__Container__Group__6__Impl rule__Container__Group__7 ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3431:1: ( rule__Container__Group__6__Impl rule__Container__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3432:2: rule__Container__Group__6__Impl rule__Container__Group__7
            {
            pushFollow(FOLLOW_rule__Container__Group__6__Impl_in_rule__Container__Group__67075);
            rule__Container__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__7_in_rule__Container__Group__67078);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3439:1: rule__Container__Group__6__Impl : ( ( rule__Container__EClassAssignment_6 ) ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3443:1: ( ( ( rule__Container__EClassAssignment_6 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3444:1: ( ( rule__Container__EClassAssignment_6 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3444:1: ( ( rule__Container__EClassAssignment_6 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3445:1: ( rule__Container__EClassAssignment_6 )
            {
             before(grammarAccess.getContainerAccess().getEClassAssignment_6()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3446:1: ( rule__Container__EClassAssignment_6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3446:2: rule__Container__EClassAssignment_6
            {
            pushFollow(FOLLOW_rule__Container__EClassAssignment_6_in_rule__Container__Group__6__Impl7105);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3456:1: rule__Container__Group__7 : rule__Container__Group__7__Impl rule__Container__Group__8 ;
    public final void rule__Container__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3460:1: ( rule__Container__Group__7__Impl rule__Container__Group__8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3461:2: rule__Container__Group__7__Impl rule__Container__Group__8
            {
            pushFollow(FOLLOW_rule__Container__Group__7__Impl_in_rule__Container__Group__77135);
            rule__Container__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__8_in_rule__Container__Group__77138);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3468:1: rule__Container__Group__7__Impl : ( 'accessibleThrough' ) ;
    public final void rule__Container__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3472:1: ( ( 'accessibleThrough' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3473:1: ( 'accessibleThrough' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3473:1: ( 'accessibleThrough' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3474:1: 'accessibleThrough'
            {
             before(grammarAccess.getContainerAccess().getAccessibleThroughKeyword_7()); 
            match(input,51,FOLLOW_51_in_rule__Container__Group__7__Impl7166); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3487:1: rule__Container__Group__8 : rule__Container__Group__8__Impl rule__Container__Group__9 ;
    public final void rule__Container__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3491:1: ( rule__Container__Group__8__Impl rule__Container__Group__9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3492:2: rule__Container__Group__8__Impl rule__Container__Group__9
            {
            pushFollow(FOLLOW_rule__Container__Group__8__Impl_in_rule__Container__Group__87197);
            rule__Container__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__9_in_rule__Container__Group__87200);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3499:1: rule__Container__Group__8__Impl : ( ( rule__Container__ExpressionAssignment_8 ) ) ;
    public final void rule__Container__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3503:1: ( ( ( rule__Container__ExpressionAssignment_8 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3504:1: ( ( rule__Container__ExpressionAssignment_8 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3504:1: ( ( rule__Container__ExpressionAssignment_8 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3505:1: ( rule__Container__ExpressionAssignment_8 )
            {
             before(grammarAccess.getContainerAccess().getExpressionAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3506:1: ( rule__Container__ExpressionAssignment_8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3506:2: rule__Container__ExpressionAssignment_8
            {
            pushFollow(FOLLOW_rule__Container__ExpressionAssignment_8_in_rule__Container__Group__8__Impl7227);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3516:1: rule__Container__Group__9 : rule__Container__Group__9__Impl rule__Container__Group__10 ;
    public final void rule__Container__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3520:1: ( rule__Container__Group__9__Impl rule__Container__Group__10 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3521:2: rule__Container__Group__9__Impl rule__Container__Group__10
            {
            pushFollow(FOLLOW_rule__Container__Group__9__Impl_in_rule__Container__Group__97257);
            rule__Container__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__10_in_rule__Container__Group__97260);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3528:1: rule__Container__Group__9__Impl : ( ( rule__Container__StyleAssignment_9 )? ) ;
    public final void rule__Container__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3532:1: ( ( ( rule__Container__StyleAssignment_9 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3533:1: ( ( rule__Container__StyleAssignment_9 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3533:1: ( ( rule__Container__StyleAssignment_9 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3534:1: ( rule__Container__StyleAssignment_9 )?
            {
             before(grammarAccess.getContainerAccess().getStyleAssignment_9()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3535:1: ( rule__Container__StyleAssignment_9 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3535:2: rule__Container__StyleAssignment_9
                    {
                    pushFollow(FOLLOW_rule__Container__StyleAssignment_9_in_rule__Container__Group__9__Impl7287);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3545:1: rule__Container__Group__10 : rule__Container__Group__10__Impl ;
    public final void rule__Container__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3549:1: ( rule__Container__Group__10__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3550:2: rule__Container__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Container__Group__10__Impl_in_rule__Container__Group__107318);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3556:1: rule__Container__Group__10__Impl : ( ( rule__Container__Group_10__0 )? ) ;
    public final void rule__Container__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3560:1: ( ( ( rule__Container__Group_10__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3561:1: ( ( rule__Container__Group_10__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3561:1: ( ( rule__Container__Group_10__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3562:1: ( rule__Container__Group_10__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_10()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3563:1: ( rule__Container__Group_10__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3563:2: rule__Container__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Container__Group_10__0_in_rule__Container__Group__10__Impl7345);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3595:1: rule__Container__Group_10__0 : rule__Container__Group_10__0__Impl rule__Container__Group_10__1 ;
    public final void rule__Container__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3599:1: ( rule__Container__Group_10__0__Impl rule__Container__Group_10__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3600:2: rule__Container__Group_10__0__Impl rule__Container__Group_10__1
            {
            pushFollow(FOLLOW_rule__Container__Group_10__0__Impl_in_rule__Container__Group_10__07398);
            rule__Container__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group_10__1_in_rule__Container__Group_10__07401);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3607:1: rule__Container__Group_10__0__Impl : ( '{' ) ;
    public final void rule__Container__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3611:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3612:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3612:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3613:1: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10_0()); 
            match(input,40,FOLLOW_40_in_rule__Container__Group_10__0__Impl7429); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3626:1: rule__Container__Group_10__1 : rule__Container__Group_10__1__Impl rule__Container__Group_10__2 ;
    public final void rule__Container__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3630:1: ( rule__Container__Group_10__1__Impl rule__Container__Group_10__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3631:2: rule__Container__Group_10__1__Impl rule__Container__Group_10__2
            {
            pushFollow(FOLLOW_rule__Container__Group_10__1__Impl_in_rule__Container__Group_10__17460);
            rule__Container__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group_10__2_in_rule__Container__Group_10__17463);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3638:1: rule__Container__Group_10__1__Impl : ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) ) ;
    public final void rule__Container__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3642:1: ( ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3643:1: ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3643:1: ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3644:1: ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3644:1: ( ( rule__Container__ElementsAssignment_10_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3645:1: ( rule__Container__ElementsAssignment_10_1 )
            {
             before(grammarAccess.getContainerAccess().getElementsAssignment_10_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3646:1: ( rule__Container__ElementsAssignment_10_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3646:2: rule__Container__ElementsAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl7492);
            rule__Container__ElementsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getElementsAssignment_10_1()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3649:1: ( ( rule__Container__ElementsAssignment_10_1 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3650:1: ( rule__Container__ElementsAssignment_10_1 )*
            {
             before(grammarAccess.getContainerAccess().getElementsAssignment_10_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3651:1: ( rule__Container__ElementsAssignment_10_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=11 && LA32_0<=12)||LA32_0==55||LA32_0==60||(LA32_0>=70 && LA32_0<=71)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3651:2: rule__Container__ElementsAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl7504);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3662:1: rule__Container__Group_10__2 : rule__Container__Group_10__2__Impl ;
    public final void rule__Container__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3666:1: ( rule__Container__Group_10__2__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3667:2: rule__Container__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Container__Group_10__2__Impl_in_rule__Container__Group_10__27537);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3673:1: rule__Container__Group_10__2__Impl : ( '}' ) ;
    public final void rule__Container__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3677:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3678:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3678:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3679:1: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_10_2()); 
            match(input,41,FOLLOW_41_in_rule__Container__Group_10__2__Impl7565); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3698:1: rule__ContainerStyleDefinition__Group__0 : rule__ContainerStyleDefinition__Group__0__Impl rule__ContainerStyleDefinition__Group__1 ;
    public final void rule__ContainerStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3702:1: ( rule__ContainerStyleDefinition__Group__0__Impl rule__ContainerStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3703:2: rule__ContainerStyleDefinition__Group__0__Impl rule__ContainerStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__0__Impl_in_rule__ContainerStyleDefinition__Group__07602);
            rule__ContainerStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__1_in_rule__ContainerStyleDefinition__Group__07605);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3710:1: rule__ContainerStyleDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__ContainerStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3714:1: ( ( '[' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3715:1: ( '[' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3715:1: ( '[' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3716:1: '['
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__ContainerStyleDefinition__Group__0__Impl7633); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3729:1: rule__ContainerStyleDefinition__Group__1 : rule__ContainerStyleDefinition__Group__1__Impl rule__ContainerStyleDefinition__Group__2 ;
    public final void rule__ContainerStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3733:1: ( rule__ContainerStyleDefinition__Group__1__Impl rule__ContainerStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3734:2: rule__ContainerStyleDefinition__Group__1__Impl rule__ContainerStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__1__Impl_in_rule__ContainerStyleDefinition__Group__17664);
            rule__ContainerStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__2_in_rule__ContainerStyleDefinition__Group__17667);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3741:1: rule__ContainerStyleDefinition__Group__1__Impl : ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) ) ;
    public final void rule__ContainerStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3745:1: ( ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3746:1: ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3746:1: ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3747:1: ( rule__ContainerStyleDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3748:1: ( rule__ContainerStyleDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3748:2: rule__ContainerStyleDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__ColorAssignment_1_in_rule__ContainerStyleDefinition__Group__1__Impl7694);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3758:1: rule__ContainerStyleDefinition__Group__2 : rule__ContainerStyleDefinition__Group__2__Impl rule__ContainerStyleDefinition__Group__3 ;
    public final void rule__ContainerStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3762:1: ( rule__ContainerStyleDefinition__Group__2__Impl rule__ContainerStyleDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3763:2: rule__ContainerStyleDefinition__Group__2__Impl rule__ContainerStyleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__2__Impl_in_rule__ContainerStyleDefinition__Group__27724);
            rule__ContainerStyleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__3_in_rule__ContainerStyleDefinition__Group__27727);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3770:1: rule__ContainerStyleDefinition__Group__2__Impl : ( ( rule__ContainerStyleDefinition__Group_2__0 )? ) ;
    public final void rule__ContainerStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3774:1: ( ( ( rule__ContainerStyleDefinition__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3775:1: ( ( rule__ContainerStyleDefinition__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3775:1: ( ( rule__ContainerStyleDefinition__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3776:1: ( rule__ContainerStyleDefinition__Group_2__0 )?
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3777:1: ( rule__ContainerStyleDefinition__Group_2__0 )?
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
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3777:2: rule__ContainerStyleDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__0_in_rule__ContainerStyleDefinition__Group__2__Impl7754);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3787:1: rule__ContainerStyleDefinition__Group__3 : rule__ContainerStyleDefinition__Group__3__Impl rule__ContainerStyleDefinition__Group__4 ;
    public final void rule__ContainerStyleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3791:1: ( rule__ContainerStyleDefinition__Group__3__Impl rule__ContainerStyleDefinition__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3792:2: rule__ContainerStyleDefinition__Group__3__Impl rule__ContainerStyleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__3__Impl_in_rule__ContainerStyleDefinition__Group__37785);
            rule__ContainerStyleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__4_in_rule__ContainerStyleDefinition__Group__37788);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3799:1: rule__ContainerStyleDefinition__Group__3__Impl : ( ( rule__ContainerStyleDefinition__Group_3__0 )? ) ;
    public final void rule__ContainerStyleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3803:1: ( ( ( rule__ContainerStyleDefinition__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3804:1: ( ( rule__ContainerStyleDefinition__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3804:1: ( ( rule__ContainerStyleDefinition__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3805:1: ( rule__ContainerStyleDefinition__Group_3__0 )?
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3806:1: ( rule__ContainerStyleDefinition__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3806:2: rule__ContainerStyleDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__0_in_rule__ContainerStyleDefinition__Group__3__Impl7815);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3816:1: rule__ContainerStyleDefinition__Group__4 : rule__ContainerStyleDefinition__Group__4__Impl ;
    public final void rule__ContainerStyleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3820:1: ( rule__ContainerStyleDefinition__Group__4__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3821:2: rule__ContainerStyleDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__4__Impl_in_rule__ContainerStyleDefinition__Group__47846);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3827:1: rule__ContainerStyleDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__ContainerStyleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3831:1: ( ( ']' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3832:1: ( ']' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3832:1: ( ']' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3833:1: ']'
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getRightSquareBracketKeyword_4()); 
            match(input,58,FOLLOW_58_in_rule__ContainerStyleDefinition__Group__4__Impl7874); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3856:1: rule__ContainerStyleDefinition__Group_2__0 : rule__ContainerStyleDefinition__Group_2__0__Impl rule__ContainerStyleDefinition__Group_2__1 ;
    public final void rule__ContainerStyleDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3860:1: ( rule__ContainerStyleDefinition__Group_2__0__Impl rule__ContainerStyleDefinition__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3861:2: rule__ContainerStyleDefinition__Group_2__0__Impl rule__ContainerStyleDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__0__Impl_in_rule__ContainerStyleDefinition__Group_2__07915);
            rule__ContainerStyleDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__1_in_rule__ContainerStyleDefinition__Group_2__07918);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3868:1: rule__ContainerStyleDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ContainerStyleDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3872:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3873:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3873:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3874:1: ','
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,59,FOLLOW_59_in_rule__ContainerStyleDefinition__Group_2__0__Impl7946); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3887:1: rule__ContainerStyleDefinition__Group_2__1 : rule__ContainerStyleDefinition__Group_2__1__Impl ;
    public final void rule__ContainerStyleDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3891:1: ( rule__ContainerStyleDefinition__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3892:2: rule__ContainerStyleDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__1__Impl_in_rule__ContainerStyleDefinition__Group_2__17977);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3898:1: rule__ContainerStyleDefinition__Group_2__1__Impl : ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) ) ;
    public final void rule__ContainerStyleDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3902:1: ( ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3903:1: ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3903:1: ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3904:1: ( rule__ContainerStyleDefinition__LabelAssignment_2_1 )
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getLabelAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3905:1: ( rule__ContainerStyleDefinition__LabelAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3905:2: rule__ContainerStyleDefinition__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__LabelAssignment_2_1_in_rule__ContainerStyleDefinition__Group_2__1__Impl8004);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3919:1: rule__ContainerStyleDefinition__Group_3__0 : rule__ContainerStyleDefinition__Group_3__0__Impl rule__ContainerStyleDefinition__Group_3__1 ;
    public final void rule__ContainerStyleDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3923:1: ( rule__ContainerStyleDefinition__Group_3__0__Impl rule__ContainerStyleDefinition__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3924:2: rule__ContainerStyleDefinition__Group_3__0__Impl rule__ContainerStyleDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__0__Impl_in_rule__ContainerStyleDefinition__Group_3__08038);
            rule__ContainerStyleDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__1_in_rule__ContainerStyleDefinition__Group_3__08041);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3931:1: rule__ContainerStyleDefinition__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ContainerStyleDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3935:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3936:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3936:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3937:1: ','
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_3_0()); 
            match(input,59,FOLLOW_59_in_rule__ContainerStyleDefinition__Group_3__0__Impl8069); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3950:1: rule__ContainerStyleDefinition__Group_3__1 : rule__ContainerStyleDefinition__Group_3__1__Impl ;
    public final void rule__ContainerStyleDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3954:1: ( rule__ContainerStyleDefinition__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3955:2: rule__ContainerStyleDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__1__Impl_in_rule__ContainerStyleDefinition__Group_3__18100);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3961:1: rule__ContainerStyleDefinition__Group_3__1__Impl : ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) ) ;
    public final void rule__ContainerStyleDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3965:1: ( ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3966:1: ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3966:1: ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3967:1: ( rule__ContainerStyleDefinition__BorderAssignment_3_1 )
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getBorderAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3968:1: ( rule__ContainerStyleDefinition__BorderAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3968:2: rule__ContainerStyleDefinition__BorderAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__BorderAssignment_3_1_in_rule__ContainerStyleDefinition__Group_3__1__Impl8127);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3982:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3986:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3987:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__08161);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__08164);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3994:1: rule__Node__Group__0__Impl : ( ( rule__Node__CreatableAssignment_0 )? ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3998:1: ( ( ( rule__Node__CreatableAssignment_0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3999:1: ( ( rule__Node__CreatableAssignment_0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3999:1: ( ( rule__Node__CreatableAssignment_0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4000:1: ( rule__Node__CreatableAssignment_0 )?
            {
             before(grammarAccess.getNodeAccess().getCreatableAssignment_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4001:1: ( rule__Node__CreatableAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4001:2: rule__Node__CreatableAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Node__CreatableAssignment_0_in_rule__Node__Group__0__Impl8191);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4011:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4015:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4016:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__18222);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__18225);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4023:1: rule__Node__Group__1__Impl : ( 'node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4027:1: ( ( 'node' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4028:1: ( 'node' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4028:1: ( 'node' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4029:1: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__Node__Group__1__Impl8253); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4042:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4046:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4047:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__28284);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__28287);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4054:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4058:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4059:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4059:1: ( ( rule__Node__NameAssignment_2 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4060:1: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4061:1: ( rule__Node__NameAssignment_2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4061:2: rule__Node__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl8314);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4071:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4075:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4076:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__38344);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__4_in_rule__Node__Group__38347);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4083:1: rule__Node__Group__3__Impl : ( 'for' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4087:1: ( ( 'for' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4088:1: ( 'for' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4088:1: ( 'for' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4089:1: 'for'
            {
             before(grammarAccess.getNodeAccess().getForKeyword_3()); 
            match(input,56,FOLLOW_56_in_rule__Node__Group__3__Impl8375); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4102:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4106:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4107:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__48406);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__5_in_rule__Node__Group__48409);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4114:1: rule__Node__Group__4__Impl : ( ( rule__Node__EClassAssignment_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4118:1: ( ( ( rule__Node__EClassAssignment_4 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4119:1: ( ( rule__Node__EClassAssignment_4 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4119:1: ( ( rule__Node__EClassAssignment_4 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4120:1: ( rule__Node__EClassAssignment_4 )
            {
             before(grammarAccess.getNodeAccess().getEClassAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4121:1: ( rule__Node__EClassAssignment_4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4121:2: rule__Node__EClassAssignment_4
            {
            pushFollow(FOLLOW_rule__Node__EClassAssignment_4_in_rule__Node__Group__4__Impl8436);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4131:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4135:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4136:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__58466);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__6_in_rule__Node__Group__58469);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4143:1: rule__Node__Group__5__Impl : ( 'accessibleThrough' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4147:1: ( ( 'accessibleThrough' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4148:1: ( 'accessibleThrough' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4148:1: ( 'accessibleThrough' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4149:1: 'accessibleThrough'
            {
             before(grammarAccess.getNodeAccess().getAccessibleThroughKeyword_5()); 
            match(input,51,FOLLOW_51_in_rule__Node__Group__5__Impl8497); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4162:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4166:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4167:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__68528);
            rule__Node__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__7_in_rule__Node__Group__68531);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4174:1: rule__Node__Group__6__Impl : ( ( rule__Node__ExpressionAssignment_6 ) ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4178:1: ( ( ( rule__Node__ExpressionAssignment_6 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4179:1: ( ( rule__Node__ExpressionAssignment_6 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4179:1: ( ( rule__Node__ExpressionAssignment_6 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4180:1: ( rule__Node__ExpressionAssignment_6 )
            {
             before(grammarAccess.getNodeAccess().getExpressionAssignment_6()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4181:1: ( rule__Node__ExpressionAssignment_6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4181:2: rule__Node__ExpressionAssignment_6
            {
            pushFollow(FOLLOW_rule__Node__ExpressionAssignment_6_in_rule__Node__Group__6__Impl8558);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4191:1: rule__Node__Group__7 : rule__Node__Group__7__Impl ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4195:1: ( rule__Node__Group__7__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4196:2: rule__Node__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__78588);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4202:1: rule__Node__Group__7__Impl : ( ( rule__Node__StyleAssignment_7 )? ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4206:1: ( ( ( rule__Node__StyleAssignment_7 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4207:1: ( ( rule__Node__StyleAssignment_7 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4207:1: ( ( rule__Node__StyleAssignment_7 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4208:1: ( rule__Node__StyleAssignment_7 )?
            {
             before(grammarAccess.getNodeAccess().getStyleAssignment_7()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4209:1: ( rule__Node__StyleAssignment_7 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==57) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4209:2: rule__Node__StyleAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Node__StyleAssignment_7_in_rule__Node__Group__7__Impl8615);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4235:1: rule__NodeStyleDefinition__Group__0 : rule__NodeStyleDefinition__Group__0__Impl rule__NodeStyleDefinition__Group__1 ;
    public final void rule__NodeStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4239:1: ( rule__NodeStyleDefinition__Group__0__Impl rule__NodeStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4240:2: rule__NodeStyleDefinition__Group__0__Impl rule__NodeStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__0__Impl_in_rule__NodeStyleDefinition__Group__08662);
            rule__NodeStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__1_in_rule__NodeStyleDefinition__Group__08665);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4247:1: rule__NodeStyleDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__NodeStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4251:1: ( ( '[' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4252:1: ( '[' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4252:1: ( '[' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4253:1: '['
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__NodeStyleDefinition__Group__0__Impl8693); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4266:1: rule__NodeStyleDefinition__Group__1 : rule__NodeStyleDefinition__Group__1__Impl rule__NodeStyleDefinition__Group__2 ;
    public final void rule__NodeStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4270:1: ( rule__NodeStyleDefinition__Group__1__Impl rule__NodeStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4271:2: rule__NodeStyleDefinition__Group__1__Impl rule__NodeStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__1__Impl_in_rule__NodeStyleDefinition__Group__18724);
            rule__NodeStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__2_in_rule__NodeStyleDefinition__Group__18727);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4278:1: rule__NodeStyleDefinition__Group__1__Impl : ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) ) ;
    public final void rule__NodeStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4282:1: ( ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4283:1: ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4283:1: ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4284:1: ( rule__NodeStyleDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4285:1: ( rule__NodeStyleDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4285:2: rule__NodeStyleDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__ColorAssignment_1_in_rule__NodeStyleDefinition__Group__1__Impl8754);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4295:1: rule__NodeStyleDefinition__Group__2 : rule__NodeStyleDefinition__Group__2__Impl rule__NodeStyleDefinition__Group__3 ;
    public final void rule__NodeStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4299:1: ( rule__NodeStyleDefinition__Group__2__Impl rule__NodeStyleDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4300:2: rule__NodeStyleDefinition__Group__2__Impl rule__NodeStyleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__2__Impl_in_rule__NodeStyleDefinition__Group__28784);
            rule__NodeStyleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__3_in_rule__NodeStyleDefinition__Group__28787);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4307:1: rule__NodeStyleDefinition__Group__2__Impl : ( ( rule__NodeStyleDefinition__Group_2__0 )? ) ;
    public final void rule__NodeStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4311:1: ( ( ( rule__NodeStyleDefinition__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4312:1: ( ( rule__NodeStyleDefinition__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4312:1: ( ( rule__NodeStyleDefinition__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4313:1: ( rule__NodeStyleDefinition__Group_2__0 )?
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4314:1: ( rule__NodeStyleDefinition__Group_2__0 )?
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
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4314:2: rule__NodeStyleDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__0_in_rule__NodeStyleDefinition__Group__2__Impl8814);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4324:1: rule__NodeStyleDefinition__Group__3 : rule__NodeStyleDefinition__Group__3__Impl rule__NodeStyleDefinition__Group__4 ;
    public final void rule__NodeStyleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4328:1: ( rule__NodeStyleDefinition__Group__3__Impl rule__NodeStyleDefinition__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4329:2: rule__NodeStyleDefinition__Group__3__Impl rule__NodeStyleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__3__Impl_in_rule__NodeStyleDefinition__Group__38845);
            rule__NodeStyleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__4_in_rule__NodeStyleDefinition__Group__38848);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4336:1: rule__NodeStyleDefinition__Group__3__Impl : ( ( rule__NodeStyleDefinition__Group_3__0 )? ) ;
    public final void rule__NodeStyleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4340:1: ( ( ( rule__NodeStyleDefinition__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4341:1: ( ( rule__NodeStyleDefinition__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4341:1: ( ( rule__NodeStyleDefinition__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4342:1: ( rule__NodeStyleDefinition__Group_3__0 )?
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4343:1: ( rule__NodeStyleDefinition__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==59) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4343:2: rule__NodeStyleDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__0_in_rule__NodeStyleDefinition__Group__3__Impl8875);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4353:1: rule__NodeStyleDefinition__Group__4 : rule__NodeStyleDefinition__Group__4__Impl ;
    public final void rule__NodeStyleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4357:1: ( rule__NodeStyleDefinition__Group__4__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4358:2: rule__NodeStyleDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__4__Impl_in_rule__NodeStyleDefinition__Group__48906);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4364:1: rule__NodeStyleDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__NodeStyleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4368:1: ( ( ']' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4369:1: ( ']' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4369:1: ( ']' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4370:1: ']'
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getRightSquareBracketKeyword_4()); 
            match(input,58,FOLLOW_58_in_rule__NodeStyleDefinition__Group__4__Impl8934); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4393:1: rule__NodeStyleDefinition__Group_2__0 : rule__NodeStyleDefinition__Group_2__0__Impl rule__NodeStyleDefinition__Group_2__1 ;
    public final void rule__NodeStyleDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4397:1: ( rule__NodeStyleDefinition__Group_2__0__Impl rule__NodeStyleDefinition__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4398:2: rule__NodeStyleDefinition__Group_2__0__Impl rule__NodeStyleDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__0__Impl_in_rule__NodeStyleDefinition__Group_2__08975);
            rule__NodeStyleDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__1_in_rule__NodeStyleDefinition__Group_2__08978);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4405:1: rule__NodeStyleDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NodeStyleDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4409:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4410:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4410:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4411:1: ','
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,59,FOLLOW_59_in_rule__NodeStyleDefinition__Group_2__0__Impl9006); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4424:1: rule__NodeStyleDefinition__Group_2__1 : rule__NodeStyleDefinition__Group_2__1__Impl ;
    public final void rule__NodeStyleDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4428:1: ( rule__NodeStyleDefinition__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4429:2: rule__NodeStyleDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__1__Impl_in_rule__NodeStyleDefinition__Group_2__19037);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4435:1: rule__NodeStyleDefinition__Group_2__1__Impl : ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) ) ;
    public final void rule__NodeStyleDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4439:1: ( ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4440:1: ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4440:1: ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4441:1: ( rule__NodeStyleDefinition__LabelAssignment_2_1 )
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getLabelAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4442:1: ( rule__NodeStyleDefinition__LabelAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4442:2: rule__NodeStyleDefinition__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__LabelAssignment_2_1_in_rule__NodeStyleDefinition__Group_2__1__Impl9064);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4456:1: rule__NodeStyleDefinition__Group_3__0 : rule__NodeStyleDefinition__Group_3__0__Impl rule__NodeStyleDefinition__Group_3__1 ;
    public final void rule__NodeStyleDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4460:1: ( rule__NodeStyleDefinition__Group_3__0__Impl rule__NodeStyleDefinition__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4461:2: rule__NodeStyleDefinition__Group_3__0__Impl rule__NodeStyleDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__0__Impl_in_rule__NodeStyleDefinition__Group_3__09098);
            rule__NodeStyleDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__1_in_rule__NodeStyleDefinition__Group_3__09101);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4468:1: rule__NodeStyleDefinition__Group_3__0__Impl : ( ',' ) ;
    public final void rule__NodeStyleDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4472:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4473:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4473:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4474:1: ','
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_3_0()); 
            match(input,59,FOLLOW_59_in_rule__NodeStyleDefinition__Group_3__0__Impl9129); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4487:1: rule__NodeStyleDefinition__Group_3__1 : rule__NodeStyleDefinition__Group_3__1__Impl ;
    public final void rule__NodeStyleDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4491:1: ( rule__NodeStyleDefinition__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4492:2: rule__NodeStyleDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__1__Impl_in_rule__NodeStyleDefinition__Group_3__19160);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4498:1: rule__NodeStyleDefinition__Group_3__1__Impl : ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) ) ;
    public final void rule__NodeStyleDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4502:1: ( ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4503:1: ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4503:1: ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4504:1: ( rule__NodeStyleDefinition__BorderAssignment_3_1 )
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getBorderAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4505:1: ( rule__NodeStyleDefinition__BorderAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4505:2: rule__NodeStyleDefinition__BorderAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__BorderAssignment_3_1_in_rule__NodeStyleDefinition__Group_3__1__Impl9187);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4519:1: rule__SolidColorDefinition__Group__0 : rule__SolidColorDefinition__Group__0__Impl rule__SolidColorDefinition__Group__1 ;
    public final void rule__SolidColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4523:1: ( rule__SolidColorDefinition__Group__0__Impl rule__SolidColorDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4524:2: rule__SolidColorDefinition__Group__0__Impl rule__SolidColorDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__SolidColorDefinition__Group__0__Impl_in_rule__SolidColorDefinition__Group__09221);
            rule__SolidColorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SolidColorDefinition__Group__1_in_rule__SolidColorDefinition__Group__09224);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4531:1: rule__SolidColorDefinition__Group__0__Impl : ( 'color' ) ;
    public final void rule__SolidColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4535:1: ( ( 'color' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4536:1: ( 'color' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4536:1: ( 'color' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4537:1: 'color'
            {
             before(grammarAccess.getSolidColorDefinitionAccess().getColorKeyword_0()); 
            match(input,61,FOLLOW_61_in_rule__SolidColorDefinition__Group__0__Impl9252); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4550:1: rule__SolidColorDefinition__Group__1 : rule__SolidColorDefinition__Group__1__Impl ;
    public final void rule__SolidColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4554:1: ( rule__SolidColorDefinition__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4555:2: rule__SolidColorDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SolidColorDefinition__Group__1__Impl_in_rule__SolidColorDefinition__Group__19283);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4561:1: rule__SolidColorDefinition__Group__1__Impl : ( ( rule__SolidColorDefinition__ColorAssignment_1 ) ) ;
    public final void rule__SolidColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4565:1: ( ( ( rule__SolidColorDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4566:1: ( ( rule__SolidColorDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4566:1: ( ( rule__SolidColorDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4567:1: ( rule__SolidColorDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getSolidColorDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4568:1: ( rule__SolidColorDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4568:2: rule__SolidColorDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__SolidColorDefinition__ColorAssignment_1_in_rule__SolidColorDefinition__Group__1__Impl9310);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4582:1: rule__GradientColorDefinition__Group__0 : rule__GradientColorDefinition__Group__0__Impl rule__GradientColorDefinition__Group__1 ;
    public final void rule__GradientColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4586:1: ( rule__GradientColorDefinition__Group__0__Impl rule__GradientColorDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4587:2: rule__GradientColorDefinition__Group__0__Impl rule__GradientColorDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__0__Impl_in_rule__GradientColorDefinition__Group__09344);
            rule__GradientColorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__1_in_rule__GradientColorDefinition__Group__09347);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4594:1: rule__GradientColorDefinition__Group__0__Impl : ( 'gradient from' ) ;
    public final void rule__GradientColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4598:1: ( ( 'gradient from' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4599:1: ( 'gradient from' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4599:1: ( 'gradient from' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4600:1: 'gradient from'
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getGradientFromKeyword_0()); 
            match(input,62,FOLLOW_62_in_rule__GradientColorDefinition__Group__0__Impl9375); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4613:1: rule__GradientColorDefinition__Group__1 : rule__GradientColorDefinition__Group__1__Impl rule__GradientColorDefinition__Group__2 ;
    public final void rule__GradientColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4617:1: ( rule__GradientColorDefinition__Group__1__Impl rule__GradientColorDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4618:2: rule__GradientColorDefinition__Group__1__Impl rule__GradientColorDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__1__Impl_in_rule__GradientColorDefinition__Group__19406);
            rule__GradientColorDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__2_in_rule__GradientColorDefinition__Group__19409);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4625:1: rule__GradientColorDefinition__Group__1__Impl : ( ( rule__GradientColorDefinition__FromAssignment_1 ) ) ;
    public final void rule__GradientColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4629:1: ( ( ( rule__GradientColorDefinition__FromAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4630:1: ( ( rule__GradientColorDefinition__FromAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4630:1: ( ( rule__GradientColorDefinition__FromAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4631:1: ( rule__GradientColorDefinition__FromAssignment_1 )
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getFromAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4632:1: ( rule__GradientColorDefinition__FromAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4632:2: rule__GradientColorDefinition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__FromAssignment_1_in_rule__GradientColorDefinition__Group__1__Impl9436);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4642:1: rule__GradientColorDefinition__Group__2 : rule__GradientColorDefinition__Group__2__Impl rule__GradientColorDefinition__Group__3 ;
    public final void rule__GradientColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4646:1: ( rule__GradientColorDefinition__Group__2__Impl rule__GradientColorDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4647:2: rule__GradientColorDefinition__Group__2__Impl rule__GradientColorDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__2__Impl_in_rule__GradientColorDefinition__Group__29466);
            rule__GradientColorDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__3_in_rule__GradientColorDefinition__Group__29469);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4654:1: rule__GradientColorDefinition__Group__2__Impl : ( 'to' ) ;
    public final void rule__GradientColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4658:1: ( ( 'to' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4659:1: ( 'to' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4659:1: ( 'to' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4660:1: 'to'
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getToKeyword_2()); 
            match(input,63,FOLLOW_63_in_rule__GradientColorDefinition__Group__2__Impl9497); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4673:1: rule__GradientColorDefinition__Group__3 : rule__GradientColorDefinition__Group__3__Impl ;
    public final void rule__GradientColorDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4677:1: ( rule__GradientColorDefinition__Group__3__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4678:2: rule__GradientColorDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__3__Impl_in_rule__GradientColorDefinition__Group__39528);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4684:1: rule__GradientColorDefinition__Group__3__Impl : ( ( rule__GradientColorDefinition__ToAssignment_3 ) ) ;
    public final void rule__GradientColorDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4688:1: ( ( ( rule__GradientColorDefinition__ToAssignment_3 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4689:1: ( ( rule__GradientColorDefinition__ToAssignment_3 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4689:1: ( ( rule__GradientColorDefinition__ToAssignment_3 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4690:1: ( rule__GradientColorDefinition__ToAssignment_3 )
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getToAssignment_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4691:1: ( rule__GradientColorDefinition__ToAssignment_3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4691:2: rule__GradientColorDefinition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__ToAssignment_3_in_rule__GradientColorDefinition__Group__3__Impl9555);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4709:1: rule__LabelStyleDefinition__Group__0 : rule__LabelStyleDefinition__Group__0__Impl rule__LabelStyleDefinition__Group__1 ;
    public final void rule__LabelStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4713:1: ( rule__LabelStyleDefinition__Group__0__Impl rule__LabelStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4714:2: rule__LabelStyleDefinition__Group__0__Impl rule__LabelStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__0__Impl_in_rule__LabelStyleDefinition__Group__09593);
            rule__LabelStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__1_in_rule__LabelStyleDefinition__Group__09596);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4721:1: rule__LabelStyleDefinition__Group__0__Impl : ( 'label' ) ;
    public final void rule__LabelStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4725:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4726:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4726:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4727:1: 'label'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getLabelKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__LabelStyleDefinition__Group__0__Impl9624); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4740:1: rule__LabelStyleDefinition__Group__1 : rule__LabelStyleDefinition__Group__1__Impl rule__LabelStyleDefinition__Group__2 ;
    public final void rule__LabelStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4744:1: ( rule__LabelStyleDefinition__Group__1__Impl rule__LabelStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4745:2: rule__LabelStyleDefinition__Group__1__Impl rule__LabelStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__1__Impl_in_rule__LabelStyleDefinition__Group__19655);
            rule__LabelStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__2_in_rule__LabelStyleDefinition__Group__19658);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4752:1: rule__LabelStyleDefinition__Group__1__Impl : ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? ) ;
    public final void rule__LabelStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4756:1: ( ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4757:1: ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4757:1: ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4758:1: ( rule__LabelStyleDefinition__ExpressionAssignment_1 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getExpressionAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4759:1: ( rule__LabelStyleDefinition__ExpressionAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=66 && LA39_0<=68)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4759:2: rule__LabelStyleDefinition__ExpressionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__ExpressionAssignment_1_in_rule__LabelStyleDefinition__Group__1__Impl9685);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4769:1: rule__LabelStyleDefinition__Group__2 : rule__LabelStyleDefinition__Group__2__Impl rule__LabelStyleDefinition__Group__3 ;
    public final void rule__LabelStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4773:1: ( rule__LabelStyleDefinition__Group__2__Impl rule__LabelStyleDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4774:2: rule__LabelStyleDefinition__Group__2__Impl rule__LabelStyleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__2__Impl_in_rule__LabelStyleDefinition__Group__29716);
            rule__LabelStyleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__3_in_rule__LabelStyleDefinition__Group__29719);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4781:1: rule__LabelStyleDefinition__Group__2__Impl : ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) ) ;
    public final void rule__LabelStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4785:1: ( ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4786:1: ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4786:1: ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4787:1: ( rule__LabelStyleDefinition__ColorAssignment_2 )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getColorAssignment_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4788:1: ( rule__LabelStyleDefinition__ColorAssignment_2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4788:2: rule__LabelStyleDefinition__ColorAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__ColorAssignment_2_in_rule__LabelStyleDefinition__Group__2__Impl9746);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4798:1: rule__LabelStyleDefinition__Group__3 : rule__LabelStyleDefinition__Group__3__Impl rule__LabelStyleDefinition__Group__4 ;
    public final void rule__LabelStyleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4802:1: ( rule__LabelStyleDefinition__Group__3__Impl rule__LabelStyleDefinition__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4803:2: rule__LabelStyleDefinition__Group__3__Impl rule__LabelStyleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__3__Impl_in_rule__LabelStyleDefinition__Group__39776);
            rule__LabelStyleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__4_in_rule__LabelStyleDefinition__Group__39779);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4810:1: rule__LabelStyleDefinition__Group__3__Impl : ( ( rule__LabelStyleDefinition__Group_3__0 )? ) ;
    public final void rule__LabelStyleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4814:1: ( ( ( rule__LabelStyleDefinition__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4815:1: ( ( rule__LabelStyleDefinition__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4815:1: ( ( rule__LabelStyleDefinition__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4816:1: ( rule__LabelStyleDefinition__Group_3__0 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4817:1: ( rule__LabelStyleDefinition__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==64) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4817:2: rule__LabelStyleDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__0_in_rule__LabelStyleDefinition__Group__3__Impl9806);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4827:1: rule__LabelStyleDefinition__Group__4 : rule__LabelStyleDefinition__Group__4__Impl rule__LabelStyleDefinition__Group__5 ;
    public final void rule__LabelStyleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4831:1: ( rule__LabelStyleDefinition__Group__4__Impl rule__LabelStyleDefinition__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4832:2: rule__LabelStyleDefinition__Group__4__Impl rule__LabelStyleDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__4__Impl_in_rule__LabelStyleDefinition__Group__49837);
            rule__LabelStyleDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__5_in_rule__LabelStyleDefinition__Group__49840);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4839:1: rule__LabelStyleDefinition__Group__4__Impl : ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? ) ;
    public final void rule__LabelStyleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4843:1: ( ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4844:1: ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4844:1: ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4845:1: ( rule__LabelStyleDefinition__BoldAssignment_4 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getBoldAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4846:1: ( rule__LabelStyleDefinition__BoldAssignment_4 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==72) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4846:2: rule__LabelStyleDefinition__BoldAssignment_4
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__BoldAssignment_4_in_rule__LabelStyleDefinition__Group__4__Impl9867);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4856:1: rule__LabelStyleDefinition__Group__5 : rule__LabelStyleDefinition__Group__5__Impl ;
    public final void rule__LabelStyleDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4860:1: ( rule__LabelStyleDefinition__Group__5__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4861:2: rule__LabelStyleDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__5__Impl_in_rule__LabelStyleDefinition__Group__59898);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4867:1: rule__LabelStyleDefinition__Group__5__Impl : ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? ) ;
    public final void rule__LabelStyleDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4871:1: ( ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4872:1: ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4872:1: ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4873:1: ( rule__LabelStyleDefinition__ItalicAssignment_5 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getItalicAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4874:1: ( rule__LabelStyleDefinition__ItalicAssignment_5 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==73) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4874:2: rule__LabelStyleDefinition__ItalicAssignment_5
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__ItalicAssignment_5_in_rule__LabelStyleDefinition__Group__5__Impl9925);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4896:1: rule__LabelStyleDefinition__Group_3__0 : rule__LabelStyleDefinition__Group_3__0__Impl rule__LabelStyleDefinition__Group_3__1 ;
    public final void rule__LabelStyleDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4900:1: ( rule__LabelStyleDefinition__Group_3__0__Impl rule__LabelStyleDefinition__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4901:2: rule__LabelStyleDefinition__Group_3__0__Impl rule__LabelStyleDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__0__Impl_in_rule__LabelStyleDefinition__Group_3__09968);
            rule__LabelStyleDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__1_in_rule__LabelStyleDefinition__Group_3__09971);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4908:1: rule__LabelStyleDefinition__Group_3__0__Impl : ( 'size' ) ;
    public final void rule__LabelStyleDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4912:1: ( ( 'size' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4913:1: ( 'size' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4913:1: ( 'size' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4914:1: 'size'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getSizeKeyword_3_0()); 
            match(input,64,FOLLOW_64_in_rule__LabelStyleDefinition__Group_3__0__Impl9999); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4927:1: rule__LabelStyleDefinition__Group_3__1 : rule__LabelStyleDefinition__Group_3__1__Impl ;
    public final void rule__LabelStyleDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4931:1: ( rule__LabelStyleDefinition__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4932:2: rule__LabelStyleDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__1__Impl_in_rule__LabelStyleDefinition__Group_3__110030);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4938:1: rule__LabelStyleDefinition__Group_3__1__Impl : ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) ) ;
    public final void rule__LabelStyleDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4942:1: ( ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4943:1: ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4943:1: ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4944:1: ( rule__LabelStyleDefinition__SizeAssignment_3_1 )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getSizeAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4945:1: ( rule__LabelStyleDefinition__SizeAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4945:2: rule__LabelStyleDefinition__SizeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__SizeAssignment_3_1_in_rule__LabelStyleDefinition__Group_3__1__Impl10057);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4959:1: rule__BorderStyleDefinition__Group__0 : rule__BorderStyleDefinition__Group__0__Impl rule__BorderStyleDefinition__Group__1 ;
    public final void rule__BorderStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4963:1: ( rule__BorderStyleDefinition__Group__0__Impl rule__BorderStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4964:2: rule__BorderStyleDefinition__Group__0__Impl rule__BorderStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__0__Impl_in_rule__BorderStyleDefinition__Group__010091);
            rule__BorderStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__1_in_rule__BorderStyleDefinition__Group__010094);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4971:1: rule__BorderStyleDefinition__Group__0__Impl : ( 'border ' ) ;
    public final void rule__BorderStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4975:1: ( ( 'border ' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4976:1: ( 'border ' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4976:1: ( 'border ' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4977:1: 'border '
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getBorderKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__BorderStyleDefinition__Group__0__Impl10122); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4990:1: rule__BorderStyleDefinition__Group__1 : rule__BorderStyleDefinition__Group__1__Impl rule__BorderStyleDefinition__Group__2 ;
    public final void rule__BorderStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4994:1: ( rule__BorderStyleDefinition__Group__1__Impl rule__BorderStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4995:2: rule__BorderStyleDefinition__Group__1__Impl rule__BorderStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__1__Impl_in_rule__BorderStyleDefinition__Group__110153);
            rule__BorderStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__2_in_rule__BorderStyleDefinition__Group__110156);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5002:1: rule__BorderStyleDefinition__Group__1__Impl : ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) ) ;
    public final void rule__BorderStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5006:1: ( ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5007:1: ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5007:1: ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5008:1: ( rule__BorderStyleDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5009:1: ( rule__BorderStyleDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5009:2: rule__BorderStyleDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__ColorAssignment_1_in_rule__BorderStyleDefinition__Group__1__Impl10183);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5019:1: rule__BorderStyleDefinition__Group__2 : rule__BorderStyleDefinition__Group__2__Impl ;
    public final void rule__BorderStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5023:1: ( rule__BorderStyleDefinition__Group__2__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5024:2: rule__BorderStyleDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__2__Impl_in_rule__BorderStyleDefinition__Group__210213);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5030:1: rule__BorderStyleDefinition__Group__2__Impl : ( ( rule__BorderStyleDefinition__Group_2__0 )? ) ;
    public final void rule__BorderStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5034:1: ( ( ( rule__BorderStyleDefinition__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5035:1: ( ( rule__BorderStyleDefinition__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5035:1: ( ( rule__BorderStyleDefinition__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5036:1: ( rule__BorderStyleDefinition__Group_2__0 )?
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5037:1: ( rule__BorderStyleDefinition__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==64) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5037:2: rule__BorderStyleDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__0_in_rule__BorderStyleDefinition__Group__2__Impl10240);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5053:1: rule__BorderStyleDefinition__Group_2__0 : rule__BorderStyleDefinition__Group_2__0__Impl rule__BorderStyleDefinition__Group_2__1 ;
    public final void rule__BorderStyleDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5057:1: ( rule__BorderStyleDefinition__Group_2__0__Impl rule__BorderStyleDefinition__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5058:2: rule__BorderStyleDefinition__Group_2__0__Impl rule__BorderStyleDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__0__Impl_in_rule__BorderStyleDefinition__Group_2__010277);
            rule__BorderStyleDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__1_in_rule__BorderStyleDefinition__Group_2__010280);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5065:1: rule__BorderStyleDefinition__Group_2__0__Impl : ( 'size' ) ;
    public final void rule__BorderStyleDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5069:1: ( ( 'size' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5070:1: ( 'size' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5070:1: ( 'size' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5071:1: 'size'
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getSizeKeyword_2_0()); 
            match(input,64,FOLLOW_64_in_rule__BorderStyleDefinition__Group_2__0__Impl10308); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5084:1: rule__BorderStyleDefinition__Group_2__1 : rule__BorderStyleDefinition__Group_2__1__Impl ;
    public final void rule__BorderStyleDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5088:1: ( rule__BorderStyleDefinition__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5089:2: rule__BorderStyleDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__1__Impl_in_rule__BorderStyleDefinition__Group_2__110339);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5095:1: rule__BorderStyleDefinition__Group_2__1__Impl : ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) ) ;
    public final void rule__BorderStyleDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5099:1: ( ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5100:1: ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5100:1: ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5101:1: ( rule__BorderStyleDefinition__SizeAssignment_2_1 )
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getSizeAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5102:1: ( rule__BorderStyleDefinition__SizeAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5102:2: rule__BorderStyleDefinition__SizeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__SizeAssignment_2_1_in_rule__BorderStyleDefinition__Group_2__1__Impl10366);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5116:1: rule__AcceleoExpression__Group__0 : rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1 ;
    public final void rule__AcceleoExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5120:1: ( rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5121:2: rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__Group__0__Impl_in_rule__AcceleoExpression__Group__010400);
            rule__AcceleoExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AcceleoExpression__Group__1_in_rule__AcceleoExpression__Group__010403);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5128:1: rule__AcceleoExpression__Group__0__Impl : ( 'acc:' ) ;
    public final void rule__AcceleoExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5132:1: ( ( 'acc:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5133:1: ( 'acc:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5133:1: ( 'acc:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5134:1: 'acc:'
            {
             before(grammarAccess.getAcceleoExpressionAccess().getAccKeyword_0()); 
            match(input,66,FOLLOW_66_in_rule__AcceleoExpression__Group__0__Impl10431); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5147:1: rule__AcceleoExpression__Group__1 : rule__AcceleoExpression__Group__1__Impl ;
    public final void rule__AcceleoExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5151:1: ( rule__AcceleoExpression__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5152:2: rule__AcceleoExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__Group__1__Impl_in_rule__AcceleoExpression__Group__110462);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5158:1: rule__AcceleoExpression__Group__1__Impl : ( ( rule__AcceleoExpression__ValueAssignment_1 ) ) ;
    public final void rule__AcceleoExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5162:1: ( ( ( rule__AcceleoExpression__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5163:1: ( ( rule__AcceleoExpression__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5163:1: ( ( rule__AcceleoExpression__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5164:1: ( rule__AcceleoExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getAcceleoExpressionAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5165:1: ( rule__AcceleoExpression__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5165:2: rule__AcceleoExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__ValueAssignment_1_in_rule__AcceleoExpression__Group__1__Impl10489);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5179:1: rule__VarRef__Group__0 : rule__VarRef__Group__0__Impl rule__VarRef__Group__1 ;
    public final void rule__VarRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5183:1: ( rule__VarRef__Group__0__Impl rule__VarRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5184:2: rule__VarRef__Group__0__Impl rule__VarRef__Group__1
            {
            pushFollow(FOLLOW_rule__VarRef__Group__0__Impl_in_rule__VarRef__Group__010523);
            rule__VarRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarRef__Group__1_in_rule__VarRef__Group__010526);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5191:1: rule__VarRef__Group__0__Impl : ( 'var:' ) ;
    public final void rule__VarRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5195:1: ( ( 'var:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5196:1: ( 'var:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5196:1: ( 'var:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5197:1: 'var:'
            {
             before(grammarAccess.getVarRefAccess().getVarKeyword_0()); 
            match(input,67,FOLLOW_67_in_rule__VarRef__Group__0__Impl10554); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5210:1: rule__VarRef__Group__1 : rule__VarRef__Group__1__Impl ;
    public final void rule__VarRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5214:1: ( rule__VarRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5215:2: rule__VarRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarRef__Group__1__Impl_in_rule__VarRef__Group__110585);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5221:1: rule__VarRef__Group__1__Impl : ( ( rule__VarRef__ValueAssignment_1 ) ) ;
    public final void rule__VarRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5225:1: ( ( ( rule__VarRef__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5226:1: ( ( rule__VarRef__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5226:1: ( ( rule__VarRef__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5227:1: ( rule__VarRef__ValueAssignment_1 )
            {
             before(grammarAccess.getVarRefAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5228:1: ( rule__VarRef__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5228:2: rule__VarRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__VarRef__ValueAssignment_1_in_rule__VarRef__Group__1__Impl10612);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5242:1: rule__FeatureRef__Group__0 : rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1 ;
    public final void rule__FeatureRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5246:1: ( rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5247:2: rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureRef__Group__0__Impl_in_rule__FeatureRef__Group__010646);
            rule__FeatureRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureRef__Group__1_in_rule__FeatureRef__Group__010649);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5254:1: rule__FeatureRef__Group__0__Impl : ( 'feature:' ) ;
    public final void rule__FeatureRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5258:1: ( ( 'feature:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5259:1: ( 'feature:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5259:1: ( 'feature:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5260:1: 'feature:'
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureKeyword_0()); 
            match(input,68,FOLLOW_68_in_rule__FeatureRef__Group__0__Impl10677); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5273:1: rule__FeatureRef__Group__1 : rule__FeatureRef__Group__1__Impl ;
    public final void rule__FeatureRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5277:1: ( rule__FeatureRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5278:2: rule__FeatureRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureRef__Group__1__Impl_in_rule__FeatureRef__Group__110708);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5284:1: rule__FeatureRef__Group__1__Impl : ( ( rule__FeatureRef__ValueAssignment_1 ) ) ;
    public final void rule__FeatureRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5288:1: ( ( ( rule__FeatureRef__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5289:1: ( ( rule__FeatureRef__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5289:1: ( ( rule__FeatureRef__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5290:1: ( rule__FeatureRef__ValueAssignment_1 )
            {
             before(grammarAccess.getFeatureRefAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5291:1: ( rule__FeatureRef__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5291:2: rule__FeatureRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__FeatureRef__ValueAssignment_1_in_rule__FeatureRef__Group__1__Impl10735);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5305:1: rule__MetamodelRef__Group__0 : rule__MetamodelRef__Group__0__Impl rule__MetamodelRef__Group__1 ;
    public final void rule__MetamodelRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5309:1: ( rule__MetamodelRef__Group__0__Impl rule__MetamodelRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5310:2: rule__MetamodelRef__Group__0__Impl rule__MetamodelRef__Group__1
            {
            pushFollow(FOLLOW_rule__MetamodelRef__Group__0__Impl_in_rule__MetamodelRef__Group__010769);
            rule__MetamodelRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetamodelRef__Group__1_in_rule__MetamodelRef__Group__010772);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5317:1: rule__MetamodelRef__Group__0__Impl : ( 'use' ) ;
    public final void rule__MetamodelRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5321:1: ( ( 'use' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5322:1: ( 'use' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5322:1: ( 'use' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5323:1: 'use'
            {
             before(grammarAccess.getMetamodelRefAccess().getUseKeyword_0()); 
            match(input,69,FOLLOW_69_in_rule__MetamodelRef__Group__0__Impl10800); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5336:1: rule__MetamodelRef__Group__1 : rule__MetamodelRef__Group__1__Impl ;
    public final void rule__MetamodelRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5340:1: ( rule__MetamodelRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5341:2: rule__MetamodelRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelRef__Group__1__Impl_in_rule__MetamodelRef__Group__110831);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5347:1: rule__MetamodelRef__Group__1__Impl : ( ( rule__MetamodelRef__MetamodelAssignment_1 ) ) ;
    public final void rule__MetamodelRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5351:1: ( ( ( rule__MetamodelRef__MetamodelAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5352:1: ( ( rule__MetamodelRef__MetamodelAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5352:1: ( ( rule__MetamodelRef__MetamodelAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5353:1: ( rule__MetamodelRef__MetamodelAssignment_1 )
            {
             before(grammarAccess.getMetamodelRefAccess().getMetamodelAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5354:1: ( rule__MetamodelRef__MetamodelAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5354:2: rule__MetamodelRef__MetamodelAssignment_1
            {
            pushFollow(FOLLOW_rule__MetamodelRef__MetamodelAssignment_1_in_rule__MetamodelRef__Group__1__Impl10858);
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


    // $ANTLR start "rule__MetamodelUsage__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5368:1: rule__MetamodelUsage__Group__0 : rule__MetamodelUsage__Group__0__Impl rule__MetamodelUsage__Group__1 ;
    public final void rule__MetamodelUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5372:1: ( rule__MetamodelUsage__Group__0__Impl rule__MetamodelUsage__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5373:2: rule__MetamodelUsage__Group__0__Impl rule__MetamodelUsage__Group__1
            {
            pushFollow(FOLLOW_rule__MetamodelUsage__Group__0__Impl_in_rule__MetamodelUsage__Group__010892);
            rule__MetamodelUsage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetamodelUsage__Group__1_in_rule__MetamodelUsage__Group__010895);
            rule__MetamodelUsage__Group__1();

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
    // $ANTLR end "rule__MetamodelUsage__Group__0"


    // $ANTLR start "rule__MetamodelUsage__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5380:1: rule__MetamodelUsage__Group__0__Impl : ( 'use' ) ;
    public final void rule__MetamodelUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5384:1: ( ( 'use' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5385:1: ( 'use' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5385:1: ( 'use' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5386:1: 'use'
            {
             before(grammarAccess.getMetamodelUsageAccess().getUseKeyword_0()); 
            match(input,69,FOLLOW_69_in_rule__MetamodelUsage__Group__0__Impl10923); 
             after(grammarAccess.getMetamodelUsageAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelUsage__Group__0__Impl"


    // $ANTLR start "rule__MetamodelUsage__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5399:1: rule__MetamodelUsage__Group__1 : rule__MetamodelUsage__Group__1__Impl ;
    public final void rule__MetamodelUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5403:1: ( rule__MetamodelUsage__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5404:2: rule__MetamodelUsage__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelUsage__Group__1__Impl_in_rule__MetamodelUsage__Group__110954);
            rule__MetamodelUsage__Group__1__Impl();

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
    // $ANTLR end "rule__MetamodelUsage__Group__1"


    // $ANTLR start "rule__MetamodelUsage__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5410:1: rule__MetamodelUsage__Group__1__Impl : ( ( rule__MetamodelUsage__UsageAssignment_1 ) ) ;
    public final void rule__MetamodelUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5414:1: ( ( ( rule__MetamodelUsage__UsageAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5415:1: ( ( rule__MetamodelUsage__UsageAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5415:1: ( ( rule__MetamodelUsage__UsageAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5416:1: ( rule__MetamodelUsage__UsageAssignment_1 )
            {
             before(grammarAccess.getMetamodelUsageAccess().getUsageAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5417:1: ( rule__MetamodelUsage__UsageAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5417:2: rule__MetamodelUsage__UsageAssignment_1
            {
            pushFollow(FOLLOW_rule__MetamodelUsage__UsageAssignment_1_in_rule__MetamodelUsage__Group__1__Impl10981);
            rule__MetamodelUsage__UsageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelUsageAccess().getUsageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelUsage__Group__1__Impl"


    // $ANTLR start "rule__SPrototyper__NameAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5432:1: rule__SPrototyper__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPrototyper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5436:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5437:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5437:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5438:1: RULE_ID
            {
             before(grammarAccess.getSPrototyperAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPrototyper__NameAssignment_111020); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5447:1: rule__SPrototyper__QualifierAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPrototyper__QualifierAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5451:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5452:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5452:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5453:1: RULE_STRING
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPrototyper__QualifierAssignment_3_111051); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5462:1: rule__SPrototyper__ViewpointsAssignment_4 : ( ruleSPViewpoint ) ;
    public final void rule__SPrototyper__ViewpointsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5466:1: ( ( ruleSPViewpoint ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5467:1: ( ruleSPViewpoint )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5467:1: ( ruleSPViewpoint )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5468:1: ruleSPViewpoint
            {
             before(grammarAccess.getSPrototyperAccess().getViewpointsSPViewpointParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSPViewpoint_in_rule__SPrototyper__ViewpointsAssignment_411082);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5477:1: rule__SPViewpoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPViewpoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5481:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5482:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5482:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5483:1: RULE_ID
            {
             before(grammarAccess.getSPViewpointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPViewpoint__NameAssignment_111113); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5492:1: rule__SPViewpoint__ShortcutAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPViewpoint__ShortcutAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5496:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5497:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5497:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5498:1: RULE_STRING
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPViewpoint__ShortcutAssignment_3_111144); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5507:1: rule__SPViewpoint__ExtensionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SPViewpoint__ExtensionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5511:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5512:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5512:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5513:1: RULE_STRING
            {
             before(grammarAccess.getSPViewpointAccess().getExtensionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPViewpoint__ExtensionAssignment_4_111175); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5522:1: rule__SPViewpoint__RepresentationsAssignment_5 : ( ruleSPRepresentation ) ;
    public final void rule__SPViewpoint__RepresentationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5526:1: ( ( ruleSPRepresentation ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5527:1: ( ruleSPRepresentation )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5527:1: ( ruleSPRepresentation )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5528:1: ruleSPRepresentation
            {
             before(grammarAccess.getSPViewpointAccess().getRepresentationsSPRepresentationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSPRepresentation_in_rule__SPViewpoint__RepresentationsAssignment_511206);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5537:1: rule__SPTable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPTable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5541:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5542:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5542:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5543:1: RULE_ID
            {
             before(grammarAccess.getSPTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPTable__NameAssignment_111237); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5552:1: rule__SPTable__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPTable__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5556:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5557:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5557:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5558:1: RULE_STRING
            {
             before(grammarAccess.getSPTableAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPTable__LabelAssignment_3_111268); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5567:1: rule__SPTable__TitleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SPTable__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5571:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5572:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5572:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5573:1: RULE_STRING
            {
             before(grammarAccess.getSPTableAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPTable__TitleAssignment_4_111299); 
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


    // $ANTLR start "rule__SPTable__UsagesAssignment_5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5582:1: rule__SPTable__UsagesAssignment_5 : ( ruleMetamodelUsage ) ;
    public final void rule__SPTable__UsagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5586:1: ( ( ruleMetamodelUsage ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5587:1: ( ruleMetamodelUsage )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5587:1: ( ruleMetamodelUsage )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5588:1: ruleMetamodelUsage
            {
             before(grammarAccess.getSPTableAccess().getUsagesMetamodelUsageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMetamodelUsage_in_rule__SPTable__UsagesAssignment_511330);
            ruleMetamodelUsage();

            state._fsp--;

             after(grammarAccess.getSPTableAccess().getUsagesMetamodelUsageParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPTable__UsagesAssignment_5"


    // $ANTLR start "rule__SPTable__RootAssignment_7"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5597:1: rule__SPTable__RootAssignment_7 : ( RULE_STRING ) ;
    public final void rule__SPTable__RootAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5601:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5602:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5602:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5603:1: RULE_STRING
            {
             before(grammarAccess.getSPTableAccess().getRootSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPTable__RootAssignment_711361); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5612:1: rule__SPTable__ElementsAssignment_8 : ( ruleTableElement ) ;
    public final void rule__SPTable__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5616:1: ( ( ruleTableElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5617:1: ( ruleTableElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5617:1: ( ruleTableElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5618:1: ruleTableElement
            {
             before(grammarAccess.getSPTableAccess().getElementsTableElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleTableElement_in_rule__SPTable__ElementsAssignment_811392);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5627:1: rule__SPTable__PropertiesAssignment_9 : ( ruleTableProperty ) ;
    public final void rule__SPTable__PropertiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5631:1: ( ( ruleTableProperty ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5632:1: ( ruleTableProperty )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5632:1: ( ruleTableProperty )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5633:1: ruleTableProperty
            {
             before(grammarAccess.getSPTableAccess().getPropertiesTablePropertyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleTableProperty_in_rule__SPTable__PropertiesAssignment_911423);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5642:1: rule__TableElement__CreatableAssignment_0 : ( ( 'creatable' ) ) ;
    public final void rule__TableElement__CreatableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5646:1: ( ( ( 'creatable' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5647:1: ( ( 'creatable' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5647:1: ( ( 'creatable' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5648:1: ( 'creatable' )
            {
             before(grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_0_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5649:1: ( 'creatable' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5650:1: 'creatable'
            {
             before(grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_0_0()); 
            match(input,70,FOLLOW_70_in_rule__TableElement__CreatableAssignment_011459); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5665:1: rule__TableElement__RecursiveAssignment_1 : ( ( 'recursive' ) ) ;
    public final void rule__TableElement__RecursiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5669:1: ( ( ( 'recursive' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5670:1: ( ( 'recursive' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5670:1: ( ( 'recursive' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5671:1: ( 'recursive' )
            {
             before(grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_1_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5672:1: ( 'recursive' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5673:1: 'recursive'
            {
             before(grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_1_0()); 
            match(input,71,FOLLOW_71_in_rule__TableElement__RecursiveAssignment_111503); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5688:1: rule__TableElement__EClassAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TableElement__EClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5692:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5693:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5693:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5694:1: RULE_STRING
            {
             before(grammarAccess.getTableElementAccess().getEClassSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableElement__EClassAssignment_311542); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5703:1: rule__TableElement__ExpressionAssignment_5 : ( ruleSPExpression ) ;
    public final void rule__TableElement__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5707:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5708:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5708:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5709:1: ruleSPExpression
            {
             before(grammarAccess.getTableElementAccess().getExpressionSPExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__TableElement__ExpressionAssignment_511573);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5718:1: rule__TableElement__SubElementsAssignment_6_1 : ( ruleTableElement ) ;
    public final void rule__TableElement__SubElementsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5722:1: ( ( ruleTableElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5723:1: ( ruleTableElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5723:1: ( ruleTableElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5724:1: ruleTableElement
            {
             before(grammarAccess.getTableElementAccess().getSubElementsTableElementParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleTableElement_in_rule__TableElement__SubElementsAssignment_6_111604);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5733:1: rule__TableProperty__FeatureAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TableProperty__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5737:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5738:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5738:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5739:1: RULE_STRING
            {
             before(grammarAccess.getTablePropertyAccess().getFeatureSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableProperty__FeatureAssignment_111635); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5748:1: rule__TableProperty__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TableProperty__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5752:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5753:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5753:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5754:1: RULE_STRING
            {
             before(grammarAccess.getTablePropertyAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableProperty__LabelAssignment_2_111666); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5763:1: rule__TableProperty__ExpressionAssignment_3_1 : ( ruleSPExpression ) ;
    public final void rule__TableProperty__ExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5767:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5768:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5768:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5769:1: ruleSPExpression
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionSPExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__TableProperty__ExpressionAssignment_3_111697);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5778:1: rule__SPDiagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5782:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5783:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5783:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5784:1: RULE_ID
            {
             before(grammarAccess.getSPDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPDiagram__NameAssignment_111728); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5793:1: rule__SPDiagram__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPDiagram__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5797:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5798:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5798:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5799:1: RULE_STRING
            {
             before(grammarAccess.getSPDiagramAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPDiagram__LabelAssignment_3_111759); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5808:1: rule__SPDiagram__TitleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SPDiagram__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5812:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5813:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5813:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5814:1: RULE_STRING
            {
             before(grammarAccess.getSPDiagramAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPDiagram__TitleAssignment_4_111790); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5823:1: rule__SPDiagram__MetamodelsAssignment_5 : ( ruleMetamodelRef ) ;
    public final void rule__SPDiagram__MetamodelsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5827:1: ( ( ruleMetamodelRef ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5828:1: ( ruleMetamodelRef )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5828:1: ( ruleMetamodelRef )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5829:1: ruleMetamodelRef
            {
             before(grammarAccess.getSPDiagramAccess().getMetamodelsMetamodelRefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMetamodelRef_in_rule__SPDiagram__MetamodelsAssignment_511821);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5838:1: rule__SPDiagram__RootAssignment_7 : ( RULE_STRING ) ;
    public final void rule__SPDiagram__RootAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5842:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5843:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5843:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5844:1: RULE_STRING
            {
             before(grammarAccess.getSPDiagramAccess().getRootSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPDiagram__RootAssignment_711852); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5853:1: rule__SPDiagram__ElementsAssignment_8 : ( ruleDiagramElement ) ;
    public final void rule__SPDiagram__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5857:1: ( ( ruleDiagramElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5858:1: ( ruleDiagramElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5858:1: ( ruleDiagramElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5859:1: ruleDiagramElement
            {
             before(grammarAccess.getSPDiagramAccess().getElementsDiagramElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleDiagramElement_in_rule__SPDiagram__ElementsAssignment_811883);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5868:1: rule__Container__CreatableAssignment_0 : ( ( 'creatable' ) ) ;
    public final void rule__Container__CreatableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5872:1: ( ( ( 'creatable' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5873:1: ( ( 'creatable' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5873:1: ( ( 'creatable' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5874:1: ( 'creatable' )
            {
             before(grammarAccess.getContainerAccess().getCreatableCreatableKeyword_0_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5875:1: ( 'creatable' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5876:1: 'creatable'
            {
             before(grammarAccess.getContainerAccess().getCreatableCreatableKeyword_0_0()); 
            match(input,70,FOLLOW_70_in_rule__Container__CreatableAssignment_011919); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5891:1: rule__Container__RecursiveAssignment_1 : ( ( 'recursive' ) ) ;
    public final void rule__Container__RecursiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5895:1: ( ( ( 'recursive' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5896:1: ( ( 'recursive' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5896:1: ( ( 'recursive' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5897:1: ( 'recursive' )
            {
             before(grammarAccess.getContainerAccess().getRecursiveRecursiveKeyword_1_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5898:1: ( 'recursive' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5899:1: 'recursive'
            {
             before(grammarAccess.getContainerAccess().getRecursiveRecursiveKeyword_1_0()); 
            match(input,71,FOLLOW_71_in_rule__Container__RecursiveAssignment_111963); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5914:1: rule__Container__ContainerTypeAssignment_2 : ( ruleContainerType ) ;
    public final void rule__Container__ContainerTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5918:1: ( ( ruleContainerType ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5919:1: ( ruleContainerType )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5919:1: ( ruleContainerType )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5920:1: ruleContainerType
            {
             before(grammarAccess.getContainerAccess().getContainerTypeContainerTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleContainerType_in_rule__Container__ContainerTypeAssignment_212002);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5929:1: rule__Container__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5933:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5934:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5934:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5935:1: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Container__NameAssignment_412033); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5944:1: rule__Container__EClassAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Container__EClassAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5948:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5949:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5949:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5950:1: RULE_STRING
            {
             before(grammarAccess.getContainerAccess().getEClassSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Container__EClassAssignment_612064); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5959:1: rule__Container__ExpressionAssignment_8 : ( ruleSPExpression ) ;
    public final void rule__Container__ExpressionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5963:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5964:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5964:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5965:1: ruleSPExpression
            {
             before(grammarAccess.getContainerAccess().getExpressionSPExpressionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__Container__ExpressionAssignment_812095);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5974:1: rule__Container__StyleAssignment_9 : ( ruleContainerStyleDefinition ) ;
    public final void rule__Container__StyleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5978:1: ( ( ruleContainerStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5979:1: ( ruleContainerStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5979:1: ( ruleContainerStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5980:1: ruleContainerStyleDefinition
            {
             before(grammarAccess.getContainerAccess().getStyleContainerStyleDefinitionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleContainerStyleDefinition_in_rule__Container__StyleAssignment_912126);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5989:1: rule__Container__ElementsAssignment_10_1 : ( ruleDiagramElement ) ;
    public final void rule__Container__ElementsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5993:1: ( ( ruleDiagramElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5994:1: ( ruleDiagramElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5994:1: ( ruleDiagramElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5995:1: ruleDiagramElement
            {
             before(grammarAccess.getContainerAccess().getElementsDiagramElementParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleDiagramElement_in_rule__Container__ElementsAssignment_10_112157);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6004:1: rule__ContainerStyleDefinition__ColorAssignment_1 : ( ruleContainerColorDefinition ) ;
    public final void rule__ContainerStyleDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6008:1: ( ( ruleContainerColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6009:1: ( ruleContainerColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6009:1: ( ruleContainerColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6010:1: ruleContainerColorDefinition
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getColorContainerColorDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_rule__ContainerStyleDefinition__ColorAssignment_112188);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6019:1: rule__ContainerStyleDefinition__LabelAssignment_2_1 : ( ruleLabelStyleDefinition ) ;
    public final void rule__ContainerStyleDefinition__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6023:1: ( ( ruleLabelStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6024:1: ( ruleLabelStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6024:1: ( ruleLabelStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6025:1: ruleLabelStyleDefinition
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleLabelStyleDefinition_in_rule__ContainerStyleDefinition__LabelAssignment_2_112219);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6034:1: rule__ContainerStyleDefinition__BorderAssignment_3_1 : ( ruleBorderStyleDefinition ) ;
    public final void rule__ContainerStyleDefinition__BorderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6038:1: ( ( ruleBorderStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6039:1: ( ruleBorderStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6039:1: ( ruleBorderStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6040:1: ruleBorderStyleDefinition
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleBorderStyleDefinition_in_rule__ContainerStyleDefinition__BorderAssignment_3_112250);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6049:1: rule__Node__CreatableAssignment_0 : ( ( 'creatable' ) ) ;
    public final void rule__Node__CreatableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6053:1: ( ( ( 'creatable' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6054:1: ( ( 'creatable' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6054:1: ( ( 'creatable' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6055:1: ( 'creatable' )
            {
             before(grammarAccess.getNodeAccess().getCreatableCreatableKeyword_0_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6056:1: ( 'creatable' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6057:1: 'creatable'
            {
             before(grammarAccess.getNodeAccess().getCreatableCreatableKeyword_0_0()); 
            match(input,70,FOLLOW_70_in_rule__Node__CreatableAssignment_012286); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6072:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6076:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6077:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6077:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6078:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_212325); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6087:1: rule__Node__EClassAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Node__EClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6091:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6092:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6092:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6093:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getEClassSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__EClassAssignment_412356); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6102:1: rule__Node__ExpressionAssignment_6 : ( ruleSPExpression ) ;
    public final void rule__Node__ExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6106:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6107:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6107:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6108:1: ruleSPExpression
            {
             before(grammarAccess.getNodeAccess().getExpressionSPExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__Node__ExpressionAssignment_612387);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6117:1: rule__Node__StyleAssignment_7 : ( ruleNodeStyleDefinition ) ;
    public final void rule__Node__StyleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6121:1: ( ( ruleNodeStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6122:1: ( ruleNodeStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6122:1: ( ruleNodeStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6123:1: ruleNodeStyleDefinition
            {
             before(grammarAccess.getNodeAccess().getStyleNodeStyleDefinitionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleNodeStyleDefinition_in_rule__Node__StyleAssignment_712418);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6132:1: rule__NodeStyleDefinition__ColorAssignment_1 : ( ruleSolidColorDefinition ) ;
    public final void rule__NodeStyleDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6136:1: ( ( ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6137:1: ( ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6137:1: ( ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6138:1: ruleSolidColorDefinition
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__NodeStyleDefinition__ColorAssignment_112449);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6147:1: rule__NodeStyleDefinition__LabelAssignment_2_1 : ( ruleLabelStyleDefinition ) ;
    public final void rule__NodeStyleDefinition__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6151:1: ( ( ruleLabelStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6152:1: ( ruleLabelStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6152:1: ( ruleLabelStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6153:1: ruleLabelStyleDefinition
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleLabelStyleDefinition_in_rule__NodeStyleDefinition__LabelAssignment_2_112480);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6162:1: rule__NodeStyleDefinition__BorderAssignment_3_1 : ( ruleBorderStyleDefinition ) ;
    public final void rule__NodeStyleDefinition__BorderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6166:1: ( ( ruleBorderStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6167:1: ( ruleBorderStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6167:1: ( ruleBorderStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6168:1: ruleBorderStyleDefinition
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleBorderStyleDefinition_in_rule__NodeStyleDefinition__BorderAssignment_3_112511);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6177:1: rule__SolidColorDefinition__ColorAssignment_1 : ( ruleColor ) ;
    public final void rule__SolidColorDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6181:1: ( ( ruleColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6182:1: ( ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6182:1: ( ruleColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6183:1: ruleColor
            {
             before(grammarAccess.getSolidColorDefinitionAccess().getColorColorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__SolidColorDefinition__ColorAssignment_112542);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6192:1: rule__GradientColorDefinition__FromAssignment_1 : ( ruleColor ) ;
    public final void rule__GradientColorDefinition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6196:1: ( ( ruleColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6197:1: ( ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6197:1: ( ruleColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6198:1: ruleColor
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getFromColorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__GradientColorDefinition__FromAssignment_112573);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6207:1: rule__GradientColorDefinition__ToAssignment_3 : ( ruleColor ) ;
    public final void rule__GradientColorDefinition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6211:1: ( ( ruleColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6212:1: ( ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6212:1: ( ruleColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6213:1: ruleColor
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getToColorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__GradientColorDefinition__ToAssignment_312604);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6222:1: rule__LabelStyleDefinition__ExpressionAssignment_1 : ( ruleSPExpression ) ;
    public final void rule__LabelStyleDefinition__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6226:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6227:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6227:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6228:1: ruleSPExpression
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getExpressionSPExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__LabelStyleDefinition__ExpressionAssignment_112635);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6237:1: rule__LabelStyleDefinition__ColorAssignment_2 : ( ruleSolidColorDefinition ) ;
    public final void rule__LabelStyleDefinition__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6241:1: ( ( ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6242:1: ( ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6242:1: ( ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6243:1: ruleSolidColorDefinition
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__LabelStyleDefinition__ColorAssignment_212666);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6252:1: rule__LabelStyleDefinition__SizeAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__LabelStyleDefinition__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6256:1: ( ( RULE_INT ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6257:1: ( RULE_INT )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6257:1: ( RULE_INT )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6258:1: RULE_INT
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getSizeINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LabelStyleDefinition__SizeAssignment_3_112697); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6267:1: rule__LabelStyleDefinition__BoldAssignment_4 : ( ( 'bold' ) ) ;
    public final void rule__LabelStyleDefinition__BoldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6271:1: ( ( ( 'bold' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6272:1: ( ( 'bold' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6272:1: ( ( 'bold' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6273:1: ( 'bold' )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6274:1: ( 'bold' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6275:1: 'bold'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0()); 
            match(input,72,FOLLOW_72_in_rule__LabelStyleDefinition__BoldAssignment_412733); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6290:1: rule__LabelStyleDefinition__ItalicAssignment_5 : ( ( 'italic' ) ) ;
    public final void rule__LabelStyleDefinition__ItalicAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6294:1: ( ( ( 'italic' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6295:1: ( ( 'italic' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6295:1: ( ( 'italic' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6296:1: ( 'italic' )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getItalicItalicKeyword_5_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6297:1: ( 'italic' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6298:1: 'italic'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getItalicItalicKeyword_5_0()); 
            match(input,73,FOLLOW_73_in_rule__LabelStyleDefinition__ItalicAssignment_512777); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6313:1: rule__BorderStyleDefinition__ColorAssignment_1 : ( ruleSolidColorDefinition ) ;
    public final void rule__BorderStyleDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6317:1: ( ( ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6318:1: ( ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6318:1: ( ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6319:1: ruleSolidColorDefinition
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__BorderStyleDefinition__ColorAssignment_112816);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6328:1: rule__BorderStyleDefinition__SizeAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__BorderStyleDefinition__SizeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6332:1: ( ( RULE_INT ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6333:1: ( RULE_INT )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6333:1: ( RULE_INT )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6334:1: RULE_INT
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getSizeINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__BorderStyleDefinition__SizeAssignment_2_112847); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6343:1: rule__AcceleoExpression__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AcceleoExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6347:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6348:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6348:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6349:1: RULE_STRING
            {
             before(grammarAccess.getAcceleoExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AcceleoExpression__ValueAssignment_112878); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6358:1: rule__VarRef__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VarRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6362:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6363:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6363:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6364:1: RULE_STRING
            {
             before(grammarAccess.getVarRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VarRef__ValueAssignment_112909); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6373:1: rule__FeatureRef__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FeatureRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6377:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6378:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6378:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6379:1: RULE_STRING
            {
             before(grammarAccess.getFeatureRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureRef__ValueAssignment_112940); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6388:1: rule__MetamodelRef__MetamodelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MetamodelRef__MetamodelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6392:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6393:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6393:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6394:1: RULE_STRING
            {
             before(grammarAccess.getMetamodelRefAccess().getMetamodelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetamodelRef__MetamodelAssignment_112971); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6403:1: rule__PreDefinedColorDefinition__ColorAssignment : ( rulePreDefinedColor ) ;
    public final void rule__PreDefinedColorDefinition__ColorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6407:1: ( ( rulePreDefinedColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6408:1: ( rulePreDefinedColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6408:1: ( rulePreDefinedColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6409:1: rulePreDefinedColor
            {
             before(grammarAccess.getPreDefinedColorDefinitionAccess().getColorPreDefinedColorEnumRuleCall_0()); 
            pushFollow(FOLLOW_rulePreDefinedColor_in_rule__PreDefinedColorDefinition__ColorAssignment13002);
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


    // $ANTLR start "rule__MetamodelUsage__UsageAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6418:1: rule__MetamodelUsage__UsageAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MetamodelUsage__UsageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6422:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6423:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6423:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6424:1: ( RULE_ID )
            {
             before(grammarAccess.getMetamodelUsageAccess().getUsageEPackageCrossReference_1_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6425:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6426:1: RULE_ID
            {
             before(grammarAccess.getMetamodelUsageAccess().getUsageEPackageIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MetamodelUsage__UsageAssignment_113037); 
             after(grammarAccess.getMetamodelUsageAccess().getUsageEPackageIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMetamodelUsageAccess().getUsageEPackageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelUsage__UsageAssignment_1"

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
    public static final BitSet FOLLOW_ruleMetamodelUsage_in_entryRuleMetamodelUsage1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelUsage1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelUsage__Group__0_in_ruleMetamodelUsage1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreDefinedColor__Alternatives_in_rulePreDefinedColor1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPTable_in_rule__SPRepresentation__Alternatives1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPDiagram_in_rule__SPRepresentation__Alternatives1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_rule__DiagramElement__Alternatives1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__DiagramElement__Alternatives1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ContainerType__Alternatives1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ContainerType__Alternatives1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__ContainerColorDefinition__Alternatives1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_rule__ContainerColorDefinition__Alternatives1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_rule__SPExpression__Alternatives1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_rule__SPExpression__Alternatives1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_rule__SPExpression__Alternatives1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PreDefinedColor__Alternatives1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PreDefinedColor__Alternatives1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PreDefinedColor__Alternatives1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PreDefinedColor__Alternatives1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PreDefinedColor__Alternatives2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PreDefinedColor__Alternatives2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PreDefinedColor__Alternatives2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PreDefinedColor__Alternatives2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PreDefinedColor__Alternatives2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PreDefinedColor__Alternatives2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PreDefinedColor__Alternatives2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PreDefinedColor__Alternatives2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PreDefinedColor__Alternatives2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PreDefinedColor__Alternatives2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PreDefinedColor__Alternatives2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PreDefinedColor__Alternatives2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PreDefinedColor__Alternatives2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PreDefinedColor__Alternatives2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PreDefinedColor__Alternatives2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PreDefinedColor__Alternatives2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PreDefinedColor__Alternatives2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PreDefinedColor__Alternatives2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PreDefinedColor__Alternatives2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PreDefinedColor__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__PreDefinedColor__Alternatives2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__PreDefinedColor__Alternatives2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__0__Impl_in_rule__SPrototyper__Group__02492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__1_in_rule__SPrototyper__Group__02495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SPrototyper__Group__0__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__1__Impl_in_rule__SPrototyper__Group__12554 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__2_in_rule__SPrototyper__Group__12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__NameAssignment_1_in_rule__SPrototyper__Group__1__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__2__Impl_in_rule__SPrototyper__Group__22614 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__3_in_rule__SPrototyper__Group__22617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPrototyper__Group__2__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__3__Impl_in_rule__SPrototyper__Group__32676 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__4_in_rule__SPrototyper__Group__32679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__0_in_rule__SPrototyper__Group__3__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__4__Impl_in_rule__SPrototyper__Group__42737 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__5_in_rule__SPrototyper__Group__42740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__ViewpointsAssignment_4_in_rule__SPrototyper__Group__4__Impl2767 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__5__Impl_in_rule__SPrototyper__Group__52798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SPrototyper__Group__5__Impl2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__0__Impl_in_rule__SPrototyper__Group_3__02869 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__1_in_rule__SPrototyper__Group_3__02872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SPrototyper__Group_3__0__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__1__Impl_in_rule__SPrototyper__Group_3__12931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__QualifierAssignment_3_1_in_rule__SPrototyper__Group_3__1__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__0__Impl_in_rule__SPViewpoint__Group__02992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__1_in_rule__SPViewpoint__Group__02995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SPViewpoint__Group__0__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__1__Impl_in_rule__SPViewpoint__Group__13054 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__2_in_rule__SPViewpoint__Group__13057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__NameAssignment_1_in_rule__SPViewpoint__Group__1__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__2__Impl_in_rule__SPViewpoint__Group__23114 = new BitSet(new long[]{0x0040720000000000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__3_in_rule__SPViewpoint__Group__23117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPViewpoint__Group__2__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__3__Impl_in_rule__SPViewpoint__Group__33176 = new BitSet(new long[]{0x0040720000000000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__4_in_rule__SPViewpoint__Group__33179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__0_in_rule__SPViewpoint__Group__3__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__4__Impl_in_rule__SPViewpoint__Group__43237 = new BitSet(new long[]{0x0040720000000000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__5_in_rule__SPViewpoint__Group__43240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__0_in_rule__SPViewpoint__Group__4__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__5__Impl_in_rule__SPViewpoint__Group__53298 = new BitSet(new long[]{0x0040720000000000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__6_in_rule__SPViewpoint__Group__53301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__RepresentationsAssignment_5_in_rule__SPViewpoint__Group__5__Impl3328 = new BitSet(new long[]{0x0040400000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__6__Impl_in_rule__SPViewpoint__Group__63359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SPViewpoint__Group__6__Impl3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__0__Impl_in_rule__SPViewpoint__Group_3__03432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__1_in_rule__SPViewpoint__Group_3__03435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SPViewpoint__Group_3__0__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__1__Impl_in_rule__SPViewpoint__Group_3__13494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__ShortcutAssignment_3_1_in_rule__SPViewpoint__Group_3__1__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__0__Impl_in_rule__SPViewpoint__Group_4__03555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__1_in_rule__SPViewpoint__Group_4__03558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SPViewpoint__Group_4__0__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__1__Impl_in_rule__SPViewpoint__Group_4__13617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__ExtensionAssignment_4_1_in_rule__SPViewpoint__Group_4__1__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__0__Impl_in_rule__SPTable__Group__03678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPTable__Group__1_in_rule__SPTable__Group__03681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SPTable__Group__0__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__1__Impl_in_rule__SPTable__Group__13740 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__2_in_rule__SPTable__Group__13743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__NameAssignment_1_in_rule__SPTable__Group__1__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__2__Impl_in_rule__SPTable__Group__23800 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group__3_in_rule__SPTable__Group__23803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPTable__Group__2__Impl3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__3__Impl_in_rule__SPTable__Group__33862 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group__4_in_rule__SPTable__Group__33865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__0_in_rule__SPTable__Group__3__Impl3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__4__Impl_in_rule__SPTable__Group__43923 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group__5_in_rule__SPTable__Group__43926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__0_in_rule__SPTable__Group__4__Impl3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__5__Impl_in_rule__SPTable__Group__53984 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__6_in_rule__SPTable__Group__53987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__UsagesAssignment_5_in_rule__SPTable__Group__5__Impl4016 = new BitSet(new long[]{0x0003000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__UsagesAssignment_5_in_rule__SPTable__Group__5__Impl4028 = new BitSet(new long[]{0x0003000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group__6__Impl_in_rule__SPTable__Group__64061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group__7_in_rule__SPTable__Group__64064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__SPTable__Group__6__Impl4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__7__Impl_in_rule__SPTable__Group__74123 = new BitSet(new long[]{0x0004000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPTable__Group__8_in_rule__SPTable__Group__74126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__RootAssignment_7_in_rule__SPTable__Group__7__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__8__Impl_in_rule__SPTable__Group__84183 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__9_in_rule__SPTable__Group__84186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4215 = new BitSet(new long[]{0x0004000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4227 = new BitSet(new long[]{0x0004000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPTable__Group__9__Impl_in_rule__SPTable__Group__94260 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__10_in_rule__SPTable__Group__94263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4292 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4304 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__10__Impl_in_rule__SPTable__Group__104337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SPTable__Group__10__Impl4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__0__Impl_in_rule__SPTable__Group_3__04418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__1_in_rule__SPTable__Group_3__04421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SPTable__Group_3__0__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__1__Impl_in_rule__SPTable__Group_3__14480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__LabelAssignment_3_1_in_rule__SPTable__Group_3__1__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__0__Impl_in_rule__SPTable__Group_4__04541 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__1_in_rule__SPTable__Group_4__04544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SPTable__Group_4__0__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__1__Impl_in_rule__SPTable__Group_4__14603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__TitleAssignment_4_1_in_rule__SPTable__Group_4__1__Impl4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__0__Impl_in_rule__TableElement__Group__04664 = new BitSet(new long[]{0x0004000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__TableElement__Group__1_in_rule__TableElement__Group__04667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__CreatableAssignment_0_in_rule__TableElement__Group__0__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__1__Impl_in_rule__TableElement__Group__14725 = new BitSet(new long[]{0x0004000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__TableElement__Group__2_in_rule__TableElement__Group__14728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__RecursiveAssignment_1_in_rule__TableElement__Group__1__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__2__Impl_in_rule__TableElement__Group__24786 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TableElement__Group__3_in_rule__TableElement__Group__24789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TableElement__Group__2__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__3__Impl_in_rule__TableElement__Group__34848 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__TableElement__Group__4_in_rule__TableElement__Group__34851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__EClassAssignment_3_in_rule__TableElement__Group__3__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__4__Impl_in_rule__TableElement__Group__44908 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__TableElement__Group__5_in_rule__TableElement__Group__44911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__TableElement__Group__4__Impl4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__5__Impl_in_rule__TableElement__Group__54970 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TableElement__Group__6_in_rule__TableElement__Group__54973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__ExpressionAssignment_5_in_rule__TableElement__Group__5__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__6__Impl_in_rule__TableElement__Group__65030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__0_in_rule__TableElement__Group__6__Impl5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__0__Impl_in_rule__TableElement__Group_6__05102 = new BitSet(new long[]{0x0004000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__1_in_rule__TableElement__Group_6__05105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TableElement__Group_6__0__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__1__Impl_in_rule__TableElement__Group_6__15164 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__2_in_rule__TableElement__Group_6__15167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5196 = new BitSet(new long[]{0x0004000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5208 = new BitSet(new long[]{0x0004000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__2__Impl_in_rule__TableElement__Group_6__25241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__TableElement__Group_6__2__Impl5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__0__Impl_in_rule__TableProperty__Group__05306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__1_in_rule__TableProperty__Group__05309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__TableProperty__Group__0__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__1__Impl_in_rule__TableProperty__Group__15368 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__2_in_rule__TableProperty__Group__15371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__FeatureAssignment_1_in_rule__TableProperty__Group__1__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__2__Impl_in_rule__TableProperty__Group__25428 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__3_in_rule__TableProperty__Group__25431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__0_in_rule__TableProperty__Group__2__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__3__Impl_in_rule__TableProperty__Group__35489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__0_in_rule__TableProperty__Group__3__Impl5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__0__Impl_in_rule__TableProperty__Group_2__05555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__1_in_rule__TableProperty__Group_2__05558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TableProperty__Group_2__0__Impl5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__1__Impl_in_rule__TableProperty__Group_2__15617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__LabelAssignment_2_1_in_rule__TableProperty__Group_2__1__Impl5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__0__Impl_in_rule__TableProperty__Group_3__05678 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__1_in_rule__TableProperty__Group_3__05681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__TableProperty__Group_3__0__Impl5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__1__Impl_in_rule__TableProperty__Group_3__15740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__ExpressionAssignment_3_1_in_rule__TableProperty__Group_3__1__Impl5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__0__Impl_in_rule__SPDiagram__Group__05801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__1_in_rule__SPDiagram__Group__05804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__SPDiagram__Group__0__Impl5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__1__Impl_in_rule__SPDiagram__Group__15863 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__2_in_rule__SPDiagram__Group__15866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__NameAssignment_1_in_rule__SPDiagram__Group__1__Impl5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__2__Impl_in_rule__SPDiagram__Group__25923 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__3_in_rule__SPDiagram__Group__25926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPDiagram__Group__2__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__3__Impl_in_rule__SPDiagram__Group__35985 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__4_in_rule__SPDiagram__Group__35988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__0_in_rule__SPDiagram__Group__3__Impl6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__4__Impl_in_rule__SPDiagram__Group__46046 = new BitSet(new long[]{0x0003000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__5_in_rule__SPDiagram__Group__46049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__0_in_rule__SPDiagram__Group__4__Impl6076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__5__Impl_in_rule__SPDiagram__Group__56107 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__6_in_rule__SPDiagram__Group__56110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6139 = new BitSet(new long[]{0x0003000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6151 = new BitSet(new long[]{0x0003000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__6__Impl_in_rule__SPDiagram__Group__66184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__7_in_rule__SPDiagram__Group__66187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__SPDiagram__Group__6__Impl6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__7__Impl_in_rule__SPDiagram__Group__76246 = new BitSet(new long[]{0x1080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__8_in_rule__SPDiagram__Group__76249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__RootAssignment_7_in_rule__SPDiagram__Group__7__Impl6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__8__Impl_in_rule__SPDiagram__Group__86306 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__9_in_rule__SPDiagram__Group__86309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl6338 = new BitSet(new long[]{0x1080000000001802L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl6350 = new BitSet(new long[]{0x1080000000001802L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__9__Impl_in_rule__SPDiagram__Group__96383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SPDiagram__Group__9__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__0__Impl_in_rule__SPDiagram__Group_3__06462 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__1_in_rule__SPDiagram__Group_3__06465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SPDiagram__Group_3__0__Impl6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__1__Impl_in_rule__SPDiagram__Group_3__16524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__LabelAssignment_3_1_in_rule__SPDiagram__Group_3__1__Impl6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__0__Impl_in_rule__SPDiagram__Group_4__06585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__1_in_rule__SPDiagram__Group_4__06588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SPDiagram__Group_4__0__Impl6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__1__Impl_in_rule__SPDiagram__Group_4__16647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__TitleAssignment_4_1_in_rule__SPDiagram__Group_4__1__Impl6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__06708 = new BitSet(new long[]{0x0080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__Group__1_in_rule__Container__Group__06711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__CreatableAssignment_0_in_rule__Container__Group__0__Impl6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__16769 = new BitSet(new long[]{0x0080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__Group__2_in_rule__Container__Group__16772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__RecursiveAssignment_1_in_rule__Container__Group__1__Impl6799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__26830 = new BitSet(new long[]{0x0080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__Group__3_in_rule__Container__Group__26833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__ContainerTypeAssignment_2_in_rule__Container__Group__2__Impl6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__36891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Container__Group__4_in_rule__Container__Group__36894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Container__Group__3__Impl6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__4__Impl_in_rule__Container__Group__46953 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__5_in_rule__Container__Group__46956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__NameAssignment_4_in_rule__Container__Group__4__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__5__Impl_in_rule__Container__Group__57013 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Container__Group__6_in_rule__Container__Group__57016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Container__Group__5__Impl7044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__6__Impl_in_rule__Container__Group__67075 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__7_in_rule__Container__Group__67078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__EClassAssignment_6_in_rule__Container__Group__6__Impl7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__7__Impl_in_rule__Container__Group__77135 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__Container__Group__8_in_rule__Container__Group__77138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Container__Group__7__Impl7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__8__Impl_in_rule__Container__Group__87197 = new BitSet(new long[]{0x0200010000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__9_in_rule__Container__Group__87200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__ExpressionAssignment_8_in_rule__Container__Group__8__Impl7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__9__Impl_in_rule__Container__Group__97257 = new BitSet(new long[]{0x0200010000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__10_in_rule__Container__Group__97260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__StyleAssignment_9_in_rule__Container__Group__9__Impl7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__10__Impl_in_rule__Container__Group__107318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group_10__0_in_rule__Container__Group__10__Impl7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group_10__0__Impl_in_rule__Container__Group_10__07398 = new BitSet(new long[]{0x1080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__Group_10__1_in_rule__Container__Group_10__07401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Container__Group_10__0__Impl7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group_10__1__Impl_in_rule__Container__Group_10__17460 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Container__Group_10__2_in_rule__Container__Group_10__17463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl7492 = new BitSet(new long[]{0x1080000000001802L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl7504 = new BitSet(new long[]{0x1080000000001802L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Container__Group_10__2__Impl_in_rule__Container__Group_10__27537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Container__Group_10__2__Impl7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__0__Impl_in_rule__ContainerStyleDefinition__Group__07602 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__1_in_rule__ContainerStyleDefinition__Group__07605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ContainerStyleDefinition__Group__0__Impl7633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__1__Impl_in_rule__ContainerStyleDefinition__Group__17664 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__2_in_rule__ContainerStyleDefinition__Group__17667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__ColorAssignment_1_in_rule__ContainerStyleDefinition__Group__1__Impl7694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__2__Impl_in_rule__ContainerStyleDefinition__Group__27724 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__3_in_rule__ContainerStyleDefinition__Group__27727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__0_in_rule__ContainerStyleDefinition__Group__2__Impl7754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__3__Impl_in_rule__ContainerStyleDefinition__Group__37785 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__4_in_rule__ContainerStyleDefinition__Group__37788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__0_in_rule__ContainerStyleDefinition__Group__3__Impl7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__4__Impl_in_rule__ContainerStyleDefinition__Group__47846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__ContainerStyleDefinition__Group__4__Impl7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__0__Impl_in_rule__ContainerStyleDefinition__Group_2__07915 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__1_in_rule__ContainerStyleDefinition__Group_2__07918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ContainerStyleDefinition__Group_2__0__Impl7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__1__Impl_in_rule__ContainerStyleDefinition__Group_2__17977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__LabelAssignment_2_1_in_rule__ContainerStyleDefinition__Group_2__1__Impl8004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__0__Impl_in_rule__ContainerStyleDefinition__Group_3__08038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__1_in_rule__ContainerStyleDefinition__Group_3__08041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ContainerStyleDefinition__Group_3__0__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__1__Impl_in_rule__ContainerStyleDefinition__Group_3__18100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__BorderAssignment_3_1_in_rule__ContainerStyleDefinition__Group_3__1__Impl8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__08161 = new BitSet(new long[]{0x1080000000001800L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__08164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__CreatableAssignment_0_in_rule__Node__Group__0__Impl8191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__18222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__18225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Node__Group__1__Impl8253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__28284 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__28287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__38344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__4_in_rule__Node__Group__38347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Node__Group__3__Impl8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__48406 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__5_in_rule__Node__Group__48409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__EClassAssignment_4_in_rule__Node__Group__4__Impl8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__58466 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__Node__Group__6_in_rule__Node__Group__58469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Node__Group__5__Impl8497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__68528 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__7_in_rule__Node__Group__68531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ExpressionAssignment_6_in_rule__Node__Group__6__Impl8558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__78588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__StyleAssignment_7_in_rule__Node__Group__7__Impl8615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__0__Impl_in_rule__NodeStyleDefinition__Group__08662 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__1_in_rule__NodeStyleDefinition__Group__08665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__NodeStyleDefinition__Group__0__Impl8693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__1__Impl_in_rule__NodeStyleDefinition__Group__18724 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__2_in_rule__NodeStyleDefinition__Group__18727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__ColorAssignment_1_in_rule__NodeStyleDefinition__Group__1__Impl8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__2__Impl_in_rule__NodeStyleDefinition__Group__28784 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__3_in_rule__NodeStyleDefinition__Group__28787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__0_in_rule__NodeStyleDefinition__Group__2__Impl8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__3__Impl_in_rule__NodeStyleDefinition__Group__38845 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__4_in_rule__NodeStyleDefinition__Group__38848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__0_in_rule__NodeStyleDefinition__Group__3__Impl8875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__4__Impl_in_rule__NodeStyleDefinition__Group__48906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__NodeStyleDefinition__Group__4__Impl8934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__0__Impl_in_rule__NodeStyleDefinition__Group_2__08975 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__1_in_rule__NodeStyleDefinition__Group_2__08978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__NodeStyleDefinition__Group_2__0__Impl9006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__1__Impl_in_rule__NodeStyleDefinition__Group_2__19037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__LabelAssignment_2_1_in_rule__NodeStyleDefinition__Group_2__1__Impl9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__0__Impl_in_rule__NodeStyleDefinition__Group_3__09098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__1_in_rule__NodeStyleDefinition__Group_3__09101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__NodeStyleDefinition__Group_3__0__Impl9129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__1__Impl_in_rule__NodeStyleDefinition__Group_3__19160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__BorderAssignment_3_1_in_rule__NodeStyleDefinition__Group_3__1__Impl9187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__Group__0__Impl_in_rule__SolidColorDefinition__Group__09221 = new BitSet(new long[]{0x0000007FFFFFE000L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__Group__1_in_rule__SolidColorDefinition__Group__09224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__SolidColorDefinition__Group__0__Impl9252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__Group__1__Impl_in_rule__SolidColorDefinition__Group__19283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__ColorAssignment_1_in_rule__SolidColorDefinition__Group__1__Impl9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__0__Impl_in_rule__GradientColorDefinition__Group__09344 = new BitSet(new long[]{0x0000007FFFFFE000L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__1_in_rule__GradientColorDefinition__Group__09347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__GradientColorDefinition__Group__0__Impl9375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__1__Impl_in_rule__GradientColorDefinition__Group__19406 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__2_in_rule__GradientColorDefinition__Group__19409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__FromAssignment_1_in_rule__GradientColorDefinition__Group__1__Impl9436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__2__Impl_in_rule__GradientColorDefinition__Group__29466 = new BitSet(new long[]{0x0000007FFFFFE000L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__3_in_rule__GradientColorDefinition__Group__29469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__GradientColorDefinition__Group__2__Impl9497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__3__Impl_in_rule__GradientColorDefinition__Group__39528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__ToAssignment_3_in_rule__GradientColorDefinition__Group__3__Impl9555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__0__Impl_in_rule__LabelStyleDefinition__Group__09593 = new BitSet(new long[]{0x2000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__1_in_rule__LabelStyleDefinition__Group__09596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__LabelStyleDefinition__Group__0__Impl9624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__1__Impl_in_rule__LabelStyleDefinition__Group__19655 = new BitSet(new long[]{0x2000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__2_in_rule__LabelStyleDefinition__Group__19658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__ExpressionAssignment_1_in_rule__LabelStyleDefinition__Group__1__Impl9685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__2__Impl_in_rule__LabelStyleDefinition__Group__29716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000301L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__3_in_rule__LabelStyleDefinition__Group__29719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__ColorAssignment_2_in_rule__LabelStyleDefinition__Group__2__Impl9746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__3__Impl_in_rule__LabelStyleDefinition__Group__39776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000301L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__4_in_rule__LabelStyleDefinition__Group__39779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__0_in_rule__LabelStyleDefinition__Group__3__Impl9806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__4__Impl_in_rule__LabelStyleDefinition__Group__49837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000301L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__5_in_rule__LabelStyleDefinition__Group__49840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__BoldAssignment_4_in_rule__LabelStyleDefinition__Group__4__Impl9867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__5__Impl_in_rule__LabelStyleDefinition__Group__59898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__ItalicAssignment_5_in_rule__LabelStyleDefinition__Group__5__Impl9925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__0__Impl_in_rule__LabelStyleDefinition__Group_3__09968 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__1_in_rule__LabelStyleDefinition__Group_3__09971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__LabelStyleDefinition__Group_3__0__Impl9999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__1__Impl_in_rule__LabelStyleDefinition__Group_3__110030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__SizeAssignment_3_1_in_rule__LabelStyleDefinition__Group_3__1__Impl10057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__0__Impl_in_rule__BorderStyleDefinition__Group__010091 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__1_in_rule__BorderStyleDefinition__Group__010094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__BorderStyleDefinition__Group__0__Impl10122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__1__Impl_in_rule__BorderStyleDefinition__Group__110153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__2_in_rule__BorderStyleDefinition__Group__110156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__ColorAssignment_1_in_rule__BorderStyleDefinition__Group__1__Impl10183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__2__Impl_in_rule__BorderStyleDefinition__Group__210213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__0_in_rule__BorderStyleDefinition__Group__2__Impl10240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__0__Impl_in_rule__BorderStyleDefinition__Group_2__010277 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__1_in_rule__BorderStyleDefinition__Group_2__010280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__BorderStyleDefinition__Group_2__0__Impl10308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__1__Impl_in_rule__BorderStyleDefinition__Group_2__110339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__SizeAssignment_2_1_in_rule__BorderStyleDefinition__Group_2__1__Impl10366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__0__Impl_in_rule__AcceleoExpression__Group__010400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__1_in_rule__AcceleoExpression__Group__010403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__AcceleoExpression__Group__0__Impl10431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__1__Impl_in_rule__AcceleoExpression__Group__110462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__ValueAssignment_1_in_rule__AcceleoExpression__Group__1__Impl10489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__Group__0__Impl_in_rule__VarRef__Group__010523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VarRef__Group__1_in_rule__VarRef__Group__010526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__VarRef__Group__0__Impl10554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__Group__1__Impl_in_rule__VarRef__Group__110585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__ValueAssignment_1_in_rule__VarRef__Group__1__Impl10612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__0__Impl_in_rule__FeatureRef__Group__010646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__1_in_rule__FeatureRef__Group__010649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__FeatureRef__Group__0__Impl10677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__1__Impl_in_rule__FeatureRef__Group__110708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__ValueAssignment_1_in_rule__FeatureRef__Group__1__Impl10735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelRef__Group__0__Impl_in_rule__MetamodelRef__Group__010769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetamodelRef__Group__1_in_rule__MetamodelRef__Group__010772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__MetamodelRef__Group__0__Impl10800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelRef__Group__1__Impl_in_rule__MetamodelRef__Group__110831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelRef__MetamodelAssignment_1_in_rule__MetamodelRef__Group__1__Impl10858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelUsage__Group__0__Impl_in_rule__MetamodelUsage__Group__010892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetamodelUsage__Group__1_in_rule__MetamodelUsage__Group__010895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__MetamodelUsage__Group__0__Impl10923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelUsage__Group__1__Impl_in_rule__MetamodelUsage__Group__110954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelUsage__UsageAssignment_1_in_rule__MetamodelUsage__Group__1__Impl10981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPrototyper__NameAssignment_111020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPrototyper__QualifierAssignment_3_111051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPViewpoint_in_rule__SPrototyper__ViewpointsAssignment_411082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPViewpoint__NameAssignment_111113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPViewpoint__ShortcutAssignment_3_111144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPViewpoint__ExtensionAssignment_4_111175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPRepresentation_in_rule__SPViewpoint__RepresentationsAssignment_511206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPTable__NameAssignment_111237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPTable__LabelAssignment_3_111268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPTable__TitleAssignment_4_111299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelUsage_in_rule__SPTable__UsagesAssignment_511330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPTable__RootAssignment_711361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_rule__SPTable__ElementsAssignment_811392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableProperty_in_rule__SPTable__PropertiesAssignment_911423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__TableElement__CreatableAssignment_011459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__TableElement__RecursiveAssignment_111503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableElement__EClassAssignment_311542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__TableElement__ExpressionAssignment_511573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_rule__TableElement__SubElementsAssignment_6_111604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableProperty__FeatureAssignment_111635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableProperty__LabelAssignment_2_111666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__TableProperty__ExpressionAssignment_3_111697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPDiagram__NameAssignment_111728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPDiagram__LabelAssignment_3_111759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPDiagram__TitleAssignment_4_111790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelRef_in_rule__SPDiagram__MetamodelsAssignment_511821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPDiagram__RootAssignment_711852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_rule__SPDiagram__ElementsAssignment_811883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Container__CreatableAssignment_011919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__Container__RecursiveAssignment_111963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerType_in_rule__Container__ContainerTypeAssignment_212002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Container__NameAssignment_412033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Container__EClassAssignment_612064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__Container__ExpressionAssignment_812095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerStyleDefinition_in_rule__Container__StyleAssignment_912126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_rule__Container__ElementsAssignment_10_112157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_rule__ContainerStyleDefinition__ColorAssignment_112188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_rule__ContainerStyleDefinition__LabelAssignment_2_112219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_rule__ContainerStyleDefinition__BorderAssignment_3_112250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Node__CreatableAssignment_012286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_212325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__EClassAssignment_412356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__Node__ExpressionAssignment_612387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeStyleDefinition_in_rule__Node__StyleAssignment_712418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__NodeStyleDefinition__ColorAssignment_112449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_rule__NodeStyleDefinition__LabelAssignment_2_112480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_rule__NodeStyleDefinition__BorderAssignment_3_112511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__SolidColorDefinition__ColorAssignment_112542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__GradientColorDefinition__FromAssignment_112573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__GradientColorDefinition__ToAssignment_312604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__LabelStyleDefinition__ExpressionAssignment_112635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__LabelStyleDefinition__ColorAssignment_212666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LabelStyleDefinition__SizeAssignment_3_112697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__LabelStyleDefinition__BoldAssignment_412733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__LabelStyleDefinition__ItalicAssignment_512777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__BorderStyleDefinition__ColorAssignment_112816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__BorderStyleDefinition__SizeAssignment_2_112847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AcceleoExpression__ValueAssignment_112878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VarRef__ValueAssignment_112909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureRef__ValueAssignment_112940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetamodelRef__MetamodelAssignment_112971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColor_in_rule__PreDefinedColorDefinition__ColorAssignment13002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MetamodelUsage__UsageAssignment_113037 = new BitSet(new long[]{0x0000000000000002L});

}