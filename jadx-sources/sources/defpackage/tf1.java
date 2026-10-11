package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tf1 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Serializable h;

    public tf1(AssetManager assetManager, Executor executor, uu4 uu4Var, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = uu4Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = n03.n;
        } else if (i != 29 && i != 30) {
            bArr = null;
        } else {
            bArr = n03.o;
        }
        this.d = bArr;
    }

    public void a(ia3 ia3Var) {
        kz kzVar = (kz) this.g;
        if (kzVar == null || ia3Var != ((ia3) this.h) || kzVar.c()) {
            this.h = ia3Var;
            kzVar = new kz((ko) this.b, (ud1) this.d, (p82) this.e, ez5.j((xd6) this.c, ia3Var), (List) this.f, this.a);
        }
        this.g = kzVar;
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((uu4) this.c).m();
                return null;
            }
            return null;
        }
    }

    public void c(int i, Serializable serializable) {
        ((Executor) this.b).execute(new sf1(this, i, serializable));
    }

    public tf1(ko koVar, ud1 ud1Var, p82 p82Var, xd6 xd6Var, List list, boolean z) {
        this.b = koVar;
        this.c = xd6Var;
        this.a = z;
        this.d = ud1Var;
        this.e = p82Var;
        this.f = list;
    }
}
