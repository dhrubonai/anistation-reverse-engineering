package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.view.autofill.AutofillManager;
import com.anistation.android.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y23 implements u06, z06, nw4, oe2, gg4, ja5, c36, p60, o41, hp3, cf5, y16, gg5, wk7 {
    public final /* synthetic */ byte x;
    public Object y;
    public Object z;

    public y23(byte b) {
        this.x = b;
        switch (b) {
            case 4:
                return;
            case 6:
                this.y = new rt3((byte) 17);
                return;
            case 8:
                this.y = new z44(new za3[16], 0);
                return;
            case 23:
                this.y = new zi4();
                this.z = new c47();
                return;
            case 25:
                fq3 fq3Var = new fq3((byte) 21);
                this.y = fq3Var;
                this.z = new sn3((Object) fq3Var, (byte) 29);
                return;
            case 26:
                this.y = Collections.synchronizedMap(new WeakHashMap());
                this.z = Collections.synchronizedMap(new WeakHashMap());
                return;
            case 29:
                this.y = new HashMap();
                this.z = new al7((byte) 6);
                al7 al7Var = new al7((byte) 0);
                nm7 nm7Var = nm7.BITWISE_AND;
                ArrayList arrayList = al7Var.a;
                arrayList.add(nm7Var);
                arrayList.add(nm7.BITWISE_LEFT_SHIFT);
                arrayList.add(nm7.BITWISE_NOT);
                arrayList.add(nm7.BITWISE_OR);
                arrayList.add(nm7.BITWISE_RIGHT_SHIFT);
                arrayList.add(nm7.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(nm7.BITWISE_XOR);
                e0(al7Var);
                al7 al7Var2 = new al7((byte) 1);
                nm7 nm7Var2 = nm7.EQUALS;
                ArrayList arrayList2 = al7Var2.a;
                arrayList2.add(nm7Var2);
                arrayList2.add(nm7.GREATER_THAN);
                arrayList2.add(nm7.GREATER_THAN_EQUALS);
                arrayList2.add(nm7.IDENTITY_EQUALS);
                arrayList2.add(nm7.IDENTITY_NOT_EQUALS);
                arrayList2.add(nm7.LESS_THAN);
                arrayList2.add(nm7.LESS_THAN_EQUALS);
                arrayList2.add(nm7.NOT_EQUALS);
                e0(al7Var2);
                al7 al7Var3 = new al7((byte) 2);
                nm7 nm7Var3 = nm7.APPLY;
                ArrayList arrayList3 = al7Var3.a;
                arrayList3.add(nm7Var3);
                arrayList3.add(nm7.BLOCK);
                arrayList3.add(nm7.BREAK);
                arrayList3.add(nm7.CASE);
                arrayList3.add(nm7.DEFAULT);
                arrayList3.add(nm7.CONTINUE);
                arrayList3.add(nm7.DEFINE_FUNCTION);
                arrayList3.add(nm7.FN);
                arrayList3.add(nm7.IF);
                arrayList3.add(nm7.QUOTE);
                arrayList3.add(nm7.RETURN);
                arrayList3.add(nm7.SWITCH);
                arrayList3.add(nm7.TERNARY);
                e0(al7Var3);
                al7 al7Var4 = new al7((byte) 3);
                nm7 nm7Var4 = nm7.AND;
                ArrayList arrayList4 = al7Var4.a;
                arrayList4.add(nm7Var4);
                arrayList4.add(nm7.NOT);
                arrayList4.add(nm7.OR);
                e0(al7Var4);
                al7 al7Var5 = new al7((byte) 4);
                nm7 nm7Var5 = nm7.FOR_IN;
                ArrayList arrayList5 = al7Var5.a;
                arrayList5.add(nm7Var5);
                arrayList5.add(nm7.FOR_IN_CONST);
                arrayList5.add(nm7.FOR_IN_LET);
                arrayList5.add(nm7.FOR_LET);
                arrayList5.add(nm7.FOR_OF);
                arrayList5.add(nm7.FOR_OF_CONST);
                arrayList5.add(nm7.FOR_OF_LET);
                arrayList5.add(nm7.WHILE);
                e0(al7Var5);
                al7 al7Var6 = new al7((byte) 5);
                nm7 nm7Var6 = nm7.ADD;
                ArrayList arrayList6 = al7Var6.a;
                arrayList6.add(nm7Var6);
                arrayList6.add(nm7.DIVIDE);
                arrayList6.add(nm7.MODULUS);
                arrayList6.add(nm7.MULTIPLY);
                arrayList6.add(nm7.NEGATE);
                arrayList6.add(nm7.POST_DECREMENT);
                arrayList6.add(nm7.POST_INCREMENT);
                arrayList6.add(nm7.PRE_DECREMENT);
                arrayList6.add(nm7.PRE_INCREMENT);
                arrayList6.add(nm7.SUBTRACT);
                e0(al7Var6);
                al7 al7Var7 = new al7((byte) 7);
                nm7 nm7Var7 = nm7.ASSIGN;
                ArrayList arrayList7 = al7Var7.a;
                arrayList7.add(nm7Var7);
                arrayList7.add(nm7.CONST);
                arrayList7.add(nm7.CREATE_ARRAY);
                arrayList7.add(nm7.CREATE_OBJECT);
                arrayList7.add(nm7.EXPRESSION_LIST);
                arrayList7.add(nm7.GET);
                arrayList7.add(nm7.GET_INDEX);
                arrayList7.add(nm7.GET_PROPERTY);
                arrayList7.add(nm7.NULL);
                arrayList7.add(nm7.SET_PROPERTY);
                arrayList7.add(nm7.TYPEOF);
                arrayList7.add(nm7.UNDEFINED);
                arrayList7.add(nm7.VAR);
                e0(al7Var7);
                return;
            default:
                this.y = new HashSet();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [xz3] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void T(za3 za3Var) {
        if (za3Var.m0 > 0) {
            if (za3Var.d0.d == va3.B && !za3Var.p() && !za3Var.q() && !za3Var.n0 && za3Var.J()) {
                xz3 xz3Var = (xz3) za3Var.c0.D;
                if ((xz3Var.A & 256) != 0) {
                    while (xz3Var != null) {
                        if ((xz3Var.z & 256) != 0) {
                            zc1 zc1Var = xz3Var;
                            ?? r5 = 0;
                            while (zc1Var != 0) {
                                if (zc1Var instanceof hf2) {
                                    hf2 hf2Var = (hf2) zc1Var;
                                    hf2Var.f0(wc7.M(hf2Var, 256));
                                } else if ((zc1Var.z & 256) != 0 && (zc1Var instanceof zc1)) {
                                    xz3 xz3Var2 = zc1Var.M;
                                    int i = 0;
                                    zc1Var = zc1Var;
                                    r5 = r5;
                                    while (xz3Var2 != null) {
                                        if ((xz3Var2.z & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                zc1Var = xz3Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new z44(new xz3[16], 0);
                                                }
                                                if (zc1Var != 0) {
                                                    r5.b(zc1Var);
                                                    zc1Var = 0;
                                                }
                                                r5.b(xz3Var2);
                                            }
                                        }
                                        xz3Var2 = xz3Var2.C;
                                        zc1Var = zc1Var;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                zc1Var = wc7.J(r5);
                            }
                        }
                        if ((xz3Var.A & 256) == 0) {
                            break;
                        } else {
                            xz3Var = xz3Var.C;
                        }
                    }
                }
            }
            za3Var.l0 = false;
            z44 A = za3Var.A();
            Object[] objArr = A.x;
            int i2 = A.z;
            for (int i3 = 0; i3 < i2; i3++) {
                T((za3) objArr[i3]);
            }
        }
    }

    @Override // defpackage.p60
    public ii3 A(jr3 jr3Var) {
        ii3 A = ((fr0) this.y).A(jr3Var);
        if (A == null) {
            return null;
        }
        return h3.q(A, new ua2(this, (byte) 2), qg1.x);
    }

    @Override // defpackage.gg4
    public List B(Integer num) {
        List B = ((gg4) this.y).B(null);
        bs5 bs5Var = (bs5) this.z;
        int i = bs5Var.v;
        if (i < 0) {
            return B;
        }
        return yo0.u0(B, db.r(bs5Var, num, i, Integer.valueOf(bs5Var.F(bs5Var.b, i))));
    }

    @Override // defpackage.gg5
    public int C(int i) {
        do {
            i = ((wp) this.z).u(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.y).charAt(i)));
        return i;
    }

    @Override // defpackage.gg5
    public int D(int i) {
        do {
            i = ((wp) this.z).n(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.y).charAt(i - 1)));
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03a3, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0116, code lost:
    
        if (")".equals(defpackage.c47.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r10v11, types: [d47, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.y16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(byte[] r19, int r20, int r21, defpackage.x16 r22, defpackage.ay0 r23) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y23.E(byte[], int, int, x16, ay0):void");
    }

    @Override // defpackage.p60
    public ii3 F(byte[] bArr) {
        return h3.q(((fr0) this.y).F(bArr), new ua2(this, (byte) 2), qg1.x);
    }

    @Override // defpackage.c36
    public String G() {
        return (String) this.y;
    }

    @Override // defpackage.o41
    public q41 H() {
        q41 H = ((o41) this.y).H();
        H.getClass();
        return new k26(H, (LinkedHashSet) this.z);
    }

    @Override // defpackage.c36
    public void I(b36 b36Var) {
        jf7.k(b36Var, (Object[]) this.z);
    }

    @Override // defpackage.oe2
    public we2 J(int i, int i2, int i3) {
        return ((rt3) this.y).J(i, i2, i3);
    }

    @Override // defpackage.oe2
    public EGLSurface K(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        return a34.N(eGLContext, eGLDisplay);
    }

    @Override // defpackage.gg4
    public boolean L() {
        return ((gg4) this.y).L();
    }

    @Override // defpackage.hp3
    public void M(ArrayList arrayList) {
        ((MediaCodec) this.y).subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.u06
    public boolean N() {
        return true;
    }

    @Override // defpackage.hp3
    public void O(zp3 zp3Var, Handler handler) {
        ((MediaCodec) this.y).setOnFrameRenderedListener(new cu(this, zp3Var, (byte) 1), handler);
    }

    @Override // defpackage.oe2
    public void P(EGLDisplay eGLDisplay) {
        EGLContext eGLContext = (EGLContext) this.z;
        if (eGLContext != null) {
            a34.P(eGLContext, eGLDisplay);
        }
    }

    @Override // defpackage.hp3
    public void Q(ArrayList arrayList) {
        ((MediaCodec) this.y).unsubscribeFromVendorParameters(arrayList);
    }

    public void R(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.y).add(qx1.q(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r3 < r1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.y
            z44 r0 = (defpackage.z44) r0
            k82 r1 = defpackage.k82.A
            java.lang.Object[] r2 = r0.x
            int r3 = r0.z
            r4 = 0
            java.util.Arrays.sort(r2, r4, r3, r1)
            int r1 = r0.z
            java.lang.Object r2 = r6.z
            za3[] r2 = (defpackage.za3[]) r2
            if (r2 == 0) goto L19
            int r3 = r2.length
            if (r3 >= r1) goto L21
        L19:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            za3[] r2 = new defpackage.za3[r2]
        L21:
            r3 = 0
            r6.z = r3
        L24:
            if (r4 >= r1) goto L2f
            java.lang.Object[] r5 = r0.x
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L24
        L2f:
            r0.h()
            int r1 = r1 + (-1)
        L34:
            r0 = -1
            if (r0 >= r1) goto L48
            r0 = r2[r1]
            r0.getClass()
            boolean r4 = r0.l0
            if (r4 == 0) goto L43
            T(r0)
        L43:
            r2[r1] = r3
            int r1 = r1 + (-1)
            goto L34
        L48:
            r6.z = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y23.S():void");
    }

    public void U(bn0 bn0Var, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.y;
        gw4 gw4Var = new gw4(byteArrayOutputStream, hashMap, (HashMap) this.z);
        ac4 ac4Var = (ac4) hashMap.get(bn0.class);
        if (ac4Var != null) {
            ac4Var.a(bn0Var, gw4Var);
        } else {
            throw new RuntimeException("No encoder for " + bn0.class);
        }
    }

    public vo3 V() {
        return (vo3) ((ti4) this.z).getValue();
    }

    public AutofillManager W() {
        AutofillManager autofillManager = (AutofillManager) this.z;
        if (autofillManager == null) {
            AutofillManager autofillManager2 = (AutofillManager) ((Context) this.y).getSystemService(AutofillManager.class);
            if (autofillManager2 != null) {
                this.z = autofillManager2;
                return autofillManager2;
            }
            ze0.m("Could not locate AutofillManager from context");
            return null;
        }
        return autofillManager;
    }

    public String X(String str) {
        String str2 = (String) this.z;
        Resources resources = (Resources) this.y;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public boolean Y(zu3 zu3Var, String str) {
        int i = zu3Var.b;
        Context context = (Context) this.y;
        if (i < 0) {
            if (context.getPackageManager().checkPermission(str, zu3Var.a) == 0) {
                return true;
            }
            return false;
        }
        if (context.checkPermission(str, i, zu3Var.c) == 0) {
            return true;
        }
        return false;
    }

    public void Z(View view, int i, boolean z) {
        W().notifyViewVisibilityChanged(view, i, z);
    }

    @Override // defpackage.cf5
    public void a(zi4 zi4Var) {
        jk6 jk6Var = (jk6) this.z;
        SparseArray sparseArray = jk6Var.h;
        yi0 yi0Var = (yi0) this.y;
        if (zi4Var.A() == 0 && (zi4Var.A() & 128) != 0) {
            zi4Var.O(6);
            int a = zi4Var.a() / 4;
            for (int i = 0; i < a; i++) {
                zi4Var.k(yi0Var.b, 0, 4);
                yi0Var.m(0);
                int g = yi0Var.g(16);
                yi0Var.o(3);
                if (g == 0) {
                    yi0Var.o(13);
                } else {
                    int g2 = yi0Var.g(13);
                    if (sparseArray.get(g2) == null) {
                        sparseArray.put(g2, new df5(new jh6(jk6Var, g2)));
                        jk6Var.n++;
                    }
                }
            }
            if (jk6Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void a0(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (((HashSet) this.y).remove(mediaCodec) && (loudnessCodecController = (LoudnessCodecController) this.z) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    @Override // defpackage.u06
    public v06 apply() {
        return ((mb3) this.y).e(this.z);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, gm3] */
    public void b0(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.z;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.z = null;
        }
        create = LoudnessCodecController.create(i, qg1.x, new Object());
        this.z = create;
        Iterator it = ((HashSet) this.y).iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    @Override // defpackage.hp3
    public void c(int i, x21 x21Var, long j, int i2) {
        ((MediaCodec) this.y).queueSecureInputBuffer(i, 0, x21Var.i, j, i2);
    }

    public synchronized void c0(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (((PowerManager.WakeLock) this.z) == null) {
                if (((Context) this.y).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    kb0.O("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) this.y).getSystemService("power");
                if (powerManager == null) {
                    kb0.O("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.z = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.z;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    @Override // defpackage.hp3
    public void d(int i, int i2, int i3, long j) {
        ((MediaCodec) this.y).queueInputBuffer(i, 0, i2, j, i3);
    }

    public void d0(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.y;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.z;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((p76) entry2.getKey()).c(new bp(status));
            }
        }
    }

    @Override // defpackage.u06
    public boolean e(fs0 fs0Var) {
        return true;
    }

    public void e0(al7 al7Var) {
        ArrayList arrayList = al7Var.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.y).put(Integer.valueOf(((nm7) obj).x).toString(), al7Var);
        }
    }

    @Override // defpackage.hp3
    public void f(int i) {
        ((MediaCodec) this.y).releaseOutputBuffer(i, false);
    }

    public ik7 f0(vs7 vs7Var, ik7 ik7Var) {
        al7 al7Var;
        fy5.u(vs7Var);
        if (ik7Var instanceof mk7) {
            mk7 mk7Var = (mk7) ik7Var;
            ArrayList arrayList = mk7Var.y;
            String str = mk7Var.x;
            HashMap hashMap = (HashMap) this.y;
            if (hashMap.containsKey(str)) {
                al7Var = (al7) hashMap.get(str);
            } else {
                al7Var = (al7) this.z;
            }
            return al7Var.a(str, vs7Var, arrayList);
        }
        return ik7Var;
    }

    @Override // defpackage.hp3
    public void flush() {
        ((MediaCodec) this.y).flush();
    }

    @Override // defpackage.nw4
    public Object get() {
        return new gy3((Context) ((l03) this.y).x, (st3) ((af2) this.z).get());
    }

    @Override // defpackage.hp3
    public ByteBuffer getInputBuffer(int i) {
        return ((MediaCodec) this.y).getInputBuffer(i);
    }

    @Override // defpackage.hp3
    public ByteBuffer getOutputBuffer(int i) {
        return ((MediaCodec) this.y).getOutputBuffer(i);
    }

    @Override // defpackage.hp3
    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.y).getOutputFormat();
    }

    @Override // defpackage.z06
    public void i(y06 y06Var) {
        int i;
        b44 b44Var = (b44) this.z;
        b44Var.a();
        g44 g44Var = (g44) y06Var.y;
        Object[] objArr = g44Var.b;
        long[] jArr = g44Var.c;
        int i2 = g44Var.e;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            Object obj = objArr[i2];
            Object b = ((qd3) this.y).b(obj);
            int d = b44Var.d(b);
            if (d >= 0) {
                i = b44Var.c[d];
            } else {
                i = 0;
            }
            if (i == 7) {
                y06Var.remove(obj);
            } else {
                b44Var.g(i + 1, b);
            }
            i2 = i3;
        }
    }

    @Override // defpackage.ja5
    public Object j(Object obj) {
        return ((ub2) this.z).invoke(obj);
    }

    @Override // defpackage.hp3
    public void k() {
        ((MediaCodec) this.y).detachOutputSurface();
    }

    @Override // defpackage.oe2
    public EGLContext l(EGLDisplay eGLDisplay, int i, int[] iArr) {
        EGLContext eGLContext = (EGLContext) this.z;
        if (eGLContext == null) {
            EGLContext l = ((rt3) this.y).l(eGLDisplay, i, iArr);
            this.z = l;
            return l;
        }
        return eGLContext;
    }

    @Override // defpackage.wk7
    public void m(String str, long j, long j2, long j3) {
        wk7 wk7Var = (wk7) this.y;
        if (wk7Var != null) {
            wk7Var.m(str, j, j2, j3);
        }
    }

    @Override // defpackage.hp3
    public void n(int i, long j) {
        ((MediaCodec) this.y).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.hp3
    public int o() {
        return ((MediaCodec) this.y).dequeueInputBuffer(0L);
    }

    @Override // defpackage.c36
    public int p() {
        Object[] objArr = (Object[]) this.z;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // defpackage.z06
    public boolean q(Object obj, Object obj2) {
        qd3 qd3Var = (qd3) this.y;
        return a34.i(qd3Var.b(obj), qd3Var.b(obj2));
    }

    @Override // defpackage.gg5
    public int r(int i) {
        CharSequence charSequence = (CharSequence) this.y;
        do {
            i = ((wp) this.z).n(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.hp3
    public void release() {
        y23 y23Var = (y23) this.z;
        MediaCodec mediaCodec = (MediaCodec) this.y;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && y23Var != null) {
                y23Var.a0(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && y23Var != null) {
                y23Var.a0(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // defpackage.p60
    public ii3 s(Uri uri) {
        return h3.q(((fr0) this.y).s(uri), new ua2(this, (byte) 2), qg1.x);
    }

    @Override // defpackage.hp3
    public void setOutputSurface(Surface surface) {
        ((MediaCodec) this.y).setOutputSurface(surface);
    }

    @Override // defpackage.hp3
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.y).setParameters(bundle);
    }

    @Override // defpackage.gg5
    public int t(int i) {
        do {
            i = ((wp) this.z).u(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.y).charAt(i - 1)));
        return i;
    }

    public String toString() {
        switch (this.x) {
            case 7:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.z.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.y;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ja5
    public Object u(i95 i95Var, Object obj) {
        return ((ic2) this.y).invoke(i95Var, obj);
    }

    @Override // defpackage.hp3
    public int v(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.y).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.oe2
    public EGLSurface w(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        return ((rt3) this.y).w(eGLDisplay, obj, i, z);
    }

    @Override // defpackage.wk7
    public void x(String str, long j, int i, Object obj, long j2, long j3) {
        ((qk7) this.z).g = null;
        wk7 wk7Var = (wk7) this.y;
        if (wk7Var != null) {
            wk7Var.x(str, j, i, obj, j2, j3);
        }
    }

    @Override // defpackage.hp3
    public void z(int i) {
        ((MediaCodec) this.y).setVideoScalingMode(i);
    }

    @Override // defpackage.u06, defpackage.sg0
    public void cancel() {
    }

    @Override // defpackage.cf5
    public void b(tf6 tf6Var, d12 d12Var, lk6 lk6Var) {
    }

    public /* synthetic */ y23(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    public /* synthetic */ y23(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    public y23(Context context) {
        this.x = (byte) 17;
        a34.x(context);
        Resources resources = context.getResources();
        this.y = resources;
        this.z = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ y23(Object obj) {
        this.x = (byte) 7;
        this.z = obj;
        this.y = new ArrayList();
    }

    public y23(qk7 qk7Var, wk7 wk7Var) {
        this.x = (byte) 28;
        this.y = wk7Var;
        Objects.requireNonNull(qk7Var);
        this.z = qk7Var;
    }

    public y23(za3 za3Var, vo3 vo3Var) {
        this.x = (byte) 0;
        this.y = za3Var;
        this.z = xt5.g(vo3Var);
    }

    public y23(la laVar, AlertDialog alertDialog) {
        this.x = (byte) 27;
        this.y = alertDialog;
        this.z = laVar;
    }

    public y23(MediaCodec mediaCodec, y23 y23Var) {
        boolean addMediaCodec;
        this.x = (byte) 19;
        this.y = mediaCodec;
        this.z = y23Var;
        if (Build.VERSION.SDK_INT < 35 || y23Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) y23Var.z;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        io3.B(((HashSet) y23Var.y).add(mediaCodec));
    }

    public y23(qd3 qd3Var) {
        this.x = (byte) 2;
        this.y = qd3Var;
        b44 b44Var = dc4.a;
        this.z = new b44();
    }

    public y23(jk6 jk6Var) {
        this.x = (byte) 20;
        this.z = jk6Var;
        this.y = new yi0(4, new byte[4]);
    }
}
