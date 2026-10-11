package defpackage;

import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nt7 extends j18 implements vj7 {
    public final js A;
    public final js B;
    public final js C;
    public final js D;
    public final js E;
    public final js F;
    public final js G;
    public final nw0 H;
    public final fq3 I;
    public final js J;
    public final js K;
    public final js L;

    /* JADX WARN: Type inference failed for: r2v1, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r2v10, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r2v2, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r2v3, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r2v4, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r2v5, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r2v6, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r2v7, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r2v8, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r2v9, types: [so5, js] */
    public nt7(z18 z18Var) {
        super(z18Var);
        this.A = new so5(0);
        this.B = new so5(0);
        this.C = new so5(0);
        this.D = new so5(0);
        this.E = new so5(0);
        this.F = new so5(0);
        this.J = new so5(0);
        this.K = new so5(0);
        this.L = new so5(0);
        this.G = new so5(0);
        this.H = new nw0(this);
        this.I = new fq3(this, (byte) 28);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [so5, js] */
    public static final js V(tr7 tr7Var) {
        ?? so5Var = new so5(0);
        for (ds7 ds7Var : tr7Var.v()) {
            so5Var.put(ds7Var.r(), ds7Var.s());
        }
        return so5Var;
    }

    public static final wv7 W(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                    return wv7.AD_PERSONALIZATION;
                }
                return wv7.AD_USER_DATA;
            }
            return wv7.ANALYTICS_STORAGE;
        }
        return wv7.AD_STORAGE;
    }

    public final tv7 P(String str, wv7 wv7Var) {
        L();
        R(str);
        hr7 h0 = h0(str);
        if (h0 != null) {
            Iterator it = h0.w().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                oq7 oq7Var = (oq7) it.next();
                if (W(oq7Var.r()) == wv7Var) {
                    int s = oq7Var.s() - 1;
                    if (s != 1) {
                        if (s == 2) {
                            return tv7.DENIED;
                        }
                    } else {
                        return tv7.GRANTED;
                    }
                }
            }
        }
        return tv7.UNINITIALIZED;
    }

    public final boolean Q(String str) {
        L();
        R(str);
        hr7 h0 = h0(str);
        if (h0 == null) {
            return false;
        }
        for (oq7 oq7Var : h0.r()) {
            if (oq7Var.r() == 3 && oq7Var.t() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void R(String str) {
        M();
        L();
        a34.u(str);
        js jsVar = this.F;
        if (jsVar.get(str) == null) {
            fl7 fl7Var = this.y.z;
            z18.T(fl7Var);
            l87 T0 = fl7Var.T0(str);
            js jsVar2 = this.L;
            js jsVar3 = this.K;
            js jsVar4 = this.J;
            js jsVar5 = this.A;
            if (T0 == null) {
                jsVar5.put(str, null);
                this.C.put(str, null);
                this.B.put(str, null);
                this.D.put(str, null);
                this.E.put(str, null);
                jsVar.put(str, null);
                jsVar4.put(str, null);
                jsVar3.put(str, null);
                jsVar2.put(str, null);
                this.G.put(str, null);
                return;
            }
            rr7 rr7Var = (rr7) U(str, (byte[]) T0.y).i();
            S(str, rr7Var);
            jsVar5.put(str, V((tr7) rr7Var.e()));
            jsVar.put(str, (tr7) rr7Var.e());
            T(str, (tr7) rr7Var.e());
            jsVar4.put(str, ((tr7) rr7Var.y).C());
            jsVar3.put(str, (String) T0.z);
            jsVar2.put(str, (String) T0.A);
        }
    }

    public final void S(String str, rr7 rr7Var) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        so5 so5Var = new so5(0);
        so5 so5Var2 = new so5(0);
        so5 so5Var3 = new so5(0);
        Iterator it = Collections.unmodifiableList(((tr7) rr7Var.y).B()).iterator();
        while (it.hasNext()) {
            hashSet.add(((jr7) it.next()).r());
        }
        gu7 gu7Var = (gu7) this.x;
        ak7 ak7Var = gu7Var.A;
        es7 es7Var = gu7Var.C;
        sq7 sq7Var = tq7.V0;
        if (ak7Var.W(null, sq7Var)) {
            arrayList2.addAll(Collections.unmodifiableList(((tr7) rr7Var.y).H()));
        }
        while (i < ((tr7) rr7Var.y).w()) {
            mr7 mr7Var = (mr7) ((tr7) rr7Var.y).x(i).i();
            if (mr7Var.h().isEmpty()) {
                gu7.l(es7Var);
                es7Var.F.a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String h = mr7Var.h();
                arrayList = arrayList2;
                String s = ct5.s(mr7Var.h(), te4.l, te4.q);
                if (!TextUtils.isEmpty(s)) {
                    mr7Var.c();
                    ((pr7) mr7Var.y).y(s);
                    rr7Var.c();
                    ((tr7) rr7Var.y).K(i, (pr7) mr7Var.e());
                }
                if (((pr7) mr7Var.y).s() && ((pr7) mr7Var.y).t()) {
                    so5Var.put(h, Boolean.TRUE);
                }
                if (((pr7) mr7Var.y).u() && ((pr7) mr7Var.y).v()) {
                    so5Var2.put(mr7Var.h(), Boolean.TRUE);
                }
                if (((pr7) mr7Var.y).w()) {
                    if (((pr7) mr7Var.y).x() >= 2 && ((pr7) mr7Var.y).x() <= 65535) {
                        so5Var3.put(mr7Var.h(), Integer.valueOf(((pr7) mr7Var.y).x()));
                    } else {
                        gu7.l(es7Var);
                        es7Var.F.c("Invalid sampling rate. Event name, sample rate", mr7Var.h(), Integer.valueOf(((pr7) mr7Var.y).x()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.B.put(str, hashSet);
        if (gu7Var.A.W(null, sq7Var)) {
            this.E.put(str, arrayList3);
        }
        this.C.put(str, so5Var);
        this.D.put(str, so5Var2);
        this.G.put(str, so5Var3);
    }

    public final void T(String str, tr7 tr7Var) {
        gu7 gu7Var = (gu7) this.x;
        int A = tr7Var.A();
        nw0 nw0Var = this.H;
        if (A != 0) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.K.b(Integer.valueOf(tr7Var.A()), "EES programs found");
            byte b = 0;
            mv7 mv7Var = (mv7) tr7Var.z().get(0);
            try {
                hn7 hn7Var = new hn7();
                zp2 zp2Var = hn7Var.a;
                ((HashMap) ((fq3) zp2Var.A).y).put("internal.remoteConfig", new it7(this, str, (byte) 2));
                ((HashMap) ((fq3) zp2Var.A).y).put("internal.appMetadata", new it7(this, str, b));
                ((HashMap) ((fq3) zp2Var.A).y).put("internal.logger", new ip7(this, (byte) 1));
                hn7Var.b(mv7Var);
                nw0Var.d(str, hn7Var);
                gu7.l(es7Var);
                bs7 bs7Var = es7Var.K;
                bs7Var.c("EES program loaded for appId, activities", str, Integer.valueOf(mv7Var.s().s()));
                for (gv7 gv7Var : mv7Var.s().r()) {
                    gu7.l(es7Var);
                    bs7Var.b(gv7Var.r(), "EES program activity");
                }
                return;
            } catch (qo7 unused) {
                es7 es7Var2 = gu7Var.C;
                gu7.l(es7Var2);
                es7Var2.C.b(str, "Failed to load EES program. appId");
                return;
            }
        }
        nw0Var.e(str);
    }

    public final tr7 U(String str, byte[] bArr) {
        Long l;
        gu7 gu7Var = (gu7) this.x;
        if (bArr == null) {
            return tr7.J();
        }
        try {
            tr7 tr7Var = (tr7) ((rr7) c28.w0(tr7.I(), bArr)).e();
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            bs7 bs7Var = es7Var.K;
            String str2 = null;
            if (tr7Var.r()) {
                l = Long.valueOf(tr7Var.s());
            } else {
                l = null;
            }
            if (tr7Var.t()) {
                str2 = tr7Var.u();
            }
            bs7Var.c("Parsed config. version, gmp_app_id", l, str2);
            return tr7Var;
        } catch (ag7 e) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.F.c("Unable to merge remote config. appId", es7.P(str), e);
            return tr7.J();
        } catch (RuntimeException e2) {
            es7 es7Var3 = gu7Var.C;
            gu7.l(es7Var3);
            es7Var3.F.c("Unable to merge remote config. appId", es7.P(str), e2);
            return tr7.J();
        }
    }

    public final tr7 X(String str) {
        M();
        L();
        a34.u(str);
        R(str);
        return (tr7) this.F.get(str);
    }

    public final String Y(String str) {
        L();
        R(str);
        return (String) this.J.get(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:47|48|(5:50|(2:144|145)(3:52|(2:53|(2:55|(2:57|58)(1:62))(1:63))|61)|59|60|61)|147|148|(3:150|(2:152|153)(2:155|156)|154)|157|158|(4:159|160|161|(1:163)(2:190|(2:191|(2:193|(1:195)(1:196))(2:197|198))))|164|165|(3:166|167|168)|(2:169|170)|171|172|173|174|(1:176)|178|179) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x033e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0322, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02cd, code lost:
    
        r0 = r14.C;
        defpackage.gu7.l(r0);
        r0 = r0.F;
        r3 = defpackage.es7.P(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e2, code lost:
    
        if (r8.r() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e4, code lost:
    
        r5 = java.lang.Integer.valueOf(r8.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02f1, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02f0, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0621, code lost:
    
        r24.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0624, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0384, code lost:
    
        r27 = r6;
        r5 = r5.t().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0394, code lost:
    
        if (r5.hasNext() == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0396, code lost:
    
        r6 = (defpackage.jq7) r5.next();
        r9.M();
        r9.L();
        defpackage.a34.u(r30);
        defpackage.a34.x(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03b0, code lost:
    
        if (r6.t().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03dc, code lost:
    
        r8 = r6.a();
        r23 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r3, r30);
        r26 = r3;
        r5.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03f7, code lost:
    
        if (r6.r() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03f9, code lost:
    
        r3 = java.lang.Integer.valueOf(r6.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0403, code lost:
    
        r5.put(r0, r3);
        r28 = r0;
        r5.put("property_name", r6.t());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0415, code lost:
    
        if (r6.x() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0417, code lost:
    
        r3 = java.lang.Boolean.valueOf(r6.y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0421, code lost:
    
        r5.put("session_scoped", r3);
        r5.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0433, code lost:
    
        if (r9.C0().insertWithOnConflict("property_filters", null, r5, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0448, code lost:
    
        r5 = r23;
        r3 = r26;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0435, code lost:
    
        r0 = r14.C;
        defpackage.gu7.l(r0);
        r0.C.b(defpackage.es7.P(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0446, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0450, code lost:
    
        r1 = r14.C;
        defpackage.gu7.l(r1);
        r1.C.c("Error storing property filter. appId", defpackage.es7.P(r30), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0420, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0402, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03b2, code lost:
    
        r0 = r14.C;
        defpackage.gu7.l(r0);
        r0 = r0.F;
        r3 = defpackage.es7.P(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03c7, code lost:
    
        if (r6.r() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03c9, code lost:
    
        r5 = java.lang.Integer.valueOf(r6.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03d3, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03d2, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x05fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x05fb, code lost:
    
        r3 = r4.C;
        defpackage.gu7.l(r3);
        r3.C.c("Error storing remote config. appId", defpackage.es7.P(r30), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0262, code lost:
    
        r0 = r5.t().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026e, code lost:
    
        if (r0.hasNext() == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x027a, code lost:
    
        if (((defpackage.jq7) r0.next()).r() != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027c, code lost:
    
        r0 = r14.C;
        defpackage.gu7.l(r0);
        r0.F.c("Property filter with no ID. Audience definition ignored. appId, audienceId", defpackage.es7.P(r30), java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0291, code lost:
    
        r0 = r5.w().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0299, code lost:
    
        r8 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x029d, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02af, code lost:
    
        if (r8 == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02b1, code lost:
    
        r8 = (defpackage.cq7) r23.next();
        r9.M();
        r9.L();
        defpackage.a34.u(r30);
        defpackage.a34.x(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02cb, code lost:
    
        if (r8.t().isEmpty() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02fc, code lost:
    
        r26 = r5;
        r5 = r8.a();
        r27 = r6;
        r6 = new android.content.ContentValues();
        r6.put("app_id", r30);
        r6.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0317, code lost:
    
        if (r8.r() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0319, code lost:
    
        r1 = java.lang.Integer.valueOf(r8.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0323, code lost:
    
        r6.put("filter_id", r1);
        r6.put("event_name", r8.t());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0333, code lost:
    
        if (r8.B() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0335, code lost:
    
        r0 = java.lang.Boolean.valueOf(r8.C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x033f, code lost:
    
        r6.put("session_scoped", r0);
        r6.put("data", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0351, code lost:
    
        if (r9.C0().insertWithOnConflict("event_filters", null, r6, 5) != (-1)) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0353, code lost:
    
        r0 = r14.C;
        defpackage.gu7.l(r0);
        r0.C.b(defpackage.es7.P(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0366, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0364, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0372, code lost:
    
        r1 = r14.C;
        defpackage.gu7.l(r1);
        r1.C.c("Error storing event filter. appId", defpackage.es7.P(r30), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0460, code lost:
    
        r9.M();
        r9.L();
        defpackage.a34.u(r30);
        r0 = r9.C0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0483, code lost:
    
        r1 = r24;
        r3 = r25;
        r0 = r27;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05e9 A[Catch: SQLiteException -> 0x05fa, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x05fa, blocks: (B:174:0x05d2, B:176:0x05e9), top: B:173:0x05d2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(java.lang.String r30, java.lang.String r31, java.lang.String r32, byte[] r33) {
        /*
            Method dump skipped, instructions count: 1573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt7.Z(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean a0(String str, String str2) {
        Boolean bool;
        L();
        R(str);
        if (!UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(e(str, "measurement.upload.blacklist_internal")) || !i28.p0(str2)) {
            if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(e(str, "measurement.upload.blacklist_public")) && i28.L0(str2)) {
                return true;
            }
            Map map = (Map) this.C.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean b0(String str, String str2) {
        Boolean bool;
        L();
        R(str);
        if (!"ecommerce_purchase".equals(str2) && !"purchase".equals(str2) && !"refund".equals(str2)) {
            Map map = (Map) this.D.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final List c0(String str) {
        L();
        R(str);
        return (List) this.E.get(str);
    }

    public final int d0(String str, String str2) {
        Integer num;
        L();
        R(str);
        Map map = (Map) this.G.get(str);
        if (map != null && (num = (Integer) map.get(str2)) != null) {
            return num.intValue();
        }
        return 1;
    }

    @Override // defpackage.vj7
    public final String e(String str, String str2) {
        L();
        R(str);
        Map map = (Map) this.A.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean e0(String str) {
        L();
        R(str);
        js jsVar = this.B;
        if (jsVar.get(str) != null) {
            if (((Set) jsVar.get(str)).contains("os_version") || ((Set) jsVar.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean f0(String str) {
        L();
        R(str);
        js jsVar = this.B;
        if (jsVar.get(str) != null && ((Set) jsVar.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean g0(String str, wv7 wv7Var) {
        L();
        R(str);
        hr7 h0 = h0(str);
        if (h0 != null) {
            for (oq7 oq7Var : h0.r()) {
                if (wv7Var == W(oq7Var.r())) {
                    if (oq7Var.s() == 2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final hr7 h0(String str) {
        L();
        R(str);
        tr7 X = X(str);
        if (X != null && X.D()) {
            return X.E();
        }
        return null;
    }

    @Override // defpackage.j18
    public final void O() {
    }
}
