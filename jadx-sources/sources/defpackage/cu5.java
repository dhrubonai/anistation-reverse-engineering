package defpackage;

import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import com.anistation.model.settings.SubtitleFontFamily;
import com.anistation.model.update.AppUpdateCheck;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class cu5 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ cu5(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        Collection u0;
        String str;
        byte b = this.x;
        boolean z = false;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                eu5 eu5Var = (eu5) obj3;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = eu5Var.b;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        u0 = collection;
                    } else if (obj4 instanceof Set) {
                        u0 = te4.I(obj4, collection);
                    } else if (obj4 instanceof List) {
                        u0 = yo0.u0(te4.H(collection), (Collection) obj4);
                    } else {
                        eu0.b("Unexpected notification");
                        v71.e();
                        return null;
                    }
                    while (!atomicReference.compareAndSet(obj4, u0)) {
                        if (atomicReference.get() != obj4) {
                            break;
                        }
                    }
                    if (eu5Var.c()) {
                        eu5Var.a.invoke(new nj4(eu5Var, (byte) 26));
                    }
                    return pn6Var;
                    break;
                }
            case 1:
                String str2 = (String) obj;
                List list = (List) obj2;
                str2.getClass();
                list.getClass();
                ((qt0) obj3).j(str2, list);
                return pn6Var;
            case 2:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                int U = uz5.U(charSequence, (char[]) obj3, intValue, false);
                if (U < 0) {
                    return null;
                }
                return new ai4(Integer.valueOf(U), 1);
            case 3:
                l16 l16Var = (l16) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (kd2Var.V(intValue2 & 1, z)) {
                    yc6.b(l16Var.a, null, ((mp0) kd2Var.j(op0.a)).o, 0L, s92.D, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var.j(pl6.a)).n, kd2Var, 1572864, 0, 131002);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 4:
                SubtitleFontFamily subtitleFontFamily = (SubtitleFontFamily) obj3;
                kd2 kd2Var2 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                }
                if (kd2Var2.V(intValue3 & 1, z)) {
                    yc6.b(subtitleFontFamily.getDisplayName(), null, ((mp0) kd2Var2.j(op0.a)).o, 0L, s92.D, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(pl6.a)).n, kd2Var2, 1572864, 0, 131002);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 5:
                kd2 kd2Var3 = (kd2) obj;
                ((Integer) obj2).intValue();
                kd2Var3.e0(950061013);
                String valueOf = String.valueOf(((TextClassification) obj3).getLabel());
                kd2Var3.q(false);
                return valueOf;
            case 6:
                kd2 kd2Var4 = (kd2) obj;
                ((Integer) obj2).intValue();
                kd2Var4.e0(-1376593684);
                String obj5 = ((RemoteAction) obj3).getTitle().toString();
                kd2Var4.q(false);
                return obj5;
            case 7:
                ((Integer) obj2).getClass();
                ((hd6) obj3).a(kb0.N(1), (kd2) obj);
                return pn6Var;
            case 8:
                String str3 = (String) obj;
                List list2 = (List) obj2;
                str3.getClass();
                list2.getClass();
                ((hm6) obj3).i.j(str3, list2);
                return pn6Var;
            case 9:
                ((Integer) obj2).getClass();
                nx7.k((AppUpdateCheck) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 10:
                cu5 cu5Var = (cu5) obj3;
                String str4 = (String) obj;
                List list3 = (List) obj2;
                str4.getClass();
                list3.getClass();
                if (!"Content-Length".equals(str4) && !"Content-Type".equals(str4)) {
                    if (nq6.a.contains(str4)) {
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            cu5Var.invoke(str4, (String) it.next());
                        }
                    } else {
                        if ("Cookie".equals(str4)) {
                            str = "; ";
                        } else {
                            str = ",";
                        }
                        cu5Var.invoke(str4, yo0.q0(list3, str, null, null, null, 62));
                    }
                }
                return pn6Var;
            case 11:
                eo3 eo3Var = (eo3) obj3;
                String str5 = (String) obj;
                String str6 = (String) obj2;
                str5.getClass();
                str6.getClass();
                if (!str5.equals("Content-Length") && !str5.equals("Expect")) {
                    eo3Var.s(str5, str6);
                }
                return pn6Var;
            case 12:
                return new c13(((w50) obj3).a(0, (int) (((k13) obj).a >> 32), (ia3) obj2) << 32);
            case 13:
                return new c13(((x50) obj3).a(0, (int) (((k13) obj).a & 4294967295L)) & 4294967295L);
            default:
                return new c13(((e7) obj3).a(0L, ((k13) obj).a, (ia3) obj2));
        }
    }

    public /* synthetic */ cu5(Object obj, int i, byte b) {
        this.x = b;
        this.y = obj;
    }
}
