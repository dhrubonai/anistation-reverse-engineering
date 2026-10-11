package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class db6 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public byte y;
    public final /* synthetic */ jb6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db6(jb6 jb6Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = jb6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        jb6 jb6Var = this.z;
        switch (b) {
            case 0:
                db6 db6Var = new db6(jb6Var, vz0Var, (byte) 0);
                long j = ((xc4) obj).a;
                return db6Var;
            default:
                return new db6(jb6Var, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                long j = ((xc4) obj).a;
                return new db6(this.z, (vz0) obj2, (byte) 0).invokeSuspend(pn6Var);
            default:
                return ((db6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        CharSequence text;
        ArrayList arrayList;
        int i;
        Spanned spanned;
        long j;
        long h;
        int i2;
        int i3;
        long j2;
        long h2;
        int i4;
        int i5;
        ko koVar;
        byte b = this.x;
        w11 w11Var = w11.x;
        byte b2 = 1;
        jb6 jb6Var = this.z;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                byte b3 = this.y;
                if (b3 != 0) {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            m37.N(obj);
                            return pn6Var;
                        }
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m37.N(obj);
                } else {
                    m37.N(obj);
                    this.y = (byte) 1;
                    if (jb6Var.t(this) == w11Var) {
                        return w11Var;
                    }
                }
                ai4 f = jb6Var.f();
                if (f != null) {
                    String str = (String) f.x;
                    long j3 = ((nd6) f.y).a;
                    bn4 bn4Var = jb6Var.i;
                    if (bn4Var != null) {
                        this.y = (byte) 2;
                        Object d = bn4Var.d(str, j3, this);
                        if (d != w11Var) {
                            d = pn6Var;
                        }
                        if (d == w11Var) {
                            return w11Var;
                        }
                    }
                }
                return pn6Var;
            default:
                byte b4 = this.y;
                if (b4 != 0) {
                    if (b4 != 1) {
                        if (b4 == 2) {
                            m37.N(obj);
                            obj3 = obj;
                            koVar = (ko) obj3;
                            if (koVar != null && jb6Var.h()) {
                                io ioVar = new io(gv5.f(jb6Var.l(), jb6Var.l().a.y.length()));
                                ioVar.a(koVar);
                                ko e = ioVar.e();
                                ko e2 = gv5.e(jb6Var.l(), jb6Var.l().a.y.length());
                                io ioVar2 = new io(e);
                                ioVar2.a(e2);
                                ko e3 = ioVar2.e();
                                int length = koVar.y.length() + nd6.g(jb6Var.l().b);
                                jb6Var.c.invoke(jb6.b(e3, fy5.a(length, length)));
                                jb6Var.r(hj2.x);
                                jb6Var.a.e = true;
                            }
                            return pn6Var;
                        }
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m37.N(obj);
                    obj2 = obj;
                } else {
                    m37.N(obj);
                    kn0 kn0Var = jb6Var.g;
                    if (kn0Var != null) {
                        this.y = (byte) 1;
                        ClipData primaryClip = ((x9) kn0Var).a.s().getPrimaryClip();
                        if (primaryClip != null) {
                            obj2 = new in0(primaryClip);
                        } else {
                            obj2 = null;
                        }
                        if (obj2 == w11Var) {
                            return w11Var;
                        }
                    }
                    return pn6Var;
                }
                in0 in0Var = (in0) obj2;
                if (in0Var != null) {
                    this.y = (byte) 2;
                    int i6 = 0;
                    ClipData.Item itemAt = in0Var.a.getItemAt(0);
                    if (itemAt != null && (text = itemAt.getText()) != null) {
                        if (!(text instanceof Spanned)) {
                            obj3 = new ko(text.toString());
                        } else {
                            Spanned spanned2 = (Spanned) text;
                            Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, spanned2.length(), Annotation.class);
                            ArrayList arrayList2 = new ArrayList();
                            annotationArr.getClass();
                            int length2 = annotationArr.length - 1;
                            if (length2 >= 0) {
                                int i7 = 0;
                                while (true) {
                                    Annotation annotation = annotationArr[i7];
                                    if (!a34.i(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                        i = i6;
                                        spanned = spanned2;
                                    } else {
                                        int spanStart = spanned2.getSpanStart(annotation);
                                        int spanEnd = spanned2.getSpanEnd(annotation);
                                        String value = annotation.getValue();
                                        Parcel obtain = Parcel.obtain();
                                        byte[] decode = Base64.decode(value, i6);
                                        obtain.unmarshall(decode, i6, decode.length);
                                        obtain.setDataPosition(i6);
                                        long j4 = ep0.i;
                                        long j5 = j4;
                                        long j6 = ee6.c;
                                        long j7 = j6;
                                        s92 s92Var = null;
                                        o92 o92Var = null;
                                        p92 p92Var = null;
                                        String str2 = null;
                                        z30 z30Var = null;
                                        oc6 oc6Var = null;
                                        g96 g96Var = null;
                                        km5 km5Var = null;
                                        while (obtain.dataAvail() > b2) {
                                            byte readByte = obtain.readByte();
                                            if (readByte == b2) {
                                                if (obtain.dataAvail() >= 8) {
                                                    int i8 = ep0.j;
                                                    long readLong = obtain.readLong();
                                                    long j8 = readLong & 63;
                                                    if (j8 < 16) {
                                                        j4 = readLong;
                                                    } else {
                                                        j4 = (readLong & (-64)) | (j8 + 1);
                                                    }
                                                } else {
                                                    i = i6;
                                                    spanned = spanned2;
                                                    arrayList2.add(new jo(spanStart, spanEnd, new pv5(j4, j6, s92Var, o92Var, p92Var, (q82) null, str2, j7, z30Var, oc6Var, (fk3) null, j5, g96Var, km5Var, 49152)));
                                                }
                                            } else {
                                                i = i6;
                                                spanned = spanned2;
                                                if (readByte == 2) {
                                                    if (obtain.dataAvail() >= 5) {
                                                        byte readByte2 = obtain.readByte();
                                                        if (readByte2 == b2) {
                                                            j = 4294967296L;
                                                        } else if (readByte2 == 2) {
                                                            j = 8589934592L;
                                                        } else {
                                                            j = 0;
                                                        }
                                                        if (fe6.a(j, 0L)) {
                                                            h = ee6.c;
                                                        } else {
                                                            h = hz5.h(obtain.readFloat(), j);
                                                        }
                                                        j6 = h;
                                                        i6 = i;
                                                        spanned2 = spanned;
                                                        b2 = 1;
                                                    } else {
                                                        arrayList2.add(new jo(spanStart, spanEnd, new pv5(j4, j6, s92Var, o92Var, p92Var, (q82) null, str2, j7, z30Var, oc6Var, (fk3) null, j5, g96Var, km5Var, 49152)));
                                                    }
                                                } else if (readByte == 3) {
                                                    if (obtain.dataAvail() >= 4) {
                                                        spanned2 = spanned;
                                                        s92Var = new s92(obtain.readInt());
                                                        b2 = 1;
                                                        i6 = i;
                                                    } else {
                                                        arrayList2.add(new jo(spanStart, spanEnd, new pv5(j4, j6, s92Var, o92Var, p92Var, (q82) null, str2, j7, z30Var, oc6Var, (fk3) null, j5, g96Var, km5Var, 49152)));
                                                    }
                                                } else if (readByte == 4) {
                                                    b2 = 1;
                                                    if (obtain.dataAvail() >= 1) {
                                                        byte readByte3 = obtain.readByte();
                                                        if (readByte3 == 0 || readByte3 != 1) {
                                                            i2 = i;
                                                        } else {
                                                            i2 = 1;
                                                        }
                                                        o92 o92Var2 = new o92(i2);
                                                        i6 = i;
                                                        o92Var = o92Var2;
                                                        spanned2 = spanned;
                                                    } else {
                                                        arrayList2.add(new jo(spanStart, spanEnd, new pv5(j4, j6, s92Var, o92Var, p92Var, (q82) null, str2, j7, z30Var, oc6Var, (fk3) null, j5, g96Var, km5Var, 49152)));
                                                    }
                                                } else if (readByte == 5) {
                                                    if (obtain.dataAvail() >= 1) {
                                                        byte readByte4 = obtain.readByte();
                                                        if (readByte4 != 0) {
                                                            if (readByte4 == 1) {
                                                                i3 = 65535;
                                                            } else if (readByte4 == 3) {
                                                                i3 = 2;
                                                            } else if (readByte4 == 2) {
                                                                i3 = 1;
                                                            }
                                                            p92 p92Var2 = new p92(i3);
                                                            i6 = i;
                                                            p92Var = p92Var2;
                                                            b2 = 1;
                                                            spanned2 = spanned;
                                                        }
                                                        i3 = i;
                                                        p92 p92Var22 = new p92(i3);
                                                        i6 = i;
                                                        p92Var = p92Var22;
                                                        b2 = 1;
                                                        spanned2 = spanned;
                                                    } else {
                                                        arrayList2.add(new jo(spanStart, spanEnd, new pv5(j4, j6, s92Var, o92Var, p92Var, (q82) null, str2, j7, z30Var, oc6Var, (fk3) null, j5, g96Var, km5Var, 49152)));
                                                    }
                                                } else {
                                                    if (readByte == 6) {
                                                        str2 = obtain.readString();
                                                    } else if (readByte == 7) {
                                                        if (obtain.dataAvail() >= 5) {
                                                            byte readByte5 = obtain.readByte();
                                                            if (readByte5 == 1) {
                                                                j2 = 4294967296L;
                                                            } else if (readByte5 == 2) {
                                                                j2 = 8589934592L;
                                                            } else {
                                                                j2 = 0;
                                                            }
                                                            if (fe6.a(j2, 0L)) {
                                                                h2 = ee6.c;
                                                            } else {
                                                                h2 = hz5.h(obtain.readFloat(), j2);
                                                            }
                                                            j7 = h2;
                                                        } else {
                                                            arrayList2.add(new jo(spanStart, spanEnd, new pv5(j4, j6, s92Var, o92Var, p92Var, (q82) null, str2, j7, z30Var, oc6Var, (fk3) null, j5, g96Var, km5Var, 49152)));
                                                        }
                                                    } else {
                                                        if (readByte == 8) {
                                                            if (obtain.dataAvail() >= 4) {
                                                                i6 = i;
                                                                z30Var = new z30(obtain.readFloat());
                                                                b2 = 1;
                                                                spanned2 = spanned;
                                                            }
                                                        } else if (readByte == 9) {
                                                            if (obtain.dataAvail() >= 8) {
                                                                spanned2 = spanned;
                                                                oc6Var = new oc6(obtain.readFloat(), obtain.readFloat());
                                                                b2 = 1;
                                                                i6 = i;
                                                            }
                                                        } else if (readByte == 10) {
                                                            if (obtain.dataAvail() >= 8) {
                                                                int i9 = ep0.j;
                                                                long readLong2 = obtain.readLong();
                                                                long j9 = readLong2 & 63;
                                                                if (j9 >= 16) {
                                                                    readLong2 = (readLong2 & (-64)) | (j9 + 1);
                                                                }
                                                                j5 = readLong2;
                                                            }
                                                        } else if (readByte == 11) {
                                                            if (obtain.dataAvail() >= 4) {
                                                                int readInt = obtain.readInt();
                                                                if ((readInt & 2) != 0) {
                                                                    i4 = 1;
                                                                } else {
                                                                    i4 = i;
                                                                }
                                                                if ((readInt & 1) != 0) {
                                                                    i5 = 1;
                                                                } else {
                                                                    i5 = i;
                                                                }
                                                                g96 g96Var2 = g96.d;
                                                                g96 g96Var3 = g96.c;
                                                                if (i4 != 0 && i5 != 0) {
                                                                    List I = te4.I(g96Var2, g96Var3);
                                                                    Integer valueOf = Integer.valueOf(i);
                                                                    int size = I.size();
                                                                    for (int i10 = i; i10 < size; i10++) {
                                                                        valueOf = Integer.valueOf(valueOf.intValue() | ((g96) I.get(i10)).a);
                                                                    }
                                                                    g96Var2 = new g96(valueOf.intValue());
                                                                } else if (i4 == 0) {
                                                                    if (i5 != 0) {
                                                                        g96Var = g96Var3;
                                                                    } else {
                                                                        g96Var = g96.b;
                                                                    }
                                                                }
                                                                g96Var = g96Var2;
                                                            }
                                                        } else if (readByte == 12) {
                                                            if (obtain.dataAvail() >= 20) {
                                                                int i11 = ep0.j;
                                                                long readLong3 = obtain.readLong();
                                                                long j10 = readLong3 & 63;
                                                                if (j10 >= 16) {
                                                                    readLong3 = (readLong3 & (-64)) | (j10 + 1);
                                                                }
                                                                long j11 = readLong3;
                                                                i6 = i;
                                                                spanned2 = spanned;
                                                                km5Var = new km5(obtain.readFloat(), j11, (Float.floatToRawIntBits(obtain.readFloat()) << 32) | (Float.floatToRawIntBits(obtain.readFloat()) & 4294967295L));
                                                                b2 = 1;
                                                            }
                                                        }
                                                        arrayList2.add(new jo(spanStart, spanEnd, new pv5(j4, j6, s92Var, o92Var, p92Var, (q82) null, str2, j7, z30Var, oc6Var, (fk3) null, j5, g96Var, km5Var, 49152)));
                                                    }
                                                    i6 = i;
                                                    spanned2 = spanned;
                                                    b2 = 1;
                                                }
                                            }
                                        }
                                        i = i6;
                                        spanned = spanned2;
                                        arrayList2.add(new jo(spanStart, spanEnd, new pv5(j4, j6, s92Var, o92Var, p92Var, (q82) null, str2, j7, z30Var, oc6Var, (fk3) null, j5, g96Var, km5Var, 49152)));
                                    }
                                    if (i7 != length2) {
                                        i7++;
                                        i6 = i;
                                        spanned2 = spanned;
                                        b2 = 1;
                                    }
                                }
                            }
                            String obj4 = text.toString();
                            ko koVar2 = lo.a;
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            obj3 = new ko(arrayList, obj4);
                        }
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == w11Var) {
                        return w11Var;
                    }
                    koVar = (ko) obj3;
                    if (koVar != null) {
                        io ioVar3 = new io(gv5.f(jb6Var.l(), jb6Var.l().a.y.length()));
                        ioVar3.a(koVar);
                        ko e4 = ioVar3.e();
                        ko e22 = gv5.e(jb6Var.l(), jb6Var.l().a.y.length());
                        io ioVar22 = new io(e4);
                        ioVar22.a(e22);
                        ko e32 = ioVar22.e();
                        int length3 = koVar.y.length() + nd6.g(jb6Var.l().b);
                        jb6Var.c.invoke(jb6.b(e32, fy5.a(length3, length3)));
                        jb6Var.r(hj2.x);
                        jb6Var.a.e = true;
                    }
                }
                return pn6Var;
        }
    }
}
