package u;

import a8.h;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import g0.n0;
import g0.y0;
import java.util.Comparator;
import java.util.WeakHashMap;
import m3.p;
import r6.h0;

/* loaded from: classes.dex */
public final class f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10120a;

    public /* synthetic */ f(int i10) {
        this.f10120a = i10;
    }

    public final int a(h hVar, h hVar2) {
        switch (this.f10120a) {
            case 4:
                return Integer.compare(z7.c.v(hVar2.f198a), z7.c.v(hVar.f198a));
            case 5:
            default:
                return Integer.compare(h0.a(hVar2), h0.a(hVar));
            case 6:
                return Integer.compare(h0.a(hVar2), h0.a(hVar));
        }
    }

    public final int b(View view, View view2) {
        switch (this.f10120a) {
            case 0:
                WeakHashMap weakHashMap = y0.f4277a;
                float m5 = n0.m(view);
                float m9 = n0.m(view2);
                if (m5 > m9) {
                    return -1;
                }
                if (m5 < m9) {
                    return 1;
                }
                return 0;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z9;
        boolean z10;
        switch (this.f10120a) {
            case 0:
                return b((View) obj, (View) obj2);
            case 1:
                p pVar = (p) obj;
                p pVar2 = (p) obj2;
                RecyclerView recyclerView = pVar.f7337d;
                if (recyclerView == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (pVar2.f7337d == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 != z10) {
                    if (recyclerView != null) {
                        return -1;
                    }
                } else {
                    boolean z11 = pVar.f7334a;
                    if (z11 != pVar2.f7334a) {
                        if (z11) {
                            return -1;
                        }
                    } else {
                        int i10 = pVar2.f7335b - pVar.f7335b;
                        if (i10 == 0) {
                            int i11 = pVar.f7336c - pVar2.f7336c;
                            if (i11 == 0) {
                                return 0;
                            }
                            return i11;
                        }
                        return i10;
                    }
                }
                return 1;
            case 2:
                return ((Scope) obj).f2355b.compareTo(((Scope) obj2).f2355b);
            case 3:
                return b((View) obj, (View) obj2);
            case 4:
                return a((h) obj, (h) obj2);
            case 5:
                return Long.compare(((z7.b) obj2).f12103w, ((z7.b) obj).f12103w);
            case 6:
                return a((h) obj, (h) obj2);
            case zzaja.zze.zzg /* 7 */:
                return a((h) obj, (h) obj2);
            case 8:
                a8.g gVar = (a8.g) obj;
                a8.g gVar2 = (a8.g) obj2;
                boolean equalsIgnoreCase = "en".equalsIgnoreCase(gVar.f196b);
                if (equalsIgnoreCase != "en".equalsIgnoreCase(gVar2.f196b)) {
                    if (equalsIgnoreCase) {
                        return -1;
                    }
                    return 1;
                }
                return gVar.f197c.compareToIgnoreCase(gVar2.f197c);
            case 9:
                return ((String[]) obj)[0].compareTo(((String[]) obj2)[0]);
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                h0.u(str, "a");
                h0.u(str2, "b");
                int min = Math.min(str.length(), str2.length());
                int i12 = 4;
                while (true) {
                    if (i12 < min) {
                        char charAt = str.charAt(i12);
                        char charAt2 = str2.charAt(i12);
                        if (charAt != charAt2) {
                            if (h0.B(charAt, charAt2) < 0) {
                                return -1;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length < length2) {
                            return -1;
                        }
                    }
                }
                return 1;
        }
    }
}
