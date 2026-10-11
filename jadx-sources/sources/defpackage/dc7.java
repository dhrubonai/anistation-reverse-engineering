package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dc7 implements Runnable {
    public final /* synthetic */ io7 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    public /* synthetic */ dc7(io7 io7Var, String str, long j, byte b) {
        this.x = b;
        this.y = str;
        this.z = j;
        this.A = io7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        long j = this.z;
        String str = this.y;
        io7 io7Var = this.A;
        switch (b) {
            case 0:
                io7Var.L();
                a34.u(str);
                js jsVar = io7Var.z;
                if (jsVar.isEmpty()) {
                    io7Var.A = j;
                }
                Integer num = (Integer) jsVar.get(str);
                if (num != null) {
                    jsVar.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                }
                if (jsVar.z >= 100) {
                    es7 es7Var = ((gu7) io7Var.x).C;
                    gu7.l(es7Var);
                    es7Var.F.a("Too many ads visible");
                    return;
                } else {
                    jsVar.put(str, 1);
                    io7Var.y.put(str, Long.valueOf(j));
                    return;
                }
            default:
                io7Var.L();
                a34.u(str);
                js jsVar2 = io7Var.z;
                Integer num2 = (Integer) jsVar2.get(str);
                gu7 gu7Var = (gu7) io7Var.x;
                if (num2 != null) {
                    py7 py7Var = gu7Var.I;
                    es7 es7Var2 = gu7Var.C;
                    gu7.k(py7Var);
                    dy7 P = py7Var.P(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue == 0) {
                        jsVar2.remove(str);
                        js jsVar3 = io7Var.y;
                        Long l = (Long) jsVar3.get(str);
                        if (l == null) {
                            gu7.l(es7Var2);
                            es7Var2.C.a("First ad unit exposure time was never set");
                        } else {
                            long longValue = j - l.longValue();
                            jsVar3.remove(str);
                            io7Var.Q(str, longValue, P);
                        }
                        if (jsVar2.isEmpty()) {
                            long j2 = io7Var.A;
                            if (j2 == 0) {
                                gu7.l(es7Var2);
                                es7Var2.C.a("First ad exposure time was never set");
                                return;
                            } else {
                                io7Var.P(j - j2, P);
                                io7Var.A = 0L;
                                return;
                            }
                        }
                        return;
                    }
                    jsVar2.put(str, Integer.valueOf(intValue));
                    return;
                }
                es7 es7Var3 = gu7Var.C;
                gu7.l(es7Var3);
                es7Var3.C.b(str, "Call to endAdUnitExposure for unknown ad unit id");
                return;
        }
    }
}
