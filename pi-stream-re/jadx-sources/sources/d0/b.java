package d0;

import c1.v;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import j3.k0;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l8.r0;
import r6.c0;
import r6.m1;
import y1.l;
import y1.o;
import y1.p;
import z1.s;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3012a;

    public /* synthetic */ b(int i10) {
        this.f3012a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z9;
        boolean z10;
        int i10 = -1;
        switch (this.f3012a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    byte b10 = bArr[i11];
                    byte b11 = bArr2[i11];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 1:
                n1.b bVar = (n1.b) obj;
                n1.b bVar2 = (n1.b) obj2;
                int compare = Integer.compare(bVar.f7906c, bVar2.f7906c);
                if (compare == 0) {
                    return bVar.f7905b.compareTo(bVar2.f7905b);
                }
                return compare;
            case 2:
                return ((v) obj2).f1931i - ((v) obj).f1931i;
            case 3:
                return ((y1.f) Collections.max((List) obj)).compareTo((y1.f) Collections.max((List) obj2));
            case 4:
                List list = (List) obj;
                List list2 = (List) obj2;
                return c0.f(new b(11).compare((o) Collections.max(list, new b(9)), (o) Collections.max(list2, new b(10)))).a(list.size(), list2.size()).b((o) Collections.max(list, new b(12)), (o) Collections.max(list2, new b(13)), new b(14)).e();
            case 5:
                return ((l) ((List) obj).get(0)).compareTo((l) ((List) obj2).get(0));
            case 6:
                return Integer.compare(((y1.g) ((List) obj).get(0)).f11497f, ((y1.g) ((List) obj2).get(0)).f11497f);
            case zzaja.zze.zzg /* 7 */:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                m1 m1Var = p.f11515j;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                m1 m1Var2 = p.f11515j;
                return 0;
            case 9:
                return o.d((o) obj, (o) obj2);
            case 10:
                return o.d((o) obj, (o) obj2);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return o.d((o) obj, (o) obj2);
            case 12:
                return o.c((o) obj, (o) obj2);
            case 13:
                return o.c((o) obj, (o) obj2);
            case 14:
                return o.c((o) obj, (o) obj2);
            case 15:
                return ((s) obj).f11951a - ((s) obj2).f11951a;
            case 16:
                return Float.compare(((s) obj).f11953c, ((s) obj2).f11953c);
            case 17:
            default:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 18:
                return Integer.compare(((z2.d) obj2).f11995b, ((z2.d) obj).f11995b);
            case 19:
                return Integer.compare(((g3.d) obj).f4365a.f4368b, ((g3.d) obj2).f4365a.f4368b);
            case 20:
                return Long.compare(((g3.c) obj).f4362b, ((g3.c) obj2).f4362b);
            case 21:
                k0 k0Var = (k0) obj;
                k0 k0Var2 = (k0) obj2;
                int compare2 = Integer.compare(k0Var2.f6034b, k0Var.f6034b);
                if (compare2 == 0) {
                    int compareTo = k0Var.f6035c.compareTo(k0Var2.f6035c);
                    if (compareTo == 0) {
                        return k0Var.f6036d.compareTo(k0Var2.f6036d);
                    }
                    return compareTo;
                }
                return compare2;
            case 22:
                k0 k0Var3 = (k0) obj;
                k0 k0Var4 = (k0) obj2;
                int compare3 = Integer.compare(k0Var4.f6033a, k0Var3.f6033a);
                if (compare3 == 0) {
                    int compareTo2 = k0Var4.f6035c.compareTo(k0Var3.f6035c);
                    if (compareTo2 == 0) {
                        return k0Var4.f6036d.compareTo(k0Var3.f6036d);
                    }
                    return compareTo2;
                }
                return compare3;
            case 23:
                return Long.compare(((a8.b) obj2).K, ((a8.b) obj).K);
            case 24:
                z7.b bVar3 = (z7.b) obj;
                z7.b bVar4 = (z7.b) obj2;
                int i12 = l8.d.f6901t0;
                int i13 = bVar3.f12087f;
                int i14 = bVar4.f12087f;
                if (i13 != i14) {
                    return Integer.compare(i13, i14);
                }
                return Integer.compare(bVar3.f12088g, bVar4.f12088g);
            case 25:
                a8.b bVar5 = (a8.b) obj;
                a8.b bVar6 = (a8.b) obj2;
                int i15 = r0.D0;
                String str = bVar5.M;
                if (str != null && !str.isEmpty()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                String str2 = bVar6.M;
                if (str2 != null && !str2.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 != z10) {
                    if (!z9) {
                        i10 = 1;
                    }
                    return i10;
                }
                if (!z9) {
                    return 0;
                }
                return bVar5.M.compareTo(bVar6.M);
        }
    }
}
