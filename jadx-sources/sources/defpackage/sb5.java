package defpackage;

import java.time.LocalDate;
import java.time.ZoneId;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sb5 extends vv6 {
    public final pn b;
    public final sx5 c;

    public sb5(pn pnVar) {
        this.b = pnVar;
        LocalDate localDate = an6.a;
        localDate.getClass();
        ZoneId zoneId = an6.b;
        long epochSecond = localDate.atStartOfDay(zoneId).toEpochSecond();
        long epochSecond2 = localDate.atTime(23, 59, 59).atZone(zoneId).toEpochSecond();
        String format = localDate.format(an6.c);
        format.getClass();
        sx5 a = tx5.a(new vm6(localDate, epochSecond, epochSecond2, format, ot1.x));
        this.c = a;
        vm6 vm6Var = (vm6) a.getValue();
        e(vm6Var.b, vm6Var.d, vm6Var.c);
    }

    public final void e(long j, String str, long j2) {
        tl7.z(zz.J(this), null, null, new rb5(this, j, j2, str, null), 3);
    }
}
