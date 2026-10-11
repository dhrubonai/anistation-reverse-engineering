package z1;

import android.content.Context;
import android.os.Handler;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import f.m0;
import f.p0;
import f1.v;
import h1.e0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import r6.n1;
import r6.o0;
import r6.r0;

/* loaded from: classes.dex */
public final class g implements c, e0 {

    /* renamed from: n, reason: collision with root package name */
    public static final n1 f11905n = o0.n(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final n1 o = o0.n(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: p, reason: collision with root package name */
    public static final n1 f11906p = o0.n(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: q, reason: collision with root package name */
    public static final n1 f11907q = o0.n(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: r, reason: collision with root package name */
    public static final n1 f11908r = o0.n(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: s, reason: collision with root package name */
    public static final n1 f11909s = o0.n(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: t, reason: collision with root package name */
    public static g f11910t;

    /* renamed from: a, reason: collision with root package name */
    public final r0 f11911a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f11912b = new p0(27, 0);

    /* renamed from: c, reason: collision with root package name */
    public final f1.a f11913c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11914d;

    /* renamed from: e, reason: collision with root package name */
    public final t f11915e;

    /* renamed from: f, reason: collision with root package name */
    public int f11916f;

    /* renamed from: g, reason: collision with root package name */
    public long f11917g;

    /* renamed from: h, reason: collision with root package name */
    public long f11918h;

    /* renamed from: i, reason: collision with root package name */
    public long f11919i;

    /* renamed from: j, reason: collision with root package name */
    public long f11920j;

    /* renamed from: k, reason: collision with root package name */
    public long f11921k;

    /* renamed from: l, reason: collision with root package name */
    public long f11922l;

    /* renamed from: m, reason: collision with root package name */
    public int f11923m;

    public g(Context context, HashMap hashMap, int i10, v vVar, boolean z9) {
        this.f11911a = r0.b(hashMap);
        this.f11915e = new t(i10);
        this.f11913c = vVar;
        this.f11914d = z9;
        if (context != null) {
            f1.r b10 = f1.r.b(context);
            int c6 = b10.c();
            this.f11923m = c6;
            this.f11921k = b(c6);
            e eVar = new e(this);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) b10.f3848c;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(eVar));
            ((Handler) b10.f3847b).post(new m0(4, b10, eVar));
            return;
        }
        this.f11923m = 0;
        this.f11921k = b(0);
    }

    public static int[] a(String str) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c6 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c6 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c6 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c6 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c6 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c6 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c6 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c6 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c6 = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c6 = '\f';
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c6 = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c6 = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c6 = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c6 = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c6 = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c6 = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c6 = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c6 = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c6 = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c6 = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c6 = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c6 = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c6 = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c6 = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c6 = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c6 = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c6 = 29;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c6 = 30;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c6 = 31;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c6 = ' ';
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c6 = '!';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c6 = '\"';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c6 = '#';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c6 = '$';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c6 = '%';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c6 = '&';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c6 = '\'';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c6 = '(';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c6 = ')';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c6 = '*';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c6 = '+';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c6 = ',';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c6 = '-';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c6 = '.';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c6 = '/';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c6 = '0';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c6 = '1';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c6 = '2';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c6 = '3';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c6 = '4';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c6 = '5';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c6 = '6';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c6 = '7';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c6 = '8';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c6 = '9';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c6 = ':';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c6 = ';';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c6 = '<';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c6 = '=';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c6 = '>';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c6 = '?';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c6 = '@';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c6 = 'A';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c6 = 'B';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c6 = 'C';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c6 = 'D';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c6 = 'E';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c6 = 'F';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c6 = 'G';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c6 = 'H';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c6 = 'I';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c6 = 'J';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c6 = 'K';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c6 = 'L';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c6 = 'M';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c6 = 'N';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c6 = 'O';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c6 = 'P';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c6 = 'Q';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c6 = 'R';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c6 = 'S';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c6 = 'T';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c6 = 'U';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c6 = 'V';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c6 = 'W';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c6 = 'X';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c6 = 'Y';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c6 = 'Z';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c6 = '[';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c6 = '\\';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c6 = ']';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c6 = '^';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c6 = '_';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c6 = '`';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c6 = 'a';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c6 = 'b';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c6 = 'c';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c6 = 'd';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c6 = 'e';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c6 = 'f';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c6 = 'g';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c6 = 'h';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c6 = 'i';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c6 = 'j';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c6 = 'k';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c6 = 'l';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c6 = 'm';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c6 = 'n';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c6 = 'o';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c6 = 'p';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c6 = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c6 = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c6 = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c6 = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c6 = 'u';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c6 = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c6 = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c6 = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c6 = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c6 = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c6 = '{';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c6 = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c6 = '}';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c6 = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c6 = 127;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c6 = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c6 = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c6 = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c6 = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c6 = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c6 = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c6 = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c6 = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c6 = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c6 = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c6 = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c6 = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c6 = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c6 = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c6 = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c6 = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c6 = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c6 = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c6 = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c6 = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c6 = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c6 = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c6 = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c6 = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c6 = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c6 = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c6 = 154;
                    break;
                }
                break;
            case 2488:
                if (str.equals("NF")) {
                    c6 = 155;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c6 = 156;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c6 = 157;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c6 = 158;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c6 = 159;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c6 = 160;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c6 = 161;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c6 = 162;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c6 = 163;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c6 = 164;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c6 = 165;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c6 = 166;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c6 = 167;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c6 = 168;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c6 = 169;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c6 = 170;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c6 = 171;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c6 = 172;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c6 = 173;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c6 = 174;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c6 = 175;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c6 = 176;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c6 = 177;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c6 = 178;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c6 = 179;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c6 = 180;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c6 = 181;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c6 = 182;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c6 = 183;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c6 = 184;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c6 = 185;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c6 = 186;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c6 = 187;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c6 = 188;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c6 = 189;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c6 = 190;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c6 = 191;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c6 = 192;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c6 = 193;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c6 = 194;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c6 = 195;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c6 = 196;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c6 = 197;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c6 = 198;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c6 = 199;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c6 = 200;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c6 = 201;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c6 = 202;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c6 = 203;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c6 = 204;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c6 = 205;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c6 = 206;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c6 = 207;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c6 = 208;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c6 = 209;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c6 = 210;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c6 = 211;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c6 = 212;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c6 = 213;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c6 = 214;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c6 = 215;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c6 = 216;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c6 = 217;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c6 = 218;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c6 = 219;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c6 = 220;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c6 = 221;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c6 = 222;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c6 = 223;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c6 = 224;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c6 = 225;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c6 = 226;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c6 = 227;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c6 = 228;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c6 = 229;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c6 = 230;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c6 = 231;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c6 = 232;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c6 = 233;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c6 = 234;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c6 = 235;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c6 = 236;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c6 = 237;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c6 = 238;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 4:
            case 17:
            case 29:
            case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
            case '9':
            case 'q':
            case 't':
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case ')':
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case 165:
                return new int[]{2, 3, 2, 3, 2, 2};
            case zzaja.zze.zzg /* 7 */:
                return new int[]{3, 4, 4, 3, 2, 2};
            case '\b':
            case '?':
            case 162:
            case 186:
            case 190:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 2, 2, 2, 1, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            case '=':
            case ']':
            case 'f':
            case 127:
            case 145:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '\f':
                return new int[]{0, 3, 1, 1, 3, 0};
            case '\r':
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case '3':
            case 'y':
            case 144:
            case 172:
            case 195:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case '7':
            case 128:
            case 194:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 'j':
            case 214:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case 187:
            case 203:
            case 206:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case 175:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 'T':
            case '\\':
            case 154:
            case 226:
            case 234:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case 141:
            case 177:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case ' ':
                return new int[]{3, 1, 2, 2, 3, 2};
            case '!':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '\"':
                return new int[]{1, 2, 3, 3, 2, 2};
            case '#':
            case '*':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '$':
            case 219:
                return new int[]{0, 2, 1, 2, 3, 3};
            case '%':
            case 137:
                return new int[]{3, 3, 2, 2, 2, 2};
            case '&':
                return new int[]{4, 2, 4, 2, 2, 2};
            case '\'':
            case '>':
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case '(':
                return new int[]{0, 1, 0, 0, 0, 2};
            case '+':
            case 208:
                return new int[]{0, 1, 2, 2, 2, 2};
            case ',':
            case 143:
                return new int[]{4, 3, 3, 4, 2, 2};
            case '-':
                return new int[]{2, 0, 1, 1, 3, 1};
            case '.':
                return new int[]{2, 3, 3, 2, 2, 2};
            case '/':
            case 157:
                return new int[]{2, 4, 4, 4, 2, 2};
            case '0':
            case 'o':
            case 161:
            case 210:
                return new int[]{4, 2, 4, 4, 2, 2};
            case '1':
                return new int[]{2, 3, 0, 1, 2, 2};
            case '4':
                return new int[]{1, 0, 1, 0, 0, 2};
            case '5':
                return new int[]{0, 0, 2, 0, 1, 2};
            case '6':
                return new int[]{0, 1, 4, 2, 2, 1};
            case '8':
                return new int[]{0, 0, 2, 0, 0, 2};
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ';':
            case 209:
                return new int[]{3, 3, 4, 4, 2, 2};
            case '<':
                return new int[]{1, 3, 2, 1, 2, 2};
            case '@':
                return new int[]{0, 0, 0, 0, 1, 0};
            case 'A':
                return new int[]{4, 3, 4, 4, 4, 2};
            case 'B':
                return new int[]{0, 0, 0, 1, 0, 2};
            case 'C':
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'D':
            case 155:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'E':
                return new int[]{4, 2, 4, 0, 2, 2};
            case 'F':
                return new int[]{0, 2, 2, 0, 2, 2};
            case 'G':
                return new int[]{1, 1, 1, 1, 0, 2};
            case 'H':
                return new int[]{3, 4, 0, 0, 2, 2};
            case 'I':
                return new int[]{1, 1, 3, 2, 2, 2};
            case 'J':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 'K':
                return new int[]{1, 1, 0, 2, 2, 2};
            case 'L':
                return new int[]{3, 2, 3, 3, 2, 2};
            case 'M':
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'N':
                return new int[]{3, 3, 3, 2, 2, 2};
            case 'O':
            case 'a':
            case 'h':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'P':
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 'Q':
            case 199:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 'R':
                return new int[]{3, 4, 4, 2, 2, 2};
            case 'S':
                return new int[]{2, 1, 1, 3, 2, 2};
            case 'U':
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'V':
                return new int[]{2, 1, 2, 1, 2, 2};
            case 'W':
                return new int[]{2, 2, 4, 3, 3, 2};
            case 'X':
                return new int[]{4, 4, 1, 2, 2, 2};
            case 'Y':
                return new int[]{3, 1, 1, 3, 2, 2};
            case 'Z':
                return new int[]{0, 1, 0, 1, 1, 0};
            case '[':
            case 's':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '^':
                return new int[]{3, 1, 3, 3, 2, 4};
            case '_':
                return new int[]{1, 1, 1, 1, 1, 2};
            case '`':
                return new int[]{1, 2, 2, 3, 4, 2};
            case 'b':
                return new int[]{1, 1, 3, 2, 2, 3};
            case 'c':
                return new int[]{3, 2, 2, 0, 2, 2};
            case 'd':
                return new int[]{3, 2, 3, 2, 2, 2};
            case 'e':
                return new int[]{4, 2, 3, 3, 4, 3};
            case 'g':
                return new int[]{0, 1, 1, 2, 1, 2};
            case 'i':
                return new int[]{2, 4, 3, 1, 2, 2};
            case 'k':
                return new int[]{0, 3, 2, 3, 4, 2};
            case 'l':
                return new int[]{3, 2, 1, 1, 1, 2};
            case 'm':
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'n':
                return new int[]{1, 0, 4, 2, 2, 2};
            case 'p':
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 'r':
                return new int[]{0, 2, 2, 4, 4, 4};
            case 'u':
                return new int[]{2, 1, 2, 2, 3, 2};
            case 'v':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'w':
                return new int[]{3, 1, 1, 2, 2, 2};
            case 'x':
                return new int[]{2, 2, 1, 1, 2, 2};
            case 'z':
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case '|':
            case 168:
                return new int[]{4, 3, 3, 3, 2, 2};
            case '}':
                return new int[]{0, 1, 0, 1, 0, 2};
            case '~':
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 133:
                return new int[]{1, 2, 2, 3, 2, 2};
            case 135:
            case 211:
            case 216:
            case 231:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case 140:
                return new int[]{0, 2, 4, 4, 3, 1};
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 146:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case 148:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 149:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case 151:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 152:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case 235:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 156:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 0, 4};
            case 159:
                return new int[]{0, 0, 3, 0, 0, 2};
            case 160:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 163:
                return new int[]{0, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 2, 4, 2};
            case 166:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 167:
                return new int[]{2, 2, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 1, 2, 3, 2, 1};
            case 170:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 171:
                return new int[]{1, 0, 2, 2, 4, 4};
            case 173:
                return new int[]{2, 0, 2, 1, 2, 0};
            case 174:
                return new int[]{3, 4, 1, 3, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 178:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 179:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case 181:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case 183:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 184:
                return new int[]{3, 1, 1, 2, 2, 0};
            case 185:
            case 238:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 189:
                return new int[]{2, 3, 3, 3, 1, 1};
            case 193:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 197:
                return new int[]{2, 2, 3, 4, 4, 2};
            case 198:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 205:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 207:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 212:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 215:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case 220:
                return new int[]{3, 3, 2, 3, 4, 2};
            case 221:
                return new int[]{2, 2, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 1, 1, 2, 1, 2};
            case 223:
                return new int[]{1, 2, 3, 4, 3, 2};
            case 227:
                return new int[]{2, 2, 1, 1, 2, 4};
            case 228:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 229:
                return new int[]{0, 0, 1, 2, 2, 2};
            case 233:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 236:
                return new int[]{2, 4, 2, 1, 1, 2};
            case 237:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public final long b(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        r0 r0Var = this.f11911a;
        Long l10 = (Long) r0Var.get(valueOf);
        if (l10 == null) {
            l10 = (Long) r0Var.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void c(int i10, long j4, long j10) {
        if (i10 == 0 && j4 == 0 && j10 == this.f11922l) {
            return;
        }
        this.f11922l = j10;
        Iterator it = ((CopyOnWriteArrayList) this.f11912b.f3762b).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!bVar.f11892c) {
                bVar.f11890a.post(new l1.q(bVar, i10, j4, j10, 1));
            }
        }
    }
}
