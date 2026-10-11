package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Log;
import android.view.inputmethod.CursorAnchorInfo;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class kb0 {
    public static final byte[] A;
    public static final byte[] B;
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final os0 g = new os0(-687014789, false, new ps0(12));
    public static final float[] h = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] i = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final Object j = new Object();
    public static final qd k = new qd(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
    public static final qd l;
    public static final qd m;
    public static final np0 n;
    public static final np0 o;
    public static final float p;
    public static final np0 q;
    public static final float r;
    public static final np0 s;
    public static final float t;
    public static final np0 u;
    public static final float v;
    public static final float w;
    public static final np0 x;
    public static final float y;
    public static final float z;

    static {
        new qd(1007);
        l = new qd(1008);
        m = new qd(1002);
        np0 np0Var = np0.E;
        n = np0Var;
        np0 np0Var2 = np0.B;
        o = np0Var2;
        p = 0.38f;
        q = np0Var2;
        r = 0.38f;
        s = np0Var2;
        t = 0.12f;
        u = np0Var;
        v = 44.0f;
        w = 4.0f;
        x = np0.F;
        y = 16.0f;
        z = 4.0f;
        A = new byte[]{0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
        B = new byte[]{0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (r23.f(r13) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.yz3 A(defpackage.yz3 r17, boolean r18, defpackage.u34 r19, defpackage.by2 r20, boolean r21, defpackage.sb2 r22, defpackage.kd2 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb0.A(yz3, boolean, u34, by2, boolean, sb2, kd2, int, int):yz3");
    }

    public static void B(String str, String str2) {
        synchronized (j) {
            Log.i(str, k(str2, null));
        }
    }

    public static final boolean C(o8 o8Var, int i2) {
        int h2 = ((af3) o8Var.c).h();
        if (i2 <= o8Var.c() && h2 <= i2) {
            return true;
        }
        return false;
    }

    public static m04 D(ExecutorService executorService) {
        if (executorService instanceof m04) {
            return (m04) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new p04((ScheduledExecutorService) executorService);
        }
        return new m04(executorService);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long E(java.lang.String r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb0.E(java.lang.String, int, int):long");
    }

    public static final void F(Context context) {
        Vibrator vibrator;
        context.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            systemService.getClass();
            vibrator = sh1.j(systemService).getDefaultVibrator();
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            systemService2.getClass();
            vibrator = (Vibrator) systemService2;
        }
        vibrator.getClass();
        if (!vibrator.hasVibrator()) {
            return;
        }
        vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 30, 40, 30}, new int[]{0, 100, 0, 150}, -1));
    }

    public static yz3 G(yz3 yz3Var, qd qdVar) {
        return yz3Var.w(new qq4(qdVar));
    }

    public static final byte[] H(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        o(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static Executor I(Executor executor, x62 x62Var) {
        executor.getClass();
        if (executor == qg1.x) {
            return executor;
        }
        return new l04(executor, x62Var, (byte) 0);
    }

    public static final sm3 J(x4 x4Var, ub2 ub2Var, kd2 kd2Var) {
        Object g5Var;
        Object obj;
        xt5.h(x4Var, kd2Var);
        Object h2 = xt5.h(ub2Var, kd2Var);
        Object[] objArr = new Object[0];
        Object Q = kd2Var.Q();
        Object obj2 = au0.a;
        if (Q == obj2) {
            Q = new t((byte) 3);
            kd2Var.n0(Q);
        }
        Object obj3 = (String) oi4.B(objArr, (sb2) Q, kd2Var);
        j5 j5Var = (j5) kd2Var.j(sj3.a);
        if (j5Var == null) {
            kd2Var.e0(1213380307);
            Object obj4 = (Context) kd2Var.j(eb.b);
            while (true) {
                if (obj4 instanceof ContextWrapper) {
                    if (obj4 instanceof j5) {
                        break;
                    }
                    obj4 = ((ContextWrapper) obj4).getBaseContext();
                } else {
                    obj4 = null;
                    break;
                }
            }
            j5Var = (j5) obj4;
        } else {
            kd2Var.e0(1213379439);
        }
        kd2Var.q(false);
        if (j5Var != null) {
            Object activityResultRegistry = j5Var.getActivityResultRegistry();
            Object Q2 = kd2Var.Q();
            if (Q2 == obj2) {
                Q2 = new Object();
                kd2Var.n0(Q2);
            }
            a5 a5Var = (a5) Q2;
            Object Q3 = kd2Var.Q();
            if (Q3 == obj2) {
                Q3 = new sm3(a5Var);
                kd2Var.n0(Q3);
            }
            sm3 sm3Var = (sm3) Q3;
            boolean h3 = kd2Var.h(a5Var) | kd2Var.h(activityResultRegistry) | kd2Var.f(obj3) | kd2Var.h(x4Var) | kd2Var.f(h2);
            Object Q4 = kd2Var.Q();
            if (!h3 && Q4 != obj2) {
                g5Var = Q4;
                obj = x4Var;
            } else {
                obj = x4Var;
                g5Var = new g5(a5Var, activityResultRegistry, obj3, obj, h2, (byte) 0);
                kd2Var.n0(g5Var);
            }
            ub2 ub2Var2 = (ub2) g5Var;
            boolean f2 = kd2Var.f(activityResultRegistry) | kd2Var.f(obj3) | kd2Var.f(obj);
            Object Q5 = kd2Var.Q();
            if (f2 || Q5 == obj2) {
                Q5 = new ai1(ub2Var2);
                kd2Var.n0(Q5);
            }
            return sm3Var;
        }
        ze0.m("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        return null;
    }

    public static q03 K(int i2, c12 c12Var, zi4 zi4Var) {
        q03 b2 = q03.b(c12Var, zi4Var);
        while (true) {
            int i3 = b2.x;
            if (i3 != i2) {
                h11.r(i3, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j2 = b2.y;
                long j3 = 8 + j2;
                if (j2 % 2 != 0) {
                    j3 = 9 + j2;
                }
                if (j3 <= 2147483647L) {
                    c12Var.v((int) j3);
                    b2 = q03.b(c12Var, zi4Var);
                } else {
                    throw bj4.d("Chunk is too large (~2GB+) to skip; id: " + i3);
                }
            } else {
                return b2;
            }
        }
    }

    public static ArrayList L(Collection collection, qc2 qc2Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) qc2Var.apply(it.next()));
        }
        return arrayList;
    }

    public static final CharSequence M(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION))) {
            return uz5.t0(charSequence, 4999);
        }
        return uz5.t0(charSequence, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION);
    }

    public static final int N(int i2) {
        int i3 = 306783378 & i2;
        int i4 = 613566756 & i2;
        return (i2 & (-920350135)) | (i4 >> 1) | i3 | ((i3 << 1) & i4);
    }

    public static void O(String str, String str2) {
        synchronized (j) {
            Log.w(str, k(str2, null));
        }
    }

    public static void P(String str, String str2, Throwable th) {
        synchronized (j) {
            Log.w(str, k(str2, th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final float r17, final defpackage.ub2 r18, defpackage.yz3 r19, boolean r20, final defpackage.do0 r21, int r22, defpackage.sb2 r23, defpackage.u34 r24, defpackage.kd2 r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb0.a(float, ub2, yz3, boolean, do0, int, sb2, u34, kd2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.mw4 r11, defpackage.ic2 r12, defpackage.kd2 r13, int r14) {
        /*
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.f0(r0)
            l13 r0 = r13.x
            al4 r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            se4 r3 = defpackage.eu0.b
            r13.b0(r2, r3)
            java.lang.Object r2 = r13.Q()
            q18 r3 = defpackage.au0.a
            boolean r3 = defpackage.a34.i(r2, r3)
            r4 = 0
            if (r3 == 0) goto L22
            r2 = r4
            goto L27
        L22:
            r2.getClass()
            wq6 r2 = (defpackage.wq6) r2
        L27:
            jw4 r3 = r11.a
            wq6 r5 = r3.d(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L36
            r13.n0(r5)
        L36:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L4e
            boolean r2 = r11.g
            if (r2 != 0) goto L46
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4a
        L46:
            al4 r1 = r1.d(r3, r5)
        L4a:
            r13.J = r7
        L4c:
            r2 = r8
            goto L89
        L4e:
            xr5 r6 = r13.G
            int r9 = r6.g
            int[] r10 = r6.b
            java.lang.Object r6 = r6.b(r10, r9)
            r6.getClass()
            al4 r6 = (defpackage.al4) r6
            boolean r9 = r13.F()
            if (r9 == 0) goto L65
            if (r2 != 0) goto L70
        L65:
            boolean r9 = r11.g
            if (r9 != 0) goto L7e
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L70
            goto L7e
        L70:
            if (r2 == 0) goto L77
            boolean r2 = r13.w
            if (r2 != 0) goto L77
            goto L7c
        L77:
            boolean r2 = r13.w
            if (r2 == 0) goto L7c
            goto L82
        L7c:
            r1 = r6
            goto L82
        L7e:
            al4 r1 = r1.d(r3, r5)
        L82:
            boolean r2 = r13.y
            if (r2 != 0) goto L88
            if (r6 == r1) goto L4c
        L88:
            r2 = r7
        L89:
            if (r2 == 0) goto L92
            boolean r3 = r13.S
            if (r3 != 0) goto L92
            r13.O(r1)
        L92:
            boolean r3 = r13.w
            r0.e(r3)
            r13.w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            se4 r3 = defpackage.eu0.c
            r13.Z(r2, r8, r3, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r13, r1)
            r13.q(r8)
            r13.q(r8)
            int r0 = r0.d()
            if (r0 == 0) goto Lba
            goto Lbb
        Lba:
            r7 = r8
        Lbb:
            r13.w = r7
            r13.K = r4
            zz4 r13 = r13.u()
            if (r13 == 0) goto Lcd
            mo r0 = new mo
            r1 = 2
            r0.<init>(r1, r14, r11, r12)
            r13.d = r0
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb0.b(mw4, ic2, kd2, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v4, types: [zk4, dl4] */
    /* JADX WARN: Type inference failed for: r7v6, types: [zk4, dl4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.mw4[] r10, defpackage.ic2 r11, defpackage.kd2 r12, int r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb0.c(mw4[], ic2, kd2, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0146, code lost:
    
        if (r8.equals(r15) == false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final com.anistation.model.Episode r26, defpackage.yz3 r27, java.lang.String r28, java.lang.Integer r29, final java.lang.Long r30, final java.lang.Long r31, java.lang.String r32, boolean r33, defpackage.sb2 r34, defpackage.kd2 r35, int r36) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb0.d(com.anistation.model.Episode, yz3, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, boolean, sb2, kd2, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.yz3 r20, float r21, long r22, defpackage.kd2 r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb0.e(yz3, float, long, kd2, int, int):void");
    }

    public static d22 f(qj4 qj4Var, n22 n22Var, String str, fz4 fz4Var, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            fz4Var = null;
        }
        return new d22(qj4Var, n22Var, str, fz4Var);
    }

    public static fv5 g(db0 db0Var, n22 n22Var) {
        return new fv5(db0Var, n22Var, null);
    }

    public static final void h(CursorAnchorInfo.Builder builder, bd6 bd6Var, n05 n05Var) {
        if (!n05Var.h()) {
            o24 o24Var = bd6Var.b;
            int i2 = o24Var.f - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            int C = db.C(o24Var.e(n05Var.b), 0, i2);
            int C2 = db.C(o24Var.e(n05Var.d), 0, i2);
            if (C > C2) {
                return;
            }
            while (true) {
                m9.p(builder, bd6Var.f(C), o24Var.f(C), bd6Var.g(C), o24Var.b(C));
                if (C != C2) {
                    C++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0067  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, u05] */
    /* JADX WARN: Type inference failed for: r20v1, types: [t05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ee3] */
    /* JADX WARN: Type inference failed for: r5v2, types: [r05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0180 -> B:21:0x018b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.o8 r28, int r29, int r30, int r31, defpackage.ud1 r32, defpackage.xz0 r33) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb0.i(o8, int, int, int, ud1, xz0):java.lang.Object");
    }

    public static final boolean j(boolean z2, o8 o8Var, int i2, int i3) {
        af3 af3Var = (af3) o8Var.c;
        if (z2) {
            if (af3Var.h() <= i2) {
                if (af3Var.h() == i2 && af3Var.i() > i3) {
                    return true;
                }
                return false;
            }
            return true;
        }
        if (af3Var.h() >= i2) {
            if (af3Var.h() == i2 && af3Var.i() < i3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static String k(String str, Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (j) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        try {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } finally {
                        }
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(wc0 wc0Var, k97 k97Var) {
        nc0 nc0Var;
        Unsafe unsafe;
        long j2;
        wc0 wc0Var2 = k97Var.a;
        Throwable th = null;
        if (wc0Var2 instanceof nc0) {
            nc0Var = (nc0) wc0Var2;
        } else {
            nc0Var = null;
        }
        if (nc0Var != null) {
            l0 l0Var = new l0(wc0Var, (byte) 21);
            zn0 zn0Var = (zn0) nc0Var._closedCause;
            if (zn0Var != null) {
                Throwable th2 = zn0Var.a;
                if (th2 != 0) {
                    if (th2 instanceof m01) {
                        th = ((m01) th2).a();
                    } else if (th2 instanceof CancellationException) {
                        th = z51.b(((CancellationException) th2).getMessage(), zn0Var.a);
                    } else {
                        th = new co0(th2);
                    }
                }
                l0Var.invoke(th);
                return;
            }
            while (true) {
                Unsafe unsafe2 = qs.a;
                long j3 = nc0.h;
                l0 l0Var2 = l0Var;
                if (unsafe2.compareAndSwapObject(nc0Var, j3, (Object) null, l0Var2)) {
                    zn0 zn0Var2 = (zn0) nc0Var._closedCause;
                    if (zn0Var2 == null) {
                        return;
                    }
                    do {
                        unsafe = qs.a;
                        j2 = nc0.h;
                        l0 l0Var3 = l0Var2;
                        l0Var2 = l0Var3;
                        if (unsafe.compareAndSwapObject(nc0Var, j2, l0Var3, (Object) null)) {
                            Throwable th3 = zn0Var2.a;
                            if (th3 != 0) {
                                if (th3 instanceof m01) {
                                    th = ((m01) th3).a();
                                } else if (th3 instanceof CancellationException) {
                                    th = z51.b(((CancellationException) th3).getMessage(), zn0Var2.a);
                                } else {
                                    th = new co0(th3);
                                }
                            }
                            l0Var2.invoke(th);
                            return;
                        }
                    } while (unsafe.getObjectVolatile(nc0Var, j2) == l0Var2);
                    return;
                }
                if (unsafe2.getObjectVolatile(nc0Var, j3) == null) {
                    l0Var = l0Var2;
                } else {
                    ze0.m("Only one invokeOnClose handler is supported per channel");
                    return;
                }
            }
        }
    }

    public static boolean m(c12 c12Var) {
        zi4 zi4Var = new zi4(8);
        int i2 = q03.b(c12Var, zi4Var).x;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        c12Var.A(zi4Var.a, 0, 4);
        zi4Var.N(0);
        int m2 = zi4Var.m();
        if (m2 != 1463899717) {
            s("WavHeaderReader", "Unsupported form type: " + m2);
            return false;
        }
        return true;
    }

    public static final int n(m85 m85Var, String str) {
        m85Var.getClass();
        int columnCount = m85Var.getColumnCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < columnCount) {
                if (str.equals(m85Var.getColumnName(i3))) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            return i3;
        }
        String g2 = qx1.g('`', "`", str);
        int columnCount2 = m85Var.getColumnCount();
        while (true) {
            if (i2 < columnCount2) {
                if (g2.equals(m85Var.getColumnName(i2))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return -1;
        }
        return i2;
    }

    public static void o(InputStream inputStream, OutputStream outputStream) {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static vv6 p(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    newInstance.getClass();
                    return (vv6) newInstance;
                } catch (IllegalAccessException e2) {
                    qi2.l("Cannot create an instance of ", cls, e2);
                    return null;
                } catch (InstantiationException e3) {
                    qi2.l("Cannot create an instance of ", cls, e3);
                    return null;
                }
            }
            throw new RuntimeException("Cannot create an instance of " + cls);
        } catch (NoSuchMethodException e4) {
            qi2.l("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static void q(String str, String str2) {
        synchronized (j) {
            Log.d(str, k(str2, null));
        }
    }

    public static void r(String str, String str2, Exception exc) {
        synchronized (j) {
            Log.d(str, k(str2, exc));
        }
    }

    public static void s(String str, String str2) {
        synchronized (j) {
            Log.e(str, k(str2, null));
        }
    }

    public static void t(String str, String str2, Throwable th) {
        synchronized (j) {
            Log.e(str, k(str2, th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(defpackage.x42 r4, java.lang.Object r5, java.lang.Object r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.r52
            if (r0 == 0) goto L13
            r0 = r7
            r52 r0 = (defpackage.r52) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            r52 r0 = new r52
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return
        L27:
            java.lang.Object r6 = r0.x
            defpackage.m37.N(r7)
            goto L3d
        L2d:
            defpackage.m37.N(r7)
            r0.x = r6
            r0.z = r2
            java.lang.Object r4 = r4.emit(r5, r0)
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L3d
            return
        L3d:
            f r4 = new f
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb0.u(x42, java.lang.Object, java.lang.Object, xz0):void");
    }

    public static final byte[] v(CharsetEncoder charsetEncoder, CharSequence charSequence, int i2, int i3) {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (charSequence instanceof String) {
            if (i2 == 0) {
                String str = (String) charSequence;
                if (i3 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    bytes.getClass();
                    return bytes;
                }
            }
            byte[] bytes2 = ((String) charSequence).substring(i2, i3).getBytes(charsetEncoder.charset());
            bytes2.getClass();
            return bytes2;
        }
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i2, i3));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr == null) {
            byte[] bArr2 = new byte[encode.remaining()];
            encode.get(bArr2);
            return bArr2;
        }
        return bArr;
    }

    public static o15 w(qc2 qc2Var, ArrayList arrayList) {
        jw2 k2 = nw2.k();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Bundle bundle = (Bundle) arrayList.get(i2);
            bundle.getClass();
            k2.c(qc2Var.apply(bundle));
        }
        return k2.g();
    }

    public static int x(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 >= 0 && i2 < 3 && i3 >= 0 && i4 < 19) {
            int i5 = b[i2];
            if (i5 == 44100) {
                return ((i3 % 2) + f[i4]) * 2;
            }
            int i6 = e[i4];
            if (i5 == 32000) {
                return i6 * 6;
            }
            return i6 * 4;
        }
        return -1;
    }

    public static final u98 y(bd6 bd6Var, int i2, int i3, int i4, long j2, boolean z2, boolean z3) {
        yg5 yg5Var;
        if (z2) {
            yg5Var = null;
        } else {
            int i5 = nd6.c;
            int i6 = (int) (j2 >> 32);
            int i7 = (int) (4294967295L & j2);
            yg5Var = new yg5(new xg5(t80.W(bd6Var, i6), i6, 1L), new xg5(t80.W(bd6Var, i7), i7, 1L), nd6.h(j2));
        }
        return new u98((byte) 5, yg5Var, new fm0(i2, i3, i4, bd6Var), z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        if (r23.f(r22) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.yz3 z(defpackage.yz3 r19, boolean r20, defpackage.sb2 r21, defpackage.sb2 r22, defpackage.kd2 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb0.z(yz3, boolean, sb2, sb2, kd2, int, int):yz3");
    }
}
