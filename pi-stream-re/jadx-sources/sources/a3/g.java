package a3;

import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.s0;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.RecyclerView;
import c1.u;
import com.google.android.gms.internal.p002firebaseauthapi.zzxr;
import d2.g0;
import f1.o;
import f1.t;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static void A(String str, int i10, String str2) {
        o.f(str2, str + i10);
    }

    public static /* synthetic */ void B(z6.g gVar) {
        if (gVar != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void C(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ String D(int i10) {
        return i10 == 1 ? "NONE" : i10 == 2 ? "ADDING" : i10 == 3 ? "REMOVING" : "null";
    }

    public static /* synthetic */ String E(int i10) {
        return i10 == 1 ? "REMOVED" : i10 == 2 ? "VISIBLE" : i10 == 3 ? "GONE" : i10 == 4 ? "INVISIBLE" : "null";
    }

    public static void a(g0 g0Var, t tVar, int i10) {
        g0Var.e(i10, 0, tVar);
    }

    public static final void b(int i10, View view) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            if (s0.H(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                            }
                            view.setVisibility(4);
                            return;
                        }
                        return;
                    }
                    if (s0.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (s0.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                }
                view.setVisibility(0);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (s0.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        throw null;
    }

    public static int c(int i10) {
        if (i10 != 0) {
            if (i10 == 4) {
                return 4;
            }
            if (i10 == 8) {
                return 3;
            }
            throw new IllegalArgumentException(n("Unknown visibility ", i10));
        }
        return 2;
    }

    public static int d(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return c(view.getVisibility());
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return i10 | i11 | i12 | 0 | 128 | i13;
    }

    public static int f(int i10) {
        return i10 & 384;
    }

    public static int g(int i10) {
        return i10 & 64;
    }

    public static /* synthetic */ boolean h(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ long i(int i10) {
        if (i10 == 1) {
            return 0L;
        }
        if (i10 == 2) {
            return 1L;
        }
        if (i10 == 3) {
            return 2L;
        }
        if (i10 == 4) {
            return 3L;
        }
        if (i10 == 5) {
            return 4L;
        }
        throw null;
    }

    public static int j(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static u k(String str) {
        u uVar = new u();
        uVar.e(str);
        return uVar;
    }

    public static zzxr l(Integer num, ByteBuffer byteBuffer) {
        return zzxr.zza(byteBuffer.putInt(num.intValue()).array());
    }

    public static String m(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.B());
        return sb.toString();
    }

    public static String n(String str, int i10) {
        return str + i10;
    }

    public static String o(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String p(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String q(String str, long j4) {
        return str + j4;
    }

    public static String r(String str, y yVar, String str2) {
        return str + yVar + str2;
    }

    public static String s(String str, String str2) {
        return str + str2;
    }

    public static String t(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder u(String str, int i10, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }

    public static void v(int i10, int i11, float f10, LinearLayout linearLayout, TextView textView) {
        linearLayout.addView(textView, new LinearLayout.LayoutParams(i10, i11, f10));
    }

    public static void w(int i10, int i11, LinearLayout linearLayout, LinearLayout linearLayout2) {
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(i10, i11));
    }

    public static void x(int i10, HashMap hashMap, String str, int i11, String str2, int i12, String str3, int i13, String str4) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
        hashMap.put(str3, Integer.valueOf(i12));
        hashMap.put(str4, Integer.valueOf(i13));
    }

    public static /* synthetic */ void y(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void z(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }
}
