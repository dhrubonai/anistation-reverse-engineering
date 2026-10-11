package defpackage;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.Rating;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.anistation.android.MainActivity;
import com.anistation.android.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class sn3 implements tn3, ws6, w16, uu4, xc2, rw5, kj3, y16, gp6, sl, nr6, x37 {
    public final /* synthetic */ byte x;
    public Object y;

    public sn3(byte b) {
        this.x = b;
        switch (b) {
            case 8:
                this.y = new HashMap();
                return;
            case 9:
                this.y = new p18((byte) 14);
                return;
            case 13:
                this.y = new LinkedHashSet();
                return;
            case 20:
                this.y = new zp2((byte) 16);
                return;
            case 22:
                this.y = new SparseArray();
                return;
            default:
                this.y = new Bundle();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, w05] */
    public static final void H(w05 w05Var, v05 v05Var, x16 x16Var, boolean z, sn3 sn3Var, ay0 ay0Var, long j) {
        long j2;
        boolean z2;
        byte[] bArr = (byte[]) w05Var.x;
        if (bArr != null) {
            if (j == -9223372036854775807L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = v05Var.x + j;
            }
            long j3 = x16Var.b;
            if (j3 != -9223372036854775807L && j2 < j3) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 == z) {
                return;
            }
            ?? obj = new Object();
            obj.x = nt1.x;
            try {
                ((zp2) sn3Var.y).E(bArr, 0, bArr.length, x16.c, new xv3(obj, (byte) 13));
            } catch (RuntimeException e) {
                Log.w("SupSubtitleParser", "Ignoring malformed PGS display set", e);
            }
            ay0Var.accept(new e31(v05Var.x, j, (List) obj.x));
        }
    }

    @Override // defpackage.w16
    public int A(ea2 ea2Var) {
        ea2Var.getClass();
        if (a34.i(ea2Var.p, "application/x-sup")) {
            return 2;
        }
        return ((p18) this.y).A(ea2Var);
    }

    @Override // defpackage.kj3
    public q03 B(mj3 mj3Var, long j, long j2, IOException iOException, int i) {
        int i2;
        long j3;
        gj4 gj4Var = (gj4) mj3Var;
        q03 q03Var = dn0.E;
        wz2 wz2Var = (wz2) this.y;
        if (!wz2Var.a) {
            return q03Var;
        }
        if (iOException instanceof oq2) {
            i2 = ((oq2) iOException).z;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        boolean z = false;
        if (i2 == 410) {
            dn0 dn0Var = (dn0) wz2Var.j;
            dn0Var.getClass();
            dn0Var.L(null);
            k46 k46Var = (k46) wz2Var.i;
            k46Var.getClass();
            k46Var.h();
            j3 = -9223372036854775807L;
        } else {
            j3 = 300000;
            if (i2 == 429) {
                List list = (List) gj4Var.d.A.get(CommonGatewayClient.HEADER_RETRY_AFTER);
                if (list != null) {
                    try {
                        j3 = 1000 * Long.parseLong((String) list.get(0));
                    } catch (NumberFormatException unused) {
                        kb0.O("SteeringManifestTracker", "Retry-After header string doesn't contain a parsable long");
                    }
                }
            } else {
                my5 my5Var = (my5) wz2Var.h;
                if (my5Var != null) {
                    long j4 = my5Var.b;
                    if (j4 != -9223372036854775807L) {
                        j3 = j4;
                    }
                }
            }
        }
        byte b = 1;
        if (j3 != -9223372036854775807L) {
            k46 k46Var2 = (k46) wz2Var.i;
            k46Var2.getClass();
            k46Var2.g(new ny5(wz2Var, b), j3);
        }
        if (j3 == -9223372036854775807L) {
            z = true;
        }
        ((k46) wz2Var.d).f(new dw(this, iOException, z));
        ij3 a = wz2.a(gj4Var, j, j2);
        eb2 eb2Var = (eb2) wz2Var.g;
        eb2Var.getClass();
        eb2Var.s(a, 8, iOException, z);
        return q03Var;
    }

    public JSONObject C(View view) {
        int i;
        int currentModeType;
        boolean z = false;
        JSONObject a = ha7.a(0, 0, 0, 0);
        UiModeManager uiModeManager = nz5.a;
        if (uiModeManager != null && (currentModeType = uiModeManager.getCurrentModeType()) != 1 && currentModeType == 4) {
            i = rz5.a;
        } else {
            i = 2;
        }
        if (ga7.a[h11.B(i)] == 1) {
            z = true;
        }
        try {
            a.put("noOutputDevice", z);
            return a;
        } catch (JSONException e) {
            Log.e("OMIDLIB", "Error with setting output device status", e);
            return a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0277, code lost:
    
        throw defpackage.bj4.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(int r23, int r24, defpackage.c12 r25) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn3.D(int, int, c12):void");
    }

    @Override // defpackage.y16
    public void E(byte[] bArr, int i, int i2, x16 x16Var, ay0 ay0Var) {
        bArr.getClass();
        try {
            G(bArr, i, i2, x16Var, ay0Var, false);
            if (x16Var.b != -9223372036854775807L && x16Var.a) {
                G(bArr, i, i2, x16Var, ay0Var, true);
            }
        } catch (IllegalArgumentException e) {
            Log.w("SupSubtitleParser", "Ignoring malformed SUP subtitle", e);
            ay0Var.accept(new e31(0L, -9223372036854775807L, nt1.x));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(defpackage.vj0 r5, defpackage.xz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lc4
            if (r0 == 0) goto L13
            r0 = r6
            lc4 r0 = (defpackage.lc4) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            lc4 r0 = new lc4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return
        L27:
            defpackage.m37.N(r6)
            defpackage.v71.e()
            return
        L2e:
            defpackage.m37.N(r6)
            java.lang.Object r4 = r4.y
            sx5 r4 = (defpackage.sx5) r4
            r0.z = r2
            r4.collect(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn3.F(vj0, xz0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(byte[] r21, int r22, int r23, defpackage.x16 r24, defpackage.ay0 r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn3.G(byte[], int, int, x16, ay0, boolean):void");
    }

    public void I() {
        View view = (View) this.y;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void J() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.y;
        Resources.Theme theme = mainActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            oi4.t(mainActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
    }

    public void K(int i, long j) {
        po3 po3Var = (po3) this.y;
        boolean z = false;
        if (i != 136) {
            if (i != 137) {
                if (i != 145) {
                    if (i != 146) {
                        if (i != 240) {
                            if (i != 241) {
                                if (i != 20529) {
                                    if (i != 20530) {
                                        if (i != 29636) {
                                            if (i != 29637) {
                                                switch (i) {
                                                    case 131:
                                                        int i2 = (int) j;
                                                        if (i2 != 1) {
                                                            if (i2 != 2) {
                                                                if (i2 != 17) {
                                                                    if (i2 != 33) {
                                                                        po3Var.g(i);
                                                                        po3Var.B.f = -1;
                                                                        return;
                                                                    } else {
                                                                        po3Var.g(i);
                                                                        po3Var.B.f = 5;
                                                                        return;
                                                                    }
                                                                }
                                                                po3Var.g(i);
                                                                po3Var.B.f = 3;
                                                                return;
                                                            }
                                                            po3Var.g(i);
                                                            po3Var.B.f = 1;
                                                            return;
                                                        }
                                                        po3Var.g(i);
                                                        po3Var.B.f = 2;
                                                        return;
                                                    case 152:
                                                        lo3 j2 = po3Var.j(i);
                                                        if (j == 1) {
                                                            z = true;
                                                        }
                                                        j2.d = z;
                                                        return;
                                                    case 155:
                                                        po3Var.X = po3Var.o(j);
                                                        return;
                                                    case 159:
                                                        po3Var.g(i);
                                                        po3Var.B.Q = (int) j;
                                                        return;
                                                    case 176:
                                                        po3Var.g(i);
                                                        po3Var.B.o = (int) j;
                                                        return;
                                                    case 179:
                                                        if (!po3Var.C) {
                                                            po3Var.f(i);
                                                            po3Var.H = po3Var.o(j);
                                                            return;
                                                        }
                                                        return;
                                                    case 186:
                                                        po3Var.g(i);
                                                        po3Var.B.p = (int) j;
                                                        return;
                                                    case 215:
                                                        po3Var.g(i);
                                                        po3Var.B.d = (int) j;
                                                        return;
                                                    case 231:
                                                        po3Var.T = po3Var.o(j);
                                                        return;
                                                    case 238:
                                                        po3Var.e0 = (int) j;
                                                        return;
                                                    case 247:
                                                        if (!po3Var.C) {
                                                            po3Var.f(i);
                                                            po3Var.I = (int) j;
                                                            return;
                                                        }
                                                        return;
                                                    case 251:
                                                        po3Var.f0 = true;
                                                        return;
                                                    case 16871:
                                                        po3Var.g(i);
                                                        po3Var.B.i = (int) j;
                                                        return;
                                                    case 16980:
                                                        if (j != 3) {
                                                            throw bj4.a("ContentCompAlgo " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 17029:
                                                        if (j < 1 || j > 2) {
                                                            throw bj4.a("DocTypeReadVersion " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 17143:
                                                        if (j != 1) {
                                                            throw bj4.a("EBMLReadVersion " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 18401:
                                                        if (j != 5) {
                                                            throw bj4.a("ContentEncAlgo " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 18408:
                                                        if (j != 1) {
                                                            throw bj4.a("AESSettingsCipherMode " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 21420:
                                                        po3Var.E = j + po3Var.u;
                                                        return;
                                                    case 21432:
                                                        int i3 = (int) j;
                                                        po3Var.g(i);
                                                        if (i3 != 0) {
                                                            if (i3 != 1) {
                                                                if (i3 != 3) {
                                                                    if (i3 == 15) {
                                                                        po3Var.B.z = 3;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                po3Var.B.z = 1;
                                                                return;
                                                            }
                                                            po3Var.B.z = 2;
                                                            return;
                                                        }
                                                        po3Var.B.z = 0;
                                                        return;
                                                    case 21680:
                                                        po3Var.g(i);
                                                        po3Var.B.r = (int) j;
                                                        return;
                                                    case 21682:
                                                        po3Var.g(i);
                                                        po3Var.B.t = (int) j;
                                                        return;
                                                    case 21690:
                                                        po3Var.g(i);
                                                        po3Var.B.s = (int) j;
                                                        return;
                                                    case 21930:
                                                        po3Var.g(i);
                                                        oo3 oo3Var = po3Var.B;
                                                        if (j == 1) {
                                                            z = true;
                                                        }
                                                        oo3Var.a0 = z;
                                                        return;
                                                    case 21938:
                                                        po3Var.g(i);
                                                        po3Var.B.q = (int) j;
                                                        return;
                                                    case 21998:
                                                        po3Var.g(i);
                                                        po3Var.B.h = (int) j;
                                                        return;
                                                    case 22186:
                                                        po3Var.g(i);
                                                        po3Var.B.U = j;
                                                        return;
                                                    case 22203:
                                                        po3Var.g(i);
                                                        po3Var.B.V = j;
                                                        return;
                                                    case 25188:
                                                        po3Var.g(i);
                                                        po3Var.B.R = (int) j;
                                                        return;
                                                    case 30114:
                                                        po3Var.g0 = j;
                                                        return;
                                                    case 30321:
                                                        po3Var.g(i);
                                                        int i4 = (int) j;
                                                        if (i4 != 0) {
                                                            if (i4 != 1) {
                                                                if (i4 != 2) {
                                                                    if (i4 == 3) {
                                                                        po3Var.B.u = 3;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                po3Var.B.u = 2;
                                                                return;
                                                            }
                                                            po3Var.B.u = 1;
                                                            return;
                                                        }
                                                        po3Var.B.u = 0;
                                                        return;
                                                    case 2352003:
                                                        po3Var.g(i);
                                                        po3Var.B.g = (int) j;
                                                        return;
                                                    case 2807729:
                                                        po3Var.v = j;
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 21945:
                                                                po3Var.g(i);
                                                                int i5 = (int) j;
                                                                if (i5 != 1) {
                                                                    if (i5 == 2) {
                                                                        po3Var.B.C = 1;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                po3Var.B.C = 2;
                                                                return;
                                                            case 21946:
                                                                po3Var.g(i);
                                                                int j3 = hp0.j((int) j);
                                                                if (j3 != -1) {
                                                                    po3Var.B.B = j3;
                                                                    return;
                                                                }
                                                                return;
                                                            case 21947:
                                                                po3Var.g(i);
                                                                int i6 = hp0.i((int) j);
                                                                if (i6 != -1) {
                                                                    po3Var.B.A = i6;
                                                                    return;
                                                                }
                                                                return;
                                                            case 21948:
                                                                po3Var.g(i);
                                                                po3Var.B.D = (int) j;
                                                                return;
                                                            case 21949:
                                                                po3Var.g(i);
                                                                po3Var.B.E = (int) j;
                                                                return;
                                                            default:
                                                                return;
                                                        }
                                                }
                                            }
                                            po3Var.g(i);
                                            po3Var.B.e = j;
                                            return;
                                        }
                                        po3Var.j(i).a = j;
                                        return;
                                    }
                                    if (j != 1) {
                                        throw bj4.a("ContentEncodingScope " + j + " not supported", null);
                                    }
                                    return;
                                }
                                if (j != 0) {
                                    throw bj4.a("ContentEncodingOrder " + j + " not supported", null);
                                }
                                return;
                            }
                            if (!po3Var.C) {
                                po3Var.f(i);
                                if (po3Var.J == -1) {
                                    po3Var.J = j;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (!po3Var.C) {
                            po3Var.f(i);
                            if (po3Var.K == -1) {
                                po3Var.K = j;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    po3Var.j(i).c = j;
                    return;
                }
                po3Var.j(i).b = j;
                return;
            }
            po3Var.j(i).e = j;
            return;
        }
        po3Var.g(i);
        oo3 oo3Var2 = po3Var.B;
        if (j == 1) {
            z = true;
        }
        oo3Var2.b0 = z;
    }

    public void L(String str, Bitmap bitmap) {
        Integer num = (Integer) kr3.z.get(str);
        if (num != null && num.intValue() != 2) {
            ze0.k(qx1.m("The ", str, " key cannot be used to put a Bitmap"));
        } else {
            ((Bundle) this.y).putParcelable(str, bitmap);
        }
    }

    public void M(long j, String str) {
        Integer num = (Integer) kr3.z.get(str);
        if (num != null && num.intValue() != 0) {
            ze0.k(qx1.m("The ", str, " key cannot be used to put a long"));
        } else {
            ((Bundle) this.y).putLong(str, j);
        }
    }

    public void N(String str, ay4 ay4Var) {
        float f = ay4Var.y;
        Integer num = (Integer) kr3.z.get(str);
        if (num != null && num.intValue() != 3) {
            ze0.k(qx1.m("The ", str, " key cannot be used to put a Rating"));
            return;
        }
        Bundle bundle = (Bundle) this.y;
        Rating rating = ay4Var.z;
        if (rating == null) {
            boolean b = ay4Var.b();
            int i = ay4Var.x;
            if (b) {
                boolean z = true;
                switch (i) {
                    case 1:
                        if (i != 1 || f != 1.0f) {
                            z = false;
                        }
                        rating = Rating.newHeartRating(z);
                        ay4Var.z = rating;
                        break;
                    case 2:
                        if (i != 2 || f != 1.0f) {
                            z = false;
                        }
                        rating = Rating.newThumbRating(z);
                        ay4Var.z = rating;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        rating = Rating.newStarRating(i, ay4Var.a());
                        ay4Var.z = rating;
                        break;
                    case 6:
                        if (i != 6 || !ay4Var.b()) {
                            f = -1.0f;
                        }
                        rating = Rating.newPercentageRating(f);
                        ay4Var.z = rating;
                        break;
                    default:
                        rating = null;
                        break;
                }
            } else {
                rating = Rating.newUnratedRating(i);
                ay4Var.z = rating;
            }
        }
        bundle.putParcelable(str, rating);
    }

    public void O(String str, String str2) {
        Integer num = (Integer) kr3.z.get(str);
        if (num != null && num.intValue() != 1) {
            ze0.k(qx1.m("The ", str, " key cannot be used to put a String"));
        } else {
            ((Bundle) this.y).putCharSequence(str, str2);
        }
    }

    public void P(CharSequence charSequence, String str) {
        Integer num = (Integer) kr3.z.get(str);
        if (num != null && num.intValue() != 1) {
            ze0.k(qx1.m("The ", str, " key cannot be used to put a CharSequence"));
        } else {
            ((Bundle) this.y).putCharSequence(str, charSequence);
        }
    }

    public void Q() {
        View view;
        View view2 = (View) this.y;
        if (view2 != null) {
            if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
                view = view2.getRootView().findFocus();
            } else {
                view2.requestFocus();
                view = view2;
            }
            if (view == null) {
                view = view2.getRootView().findViewById(android.R.id.content);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new a92(view, (byte) 23));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [lo3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [oo3, java.lang.Object] */
    public void R(long j, int i, long j2) {
        po3 po3Var = (po3) this.y;
        po3Var.q0.getClass();
        if (i != 128) {
            if (i != 160) {
                if (i != 174) {
                    if (i != 187) {
                        if (i != 19899) {
                            if (i != 20533) {
                                if (i != 408125543) {
                                    if (i != 475249515) {
                                        if (i != 524531317) {
                                            if (i != 182) {
                                                if (i == 183 && !po3Var.C) {
                                                    po3Var.f(i);
                                                    po3Var.I = -1;
                                                    po3Var.J = -1L;
                                                    po3Var.K = -1L;
                                                    return;
                                                }
                                                return;
                                            }
                                            ?? obj = new Object();
                                            obj.b = -9223372036854775807L;
                                            obj.c = -9223372036854775807L;
                                            po3Var.A = obj;
                                            return;
                                        }
                                        if (po3Var.P != -1 && !po3Var.S) {
                                            po3Var.Q = true;
                                            return;
                                        } else {
                                            po3Var.l();
                                            return;
                                        }
                                    }
                                    if (!po3Var.C) {
                                        po3Var.G = true;
                                        return;
                                    }
                                    return;
                                }
                                long j3 = po3Var.u;
                                if (j3 != -1 && j3 != j) {
                                    throw bj4.a("Multiple Segment elements not supported", null);
                                }
                                po3Var.u = j;
                                po3Var.t = j2;
                                return;
                            }
                            po3Var.g(i);
                            po3Var.B.j = true;
                            return;
                        }
                        po3Var.D = -1;
                        po3Var.E = -1L;
                        return;
                    }
                    if (!po3Var.C) {
                        po3Var.f(i);
                        po3Var.H = -9223372036854775807L;
                        return;
                    }
                    return;
                }
                ?? obj2 = new Object();
                obj2.o = -1;
                obj2.p = -1;
                obj2.q = -1;
                obj2.r = -1;
                obj2.s = -1;
                obj2.t = 0;
                obj2.u = -1;
                obj2.v = 0.0f;
                obj2.w = 0.0f;
                obj2.x = 0.0f;
                obj2.y = null;
                obj2.z = -1;
                obj2.A = -1;
                obj2.B = -1;
                obj2.C = -1;
                obj2.D = UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
                obj2.E = 200;
                obj2.F = -1.0f;
                obj2.G = -1.0f;
                obj2.H = -1.0f;
                obj2.I = -1.0f;
                obj2.J = -1.0f;
                obj2.K = -1.0f;
                obj2.L = -1.0f;
                obj2.M = -1.0f;
                obj2.N = -1.0f;
                obj2.O = -1.0f;
                obj2.Q = 1;
                obj2.R = -1;
                obj2.S = -1;
                obj2.T = 8000;
                obj2.U = 0L;
                obj2.V = 0L;
                obj2.X = false;
                obj2.b0 = true;
                obj2.c0 = "eng";
                po3Var.B = obj2;
                obj2.a = po3Var.y;
                return;
            }
            po3Var.f0 = false;
            po3Var.g0 = 0L;
            return;
        }
        po3Var.j(i).h = null;
        po3Var.j(i).i = null;
    }

    public void S(int i, String str) {
        po3 po3Var = (po3) this.y;
        if (i != 133) {
            if (i != 134) {
                if (i != 17026) {
                    if (i != 17276) {
                        if (i != 21358) {
                            if (i != 2274716) {
                                return;
                            }
                            po3Var.g(i);
                            po3Var.B.c0 = str;
                            return;
                        }
                        po3Var.g(i);
                        po3Var.B.b = str;
                        return;
                    }
                    po3Var.j(i).i = str;
                    return;
                }
                if (!"webm".equals(str) && !"matroska".equals(str)) {
                    throw bj4.a("DocType " + str + " not supported", null);
                }
                po3Var.y = str.equals("webm");
                return;
            }
            po3Var.g(i);
            po3Var.B.c = str;
            return;
        }
        po3Var.j(i).h = str;
    }

    @Override // defpackage.ws6
    public void a(ns6 ns6Var) {
        l34 l34Var = (l34) this.y;
        l34Var.e.execute(new f32((Object) l34Var, (Object) ns6Var, (byte) 17));
    }

    @Override // defpackage.nr6, defpackage.kr6
    public boolean b() {
        return false;
    }

    @Override // defpackage.ws6
    public void c(int i, int i2) {
        ((l34) this.y).e.execute(new i34(this, i, i2, (byte) 0));
    }

    @Override // defpackage.ws6
    public void d(long j, boolean z) {
        if (j == 0) {
            ((l34) this.y).t = true;
        }
        l34 l34Var = (l34) this.y;
        l34Var.s = j;
        l34Var.e.execute(new j34(this, j, z, (byte) 0));
    }

    @Override // defpackage.kr6
    public long e(rl rlVar, rl rlVar2, rl rlVar3) {
        return ((zp2) this.y).e(rlVar, rlVar2, rlVar3);
    }

    @Override // defpackage.ws6
    public void f(float f) {
        ((l34) this.y).e.execute(new h34(this, f, (byte) 0));
    }

    @Override // defpackage.kj3
    public void g(mj3 mj3Var, long j, long j2, boolean z) {
        gj4 gj4Var = (gj4) mj3Var;
        wz2 wz2Var = (wz2) this.y;
        if (!wz2Var.a) {
            return;
        }
        ij3 a = wz2.a(gj4Var, j, j2);
        eb2 eb2Var = (eb2) wz2Var.g;
        eb2Var.getClass();
        eb2Var.p(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.sl
    public n42 get(int i) {
        return ((t42[]) this.y)[i];
    }

    @Override // defpackage.x37
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) t80.t(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.y).getWebkitToCompatConverter());
    }

    @Override // defpackage.w16
    public boolean i(ea2 ea2Var) {
        ea2Var.getClass();
        if (!a34.i(ea2Var.p, "application/x-sup") && !((p18) this.y).i(ea2Var)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.tn3
    public Object j(Object obj, Object obj2) {
        return ((qc2) this.y).apply(obj2);
    }

    @Override // defpackage.kj3
    public void k(mj3 mj3Var, long j, long j2) {
        gj4 gj4Var = (gj4) mj3Var;
        if (!((wz2) this.y).a) {
            return;
        }
        my5 my5Var = (my5) gj4Var.f;
        my5Var.getClass();
        wz2 wz2Var = (wz2) this.y;
        wz2Var.h = my5Var;
        ((k46) wz2Var.d).f(new sp5(this, my5Var, (byte) 2));
        wz2 wz2Var2 = (wz2) this.y;
        Uri uri = (Uri) wz2Var2.e;
        uri.getClass();
        Uri uri2 = my5Var.c;
        byte b = 0;
        if (uri2 != null) {
            String uri3 = uri2.toString();
            if (uri3 != null && et5.c(uri3)[0] != -1) {
                uri = uri2;
            } else {
                uri = et5.j(uri.toString(), uri2.toString());
            }
        }
        wz2Var2.e = uri;
        long j3 = my5Var.b;
        if (j3 == -9223372036854775807L) {
            j3 = 300000;
        }
        k46 k46Var = (k46) ((wz2) this.y).i;
        k46Var.getClass();
        k46Var.g(new ny5((wz2) this.y, b), j3);
        ij3 a = wz2.a(gj4Var, j, j2);
        eb2 eb2Var = (eb2) ((wz2) this.y).g;
        eb2Var.getClass();
        eb2Var.q(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.gp6
    public FileChannel l() {
        return new FileInputStream((File) this.y).getChannel();
    }

    @Override // defpackage.uu4
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.x37
    public String[] n() {
        return ((WebViewProviderFactoryBoundaryInterface) this.y).getSupportedFeatures();
    }

    @Override // defpackage.kr6
    public rl o(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        return ((zp2) this.y).o(j, rlVar, rlVar2, rlVar3);
    }

    @Override // defpackage.xc2
    public void onSuccess(Object obj) {
        dj6 dj6Var = (dj6) obj;
        h55 h55Var = (h55) this.y;
        long j = dj6Var.a;
        if (j != -9223372036854775807L && j != 0) {
            h55Var.u = dj6Var;
            String str = h55Var.o;
            str.getClass();
            h55Var.x = new t54(str, h55Var.n, h55Var.r, 1, dj6Var.c);
            String str2 = h55Var.p;
            long j2 = dj6Var.a;
            oq3 oq3Var = new oq3();
            oq3Var.a(eq6.U(eq6.l0(j2)));
            pq3 pq3Var = new pq3(oq3Var);
            nq3 nq3Var = new nq3();
            nq3Var.c(str2);
            nq3Var.f = pq3Var.a();
            pr1 pr1Var = new pr1(nq3Var.a());
            pr1Var.b = true;
            o15 s = nw2.s(new qr1(pr1Var));
            zw2 zw2Var = rr1.e;
            int i = zw2.z;
            rt3 rt3Var = new rt3(new oq5(2));
            ((jw2) rt3Var.y).d(s);
            ou0 a = new ou0(new rr1(rt3Var), new rr1[0]).a();
            t54 t54Var = h55Var.x;
            t54Var.getClass();
            h55Var.e(a, t54Var, 0L, true);
            return;
        }
        h55Var.d();
    }

    @Override // defpackage.uu4
    public void p(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.y).setResultCode(i);
    }

    @Override // defpackage.ws6
    public void q() {
        ((l34) this.y).b();
    }

    @Override // defpackage.kj3
    public void r(mj3 mj3Var, long j, long j2, int i) {
        gj4 gj4Var = (gj4) mj3Var;
        wz2 wz2Var = (wz2) this.y;
        if (!wz2Var.a) {
            return;
        }
        ij3 a = wz2.a(gj4Var, j, j2);
        eb2 eb2Var = (eb2) wz2Var.g;
        eb2Var.getClass();
        eb2Var.x(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.w16
    public y16 s(ea2 ea2Var) {
        ea2Var.getClass();
        if (a34.i(ea2Var.p, "application/x-sup")) {
            return new sn3((byte) 20);
        }
        return ((p18) this.y).s(ea2Var);
    }

    @Override // defpackage.xc2
    public void t(Throwable th) {
        ((h55) this.y).d();
    }

    public String toString() {
        switch (this.x) {
            case 4:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.y).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.rw5
    public Iterator u(i90 i90Var, CharSequence charSequence) {
        return new pw5(this, i90Var, charSequence, (byte) 0);
    }

    @Override // defpackage.ws6
    public void w() {
        ((l34) this.y).e.execute(new a92(this, (byte) 9));
    }

    @Override // defpackage.kr6
    public rl y(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        return ((zp2) this.y).y(j, rlVar, rlVar2, rlVar3);
    }

    @Override // defpackage.kr6
    public rl z(rl rlVar, rl rlVar2, rl rlVar3) {
        return ((zp2) this.y).z(rlVar, rlVar2, rlVar3);
    }

    @Override // defpackage.y16
    public void reset() {
    }

    public /* synthetic */ sn3(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    public sn3(float f, float f2, rl rlVar) {
        sl fq3Var;
        this.x = (byte) 26;
        int[] iArr = lr6.a;
        if (rlVar == null && f == 1.0f && f2 == 1500.0f) {
            fq3Var = qa1.x;
        } else if (rlVar != null) {
            fq3Var = new sn3(rlVar, f, f2);
        } else {
            fq3Var = new fq3(f, f2);
        }
        this.y = new zp2(fq3Var);
    }

    public sn3(cq6 cq6Var) {
        this.x = (byte) 21;
        this.y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), cq6Var);
    }

    public sn3(Context context, rt3 rt3Var) {
        this.x = (byte) 2;
        qt3 qt3Var = ((mt3) rt3Var.y).c;
        Collections.synchronizedSet(new HashSet());
        this.y = new eq3(context, qt3Var);
    }

    public sn3(int i) {
        this.x = (byte) 7;
        this.y = tx5.a(new int[i]);
    }

    public /* synthetic */ sn3(byte b, boolean z) {
        this.x = b;
    }

    public sn3(rl rlVar, float f, float f2) {
        this.x = (byte) 25;
        int b = rlVar.b();
        t42[] t42VarArr = new t42[b];
        for (int i = 0; i < b; i++) {
            t42VarArr[i] = new t42(f, f2, rlVar.a(i));
        }
        this.y = t42VarArr;
    }

    public sn3(SideSheetBehavior sideSheetBehavior) {
        this.x = (byte) 15;
        this.y = sideSheetBehavior;
        new a92(this, (byte) 21);
    }
}
