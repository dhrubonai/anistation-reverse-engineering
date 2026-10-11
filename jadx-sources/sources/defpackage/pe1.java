package defpackage;

import com.anistation.model.Info;
import com.anistation.model.Resource;
import com.anistation.model.animelist.WatchStatus;
import java.time.LocalDate;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class pe1 extends uc2 implements kc2 {
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.x = b;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        Resource.Success success;
        Info info;
        Object value;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                WatchStatus watchStatus = (WatchStatus) obj4;
                pf1 pf1Var = (pf1) this.receiver;
                Resource resource = ((zm6) pf1Var.f.getValue()).a;
                if (resource instanceof Resource.Success) {
                    success = (Resource.Success) resource;
                } else {
                    success = null;
                }
                if (success != null && (info = (Info) success.getData()) != null) {
                    tl7.z(zz.J(pf1Var), null, null, new of1(pf1Var, info, num, intValue, intValue2, watchStatus, null, (byte) 0), 3);
                }
                return pn6Var;
            default:
                LocalDate localDate = (LocalDate) obj;
                long longValue = ((Number) obj2).longValue();
                long longValue2 = ((Number) obj3).longValue();
                String str = (String) obj4;
                localDate.getClass();
                str.getClass();
                sb5 sb5Var = (sb5) this.receiver;
                sb5Var.getClass();
                sx5 sx5Var = sb5Var.c;
                do {
                    value = sx5Var.getValue();
                } while (!sx5Var.j(value, vm6.a((vm6) value, localDate, longValue, longValue2, str, null, 16)));
                if (!(((Resource) ((vm6) sx5Var.getValue()).e.get(str)) instanceof Resource.Success)) {
                    sb5Var.e(longValue, str, longValue2);
                }
                return pn6Var;
        }
    }
}
