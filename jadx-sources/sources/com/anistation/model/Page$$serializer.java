package com.anistation.model;

import defpackage.aj5;
import defpackage.de1;
import defpackage.ds;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.i13;
import defpackage.jb0;
import defpackage.kq4;
import defpackage.l61;
import defpackage.l70;
import defpackage.qi2;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class Page$$serializer<T> implements wd2 {
    private final aj5 descriptor;
    private final /* synthetic */ x73 typeSerial0;

    private Page$$serializer() {
        kq4 kq4Var = new kq4("com.anistation.model.Page", this, 5);
        kq4Var.j("currentPage", false);
        kq4Var.j("perPage", false);
        kq4Var.j("hasNextPage", false);
        kq4Var.j("total", false);
        kq4Var.j("results", false);
        this.descriptor = kq4Var;
    }

    private final /* synthetic */ x73 getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        i13 i13Var = i13.a;
        return new x73[]{i13Var, i13Var, l70.a, jb0.a(i13Var), new ds(this.typeSerial0, (byte) 0)};
    }

    @Override // defpackage.ne1
    public final Page<T> deserialize(l61 l61Var) {
        List list;
        int i;
        Integer num;
        int i2;
        boolean z;
        int i3;
        l61Var.getClass();
        aj5 aj5Var = this.descriptor;
        gu0 c = l61Var.c(aj5Var);
        int i4 = 1;
        Page<T> page = null;
        if (c.decodeSequentially()) {
            int r = c.r(aj5Var, 0);
            int r2 = c.r(aj5Var, 1);
            boolean w = c.w(aj5Var, 2);
            Integer num2 = (Integer) c.decodeNullableSerializableElement(aj5Var, 3, i13.a, null);
            list = (List) c.p(aj5Var, 4, new ds(this.typeSerial0, (byte) 0), null);
            i = r;
            num = num2;
            i2 = 31;
            z = w;
            i3 = r2;
        } else {
            boolean z2 = true;
            int i5 = 0;
            int i6 = 0;
            boolean z3 = false;
            int i7 = 0;
            List list2 = null;
            Integer num3 = null;
            while (z2) {
                Page<T> page2 = page;
                int i8 = c.i(aj5Var);
                if (i8 != -1) {
                    if (i8 != 0) {
                        if (i8 != i4) {
                            if (i8 != 2) {
                                if (i8 != 3) {
                                    if (i8 == 4) {
                                        list2 = (List) c.p(aj5Var, 4, new ds(this.typeSerial0, (byte) 0), list2);
                                        i6 |= 16;
                                    } else {
                                        qi2.f(i8);
                                        return page2;
                                    }
                                } else {
                                    num3 = (Integer) c.decodeNullableSerializableElement(aj5Var, 3, i13.a, num3);
                                    i6 |= 8;
                                }
                            } else {
                                z3 = c.w(aj5Var, 2);
                                i6 |= 4;
                            }
                            page = page2;
                            i4 = 1;
                        } else {
                            i7 = c.r(aj5Var, i4);
                            i6 |= 2;
                            page = page2;
                        }
                    } else {
                        i5 = c.r(aj5Var, 0);
                        i6 |= 1;
                        page = page2;
                    }
                } else {
                    page = page2;
                    z2 = false;
                }
            }
            list = list2;
            i = i5;
            num = num3;
            i2 = i6;
            z = z3;
            i3 = i7;
        }
        c.a(aj5Var);
        return new Page<>(i2, i, i3, z, num, list, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return this.descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Page<T> page) {
        wt1Var.getClass();
        page.getClass();
        aj5 aj5Var = this.descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Page.write$Self$AniStation_core_model(page, c, aj5Var, this.typeSerial0);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public final x73[] typeParametersSerializers() {
        return new x73[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Page$$serializer(x73 x73Var) {
        this();
        x73Var.getClass();
        this.typeSerial0 = x73Var;
    }
}
