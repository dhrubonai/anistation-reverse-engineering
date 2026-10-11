package w2;

import d2.b0;
import d2.h0;
import f1.t;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements d2.p, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final y2.k f10861a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10862b;

    /* renamed from: c, reason: collision with root package name */
    public final t f10863c;

    /* renamed from: d, reason: collision with root package name */
    public final t f10864d;

    /* renamed from: e, reason: collision with root package name */
    public final t f10865e;

    /* renamed from: f, reason: collision with root package name */
    public final t f10866f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f10867g;

    /* renamed from: h, reason: collision with root package name */
    public final o f10868h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f10869i;

    /* renamed from: j, reason: collision with root package name */
    public int f10870j;

    /* renamed from: k, reason: collision with root package name */
    public int f10871k;

    /* renamed from: l, reason: collision with root package name */
    public long f10872l;

    /* renamed from: m, reason: collision with root package name */
    public int f10873m;

    /* renamed from: n, reason: collision with root package name */
    public t f10874n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f10875p;

    /* renamed from: q, reason: collision with root package name */
    public int f10876q;

    /* renamed from: r, reason: collision with root package name */
    public int f10877r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10878s;

    /* renamed from: t, reason: collision with root package name */
    public d2.r f10879t;

    /* renamed from: u, reason: collision with root package name */
    public l[] f10880u;

    /* renamed from: v, reason: collision with root package name */
    public long[][] f10881v;

    /* renamed from: w, reason: collision with root package name */
    public int f10882w;

    /* renamed from: x, reason: collision with root package name */
    public long f10883x;

    /* renamed from: y, reason: collision with root package name */
    public int f10884y;

    /* renamed from: z, reason: collision with root package name */
    public r2.a f10885z;

    public m(int i10, w1.o oVar) {
        int i11;
        this.f10861a = oVar;
        this.f10862b = i10;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f10870j = i11;
        this.f10868h = new o();
        this.f10869i = new ArrayList();
        this.f10866f = new t(16);
        this.f10867g = new ArrayDeque();
        this.f10863c = new t(g1.g.f4335a);
        this.f10864d = new t(4);
        this.f10865e = new t();
        this.o = -1;
        this.f10879t = d2.r.f3190j;
        this.f10880u = new l[0];
    }

    @Override // d2.p
    public final void a() {
    }

    @Override // d2.p
    public final d2.p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        this.f10867g.clear();
        this.f10873m = 0;
        this.o = -1;
        this.f10875p = 0;
        this.f10876q = 0;
        this.f10877r = 0;
        if (j4 == 0) {
            if (this.f10870j != 3) {
                this.f10870j = 0;
                this.f10873m = 0;
                return;
            } else {
                o oVar = this.f10868h;
                oVar.f10890a.clear();
                oVar.f10891b = 0;
                this.f10869i.clear();
                return;
            }
        }
        for (l lVar : this.f10880u) {
            s sVar = lVar.f10857b;
            int f10 = f1.b0.f(sVar.f10930f, j10, false);
            while (true) {
                if (f10 >= 0) {
                    if ((sVar.f10931g[f10] & 1) != 0) {
                        break;
                    } else {
                        f10--;
                    }
                } else {
                    f10 = -1;
                    break;
                }
            }
            if (f10 == -1) {
                f10 = sVar.a(j10);
            }
            lVar.f10860e = f10;
            h0 h0Var = lVar.f10859d;
            if (h0Var != null) {
                h0Var.f3146b = false;
                h0Var.f3147c = 0;
            }
        }
    }

    @Override // d2.p
    public final void f(d2.r rVar) {
        if ((this.f10862b & 16) == 0) {
            rVar = new y2.n(rVar, this.f10861a);
        }
        this.f10879t = rVar;
    }

    @Override // d2.b0
    public final boolean g() {
        return true;
    }

    @Override // d2.p
    public final boolean h(d2.q qVar) {
        boolean z9;
        if ((this.f10862b & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        return com.bumptech.glide.d.d0(qVar, false, z9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:196:0x0073. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:163:0x047e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x067e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0006 A[SYNTHETIC] */
    @Override // d2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(d2.q r37, d2.t r38) {
        /*
            Method dump skipped, instructions count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.m.i(d2.q, d2.t):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8 A[EDGE_INSN: B:64:0x00d8->B:65:0x00d8 BREAK  A[LOOP:1: B:28:0x006e->B:56:0x00d3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    @Override // d2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d2.a0 j(long r17) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.m.j(long):d2.a0");
    }

    @Override // d2.b0
    public final long l() {
        return this.f10883x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b3, code lost:
    
        if (r8 != 757935405) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b5, code lost:
    
        r8 = -1;
        r7 = -1;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ba, code lost:
    
        r9 = r5.f3859b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bc, code lost:
    
        if (r9 >= r11) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01be, code lost:
    
        r15 = r5.f();
        r9 = r5.f();
        r20 = r10;
        r5.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d1, code lost:
    
        if (r9 != 1835360622) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d3, code lost:
    
        r0 = r5.q(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f3, code lost:
    
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01dd, code lost:
    
        if (r9 != 1851878757) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01df, code lost:
    
        r2 = r5.q(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e9, code lost:
    
        if (r9 != 1684108385) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01eb, code lost:
    
        r8 = r15;
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ee, code lost:
    
        r5.H(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f6, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f8, code lost:
    
        if (r0 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01fa, code lost:
    
        if (r2 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01fd, code lost:
    
        if (r7 != (-1)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0201, code lost:
    
        r5.G(r7);
        r5.H(16);
        r2 = new q2.l(r0, r2, r5.q(r8 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ad, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0217, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x029a, code lost:
    
        f1.o.b("MetadataUtil", "Skipped unknown metadata entry: " + i1.a.f(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c9, code lost:
    
        r7 = com.bumptech.glide.c.Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00cd, code lost:
    
        if (r7 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00d1, code lost:
    
        if (r7 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00d3, code lost:
    
        r7 = com.bumptech.glide.c.B[r7 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00db, code lost:
    
        if (r7 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00dd, code lost:
    
        r2 = new q2.o("TCON", null, r6.o0.o(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00e8, code lost:
    
        f1.o.f("MetadataUtil", "Failed to parse standard genre code");
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00da, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x022c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ce, code lost:
    
        r5.G(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x021b, code lost:
    
        r20 = r10;
        r7 = 16777215 & r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0224, code lost:
    
        if (r7 != 6516084) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0226, code lost:
    
        r2 = com.bumptech.glide.c.R(r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0232, code lost:
    
        if (r7 == 7233901) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0237, code lost:
    
        if (r7 != 7631467) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x023e, code lost:
    
        if (r7 == 6516589) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0243, code lost:
    
        if (r7 != 7828084) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x024a, code lost:
    
        if (r7 != 6578553) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x024c, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0257, code lost:
    
        if (r7 != 4280916) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0259, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0263, code lost:
    
        if (r7 != 7630703) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0265, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x026f, code lost:
    
        if (r7 != 6384738) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0271, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x027b, code lost:
    
        if (r7 != 7108978) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x027d, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0287, code lost:
    
        if (r7 != 6776174) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0289, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0291, code lost:
    
        if (r7 != 6779504) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0293, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02af, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02b6, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02d2, code lost:
    
        r17 = r0;
        r18 = r2;
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02dc, code lost:
    
        if (r6.isEmpty() == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02df, code lost:
    
        r0 = new c1.p0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r5.G(r7);
        r7 = r7 + r9;
        r5.H(r11);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        r8 = r5.f3859b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        if (r8 >= r7) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        r11 = r5.f() + r8;
        r8 = r5.f();
        r15 = (r8 >> 24) & 255;
        r16 = r7;
        r17 = r0;
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        if (r15 == 169) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        if (r15 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        if (r8 != 1735291493) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
    
        if (r8 != 1684632427) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f7, code lost:
    
        r2 = com.bumptech.glide.c.T(r8, r5, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02bf, code lost:
    
        if (r2 == null) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02c1, code lost:
    
        r6.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02c4, code lost:
    
        r7 = r16;
        r0 = r17;
        r2 = r18;
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0104, code lost:
    
        if (r8 != 1953655662) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
    
        r2 = com.bumptech.glide.c.T(r8, r5, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0110, code lost:
    
        if (r8 != 1953329263) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0112, code lost:
    
        r0 = com.bumptech.glide.c.X(r8, "TBPM", r5, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0127, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011e, code lost:
    
        if (r8 != 1668311404) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0120, code lost:
    
        r0 = com.bumptech.glide.c.X(r8, "TCMP", r5, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012c, code lost:
    
        if (r8 != 1668249202) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
    
        r2 = com.bumptech.glide.c.S(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0136, code lost:
    
        if (r8 != 1631670868) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0138, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0142, code lost:
    
        if (r8 != 1936682605) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0144, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        if (r8 != 1936679276) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0150, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015a, code lost:
    
        if (r8 != 1936679282) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015c, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        if (r8 != 1936679265) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0168, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0172, code lost:
    
        if (r8 != 1936679791) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0174, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017e, code lost:
    
        if (r8 != 1920233063) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0180, code lost:
    
        r0 = com.bumptech.glide.c.X(r8, "ITUNESADVISORY", r5, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018b, code lost:
    
        if (r8 != 1885823344) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018d, code lost:
    
        r0 = com.bumptech.glide.c.X(r8, "ITUNESGAPLESS", r5, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0199, code lost:
    
        if (r8 != 1936683886) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019b, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a6, code lost:
    
        if (r8 != 1953919848) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a8, code lost:
    
        r2 = com.bumptech.glide.c.W(r8, r5, "TVSHOW");
     */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0696 A[EDGE_INSN: B:372:0x0696->B:373:0x0696 BREAK  A[LOOP:10: B:293:0x0547->B:299:0x067e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06b7 A[LOOP:13: B:374:0x06b4->B:376:0x06b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0526  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(long r28) {
        /*
            Method dump skipped, instructions count: 1860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.m.m(long):void");
    }
}
