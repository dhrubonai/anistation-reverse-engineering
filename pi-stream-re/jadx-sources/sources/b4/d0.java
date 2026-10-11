package b4;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d0 implements y, h4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1449a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f1450b;

    public /* synthetic */ d0(int i10, Resources resources) {
        this.f1449a = i10;
        this.f1450b = resources;
    }

    @Override // h4.a
    public final x3.e0 f(x3.e0 e0Var, v3.l lVar) {
        if (e0Var == null) {
            return null;
        }
        return new e4.d(this.f1450b, e0Var);
    }

    @Override // b4.y
    public final x j(c0 c0Var) {
        int i10 = this.f1449a;
        Resources resources = this.f1450b;
        switch (i10) {
            case 0:
                return new l(resources, c0Var.b(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new l(resources, c0Var.b(Uri.class, InputStream.class));
            default:
                return new l(resources, f0.f1457a);
        }
    }

    public d0(Resources resources) {
        this.f1449a = 3;
        this.f1450b = resources;
    }
}
