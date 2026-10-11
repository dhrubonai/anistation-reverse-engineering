package defpackage;

import com.anistation.model.library.WatchProgress;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h01 implements sb2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h01(Object obj, Object obj2, Object obj3, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj = this.A;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                w44 w44Var = (w44) obj2;
                w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
                if (((Boolean) w44Var.getValue()).booleanValue()) {
                    w44 w44Var2 = (w44) obj;
                    w44Var2.setValue(el5.W((Set) w44Var2.getValue(), ((WatchProgress) obj3).getAnimeId()));
                }
                return pn6Var;
            default:
                LocalDate localDate = (LocalDate) obj2;
                String format = localDate.format((DateTimeFormatter) obj);
                format.getClass();
                ((ic2) obj3).invoke(localDate, format);
                return pn6Var;
        }
    }
}
