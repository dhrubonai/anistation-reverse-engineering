package b4;

import java.io.File;

/* loaded from: classes.dex */
public final class h implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1462a;

    public /* synthetic */ h(int i10) {
        this.f1462a = i10;
    }

    @Override // b4.x
    public final w a(Object obj, int i10, int i11, v3.l lVar) {
        switch (this.f1462a) {
            case 0:
                File file = (File) obj;
                return new w(new o4.b(file), new g(file, 0));
            default:
                return null;
        }
    }

    @Override // b4.x
    public final boolean b(Object obj) {
        switch (this.f1462a) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
