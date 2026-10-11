package q2;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import f1.b0;
import java.util.ArrayList;
import r6.n1;
import r6.o0;

/* loaded from: classes.dex */
public final class o extends k {
    public static final Parcelable.Creator<o> CREATOR = new b(8);

    /* renamed from: b, reason: collision with root package name */
    public final String f9117b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f9118c;

    public o(String str, String str2, n1 n1Var) {
        super(str);
        w7.b.g(!n1Var.isEmpty());
        this.f9117b = str2;
        o0 j4 = o0.j(n1Var);
        this.f9118c = j4;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // q2.k, c1.o0
    public final void a(m0 m0Var) {
        char c6;
        Integer num;
        String str = this.f9106a;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c6 = 5;
                    break;
                }
                c6 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c6 = 6;
                    break;
                }
                c6 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c6 = 7;
                    break;
                }
                c6 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c6 = '\b';
                    break;
                }
                c6 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c6 = '\t';
                    break;
                }
                c6 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c6 = '\n';
                    break;
                }
                c6 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c6 = 11;
                    break;
                }
                c6 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c6 = '\f';
                    break;
                }
                c6 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c6 = '\r';
                    break;
                }
                c6 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c6 = 14;
                    break;
                }
                c6 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c6 = 15;
                    break;
                }
                c6 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c6 = 16;
                    break;
                }
                c6 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c6 = 17;
                    break;
                }
                c6 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c6 = 18;
                    break;
                }
                c6 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c6 = 19;
                    break;
                }
                c6 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c6 = 20;
                    break;
                }
                c6 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c6 = 21;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        o0 o0Var = this.f9118c;
        try {
            switch (c6) {
                case 0:
                case '\n':
                    m0Var.c((CharSequence) o0Var.get(0));
                    return;
                case 1:
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    m0Var.e((CharSequence) o0Var.get(0));
                    return;
                case 2:
                case '\f':
                    String str2 = (String) o0Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    m0Var.h(Integer.valueOf(parseInt));
                    m0Var.g(Integer.valueOf(parseInt2));
                    return;
                case 3:
                case 17:
                    m0Var.d((CharSequence) o0Var.get(0));
                    return;
                case 4:
                case 18:
                    m0Var.b((CharSequence) o0Var.get(0));
                    return;
                case 5:
                case 19:
                    m0Var.f((CharSequence) o0Var.get(0));
                    return;
                case 6:
                case 20:
                    String[] a02 = b0.a0((String) o0Var.get(0));
                    int parseInt3 = Integer.parseInt(a02[0]);
                    if (a02.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(a02[1]));
                    } else {
                        num = null;
                    }
                    m0Var.o(Integer.valueOf(parseInt3));
                    m0Var.n(num);
                    return;
                case zzaja.zze.zzg /* 7 */:
                case 16:
                    m0Var.m((CharSequence) o0Var.get(0));
                    return;
                case '\b':
                case 15:
                    m0Var.p((CharSequence) o0Var.get(0));
                    return;
                case '\t':
                case 21:
                    m0Var.i(Integer.valueOf(Integer.parseInt((String) o0Var.get(0))));
                    return;
                case '\r':
                    ArrayList d10 = d((String) o0Var.get(0));
                    int size = d10.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                m0Var.g((Integer) d10.get(2));
                            } else {
                                return;
                            }
                        }
                        m0Var.h((Integer) d10.get(1));
                    }
                    m0Var.i((Integer) d10.get(0));
                    return;
                case 14:
                    ArrayList d11 = d((String) o0Var.get(0));
                    int size2 = d11.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                m0Var.j((Integer) d11.get(2));
                            } else {
                                return;
                            }
                        }
                        m0Var.k((Integer) d11.get(1));
                    }
                    m0Var.l((Integer) d11.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (b0.a(this.f9106a, oVar.f9106a) && b0.a(this.f9117b, oVar.f9117b) && this.f9118c.equals(oVar.f9118c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f9106a.hashCode() + 527) * 31;
        String str = this.f9117b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f9118c.hashCode() + ((hashCode + i10) * 31);
    }

    @Override // q2.k
    public final String toString() {
        return this.f9106a + ": description=" + this.f9117b + ": values=" + this.f9118c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9106a);
        parcel.writeString(this.f9117b);
        parcel.writeStringArray((String[]) this.f9118c.toArray(new String[0]));
    }
}
