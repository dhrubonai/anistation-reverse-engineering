package com.anistation.remote.model;

import com.anistation.model.Status;
import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.jb0;
import defpackage.kq4;
import defpackage.l61;
import defpackage.l70;
import defpackage.mz5;
import defpackage.ne1;
import defpackage.qi2;
import defpackage.rb3;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class Response$$serializer<T> implements wd2 {
    private final aj5 descriptor;
    private final /* synthetic */ x73 typeSerial0;

    private Response$$serializer() {
        kq4 kq4Var = new kq4("com.anistation.remote.model.Response", this, 4);
        kq4Var.j("data", false);
        kq4Var.j("success", false);
        kq4Var.j("message", false);
        kq4Var.j("status", false);
        this.descriptor = kq4Var;
    }

    private final /* synthetic */ x73 getTypeSerial0() {
        return this.typeSerial0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = Response.$childSerializers;
        return new x73[]{jb0.a(this.typeSerial0), l70.a, jb0.a(mz5.a), rb3VarArr[3].getValue()};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ne1
    public final Response<T> deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        Object obj;
        Status status;
        boolean z;
        String str;
        int i;
        l61Var.getClass();
        aj5 aj5Var = this.descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = Response.$childSerializers;
        Response<T> response = null;
        if (c.decodeSequentially()) {
            Object decodeNullableSerializableElement = c.decodeNullableSerializableElement(aj5Var, 0, this.typeSerial0, null);
            boolean w = c.w(aj5Var, 1);
            String str2 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5.a, null);
            obj = decodeNullableSerializableElement;
            status = (Status) c.p(aj5Var, 3, (ne1) rb3VarArr[3].getValue(), null);
            z = w;
            str = str2;
            i = 15;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            int i2 = 0;
            Object obj2 = null;
            Status status2 = null;
            String str3 = null;
            while (z2) {
                int i3 = c.i(aj5Var);
                Response<T> response2 = response;
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    status2 = (Status) c.p(aj5Var, 3, (ne1) rb3VarArr[3].getValue(), status2);
                                    i2 |= 8;
                                } else {
                                    qi2.f(i3);
                                    return response2;
                                }
                            } else {
                                str3 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5.a, str3);
                                i2 |= 4;
                            }
                        } else {
                            z3 = c.w(aj5Var, 1);
                            i2 |= 2;
                        }
                    } else {
                        obj2 = c.decodeNullableSerializableElement(aj5Var, 0, this.typeSerial0, obj2);
                        i2 |= 1;
                    }
                    response = response2;
                } else {
                    response = response2;
                    z2 = false;
                }
            }
            obj = obj2;
            status = status2;
            z = z3;
            str = str3;
            i = i2;
        }
        c.a(aj5Var);
        return new Response<>(i, obj, z, str, status, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return this.descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Response<T> response) {
        wt1Var.getClass();
        response.getClass();
        aj5 aj5Var = this.descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Response.write$Self$remote(response, c, aj5Var, this.typeSerial0);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public final x73[] typeParametersSerializers() {
        return new x73[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Response$$serializer(x73 x73Var) {
        this();
        x73Var.getClass();
        this.typeSerial0 = x73Var;
    }
}
