package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ak6 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public ak6(v65 v65Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, d0 d0Var) {
        String str;
        this.b = v65Var;
        this.c = linkedHashMap;
        this.d = linkedHashMap2;
        this.a = z;
        this.f = d0Var;
        this.j = new AtomicBoolean(false);
        this.k = new gr((byte) 13);
        this.e = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            ((LinkedHashMap) this.e).put(lowerCase, Integer.valueOf(i));
            String str3 = (String) ((LinkedHashMap) this.c).get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (((LinkedHashMap) this.e).containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.e;
                linkedHashMap3.put(lowerCase3, vn3.Q(lowerCase2, linkedHashMap3));
            }
        }
        this.h = new kc4(((String[]) this.g).length);
        this.i = new sn3(((String[]) this.g).length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.kr4 r5, defpackage.xz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.sj6
            if (r0 == 0) goto L13
            r0 = r6
            sj6 r0 = (defpackage.sj6) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            sj6 r0 = new sj6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.y
            int r6 = r0.A
            r1 = 2
            r2 = 1
            w11 r3 = defpackage.w11.x
            if (r6 == 0) goto L3d
            if (r6 == r2) goto L35
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.x
            java.util.Set r5 = (java.util.Set) r5
            defpackage.m37.N(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.x
            kr4 r5 = (defpackage.kr4) r5
            defpackage.m37.N(r4)
            goto L54
        L3d:
            defpackage.m37.N(r4)
            ka6 r4 = new ka6
            r6 = 14
            r4.<init>(r6)
            r0.x = r5
            r0.A = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.c(r6, r4, r0)
            if (r4 != r3) goto L54
            goto L6b
        L54:
            java.util.Set r4 = (java.util.Set) r4
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L6c
            r0.x = r4
            r0.A = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.lt5.l(r5, r6, r0)
            if (r5 != r3) goto L6c
        L6b:
            return r3
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak6.a(kr4, xz0):java.lang.Object");
    }

    public List b() {
        tu tuVar;
        boolean isAvailable;
        Spatializer spatializer;
        boolean isEnabled;
        List spatializedChannelMasks;
        int i = Build.VERSION.SDK_INT;
        if (i >= 32 && (tuVar = (tu) this.h) != null) {
            Spatializer spatializer2 = (Spatializer) tuVar.y;
            if (spatializer2 != null && tuVar.x) {
                isAvailable = spatializer2.isAvailable();
                if (isAvailable && (spatializer = (Spatializer) tuVar.y) != null) {
                    isEnabled = spatializer.isEnabled();
                    if (isEnabled) {
                        if (i >= 36) {
                            Spatializer spatializer3 = (Spatializer) tuVar.y;
                            spatializer3.getClass();
                            spatializedChannelMasks = z3.c(spatializer3).getSpatializedChannelMasks();
                            return spatializedChannelMasks;
                        }
                        return nw2.s(252);
                    }
                }
            }
            z62 z62Var = nw2.y;
            return o15.B;
        }
        z62 z62Var2 = nw2.y;
        return o15.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:11:0x0029, B:12:0x007e, B:14:0x0089, B:17:0x00c3, B:19:0x0097, B:20:0x009b, B:22:0x00a8, B:24:0x00b2, B:26:0x00b8, B:27:0x00b6, B:30:0x00bd), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.xz0 r12) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak6.c(xz0):java.lang.Object");
    }

    public void d(vu vuVar) {
        if (this.a && !vuVar.equals((vu) this.i)) {
            this.i = vuVar;
            yw ywVar = (yw) ((h5) this.c).y;
            ywVar.f();
            vu vuVar2 = ywVar.g;
            if (vuVar2 != null && !vuVar.equals(vuVar2)) {
                ywVar.g = vuVar;
                ui3 ui3Var = ywVar.e;
                if (ui3Var != null) {
                    ui3Var.g(-1, new ze0((byte) 13));
                }
            }
        }
    }

    public void e(sb2 sb2Var, sb2 sb2Var2) {
        sb2Var.getClass();
        sb2Var2.getClass();
        if (((AtomicBoolean) this.j).compareAndSet(false, true)) {
            sb2Var.invoke();
            tl7.z(((v65) this.b).getCoroutineScope(), new r11("Room Invalidation Tracker Refresh"), null, new vj6(this, sb2Var2, (vz0) null), 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d7, code lost:
    
        if (defpackage.lt5.l(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d9, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (defpackage.lt5.l(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r2v6, types: [kr4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d7 -> B:11:0x00da). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(defpackage.vh6 r18, int r19, defpackage.xz0 r20) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak6.f(vh6, int, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r3v4, types: [kr4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0080 -> B:10:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(defpackage.vh6 r8, int r9, defpackage.xz0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.xj6
            if (r0 == 0) goto L13
            r0 = r10
            xj6 r0 = (defpackage.xj6) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.E = r1
            goto L18
        L13:
            xj6 r0 = new xj6
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.C
            int r1 = r0.E
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.B
            int r8 = r0.A
            java.lang.String[] r9 = r0.z
            java.lang.String r1 = r0.y
            kr4 r3 = r0.x
            defpackage.m37.N(r10)
            r10 = r9
            r9 = r3
            goto L83
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            r7 = 0
            return r7
        L38:
            defpackage.m37.N(r10)
            java.lang.Object r7 = r7.g
            java.lang.String[] r7 = (java.lang.String[]) r7
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.ak6.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4c:
            if (r8 >= r7) goto L85
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = defpackage.qx1.g(r5, r4, r3)
            r0.x = r9
            r0.y = r1
            r0.z = r10
            r0.A = r8
            r0.B = r7
            r0.E = r2
            java.lang.Object r3 = defpackage.lt5.l(r9, r3, r0)
            w11 r4 = defpackage.w11.x
            if (r3 != r4) goto L83
            return r4
        L83:
            int r8 = r8 + r2
            goto L4c
        L85:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak6.g(vh6, int, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(defpackage.xz0 r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            v65 r0 = (defpackage.v65) r0
            boolean r1 = r8 instanceof defpackage.yj6
            if (r1 == 0) goto L17
            r1 = r8
            yj6 r1 = (defpackage.yj6) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.A = r2
            goto L1c
        L17:
            yj6 r1 = new yj6
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.y
            int r2 = r1.A
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            wn0 r7 = r1.x
            defpackage.m37.N(r8)     // Catch: java.lang.Throwable -> L2c
            goto L57
        L2c:
            r8 = move-exception
            goto L5f
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r3
        L34:
            defpackage.m37.N(r8)
            wn0 r8 = r0.getCloseBarrier$room_runtime()
            boolean r2 = r8.a()
            if (r2 == 0) goto L63
            an r2 = new an     // Catch: java.lang.Throwable -> L5b
            r5 = 10
            r2.<init>(r7, r3, r5)     // Catch: java.lang.Throwable -> L5b
            r1.x = r8     // Catch: java.lang.Throwable -> L5b
            r1.A = r4     // Catch: java.lang.Throwable -> L5b
            r7 = 0
            java.lang.Object r7 = r0.useConnection(r7, r2, r1)     // Catch: java.lang.Throwable -> L5b
            w11 r0 = defpackage.w11.x
            if (r7 != r0) goto L56
            return r0
        L56:
            r7 = r8
        L57:
            r7.b()
            goto L63
        L5b:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L5f:
            r7.b()
            throw r8
        L63:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak6.h(xz0):java.lang.Object");
    }

    public void i() {
        List b = b();
        Context context = (Context) this.b;
        ru ruVar = (ru) this.k;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.j;
        o15 o15Var = vu.e;
        d(vu.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ruVar, audioDeviceInfo, b));
    }

    public ai4 j(String[] strArr) {
        wk5 wk5Var = new wk5();
        for (String str : strArr) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                wk5Var.addAll(set);
            } else {
                wk5Var.add(str);
            }
        }
        String[] strArr2 = (String[]) te4.s(wk5Var).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.e;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num != null) {
                iArr[i] = num.intValue();
            } else {
                ze0.k("There is no table with name ".concat(str2));
                return null;
            }
        }
        return new ai4(strArr2, iArr);
    }

    public ak6(Context context, h5 h5Var, ru ruVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = h5Var;
        this.k = ruVar;
        this.j = audioDeviceInfo;
        Handler q = eq6.q(null);
        this.d = q;
        this.e = new wu(this);
        this.f = new o9(this, (byte) 1);
        o15 o15Var = vu.e;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new xu(this, q, applicationContext.getContentResolver(), uriFor) : null;
    }
}
