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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'freeform'", "'list'", "'white'", "'black'", "'blue'", "'light blue'", "'dark blue'", "'chocolate'", "'light chocolate'", "'dark chocolate'", "'gray'", "'light gray'", "'dark gray'", "'green'", "'light green'", "'dark green'", "'orange'", "'light orange'", "'dark orange'", "'purple'", "'light purple'", "'dark purple'", "'red'", "'light red'", "'dark red'", "'yellow'", "'light yellow'", "'dark yellow'", "'proto'", "'{'", "'generate'", "'}'", "'qualifier'", "'viewpoint'", "'shortcut'", "'ext'", "'table'", "'root'", "'label'", "'title'", "'element'", "'accessibleThrough'", "'via'", "'property'", "'expression'", "'diagram'", "'container'", "'for'", "'['", "']'", "','", "'node'", "'color'", "'gradient from'", "'to'", "'size'", "'border '", "'acc:'", "'var:'", "'feature:'", "'service:'", "'metamodel'", "'use'", "'.'", "'recursive'", "'creatable'", "'bold'", "'italic'"
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


    // $ANTLR start "entryRuleRequestExpression"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:592:1: entryRuleRequestExpression : ruleRequestExpression EOF ;
    public final void entryRuleRequestExpression() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:593:1: ( ruleRequestExpression EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:594:1: ruleRequestExpression EOF
            {
             before(grammarAccess.getRequestExpressionRule()); 
            pushFollow(FOLLOW_ruleRequestExpression_in_entryRuleRequestExpression1201);
            ruleRequestExpression();

            state._fsp--;

             after(grammarAccess.getRequestExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestExpression1208); 

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
    // $ANTLR end "entryRuleRequestExpression"


    // $ANTLR start "ruleRequestExpression"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:601:1: ruleRequestExpression : ( ( rule__RequestExpression__Alternatives ) ) ;
    public final void ruleRequestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:605:2: ( ( ( rule__RequestExpression__Alternatives ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:606:1: ( ( rule__RequestExpression__Alternatives ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:606:1: ( ( rule__RequestExpression__Alternatives ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:607:1: ( rule__RequestExpression__Alternatives )
            {
             before(grammarAccess.getRequestExpressionAccess().getAlternatives()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:608:1: ( rule__RequestExpression__Alternatives )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:608:2: rule__RequestExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__RequestExpression__Alternatives_in_ruleRequestExpression1234);
            rule__RequestExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRequestExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequestExpression"


    // $ANTLR start "entryRuleRequestOrCreateExpression"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:620:1: entryRuleRequestOrCreateExpression : ruleRequestOrCreateExpression EOF ;
    public final void entryRuleRequestOrCreateExpression() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:621:1: ( ruleRequestOrCreateExpression EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:622:1: ruleRequestOrCreateExpression EOF
            {
             before(grammarAccess.getRequestOrCreateExpressionRule()); 
            pushFollow(FOLLOW_ruleRequestOrCreateExpression_in_entryRuleRequestOrCreateExpression1261);
            ruleRequestOrCreateExpression();

            state._fsp--;

             after(grammarAccess.getRequestOrCreateExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestOrCreateExpression1268); 

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
    // $ANTLR end "entryRuleRequestOrCreateExpression"


    // $ANTLR start "ruleRequestOrCreateExpression"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:629:1: ruleRequestOrCreateExpression : ( ( rule__RequestOrCreateExpression__Alternatives ) ) ;
    public final void ruleRequestOrCreateExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:633:2: ( ( ( rule__RequestOrCreateExpression__Alternatives ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:634:1: ( ( rule__RequestOrCreateExpression__Alternatives ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:634:1: ( ( rule__RequestOrCreateExpression__Alternatives ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:635:1: ( rule__RequestOrCreateExpression__Alternatives )
            {
             before(grammarAccess.getRequestOrCreateExpressionAccess().getAlternatives()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:636:1: ( rule__RequestOrCreateExpression__Alternatives )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:636:2: rule__RequestOrCreateExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__RequestOrCreateExpression__Alternatives_in_ruleRequestOrCreateExpression1294);
            rule__RequestOrCreateExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRequestOrCreateExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequestOrCreateExpression"


    // $ANTLR start "entryRuleAcceleoExpression"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:648:1: entryRuleAcceleoExpression : ruleAcceleoExpression EOF ;
    public final void entryRuleAcceleoExpression() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:649:1: ( ruleAcceleoExpression EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:650:1: ruleAcceleoExpression EOF
            {
             before(grammarAccess.getAcceleoExpressionRule()); 
            pushFollow(FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression1321);
            ruleAcceleoExpression();

            state._fsp--;

             after(grammarAccess.getAcceleoExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcceleoExpression1328); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:657:1: ruleAcceleoExpression : ( ( rule__AcceleoExpression__Group__0 ) ) ;
    public final void ruleAcceleoExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:661:2: ( ( ( rule__AcceleoExpression__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:662:1: ( ( rule__AcceleoExpression__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:662:1: ( ( rule__AcceleoExpression__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:663:1: ( rule__AcceleoExpression__Group__0 )
            {
             before(grammarAccess.getAcceleoExpressionAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:664:1: ( rule__AcceleoExpression__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:664:2: rule__AcceleoExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__Group__0_in_ruleAcceleoExpression1354);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:676:1: entryRuleVarRef : ruleVarRef EOF ;
    public final void entryRuleVarRef() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:677:1: ( ruleVarRef EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:678:1: ruleVarRef EOF
            {
             before(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef1381);
            ruleVarRef();

            state._fsp--;

             after(grammarAccess.getVarRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef1388); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:685:1: ruleVarRef : ( ( rule__VarRef__Group__0 ) ) ;
    public final void ruleVarRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:689:2: ( ( ( rule__VarRef__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:690:1: ( ( rule__VarRef__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:690:1: ( ( rule__VarRef__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:691:1: ( rule__VarRef__Group__0 )
            {
             before(grammarAccess.getVarRefAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:692:1: ( rule__VarRef__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:692:2: rule__VarRef__Group__0
            {
            pushFollow(FOLLOW_rule__VarRef__Group__0_in_ruleVarRef1414);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:704:1: entryRuleFeatureRef : ruleFeatureRef EOF ;
    public final void entryRuleFeatureRef() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:705:1: ( ruleFeatureRef EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:706:1: ruleFeatureRef EOF
            {
             before(grammarAccess.getFeatureRefRule()); 
            pushFollow(FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef1441);
            ruleFeatureRef();

            state._fsp--;

             after(grammarAccess.getFeatureRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureRef1448); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:713:1: ruleFeatureRef : ( ( rule__FeatureRef__Group__0 ) ) ;
    public final void ruleFeatureRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:717:2: ( ( ( rule__FeatureRef__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:718:1: ( ( rule__FeatureRef__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:718:1: ( ( rule__FeatureRef__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:719:1: ( rule__FeatureRef__Group__0 )
            {
             before(grammarAccess.getFeatureRefAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:720:1: ( rule__FeatureRef__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:720:2: rule__FeatureRef__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureRef__Group__0_in_ruleFeatureRef1474);
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


    // $ANTLR start "entryRuleServiceRef"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:732:1: entryRuleServiceRef : ruleServiceRef EOF ;
    public final void entryRuleServiceRef() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:733:1: ( ruleServiceRef EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:734:1: ruleServiceRef EOF
            {
             before(grammarAccess.getServiceRefRule()); 
            pushFollow(FOLLOW_ruleServiceRef_in_entryRuleServiceRef1501);
            ruleServiceRef();

            state._fsp--;

             after(grammarAccess.getServiceRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceRef1508); 

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
    // $ANTLR end "entryRuleServiceRef"


    // $ANTLR start "ruleServiceRef"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:741:1: ruleServiceRef : ( ( rule__ServiceRef__Group__0 ) ) ;
    public final void ruleServiceRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:745:2: ( ( ( rule__ServiceRef__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:746:1: ( ( rule__ServiceRef__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:746:1: ( ( rule__ServiceRef__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:747:1: ( rule__ServiceRef__Group__0 )
            {
             before(grammarAccess.getServiceRefAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:748:1: ( rule__ServiceRef__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:748:2: rule__ServiceRef__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceRef__Group__0_in_ruleServiceRef1534);
            rule__ServiceRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceRef"


    // $ANTLR start "entryRuleMetamodelUsage"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:760:1: entryRuleMetamodelUsage : ruleMetamodelUsage EOF ;
    public final void entryRuleMetamodelUsage() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:761:1: ( ruleMetamodelUsage EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:762:1: ruleMetamodelUsage EOF
            {
             before(grammarAccess.getMetamodelUsageRule()); 
            pushFollow(FOLLOW_ruleMetamodelUsage_in_entryRuleMetamodelUsage1561);
            ruleMetamodelUsage();

            state._fsp--;

             after(grammarAccess.getMetamodelUsageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelUsage1568); 

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
            pushFollow(FOLLOW_rule__MetamodelUsage__Group__0_in_ruleMetamodelUsage1594);
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


    // $ANTLR start "entryRuleJavaServiceClassReference"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:788:1: entryRuleJavaServiceClassReference : ruleJavaServiceClassReference EOF ;
    public final void entryRuleJavaServiceClassReference() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:789:1: ( ruleJavaServiceClassReference EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:790:1: ruleJavaServiceClassReference EOF
            {
             before(grammarAccess.getJavaServiceClassReferenceRule()); 
            pushFollow(FOLLOW_ruleJavaServiceClassReference_in_entryRuleJavaServiceClassReference1621);
            ruleJavaServiceClassReference();

            state._fsp--;

             after(grammarAccess.getJavaServiceClassReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaServiceClassReference1628); 

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
    // $ANTLR end "entryRuleJavaServiceClassReference"


    // $ANTLR start "ruleJavaServiceClassReference"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:797:1: ruleJavaServiceClassReference : ( ( rule__JavaServiceClassReference__Group__0 ) ) ;
    public final void ruleJavaServiceClassReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:801:2: ( ( ( rule__JavaServiceClassReference__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:802:1: ( ( rule__JavaServiceClassReference__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:802:1: ( ( rule__JavaServiceClassReference__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:803:1: ( rule__JavaServiceClassReference__Group__0 )
            {
             before(grammarAccess.getJavaServiceClassReferenceAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:804:1: ( rule__JavaServiceClassReference__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:804:2: rule__JavaServiceClassReference__Group__0
            {
            pushFollow(FOLLOW_rule__JavaServiceClassReference__Group__0_in_ruleJavaServiceClassReference1654);
            rule__JavaServiceClassReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJavaServiceClassReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJavaServiceClassReference"


    // $ANTLR start "entryRuleColor"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:816:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:817:1: ( ruleColor EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:818:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor1681);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor1688); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:825:1: ruleColor : ( rulePreDefinedColorDefinition ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:829:2: ( ( rulePreDefinedColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:830:1: ( rulePreDefinedColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:830:1: ( rulePreDefinedColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:831:1: rulePreDefinedColorDefinition
            {
             before(grammarAccess.getColorAccess().getPreDefinedColorDefinitionParserRuleCall()); 
            pushFollow(FOLLOW_rulePreDefinedColorDefinition_in_ruleColor1714);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:844:1: entryRulePreDefinedColorDefinition : rulePreDefinedColorDefinition EOF ;
    public final void entryRulePreDefinedColorDefinition() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:845:1: ( rulePreDefinedColorDefinition EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:846:1: rulePreDefinedColorDefinition EOF
            {
             before(grammarAccess.getPreDefinedColorDefinitionRule()); 
            pushFollow(FOLLOW_rulePreDefinedColorDefinition_in_entryRulePreDefinedColorDefinition1740);
            rulePreDefinedColorDefinition();

            state._fsp--;

             after(grammarAccess.getPreDefinedColorDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreDefinedColorDefinition1747); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:853:1: rulePreDefinedColorDefinition : ( ( rule__PreDefinedColorDefinition__ColorAssignment ) ) ;
    public final void rulePreDefinedColorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:857:2: ( ( ( rule__PreDefinedColorDefinition__ColorAssignment ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:858:1: ( ( rule__PreDefinedColorDefinition__ColorAssignment ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:858:1: ( ( rule__PreDefinedColorDefinition__ColorAssignment ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:859:1: ( rule__PreDefinedColorDefinition__ColorAssignment )
            {
             before(grammarAccess.getPreDefinedColorDefinitionAccess().getColorAssignment()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:860:1: ( rule__PreDefinedColorDefinition__ColorAssignment )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:860:2: rule__PreDefinedColorDefinition__ColorAssignment
            {
            pushFollow(FOLLOW_rule__PreDefinedColorDefinition__ColorAssignment_in_rulePreDefinedColorDefinition1773);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:872:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:873:1: ( ruleQualifiedName EOF )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:874:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1800);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1807); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:881:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:885:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:886:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:886:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:887:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:888:1: ( rule__QualifiedName__Group__0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:888:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1833);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rulePreDefinedColor"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:901:1: rulePreDefinedColor : ( ( rule__PreDefinedColor__Alternatives ) ) ;
    public final void rulePreDefinedColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:905:1: ( ( ( rule__PreDefinedColor__Alternatives ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:906:1: ( ( rule__PreDefinedColor__Alternatives ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:906:1: ( ( rule__PreDefinedColor__Alternatives ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:907:1: ( rule__PreDefinedColor__Alternatives )
            {
             before(grammarAccess.getPreDefinedColorAccess().getAlternatives()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:908:1: ( rule__PreDefinedColor__Alternatives )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:908:2: rule__PreDefinedColor__Alternatives
            {
            pushFollow(FOLLOW_rule__PreDefinedColor__Alternatives_in_rulePreDefinedColor1870);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:919:1: rule__SPRepresentation__Alternatives : ( ( ruleSPTable ) | ( ruleSPDiagram ) );
    public final void rule__SPRepresentation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:923:1: ( ( ruleSPTable ) | ( ruleSPDiagram ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==47) ) {
                alt1=1;
            }
            else if ( (LA1_0==56) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:924:1: ( ruleSPTable )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:924:1: ( ruleSPTable )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:925:1: ruleSPTable
                    {
                     before(grammarAccess.getSPRepresentationAccess().getSPTableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSPTable_in_rule__SPRepresentation__Alternatives1905);
                    ruleSPTable();

                    state._fsp--;

                     after(grammarAccess.getSPRepresentationAccess().getSPTableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:930:6: ( ruleSPDiagram )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:930:6: ( ruleSPDiagram )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:931:1: ruleSPDiagram
                    {
                     before(grammarAccess.getSPRepresentationAccess().getSPDiagramParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSPDiagram_in_rule__SPRepresentation__Alternatives1922);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:941:1: rule__DiagramElement__Alternatives : ( ( ruleContainer ) | ( ruleNode ) );
    public final void rule__DiagramElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:945:1: ( ( ruleContainer ) | ( ruleNode ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 76:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==62) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=11 && LA2_1<=12)||LA2_1==57||LA2_1==75) ) {
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
            case 57:
            case 75:
                {
                alt2=1;
                }
                break;
            case 62:
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
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:946:1: ( ruleContainer )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:946:1: ( ruleContainer )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:947:1: ruleContainer
                    {
                     before(grammarAccess.getDiagramElementAccess().getContainerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleContainer_in_rule__DiagramElement__Alternatives1954);
                    ruleContainer();

                    state._fsp--;

                     after(grammarAccess.getDiagramElementAccess().getContainerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:952:6: ( ruleNode )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:952:6: ( ruleNode )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:953:1: ruleNode
                    {
                     before(grammarAccess.getDiagramElementAccess().getNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNode_in_rule__DiagramElement__Alternatives1971);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:963:1: rule__ContainerType__Alternatives : ( ( 'freeform' ) | ( 'list' ) );
    public final void rule__ContainerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:967:1: ( ( 'freeform' ) | ( 'list' ) )
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
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:968:1: ( 'freeform' )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:968:1: ( 'freeform' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:969:1: 'freeform'
                    {
                     before(grammarAccess.getContainerTypeAccess().getFreeformKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__ContainerType__Alternatives2004); 
                     after(grammarAccess.getContainerTypeAccess().getFreeformKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:976:6: ( 'list' )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:976:6: ( 'list' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:977:1: 'list'
                    {
                     before(grammarAccess.getContainerTypeAccess().getListKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__ContainerType__Alternatives2024); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:989:1: rule__ContainerColorDefinition__Alternatives : ( ( ruleSolidColorDefinition ) | ( ruleGradientColorDefinition ) );
    public final void rule__ContainerColorDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:993:1: ( ( ruleSolidColorDefinition ) | ( ruleGradientColorDefinition ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==63) ) {
                alt4=1;
            }
            else if ( (LA4_0==64) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:994:1: ( ruleSolidColorDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:994:1: ( ruleSolidColorDefinition )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:995:1: ruleSolidColorDefinition
                    {
                     before(grammarAccess.getContainerColorDefinitionAccess().getSolidColorDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__ContainerColorDefinition__Alternatives2058);
                    ruleSolidColorDefinition();

                    state._fsp--;

                     after(grammarAccess.getContainerColorDefinitionAccess().getSolidColorDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1000:6: ( ruleGradientColorDefinition )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1000:6: ( ruleGradientColorDefinition )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1001:1: ruleGradientColorDefinition
                    {
                     before(grammarAccess.getContainerColorDefinitionAccess().getGradientColorDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGradientColorDefinition_in_rule__ContainerColorDefinition__Alternatives2075);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1011:1: rule__SPExpression__Alternatives : ( ( ruleRequestExpression ) | ( ruleRequestOrCreateExpression ) );
    public final void rule__SPExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1015:1: ( ( ruleRequestExpression ) | ( ruleRequestOrCreateExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=69 && LA5_0<=70)) ) {
                alt5=1;
            }
            else if ( (LA5_0==68||LA5_0==71) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1016:1: ( ruleRequestExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1016:1: ( ruleRequestExpression )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1017:1: ruleRequestExpression
                    {
                     before(grammarAccess.getSPExpressionAccess().getRequestExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRequestExpression_in_rule__SPExpression__Alternatives2107);
                    ruleRequestExpression();

                    state._fsp--;

                     after(grammarAccess.getSPExpressionAccess().getRequestExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1022:6: ( ruleRequestOrCreateExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1022:6: ( ruleRequestOrCreateExpression )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1023:1: ruleRequestOrCreateExpression
                    {
                     before(grammarAccess.getSPExpressionAccess().getRequestOrCreateExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRequestOrCreateExpression_in_rule__SPExpression__Alternatives2124);
                    ruleRequestOrCreateExpression();

                    state._fsp--;

                     after(grammarAccess.getSPExpressionAccess().getRequestOrCreateExpressionParserRuleCall_1()); 

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


    // $ANTLR start "rule__RequestExpression__Alternatives"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1033:1: rule__RequestExpression__Alternatives : ( ( ruleVarRef ) | ( ruleFeatureRef ) );
    public final void rule__RequestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1037:1: ( ( ruleVarRef ) | ( ruleFeatureRef ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==69) ) {
                alt6=1;
            }
            else if ( (LA6_0==70) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1038:1: ( ruleVarRef )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1038:1: ( ruleVarRef )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1039:1: ruleVarRef
                    {
                     before(grammarAccess.getRequestExpressionAccess().getVarRefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVarRef_in_rule__RequestExpression__Alternatives2156);
                    ruleVarRef();

                    state._fsp--;

                     after(grammarAccess.getRequestExpressionAccess().getVarRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1044:6: ( ruleFeatureRef )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1044:6: ( ruleFeatureRef )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1045:1: ruleFeatureRef
                    {
                     before(grammarAccess.getRequestExpressionAccess().getFeatureRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFeatureRef_in_rule__RequestExpression__Alternatives2173);
                    ruleFeatureRef();

                    state._fsp--;

                     after(grammarAccess.getRequestExpressionAccess().getFeatureRefParserRuleCall_1()); 

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
    // $ANTLR end "rule__RequestExpression__Alternatives"


    // $ANTLR start "rule__RequestOrCreateExpression__Alternatives"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1055:1: rule__RequestOrCreateExpression__Alternatives : ( ( ruleAcceleoExpression ) | ( ruleServiceRef ) );
    public final void rule__RequestOrCreateExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1059:1: ( ( ruleAcceleoExpression ) | ( ruleServiceRef ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==68) ) {
                alt7=1;
            }
            else if ( (LA7_0==71) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1060:1: ( ruleAcceleoExpression )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1060:1: ( ruleAcceleoExpression )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1061:1: ruleAcceleoExpression
                    {
                     before(grammarAccess.getRequestOrCreateExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAcceleoExpression_in_rule__RequestOrCreateExpression__Alternatives2205);
                    ruleAcceleoExpression();

                    state._fsp--;

                     after(grammarAccess.getRequestOrCreateExpressionAccess().getAcceleoExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1066:6: ( ruleServiceRef )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1066:6: ( ruleServiceRef )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1067:1: ruleServiceRef
                    {
                     before(grammarAccess.getRequestOrCreateExpressionAccess().getServiceRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleServiceRef_in_rule__RequestOrCreateExpression__Alternatives2222);
                    ruleServiceRef();

                    state._fsp--;

                     after(grammarAccess.getRequestOrCreateExpressionAccess().getServiceRefParserRuleCall_1()); 

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
    // $ANTLR end "rule__RequestOrCreateExpression__Alternatives"


    // $ANTLR start "rule__PreDefinedColor__Alternatives"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1077:1: rule__PreDefinedColor__Alternatives : ( ( ( 'white' ) ) | ( ( 'black' ) ) | ( ( 'blue' ) ) | ( ( 'light blue' ) ) | ( ( 'dark blue' ) ) | ( ( 'chocolate' ) ) | ( ( 'light chocolate' ) ) | ( ( 'dark chocolate' ) ) | ( ( 'gray' ) ) | ( ( 'light gray' ) ) | ( ( 'dark gray' ) ) | ( ( 'green' ) ) | ( ( 'light green' ) ) | ( ( 'dark green' ) ) | ( ( 'orange' ) ) | ( ( 'light orange' ) ) | ( ( 'dark orange' ) ) | ( ( 'purple' ) ) | ( ( 'light purple' ) ) | ( ( 'dark purple' ) ) | ( ( 'red' ) ) | ( ( 'light red' ) ) | ( ( 'dark red' ) ) | ( ( 'yellow' ) ) | ( ( 'light yellow' ) ) | ( ( 'dark yellow' ) ) );
    public final void rule__PreDefinedColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1081:1: ( ( ( 'white' ) ) | ( ( 'black' ) ) | ( ( 'blue' ) ) | ( ( 'light blue' ) ) | ( ( 'dark blue' ) ) | ( ( 'chocolate' ) ) | ( ( 'light chocolate' ) ) | ( ( 'dark chocolate' ) ) | ( ( 'gray' ) ) | ( ( 'light gray' ) ) | ( ( 'dark gray' ) ) | ( ( 'green' ) ) | ( ( 'light green' ) ) | ( ( 'dark green' ) ) | ( ( 'orange' ) ) | ( ( 'light orange' ) ) | ( ( 'dark orange' ) ) | ( ( 'purple' ) ) | ( ( 'light purple' ) ) | ( ( 'dark purple' ) ) | ( ( 'red' ) ) | ( ( 'light red' ) ) | ( ( 'dark red' ) ) | ( ( 'yellow' ) ) | ( ( 'light yellow' ) ) | ( ( 'dark yellow' ) ) )
            int alt8=26;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            case 19:
                {
                alt8=7;
                }
                break;
            case 20:
                {
                alt8=8;
                }
                break;
            case 21:
                {
                alt8=9;
                }
                break;
            case 22:
                {
                alt8=10;
                }
                break;
            case 23:
                {
                alt8=11;
                }
                break;
            case 24:
                {
                alt8=12;
                }
                break;
            case 25:
                {
                alt8=13;
                }
                break;
            case 26:
                {
                alt8=14;
                }
                break;
            case 27:
                {
                alt8=15;
                }
                break;
            case 28:
                {
                alt8=16;
                }
                break;
            case 29:
                {
                alt8=17;
                }
                break;
            case 30:
                {
                alt8=18;
                }
                break;
            case 31:
                {
                alt8=19;
                }
                break;
            case 32:
                {
                alt8=20;
                }
                break;
            case 33:
                {
                alt8=21;
                }
                break;
            case 34:
                {
                alt8=22;
                }
                break;
            case 35:
                {
                alt8=23;
                }
                break;
            case 36:
                {
                alt8=24;
                }
                break;
            case 37:
                {
                alt8=25;
                }
                break;
            case 38:
                {
                alt8=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1082:1: ( ( 'white' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1082:1: ( ( 'white' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1083:1: ( 'white' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1084:1: ( 'white' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1084:3: 'white'
                    {
                    match(input,13,FOLLOW_13_in_rule__PreDefinedColor__Alternatives2255); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getWHITEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1089:6: ( ( 'black' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1089:6: ( ( 'black' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1090:1: ( 'black' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1091:1: ( 'black' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1091:3: 'black'
                    {
                    match(input,14,FOLLOW_14_in_rule__PreDefinedColor__Alternatives2276); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getBLACKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1096:6: ( ( 'blue' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1096:6: ( ( 'blue' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1097:1: ( 'blue' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1098:1: ( 'blue' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1098:3: 'blue'
                    {
                    match(input,15,FOLLOW_15_in_rule__PreDefinedColor__Alternatives2297); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getBLUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1103:6: ( ( 'light blue' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1103:6: ( ( 'light blue' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1104:1: ( 'light blue' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1105:1: ( 'light blue' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1105:3: 'light blue'
                    {
                    match(input,16,FOLLOW_16_in_rule__PreDefinedColor__Alternatives2318); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1110:6: ( ( 'dark blue' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1110:6: ( ( 'dark blue' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1111:1: ( 'dark blue' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1112:1: ( 'dark blue' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1112:3: 'dark blue'
                    {
                    match(input,17,FOLLOW_17_in_rule__PreDefinedColor__Alternatives2339); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_BLUEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1117:6: ( ( 'chocolate' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1117:6: ( ( 'chocolate' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1118:1: ( 'chocolate' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1119:1: ( 'chocolate' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1119:3: 'chocolate'
                    {
                    match(input,18,FOLLOW_18_in_rule__PreDefinedColor__Alternatives2360); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getCHOCOLATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1124:6: ( ( 'light chocolate' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1124:6: ( ( 'light chocolate' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1125:1: ( 'light chocolate' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1126:1: ( 'light chocolate' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1126:3: 'light chocolate'
                    {
                    match(input,19,FOLLOW_19_in_rule__PreDefinedColor__Alternatives2381); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_CHOCOLATEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1131:6: ( ( 'dark chocolate' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1131:6: ( ( 'dark chocolate' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1132:1: ( 'dark chocolate' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1133:1: ( 'dark chocolate' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1133:3: 'dark chocolate'
                    {
                    match(input,20,FOLLOW_20_in_rule__PreDefinedColor__Alternatives2402); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_CHOCOLATEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1138:6: ( ( 'gray' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1138:6: ( ( 'gray' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1139:1: ( 'gray' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1140:1: ( 'gray' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1140:3: 'gray'
                    {
                    match(input,21,FOLLOW_21_in_rule__PreDefinedColor__Alternatives2423); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getGRAYEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1145:6: ( ( 'light gray' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1145:6: ( ( 'light gray' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1146:1: ( 'light gray' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1147:1: ( 'light gray' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1147:3: 'light gray'
                    {
                    match(input,22,FOLLOW_22_in_rule__PreDefinedColor__Alternatives2444); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1152:6: ( ( 'dark gray' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1152:6: ( ( 'dark gray' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1153:1: ( 'dark gray' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1154:1: ( 'dark gray' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1154:3: 'dark gray'
                    {
                    match(input,23,FOLLOW_23_in_rule__PreDefinedColor__Alternatives2465); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_GRAYEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1159:6: ( ( 'green' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1159:6: ( ( 'green' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1160:1: ( 'green' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1161:1: ( 'green' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1161:3: 'green'
                    {
                    match(input,24,FOLLOW_24_in_rule__PreDefinedColor__Alternatives2486); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getGREENEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1166:6: ( ( 'light green' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1166:6: ( ( 'light green' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1167:1: ( 'light green' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1168:1: ( 'light green' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1168:3: 'light green'
                    {
                    match(input,25,FOLLOW_25_in_rule__PreDefinedColor__Alternatives2507); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_GREENEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1173:6: ( ( 'dark green' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1173:6: ( ( 'dark green' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1174:1: ( 'dark green' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1175:1: ( 'dark green' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1175:3: 'dark green'
                    {
                    match(input,26,FOLLOW_26_in_rule__PreDefinedColor__Alternatives2528); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_GREENEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1180:6: ( ( 'orange' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1180:6: ( ( 'orange' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1181:1: ( 'orange' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1182:1: ( 'orange' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1182:3: 'orange'
                    {
                    match(input,27,FOLLOW_27_in_rule__PreDefinedColor__Alternatives2549); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getORANGEEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1187:6: ( ( 'light orange' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1187:6: ( ( 'light orange' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1188:1: ( 'light orange' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1189:1: ( 'light orange' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1189:3: 'light orange'
                    {
                    match(input,28,FOLLOW_28_in_rule__PreDefinedColor__Alternatives2570); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_ORANGEEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1194:6: ( ( 'dark orange' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1194:6: ( ( 'dark orange' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1195:1: ( 'dark orange' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1196:1: ( 'dark orange' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1196:3: 'dark orange'
                    {
                    match(input,29,FOLLOW_29_in_rule__PreDefinedColor__Alternatives2591); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_ORANGEEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1201:6: ( ( 'purple' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1201:6: ( ( 'purple' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1202:1: ( 'purple' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1203:1: ( 'purple' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1203:3: 'purple'
                    {
                    match(input,30,FOLLOW_30_in_rule__PreDefinedColor__Alternatives2612); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getPURPLEEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1208:6: ( ( 'light purple' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1208:6: ( ( 'light purple' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1209:1: ( 'light purple' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1210:1: ( 'light purple' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1210:3: 'light purple'
                    {
                    match(input,31,FOLLOW_31_in_rule__PreDefinedColor__Alternatives2633); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_PURPLEEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1215:6: ( ( 'dark purple' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1215:6: ( ( 'dark purple' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1216:1: ( 'dark purple' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1217:1: ( 'dark purple' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1217:3: 'dark purple'
                    {
                    match(input,32,FOLLOW_32_in_rule__PreDefinedColor__Alternatives2654); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_PURPLEEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1222:6: ( ( 'red' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1222:6: ( ( 'red' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1223:1: ( 'red' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1224:1: ( 'red' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1224:3: 'red'
                    {
                    match(input,33,FOLLOW_33_in_rule__PreDefinedColor__Alternatives2675); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getREDEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1229:6: ( ( 'light red' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1229:6: ( ( 'light red' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1230:1: ( 'light red' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1231:1: ( 'light red' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1231:3: 'light red'
                    {
                    match(input,34,FOLLOW_34_in_rule__PreDefinedColor__Alternatives2696); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_REDEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1236:6: ( ( 'dark red' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1236:6: ( ( 'dark red' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1237:1: ( 'dark red' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1238:1: ( 'dark red' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1238:3: 'dark red'
                    {
                    match(input,35,FOLLOW_35_in_rule__PreDefinedColor__Alternatives2717); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getDARK_REDEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1243:6: ( ( 'yellow' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1243:6: ( ( 'yellow' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1244:1: ( 'yellow' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1245:1: ( 'yellow' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1245:3: 'yellow'
                    {
                    match(input,36,FOLLOW_36_in_rule__PreDefinedColor__Alternatives2738); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getYELLOWEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1250:6: ( ( 'light yellow' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1250:6: ( ( 'light yellow' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1251:1: ( 'light yellow' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1252:1: ( 'light yellow' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1252:3: 'light yellow'
                    {
                    match(input,37,FOLLOW_37_in_rule__PreDefinedColor__Alternatives2759); 

                    }

                     after(grammarAccess.getPreDefinedColorAccess().getLIGHT_YELLOWEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1257:6: ( ( 'dark yellow' ) )
                    {
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1257:6: ( ( 'dark yellow' ) )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1258:1: ( 'dark yellow' )
                    {
                     before(grammarAccess.getPreDefinedColorAccess().getDARK_YELLOWEnumLiteralDeclaration_25()); 
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1259:1: ( 'dark yellow' )
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1259:3: 'dark yellow'
                    {
                    match(input,38,FOLLOW_38_in_rule__PreDefinedColor__Alternatives2780); 

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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1271:1: rule__SPrototyper__Group__0 : rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1 ;
    public final void rule__SPrototyper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1275:1: ( rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1276:2: rule__SPrototyper__Group__0__Impl rule__SPrototyper__Group__1
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__0__Impl_in_rule__SPrototyper__Group__02813);
            rule__SPrototyper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__1_in_rule__SPrototyper__Group__02816);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1283:1: rule__SPrototyper__Group__0__Impl : ( 'proto' ) ;
    public final void rule__SPrototyper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1287:1: ( ( 'proto' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1288:1: ( 'proto' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1288:1: ( 'proto' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1289:1: 'proto'
            {
             before(grammarAccess.getSPrototyperAccess().getProtoKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__SPrototyper__Group__0__Impl2844); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1302:1: rule__SPrototyper__Group__1 : rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2 ;
    public final void rule__SPrototyper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1306:1: ( rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1307:2: rule__SPrototyper__Group__1__Impl rule__SPrototyper__Group__2
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__1__Impl_in_rule__SPrototyper__Group__12875);
            rule__SPrototyper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__2_in_rule__SPrototyper__Group__12878);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1314:1: rule__SPrototyper__Group__1__Impl : ( ( rule__SPrototyper__NameAssignment_1 ) ) ;
    public final void rule__SPrototyper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1318:1: ( ( ( rule__SPrototyper__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1319:1: ( ( rule__SPrototyper__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1319:1: ( ( rule__SPrototyper__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1320:1: ( rule__SPrototyper__NameAssignment_1 )
            {
             before(grammarAccess.getSPrototyperAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1321:1: ( rule__SPrototyper__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1321:2: rule__SPrototyper__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPrototyper__NameAssignment_1_in_rule__SPrototyper__Group__1__Impl2905);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1331:1: rule__SPrototyper__Group__2 : rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3 ;
    public final void rule__SPrototyper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1335:1: ( rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1336:2: rule__SPrototyper__Group__2__Impl rule__SPrototyper__Group__3
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__2__Impl_in_rule__SPrototyper__Group__22935);
            rule__SPrototyper__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__3_in_rule__SPrototyper__Group__22938);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1343:1: rule__SPrototyper__Group__2__Impl : ( '{' ) ;
    public final void rule__SPrototyper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1347:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1348:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1348:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1349:1: '{'
            {
             before(grammarAccess.getSPrototyperAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPrototyper__Group__2__Impl2966); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1362:1: rule__SPrototyper__Group__3 : rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4 ;
    public final void rule__SPrototyper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1366:1: ( rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1367:2: rule__SPrototyper__Group__3__Impl rule__SPrototyper__Group__4
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__3__Impl_in_rule__SPrototyper__Group__32997);
            rule__SPrototyper__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__4_in_rule__SPrototyper__Group__33000);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1374:1: rule__SPrototyper__Group__3__Impl : ( ( rule__SPrototyper__Group_3__0 )? ) ;
    public final void rule__SPrototyper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1378:1: ( ( ( rule__SPrototyper__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1379:1: ( ( rule__SPrototyper__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1379:1: ( ( rule__SPrototyper__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1380:1: ( rule__SPrototyper__Group_3__0 )?
            {
             before(grammarAccess.getSPrototyperAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1381:1: ( rule__SPrototyper__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1381:2: rule__SPrototyper__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPrototyper__Group_3__0_in_rule__SPrototyper__Group__3__Impl3027);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1391:1: rule__SPrototyper__Group__4 : rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5 ;
    public final void rule__SPrototyper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1395:1: ( rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1396:2: rule__SPrototyper__Group__4__Impl rule__SPrototyper__Group__5
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__4__Impl_in_rule__SPrototyper__Group__43058);
            rule__SPrototyper__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__5_in_rule__SPrototyper__Group__43061);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1403:1: rule__SPrototyper__Group__4__Impl : ( 'generate' ) ;
    public final void rule__SPrototyper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1407:1: ( ( 'generate' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1408:1: ( 'generate' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1408:1: ( 'generate' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1409:1: 'generate'
            {
             before(grammarAccess.getSPrototyperAccess().getGenerateKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__SPrototyper__Group__4__Impl3089); 
             after(grammarAccess.getSPrototyperAccess().getGenerateKeyword_4()); 

            }


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1422:1: rule__SPrototyper__Group__5 : rule__SPrototyper__Group__5__Impl rule__SPrototyper__Group__6 ;
    public final void rule__SPrototyper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1426:1: ( rule__SPrototyper__Group__5__Impl rule__SPrototyper__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1427:2: rule__SPrototyper__Group__5__Impl rule__SPrototyper__Group__6
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__5__Impl_in_rule__SPrototyper__Group__53120);
            rule__SPrototyper__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__6_in_rule__SPrototyper__Group__53123);
            rule__SPrototyper__Group__6();

            state._fsp--;


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1434:1: rule__SPrototyper__Group__5__Impl : ( ( rule__SPrototyper__TargetURIAssignment_5 ) ) ;
    public final void rule__SPrototyper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1438:1: ( ( ( rule__SPrototyper__TargetURIAssignment_5 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1439:1: ( ( rule__SPrototyper__TargetURIAssignment_5 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1439:1: ( ( rule__SPrototyper__TargetURIAssignment_5 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1440:1: ( rule__SPrototyper__TargetURIAssignment_5 )
            {
             before(grammarAccess.getSPrototyperAccess().getTargetURIAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1441:1: ( rule__SPrototyper__TargetURIAssignment_5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1441:2: rule__SPrototyper__TargetURIAssignment_5
            {
            pushFollow(FOLLOW_rule__SPrototyper__TargetURIAssignment_5_in_rule__SPrototyper__Group__5__Impl3150);
            rule__SPrototyper__TargetURIAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSPrototyperAccess().getTargetURIAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__SPrototyper__Group__6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1451:1: rule__SPrototyper__Group__6 : rule__SPrototyper__Group__6__Impl rule__SPrototyper__Group__7 ;
    public final void rule__SPrototyper__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1455:1: ( rule__SPrototyper__Group__6__Impl rule__SPrototyper__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1456:2: rule__SPrototyper__Group__6__Impl rule__SPrototyper__Group__7
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__6__Impl_in_rule__SPrototyper__Group__63180);
            rule__SPrototyper__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group__7_in_rule__SPrototyper__Group__63183);
            rule__SPrototyper__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__6"


    // $ANTLR start "rule__SPrototyper__Group__6__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1463:1: rule__SPrototyper__Group__6__Impl : ( ( rule__SPrototyper__ViewpointsAssignment_6 )* ) ;
    public final void rule__SPrototyper__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1467:1: ( ( ( rule__SPrototyper__ViewpointsAssignment_6 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1468:1: ( ( rule__SPrototyper__ViewpointsAssignment_6 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1468:1: ( ( rule__SPrototyper__ViewpointsAssignment_6 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1469:1: ( rule__SPrototyper__ViewpointsAssignment_6 )*
            {
             before(grammarAccess.getSPrototyperAccess().getViewpointsAssignment_6()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1470:1: ( rule__SPrototyper__ViewpointsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==44) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1470:2: rule__SPrototyper__ViewpointsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__SPrototyper__ViewpointsAssignment_6_in_rule__SPrototyper__Group__6__Impl3210);
            	    rule__SPrototyper__ViewpointsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSPrototyperAccess().getViewpointsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__6__Impl"


    // $ANTLR start "rule__SPrototyper__Group__7"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1480:1: rule__SPrototyper__Group__7 : rule__SPrototyper__Group__7__Impl ;
    public final void rule__SPrototyper__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1484:1: ( rule__SPrototyper__Group__7__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1485:2: rule__SPrototyper__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group__7__Impl_in_rule__SPrototyper__Group__73241);
            rule__SPrototyper__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__7"


    // $ANTLR start "rule__SPrototyper__Group__7__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1491:1: rule__SPrototyper__Group__7__Impl : ( '}' ) ;
    public final void rule__SPrototyper__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1495:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1496:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1496:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1497:1: '}'
            {
             before(grammarAccess.getSPrototyperAccess().getRightCurlyBracketKeyword_7()); 
            match(input,42,FOLLOW_42_in_rule__SPrototyper__Group__7__Impl3269); 
             after(grammarAccess.getSPrototyperAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__Group__7__Impl"


    // $ANTLR start "rule__SPrototyper__Group_3__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1526:1: rule__SPrototyper__Group_3__0 : rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1 ;
    public final void rule__SPrototyper__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1530:1: ( rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1531:2: rule__SPrototyper__Group_3__0__Impl rule__SPrototyper__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group_3__0__Impl_in_rule__SPrototyper__Group_3__03316);
            rule__SPrototyper__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPrototyper__Group_3__1_in_rule__SPrototyper__Group_3__03319);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1538:1: rule__SPrototyper__Group_3__0__Impl : ( 'qualifier' ) ;
    public final void rule__SPrototyper__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1542:1: ( ( 'qualifier' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1543:1: ( 'qualifier' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1543:1: ( 'qualifier' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1544:1: 'qualifier'
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierKeyword_3_0()); 
            match(input,43,FOLLOW_43_in_rule__SPrototyper__Group_3__0__Impl3347); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1557:1: rule__SPrototyper__Group_3__1 : rule__SPrototyper__Group_3__1__Impl ;
    public final void rule__SPrototyper__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1561:1: ( rule__SPrototyper__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1562:2: rule__SPrototyper__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPrototyper__Group_3__1__Impl_in_rule__SPrototyper__Group_3__13378);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1568:1: rule__SPrototyper__Group_3__1__Impl : ( ( rule__SPrototyper__QualifierAssignment_3_1 ) ) ;
    public final void rule__SPrototyper__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1572:1: ( ( ( rule__SPrototyper__QualifierAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1573:1: ( ( rule__SPrototyper__QualifierAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1573:1: ( ( rule__SPrototyper__QualifierAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1574:1: ( rule__SPrototyper__QualifierAssignment_3_1 )
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1575:1: ( rule__SPrototyper__QualifierAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1575:2: rule__SPrototyper__QualifierAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPrototyper__QualifierAssignment_3_1_in_rule__SPrototyper__Group_3__1__Impl3405);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1589:1: rule__SPViewpoint__Group__0 : rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1 ;
    public final void rule__SPViewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1593:1: ( rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1594:2: rule__SPViewpoint__Group__0__Impl rule__SPViewpoint__Group__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__0__Impl_in_rule__SPViewpoint__Group__03439);
            rule__SPViewpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__1_in_rule__SPViewpoint__Group__03442);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1601:1: rule__SPViewpoint__Group__0__Impl : ( 'viewpoint' ) ;
    public final void rule__SPViewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1605:1: ( ( 'viewpoint' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1606:1: ( 'viewpoint' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1606:1: ( 'viewpoint' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1607:1: 'viewpoint'
            {
             before(grammarAccess.getSPViewpointAccess().getViewpointKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__SPViewpoint__Group__0__Impl3470); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1620:1: rule__SPViewpoint__Group__1 : rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2 ;
    public final void rule__SPViewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1624:1: ( rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1625:2: rule__SPViewpoint__Group__1__Impl rule__SPViewpoint__Group__2
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__1__Impl_in_rule__SPViewpoint__Group__13501);
            rule__SPViewpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__2_in_rule__SPViewpoint__Group__13504);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1632:1: rule__SPViewpoint__Group__1__Impl : ( ( rule__SPViewpoint__NameAssignment_1 ) ) ;
    public final void rule__SPViewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1636:1: ( ( ( rule__SPViewpoint__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1637:1: ( ( rule__SPViewpoint__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1637:1: ( ( rule__SPViewpoint__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1638:1: ( rule__SPViewpoint__NameAssignment_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1639:1: ( rule__SPViewpoint__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1639:2: rule__SPViewpoint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__NameAssignment_1_in_rule__SPViewpoint__Group__1__Impl3531);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1649:1: rule__SPViewpoint__Group__2 : rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3 ;
    public final void rule__SPViewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1653:1: ( rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1654:2: rule__SPViewpoint__Group__2__Impl rule__SPViewpoint__Group__3
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__2__Impl_in_rule__SPViewpoint__Group__23561);
            rule__SPViewpoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__3_in_rule__SPViewpoint__Group__23564);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1661:1: rule__SPViewpoint__Group__2__Impl : ( '{' ) ;
    public final void rule__SPViewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1665:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1666:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1666:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1667:1: '{'
            {
             before(grammarAccess.getSPViewpointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPViewpoint__Group__2__Impl3592); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1680:1: rule__SPViewpoint__Group__3 : rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4 ;
    public final void rule__SPViewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1684:1: ( rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1685:2: rule__SPViewpoint__Group__3__Impl rule__SPViewpoint__Group__4
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__3__Impl_in_rule__SPViewpoint__Group__33623);
            rule__SPViewpoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__4_in_rule__SPViewpoint__Group__33626);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1692:1: rule__SPViewpoint__Group__3__Impl : ( ( rule__SPViewpoint__Group_3__0 )? ) ;
    public final void rule__SPViewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1696:1: ( ( ( rule__SPViewpoint__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1697:1: ( ( rule__SPViewpoint__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1697:1: ( ( rule__SPViewpoint__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1698:1: ( rule__SPViewpoint__Group_3__0 )?
            {
             before(grammarAccess.getSPViewpointAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1699:1: ( rule__SPViewpoint__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1699:2: rule__SPViewpoint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPViewpoint__Group_3__0_in_rule__SPViewpoint__Group__3__Impl3653);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1709:1: rule__SPViewpoint__Group__4 : rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5 ;
    public final void rule__SPViewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1713:1: ( rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1714:2: rule__SPViewpoint__Group__4__Impl rule__SPViewpoint__Group__5
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__4__Impl_in_rule__SPViewpoint__Group__43684);
            rule__SPViewpoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__5_in_rule__SPViewpoint__Group__43687);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1721:1: rule__SPViewpoint__Group__4__Impl : ( ( rule__SPViewpoint__Group_4__0 )? ) ;
    public final void rule__SPViewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1725:1: ( ( ( rule__SPViewpoint__Group_4__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1726:1: ( ( rule__SPViewpoint__Group_4__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1726:1: ( ( rule__SPViewpoint__Group_4__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1727:1: ( rule__SPViewpoint__Group_4__0 )?
            {
             before(grammarAccess.getSPViewpointAccess().getGroup_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1728:1: ( rule__SPViewpoint__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1728:2: rule__SPViewpoint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SPViewpoint__Group_4__0_in_rule__SPViewpoint__Group__4__Impl3714);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1738:1: rule__SPViewpoint__Group__5 : rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6 ;
    public final void rule__SPViewpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1742:1: ( rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1743:2: rule__SPViewpoint__Group__5__Impl rule__SPViewpoint__Group__6
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__5__Impl_in_rule__SPViewpoint__Group__53745);
            rule__SPViewpoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__6_in_rule__SPViewpoint__Group__53748);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1750:1: rule__SPViewpoint__Group__5__Impl : ( ( rule__SPViewpoint__ServiceClassAssignment_5 )* ) ;
    public final void rule__SPViewpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1754:1: ( ( ( rule__SPViewpoint__ServiceClassAssignment_5 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1755:1: ( ( rule__SPViewpoint__ServiceClassAssignment_5 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1755:1: ( ( rule__SPViewpoint__ServiceClassAssignment_5 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1756:1: ( rule__SPViewpoint__ServiceClassAssignment_5 )*
            {
             before(grammarAccess.getSPViewpointAccess().getServiceClassAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1757:1: ( rule__SPViewpoint__ServiceClassAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==73) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1757:2: rule__SPViewpoint__ServiceClassAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SPViewpoint__ServiceClassAssignment_5_in_rule__SPViewpoint__Group__5__Impl3775);
            	    rule__SPViewpoint__ServiceClassAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSPViewpointAccess().getServiceClassAssignment_5()); 

            }


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1767:1: rule__SPViewpoint__Group__6 : rule__SPViewpoint__Group__6__Impl rule__SPViewpoint__Group__7 ;
    public final void rule__SPViewpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1771:1: ( rule__SPViewpoint__Group__6__Impl rule__SPViewpoint__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1772:2: rule__SPViewpoint__Group__6__Impl rule__SPViewpoint__Group__7
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__6__Impl_in_rule__SPViewpoint__Group__63806);
            rule__SPViewpoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group__7_in_rule__SPViewpoint__Group__63809);
            rule__SPViewpoint__Group__7();

            state._fsp--;


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1779:1: rule__SPViewpoint__Group__6__Impl : ( ( rule__SPViewpoint__RepresentationsAssignment_6 )* ) ;
    public final void rule__SPViewpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1783:1: ( ( ( rule__SPViewpoint__RepresentationsAssignment_6 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1784:1: ( ( rule__SPViewpoint__RepresentationsAssignment_6 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1784:1: ( ( rule__SPViewpoint__RepresentationsAssignment_6 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1785:1: ( rule__SPViewpoint__RepresentationsAssignment_6 )*
            {
             before(grammarAccess.getSPViewpointAccess().getRepresentationsAssignment_6()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1786:1: ( rule__SPViewpoint__RepresentationsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==47||LA14_0==56) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1786:2: rule__SPViewpoint__RepresentationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__SPViewpoint__RepresentationsAssignment_6_in_rule__SPViewpoint__Group__6__Impl3836);
            	    rule__SPViewpoint__RepresentationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSPViewpointAccess().getRepresentationsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__SPViewpoint__Group__7"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1796:1: rule__SPViewpoint__Group__7 : rule__SPViewpoint__Group__7__Impl ;
    public final void rule__SPViewpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1800:1: ( rule__SPViewpoint__Group__7__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1801:2: rule__SPViewpoint__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group__7__Impl_in_rule__SPViewpoint__Group__73867);
            rule__SPViewpoint__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__7"


    // $ANTLR start "rule__SPViewpoint__Group__7__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1807:1: rule__SPViewpoint__Group__7__Impl : ( '}' ) ;
    public final void rule__SPViewpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1811:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1812:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1812:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1813:1: '}'
            {
             before(grammarAccess.getSPViewpointAccess().getRightCurlyBracketKeyword_7()); 
            match(input,42,FOLLOW_42_in_rule__SPViewpoint__Group__7__Impl3895); 
             after(grammarAccess.getSPViewpointAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__Group__7__Impl"


    // $ANTLR start "rule__SPViewpoint__Group_3__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1842:1: rule__SPViewpoint__Group_3__0 : rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1 ;
    public final void rule__SPViewpoint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1846:1: ( rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1847:2: rule__SPViewpoint__Group_3__0__Impl rule__SPViewpoint__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__0__Impl_in_rule__SPViewpoint__Group_3__03942);
            rule__SPViewpoint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__1_in_rule__SPViewpoint__Group_3__03945);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1854:1: rule__SPViewpoint__Group_3__0__Impl : ( 'shortcut' ) ;
    public final void rule__SPViewpoint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1858:1: ( ( 'shortcut' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1859:1: ( 'shortcut' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1859:1: ( 'shortcut' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1860:1: 'shortcut'
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutKeyword_3_0()); 
            match(input,45,FOLLOW_45_in_rule__SPViewpoint__Group_3__0__Impl3973); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1873:1: rule__SPViewpoint__Group_3__1 : rule__SPViewpoint__Group_3__1__Impl ;
    public final void rule__SPViewpoint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1877:1: ( rule__SPViewpoint__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1878:2: rule__SPViewpoint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_3__1__Impl_in_rule__SPViewpoint__Group_3__14004);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1884:1: rule__SPViewpoint__Group_3__1__Impl : ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) ) ;
    public final void rule__SPViewpoint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1888:1: ( ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1889:1: ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1889:1: ( ( rule__SPViewpoint__ShortcutAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1890:1: ( rule__SPViewpoint__ShortcutAssignment_3_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1891:1: ( rule__SPViewpoint__ShortcutAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1891:2: rule__SPViewpoint__ShortcutAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__ShortcutAssignment_3_1_in_rule__SPViewpoint__Group_3__1__Impl4031);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1905:1: rule__SPViewpoint__Group_4__0 : rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1 ;
    public final void rule__SPViewpoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1909:1: ( rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1910:2: rule__SPViewpoint__Group_4__0__Impl rule__SPViewpoint__Group_4__1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__0__Impl_in_rule__SPViewpoint__Group_4__04065);
            rule__SPViewpoint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__1_in_rule__SPViewpoint__Group_4__04068);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1917:1: rule__SPViewpoint__Group_4__0__Impl : ( 'ext' ) ;
    public final void rule__SPViewpoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1921:1: ( ( 'ext' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1922:1: ( 'ext' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1922:1: ( 'ext' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1923:1: 'ext'
            {
             before(grammarAccess.getSPViewpointAccess().getExtKeyword_4_0()); 
            match(input,46,FOLLOW_46_in_rule__SPViewpoint__Group_4__0__Impl4096); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1936:1: rule__SPViewpoint__Group_4__1 : rule__SPViewpoint__Group_4__1__Impl ;
    public final void rule__SPViewpoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1940:1: ( rule__SPViewpoint__Group_4__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1941:2: rule__SPViewpoint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SPViewpoint__Group_4__1__Impl_in_rule__SPViewpoint__Group_4__14127);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1947:1: rule__SPViewpoint__Group_4__1__Impl : ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) ) ;
    public final void rule__SPViewpoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1951:1: ( ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1952:1: ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1952:1: ( ( rule__SPViewpoint__ExtensionAssignment_4_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1953:1: ( rule__SPViewpoint__ExtensionAssignment_4_1 )
            {
             before(grammarAccess.getSPViewpointAccess().getExtensionAssignment_4_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1954:1: ( rule__SPViewpoint__ExtensionAssignment_4_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1954:2: rule__SPViewpoint__ExtensionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SPViewpoint__ExtensionAssignment_4_1_in_rule__SPViewpoint__Group_4__1__Impl4154);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1968:1: rule__SPTable__Group__0 : rule__SPTable__Group__0__Impl rule__SPTable__Group__1 ;
    public final void rule__SPTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1972:1: ( rule__SPTable__Group__0__Impl rule__SPTable__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1973:2: rule__SPTable__Group__0__Impl rule__SPTable__Group__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group__0__Impl_in_rule__SPTable__Group__04188);
            rule__SPTable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__1_in_rule__SPTable__Group__04191);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1980:1: rule__SPTable__Group__0__Impl : ( 'table' ) ;
    public final void rule__SPTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1984:1: ( ( 'table' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1985:1: ( 'table' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1985:1: ( 'table' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1986:1: 'table'
            {
             before(grammarAccess.getSPTableAccess().getTableKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__SPTable__Group__0__Impl4219); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:1999:1: rule__SPTable__Group__1 : rule__SPTable__Group__1__Impl rule__SPTable__Group__2 ;
    public final void rule__SPTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2003:1: ( rule__SPTable__Group__1__Impl rule__SPTable__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2004:2: rule__SPTable__Group__1__Impl rule__SPTable__Group__2
            {
            pushFollow(FOLLOW_rule__SPTable__Group__1__Impl_in_rule__SPTable__Group__14250);
            rule__SPTable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__2_in_rule__SPTable__Group__14253);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2011:1: rule__SPTable__Group__1__Impl : ( ( rule__SPTable__NameAssignment_1 ) ) ;
    public final void rule__SPTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2015:1: ( ( ( rule__SPTable__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2016:1: ( ( rule__SPTable__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2016:1: ( ( rule__SPTable__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2017:1: ( rule__SPTable__NameAssignment_1 )
            {
             before(grammarAccess.getSPTableAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2018:1: ( rule__SPTable__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2018:2: rule__SPTable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPTable__NameAssignment_1_in_rule__SPTable__Group__1__Impl4280);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2028:1: rule__SPTable__Group__2 : rule__SPTable__Group__2__Impl rule__SPTable__Group__3 ;
    public final void rule__SPTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2032:1: ( rule__SPTable__Group__2__Impl rule__SPTable__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2033:2: rule__SPTable__Group__2__Impl rule__SPTable__Group__3
            {
            pushFollow(FOLLOW_rule__SPTable__Group__2__Impl_in_rule__SPTable__Group__24310);
            rule__SPTable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__3_in_rule__SPTable__Group__24313);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2040:1: rule__SPTable__Group__2__Impl : ( '{' ) ;
    public final void rule__SPTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2044:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2045:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2045:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2046:1: '{'
            {
             before(grammarAccess.getSPTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPTable__Group__2__Impl4341); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2059:1: rule__SPTable__Group__3 : rule__SPTable__Group__3__Impl rule__SPTable__Group__4 ;
    public final void rule__SPTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2063:1: ( rule__SPTable__Group__3__Impl rule__SPTable__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2064:2: rule__SPTable__Group__3__Impl rule__SPTable__Group__4
            {
            pushFollow(FOLLOW_rule__SPTable__Group__3__Impl_in_rule__SPTable__Group__34372);
            rule__SPTable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__4_in_rule__SPTable__Group__34375);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2071:1: rule__SPTable__Group__3__Impl : ( ( rule__SPTable__Group_3__0 )? ) ;
    public final void rule__SPTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2075:1: ( ( ( rule__SPTable__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2076:1: ( ( rule__SPTable__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2076:1: ( ( rule__SPTable__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2077:1: ( rule__SPTable__Group_3__0 )?
            {
             before(grammarAccess.getSPTableAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2078:1: ( rule__SPTable__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2078:2: rule__SPTable__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPTable__Group_3__0_in_rule__SPTable__Group__3__Impl4402);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2088:1: rule__SPTable__Group__4 : rule__SPTable__Group__4__Impl rule__SPTable__Group__5 ;
    public final void rule__SPTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2092:1: ( rule__SPTable__Group__4__Impl rule__SPTable__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2093:2: rule__SPTable__Group__4__Impl rule__SPTable__Group__5
            {
            pushFollow(FOLLOW_rule__SPTable__Group__4__Impl_in_rule__SPTable__Group__44433);
            rule__SPTable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__5_in_rule__SPTable__Group__44436);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2100:1: rule__SPTable__Group__4__Impl : ( ( rule__SPTable__Group_4__0 )? ) ;
    public final void rule__SPTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2104:1: ( ( ( rule__SPTable__Group_4__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2105:1: ( ( rule__SPTable__Group_4__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2105:1: ( ( rule__SPTable__Group_4__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2106:1: ( rule__SPTable__Group_4__0 )?
            {
             before(grammarAccess.getSPTableAccess().getGroup_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2107:1: ( rule__SPTable__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==50) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2107:2: rule__SPTable__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SPTable__Group_4__0_in_rule__SPTable__Group__4__Impl4463);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2117:1: rule__SPTable__Group__5 : rule__SPTable__Group__5__Impl rule__SPTable__Group__6 ;
    public final void rule__SPTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2121:1: ( rule__SPTable__Group__5__Impl rule__SPTable__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2122:2: rule__SPTable__Group__5__Impl rule__SPTable__Group__6
            {
            pushFollow(FOLLOW_rule__SPTable__Group__5__Impl_in_rule__SPTable__Group__54494);
            rule__SPTable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__6_in_rule__SPTable__Group__54497);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2129:1: rule__SPTable__Group__5__Impl : ( ( ( rule__SPTable__UsagesAssignment_5 ) ) ( ( rule__SPTable__UsagesAssignment_5 )* ) ) ;
    public final void rule__SPTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2133:1: ( ( ( ( rule__SPTable__UsagesAssignment_5 ) ) ( ( rule__SPTable__UsagesAssignment_5 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2134:1: ( ( ( rule__SPTable__UsagesAssignment_5 ) ) ( ( rule__SPTable__UsagesAssignment_5 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2134:1: ( ( ( rule__SPTable__UsagesAssignment_5 ) ) ( ( rule__SPTable__UsagesAssignment_5 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2135:1: ( ( rule__SPTable__UsagesAssignment_5 ) ) ( ( rule__SPTable__UsagesAssignment_5 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2135:1: ( ( rule__SPTable__UsagesAssignment_5 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2136:1: ( rule__SPTable__UsagesAssignment_5 )
            {
             before(grammarAccess.getSPTableAccess().getUsagesAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2137:1: ( rule__SPTable__UsagesAssignment_5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2137:2: rule__SPTable__UsagesAssignment_5
            {
            pushFollow(FOLLOW_rule__SPTable__UsagesAssignment_5_in_rule__SPTable__Group__5__Impl4526);
            rule__SPTable__UsagesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getUsagesAssignment_5()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2140:1: ( ( rule__SPTable__UsagesAssignment_5 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2141:1: ( rule__SPTable__UsagesAssignment_5 )*
            {
             before(grammarAccess.getSPTableAccess().getUsagesAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2142:1: ( rule__SPTable__UsagesAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==72) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2142:2: rule__SPTable__UsagesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__UsagesAssignment_5_in_rule__SPTable__Group__5__Impl4538);
            	    rule__SPTable__UsagesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2153:1: rule__SPTable__Group__6 : rule__SPTable__Group__6__Impl rule__SPTable__Group__7 ;
    public final void rule__SPTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2157:1: ( rule__SPTable__Group__6__Impl rule__SPTable__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2158:2: rule__SPTable__Group__6__Impl rule__SPTable__Group__7
            {
            pushFollow(FOLLOW_rule__SPTable__Group__6__Impl_in_rule__SPTable__Group__64571);
            rule__SPTable__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__7_in_rule__SPTable__Group__64574);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2165:1: rule__SPTable__Group__6__Impl : ( 'root' ) ;
    public final void rule__SPTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2169:1: ( ( 'root' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2170:1: ( 'root' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2170:1: ( 'root' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2171:1: 'root'
            {
             before(grammarAccess.getSPTableAccess().getRootKeyword_6()); 
            match(input,48,FOLLOW_48_in_rule__SPTable__Group__6__Impl4602); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2184:1: rule__SPTable__Group__7 : rule__SPTable__Group__7__Impl rule__SPTable__Group__8 ;
    public final void rule__SPTable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2188:1: ( rule__SPTable__Group__7__Impl rule__SPTable__Group__8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2189:2: rule__SPTable__Group__7__Impl rule__SPTable__Group__8
            {
            pushFollow(FOLLOW_rule__SPTable__Group__7__Impl_in_rule__SPTable__Group__74633);
            rule__SPTable__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__8_in_rule__SPTable__Group__74636);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2196:1: rule__SPTable__Group__7__Impl : ( ( rule__SPTable__RootAssignment_7 ) ) ;
    public final void rule__SPTable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2200:1: ( ( ( rule__SPTable__RootAssignment_7 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2201:1: ( ( rule__SPTable__RootAssignment_7 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2201:1: ( ( rule__SPTable__RootAssignment_7 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2202:1: ( rule__SPTable__RootAssignment_7 )
            {
             before(grammarAccess.getSPTableAccess().getRootAssignment_7()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2203:1: ( rule__SPTable__RootAssignment_7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2203:2: rule__SPTable__RootAssignment_7
            {
            pushFollow(FOLLOW_rule__SPTable__RootAssignment_7_in_rule__SPTable__Group__7__Impl4663);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2213:1: rule__SPTable__Group__8 : rule__SPTable__Group__8__Impl rule__SPTable__Group__9 ;
    public final void rule__SPTable__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2217:1: ( rule__SPTable__Group__8__Impl rule__SPTable__Group__9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2218:2: rule__SPTable__Group__8__Impl rule__SPTable__Group__9
            {
            pushFollow(FOLLOW_rule__SPTable__Group__8__Impl_in_rule__SPTable__Group__84693);
            rule__SPTable__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__9_in_rule__SPTable__Group__84696);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2225:1: rule__SPTable__Group__8__Impl : ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) ) ;
    public final void rule__SPTable__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2229:1: ( ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2230:1: ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2230:1: ( ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2231:1: ( ( rule__SPTable__ElementsAssignment_8 ) ) ( ( rule__SPTable__ElementsAssignment_8 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2231:1: ( ( rule__SPTable__ElementsAssignment_8 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2232:1: ( rule__SPTable__ElementsAssignment_8 )
            {
             before(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2233:1: ( rule__SPTable__ElementsAssignment_8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2233:2: rule__SPTable__ElementsAssignment_8
            {
            pushFollow(FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4725);
            rule__SPTable__ElementsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2236:1: ( ( rule__SPTable__ElementsAssignment_8 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2237:1: ( rule__SPTable__ElementsAssignment_8 )*
            {
             before(grammarAccess.getSPTableAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2238:1: ( rule__SPTable__ElementsAssignment_8 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==51||LA18_0==75) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2238:2: rule__SPTable__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4737);
            	    rule__SPTable__ElementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2249:1: rule__SPTable__Group__9 : rule__SPTable__Group__9__Impl rule__SPTable__Group__10 ;
    public final void rule__SPTable__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2253:1: ( rule__SPTable__Group__9__Impl rule__SPTable__Group__10 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2254:2: rule__SPTable__Group__9__Impl rule__SPTable__Group__10
            {
            pushFollow(FOLLOW_rule__SPTable__Group__9__Impl_in_rule__SPTable__Group__94770);
            rule__SPTable__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group__10_in_rule__SPTable__Group__94773);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2261:1: rule__SPTable__Group__9__Impl : ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) ) ;
    public final void rule__SPTable__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2265:1: ( ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2266:1: ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2266:1: ( ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2267:1: ( ( rule__SPTable__PropertiesAssignment_9 ) ) ( ( rule__SPTable__PropertiesAssignment_9 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2267:1: ( ( rule__SPTable__PropertiesAssignment_9 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2268:1: ( rule__SPTable__PropertiesAssignment_9 )
            {
             before(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2269:1: ( rule__SPTable__PropertiesAssignment_9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2269:2: rule__SPTable__PropertiesAssignment_9
            {
            pushFollow(FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4802);
            rule__SPTable__PropertiesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2272:1: ( ( rule__SPTable__PropertiesAssignment_9 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2273:1: ( rule__SPTable__PropertiesAssignment_9 )*
            {
             before(grammarAccess.getSPTableAccess().getPropertiesAssignment_9()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2274:1: ( rule__SPTable__PropertiesAssignment_9 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==54) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2274:2: rule__SPTable__PropertiesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4814);
            	    rule__SPTable__PropertiesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2285:1: rule__SPTable__Group__10 : rule__SPTable__Group__10__Impl ;
    public final void rule__SPTable__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2289:1: ( rule__SPTable__Group__10__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2290:2: rule__SPTable__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group__10__Impl_in_rule__SPTable__Group__104847);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2296:1: rule__SPTable__Group__10__Impl : ( '}' ) ;
    public final void rule__SPTable__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2300:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2301:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2301:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2302:1: '}'
            {
             before(grammarAccess.getSPTableAccess().getRightCurlyBracketKeyword_10()); 
            match(input,42,FOLLOW_42_in_rule__SPTable__Group__10__Impl4875); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2337:1: rule__SPTable__Group_3__0 : rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1 ;
    public final void rule__SPTable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2341:1: ( rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2342:2: rule__SPTable__Group_3__0__Impl rule__SPTable__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group_3__0__Impl_in_rule__SPTable__Group_3__04928);
            rule__SPTable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group_3__1_in_rule__SPTable__Group_3__04931);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2349:1: rule__SPTable__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__SPTable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2353:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2354:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2354:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2355:1: 'label'
            {
             before(grammarAccess.getSPTableAccess().getLabelKeyword_3_0()); 
            match(input,49,FOLLOW_49_in_rule__SPTable__Group_3__0__Impl4959); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2368:1: rule__SPTable__Group_3__1 : rule__SPTable__Group_3__1__Impl ;
    public final void rule__SPTable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2372:1: ( rule__SPTable__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2373:2: rule__SPTable__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group_3__1__Impl_in_rule__SPTable__Group_3__14990);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2379:1: rule__SPTable__Group_3__1__Impl : ( ( rule__SPTable__LabelAssignment_3_1 ) ) ;
    public final void rule__SPTable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2383:1: ( ( ( rule__SPTable__LabelAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2384:1: ( ( rule__SPTable__LabelAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2384:1: ( ( rule__SPTable__LabelAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2385:1: ( rule__SPTable__LabelAssignment_3_1 )
            {
             before(grammarAccess.getSPTableAccess().getLabelAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2386:1: ( rule__SPTable__LabelAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2386:2: rule__SPTable__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPTable__LabelAssignment_3_1_in_rule__SPTable__Group_3__1__Impl5017);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2400:1: rule__SPTable__Group_4__0 : rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1 ;
    public final void rule__SPTable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2404:1: ( rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2405:2: rule__SPTable__Group_4__0__Impl rule__SPTable__Group_4__1
            {
            pushFollow(FOLLOW_rule__SPTable__Group_4__0__Impl_in_rule__SPTable__Group_4__05051);
            rule__SPTable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPTable__Group_4__1_in_rule__SPTable__Group_4__05054);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2412:1: rule__SPTable__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__SPTable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2416:1: ( ( 'title' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2417:1: ( 'title' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2417:1: ( 'title' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2418:1: 'title'
            {
             before(grammarAccess.getSPTableAccess().getTitleKeyword_4_0()); 
            match(input,50,FOLLOW_50_in_rule__SPTable__Group_4__0__Impl5082); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2431:1: rule__SPTable__Group_4__1 : rule__SPTable__Group_4__1__Impl ;
    public final void rule__SPTable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2435:1: ( rule__SPTable__Group_4__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2436:2: rule__SPTable__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SPTable__Group_4__1__Impl_in_rule__SPTable__Group_4__15113);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2442:1: rule__SPTable__Group_4__1__Impl : ( ( rule__SPTable__TitleAssignment_4_1 ) ) ;
    public final void rule__SPTable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2446:1: ( ( ( rule__SPTable__TitleAssignment_4_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2447:1: ( ( rule__SPTable__TitleAssignment_4_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2447:1: ( ( rule__SPTable__TitleAssignment_4_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2448:1: ( rule__SPTable__TitleAssignment_4_1 )
            {
             before(grammarAccess.getSPTableAccess().getTitleAssignment_4_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2449:1: ( rule__SPTable__TitleAssignment_4_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2449:2: rule__SPTable__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SPTable__TitleAssignment_4_1_in_rule__SPTable__Group_4__1__Impl5140);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2463:1: rule__TableElement__Group__0 : rule__TableElement__Group__0__Impl rule__TableElement__Group__1 ;
    public final void rule__TableElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2467:1: ( rule__TableElement__Group__0__Impl rule__TableElement__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2468:2: rule__TableElement__Group__0__Impl rule__TableElement__Group__1
            {
            pushFollow(FOLLOW_rule__TableElement__Group__0__Impl_in_rule__TableElement__Group__05174);
            rule__TableElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__1_in_rule__TableElement__Group__05177);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2475:1: rule__TableElement__Group__0__Impl : ( ( rule__TableElement__RecursiveAssignment_0 )? ) ;
    public final void rule__TableElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2479:1: ( ( ( rule__TableElement__RecursiveAssignment_0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2480:1: ( ( rule__TableElement__RecursiveAssignment_0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2480:1: ( ( rule__TableElement__RecursiveAssignment_0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2481:1: ( rule__TableElement__RecursiveAssignment_0 )?
            {
             before(grammarAccess.getTableElementAccess().getRecursiveAssignment_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2482:1: ( rule__TableElement__RecursiveAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==75) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2482:2: rule__TableElement__RecursiveAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TableElement__RecursiveAssignment_0_in_rule__TableElement__Group__0__Impl5204);
                    rule__TableElement__RecursiveAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableElementAccess().getRecursiveAssignment_0()); 

            }


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2492:1: rule__TableElement__Group__1 : rule__TableElement__Group__1__Impl rule__TableElement__Group__2 ;
    public final void rule__TableElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2496:1: ( rule__TableElement__Group__1__Impl rule__TableElement__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2497:2: rule__TableElement__Group__1__Impl rule__TableElement__Group__2
            {
            pushFollow(FOLLOW_rule__TableElement__Group__1__Impl_in_rule__TableElement__Group__15235);
            rule__TableElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__2_in_rule__TableElement__Group__15238);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2504:1: rule__TableElement__Group__1__Impl : ( 'element' ) ;
    public final void rule__TableElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2508:1: ( ( 'element' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2509:1: ( 'element' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2509:1: ( 'element' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2510:1: 'element'
            {
             before(grammarAccess.getTableElementAccess().getElementKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__TableElement__Group__1__Impl5266); 
             after(grammarAccess.getTableElementAccess().getElementKeyword_1()); 

            }


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2523:1: rule__TableElement__Group__2 : rule__TableElement__Group__2__Impl rule__TableElement__Group__3 ;
    public final void rule__TableElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2527:1: ( rule__TableElement__Group__2__Impl rule__TableElement__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2528:2: rule__TableElement__Group__2__Impl rule__TableElement__Group__3
            {
            pushFollow(FOLLOW_rule__TableElement__Group__2__Impl_in_rule__TableElement__Group__25297);
            rule__TableElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__3_in_rule__TableElement__Group__25300);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2535:1: rule__TableElement__Group__2__Impl : ( ( rule__TableElement__EClassAssignment_2 ) ) ;
    public final void rule__TableElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2539:1: ( ( ( rule__TableElement__EClassAssignment_2 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2540:1: ( ( rule__TableElement__EClassAssignment_2 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2540:1: ( ( rule__TableElement__EClassAssignment_2 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2541:1: ( rule__TableElement__EClassAssignment_2 )
            {
             before(grammarAccess.getTableElementAccess().getEClassAssignment_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2542:1: ( rule__TableElement__EClassAssignment_2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2542:2: rule__TableElement__EClassAssignment_2
            {
            pushFollow(FOLLOW_rule__TableElement__EClassAssignment_2_in_rule__TableElement__Group__2__Impl5327);
            rule__TableElement__EClassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getEClassAssignment_2()); 

            }


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2552:1: rule__TableElement__Group__3 : rule__TableElement__Group__3__Impl rule__TableElement__Group__4 ;
    public final void rule__TableElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2556:1: ( rule__TableElement__Group__3__Impl rule__TableElement__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2557:2: rule__TableElement__Group__3__Impl rule__TableElement__Group__4
            {
            pushFollow(FOLLOW_rule__TableElement__Group__3__Impl_in_rule__TableElement__Group__35357);
            rule__TableElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__4_in_rule__TableElement__Group__35360);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2564:1: rule__TableElement__Group__3__Impl : ( 'accessibleThrough' ) ;
    public final void rule__TableElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2568:1: ( ( 'accessibleThrough' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2569:1: ( 'accessibleThrough' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2569:1: ( 'accessibleThrough' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2570:1: 'accessibleThrough'
            {
             before(grammarAccess.getTableElementAccess().getAccessibleThroughKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__TableElement__Group__3__Impl5388); 
             after(grammarAccess.getTableElementAccess().getAccessibleThroughKeyword_3()); 

            }


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2583:1: rule__TableElement__Group__4 : rule__TableElement__Group__4__Impl rule__TableElement__Group__5 ;
    public final void rule__TableElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2587:1: ( rule__TableElement__Group__4__Impl rule__TableElement__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2588:2: rule__TableElement__Group__4__Impl rule__TableElement__Group__5
            {
            pushFollow(FOLLOW_rule__TableElement__Group__4__Impl_in_rule__TableElement__Group__45419);
            rule__TableElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__5_in_rule__TableElement__Group__45422);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2595:1: rule__TableElement__Group__4__Impl : ( ( rule__TableElement__ExpressionAssignment_4 ) ) ;
    public final void rule__TableElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2599:1: ( ( ( rule__TableElement__ExpressionAssignment_4 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2600:1: ( ( rule__TableElement__ExpressionAssignment_4 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2600:1: ( ( rule__TableElement__ExpressionAssignment_4 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2601:1: ( rule__TableElement__ExpressionAssignment_4 )
            {
             before(grammarAccess.getTableElementAccess().getExpressionAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2602:1: ( rule__TableElement__ExpressionAssignment_4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2602:2: rule__TableElement__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_rule__TableElement__ExpressionAssignment_4_in_rule__TableElement__Group__4__Impl5449);
            rule__TableElement__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getExpressionAssignment_4()); 

            }


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2612:1: rule__TableElement__Group__5 : rule__TableElement__Group__5__Impl rule__TableElement__Group__6 ;
    public final void rule__TableElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2616:1: ( rule__TableElement__Group__5__Impl rule__TableElement__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2617:2: rule__TableElement__Group__5__Impl rule__TableElement__Group__6
            {
            pushFollow(FOLLOW_rule__TableElement__Group__5__Impl_in_rule__TableElement__Group__55479);
            rule__TableElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group__6_in_rule__TableElement__Group__55482);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2624:1: rule__TableElement__Group__5__Impl : ( ( rule__TableElement__Group_5__0 )? ) ;
    public final void rule__TableElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2628:1: ( ( ( rule__TableElement__Group_5__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2629:1: ( ( rule__TableElement__Group_5__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2629:1: ( ( rule__TableElement__Group_5__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2630:1: ( rule__TableElement__Group_5__0 )?
            {
             before(grammarAccess.getTableElementAccess().getGroup_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2631:1: ( rule__TableElement__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==76) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2631:2: rule__TableElement__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__TableElement__Group_5__0_in_rule__TableElement__Group__5__Impl5509);
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


    // $ANTLR start "rule__TableElement__Group__6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2641:1: rule__TableElement__Group__6 : rule__TableElement__Group__6__Impl ;
    public final void rule__TableElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2645:1: ( rule__TableElement__Group__6__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2646:2: rule__TableElement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TableElement__Group__6__Impl_in_rule__TableElement__Group__65540);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2652:1: rule__TableElement__Group__6__Impl : ( ( rule__TableElement__Group_6__0 )? ) ;
    public final void rule__TableElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2656:1: ( ( ( rule__TableElement__Group_6__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2657:1: ( ( rule__TableElement__Group_6__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2657:1: ( ( rule__TableElement__Group_6__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2658:1: ( rule__TableElement__Group_6__0 )?
            {
             before(grammarAccess.getTableElementAccess().getGroup_6()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2659:1: ( rule__TableElement__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2659:2: rule__TableElement__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__TableElement__Group_6__0_in_rule__TableElement__Group__6__Impl5567);
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


    // $ANTLR start "rule__TableElement__Group_5__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2683:1: rule__TableElement__Group_5__0 : rule__TableElement__Group_5__0__Impl rule__TableElement__Group_5__1 ;
    public final void rule__TableElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2687:1: ( rule__TableElement__Group_5__0__Impl rule__TableElement__Group_5__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2688:2: rule__TableElement__Group_5__0__Impl rule__TableElement__Group_5__1
            {
            pushFollow(FOLLOW_rule__TableElement__Group_5__0__Impl_in_rule__TableElement__Group_5__05612);
            rule__TableElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group_5__1_in_rule__TableElement__Group_5__05615);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2695:1: rule__TableElement__Group_5__0__Impl : ( ( rule__TableElement__CreatableAssignment_5_0 ) ) ;
    public final void rule__TableElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2699:1: ( ( ( rule__TableElement__CreatableAssignment_5_0 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2700:1: ( ( rule__TableElement__CreatableAssignment_5_0 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2700:1: ( ( rule__TableElement__CreatableAssignment_5_0 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2701:1: ( rule__TableElement__CreatableAssignment_5_0 )
            {
             before(grammarAccess.getTableElementAccess().getCreatableAssignment_5_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2702:1: ( rule__TableElement__CreatableAssignment_5_0 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2702:2: rule__TableElement__CreatableAssignment_5_0
            {
            pushFollow(FOLLOW_rule__TableElement__CreatableAssignment_5_0_in_rule__TableElement__Group_5__0__Impl5642);
            rule__TableElement__CreatableAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getCreatableAssignment_5_0()); 

            }


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2712:1: rule__TableElement__Group_5__1 : rule__TableElement__Group_5__1__Impl ;
    public final void rule__TableElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2716:1: ( rule__TableElement__Group_5__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2717:2: rule__TableElement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__TableElement__Group_5__1__Impl_in_rule__TableElement__Group_5__15672);
            rule__TableElement__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2723:1: rule__TableElement__Group_5__1__Impl : ( ( rule__TableElement__Group_5_1__0 )? ) ;
    public final void rule__TableElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2727:1: ( ( ( rule__TableElement__Group_5_1__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2728:1: ( ( rule__TableElement__Group_5_1__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2728:1: ( ( rule__TableElement__Group_5_1__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2729:1: ( rule__TableElement__Group_5_1__0 )?
            {
             before(grammarAccess.getTableElementAccess().getGroup_5_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2730:1: ( rule__TableElement__Group_5_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==53) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2730:2: rule__TableElement__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__TableElement__Group_5_1__0_in_rule__TableElement__Group_5__1__Impl5699);
                    rule__TableElement__Group_5_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableElementAccess().getGroup_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TableElement__Group_5_1__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2744:1: rule__TableElement__Group_5_1__0 : rule__TableElement__Group_5_1__0__Impl rule__TableElement__Group_5_1__1 ;
    public final void rule__TableElement__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2748:1: ( rule__TableElement__Group_5_1__0__Impl rule__TableElement__Group_5_1__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2749:2: rule__TableElement__Group_5_1__0__Impl rule__TableElement__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__TableElement__Group_5_1__0__Impl_in_rule__TableElement__Group_5_1__05734);
            rule__TableElement__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group_5_1__1_in_rule__TableElement__Group_5_1__05737);
            rule__TableElement__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group_5_1__0"


    // $ANTLR start "rule__TableElement__Group_5_1__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2756:1: rule__TableElement__Group_5_1__0__Impl : ( 'via' ) ;
    public final void rule__TableElement__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2760:1: ( ( 'via' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2761:1: ( 'via' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2761:1: ( 'via' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2762:1: 'via'
            {
             before(grammarAccess.getTableElementAccess().getViaKeyword_5_1_0()); 
            match(input,53,FOLLOW_53_in_rule__TableElement__Group_5_1__0__Impl5765); 
             after(grammarAccess.getTableElementAccess().getViaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group_5_1__0__Impl"


    // $ANTLR start "rule__TableElement__Group_5_1__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2775:1: rule__TableElement__Group_5_1__1 : rule__TableElement__Group_5_1__1__Impl ;
    public final void rule__TableElement__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2779:1: ( rule__TableElement__Group_5_1__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2780:2: rule__TableElement__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TableElement__Group_5_1__1__Impl_in_rule__TableElement__Group_5_1__15796);
            rule__TableElement__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group_5_1__1"


    // $ANTLR start "rule__TableElement__Group_5_1__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2786:1: rule__TableElement__Group_5_1__1__Impl : ( ( rule__TableElement__CreateExpressionAssignment_5_1_1 ) ) ;
    public final void rule__TableElement__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2790:1: ( ( ( rule__TableElement__CreateExpressionAssignment_5_1_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2791:1: ( ( rule__TableElement__CreateExpressionAssignment_5_1_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2791:1: ( ( rule__TableElement__CreateExpressionAssignment_5_1_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2792:1: ( rule__TableElement__CreateExpressionAssignment_5_1_1 )
            {
             before(grammarAccess.getTableElementAccess().getCreateExpressionAssignment_5_1_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2793:1: ( rule__TableElement__CreateExpressionAssignment_5_1_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2793:2: rule__TableElement__CreateExpressionAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__TableElement__CreateExpressionAssignment_5_1_1_in_rule__TableElement__Group_5_1__1__Impl5823);
            rule__TableElement__CreateExpressionAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getCreateExpressionAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__Group_5_1__1__Impl"


    // $ANTLR start "rule__TableElement__Group_6__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2807:1: rule__TableElement__Group_6__0 : rule__TableElement__Group_6__0__Impl rule__TableElement__Group_6__1 ;
    public final void rule__TableElement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2811:1: ( rule__TableElement__Group_6__0__Impl rule__TableElement__Group_6__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2812:2: rule__TableElement__Group_6__0__Impl rule__TableElement__Group_6__1
            {
            pushFollow(FOLLOW_rule__TableElement__Group_6__0__Impl_in_rule__TableElement__Group_6__05857);
            rule__TableElement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group_6__1_in_rule__TableElement__Group_6__05860);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2819:1: rule__TableElement__Group_6__0__Impl : ( '{' ) ;
    public final void rule__TableElement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2823:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2824:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2824:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2825:1: '{'
            {
             before(grammarAccess.getTableElementAccess().getLeftCurlyBracketKeyword_6_0()); 
            match(input,40,FOLLOW_40_in_rule__TableElement__Group_6__0__Impl5888); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2838:1: rule__TableElement__Group_6__1 : rule__TableElement__Group_6__1__Impl rule__TableElement__Group_6__2 ;
    public final void rule__TableElement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2842:1: ( rule__TableElement__Group_6__1__Impl rule__TableElement__Group_6__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2843:2: rule__TableElement__Group_6__1__Impl rule__TableElement__Group_6__2
            {
            pushFollow(FOLLOW_rule__TableElement__Group_6__1__Impl_in_rule__TableElement__Group_6__15919);
            rule__TableElement__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableElement__Group_6__2_in_rule__TableElement__Group_6__15922);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2850:1: rule__TableElement__Group_6__1__Impl : ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) ) ;
    public final void rule__TableElement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2854:1: ( ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2855:1: ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2855:1: ( ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2856:1: ( ( rule__TableElement__SubElementsAssignment_6_1 ) ) ( ( rule__TableElement__SubElementsAssignment_6_1 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2856:1: ( ( rule__TableElement__SubElementsAssignment_6_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2857:1: ( rule__TableElement__SubElementsAssignment_6_1 )
            {
             before(grammarAccess.getTableElementAccess().getSubElementsAssignment_6_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2858:1: ( rule__TableElement__SubElementsAssignment_6_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2858:2: rule__TableElement__SubElementsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5951);
            rule__TableElement__SubElementsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTableElementAccess().getSubElementsAssignment_6_1()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2861:1: ( ( rule__TableElement__SubElementsAssignment_6_1 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2862:1: ( rule__TableElement__SubElementsAssignment_6_1 )*
            {
             before(grammarAccess.getTableElementAccess().getSubElementsAssignment_6_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2863:1: ( rule__TableElement__SubElementsAssignment_6_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==51||LA24_0==75) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2863:2: rule__TableElement__SubElementsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5963);
            	    rule__TableElement__SubElementsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2874:1: rule__TableElement__Group_6__2 : rule__TableElement__Group_6__2__Impl ;
    public final void rule__TableElement__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2878:1: ( rule__TableElement__Group_6__2__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2879:2: rule__TableElement__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__TableElement__Group_6__2__Impl_in_rule__TableElement__Group_6__25996);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2885:1: rule__TableElement__Group_6__2__Impl : ( '}' ) ;
    public final void rule__TableElement__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2889:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2890:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2890:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2891:1: '}'
            {
             before(grammarAccess.getTableElementAccess().getRightCurlyBracketKeyword_6_2()); 
            match(input,42,FOLLOW_42_in_rule__TableElement__Group_6__2__Impl6024); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2910:1: rule__TableProperty__Group__0 : rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1 ;
    public final void rule__TableProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2914:1: ( rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2915:2: rule__TableProperty__Group__0__Impl rule__TableProperty__Group__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__0__Impl_in_rule__TableProperty__Group__06061);
            rule__TableProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__1_in_rule__TableProperty__Group__06064);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2922:1: rule__TableProperty__Group__0__Impl : ( 'property' ) ;
    public final void rule__TableProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2926:1: ( ( 'property' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2927:1: ( 'property' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2927:1: ( 'property' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2928:1: 'property'
            {
             before(grammarAccess.getTablePropertyAccess().getPropertyKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__TableProperty__Group__0__Impl6092); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2941:1: rule__TableProperty__Group__1 : rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2 ;
    public final void rule__TableProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2945:1: ( rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2946:2: rule__TableProperty__Group__1__Impl rule__TableProperty__Group__2
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__1__Impl_in_rule__TableProperty__Group__16123);
            rule__TableProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__2_in_rule__TableProperty__Group__16126);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2953:1: rule__TableProperty__Group__1__Impl : ( ( rule__TableProperty__FeatureAssignment_1 ) ) ;
    public final void rule__TableProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2957:1: ( ( ( rule__TableProperty__FeatureAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2958:1: ( ( rule__TableProperty__FeatureAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2958:1: ( ( rule__TableProperty__FeatureAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2959:1: ( rule__TableProperty__FeatureAssignment_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getFeatureAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2960:1: ( rule__TableProperty__FeatureAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2960:2: rule__TableProperty__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__TableProperty__FeatureAssignment_1_in_rule__TableProperty__Group__1__Impl6153);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2970:1: rule__TableProperty__Group__2 : rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3 ;
    public final void rule__TableProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2974:1: ( rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2975:2: rule__TableProperty__Group__2__Impl rule__TableProperty__Group__3
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__2__Impl_in_rule__TableProperty__Group__26183);
            rule__TableProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group__3_in_rule__TableProperty__Group__26186);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2982:1: rule__TableProperty__Group__2__Impl : ( ( rule__TableProperty__Group_2__0 )? ) ;
    public final void rule__TableProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2986:1: ( ( ( rule__TableProperty__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2987:1: ( ( rule__TableProperty__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2987:1: ( ( rule__TableProperty__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2988:1: ( rule__TableProperty__Group_2__0 )?
            {
             before(grammarAccess.getTablePropertyAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2989:1: ( rule__TableProperty__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2989:2: rule__TableProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TableProperty__Group_2__0_in_rule__TableProperty__Group__2__Impl6213);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:2999:1: rule__TableProperty__Group__3 : rule__TableProperty__Group__3__Impl ;
    public final void rule__TableProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3003:1: ( rule__TableProperty__Group__3__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3004:2: rule__TableProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group__3__Impl_in_rule__TableProperty__Group__36244);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3010:1: rule__TableProperty__Group__3__Impl : ( ( rule__TableProperty__Group_3__0 )? ) ;
    public final void rule__TableProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3014:1: ( ( ( rule__TableProperty__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3015:1: ( ( rule__TableProperty__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3015:1: ( ( rule__TableProperty__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3016:1: ( rule__TableProperty__Group_3__0 )?
            {
             before(grammarAccess.getTablePropertyAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3017:1: ( rule__TableProperty__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3017:2: rule__TableProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TableProperty__Group_3__0_in_rule__TableProperty__Group__3__Impl6271);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3035:1: rule__TableProperty__Group_2__0 : rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1 ;
    public final void rule__TableProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3039:1: ( rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3040:2: rule__TableProperty__Group_2__0__Impl rule__TableProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_2__0__Impl_in_rule__TableProperty__Group_2__06310);
            rule__TableProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group_2__1_in_rule__TableProperty__Group_2__06313);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3047:1: rule__TableProperty__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__TableProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3051:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3052:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3052:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3053:1: 'label'
            {
             before(grammarAccess.getTablePropertyAccess().getLabelKeyword_2_0()); 
            match(input,49,FOLLOW_49_in_rule__TableProperty__Group_2__0__Impl6341); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3066:1: rule__TableProperty__Group_2__1 : rule__TableProperty__Group_2__1__Impl ;
    public final void rule__TableProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3070:1: ( rule__TableProperty__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3071:2: rule__TableProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_2__1__Impl_in_rule__TableProperty__Group_2__16372);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3077:1: rule__TableProperty__Group_2__1__Impl : ( ( rule__TableProperty__LabelAssignment_2_1 ) ) ;
    public final void rule__TableProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3081:1: ( ( ( rule__TableProperty__LabelAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3082:1: ( ( rule__TableProperty__LabelAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3082:1: ( ( rule__TableProperty__LabelAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3083:1: ( rule__TableProperty__LabelAssignment_2_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getLabelAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3084:1: ( rule__TableProperty__LabelAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3084:2: rule__TableProperty__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TableProperty__LabelAssignment_2_1_in_rule__TableProperty__Group_2__1__Impl6399);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3098:1: rule__TableProperty__Group_3__0 : rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1 ;
    public final void rule__TableProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3102:1: ( rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3103:2: rule__TableProperty__Group_3__0__Impl rule__TableProperty__Group_3__1
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_3__0__Impl_in_rule__TableProperty__Group_3__06433);
            rule__TableProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableProperty__Group_3__1_in_rule__TableProperty__Group_3__06436);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3110:1: rule__TableProperty__Group_3__0__Impl : ( 'expression' ) ;
    public final void rule__TableProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3114:1: ( ( 'expression' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3115:1: ( 'expression' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3115:1: ( 'expression' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3116:1: 'expression'
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionKeyword_3_0()); 
            match(input,55,FOLLOW_55_in_rule__TableProperty__Group_3__0__Impl6464); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3129:1: rule__TableProperty__Group_3__1 : rule__TableProperty__Group_3__1__Impl ;
    public final void rule__TableProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3133:1: ( rule__TableProperty__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3134:2: rule__TableProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TableProperty__Group_3__1__Impl_in_rule__TableProperty__Group_3__16495);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3140:1: rule__TableProperty__Group_3__1__Impl : ( ( rule__TableProperty__ExpressionAssignment_3_1 ) ) ;
    public final void rule__TableProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3144:1: ( ( ( rule__TableProperty__ExpressionAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3145:1: ( ( rule__TableProperty__ExpressionAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3145:1: ( ( rule__TableProperty__ExpressionAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3146:1: ( rule__TableProperty__ExpressionAssignment_3_1 )
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3147:1: ( rule__TableProperty__ExpressionAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3147:2: rule__TableProperty__ExpressionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TableProperty__ExpressionAssignment_3_1_in_rule__TableProperty__Group_3__1__Impl6522);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3161:1: rule__SPDiagram__Group__0 : rule__SPDiagram__Group__0__Impl rule__SPDiagram__Group__1 ;
    public final void rule__SPDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3165:1: ( rule__SPDiagram__Group__0__Impl rule__SPDiagram__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3166:2: rule__SPDiagram__Group__0__Impl rule__SPDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__0__Impl_in_rule__SPDiagram__Group__06556);
            rule__SPDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__1_in_rule__SPDiagram__Group__06559);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3173:1: rule__SPDiagram__Group__0__Impl : ( 'diagram' ) ;
    public final void rule__SPDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3177:1: ( ( 'diagram' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3178:1: ( 'diagram' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3178:1: ( 'diagram' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3179:1: 'diagram'
            {
             before(grammarAccess.getSPDiagramAccess().getDiagramKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__SPDiagram__Group__0__Impl6587); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3192:1: rule__SPDiagram__Group__1 : rule__SPDiagram__Group__1__Impl rule__SPDiagram__Group__2 ;
    public final void rule__SPDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3196:1: ( rule__SPDiagram__Group__1__Impl rule__SPDiagram__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3197:2: rule__SPDiagram__Group__1__Impl rule__SPDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__1__Impl_in_rule__SPDiagram__Group__16618);
            rule__SPDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__2_in_rule__SPDiagram__Group__16621);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3204:1: rule__SPDiagram__Group__1__Impl : ( ( rule__SPDiagram__NameAssignment_1 ) ) ;
    public final void rule__SPDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3208:1: ( ( ( rule__SPDiagram__NameAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3209:1: ( ( rule__SPDiagram__NameAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3209:1: ( ( rule__SPDiagram__NameAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3210:1: ( rule__SPDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getSPDiagramAccess().getNameAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3211:1: ( rule__SPDiagram__NameAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3211:2: rule__SPDiagram__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPDiagram__NameAssignment_1_in_rule__SPDiagram__Group__1__Impl6648);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3221:1: rule__SPDiagram__Group__2 : rule__SPDiagram__Group__2__Impl rule__SPDiagram__Group__3 ;
    public final void rule__SPDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3225:1: ( rule__SPDiagram__Group__2__Impl rule__SPDiagram__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3226:2: rule__SPDiagram__Group__2__Impl rule__SPDiagram__Group__3
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__2__Impl_in_rule__SPDiagram__Group__26678);
            rule__SPDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__3_in_rule__SPDiagram__Group__26681);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3233:1: rule__SPDiagram__Group__2__Impl : ( '{' ) ;
    public final void rule__SPDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3237:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3238:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3238:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3239:1: '{'
            {
             before(grammarAccess.getSPDiagramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__SPDiagram__Group__2__Impl6709); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3252:1: rule__SPDiagram__Group__3 : rule__SPDiagram__Group__3__Impl rule__SPDiagram__Group__4 ;
    public final void rule__SPDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3256:1: ( rule__SPDiagram__Group__3__Impl rule__SPDiagram__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3257:2: rule__SPDiagram__Group__3__Impl rule__SPDiagram__Group__4
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__3__Impl_in_rule__SPDiagram__Group__36740);
            rule__SPDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__4_in_rule__SPDiagram__Group__36743);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3264:1: rule__SPDiagram__Group__3__Impl : ( ( rule__SPDiagram__Group_3__0 )? ) ;
    public final void rule__SPDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3268:1: ( ( ( rule__SPDiagram__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3269:1: ( ( rule__SPDiagram__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3269:1: ( ( rule__SPDiagram__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3270:1: ( rule__SPDiagram__Group_3__0 )?
            {
             before(grammarAccess.getSPDiagramAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3271:1: ( rule__SPDiagram__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3271:2: rule__SPDiagram__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SPDiagram__Group_3__0_in_rule__SPDiagram__Group__3__Impl6770);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3281:1: rule__SPDiagram__Group__4 : rule__SPDiagram__Group__4__Impl rule__SPDiagram__Group__5 ;
    public final void rule__SPDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3285:1: ( rule__SPDiagram__Group__4__Impl rule__SPDiagram__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3286:2: rule__SPDiagram__Group__4__Impl rule__SPDiagram__Group__5
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__4__Impl_in_rule__SPDiagram__Group__46801);
            rule__SPDiagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__5_in_rule__SPDiagram__Group__46804);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3293:1: rule__SPDiagram__Group__4__Impl : ( ( rule__SPDiagram__Group_4__0 )? ) ;
    public final void rule__SPDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3297:1: ( ( ( rule__SPDiagram__Group_4__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3298:1: ( ( rule__SPDiagram__Group_4__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3298:1: ( ( rule__SPDiagram__Group_4__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3299:1: ( rule__SPDiagram__Group_4__0 )?
            {
             before(grammarAccess.getSPDiagramAccess().getGroup_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3300:1: ( rule__SPDiagram__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3300:2: rule__SPDiagram__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SPDiagram__Group_4__0_in_rule__SPDiagram__Group__4__Impl6831);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3310:1: rule__SPDiagram__Group__5 : rule__SPDiagram__Group__5__Impl rule__SPDiagram__Group__6 ;
    public final void rule__SPDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3314:1: ( rule__SPDiagram__Group__5__Impl rule__SPDiagram__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3315:2: rule__SPDiagram__Group__5__Impl rule__SPDiagram__Group__6
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__5__Impl_in_rule__SPDiagram__Group__56862);
            rule__SPDiagram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__6_in_rule__SPDiagram__Group__56865);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3322:1: rule__SPDiagram__Group__5__Impl : ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) ) ;
    public final void rule__SPDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3326:1: ( ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3327:1: ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3327:1: ( ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3328:1: ( ( rule__SPDiagram__MetamodelsAssignment_5 ) ) ( ( rule__SPDiagram__MetamodelsAssignment_5 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3328:1: ( ( rule__SPDiagram__MetamodelsAssignment_5 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3329:1: ( rule__SPDiagram__MetamodelsAssignment_5 )
            {
             before(grammarAccess.getSPDiagramAccess().getMetamodelsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3330:1: ( rule__SPDiagram__MetamodelsAssignment_5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3330:2: rule__SPDiagram__MetamodelsAssignment_5
            {
            pushFollow(FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6894);
            rule__SPDiagram__MetamodelsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSPDiagramAccess().getMetamodelsAssignment_5()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3333:1: ( ( rule__SPDiagram__MetamodelsAssignment_5 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3334:1: ( rule__SPDiagram__MetamodelsAssignment_5 )*
            {
             before(grammarAccess.getSPDiagramAccess().getMetamodelsAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3335:1: ( rule__SPDiagram__MetamodelsAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==72) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3335:2: rule__SPDiagram__MetamodelsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6906);
            	    rule__SPDiagram__MetamodelsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3346:1: rule__SPDiagram__Group__6 : rule__SPDiagram__Group__6__Impl rule__SPDiagram__Group__7 ;
    public final void rule__SPDiagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3350:1: ( rule__SPDiagram__Group__6__Impl rule__SPDiagram__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3351:2: rule__SPDiagram__Group__6__Impl rule__SPDiagram__Group__7
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__6__Impl_in_rule__SPDiagram__Group__66939);
            rule__SPDiagram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__7_in_rule__SPDiagram__Group__66942);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3358:1: rule__SPDiagram__Group__6__Impl : ( 'root' ) ;
    public final void rule__SPDiagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3362:1: ( ( 'root' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3363:1: ( 'root' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3363:1: ( 'root' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3364:1: 'root'
            {
             before(grammarAccess.getSPDiagramAccess().getRootKeyword_6()); 
            match(input,48,FOLLOW_48_in_rule__SPDiagram__Group__6__Impl6970); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3377:1: rule__SPDiagram__Group__7 : rule__SPDiagram__Group__7__Impl rule__SPDiagram__Group__8 ;
    public final void rule__SPDiagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3381:1: ( rule__SPDiagram__Group__7__Impl rule__SPDiagram__Group__8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3382:2: rule__SPDiagram__Group__7__Impl rule__SPDiagram__Group__8
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__7__Impl_in_rule__SPDiagram__Group__77001);
            rule__SPDiagram__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__8_in_rule__SPDiagram__Group__77004);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3389:1: rule__SPDiagram__Group__7__Impl : ( ( rule__SPDiagram__RootAssignment_7 ) ) ;
    public final void rule__SPDiagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3393:1: ( ( ( rule__SPDiagram__RootAssignment_7 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3394:1: ( ( rule__SPDiagram__RootAssignment_7 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3394:1: ( ( rule__SPDiagram__RootAssignment_7 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3395:1: ( rule__SPDiagram__RootAssignment_7 )
            {
             before(grammarAccess.getSPDiagramAccess().getRootAssignment_7()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3396:1: ( rule__SPDiagram__RootAssignment_7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3396:2: rule__SPDiagram__RootAssignment_7
            {
            pushFollow(FOLLOW_rule__SPDiagram__RootAssignment_7_in_rule__SPDiagram__Group__7__Impl7031);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3406:1: rule__SPDiagram__Group__8 : rule__SPDiagram__Group__8__Impl rule__SPDiagram__Group__9 ;
    public final void rule__SPDiagram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3410:1: ( rule__SPDiagram__Group__8__Impl rule__SPDiagram__Group__9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3411:2: rule__SPDiagram__Group__8__Impl rule__SPDiagram__Group__9
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__8__Impl_in_rule__SPDiagram__Group__87061);
            rule__SPDiagram__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group__9_in_rule__SPDiagram__Group__87064);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3418:1: rule__SPDiagram__Group__8__Impl : ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) ) ;
    public final void rule__SPDiagram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3422:1: ( ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3423:1: ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3423:1: ( ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3424:1: ( ( rule__SPDiagram__ElementsAssignment_8 ) ) ( ( rule__SPDiagram__ElementsAssignment_8 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3424:1: ( ( rule__SPDiagram__ElementsAssignment_8 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3425:1: ( rule__SPDiagram__ElementsAssignment_8 )
            {
             before(grammarAccess.getSPDiagramAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3426:1: ( rule__SPDiagram__ElementsAssignment_8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3426:2: rule__SPDiagram__ElementsAssignment_8
            {
            pushFollow(FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl7093);
            rule__SPDiagram__ElementsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSPDiagramAccess().getElementsAssignment_8()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3429:1: ( ( rule__SPDiagram__ElementsAssignment_8 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3430:1: ( rule__SPDiagram__ElementsAssignment_8 )*
            {
             before(grammarAccess.getSPDiagramAccess().getElementsAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3431:1: ( rule__SPDiagram__ElementsAssignment_8 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=11 && LA30_0<=12)||LA30_0==57||LA30_0==62||(LA30_0>=75 && LA30_0<=76)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3431:2: rule__SPDiagram__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl7105);
            	    rule__SPDiagram__ElementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3442:1: rule__SPDiagram__Group__9 : rule__SPDiagram__Group__9__Impl ;
    public final void rule__SPDiagram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3446:1: ( rule__SPDiagram__Group__9__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3447:2: rule__SPDiagram__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group__9__Impl_in_rule__SPDiagram__Group__97138);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3453:1: rule__SPDiagram__Group__9__Impl : ( '}' ) ;
    public final void rule__SPDiagram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3457:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3458:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3458:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3459:1: '}'
            {
             before(grammarAccess.getSPDiagramAccess().getRightCurlyBracketKeyword_9()); 
            match(input,42,FOLLOW_42_in_rule__SPDiagram__Group__9__Impl7166); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3492:1: rule__SPDiagram__Group_3__0 : rule__SPDiagram__Group_3__0__Impl rule__SPDiagram__Group_3__1 ;
    public final void rule__SPDiagram__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3496:1: ( rule__SPDiagram__Group_3__0__Impl rule__SPDiagram__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3497:2: rule__SPDiagram__Group_3__0__Impl rule__SPDiagram__Group_3__1
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_3__0__Impl_in_rule__SPDiagram__Group_3__07217);
            rule__SPDiagram__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group_3__1_in_rule__SPDiagram__Group_3__07220);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3504:1: rule__SPDiagram__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__SPDiagram__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3508:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3509:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3509:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3510:1: 'label'
            {
             before(grammarAccess.getSPDiagramAccess().getLabelKeyword_3_0()); 
            match(input,49,FOLLOW_49_in_rule__SPDiagram__Group_3__0__Impl7248); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3523:1: rule__SPDiagram__Group_3__1 : rule__SPDiagram__Group_3__1__Impl ;
    public final void rule__SPDiagram__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3527:1: ( rule__SPDiagram__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3528:2: rule__SPDiagram__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_3__1__Impl_in_rule__SPDiagram__Group_3__17279);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3534:1: rule__SPDiagram__Group_3__1__Impl : ( ( rule__SPDiagram__LabelAssignment_3_1 ) ) ;
    public final void rule__SPDiagram__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3538:1: ( ( ( rule__SPDiagram__LabelAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3539:1: ( ( rule__SPDiagram__LabelAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3539:1: ( ( rule__SPDiagram__LabelAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3540:1: ( rule__SPDiagram__LabelAssignment_3_1 )
            {
             before(grammarAccess.getSPDiagramAccess().getLabelAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3541:1: ( rule__SPDiagram__LabelAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3541:2: rule__SPDiagram__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SPDiagram__LabelAssignment_3_1_in_rule__SPDiagram__Group_3__1__Impl7306);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3555:1: rule__SPDiagram__Group_4__0 : rule__SPDiagram__Group_4__0__Impl rule__SPDiagram__Group_4__1 ;
    public final void rule__SPDiagram__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3559:1: ( rule__SPDiagram__Group_4__0__Impl rule__SPDiagram__Group_4__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3560:2: rule__SPDiagram__Group_4__0__Impl rule__SPDiagram__Group_4__1
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_4__0__Impl_in_rule__SPDiagram__Group_4__07340);
            rule__SPDiagram__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPDiagram__Group_4__1_in_rule__SPDiagram__Group_4__07343);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3567:1: rule__SPDiagram__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__SPDiagram__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3571:1: ( ( 'title' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3572:1: ( 'title' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3572:1: ( 'title' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3573:1: 'title'
            {
             before(grammarAccess.getSPDiagramAccess().getTitleKeyword_4_0()); 
            match(input,50,FOLLOW_50_in_rule__SPDiagram__Group_4__0__Impl7371); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3586:1: rule__SPDiagram__Group_4__1 : rule__SPDiagram__Group_4__1__Impl ;
    public final void rule__SPDiagram__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3590:1: ( rule__SPDiagram__Group_4__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3591:2: rule__SPDiagram__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SPDiagram__Group_4__1__Impl_in_rule__SPDiagram__Group_4__17402);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3597:1: rule__SPDiagram__Group_4__1__Impl : ( ( rule__SPDiagram__TitleAssignment_4_1 ) ) ;
    public final void rule__SPDiagram__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3601:1: ( ( ( rule__SPDiagram__TitleAssignment_4_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3602:1: ( ( rule__SPDiagram__TitleAssignment_4_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3602:1: ( ( rule__SPDiagram__TitleAssignment_4_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3603:1: ( rule__SPDiagram__TitleAssignment_4_1 )
            {
             before(grammarAccess.getSPDiagramAccess().getTitleAssignment_4_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3604:1: ( rule__SPDiagram__TitleAssignment_4_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3604:2: rule__SPDiagram__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SPDiagram__TitleAssignment_4_1_in_rule__SPDiagram__Group_4__1__Impl7429);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3618:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3622:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3623:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__07463);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__1_in_rule__Container__Group__07466);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3630:1: rule__Container__Group__0__Impl : ( ( rule__Container__CreatableAssignment_0 )? ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3634:1: ( ( ( rule__Container__CreatableAssignment_0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3635:1: ( ( rule__Container__CreatableAssignment_0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3635:1: ( ( rule__Container__CreatableAssignment_0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3636:1: ( rule__Container__CreatableAssignment_0 )?
            {
             before(grammarAccess.getContainerAccess().getCreatableAssignment_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3637:1: ( rule__Container__CreatableAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==76) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3637:2: rule__Container__CreatableAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Container__CreatableAssignment_0_in_rule__Container__Group__0__Impl7493);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3647:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3651:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3652:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__17524);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__2_in_rule__Container__Group__17527);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3659:1: rule__Container__Group__1__Impl : ( ( rule__Container__RecursiveAssignment_1 )? ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3663:1: ( ( ( rule__Container__RecursiveAssignment_1 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3664:1: ( ( rule__Container__RecursiveAssignment_1 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3664:1: ( ( rule__Container__RecursiveAssignment_1 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3665:1: ( rule__Container__RecursiveAssignment_1 )?
            {
             before(grammarAccess.getContainerAccess().getRecursiveAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3666:1: ( rule__Container__RecursiveAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==75) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3666:2: rule__Container__RecursiveAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Container__RecursiveAssignment_1_in_rule__Container__Group__1__Impl7554);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3676:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3680:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3681:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__27585);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__3_in_rule__Container__Group__27588);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3688:1: rule__Container__Group__2__Impl : ( ( rule__Container__ContainerTypeAssignment_2 )? ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3692:1: ( ( ( rule__Container__ContainerTypeAssignment_2 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3693:1: ( ( rule__Container__ContainerTypeAssignment_2 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3693:1: ( ( rule__Container__ContainerTypeAssignment_2 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3694:1: ( rule__Container__ContainerTypeAssignment_2 )?
            {
             before(grammarAccess.getContainerAccess().getContainerTypeAssignment_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3695:1: ( rule__Container__ContainerTypeAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=11 && LA33_0<=12)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3695:2: rule__Container__ContainerTypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Container__ContainerTypeAssignment_2_in_rule__Container__Group__2__Impl7615);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3705:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3709:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3710:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__37646);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__4_in_rule__Container__Group__37649);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3717:1: rule__Container__Group__3__Impl : ( 'container' ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3721:1: ( ( 'container' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3722:1: ( 'container' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3722:1: ( 'container' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3723:1: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_3()); 
            match(input,57,FOLLOW_57_in_rule__Container__Group__3__Impl7677); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3736:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3740:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3741:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_rule__Container__Group__4__Impl_in_rule__Container__Group__47708);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__5_in_rule__Container__Group__47711);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3748:1: rule__Container__Group__4__Impl : ( ( rule__Container__NameAssignment_4 ) ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3752:1: ( ( ( rule__Container__NameAssignment_4 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3753:1: ( ( rule__Container__NameAssignment_4 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3753:1: ( ( rule__Container__NameAssignment_4 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3754:1: ( rule__Container__NameAssignment_4 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3755:1: ( rule__Container__NameAssignment_4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3755:2: rule__Container__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Container__NameAssignment_4_in_rule__Container__Group__4__Impl7738);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3765:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3769:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3770:2: rule__Container__Group__5__Impl rule__Container__Group__6
            {
            pushFollow(FOLLOW_rule__Container__Group__5__Impl_in_rule__Container__Group__57768);
            rule__Container__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__6_in_rule__Container__Group__57771);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3777:1: rule__Container__Group__5__Impl : ( 'for' ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3781:1: ( ( 'for' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3782:1: ( 'for' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3782:1: ( 'for' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3783:1: 'for'
            {
             before(grammarAccess.getContainerAccess().getForKeyword_5()); 
            match(input,58,FOLLOW_58_in_rule__Container__Group__5__Impl7799); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3796:1: rule__Container__Group__6 : rule__Container__Group__6__Impl rule__Container__Group__7 ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3800:1: ( rule__Container__Group__6__Impl rule__Container__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3801:2: rule__Container__Group__6__Impl rule__Container__Group__7
            {
            pushFollow(FOLLOW_rule__Container__Group__6__Impl_in_rule__Container__Group__67830);
            rule__Container__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__7_in_rule__Container__Group__67833);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3808:1: rule__Container__Group__6__Impl : ( ( rule__Container__EClassAssignment_6 ) ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3812:1: ( ( ( rule__Container__EClassAssignment_6 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3813:1: ( ( rule__Container__EClassAssignment_6 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3813:1: ( ( rule__Container__EClassAssignment_6 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3814:1: ( rule__Container__EClassAssignment_6 )
            {
             before(grammarAccess.getContainerAccess().getEClassAssignment_6()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3815:1: ( rule__Container__EClassAssignment_6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3815:2: rule__Container__EClassAssignment_6
            {
            pushFollow(FOLLOW_rule__Container__EClassAssignment_6_in_rule__Container__Group__6__Impl7860);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3825:1: rule__Container__Group__7 : rule__Container__Group__7__Impl rule__Container__Group__8 ;
    public final void rule__Container__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3829:1: ( rule__Container__Group__7__Impl rule__Container__Group__8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3830:2: rule__Container__Group__7__Impl rule__Container__Group__8
            {
            pushFollow(FOLLOW_rule__Container__Group__7__Impl_in_rule__Container__Group__77890);
            rule__Container__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__8_in_rule__Container__Group__77893);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3837:1: rule__Container__Group__7__Impl : ( 'accessibleThrough' ) ;
    public final void rule__Container__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3841:1: ( ( 'accessibleThrough' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3842:1: ( 'accessibleThrough' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3842:1: ( 'accessibleThrough' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3843:1: 'accessibleThrough'
            {
             before(grammarAccess.getContainerAccess().getAccessibleThroughKeyword_7()); 
            match(input,52,FOLLOW_52_in_rule__Container__Group__7__Impl7921); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3856:1: rule__Container__Group__8 : rule__Container__Group__8__Impl rule__Container__Group__9 ;
    public final void rule__Container__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3860:1: ( rule__Container__Group__8__Impl rule__Container__Group__9 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3861:2: rule__Container__Group__8__Impl rule__Container__Group__9
            {
            pushFollow(FOLLOW_rule__Container__Group__8__Impl_in_rule__Container__Group__87952);
            rule__Container__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__9_in_rule__Container__Group__87955);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3868:1: rule__Container__Group__8__Impl : ( ( rule__Container__ExpressionAssignment_8 ) ) ;
    public final void rule__Container__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3872:1: ( ( ( rule__Container__ExpressionAssignment_8 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3873:1: ( ( rule__Container__ExpressionAssignment_8 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3873:1: ( ( rule__Container__ExpressionAssignment_8 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3874:1: ( rule__Container__ExpressionAssignment_8 )
            {
             before(grammarAccess.getContainerAccess().getExpressionAssignment_8()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3875:1: ( rule__Container__ExpressionAssignment_8 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3875:2: rule__Container__ExpressionAssignment_8
            {
            pushFollow(FOLLOW_rule__Container__ExpressionAssignment_8_in_rule__Container__Group__8__Impl7982);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3885:1: rule__Container__Group__9 : rule__Container__Group__9__Impl rule__Container__Group__10 ;
    public final void rule__Container__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3889:1: ( rule__Container__Group__9__Impl rule__Container__Group__10 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3890:2: rule__Container__Group__9__Impl rule__Container__Group__10
            {
            pushFollow(FOLLOW_rule__Container__Group__9__Impl_in_rule__Container__Group__98012);
            rule__Container__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group__10_in_rule__Container__Group__98015);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3897:1: rule__Container__Group__9__Impl : ( ( rule__Container__StyleAssignment_9 )? ) ;
    public final void rule__Container__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3901:1: ( ( ( rule__Container__StyleAssignment_9 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3902:1: ( ( rule__Container__StyleAssignment_9 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3902:1: ( ( rule__Container__StyleAssignment_9 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3903:1: ( rule__Container__StyleAssignment_9 )?
            {
             before(grammarAccess.getContainerAccess().getStyleAssignment_9()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3904:1: ( rule__Container__StyleAssignment_9 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3904:2: rule__Container__StyleAssignment_9
                    {
                    pushFollow(FOLLOW_rule__Container__StyleAssignment_9_in_rule__Container__Group__9__Impl8042);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3914:1: rule__Container__Group__10 : rule__Container__Group__10__Impl ;
    public final void rule__Container__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3918:1: ( rule__Container__Group__10__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3919:2: rule__Container__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Container__Group__10__Impl_in_rule__Container__Group__108073);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3925:1: rule__Container__Group__10__Impl : ( ( rule__Container__Group_10__0 )? ) ;
    public final void rule__Container__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3929:1: ( ( ( rule__Container__Group_10__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3930:1: ( ( rule__Container__Group_10__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3930:1: ( ( rule__Container__Group_10__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3931:1: ( rule__Container__Group_10__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_10()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3932:1: ( rule__Container__Group_10__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3932:2: rule__Container__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Container__Group_10__0_in_rule__Container__Group__10__Impl8100);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3964:1: rule__Container__Group_10__0 : rule__Container__Group_10__0__Impl rule__Container__Group_10__1 ;
    public final void rule__Container__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3968:1: ( rule__Container__Group_10__0__Impl rule__Container__Group_10__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3969:2: rule__Container__Group_10__0__Impl rule__Container__Group_10__1
            {
            pushFollow(FOLLOW_rule__Container__Group_10__0__Impl_in_rule__Container__Group_10__08153);
            rule__Container__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group_10__1_in_rule__Container__Group_10__08156);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3976:1: rule__Container__Group_10__0__Impl : ( '{' ) ;
    public final void rule__Container__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3980:1: ( ( '{' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3981:1: ( '{' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3981:1: ( '{' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3982:1: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10_0()); 
            match(input,40,FOLLOW_40_in_rule__Container__Group_10__0__Impl8184); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3995:1: rule__Container__Group_10__1 : rule__Container__Group_10__1__Impl rule__Container__Group_10__2 ;
    public final void rule__Container__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:3999:1: ( rule__Container__Group_10__1__Impl rule__Container__Group_10__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4000:2: rule__Container__Group_10__1__Impl rule__Container__Group_10__2
            {
            pushFollow(FOLLOW_rule__Container__Group_10__1__Impl_in_rule__Container__Group_10__18215);
            rule__Container__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Container__Group_10__2_in_rule__Container__Group_10__18218);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4007:1: rule__Container__Group_10__1__Impl : ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) ) ;
    public final void rule__Container__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4011:1: ( ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4012:1: ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4012:1: ( ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4013:1: ( ( rule__Container__ElementsAssignment_10_1 ) ) ( ( rule__Container__ElementsAssignment_10_1 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4013:1: ( ( rule__Container__ElementsAssignment_10_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4014:1: ( rule__Container__ElementsAssignment_10_1 )
            {
             before(grammarAccess.getContainerAccess().getElementsAssignment_10_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4015:1: ( rule__Container__ElementsAssignment_10_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4015:2: rule__Container__ElementsAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl8247);
            rule__Container__ElementsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getElementsAssignment_10_1()); 

            }

            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4018:1: ( ( rule__Container__ElementsAssignment_10_1 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4019:1: ( rule__Container__ElementsAssignment_10_1 )*
            {
             before(grammarAccess.getContainerAccess().getElementsAssignment_10_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4020:1: ( rule__Container__ElementsAssignment_10_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=11 && LA36_0<=12)||LA36_0==57||LA36_0==62||(LA36_0>=75 && LA36_0<=76)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4020:2: rule__Container__ElementsAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl8259);
            	    rule__Container__ElementsAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4031:1: rule__Container__Group_10__2 : rule__Container__Group_10__2__Impl ;
    public final void rule__Container__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4035:1: ( rule__Container__Group_10__2__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4036:2: rule__Container__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Container__Group_10__2__Impl_in_rule__Container__Group_10__28292);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4042:1: rule__Container__Group_10__2__Impl : ( '}' ) ;
    public final void rule__Container__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4046:1: ( ( '}' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4047:1: ( '}' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4047:1: ( '}' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4048:1: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_10_2()); 
            match(input,42,FOLLOW_42_in_rule__Container__Group_10__2__Impl8320); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4067:1: rule__ContainerStyleDefinition__Group__0 : rule__ContainerStyleDefinition__Group__0__Impl rule__ContainerStyleDefinition__Group__1 ;
    public final void rule__ContainerStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4071:1: ( rule__ContainerStyleDefinition__Group__0__Impl rule__ContainerStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4072:2: rule__ContainerStyleDefinition__Group__0__Impl rule__ContainerStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__0__Impl_in_rule__ContainerStyleDefinition__Group__08357);
            rule__ContainerStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__1_in_rule__ContainerStyleDefinition__Group__08360);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4079:1: rule__ContainerStyleDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__ContainerStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4083:1: ( ( '[' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4084:1: ( '[' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4084:1: ( '[' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4085:1: '['
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,59,FOLLOW_59_in_rule__ContainerStyleDefinition__Group__0__Impl8388); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4098:1: rule__ContainerStyleDefinition__Group__1 : rule__ContainerStyleDefinition__Group__1__Impl rule__ContainerStyleDefinition__Group__2 ;
    public final void rule__ContainerStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4102:1: ( rule__ContainerStyleDefinition__Group__1__Impl rule__ContainerStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4103:2: rule__ContainerStyleDefinition__Group__1__Impl rule__ContainerStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__1__Impl_in_rule__ContainerStyleDefinition__Group__18419);
            rule__ContainerStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__2_in_rule__ContainerStyleDefinition__Group__18422);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4110:1: rule__ContainerStyleDefinition__Group__1__Impl : ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) ) ;
    public final void rule__ContainerStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4114:1: ( ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4115:1: ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4115:1: ( ( rule__ContainerStyleDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4116:1: ( rule__ContainerStyleDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4117:1: ( rule__ContainerStyleDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4117:2: rule__ContainerStyleDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__ColorAssignment_1_in_rule__ContainerStyleDefinition__Group__1__Impl8449);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4127:1: rule__ContainerStyleDefinition__Group__2 : rule__ContainerStyleDefinition__Group__2__Impl rule__ContainerStyleDefinition__Group__3 ;
    public final void rule__ContainerStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4131:1: ( rule__ContainerStyleDefinition__Group__2__Impl rule__ContainerStyleDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4132:2: rule__ContainerStyleDefinition__Group__2__Impl rule__ContainerStyleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__2__Impl_in_rule__ContainerStyleDefinition__Group__28479);
            rule__ContainerStyleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__3_in_rule__ContainerStyleDefinition__Group__28482);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4139:1: rule__ContainerStyleDefinition__Group__2__Impl : ( ( rule__ContainerStyleDefinition__Group_2__0 )? ) ;
    public final void rule__ContainerStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4143:1: ( ( ( rule__ContainerStyleDefinition__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4144:1: ( ( rule__ContainerStyleDefinition__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4144:1: ( ( rule__ContainerStyleDefinition__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4145:1: ( rule__ContainerStyleDefinition__Group_2__0 )?
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4146:1: ( rule__ContainerStyleDefinition__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==61) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==49) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4146:2: rule__ContainerStyleDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__0_in_rule__ContainerStyleDefinition__Group__2__Impl8509);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4156:1: rule__ContainerStyleDefinition__Group__3 : rule__ContainerStyleDefinition__Group__3__Impl rule__ContainerStyleDefinition__Group__4 ;
    public final void rule__ContainerStyleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4160:1: ( rule__ContainerStyleDefinition__Group__3__Impl rule__ContainerStyleDefinition__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4161:2: rule__ContainerStyleDefinition__Group__3__Impl rule__ContainerStyleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__3__Impl_in_rule__ContainerStyleDefinition__Group__38540);
            rule__ContainerStyleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__4_in_rule__ContainerStyleDefinition__Group__38543);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4168:1: rule__ContainerStyleDefinition__Group__3__Impl : ( ( rule__ContainerStyleDefinition__Group_3__0 )? ) ;
    public final void rule__ContainerStyleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4172:1: ( ( ( rule__ContainerStyleDefinition__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4173:1: ( ( rule__ContainerStyleDefinition__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4173:1: ( ( rule__ContainerStyleDefinition__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4174:1: ( rule__ContainerStyleDefinition__Group_3__0 )?
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4175:1: ( rule__ContainerStyleDefinition__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==61) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4175:2: rule__ContainerStyleDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__0_in_rule__ContainerStyleDefinition__Group__3__Impl8570);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4185:1: rule__ContainerStyleDefinition__Group__4 : rule__ContainerStyleDefinition__Group__4__Impl ;
    public final void rule__ContainerStyleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4189:1: ( rule__ContainerStyleDefinition__Group__4__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4190:2: rule__ContainerStyleDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group__4__Impl_in_rule__ContainerStyleDefinition__Group__48601);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4196:1: rule__ContainerStyleDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__ContainerStyleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4200:1: ( ( ']' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4201:1: ( ']' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4201:1: ( ']' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4202:1: ']'
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getRightSquareBracketKeyword_4()); 
            match(input,60,FOLLOW_60_in_rule__ContainerStyleDefinition__Group__4__Impl8629); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4225:1: rule__ContainerStyleDefinition__Group_2__0 : rule__ContainerStyleDefinition__Group_2__0__Impl rule__ContainerStyleDefinition__Group_2__1 ;
    public final void rule__ContainerStyleDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4229:1: ( rule__ContainerStyleDefinition__Group_2__0__Impl rule__ContainerStyleDefinition__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4230:2: rule__ContainerStyleDefinition__Group_2__0__Impl rule__ContainerStyleDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__0__Impl_in_rule__ContainerStyleDefinition__Group_2__08670);
            rule__ContainerStyleDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__1_in_rule__ContainerStyleDefinition__Group_2__08673);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4237:1: rule__ContainerStyleDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ContainerStyleDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4241:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4242:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4242:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4243:1: ','
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,61,FOLLOW_61_in_rule__ContainerStyleDefinition__Group_2__0__Impl8701); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4256:1: rule__ContainerStyleDefinition__Group_2__1 : rule__ContainerStyleDefinition__Group_2__1__Impl ;
    public final void rule__ContainerStyleDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4260:1: ( rule__ContainerStyleDefinition__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4261:2: rule__ContainerStyleDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_2__1__Impl_in_rule__ContainerStyleDefinition__Group_2__18732);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4267:1: rule__ContainerStyleDefinition__Group_2__1__Impl : ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) ) ;
    public final void rule__ContainerStyleDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4271:1: ( ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4272:1: ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4272:1: ( ( rule__ContainerStyleDefinition__LabelAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4273:1: ( rule__ContainerStyleDefinition__LabelAssignment_2_1 )
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getLabelAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4274:1: ( rule__ContainerStyleDefinition__LabelAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4274:2: rule__ContainerStyleDefinition__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__LabelAssignment_2_1_in_rule__ContainerStyleDefinition__Group_2__1__Impl8759);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4288:1: rule__ContainerStyleDefinition__Group_3__0 : rule__ContainerStyleDefinition__Group_3__0__Impl rule__ContainerStyleDefinition__Group_3__1 ;
    public final void rule__ContainerStyleDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4292:1: ( rule__ContainerStyleDefinition__Group_3__0__Impl rule__ContainerStyleDefinition__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4293:2: rule__ContainerStyleDefinition__Group_3__0__Impl rule__ContainerStyleDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__0__Impl_in_rule__ContainerStyleDefinition__Group_3__08793);
            rule__ContainerStyleDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__1_in_rule__ContainerStyleDefinition__Group_3__08796);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4300:1: rule__ContainerStyleDefinition__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ContainerStyleDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4304:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4305:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4305:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4306:1: ','
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getCommaKeyword_3_0()); 
            match(input,61,FOLLOW_61_in_rule__ContainerStyleDefinition__Group_3__0__Impl8824); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4319:1: rule__ContainerStyleDefinition__Group_3__1 : rule__ContainerStyleDefinition__Group_3__1__Impl ;
    public final void rule__ContainerStyleDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4323:1: ( rule__ContainerStyleDefinition__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4324:2: rule__ContainerStyleDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__Group_3__1__Impl_in_rule__ContainerStyleDefinition__Group_3__18855);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4330:1: rule__ContainerStyleDefinition__Group_3__1__Impl : ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) ) ;
    public final void rule__ContainerStyleDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4334:1: ( ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4335:1: ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4335:1: ( ( rule__ContainerStyleDefinition__BorderAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4336:1: ( rule__ContainerStyleDefinition__BorderAssignment_3_1 )
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getBorderAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4337:1: ( rule__ContainerStyleDefinition__BorderAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4337:2: rule__ContainerStyleDefinition__BorderAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ContainerStyleDefinition__BorderAssignment_3_1_in_rule__ContainerStyleDefinition__Group_3__1__Impl8882);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4351:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4355:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4356:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__08916);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__08919);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4363:1: rule__Node__Group__0__Impl : ( ( rule__Node__CreatableAssignment_0 )? ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4367:1: ( ( ( rule__Node__CreatableAssignment_0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4368:1: ( ( rule__Node__CreatableAssignment_0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4368:1: ( ( rule__Node__CreatableAssignment_0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4369:1: ( rule__Node__CreatableAssignment_0 )?
            {
             before(grammarAccess.getNodeAccess().getCreatableAssignment_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4370:1: ( rule__Node__CreatableAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==76) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4370:2: rule__Node__CreatableAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Node__CreatableAssignment_0_in_rule__Node__Group__0__Impl8946);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4380:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4384:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4385:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__18977);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__18980);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4392:1: rule__Node__Group__1__Impl : ( 'node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4396:1: ( ( 'node' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4397:1: ( 'node' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4397:1: ( 'node' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4398:1: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_1()); 
            match(input,62,FOLLOW_62_in_rule__Node__Group__1__Impl9008); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4411:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4415:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4416:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__29039);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__29042);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4423:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4427:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4428:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4428:1: ( ( rule__Node__NameAssignment_2 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4429:1: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4430:1: ( rule__Node__NameAssignment_2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4430:2: rule__Node__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl9069);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4440:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4444:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4445:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__39099);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__4_in_rule__Node__Group__39102);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4452:1: rule__Node__Group__3__Impl : ( 'for' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4456:1: ( ( 'for' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4457:1: ( 'for' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4457:1: ( 'for' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4458:1: 'for'
            {
             before(grammarAccess.getNodeAccess().getForKeyword_3()); 
            match(input,58,FOLLOW_58_in_rule__Node__Group__3__Impl9130); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4471:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4475:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4476:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__49161);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__5_in_rule__Node__Group__49164);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4483:1: rule__Node__Group__4__Impl : ( ( rule__Node__EClassAssignment_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4487:1: ( ( ( rule__Node__EClassAssignment_4 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4488:1: ( ( rule__Node__EClassAssignment_4 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4488:1: ( ( rule__Node__EClassAssignment_4 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4489:1: ( rule__Node__EClassAssignment_4 )
            {
             before(grammarAccess.getNodeAccess().getEClassAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4490:1: ( rule__Node__EClassAssignment_4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4490:2: rule__Node__EClassAssignment_4
            {
            pushFollow(FOLLOW_rule__Node__EClassAssignment_4_in_rule__Node__Group__4__Impl9191);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4500:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4504:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4505:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__59221);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__6_in_rule__Node__Group__59224);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4512:1: rule__Node__Group__5__Impl : ( 'accessibleThrough' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4516:1: ( ( 'accessibleThrough' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4517:1: ( 'accessibleThrough' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4517:1: ( 'accessibleThrough' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4518:1: 'accessibleThrough'
            {
             before(grammarAccess.getNodeAccess().getAccessibleThroughKeyword_5()); 
            match(input,52,FOLLOW_52_in_rule__Node__Group__5__Impl9252); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4531:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4535:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4536:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__69283);
            rule__Node__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__7_in_rule__Node__Group__69286);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4543:1: rule__Node__Group__6__Impl : ( ( rule__Node__ExpressionAssignment_6 ) ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4547:1: ( ( ( rule__Node__ExpressionAssignment_6 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4548:1: ( ( rule__Node__ExpressionAssignment_6 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4548:1: ( ( rule__Node__ExpressionAssignment_6 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4549:1: ( rule__Node__ExpressionAssignment_6 )
            {
             before(grammarAccess.getNodeAccess().getExpressionAssignment_6()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4550:1: ( rule__Node__ExpressionAssignment_6 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4550:2: rule__Node__ExpressionAssignment_6
            {
            pushFollow(FOLLOW_rule__Node__ExpressionAssignment_6_in_rule__Node__Group__6__Impl9313);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4560:1: rule__Node__Group__7 : rule__Node__Group__7__Impl ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4564:1: ( rule__Node__Group__7__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4565:2: rule__Node__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__79343);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4571:1: rule__Node__Group__7__Impl : ( ( rule__Node__StyleAssignment_7 )? ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4575:1: ( ( ( rule__Node__StyleAssignment_7 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4576:1: ( ( rule__Node__StyleAssignment_7 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4576:1: ( ( rule__Node__StyleAssignment_7 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4577:1: ( rule__Node__StyleAssignment_7 )?
            {
             before(grammarAccess.getNodeAccess().getStyleAssignment_7()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4578:1: ( rule__Node__StyleAssignment_7 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==59) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4578:2: rule__Node__StyleAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Node__StyleAssignment_7_in_rule__Node__Group__7__Impl9370);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4604:1: rule__NodeStyleDefinition__Group__0 : rule__NodeStyleDefinition__Group__0__Impl rule__NodeStyleDefinition__Group__1 ;
    public final void rule__NodeStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4608:1: ( rule__NodeStyleDefinition__Group__0__Impl rule__NodeStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4609:2: rule__NodeStyleDefinition__Group__0__Impl rule__NodeStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__0__Impl_in_rule__NodeStyleDefinition__Group__09417);
            rule__NodeStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__1_in_rule__NodeStyleDefinition__Group__09420);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4616:1: rule__NodeStyleDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__NodeStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4620:1: ( ( '[' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4621:1: ( '[' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4621:1: ( '[' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4622:1: '['
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,59,FOLLOW_59_in_rule__NodeStyleDefinition__Group__0__Impl9448); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4635:1: rule__NodeStyleDefinition__Group__1 : rule__NodeStyleDefinition__Group__1__Impl rule__NodeStyleDefinition__Group__2 ;
    public final void rule__NodeStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4639:1: ( rule__NodeStyleDefinition__Group__1__Impl rule__NodeStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4640:2: rule__NodeStyleDefinition__Group__1__Impl rule__NodeStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__1__Impl_in_rule__NodeStyleDefinition__Group__19479);
            rule__NodeStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__2_in_rule__NodeStyleDefinition__Group__19482);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4647:1: rule__NodeStyleDefinition__Group__1__Impl : ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) ) ;
    public final void rule__NodeStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4651:1: ( ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4652:1: ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4652:1: ( ( rule__NodeStyleDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4653:1: ( rule__NodeStyleDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4654:1: ( rule__NodeStyleDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4654:2: rule__NodeStyleDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__ColorAssignment_1_in_rule__NodeStyleDefinition__Group__1__Impl9509);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4664:1: rule__NodeStyleDefinition__Group__2 : rule__NodeStyleDefinition__Group__2__Impl rule__NodeStyleDefinition__Group__3 ;
    public final void rule__NodeStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4668:1: ( rule__NodeStyleDefinition__Group__2__Impl rule__NodeStyleDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4669:2: rule__NodeStyleDefinition__Group__2__Impl rule__NodeStyleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__2__Impl_in_rule__NodeStyleDefinition__Group__29539);
            rule__NodeStyleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__3_in_rule__NodeStyleDefinition__Group__29542);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4676:1: rule__NodeStyleDefinition__Group__2__Impl : ( ( rule__NodeStyleDefinition__Group_2__0 )? ) ;
    public final void rule__NodeStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4680:1: ( ( ( rule__NodeStyleDefinition__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4681:1: ( ( rule__NodeStyleDefinition__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4681:1: ( ( rule__NodeStyleDefinition__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4682:1: ( rule__NodeStyleDefinition__Group_2__0 )?
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4683:1: ( rule__NodeStyleDefinition__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==61) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==49) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4683:2: rule__NodeStyleDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__0_in_rule__NodeStyleDefinition__Group__2__Impl9569);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4693:1: rule__NodeStyleDefinition__Group__3 : rule__NodeStyleDefinition__Group__3__Impl rule__NodeStyleDefinition__Group__4 ;
    public final void rule__NodeStyleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4697:1: ( rule__NodeStyleDefinition__Group__3__Impl rule__NodeStyleDefinition__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4698:2: rule__NodeStyleDefinition__Group__3__Impl rule__NodeStyleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__3__Impl_in_rule__NodeStyleDefinition__Group__39600);
            rule__NodeStyleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__4_in_rule__NodeStyleDefinition__Group__39603);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4705:1: rule__NodeStyleDefinition__Group__3__Impl : ( ( rule__NodeStyleDefinition__Group_3__0 )? ) ;
    public final void rule__NodeStyleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4709:1: ( ( ( rule__NodeStyleDefinition__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4710:1: ( ( rule__NodeStyleDefinition__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4710:1: ( ( rule__NodeStyleDefinition__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4711:1: ( rule__NodeStyleDefinition__Group_3__0 )?
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4712:1: ( rule__NodeStyleDefinition__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==61) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4712:2: rule__NodeStyleDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__0_in_rule__NodeStyleDefinition__Group__3__Impl9630);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4722:1: rule__NodeStyleDefinition__Group__4 : rule__NodeStyleDefinition__Group__4__Impl ;
    public final void rule__NodeStyleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4726:1: ( rule__NodeStyleDefinition__Group__4__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4727:2: rule__NodeStyleDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group__4__Impl_in_rule__NodeStyleDefinition__Group__49661);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4733:1: rule__NodeStyleDefinition__Group__4__Impl : ( ']' ) ;
    public final void rule__NodeStyleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4737:1: ( ( ']' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4738:1: ( ']' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4738:1: ( ']' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4739:1: ']'
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getRightSquareBracketKeyword_4()); 
            match(input,60,FOLLOW_60_in_rule__NodeStyleDefinition__Group__4__Impl9689); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4762:1: rule__NodeStyleDefinition__Group_2__0 : rule__NodeStyleDefinition__Group_2__0__Impl rule__NodeStyleDefinition__Group_2__1 ;
    public final void rule__NodeStyleDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4766:1: ( rule__NodeStyleDefinition__Group_2__0__Impl rule__NodeStyleDefinition__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4767:2: rule__NodeStyleDefinition__Group_2__0__Impl rule__NodeStyleDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__0__Impl_in_rule__NodeStyleDefinition__Group_2__09730);
            rule__NodeStyleDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__1_in_rule__NodeStyleDefinition__Group_2__09733);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4774:1: rule__NodeStyleDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NodeStyleDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4778:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4779:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4779:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4780:1: ','
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,61,FOLLOW_61_in_rule__NodeStyleDefinition__Group_2__0__Impl9761); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4793:1: rule__NodeStyleDefinition__Group_2__1 : rule__NodeStyleDefinition__Group_2__1__Impl ;
    public final void rule__NodeStyleDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4797:1: ( rule__NodeStyleDefinition__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4798:2: rule__NodeStyleDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_2__1__Impl_in_rule__NodeStyleDefinition__Group_2__19792);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4804:1: rule__NodeStyleDefinition__Group_2__1__Impl : ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) ) ;
    public final void rule__NodeStyleDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4808:1: ( ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4809:1: ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4809:1: ( ( rule__NodeStyleDefinition__LabelAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4810:1: ( rule__NodeStyleDefinition__LabelAssignment_2_1 )
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getLabelAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4811:1: ( rule__NodeStyleDefinition__LabelAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4811:2: rule__NodeStyleDefinition__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__LabelAssignment_2_1_in_rule__NodeStyleDefinition__Group_2__1__Impl9819);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4825:1: rule__NodeStyleDefinition__Group_3__0 : rule__NodeStyleDefinition__Group_3__0__Impl rule__NodeStyleDefinition__Group_3__1 ;
    public final void rule__NodeStyleDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4829:1: ( rule__NodeStyleDefinition__Group_3__0__Impl rule__NodeStyleDefinition__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4830:2: rule__NodeStyleDefinition__Group_3__0__Impl rule__NodeStyleDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__0__Impl_in_rule__NodeStyleDefinition__Group_3__09853);
            rule__NodeStyleDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__1_in_rule__NodeStyleDefinition__Group_3__09856);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4837:1: rule__NodeStyleDefinition__Group_3__0__Impl : ( ',' ) ;
    public final void rule__NodeStyleDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4841:1: ( ( ',' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4842:1: ( ',' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4842:1: ( ',' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4843:1: ','
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getCommaKeyword_3_0()); 
            match(input,61,FOLLOW_61_in_rule__NodeStyleDefinition__Group_3__0__Impl9884); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4856:1: rule__NodeStyleDefinition__Group_3__1 : rule__NodeStyleDefinition__Group_3__1__Impl ;
    public final void rule__NodeStyleDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4860:1: ( rule__NodeStyleDefinition__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4861:2: rule__NodeStyleDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__Group_3__1__Impl_in_rule__NodeStyleDefinition__Group_3__19915);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4867:1: rule__NodeStyleDefinition__Group_3__1__Impl : ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) ) ;
    public final void rule__NodeStyleDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4871:1: ( ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4872:1: ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4872:1: ( ( rule__NodeStyleDefinition__BorderAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4873:1: ( rule__NodeStyleDefinition__BorderAssignment_3_1 )
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getBorderAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4874:1: ( rule__NodeStyleDefinition__BorderAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4874:2: rule__NodeStyleDefinition__BorderAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NodeStyleDefinition__BorderAssignment_3_1_in_rule__NodeStyleDefinition__Group_3__1__Impl9942);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4888:1: rule__SolidColorDefinition__Group__0 : rule__SolidColorDefinition__Group__0__Impl rule__SolidColorDefinition__Group__1 ;
    public final void rule__SolidColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4892:1: ( rule__SolidColorDefinition__Group__0__Impl rule__SolidColorDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4893:2: rule__SolidColorDefinition__Group__0__Impl rule__SolidColorDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__SolidColorDefinition__Group__0__Impl_in_rule__SolidColorDefinition__Group__09976);
            rule__SolidColorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SolidColorDefinition__Group__1_in_rule__SolidColorDefinition__Group__09979);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4900:1: rule__SolidColorDefinition__Group__0__Impl : ( 'color' ) ;
    public final void rule__SolidColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4904:1: ( ( 'color' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4905:1: ( 'color' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4905:1: ( 'color' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4906:1: 'color'
            {
             before(grammarAccess.getSolidColorDefinitionAccess().getColorKeyword_0()); 
            match(input,63,FOLLOW_63_in_rule__SolidColorDefinition__Group__0__Impl10007); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4919:1: rule__SolidColorDefinition__Group__1 : rule__SolidColorDefinition__Group__1__Impl ;
    public final void rule__SolidColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4923:1: ( rule__SolidColorDefinition__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4924:2: rule__SolidColorDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SolidColorDefinition__Group__1__Impl_in_rule__SolidColorDefinition__Group__110038);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4930:1: rule__SolidColorDefinition__Group__1__Impl : ( ( rule__SolidColorDefinition__ColorAssignment_1 ) ) ;
    public final void rule__SolidColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4934:1: ( ( ( rule__SolidColorDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4935:1: ( ( rule__SolidColorDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4935:1: ( ( rule__SolidColorDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4936:1: ( rule__SolidColorDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getSolidColorDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4937:1: ( rule__SolidColorDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4937:2: rule__SolidColorDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__SolidColorDefinition__ColorAssignment_1_in_rule__SolidColorDefinition__Group__1__Impl10065);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4951:1: rule__GradientColorDefinition__Group__0 : rule__GradientColorDefinition__Group__0__Impl rule__GradientColorDefinition__Group__1 ;
    public final void rule__GradientColorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4955:1: ( rule__GradientColorDefinition__Group__0__Impl rule__GradientColorDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4956:2: rule__GradientColorDefinition__Group__0__Impl rule__GradientColorDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__0__Impl_in_rule__GradientColorDefinition__Group__010099);
            rule__GradientColorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__1_in_rule__GradientColorDefinition__Group__010102);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4963:1: rule__GradientColorDefinition__Group__0__Impl : ( 'gradient from' ) ;
    public final void rule__GradientColorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4967:1: ( ( 'gradient from' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4968:1: ( 'gradient from' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4968:1: ( 'gradient from' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4969:1: 'gradient from'
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getGradientFromKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__GradientColorDefinition__Group__0__Impl10130); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4982:1: rule__GradientColorDefinition__Group__1 : rule__GradientColorDefinition__Group__1__Impl rule__GradientColorDefinition__Group__2 ;
    public final void rule__GradientColorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4986:1: ( rule__GradientColorDefinition__Group__1__Impl rule__GradientColorDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4987:2: rule__GradientColorDefinition__Group__1__Impl rule__GradientColorDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__1__Impl_in_rule__GradientColorDefinition__Group__110161);
            rule__GradientColorDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__2_in_rule__GradientColorDefinition__Group__110164);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4994:1: rule__GradientColorDefinition__Group__1__Impl : ( ( rule__GradientColorDefinition__FromAssignment_1 ) ) ;
    public final void rule__GradientColorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4998:1: ( ( ( rule__GradientColorDefinition__FromAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4999:1: ( ( rule__GradientColorDefinition__FromAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:4999:1: ( ( rule__GradientColorDefinition__FromAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5000:1: ( rule__GradientColorDefinition__FromAssignment_1 )
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getFromAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5001:1: ( rule__GradientColorDefinition__FromAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5001:2: rule__GradientColorDefinition__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__FromAssignment_1_in_rule__GradientColorDefinition__Group__1__Impl10191);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5011:1: rule__GradientColorDefinition__Group__2 : rule__GradientColorDefinition__Group__2__Impl rule__GradientColorDefinition__Group__3 ;
    public final void rule__GradientColorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5015:1: ( rule__GradientColorDefinition__Group__2__Impl rule__GradientColorDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5016:2: rule__GradientColorDefinition__Group__2__Impl rule__GradientColorDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__2__Impl_in_rule__GradientColorDefinition__Group__210221);
            rule__GradientColorDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__3_in_rule__GradientColorDefinition__Group__210224);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5023:1: rule__GradientColorDefinition__Group__2__Impl : ( 'to' ) ;
    public final void rule__GradientColorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5027:1: ( ( 'to' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5028:1: ( 'to' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5028:1: ( 'to' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5029:1: 'to'
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getToKeyword_2()); 
            match(input,65,FOLLOW_65_in_rule__GradientColorDefinition__Group__2__Impl10252); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5042:1: rule__GradientColorDefinition__Group__3 : rule__GradientColorDefinition__Group__3__Impl ;
    public final void rule__GradientColorDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5046:1: ( rule__GradientColorDefinition__Group__3__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5047:2: rule__GradientColorDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__Group__3__Impl_in_rule__GradientColorDefinition__Group__310283);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5053:1: rule__GradientColorDefinition__Group__3__Impl : ( ( rule__GradientColorDefinition__ToAssignment_3 ) ) ;
    public final void rule__GradientColorDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5057:1: ( ( ( rule__GradientColorDefinition__ToAssignment_3 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5058:1: ( ( rule__GradientColorDefinition__ToAssignment_3 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5058:1: ( ( rule__GradientColorDefinition__ToAssignment_3 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5059:1: ( rule__GradientColorDefinition__ToAssignment_3 )
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getToAssignment_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5060:1: ( rule__GradientColorDefinition__ToAssignment_3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5060:2: rule__GradientColorDefinition__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__GradientColorDefinition__ToAssignment_3_in_rule__GradientColorDefinition__Group__3__Impl10310);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5078:1: rule__LabelStyleDefinition__Group__0 : rule__LabelStyleDefinition__Group__0__Impl rule__LabelStyleDefinition__Group__1 ;
    public final void rule__LabelStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5082:1: ( rule__LabelStyleDefinition__Group__0__Impl rule__LabelStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5083:2: rule__LabelStyleDefinition__Group__0__Impl rule__LabelStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__0__Impl_in_rule__LabelStyleDefinition__Group__010348);
            rule__LabelStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__1_in_rule__LabelStyleDefinition__Group__010351);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5090:1: rule__LabelStyleDefinition__Group__0__Impl : ( 'label' ) ;
    public final void rule__LabelStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5094:1: ( ( 'label' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5095:1: ( 'label' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5095:1: ( 'label' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5096:1: 'label'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getLabelKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__LabelStyleDefinition__Group__0__Impl10379); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5109:1: rule__LabelStyleDefinition__Group__1 : rule__LabelStyleDefinition__Group__1__Impl rule__LabelStyleDefinition__Group__2 ;
    public final void rule__LabelStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5113:1: ( rule__LabelStyleDefinition__Group__1__Impl rule__LabelStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5114:2: rule__LabelStyleDefinition__Group__1__Impl rule__LabelStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__1__Impl_in_rule__LabelStyleDefinition__Group__110410);
            rule__LabelStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__2_in_rule__LabelStyleDefinition__Group__110413);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5121:1: rule__LabelStyleDefinition__Group__1__Impl : ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? ) ;
    public final void rule__LabelStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5125:1: ( ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5126:1: ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5126:1: ( ( rule__LabelStyleDefinition__ExpressionAssignment_1 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5127:1: ( rule__LabelStyleDefinition__ExpressionAssignment_1 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getExpressionAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5128:1: ( rule__LabelStyleDefinition__ExpressionAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=68 && LA43_0<=71)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5128:2: rule__LabelStyleDefinition__ExpressionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__ExpressionAssignment_1_in_rule__LabelStyleDefinition__Group__1__Impl10440);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5138:1: rule__LabelStyleDefinition__Group__2 : rule__LabelStyleDefinition__Group__2__Impl rule__LabelStyleDefinition__Group__3 ;
    public final void rule__LabelStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5142:1: ( rule__LabelStyleDefinition__Group__2__Impl rule__LabelStyleDefinition__Group__3 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5143:2: rule__LabelStyleDefinition__Group__2__Impl rule__LabelStyleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__2__Impl_in_rule__LabelStyleDefinition__Group__210471);
            rule__LabelStyleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__3_in_rule__LabelStyleDefinition__Group__210474);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5150:1: rule__LabelStyleDefinition__Group__2__Impl : ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) ) ;
    public final void rule__LabelStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5154:1: ( ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5155:1: ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5155:1: ( ( rule__LabelStyleDefinition__ColorAssignment_2 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5156:1: ( rule__LabelStyleDefinition__ColorAssignment_2 )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getColorAssignment_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5157:1: ( rule__LabelStyleDefinition__ColorAssignment_2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5157:2: rule__LabelStyleDefinition__ColorAssignment_2
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__ColorAssignment_2_in_rule__LabelStyleDefinition__Group__2__Impl10501);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5167:1: rule__LabelStyleDefinition__Group__3 : rule__LabelStyleDefinition__Group__3__Impl rule__LabelStyleDefinition__Group__4 ;
    public final void rule__LabelStyleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5171:1: ( rule__LabelStyleDefinition__Group__3__Impl rule__LabelStyleDefinition__Group__4 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5172:2: rule__LabelStyleDefinition__Group__3__Impl rule__LabelStyleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__3__Impl_in_rule__LabelStyleDefinition__Group__310531);
            rule__LabelStyleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__4_in_rule__LabelStyleDefinition__Group__310534);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5179:1: rule__LabelStyleDefinition__Group__3__Impl : ( ( rule__LabelStyleDefinition__Group_3__0 )? ) ;
    public final void rule__LabelStyleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5183:1: ( ( ( rule__LabelStyleDefinition__Group_3__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5184:1: ( ( rule__LabelStyleDefinition__Group_3__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5184:1: ( ( rule__LabelStyleDefinition__Group_3__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5185:1: ( rule__LabelStyleDefinition__Group_3__0 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getGroup_3()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5186:1: ( rule__LabelStyleDefinition__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==66) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5186:2: rule__LabelStyleDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__0_in_rule__LabelStyleDefinition__Group__3__Impl10561);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5196:1: rule__LabelStyleDefinition__Group__4 : rule__LabelStyleDefinition__Group__4__Impl rule__LabelStyleDefinition__Group__5 ;
    public final void rule__LabelStyleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5200:1: ( rule__LabelStyleDefinition__Group__4__Impl rule__LabelStyleDefinition__Group__5 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5201:2: rule__LabelStyleDefinition__Group__4__Impl rule__LabelStyleDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__4__Impl_in_rule__LabelStyleDefinition__Group__410592);
            rule__LabelStyleDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__5_in_rule__LabelStyleDefinition__Group__410595);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5208:1: rule__LabelStyleDefinition__Group__4__Impl : ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? ) ;
    public final void rule__LabelStyleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5212:1: ( ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5213:1: ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5213:1: ( ( rule__LabelStyleDefinition__BoldAssignment_4 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5214:1: ( rule__LabelStyleDefinition__BoldAssignment_4 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getBoldAssignment_4()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5215:1: ( rule__LabelStyleDefinition__BoldAssignment_4 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==77) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5215:2: rule__LabelStyleDefinition__BoldAssignment_4
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__BoldAssignment_4_in_rule__LabelStyleDefinition__Group__4__Impl10622);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5225:1: rule__LabelStyleDefinition__Group__5 : rule__LabelStyleDefinition__Group__5__Impl ;
    public final void rule__LabelStyleDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5229:1: ( rule__LabelStyleDefinition__Group__5__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5230:2: rule__LabelStyleDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group__5__Impl_in_rule__LabelStyleDefinition__Group__510653);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5236:1: rule__LabelStyleDefinition__Group__5__Impl : ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? ) ;
    public final void rule__LabelStyleDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5240:1: ( ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5241:1: ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5241:1: ( ( rule__LabelStyleDefinition__ItalicAssignment_5 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5242:1: ( rule__LabelStyleDefinition__ItalicAssignment_5 )?
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getItalicAssignment_5()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5243:1: ( rule__LabelStyleDefinition__ItalicAssignment_5 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==78) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5243:2: rule__LabelStyleDefinition__ItalicAssignment_5
                    {
                    pushFollow(FOLLOW_rule__LabelStyleDefinition__ItalicAssignment_5_in_rule__LabelStyleDefinition__Group__5__Impl10680);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5265:1: rule__LabelStyleDefinition__Group_3__0 : rule__LabelStyleDefinition__Group_3__0__Impl rule__LabelStyleDefinition__Group_3__1 ;
    public final void rule__LabelStyleDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5269:1: ( rule__LabelStyleDefinition__Group_3__0__Impl rule__LabelStyleDefinition__Group_3__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5270:2: rule__LabelStyleDefinition__Group_3__0__Impl rule__LabelStyleDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__0__Impl_in_rule__LabelStyleDefinition__Group_3__010723);
            rule__LabelStyleDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__1_in_rule__LabelStyleDefinition__Group_3__010726);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5277:1: rule__LabelStyleDefinition__Group_3__0__Impl : ( 'size' ) ;
    public final void rule__LabelStyleDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5281:1: ( ( 'size' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5282:1: ( 'size' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5282:1: ( 'size' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5283:1: 'size'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getSizeKeyword_3_0()); 
            match(input,66,FOLLOW_66_in_rule__LabelStyleDefinition__Group_3__0__Impl10754); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5296:1: rule__LabelStyleDefinition__Group_3__1 : rule__LabelStyleDefinition__Group_3__1__Impl ;
    public final void rule__LabelStyleDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5300:1: ( rule__LabelStyleDefinition__Group_3__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5301:2: rule__LabelStyleDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__Group_3__1__Impl_in_rule__LabelStyleDefinition__Group_3__110785);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5307:1: rule__LabelStyleDefinition__Group_3__1__Impl : ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) ) ;
    public final void rule__LabelStyleDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5311:1: ( ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5312:1: ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5312:1: ( ( rule__LabelStyleDefinition__SizeAssignment_3_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5313:1: ( rule__LabelStyleDefinition__SizeAssignment_3_1 )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getSizeAssignment_3_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5314:1: ( rule__LabelStyleDefinition__SizeAssignment_3_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5314:2: rule__LabelStyleDefinition__SizeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__LabelStyleDefinition__SizeAssignment_3_1_in_rule__LabelStyleDefinition__Group_3__1__Impl10812);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5328:1: rule__BorderStyleDefinition__Group__0 : rule__BorderStyleDefinition__Group__0__Impl rule__BorderStyleDefinition__Group__1 ;
    public final void rule__BorderStyleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5332:1: ( rule__BorderStyleDefinition__Group__0__Impl rule__BorderStyleDefinition__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5333:2: rule__BorderStyleDefinition__Group__0__Impl rule__BorderStyleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__0__Impl_in_rule__BorderStyleDefinition__Group__010846);
            rule__BorderStyleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__1_in_rule__BorderStyleDefinition__Group__010849);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5340:1: rule__BorderStyleDefinition__Group__0__Impl : ( 'border ' ) ;
    public final void rule__BorderStyleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5344:1: ( ( 'border ' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5345:1: ( 'border ' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5345:1: ( 'border ' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5346:1: 'border '
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getBorderKeyword_0()); 
            match(input,67,FOLLOW_67_in_rule__BorderStyleDefinition__Group__0__Impl10877); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5359:1: rule__BorderStyleDefinition__Group__1 : rule__BorderStyleDefinition__Group__1__Impl rule__BorderStyleDefinition__Group__2 ;
    public final void rule__BorderStyleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5363:1: ( rule__BorderStyleDefinition__Group__1__Impl rule__BorderStyleDefinition__Group__2 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5364:2: rule__BorderStyleDefinition__Group__1__Impl rule__BorderStyleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__1__Impl_in_rule__BorderStyleDefinition__Group__110908);
            rule__BorderStyleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__2_in_rule__BorderStyleDefinition__Group__110911);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5371:1: rule__BorderStyleDefinition__Group__1__Impl : ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) ) ;
    public final void rule__BorderStyleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5375:1: ( ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5376:1: ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5376:1: ( ( rule__BorderStyleDefinition__ColorAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5377:1: ( rule__BorderStyleDefinition__ColorAssignment_1 )
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getColorAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5378:1: ( rule__BorderStyleDefinition__ColorAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5378:2: rule__BorderStyleDefinition__ColorAssignment_1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__ColorAssignment_1_in_rule__BorderStyleDefinition__Group__1__Impl10938);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5388:1: rule__BorderStyleDefinition__Group__2 : rule__BorderStyleDefinition__Group__2__Impl ;
    public final void rule__BorderStyleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5392:1: ( rule__BorderStyleDefinition__Group__2__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5393:2: rule__BorderStyleDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group__2__Impl_in_rule__BorderStyleDefinition__Group__210968);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5399:1: rule__BorderStyleDefinition__Group__2__Impl : ( ( rule__BorderStyleDefinition__Group_2__0 )? ) ;
    public final void rule__BorderStyleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5403:1: ( ( ( rule__BorderStyleDefinition__Group_2__0 )? ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5404:1: ( ( rule__BorderStyleDefinition__Group_2__0 )? )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5404:1: ( ( rule__BorderStyleDefinition__Group_2__0 )? )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5405:1: ( rule__BorderStyleDefinition__Group_2__0 )?
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getGroup_2()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5406:1: ( rule__BorderStyleDefinition__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==66) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5406:2: rule__BorderStyleDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__0_in_rule__BorderStyleDefinition__Group__2__Impl10995);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5422:1: rule__BorderStyleDefinition__Group_2__0 : rule__BorderStyleDefinition__Group_2__0__Impl rule__BorderStyleDefinition__Group_2__1 ;
    public final void rule__BorderStyleDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5426:1: ( rule__BorderStyleDefinition__Group_2__0__Impl rule__BorderStyleDefinition__Group_2__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5427:2: rule__BorderStyleDefinition__Group_2__0__Impl rule__BorderStyleDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__0__Impl_in_rule__BorderStyleDefinition__Group_2__011032);
            rule__BorderStyleDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__1_in_rule__BorderStyleDefinition__Group_2__011035);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5434:1: rule__BorderStyleDefinition__Group_2__0__Impl : ( 'size' ) ;
    public final void rule__BorderStyleDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5438:1: ( ( 'size' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5439:1: ( 'size' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5439:1: ( 'size' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5440:1: 'size'
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getSizeKeyword_2_0()); 
            match(input,66,FOLLOW_66_in_rule__BorderStyleDefinition__Group_2__0__Impl11063); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5453:1: rule__BorderStyleDefinition__Group_2__1 : rule__BorderStyleDefinition__Group_2__1__Impl ;
    public final void rule__BorderStyleDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5457:1: ( rule__BorderStyleDefinition__Group_2__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5458:2: rule__BorderStyleDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__Group_2__1__Impl_in_rule__BorderStyleDefinition__Group_2__111094);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5464:1: rule__BorderStyleDefinition__Group_2__1__Impl : ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) ) ;
    public final void rule__BorderStyleDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5468:1: ( ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5469:1: ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5469:1: ( ( rule__BorderStyleDefinition__SizeAssignment_2_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5470:1: ( rule__BorderStyleDefinition__SizeAssignment_2_1 )
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getSizeAssignment_2_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5471:1: ( rule__BorderStyleDefinition__SizeAssignment_2_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5471:2: rule__BorderStyleDefinition__SizeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BorderStyleDefinition__SizeAssignment_2_1_in_rule__BorderStyleDefinition__Group_2__1__Impl11121);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5485:1: rule__AcceleoExpression__Group__0 : rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1 ;
    public final void rule__AcceleoExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5489:1: ( rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5490:2: rule__AcceleoExpression__Group__0__Impl rule__AcceleoExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__Group__0__Impl_in_rule__AcceleoExpression__Group__011155);
            rule__AcceleoExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AcceleoExpression__Group__1_in_rule__AcceleoExpression__Group__011158);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5497:1: rule__AcceleoExpression__Group__0__Impl : ( 'acc:' ) ;
    public final void rule__AcceleoExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5501:1: ( ( 'acc:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5502:1: ( 'acc:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5502:1: ( 'acc:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5503:1: 'acc:'
            {
             before(grammarAccess.getAcceleoExpressionAccess().getAccKeyword_0()); 
            match(input,68,FOLLOW_68_in_rule__AcceleoExpression__Group__0__Impl11186); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5516:1: rule__AcceleoExpression__Group__1 : rule__AcceleoExpression__Group__1__Impl ;
    public final void rule__AcceleoExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5520:1: ( rule__AcceleoExpression__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5521:2: rule__AcceleoExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__Group__1__Impl_in_rule__AcceleoExpression__Group__111217);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5527:1: rule__AcceleoExpression__Group__1__Impl : ( ( rule__AcceleoExpression__ValueAssignment_1 ) ) ;
    public final void rule__AcceleoExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5531:1: ( ( ( rule__AcceleoExpression__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5532:1: ( ( rule__AcceleoExpression__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5532:1: ( ( rule__AcceleoExpression__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5533:1: ( rule__AcceleoExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getAcceleoExpressionAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5534:1: ( rule__AcceleoExpression__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5534:2: rule__AcceleoExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__AcceleoExpression__ValueAssignment_1_in_rule__AcceleoExpression__Group__1__Impl11244);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5548:1: rule__VarRef__Group__0 : rule__VarRef__Group__0__Impl rule__VarRef__Group__1 ;
    public final void rule__VarRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5552:1: ( rule__VarRef__Group__0__Impl rule__VarRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5553:2: rule__VarRef__Group__0__Impl rule__VarRef__Group__1
            {
            pushFollow(FOLLOW_rule__VarRef__Group__0__Impl_in_rule__VarRef__Group__011278);
            rule__VarRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarRef__Group__1_in_rule__VarRef__Group__011281);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5560:1: rule__VarRef__Group__0__Impl : ( 'var:' ) ;
    public final void rule__VarRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5564:1: ( ( 'var:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5565:1: ( 'var:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5565:1: ( 'var:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5566:1: 'var:'
            {
             before(grammarAccess.getVarRefAccess().getVarKeyword_0()); 
            match(input,69,FOLLOW_69_in_rule__VarRef__Group__0__Impl11309); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5579:1: rule__VarRef__Group__1 : rule__VarRef__Group__1__Impl ;
    public final void rule__VarRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5583:1: ( rule__VarRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5584:2: rule__VarRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarRef__Group__1__Impl_in_rule__VarRef__Group__111340);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5590:1: rule__VarRef__Group__1__Impl : ( ( rule__VarRef__ValueAssignment_1 ) ) ;
    public final void rule__VarRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5594:1: ( ( ( rule__VarRef__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5595:1: ( ( rule__VarRef__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5595:1: ( ( rule__VarRef__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5596:1: ( rule__VarRef__ValueAssignment_1 )
            {
             before(grammarAccess.getVarRefAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5597:1: ( rule__VarRef__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5597:2: rule__VarRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__VarRef__ValueAssignment_1_in_rule__VarRef__Group__1__Impl11367);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5611:1: rule__FeatureRef__Group__0 : rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1 ;
    public final void rule__FeatureRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5615:1: ( rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5616:2: rule__FeatureRef__Group__0__Impl rule__FeatureRef__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureRef__Group__0__Impl_in_rule__FeatureRef__Group__011401);
            rule__FeatureRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureRef__Group__1_in_rule__FeatureRef__Group__011404);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5623:1: rule__FeatureRef__Group__0__Impl : ( 'feature:' ) ;
    public final void rule__FeatureRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5627:1: ( ( 'feature:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5628:1: ( 'feature:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5628:1: ( 'feature:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5629:1: 'feature:'
            {
             before(grammarAccess.getFeatureRefAccess().getFeatureKeyword_0()); 
            match(input,70,FOLLOW_70_in_rule__FeatureRef__Group__0__Impl11432); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5642:1: rule__FeatureRef__Group__1 : rule__FeatureRef__Group__1__Impl ;
    public final void rule__FeatureRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5646:1: ( rule__FeatureRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5647:2: rule__FeatureRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureRef__Group__1__Impl_in_rule__FeatureRef__Group__111463);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5653:1: rule__FeatureRef__Group__1__Impl : ( ( rule__FeatureRef__ValueAssignment_1 ) ) ;
    public final void rule__FeatureRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5657:1: ( ( ( rule__FeatureRef__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5658:1: ( ( rule__FeatureRef__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5658:1: ( ( rule__FeatureRef__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5659:1: ( rule__FeatureRef__ValueAssignment_1 )
            {
             before(grammarAccess.getFeatureRefAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5660:1: ( rule__FeatureRef__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5660:2: rule__FeatureRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__FeatureRef__ValueAssignment_1_in_rule__FeatureRef__Group__1__Impl11490);
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


    // $ANTLR start "rule__ServiceRef__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5674:1: rule__ServiceRef__Group__0 : rule__ServiceRef__Group__0__Impl rule__ServiceRef__Group__1 ;
    public final void rule__ServiceRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5678:1: ( rule__ServiceRef__Group__0__Impl rule__ServiceRef__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5679:2: rule__ServiceRef__Group__0__Impl rule__ServiceRef__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceRef__Group__0__Impl_in_rule__ServiceRef__Group__011524);
            rule__ServiceRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRef__Group__1_in_rule__ServiceRef__Group__011527);
            rule__ServiceRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRef__Group__0"


    // $ANTLR start "rule__ServiceRef__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5686:1: rule__ServiceRef__Group__0__Impl : ( 'service:' ) ;
    public final void rule__ServiceRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5690:1: ( ( 'service:' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5691:1: ( 'service:' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5691:1: ( 'service:' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5692:1: 'service:'
            {
             before(grammarAccess.getServiceRefAccess().getServiceKeyword_0()); 
            match(input,71,FOLLOW_71_in_rule__ServiceRef__Group__0__Impl11555); 
             after(grammarAccess.getServiceRefAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRef__Group__0__Impl"


    // $ANTLR start "rule__ServiceRef__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5705:1: rule__ServiceRef__Group__1 : rule__ServiceRef__Group__1__Impl ;
    public final void rule__ServiceRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5709:1: ( rule__ServiceRef__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5710:2: rule__ServiceRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ServiceRef__Group__1__Impl_in_rule__ServiceRef__Group__111586);
            rule__ServiceRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRef__Group__1"


    // $ANTLR start "rule__ServiceRef__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5716:1: rule__ServiceRef__Group__1__Impl : ( ( rule__ServiceRef__ValueAssignment_1 ) ) ;
    public final void rule__ServiceRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5720:1: ( ( ( rule__ServiceRef__ValueAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5721:1: ( ( rule__ServiceRef__ValueAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5721:1: ( ( rule__ServiceRef__ValueAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5722:1: ( rule__ServiceRef__ValueAssignment_1 )
            {
             before(grammarAccess.getServiceRefAccess().getValueAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5723:1: ( rule__ServiceRef__ValueAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5723:2: rule__ServiceRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceRef__ValueAssignment_1_in_rule__ServiceRef__Group__1__Impl11613);
            rule__ServiceRef__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceRefAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRef__Group__1__Impl"


    // $ANTLR start "rule__MetamodelUsage__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5737:1: rule__MetamodelUsage__Group__0 : rule__MetamodelUsage__Group__0__Impl rule__MetamodelUsage__Group__1 ;
    public final void rule__MetamodelUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5741:1: ( rule__MetamodelUsage__Group__0__Impl rule__MetamodelUsage__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5742:2: rule__MetamodelUsage__Group__0__Impl rule__MetamodelUsage__Group__1
            {
            pushFollow(FOLLOW_rule__MetamodelUsage__Group__0__Impl_in_rule__MetamodelUsage__Group__011647);
            rule__MetamodelUsage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetamodelUsage__Group__1_in_rule__MetamodelUsage__Group__011650);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5749:1: rule__MetamodelUsage__Group__0__Impl : ( 'metamodel' ) ;
    public final void rule__MetamodelUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5753:1: ( ( 'metamodel' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5754:1: ( 'metamodel' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5754:1: ( 'metamodel' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5755:1: 'metamodel'
            {
             before(grammarAccess.getMetamodelUsageAccess().getMetamodelKeyword_0()); 
            match(input,72,FOLLOW_72_in_rule__MetamodelUsage__Group__0__Impl11678); 
             after(grammarAccess.getMetamodelUsageAccess().getMetamodelKeyword_0()); 

            }


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5768:1: rule__MetamodelUsage__Group__1 : rule__MetamodelUsage__Group__1__Impl ;
    public final void rule__MetamodelUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5772:1: ( rule__MetamodelUsage__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5773:2: rule__MetamodelUsage__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelUsage__Group__1__Impl_in_rule__MetamodelUsage__Group__111709);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5779:1: rule__MetamodelUsage__Group__1__Impl : ( ( rule__MetamodelUsage__UsageAssignment_1 ) ) ;
    public final void rule__MetamodelUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5783:1: ( ( ( rule__MetamodelUsage__UsageAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5784:1: ( ( rule__MetamodelUsage__UsageAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5784:1: ( ( rule__MetamodelUsage__UsageAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5785:1: ( rule__MetamodelUsage__UsageAssignment_1 )
            {
             before(grammarAccess.getMetamodelUsageAccess().getUsageAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5786:1: ( rule__MetamodelUsage__UsageAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5786:2: rule__MetamodelUsage__UsageAssignment_1
            {
            pushFollow(FOLLOW_rule__MetamodelUsage__UsageAssignment_1_in_rule__MetamodelUsage__Group__1__Impl11736);
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


    // $ANTLR start "rule__JavaServiceClassReference__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5800:1: rule__JavaServiceClassReference__Group__0 : rule__JavaServiceClassReference__Group__0__Impl rule__JavaServiceClassReference__Group__1 ;
    public final void rule__JavaServiceClassReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5804:1: ( rule__JavaServiceClassReference__Group__0__Impl rule__JavaServiceClassReference__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5805:2: rule__JavaServiceClassReference__Group__0__Impl rule__JavaServiceClassReference__Group__1
            {
            pushFollow(FOLLOW_rule__JavaServiceClassReference__Group__0__Impl_in_rule__JavaServiceClassReference__Group__011770);
            rule__JavaServiceClassReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaServiceClassReference__Group__1_in_rule__JavaServiceClassReference__Group__011773);
            rule__JavaServiceClassReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaServiceClassReference__Group__0"


    // $ANTLR start "rule__JavaServiceClassReference__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5812:1: rule__JavaServiceClassReference__Group__0__Impl : ( 'use' ) ;
    public final void rule__JavaServiceClassReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5816:1: ( ( 'use' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5817:1: ( 'use' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5817:1: ( 'use' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5818:1: 'use'
            {
             before(grammarAccess.getJavaServiceClassReferenceAccess().getUseKeyword_0()); 
            match(input,73,FOLLOW_73_in_rule__JavaServiceClassReference__Group__0__Impl11801); 
             after(grammarAccess.getJavaServiceClassReferenceAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaServiceClassReference__Group__0__Impl"


    // $ANTLR start "rule__JavaServiceClassReference__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5831:1: rule__JavaServiceClassReference__Group__1 : rule__JavaServiceClassReference__Group__1__Impl ;
    public final void rule__JavaServiceClassReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5835:1: ( rule__JavaServiceClassReference__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5836:2: rule__JavaServiceClassReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JavaServiceClassReference__Group__1__Impl_in_rule__JavaServiceClassReference__Group__111832);
            rule__JavaServiceClassReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaServiceClassReference__Group__1"


    // $ANTLR start "rule__JavaServiceClassReference__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5842:1: rule__JavaServiceClassReference__Group__1__Impl : ( ( rule__JavaServiceClassReference__JavaClassAssignment_1 ) ) ;
    public final void rule__JavaServiceClassReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5846:1: ( ( ( rule__JavaServiceClassReference__JavaClassAssignment_1 ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5847:1: ( ( rule__JavaServiceClassReference__JavaClassAssignment_1 ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5847:1: ( ( rule__JavaServiceClassReference__JavaClassAssignment_1 ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5848:1: ( rule__JavaServiceClassReference__JavaClassAssignment_1 )
            {
             before(grammarAccess.getJavaServiceClassReferenceAccess().getJavaClassAssignment_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5849:1: ( rule__JavaServiceClassReference__JavaClassAssignment_1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5849:2: rule__JavaServiceClassReference__JavaClassAssignment_1
            {
            pushFollow(FOLLOW_rule__JavaServiceClassReference__JavaClassAssignment_1_in_rule__JavaServiceClassReference__Group__1__Impl11859);
            rule__JavaServiceClassReference__JavaClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJavaServiceClassReferenceAccess().getJavaClassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaServiceClassReference__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5863:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5867:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5868:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__011893);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__011896);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5875:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5879:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5880:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5880:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5881:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl11923); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5892:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5896:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5897:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__111952);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5903:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5907:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5908:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5908:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5909:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5910:1: ( rule__QualifiedName__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==74) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5910:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl11979);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5924:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5928:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5929:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__012014);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__012017);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5936:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5940:1: ( ( '.' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5941:1: ( '.' )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5941:1: ( '.' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5942:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,74,FOLLOW_74_in_rule__QualifiedName__Group_1__0__Impl12045); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5955:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5959:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5960:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__112076);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5966:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5970:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5971:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5971:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5972:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl12103); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__SPrototyper__NameAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5988:1: rule__SPrototyper__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPrototyper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5992:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5993:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5993:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:5994:1: RULE_ID
            {
             before(grammarAccess.getSPrototyperAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPrototyper__NameAssignment_112141); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6003:1: rule__SPrototyper__QualifierAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPrototyper__QualifierAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6007:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6008:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6008:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6009:1: RULE_STRING
            {
             before(grammarAccess.getSPrototyperAccess().getQualifierSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPrototyper__QualifierAssignment_3_112172); 
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


    // $ANTLR start "rule__SPrototyper__TargetURIAssignment_5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6018:1: rule__SPrototyper__TargetURIAssignment_5 : ( RULE_STRING ) ;
    public final void rule__SPrototyper__TargetURIAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6022:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6023:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6023:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6024:1: RULE_STRING
            {
             before(grammarAccess.getSPrototyperAccess().getTargetURISTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPrototyper__TargetURIAssignment_512203); 
             after(grammarAccess.getSPrototyperAccess().getTargetURISTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__TargetURIAssignment_5"


    // $ANTLR start "rule__SPrototyper__ViewpointsAssignment_6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6033:1: rule__SPrototyper__ViewpointsAssignment_6 : ( ruleSPViewpoint ) ;
    public final void rule__SPrototyper__ViewpointsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6037:1: ( ( ruleSPViewpoint ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6038:1: ( ruleSPViewpoint )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6038:1: ( ruleSPViewpoint )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6039:1: ruleSPViewpoint
            {
             before(grammarAccess.getSPrototyperAccess().getViewpointsSPViewpointParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSPViewpoint_in_rule__SPrototyper__ViewpointsAssignment_612234);
            ruleSPViewpoint();

            state._fsp--;

             after(grammarAccess.getSPrototyperAccess().getViewpointsSPViewpointParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrototyper__ViewpointsAssignment_6"


    // $ANTLR start "rule__SPViewpoint__NameAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6048:1: rule__SPViewpoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPViewpoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6052:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6053:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6053:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6054:1: RULE_ID
            {
             before(grammarAccess.getSPViewpointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPViewpoint__NameAssignment_112265); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6063:1: rule__SPViewpoint__ShortcutAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPViewpoint__ShortcutAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6067:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6068:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6068:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6069:1: RULE_STRING
            {
             before(grammarAccess.getSPViewpointAccess().getShortcutSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPViewpoint__ShortcutAssignment_3_112296); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6078:1: rule__SPViewpoint__ExtensionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SPViewpoint__ExtensionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6082:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6083:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6083:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6084:1: RULE_STRING
            {
             before(grammarAccess.getSPViewpointAccess().getExtensionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPViewpoint__ExtensionAssignment_4_112327); 
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


    // $ANTLR start "rule__SPViewpoint__ServiceClassAssignment_5"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6093:1: rule__SPViewpoint__ServiceClassAssignment_5 : ( ruleJavaServiceClassReference ) ;
    public final void rule__SPViewpoint__ServiceClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6097:1: ( ( ruleJavaServiceClassReference ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6098:1: ( ruleJavaServiceClassReference )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6098:1: ( ruleJavaServiceClassReference )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6099:1: ruleJavaServiceClassReference
            {
             before(grammarAccess.getSPViewpointAccess().getServiceClassJavaServiceClassReferenceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleJavaServiceClassReference_in_rule__SPViewpoint__ServiceClassAssignment_512358);
            ruleJavaServiceClassReference();

            state._fsp--;

             after(grammarAccess.getSPViewpointAccess().getServiceClassJavaServiceClassReferenceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__ServiceClassAssignment_5"


    // $ANTLR start "rule__SPViewpoint__RepresentationsAssignment_6"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6108:1: rule__SPViewpoint__RepresentationsAssignment_6 : ( ruleSPRepresentation ) ;
    public final void rule__SPViewpoint__RepresentationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6112:1: ( ( ruleSPRepresentation ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6113:1: ( ruleSPRepresentation )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6113:1: ( ruleSPRepresentation )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6114:1: ruleSPRepresentation
            {
             before(grammarAccess.getSPViewpointAccess().getRepresentationsSPRepresentationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSPRepresentation_in_rule__SPViewpoint__RepresentationsAssignment_612389);
            ruleSPRepresentation();

            state._fsp--;

             after(grammarAccess.getSPViewpointAccess().getRepresentationsSPRepresentationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPViewpoint__RepresentationsAssignment_6"


    // $ANTLR start "rule__SPTable__NameAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6123:1: rule__SPTable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPTable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6127:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6128:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6128:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6129:1: RULE_ID
            {
             before(grammarAccess.getSPTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPTable__NameAssignment_112420); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6138:1: rule__SPTable__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPTable__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6142:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6143:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6143:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6144:1: RULE_STRING
            {
             before(grammarAccess.getSPTableAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPTable__LabelAssignment_3_112451); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6153:1: rule__SPTable__TitleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SPTable__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6157:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6158:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6158:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6159:1: RULE_STRING
            {
             before(grammarAccess.getSPTableAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPTable__TitleAssignment_4_112482); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6168:1: rule__SPTable__UsagesAssignment_5 : ( ruleMetamodelUsage ) ;
    public final void rule__SPTable__UsagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6172:1: ( ( ruleMetamodelUsage ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6173:1: ( ruleMetamodelUsage )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6173:1: ( ruleMetamodelUsage )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6174:1: ruleMetamodelUsage
            {
             before(grammarAccess.getSPTableAccess().getUsagesMetamodelUsageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMetamodelUsage_in_rule__SPTable__UsagesAssignment_512513);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6183:1: rule__SPTable__RootAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__SPTable__RootAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6187:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6188:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6188:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6189:1: ( RULE_ID )
            {
             before(grammarAccess.getSPTableAccess().getRootEClassCrossReference_7_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6190:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6191:1: RULE_ID
            {
             before(grammarAccess.getSPTableAccess().getRootEClassIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPTable__RootAssignment_712548); 
             after(grammarAccess.getSPTableAccess().getRootEClassIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getSPTableAccess().getRootEClassCrossReference_7_0()); 

            }


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6202:1: rule__SPTable__ElementsAssignment_8 : ( ruleTableElement ) ;
    public final void rule__SPTable__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6206:1: ( ( ruleTableElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6207:1: ( ruleTableElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6207:1: ( ruleTableElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6208:1: ruleTableElement
            {
             before(grammarAccess.getSPTableAccess().getElementsTableElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleTableElement_in_rule__SPTable__ElementsAssignment_812583);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6217:1: rule__SPTable__PropertiesAssignment_9 : ( ruleTableProperty ) ;
    public final void rule__SPTable__PropertiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6221:1: ( ( ruleTableProperty ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6222:1: ( ruleTableProperty )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6222:1: ( ruleTableProperty )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6223:1: ruleTableProperty
            {
             before(grammarAccess.getSPTableAccess().getPropertiesTablePropertyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleTableProperty_in_rule__SPTable__PropertiesAssignment_912614);
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


    // $ANTLR start "rule__TableElement__RecursiveAssignment_0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6232:1: rule__TableElement__RecursiveAssignment_0 : ( ( 'recursive' ) ) ;
    public final void rule__TableElement__RecursiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6236:1: ( ( ( 'recursive' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6237:1: ( ( 'recursive' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6237:1: ( ( 'recursive' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6238:1: ( 'recursive' )
            {
             before(grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_0_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6239:1: ( 'recursive' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6240:1: 'recursive'
            {
             before(grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_0_0()); 
            match(input,75,FOLLOW_75_in_rule__TableElement__RecursiveAssignment_012650); 
             after(grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_0_0()); 

            }

             after(grammarAccess.getTableElementAccess().getRecursiveRecursiveKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__RecursiveAssignment_0"


    // $ANTLR start "rule__TableElement__EClassAssignment_2"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6255:1: rule__TableElement__EClassAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TableElement__EClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6259:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6260:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6260:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6261:1: ( RULE_ID )
            {
             before(grammarAccess.getTableElementAccess().getEClassEClassCrossReference_2_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6262:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6263:1: RULE_ID
            {
             before(grammarAccess.getTableElementAccess().getEClassEClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TableElement__EClassAssignment_212693); 
             after(grammarAccess.getTableElementAccess().getEClassEClassIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTableElementAccess().getEClassEClassCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__EClassAssignment_2"


    // $ANTLR start "rule__TableElement__ExpressionAssignment_4"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6274:1: rule__TableElement__ExpressionAssignment_4 : ( ruleSPExpression ) ;
    public final void rule__TableElement__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6278:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6279:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6279:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6280:1: ruleSPExpression
            {
             before(grammarAccess.getTableElementAccess().getExpressionSPExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__TableElement__ExpressionAssignment_412728);
            ruleSPExpression();

            state._fsp--;

             after(grammarAccess.getTableElementAccess().getExpressionSPExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__ExpressionAssignment_4"


    // $ANTLR start "rule__TableElement__CreatableAssignment_5_0"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6289:1: rule__TableElement__CreatableAssignment_5_0 : ( ( 'creatable' ) ) ;
    public final void rule__TableElement__CreatableAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6293:1: ( ( ( 'creatable' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6294:1: ( ( 'creatable' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6294:1: ( ( 'creatable' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6295:1: ( 'creatable' )
            {
             before(grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_5_0_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6296:1: ( 'creatable' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6297:1: 'creatable'
            {
             before(grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_5_0_0()); 
            match(input,76,FOLLOW_76_in_rule__TableElement__CreatableAssignment_5_012764); 
             after(grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_5_0_0()); 

            }

             after(grammarAccess.getTableElementAccess().getCreatableCreatableKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__CreatableAssignment_5_0"


    // $ANTLR start "rule__TableElement__CreateExpressionAssignment_5_1_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6312:1: rule__TableElement__CreateExpressionAssignment_5_1_1 : ( ruleRequestOrCreateExpression ) ;
    public final void rule__TableElement__CreateExpressionAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6316:1: ( ( ruleRequestOrCreateExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6317:1: ( ruleRequestOrCreateExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6317:1: ( ruleRequestOrCreateExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6318:1: ruleRequestOrCreateExpression
            {
             before(grammarAccess.getTableElementAccess().getCreateExpressionRequestOrCreateExpressionParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleRequestOrCreateExpression_in_rule__TableElement__CreateExpressionAssignment_5_1_112803);
            ruleRequestOrCreateExpression();

            state._fsp--;

             after(grammarAccess.getTableElementAccess().getCreateExpressionRequestOrCreateExpressionParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableElement__CreateExpressionAssignment_5_1_1"


    // $ANTLR start "rule__TableElement__SubElementsAssignment_6_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6327:1: rule__TableElement__SubElementsAssignment_6_1 : ( ruleTableElement ) ;
    public final void rule__TableElement__SubElementsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6331:1: ( ( ruleTableElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6332:1: ( ruleTableElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6332:1: ( ruleTableElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6333:1: ruleTableElement
            {
             before(grammarAccess.getTableElementAccess().getSubElementsTableElementParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleTableElement_in_rule__TableElement__SubElementsAssignment_6_112834);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6342:1: rule__TableProperty__FeatureAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TableProperty__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6346:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6347:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6347:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6348:1: RULE_STRING
            {
             before(grammarAccess.getTablePropertyAccess().getFeatureSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableProperty__FeatureAssignment_112865); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6357:1: rule__TableProperty__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TableProperty__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6361:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6362:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6362:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6363:1: RULE_STRING
            {
             before(grammarAccess.getTablePropertyAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TableProperty__LabelAssignment_2_112896); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6372:1: rule__TableProperty__ExpressionAssignment_3_1 : ( ruleSPExpression ) ;
    public final void rule__TableProperty__ExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6376:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6377:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6377:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6378:1: ruleSPExpression
            {
             before(grammarAccess.getTablePropertyAccess().getExpressionSPExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__TableProperty__ExpressionAssignment_3_112927);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6387:1: rule__SPDiagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6391:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6392:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6392:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6393:1: RULE_ID
            {
             before(grammarAccess.getSPDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPDiagram__NameAssignment_112958); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6402:1: rule__SPDiagram__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SPDiagram__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6406:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6407:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6407:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6408:1: RULE_STRING
            {
             before(grammarAccess.getSPDiagramAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPDiagram__LabelAssignment_3_112989); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6417:1: rule__SPDiagram__TitleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SPDiagram__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6421:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6422:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6422:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6423:1: RULE_STRING
            {
             before(grammarAccess.getSPDiagramAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPDiagram__TitleAssignment_4_113020); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6432:1: rule__SPDiagram__MetamodelsAssignment_5 : ( ruleMetamodelUsage ) ;
    public final void rule__SPDiagram__MetamodelsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6436:1: ( ( ruleMetamodelUsage ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6437:1: ( ruleMetamodelUsage )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6437:1: ( ruleMetamodelUsage )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6438:1: ruleMetamodelUsage
            {
             before(grammarAccess.getSPDiagramAccess().getMetamodelsMetamodelUsageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMetamodelUsage_in_rule__SPDiagram__MetamodelsAssignment_513051);
            ruleMetamodelUsage();

            state._fsp--;

             after(grammarAccess.getSPDiagramAccess().getMetamodelsMetamodelUsageParserRuleCall_5_0()); 

            }


            }

        }
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6447:1: rule__SPDiagram__RootAssignment_7 : ( RULE_STRING ) ;
    public final void rule__SPDiagram__RootAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6451:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6452:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6452:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6453:1: RULE_STRING
            {
             before(grammarAccess.getSPDiagramAccess().getRootSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPDiagram__RootAssignment_713082); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6462:1: rule__SPDiagram__ElementsAssignment_8 : ( ruleDiagramElement ) ;
    public final void rule__SPDiagram__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6466:1: ( ( ruleDiagramElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6467:1: ( ruleDiagramElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6467:1: ( ruleDiagramElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6468:1: ruleDiagramElement
            {
             before(grammarAccess.getSPDiagramAccess().getElementsDiagramElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleDiagramElement_in_rule__SPDiagram__ElementsAssignment_813113);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6477:1: rule__Container__CreatableAssignment_0 : ( ( 'creatable' ) ) ;
    public final void rule__Container__CreatableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6481:1: ( ( ( 'creatable' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6482:1: ( ( 'creatable' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6482:1: ( ( 'creatable' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6483:1: ( 'creatable' )
            {
             before(grammarAccess.getContainerAccess().getCreatableCreatableKeyword_0_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6484:1: ( 'creatable' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6485:1: 'creatable'
            {
             before(grammarAccess.getContainerAccess().getCreatableCreatableKeyword_0_0()); 
            match(input,76,FOLLOW_76_in_rule__Container__CreatableAssignment_013149); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6500:1: rule__Container__RecursiveAssignment_1 : ( ( 'recursive' ) ) ;
    public final void rule__Container__RecursiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6504:1: ( ( ( 'recursive' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6505:1: ( ( 'recursive' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6505:1: ( ( 'recursive' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6506:1: ( 'recursive' )
            {
             before(grammarAccess.getContainerAccess().getRecursiveRecursiveKeyword_1_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6507:1: ( 'recursive' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6508:1: 'recursive'
            {
             before(grammarAccess.getContainerAccess().getRecursiveRecursiveKeyword_1_0()); 
            match(input,75,FOLLOW_75_in_rule__Container__RecursiveAssignment_113193); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6523:1: rule__Container__ContainerTypeAssignment_2 : ( ruleContainerType ) ;
    public final void rule__Container__ContainerTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6527:1: ( ( ruleContainerType ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6528:1: ( ruleContainerType )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6528:1: ( ruleContainerType )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6529:1: ruleContainerType
            {
             before(grammarAccess.getContainerAccess().getContainerTypeContainerTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleContainerType_in_rule__Container__ContainerTypeAssignment_213232);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6538:1: rule__Container__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6542:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6543:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6543:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6544:1: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Container__NameAssignment_413263); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6553:1: rule__Container__EClassAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Container__EClassAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6557:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6558:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6558:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6559:1: RULE_STRING
            {
             before(grammarAccess.getContainerAccess().getEClassSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Container__EClassAssignment_613294); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6568:1: rule__Container__ExpressionAssignment_8 : ( ruleSPExpression ) ;
    public final void rule__Container__ExpressionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6572:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6573:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6573:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6574:1: ruleSPExpression
            {
             before(grammarAccess.getContainerAccess().getExpressionSPExpressionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__Container__ExpressionAssignment_813325);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6583:1: rule__Container__StyleAssignment_9 : ( ruleContainerStyleDefinition ) ;
    public final void rule__Container__StyleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6587:1: ( ( ruleContainerStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6588:1: ( ruleContainerStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6588:1: ( ruleContainerStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6589:1: ruleContainerStyleDefinition
            {
             before(grammarAccess.getContainerAccess().getStyleContainerStyleDefinitionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleContainerStyleDefinition_in_rule__Container__StyleAssignment_913356);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6598:1: rule__Container__ElementsAssignment_10_1 : ( ruleDiagramElement ) ;
    public final void rule__Container__ElementsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6602:1: ( ( ruleDiagramElement ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6603:1: ( ruleDiagramElement )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6603:1: ( ruleDiagramElement )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6604:1: ruleDiagramElement
            {
             before(grammarAccess.getContainerAccess().getElementsDiagramElementParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleDiagramElement_in_rule__Container__ElementsAssignment_10_113387);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6613:1: rule__ContainerStyleDefinition__ColorAssignment_1 : ( ruleContainerColorDefinition ) ;
    public final void rule__ContainerStyleDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6617:1: ( ( ruleContainerColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6618:1: ( ruleContainerColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6618:1: ( ruleContainerColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6619:1: ruleContainerColorDefinition
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getColorContainerColorDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleContainerColorDefinition_in_rule__ContainerStyleDefinition__ColorAssignment_113418);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6628:1: rule__ContainerStyleDefinition__LabelAssignment_2_1 : ( ruleLabelStyleDefinition ) ;
    public final void rule__ContainerStyleDefinition__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6632:1: ( ( ruleLabelStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6633:1: ( ruleLabelStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6633:1: ( ruleLabelStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6634:1: ruleLabelStyleDefinition
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleLabelStyleDefinition_in_rule__ContainerStyleDefinition__LabelAssignment_2_113449);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6643:1: rule__ContainerStyleDefinition__BorderAssignment_3_1 : ( ruleBorderStyleDefinition ) ;
    public final void rule__ContainerStyleDefinition__BorderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6647:1: ( ( ruleBorderStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6648:1: ( ruleBorderStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6648:1: ( ruleBorderStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6649:1: ruleBorderStyleDefinition
            {
             before(grammarAccess.getContainerStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleBorderStyleDefinition_in_rule__ContainerStyleDefinition__BorderAssignment_3_113480);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6658:1: rule__Node__CreatableAssignment_0 : ( ( 'creatable' ) ) ;
    public final void rule__Node__CreatableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6662:1: ( ( ( 'creatable' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6663:1: ( ( 'creatable' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6663:1: ( ( 'creatable' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6664:1: ( 'creatable' )
            {
             before(grammarAccess.getNodeAccess().getCreatableCreatableKeyword_0_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6665:1: ( 'creatable' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6666:1: 'creatable'
            {
             before(grammarAccess.getNodeAccess().getCreatableCreatableKeyword_0_0()); 
            match(input,76,FOLLOW_76_in_rule__Node__CreatableAssignment_013516); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6681:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6685:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6686:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6686:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6687:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_213555); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6696:1: rule__Node__EClassAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Node__EClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6700:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6701:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6701:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6702:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getEClassSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__EClassAssignment_413586); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6711:1: rule__Node__ExpressionAssignment_6 : ( ruleSPExpression ) ;
    public final void rule__Node__ExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6715:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6716:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6716:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6717:1: ruleSPExpression
            {
             before(grammarAccess.getNodeAccess().getExpressionSPExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__Node__ExpressionAssignment_613617);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6726:1: rule__Node__StyleAssignment_7 : ( ruleNodeStyleDefinition ) ;
    public final void rule__Node__StyleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6730:1: ( ( ruleNodeStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6731:1: ( ruleNodeStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6731:1: ( ruleNodeStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6732:1: ruleNodeStyleDefinition
            {
             before(grammarAccess.getNodeAccess().getStyleNodeStyleDefinitionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleNodeStyleDefinition_in_rule__Node__StyleAssignment_713648);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6741:1: rule__NodeStyleDefinition__ColorAssignment_1 : ( ruleSolidColorDefinition ) ;
    public final void rule__NodeStyleDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6745:1: ( ( ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6746:1: ( ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6746:1: ( ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6747:1: ruleSolidColorDefinition
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__NodeStyleDefinition__ColorAssignment_113679);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6756:1: rule__NodeStyleDefinition__LabelAssignment_2_1 : ( ruleLabelStyleDefinition ) ;
    public final void rule__NodeStyleDefinition__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6760:1: ( ( ruleLabelStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6761:1: ( ruleLabelStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6761:1: ( ruleLabelStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6762:1: ruleLabelStyleDefinition
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getLabelLabelStyleDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleLabelStyleDefinition_in_rule__NodeStyleDefinition__LabelAssignment_2_113710);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6771:1: rule__NodeStyleDefinition__BorderAssignment_3_1 : ( ruleBorderStyleDefinition ) ;
    public final void rule__NodeStyleDefinition__BorderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6775:1: ( ( ruleBorderStyleDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6776:1: ( ruleBorderStyleDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6776:1: ( ruleBorderStyleDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6777:1: ruleBorderStyleDefinition
            {
             before(grammarAccess.getNodeStyleDefinitionAccess().getBorderBorderStyleDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleBorderStyleDefinition_in_rule__NodeStyleDefinition__BorderAssignment_3_113741);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6786:1: rule__SolidColorDefinition__ColorAssignment_1 : ( ruleColor ) ;
    public final void rule__SolidColorDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6790:1: ( ( ruleColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6791:1: ( ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6791:1: ( ruleColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6792:1: ruleColor
            {
             before(grammarAccess.getSolidColorDefinitionAccess().getColorColorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__SolidColorDefinition__ColorAssignment_113772);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6801:1: rule__GradientColorDefinition__FromAssignment_1 : ( ruleColor ) ;
    public final void rule__GradientColorDefinition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6805:1: ( ( ruleColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6806:1: ( ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6806:1: ( ruleColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6807:1: ruleColor
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getFromColorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__GradientColorDefinition__FromAssignment_113803);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6816:1: rule__GradientColorDefinition__ToAssignment_3 : ( ruleColor ) ;
    public final void rule__GradientColorDefinition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6820:1: ( ( ruleColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6821:1: ( ruleColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6821:1: ( ruleColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6822:1: ruleColor
            {
             before(grammarAccess.getGradientColorDefinitionAccess().getToColorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__GradientColorDefinition__ToAssignment_313834);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6831:1: rule__LabelStyleDefinition__ExpressionAssignment_1 : ( ruleSPExpression ) ;
    public final void rule__LabelStyleDefinition__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6835:1: ( ( ruleSPExpression ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6836:1: ( ruleSPExpression )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6836:1: ( ruleSPExpression )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6837:1: ruleSPExpression
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getExpressionSPExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSPExpression_in_rule__LabelStyleDefinition__ExpressionAssignment_113865);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6846:1: rule__LabelStyleDefinition__ColorAssignment_2 : ( ruleSolidColorDefinition ) ;
    public final void rule__LabelStyleDefinition__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6850:1: ( ( ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6851:1: ( ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6851:1: ( ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6852:1: ruleSolidColorDefinition
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__LabelStyleDefinition__ColorAssignment_213896);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6861:1: rule__LabelStyleDefinition__SizeAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__LabelStyleDefinition__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6865:1: ( ( RULE_INT ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6866:1: ( RULE_INT )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6866:1: ( RULE_INT )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6867:1: RULE_INT
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getSizeINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LabelStyleDefinition__SizeAssignment_3_113927); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6876:1: rule__LabelStyleDefinition__BoldAssignment_4 : ( ( 'bold' ) ) ;
    public final void rule__LabelStyleDefinition__BoldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6880:1: ( ( ( 'bold' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6881:1: ( ( 'bold' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6881:1: ( ( 'bold' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6882:1: ( 'bold' )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6883:1: ( 'bold' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6884:1: 'bold'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getBoldBoldKeyword_4_0()); 
            match(input,77,FOLLOW_77_in_rule__LabelStyleDefinition__BoldAssignment_413963); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6899:1: rule__LabelStyleDefinition__ItalicAssignment_5 : ( ( 'italic' ) ) ;
    public final void rule__LabelStyleDefinition__ItalicAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6903:1: ( ( ( 'italic' ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6904:1: ( ( 'italic' ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6904:1: ( ( 'italic' ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6905:1: ( 'italic' )
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getItalicItalicKeyword_5_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6906:1: ( 'italic' )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6907:1: 'italic'
            {
             before(grammarAccess.getLabelStyleDefinitionAccess().getItalicItalicKeyword_5_0()); 
            match(input,78,FOLLOW_78_in_rule__LabelStyleDefinition__ItalicAssignment_514007); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6922:1: rule__BorderStyleDefinition__ColorAssignment_1 : ( ruleSolidColorDefinition ) ;
    public final void rule__BorderStyleDefinition__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6926:1: ( ( ruleSolidColorDefinition ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6927:1: ( ruleSolidColorDefinition )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6927:1: ( ruleSolidColorDefinition )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6928:1: ruleSolidColorDefinition
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getColorSolidColorDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSolidColorDefinition_in_rule__BorderStyleDefinition__ColorAssignment_114046);
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6937:1: rule__BorderStyleDefinition__SizeAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__BorderStyleDefinition__SizeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6941:1: ( ( RULE_INT ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6942:1: ( RULE_INT )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6942:1: ( RULE_INT )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6943:1: RULE_INT
            {
             before(grammarAccess.getBorderStyleDefinitionAccess().getSizeINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__BorderStyleDefinition__SizeAssignment_2_114077); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6952:1: rule__AcceleoExpression__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AcceleoExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6956:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6957:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6957:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6958:1: RULE_STRING
            {
             before(grammarAccess.getAcceleoExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AcceleoExpression__ValueAssignment_114108); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6967:1: rule__VarRef__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VarRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6971:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6972:1: ( RULE_STRING )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6972:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6973:1: RULE_STRING
            {
             before(grammarAccess.getVarRefAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VarRef__ValueAssignment_114139); 
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
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6982:1: rule__FeatureRef__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__FeatureRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6986:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6987:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6987:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6988:1: RULE_ID
            {
             before(grammarAccess.getFeatureRefAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureRef__ValueAssignment_114170); 
             after(grammarAccess.getFeatureRefAccess().getValueIDTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ServiceRef__ValueAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:6997:1: rule__ServiceRef__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7001:1: ( ( RULE_ID ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7002:1: ( RULE_ID )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7002:1: ( RULE_ID )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7003:1: RULE_ID
            {
             before(grammarAccess.getServiceRefAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceRef__ValueAssignment_114201); 
             after(grammarAccess.getServiceRefAccess().getValueIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRef__ValueAssignment_1"


    // $ANTLR start "rule__MetamodelUsage__UsageAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7012:1: rule__MetamodelUsage__UsageAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__MetamodelUsage__UsageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7016:1: ( ( ( RULE_STRING ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7017:1: ( ( RULE_STRING ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7017:1: ( ( RULE_STRING ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7018:1: ( RULE_STRING )
            {
             before(grammarAccess.getMetamodelUsageAccess().getUsageEPackageCrossReference_1_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7019:1: ( RULE_STRING )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7020:1: RULE_STRING
            {
             before(grammarAccess.getMetamodelUsageAccess().getUsageEPackageSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetamodelUsage__UsageAssignment_114236); 
             after(grammarAccess.getMetamodelUsageAccess().getUsageEPackageSTRINGTerminalRuleCall_1_0_1()); 

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


    // $ANTLR start "rule__JavaServiceClassReference__JavaClassAssignment_1"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7031:1: rule__JavaServiceClassReference__JavaClassAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__JavaServiceClassReference__JavaClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7035:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7036:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7036:1: ( ( ruleQualifiedName ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7037:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getJavaServiceClassReferenceAccess().getJavaClassJvmTypeCrossReference_1_0()); 
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7038:1: ( ruleQualifiedName )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7039:1: ruleQualifiedName
            {
             before(grammarAccess.getJavaServiceClassReferenceAccess().getJavaClassJvmTypeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__JavaServiceClassReference__JavaClassAssignment_114275);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getJavaServiceClassReferenceAccess().getJavaClassJvmTypeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getJavaServiceClassReferenceAccess().getJavaClassJvmTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaServiceClassReference__JavaClassAssignment_1"


    // $ANTLR start "rule__PreDefinedColorDefinition__ColorAssignment"
    // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7050:1: rule__PreDefinedColorDefinition__ColorAssignment : ( rulePreDefinedColor ) ;
    public final void rule__PreDefinedColorDefinition__ColorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7054:1: ( ( rulePreDefinedColor ) )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7055:1: ( rulePreDefinedColor )
            {
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7055:1: ( rulePreDefinedColor )
            // ../fr.obeo.dsl.sprototyper.ui/src-gen/fr/obeo/dsl/ui/contentassist/antlr/internal/InternalSPrototyper.g:7056:1: rulePreDefinedColor
            {
             before(grammarAccess.getPreDefinedColorDefinitionAccess().getColorPreDefinedColorEnumRuleCall_0()); 
            pushFollow(FOLLOW_rulePreDefinedColor_in_rule__PreDefinedColorDefinition__ColorAssignment14310);
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
    public static final BitSet FOLLOW_ruleRequestExpression_in_entryRuleRequestExpression1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestExpression1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestExpression__Alternatives_in_ruleRequestExpression1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestOrCreateExpression_in_entryRuleRequestOrCreateExpression1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestOrCreateExpression1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestOrCreateExpression__Alternatives_in_ruleRequestOrCreateExpression1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_entryRuleAcceleoExpression1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcceleoExpression1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__0_in_ruleAcceleoExpression1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__Group__0_in_ruleVarRef1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_entryRuleFeatureRef1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureRef1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__0_in_ruleFeatureRef1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceRef_in_entryRuleServiceRef1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceRef1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRef__Group__0_in_ruleServiceRef1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelUsage_in_entryRuleMetamodelUsage1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelUsage1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelUsage__Group__0_in_ruleMetamodelUsage1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaServiceClassReference_in_entryRuleJavaServiceClassReference1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaServiceClassReference1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaServiceClassReference__Group__0_in_ruleJavaServiceClassReference1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColorDefinition_in_ruleColor1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColorDefinition_in_entryRulePreDefinedColorDefinition1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreDefinedColorDefinition1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreDefinedColorDefinition__ColorAssignment_in_rulePreDefinedColorDefinition1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreDefinedColor__Alternatives_in_rulePreDefinedColor1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPTable_in_rule__SPRepresentation__Alternatives1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPDiagram_in_rule__SPRepresentation__Alternatives1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_rule__DiagramElement__Alternatives1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__DiagramElement__Alternatives1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ContainerType__Alternatives2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ContainerType__Alternatives2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__ContainerColorDefinition__Alternatives2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGradientColorDefinition_in_rule__ContainerColorDefinition__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestExpression_in_rule__SPExpression__Alternatives2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestOrCreateExpression_in_rule__SPExpression__Alternatives2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_rule__RequestExpression__Alternatives2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureRef_in_rule__RequestExpression__Alternatives2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceleoExpression_in_rule__RequestOrCreateExpression__Alternatives2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceRef_in_rule__RequestOrCreateExpression__Alternatives2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PreDefinedColor__Alternatives2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PreDefinedColor__Alternatives2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PreDefinedColor__Alternatives2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PreDefinedColor__Alternatives2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PreDefinedColor__Alternatives2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PreDefinedColor__Alternatives2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PreDefinedColor__Alternatives2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PreDefinedColor__Alternatives2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PreDefinedColor__Alternatives2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PreDefinedColor__Alternatives2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PreDefinedColor__Alternatives2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PreDefinedColor__Alternatives2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PreDefinedColor__Alternatives2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PreDefinedColor__Alternatives2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PreDefinedColor__Alternatives2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PreDefinedColor__Alternatives2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PreDefinedColor__Alternatives2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PreDefinedColor__Alternatives2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PreDefinedColor__Alternatives2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PreDefinedColor__Alternatives2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PreDefinedColor__Alternatives2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PreDefinedColor__Alternatives2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PreDefinedColor__Alternatives2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PreDefinedColor__Alternatives2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__PreDefinedColor__Alternatives2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__PreDefinedColor__Alternatives2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__0__Impl_in_rule__SPrototyper__Group__02813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__1_in_rule__SPrototyper__Group__02816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SPrototyper__Group__0__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__1__Impl_in_rule__SPrototyper__Group__12875 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__2_in_rule__SPrototyper__Group__12878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__NameAssignment_1_in_rule__SPrototyper__Group__1__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__2__Impl_in_rule__SPrototyper__Group__22935 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__3_in_rule__SPrototyper__Group__22938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPrototyper__Group__2__Impl2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__3__Impl_in_rule__SPrototyper__Group__32997 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__4_in_rule__SPrototyper__Group__33000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__0_in_rule__SPrototyper__Group__3__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__4__Impl_in_rule__SPrototyper__Group__43058 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__5_in_rule__SPrototyper__Group__43061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SPrototyper__Group__4__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__5__Impl_in_rule__SPrototyper__Group__53120 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__6_in_rule__SPrototyper__Group__53123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__TargetURIAssignment_5_in_rule__SPrototyper__Group__5__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__6__Impl_in_rule__SPrototyper__Group__63180 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__7_in_rule__SPrototyper__Group__63183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__ViewpointsAssignment_6_in_rule__SPrototyper__Group__6__Impl3210 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group__7__Impl_in_rule__SPrototyper__Group__73241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SPrototyper__Group__7__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__0__Impl_in_rule__SPrototyper__Group_3__03316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__1_in_rule__SPrototyper__Group_3__03319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SPrototyper__Group_3__0__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__Group_3__1__Impl_in_rule__SPrototyper__Group_3__13378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPrototyper__QualifierAssignment_3_1_in_rule__SPrototyper__Group_3__1__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__0__Impl_in_rule__SPViewpoint__Group__03439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__1_in_rule__SPViewpoint__Group__03442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SPViewpoint__Group__0__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__1__Impl_in_rule__SPViewpoint__Group__13501 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__2_in_rule__SPViewpoint__Group__13504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__NameAssignment_1_in_rule__SPViewpoint__Group__1__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__2__Impl_in_rule__SPViewpoint__Group__23561 = new BitSet(new long[]{0x0100E40000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__3_in_rule__SPViewpoint__Group__23564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPViewpoint__Group__2__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__3__Impl_in_rule__SPViewpoint__Group__33623 = new BitSet(new long[]{0x0100E40000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__4_in_rule__SPViewpoint__Group__33626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__0_in_rule__SPViewpoint__Group__3__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__4__Impl_in_rule__SPViewpoint__Group__43684 = new BitSet(new long[]{0x0100E40000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__5_in_rule__SPViewpoint__Group__43687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__0_in_rule__SPViewpoint__Group__4__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__5__Impl_in_rule__SPViewpoint__Group__53745 = new BitSet(new long[]{0x0100E40000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__6_in_rule__SPViewpoint__Group__53748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__ServiceClassAssignment_5_in_rule__SPViewpoint__Group__5__Impl3775 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__6__Impl_in_rule__SPViewpoint__Group__63806 = new BitSet(new long[]{0x0100E40000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__7_in_rule__SPViewpoint__Group__63809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__RepresentationsAssignment_6_in_rule__SPViewpoint__Group__6__Impl3836 = new BitSet(new long[]{0x0100800000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group__7__Impl_in_rule__SPViewpoint__Group__73867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SPViewpoint__Group__7__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__0__Impl_in_rule__SPViewpoint__Group_3__03942 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__1_in_rule__SPViewpoint__Group_3__03945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SPViewpoint__Group_3__0__Impl3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_3__1__Impl_in_rule__SPViewpoint__Group_3__14004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__ShortcutAssignment_3_1_in_rule__SPViewpoint__Group_3__1__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__0__Impl_in_rule__SPViewpoint__Group_4__04065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__1_in_rule__SPViewpoint__Group_4__04068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SPViewpoint__Group_4__0__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__Group_4__1__Impl_in_rule__SPViewpoint__Group_4__14127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPViewpoint__ExtensionAssignment_4_1_in_rule__SPViewpoint__Group_4__1__Impl4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__0__Impl_in_rule__SPTable__Group__04188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPTable__Group__1_in_rule__SPTable__Group__04191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__SPTable__Group__0__Impl4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__1__Impl_in_rule__SPTable__Group__14250 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__2_in_rule__SPTable__Group__14253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__NameAssignment_1_in_rule__SPTable__Group__1__Impl4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__2__Impl_in_rule__SPTable__Group__24310 = new BitSet(new long[]{0x0006000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SPTable__Group__3_in_rule__SPTable__Group__24313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPTable__Group__2__Impl4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__3__Impl_in_rule__SPTable__Group__34372 = new BitSet(new long[]{0x0006000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SPTable__Group__4_in_rule__SPTable__Group__34375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__0_in_rule__SPTable__Group__3__Impl4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__4__Impl_in_rule__SPTable__Group__44433 = new BitSet(new long[]{0x0006000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SPTable__Group__5_in_rule__SPTable__Group__44436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__0_in_rule__SPTable__Group__4__Impl4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__5__Impl_in_rule__SPTable__Group__54494 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__6_in_rule__SPTable__Group__54497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__UsagesAssignment_5_in_rule__SPTable__Group__5__Impl4526 = new BitSet(new long[]{0x0006000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SPTable__UsagesAssignment_5_in_rule__SPTable__Group__5__Impl4538 = new BitSet(new long[]{0x0006000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SPTable__Group__6__Impl_in_rule__SPTable__Group__64571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPTable__Group__7_in_rule__SPTable__Group__64574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SPTable__Group__6__Impl4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__7__Impl_in_rule__SPTable__Group__74633 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SPTable__Group__8_in_rule__SPTable__Group__74636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__RootAssignment_7_in_rule__SPTable__Group__7__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__8__Impl_in_rule__SPTable__Group__84693 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__9_in_rule__SPTable__Group__84696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4725 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SPTable__ElementsAssignment_8_in_rule__SPTable__Group__8__Impl4737 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SPTable__Group__9__Impl_in_rule__SPTable__Group__94770 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__SPTable__Group__10_in_rule__SPTable__Group__94773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4802 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__PropertiesAssignment_9_in_rule__SPTable__Group__9__Impl4814 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group__10__Impl_in_rule__SPTable__Group__104847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SPTable__Group__10__Impl4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__0__Impl_in_rule__SPTable__Group_3__04928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__1_in_rule__SPTable__Group_3__04931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SPTable__Group_3__0__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_3__1__Impl_in_rule__SPTable__Group_3__14990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__LabelAssignment_3_1_in_rule__SPTable__Group_3__1__Impl5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__0__Impl_in_rule__SPTable__Group_4__05051 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__1_in_rule__SPTable__Group_4__05054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__SPTable__Group_4__0__Impl5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__Group_4__1__Impl_in_rule__SPTable__Group_4__15113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPTable__TitleAssignment_4_1_in_rule__SPTable__Group_4__1__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__0__Impl_in_rule__TableElement__Group__05174 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__TableElement__Group__1_in_rule__TableElement__Group__05177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__RecursiveAssignment_0_in_rule__TableElement__Group__0__Impl5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__1__Impl_in_rule__TableElement__Group__15235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableElement__Group__2_in_rule__TableElement__Group__15238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__TableElement__Group__1__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__2__Impl_in_rule__TableElement__Group__25297 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__TableElement__Group__3_in_rule__TableElement__Group__25300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__EClassAssignment_2_in_rule__TableElement__Group__2__Impl5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__3__Impl_in_rule__TableElement__Group__35357 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__TableElement__Group__4_in_rule__TableElement__Group__35360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__TableElement__Group__3__Impl5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__4__Impl_in_rule__TableElement__Group__45419 = new BitSet(new long[]{0x0000010000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__TableElement__Group__5_in_rule__TableElement__Group__45422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__ExpressionAssignment_4_in_rule__TableElement__Group__4__Impl5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__5__Impl_in_rule__TableElement__Group__55479 = new BitSet(new long[]{0x0000010000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__TableElement__Group__6_in_rule__TableElement__Group__55482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5__0_in_rule__TableElement__Group__5__Impl5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group__6__Impl_in_rule__TableElement__Group__65540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__0_in_rule__TableElement__Group__6__Impl5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5__0__Impl_in_rule__TableElement__Group_5__05612 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5__1_in_rule__TableElement__Group_5__05615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__CreatableAssignment_5_0_in_rule__TableElement__Group_5__0__Impl5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5__1__Impl_in_rule__TableElement__Group_5__15672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5_1__0_in_rule__TableElement__Group_5__1__Impl5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5_1__0__Impl_in_rule__TableElement__Group_5_1__05734 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5_1__1_in_rule__TableElement__Group_5_1__05737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__TableElement__Group_5_1__0__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_5_1__1__Impl_in_rule__TableElement__Group_5_1__15796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__CreateExpressionAssignment_5_1_1_in_rule__TableElement__Group_5_1__1__Impl5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__0__Impl_in_rule__TableElement__Group_6__05857 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__1_in_rule__TableElement__Group_6__05860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TableElement__Group_6__0__Impl5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__1__Impl_in_rule__TableElement__Group_6__15919 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__2_in_rule__TableElement__Group_6__15922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5951 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__TableElement__SubElementsAssignment_6_1_in_rule__TableElement__Group_6__1__Impl5963 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__TableElement__Group_6__2__Impl_in_rule__TableElement__Group_6__25996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TableElement__Group_6__2__Impl6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__0__Impl_in_rule__TableProperty__Group__06061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__1_in_rule__TableProperty__Group__06064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__TableProperty__Group__0__Impl6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__1__Impl_in_rule__TableProperty__Group__16123 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__2_in_rule__TableProperty__Group__16126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__FeatureAssignment_1_in_rule__TableProperty__Group__1__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__2__Impl_in_rule__TableProperty__Group__26183 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__3_in_rule__TableProperty__Group__26186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__0_in_rule__TableProperty__Group__2__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group__3__Impl_in_rule__TableProperty__Group__36244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__0_in_rule__TableProperty__Group__3__Impl6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__0__Impl_in_rule__TableProperty__Group_2__06310 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__1_in_rule__TableProperty__Group_2__06313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TableProperty__Group_2__0__Impl6341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_2__1__Impl_in_rule__TableProperty__Group_2__16372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__LabelAssignment_2_1_in_rule__TableProperty__Group_2__1__Impl6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__0__Impl_in_rule__TableProperty__Group_3__06433 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__1_in_rule__TableProperty__Group_3__06436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__TableProperty__Group_3__0__Impl6464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__Group_3__1__Impl_in_rule__TableProperty__Group_3__16495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableProperty__ExpressionAssignment_3_1_in_rule__TableProperty__Group_3__1__Impl6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__0__Impl_in_rule__SPDiagram__Group__06556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__1_in_rule__SPDiagram__Group__06559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__SPDiagram__Group__0__Impl6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__1__Impl_in_rule__SPDiagram__Group__16618 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__2_in_rule__SPDiagram__Group__16621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__NameAssignment_1_in_rule__SPDiagram__Group__1__Impl6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__2__Impl_in_rule__SPDiagram__Group__26678 = new BitSet(new long[]{0x0006000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__3_in_rule__SPDiagram__Group__26681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SPDiagram__Group__2__Impl6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__3__Impl_in_rule__SPDiagram__Group__36740 = new BitSet(new long[]{0x0006000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__4_in_rule__SPDiagram__Group__36743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__0_in_rule__SPDiagram__Group__3__Impl6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__4__Impl_in_rule__SPDiagram__Group__46801 = new BitSet(new long[]{0x0006000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__5_in_rule__SPDiagram__Group__46804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__0_in_rule__SPDiagram__Group__4__Impl6831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__5__Impl_in_rule__SPDiagram__Group__56862 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__6_in_rule__SPDiagram__Group__56865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6894 = new BitSet(new long[]{0x0006000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SPDiagram__MetamodelsAssignment_5_in_rule__SPDiagram__Group__5__Impl6906 = new BitSet(new long[]{0x0006000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__6__Impl_in_rule__SPDiagram__Group__66939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__7_in_rule__SPDiagram__Group__66942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SPDiagram__Group__6__Impl6970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__7__Impl_in_rule__SPDiagram__Group__77001 = new BitSet(new long[]{0x4200000000001800L,0x0000000000001800L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__8_in_rule__SPDiagram__Group__77004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__RootAssignment_7_in_rule__SPDiagram__Group__7__Impl7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__8__Impl_in_rule__SPDiagram__Group__87061 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__9_in_rule__SPDiagram__Group__87064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl7093 = new BitSet(new long[]{0x4200000000001802L,0x0000000000001800L});
    public static final BitSet FOLLOW_rule__SPDiagram__ElementsAssignment_8_in_rule__SPDiagram__Group__8__Impl7105 = new BitSet(new long[]{0x4200000000001802L,0x0000000000001800L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group__9__Impl_in_rule__SPDiagram__Group__97138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SPDiagram__Group__9__Impl7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__0__Impl_in_rule__SPDiagram__Group_3__07217 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__1_in_rule__SPDiagram__Group_3__07220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SPDiagram__Group_3__0__Impl7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_3__1__Impl_in_rule__SPDiagram__Group_3__17279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__LabelAssignment_3_1_in_rule__SPDiagram__Group_3__1__Impl7306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__0__Impl_in_rule__SPDiagram__Group_4__07340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__1_in_rule__SPDiagram__Group_4__07343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__SPDiagram__Group_4__0__Impl7371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__Group_4__1__Impl_in_rule__SPDiagram__Group_4__17402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPDiagram__TitleAssignment_4_1_in_rule__SPDiagram__Group_4__1__Impl7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__07463 = new BitSet(new long[]{0x0200000000001800L,0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Container__Group__1_in_rule__Container__Group__07466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__CreatableAssignment_0_in_rule__Container__Group__0__Impl7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__17524 = new BitSet(new long[]{0x0200000000001800L,0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Container__Group__2_in_rule__Container__Group__17527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__RecursiveAssignment_1_in_rule__Container__Group__1__Impl7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__27585 = new BitSet(new long[]{0x0200000000001800L,0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Container__Group__3_in_rule__Container__Group__27588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__ContainerTypeAssignment_2_in_rule__Container__Group__2__Impl7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__37646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Container__Group__4_in_rule__Container__Group__37649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Container__Group__3__Impl7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__4__Impl_in_rule__Container__Group__47708 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__5_in_rule__Container__Group__47711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__NameAssignment_4_in_rule__Container__Group__4__Impl7738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__5__Impl_in_rule__Container__Group__57768 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Container__Group__6_in_rule__Container__Group__57771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Container__Group__5__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__6__Impl_in_rule__Container__Group__67830 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__7_in_rule__Container__Group__67833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__EClassAssignment_6_in_rule__Container__Group__6__Impl7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__7__Impl_in_rule__Container__Group__77890 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Container__Group__8_in_rule__Container__Group__77893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Container__Group__7__Impl7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__8__Impl_in_rule__Container__Group__87952 = new BitSet(new long[]{0x0800010000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__9_in_rule__Container__Group__87955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__ExpressionAssignment_8_in_rule__Container__Group__8__Impl7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__9__Impl_in_rule__Container__Group__98012 = new BitSet(new long[]{0x0800010000000000L});
    public static final BitSet FOLLOW_rule__Container__Group__10_in_rule__Container__Group__98015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__StyleAssignment_9_in_rule__Container__Group__9__Impl8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group__10__Impl_in_rule__Container__Group__108073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group_10__0_in_rule__Container__Group__10__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group_10__0__Impl_in_rule__Container__Group_10__08153 = new BitSet(new long[]{0x4200000000001800L,0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Container__Group_10__1_in_rule__Container__Group_10__08156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Container__Group_10__0__Impl8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Group_10__1__Impl_in_rule__Container__Group_10__18215 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Container__Group_10__2_in_rule__Container__Group_10__18218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl8247 = new BitSet(new long[]{0x4200000000001802L,0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Container__ElementsAssignment_10_1_in_rule__Container__Group_10__1__Impl8259 = new BitSet(new long[]{0x4200000000001802L,0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Container__Group_10__2__Impl_in_rule__Container__Group_10__28292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Container__Group_10__2__Impl8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__0__Impl_in_rule__ContainerStyleDefinition__Group__08357 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__1_in_rule__ContainerStyleDefinition__Group__08360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ContainerStyleDefinition__Group__0__Impl8388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__1__Impl_in_rule__ContainerStyleDefinition__Group__18419 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__2_in_rule__ContainerStyleDefinition__Group__18422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__ColorAssignment_1_in_rule__ContainerStyleDefinition__Group__1__Impl8449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__2__Impl_in_rule__ContainerStyleDefinition__Group__28479 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__3_in_rule__ContainerStyleDefinition__Group__28482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__0_in_rule__ContainerStyleDefinition__Group__2__Impl8509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__3__Impl_in_rule__ContainerStyleDefinition__Group__38540 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__4_in_rule__ContainerStyleDefinition__Group__38543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__0_in_rule__ContainerStyleDefinition__Group__3__Impl8570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group__4__Impl_in_rule__ContainerStyleDefinition__Group__48601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__ContainerStyleDefinition__Group__4__Impl8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__0__Impl_in_rule__ContainerStyleDefinition__Group_2__08670 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__1_in_rule__ContainerStyleDefinition__Group_2__08673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__ContainerStyleDefinition__Group_2__0__Impl8701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_2__1__Impl_in_rule__ContainerStyleDefinition__Group_2__18732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__LabelAssignment_2_1_in_rule__ContainerStyleDefinition__Group_2__1__Impl8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__0__Impl_in_rule__ContainerStyleDefinition__Group_3__08793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__1_in_rule__ContainerStyleDefinition__Group_3__08796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__ContainerStyleDefinition__Group_3__0__Impl8824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__Group_3__1__Impl_in_rule__ContainerStyleDefinition__Group_3__18855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerStyleDefinition__BorderAssignment_3_1_in_rule__ContainerStyleDefinition__Group_3__1__Impl8882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__08916 = new BitSet(new long[]{0x4200000000001800L,0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__08919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__CreatableAssignment_0_in_rule__Node__Group__0__Impl8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__18977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__18980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Node__Group__1__Impl9008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__29039 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__29042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl9069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__39099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__4_in_rule__Node__Group__39102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Node__Group__3__Impl9130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__49161 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__5_in_rule__Node__Group__49164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__EClassAssignment_4_in_rule__Node__Group__4__Impl9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__59221 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Node__Group__6_in_rule__Node__Group__59224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Node__Group__5__Impl9252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__69283 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__7_in_rule__Node__Group__69286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ExpressionAssignment_6_in_rule__Node__Group__6__Impl9313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__79343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__StyleAssignment_7_in_rule__Node__Group__7__Impl9370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__0__Impl_in_rule__NodeStyleDefinition__Group__09417 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__1_in_rule__NodeStyleDefinition__Group__09420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__NodeStyleDefinition__Group__0__Impl9448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__1__Impl_in_rule__NodeStyleDefinition__Group__19479 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__2_in_rule__NodeStyleDefinition__Group__19482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__ColorAssignment_1_in_rule__NodeStyleDefinition__Group__1__Impl9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__2__Impl_in_rule__NodeStyleDefinition__Group__29539 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__3_in_rule__NodeStyleDefinition__Group__29542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__0_in_rule__NodeStyleDefinition__Group__2__Impl9569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__3__Impl_in_rule__NodeStyleDefinition__Group__39600 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__4_in_rule__NodeStyleDefinition__Group__39603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__0_in_rule__NodeStyleDefinition__Group__3__Impl9630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group__4__Impl_in_rule__NodeStyleDefinition__Group__49661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__NodeStyleDefinition__Group__4__Impl9689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__0__Impl_in_rule__NodeStyleDefinition__Group_2__09730 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__1_in_rule__NodeStyleDefinition__Group_2__09733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__NodeStyleDefinition__Group_2__0__Impl9761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_2__1__Impl_in_rule__NodeStyleDefinition__Group_2__19792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__LabelAssignment_2_1_in_rule__NodeStyleDefinition__Group_2__1__Impl9819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__0__Impl_in_rule__NodeStyleDefinition__Group_3__09853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__1_in_rule__NodeStyleDefinition__Group_3__09856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__NodeStyleDefinition__Group_3__0__Impl9884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__Group_3__1__Impl_in_rule__NodeStyleDefinition__Group_3__19915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStyleDefinition__BorderAssignment_3_1_in_rule__NodeStyleDefinition__Group_3__1__Impl9942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__Group__0__Impl_in_rule__SolidColorDefinition__Group__09976 = new BitSet(new long[]{0x0000007FFFFFE000L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__Group__1_in_rule__SolidColorDefinition__Group__09979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__SolidColorDefinition__Group__0__Impl10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__Group__1__Impl_in_rule__SolidColorDefinition__Group__110038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SolidColorDefinition__ColorAssignment_1_in_rule__SolidColorDefinition__Group__1__Impl10065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__0__Impl_in_rule__GradientColorDefinition__Group__010099 = new BitSet(new long[]{0x0000007FFFFFE000L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__1_in_rule__GradientColorDefinition__Group__010102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__GradientColorDefinition__Group__0__Impl10130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__1__Impl_in_rule__GradientColorDefinition__Group__110161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__2_in_rule__GradientColorDefinition__Group__110164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__FromAssignment_1_in_rule__GradientColorDefinition__Group__1__Impl10191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__2__Impl_in_rule__GradientColorDefinition__Group__210221 = new BitSet(new long[]{0x0000007FFFFFE000L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__3_in_rule__GradientColorDefinition__Group__210224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__GradientColorDefinition__Group__2__Impl10252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__Group__3__Impl_in_rule__GradientColorDefinition__Group__310283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GradientColorDefinition__ToAssignment_3_in_rule__GradientColorDefinition__Group__3__Impl10310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__0__Impl_in_rule__LabelStyleDefinition__Group__010348 = new BitSet(new long[]{0x8000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__1_in_rule__LabelStyleDefinition__Group__010351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__LabelStyleDefinition__Group__0__Impl10379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__1__Impl_in_rule__LabelStyleDefinition__Group__110410 = new BitSet(new long[]{0x8000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__2_in_rule__LabelStyleDefinition__Group__110413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__ExpressionAssignment_1_in_rule__LabelStyleDefinition__Group__1__Impl10440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__2__Impl_in_rule__LabelStyleDefinition__Group__210471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__3_in_rule__LabelStyleDefinition__Group__210474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__ColorAssignment_2_in_rule__LabelStyleDefinition__Group__2__Impl10501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__3__Impl_in_rule__LabelStyleDefinition__Group__310531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__4_in_rule__LabelStyleDefinition__Group__310534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__0_in_rule__LabelStyleDefinition__Group__3__Impl10561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__4__Impl_in_rule__LabelStyleDefinition__Group__410592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006004L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__5_in_rule__LabelStyleDefinition__Group__410595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__BoldAssignment_4_in_rule__LabelStyleDefinition__Group__4__Impl10622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group__5__Impl_in_rule__LabelStyleDefinition__Group__510653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__ItalicAssignment_5_in_rule__LabelStyleDefinition__Group__5__Impl10680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__0__Impl_in_rule__LabelStyleDefinition__Group_3__010723 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__1_in_rule__LabelStyleDefinition__Group_3__010726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__LabelStyleDefinition__Group_3__0__Impl10754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__Group_3__1__Impl_in_rule__LabelStyleDefinition__Group_3__110785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelStyleDefinition__SizeAssignment_3_1_in_rule__LabelStyleDefinition__Group_3__1__Impl10812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__0__Impl_in_rule__BorderStyleDefinition__Group__010846 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__1_in_rule__BorderStyleDefinition__Group__010849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__BorderStyleDefinition__Group__0__Impl10877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__1__Impl_in_rule__BorderStyleDefinition__Group__110908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__2_in_rule__BorderStyleDefinition__Group__110911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__ColorAssignment_1_in_rule__BorderStyleDefinition__Group__1__Impl10938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group__2__Impl_in_rule__BorderStyleDefinition__Group__210968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__0_in_rule__BorderStyleDefinition__Group__2__Impl10995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__0__Impl_in_rule__BorderStyleDefinition__Group_2__011032 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__1_in_rule__BorderStyleDefinition__Group_2__011035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__BorderStyleDefinition__Group_2__0__Impl11063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__Group_2__1__Impl_in_rule__BorderStyleDefinition__Group_2__111094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderStyleDefinition__SizeAssignment_2_1_in_rule__BorderStyleDefinition__Group_2__1__Impl11121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__0__Impl_in_rule__AcceleoExpression__Group__011155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__1_in_rule__AcceleoExpression__Group__011158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__AcceleoExpression__Group__0__Impl11186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__Group__1__Impl_in_rule__AcceleoExpression__Group__111217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AcceleoExpression__ValueAssignment_1_in_rule__AcceleoExpression__Group__1__Impl11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__Group__0__Impl_in_rule__VarRef__Group__011278 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VarRef__Group__1_in_rule__VarRef__Group__011281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__VarRef__Group__0__Impl11309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__Group__1__Impl_in_rule__VarRef__Group__111340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__ValueAssignment_1_in_rule__VarRef__Group__1__Impl11367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__0__Impl_in_rule__FeatureRef__Group__011401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__1_in_rule__FeatureRef__Group__011404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__FeatureRef__Group__0__Impl11432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__Group__1__Impl_in_rule__FeatureRef__Group__111463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureRef__ValueAssignment_1_in_rule__FeatureRef__Group__1__Impl11490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRef__Group__0__Impl_in_rule__ServiceRef__Group__011524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceRef__Group__1_in_rule__ServiceRef__Group__011527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__ServiceRef__Group__0__Impl11555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRef__Group__1__Impl_in_rule__ServiceRef__Group__111586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRef__ValueAssignment_1_in_rule__ServiceRef__Group__1__Impl11613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelUsage__Group__0__Impl_in_rule__MetamodelUsage__Group__011647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetamodelUsage__Group__1_in_rule__MetamodelUsage__Group__011650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__MetamodelUsage__Group__0__Impl11678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelUsage__Group__1__Impl_in_rule__MetamodelUsage__Group__111709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelUsage__UsageAssignment_1_in_rule__MetamodelUsage__Group__1__Impl11736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaServiceClassReference__Group__0__Impl_in_rule__JavaServiceClassReference__Group__011770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JavaServiceClassReference__Group__1_in_rule__JavaServiceClassReference__Group__011773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__JavaServiceClassReference__Group__0__Impl11801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaServiceClassReference__Group__1__Impl_in_rule__JavaServiceClassReference__Group__111832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaServiceClassReference__JavaClassAssignment_1_in_rule__JavaServiceClassReference__Group__1__Impl11859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__011893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__011896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl11923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__111952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl11979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__012014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__012017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__QualifiedName__Group_1__0__Impl12045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__112076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl12103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPrototyper__NameAssignment_112141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPrototyper__QualifierAssignment_3_112172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPrototyper__TargetURIAssignment_512203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPViewpoint_in_rule__SPrototyper__ViewpointsAssignment_612234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPViewpoint__NameAssignment_112265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPViewpoint__ShortcutAssignment_3_112296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPViewpoint__ExtensionAssignment_4_112327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaServiceClassReference_in_rule__SPViewpoint__ServiceClassAssignment_512358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPRepresentation_in_rule__SPViewpoint__RepresentationsAssignment_612389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPTable__NameAssignment_112420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPTable__LabelAssignment_3_112451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPTable__TitleAssignment_4_112482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelUsage_in_rule__SPTable__UsagesAssignment_512513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPTable__RootAssignment_712548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_rule__SPTable__ElementsAssignment_812583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableProperty_in_rule__SPTable__PropertiesAssignment_912614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__TableElement__RecursiveAssignment_012650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TableElement__EClassAssignment_212693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__TableElement__ExpressionAssignment_412728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__TableElement__CreatableAssignment_5_012764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestOrCreateExpression_in_rule__TableElement__CreateExpressionAssignment_5_1_112803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableElement_in_rule__TableElement__SubElementsAssignment_6_112834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableProperty__FeatureAssignment_112865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TableProperty__LabelAssignment_2_112896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__TableProperty__ExpressionAssignment_3_112927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPDiagram__NameAssignment_112958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPDiagram__LabelAssignment_3_112989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPDiagram__TitleAssignment_4_113020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelUsage_in_rule__SPDiagram__MetamodelsAssignment_513051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPDiagram__RootAssignment_713082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_rule__SPDiagram__ElementsAssignment_813113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__Container__CreatableAssignment_013149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__Container__RecursiveAssignment_113193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerType_in_rule__Container__ContainerTypeAssignment_213232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Container__NameAssignment_413263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Container__EClassAssignment_613294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__Container__ExpressionAssignment_813325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerStyleDefinition_in_rule__Container__StyleAssignment_913356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagramElement_in_rule__Container__ElementsAssignment_10_113387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerColorDefinition_in_rule__ContainerStyleDefinition__ColorAssignment_113418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_rule__ContainerStyleDefinition__LabelAssignment_2_113449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_rule__ContainerStyleDefinition__BorderAssignment_3_113480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__Node__CreatableAssignment_013516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_213555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__EClassAssignment_413586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__Node__ExpressionAssignment_613617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeStyleDefinition_in_rule__Node__StyleAssignment_713648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__NodeStyleDefinition__ColorAssignment_113679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStyleDefinition_in_rule__NodeStyleDefinition__LabelAssignment_2_113710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderStyleDefinition_in_rule__NodeStyleDefinition__BorderAssignment_3_113741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__SolidColorDefinition__ColorAssignment_113772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__GradientColorDefinition__FromAssignment_113803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__GradientColorDefinition__ToAssignment_313834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPExpression_in_rule__LabelStyleDefinition__ExpressionAssignment_113865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__LabelStyleDefinition__ColorAssignment_213896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LabelStyleDefinition__SizeAssignment_3_113927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__LabelStyleDefinition__BoldAssignment_413963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__LabelStyleDefinition__ItalicAssignment_514007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolidColorDefinition_in_rule__BorderStyleDefinition__ColorAssignment_114046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__BorderStyleDefinition__SizeAssignment_2_114077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AcceleoExpression__ValueAssignment_114108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VarRef__ValueAssignment_114139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureRef__ValueAssignment_114170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceRef__ValueAssignment_114201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetamodelUsage__UsageAssignment_114236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__JavaServiceClassReference__JavaClassAssignment_114275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreDefinedColor_in_rule__PreDefinedColorDefinition__ColorAssignment14310 = new BitSet(new long[]{0x0000000000000002L});

}