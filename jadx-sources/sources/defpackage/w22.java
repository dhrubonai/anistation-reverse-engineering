package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w22 extends t36 implements ub2 {
    public final /* synthetic */ x22 A;
    public final /* synthetic */ Object B;
    public FileOutputStream x;
    public FileOutputStream y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(x22 x22Var, Object obj, vz0 vz0Var) {
        super(1, vz0Var);
        this.A = x22Var;
        this.B = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        return new w22(this.A, this.B, vz0Var);
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        return ((w22) create((vz0) obj)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        x22 x22Var = this.A;
        File file = x22Var.a;
        boolean z = this.z;
        if (z) {
            if (z) {
                fileOutputStream2 = this.y;
                fileOutputStream = this.x;
                try {
                    m37.N(obj);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        a34.C(fileOutputStream, th);
                        throw th3;
                    }
                }
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                Object obj2 = this.B;
                try {
                    nj5 nj5Var = x22Var.b;
                    dn6 dn6Var = new dn6(fileOutputStream3);
                    this.x = fileOutputStream3;
                    this.y = fileOutputStream3;
                    this.z = true;
                    Object writeTo = nj5Var.writeTo(obj2, dn6Var, this);
                    w11 w11Var = w11.x;
                    if (writeTo == w11Var) {
                        return w11Var;
                    }
                    fileOutputStream = fileOutputStream3;
                    fileOutputStream2 = fileOutputStream;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = fileOutputStream3;
                    throw th;
                }
            } catch (Exception e) {
                if (e instanceof FileNotFoundException) {
                    throw iv.R(file.getParent(), (FileNotFoundException) e);
                }
                throw e;
            }
        }
        fileOutputStream2.getFD().sync();
        a34.C(fileOutputStream, null);
        return pn6.a;
    }
}
