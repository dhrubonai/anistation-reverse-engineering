package b4;

import java.io.File;

/* loaded from: classes.dex */
public final class f implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1455a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1456b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f1455a = i10;
        this.f1456b = obj;
    }

    @Override // b4.x
    public final w a(Object obj, int i10, int i11, v3.l lVar) {
        int i12 = this.f1455a;
        Object obj2 = this.f1456b;
        switch (i12) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new w(new o4.b(bArr), new e(bArr, (d) obj2));
            case 1:
                return new w(new o4.b(obj), new i(0, obj.toString(), (k3.d) obj2));
            default:
                File file = (File) obj;
                return new w(new o4.b(file), new i(1, file, (n) obj2));
        }
    }

    @Override // b4.x
    public final boolean b(Object obj) {
        switch (this.f1455a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }
}
