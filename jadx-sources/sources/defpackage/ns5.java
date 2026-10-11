package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ns5 implements Iterator {
    public Iterator A;
    public final /* synthetic */ AbstractMap B;
    public final /* synthetic */ byte x;
    public int y = -1;
    public boolean z;

    public /* synthetic */ ns5(AbstractMap abstractMap, byte b) {
        this.x = b;
        this.B = abstractMap;
    }

    public Iterator a() {
        byte b = this.x;
        AbstractMap abstractMap = this.B;
        switch (b) {
            case 0:
                Iterator it = this.A;
                if (it == null) {
                    Iterator it2 = ((fs5) abstractMap).z.entrySet().iterator();
                    this.A = it2;
                    return it2;
                }
                return it;
            default:
                Iterator it3 = this.A;
                if (it3 == null) {
                    Iterator it4 = ((gs5) abstractMap).y.entrySet().iterator();
                    this.A = it4;
                    return it4;
                }
                return it3;
        }
    }

    public Iterator b() {
        Iterator it = this.A;
        if (it == null) {
            Iterator it2 = ((zg7) this.B).z.entrySet().iterator();
            this.A = it2;
            return it2;
        }
        return it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.x;
        AbstractMap abstractMap = this.B;
        switch (b) {
            case 0:
                fs5 fs5Var = (fs5) abstractMap;
                if (this.y + 1 < fs5Var.y.size()) {
                    return true;
                }
                if (!fs5Var.z.isEmpty() && a().hasNext()) {
                    return true;
                }
                return false;
            case 1:
                gs5 gs5Var = (gs5) abstractMap;
                if (this.y + 1 < gs5Var.x.size()) {
                    return true;
                }
                if (!gs5Var.y.isEmpty() && a().hasNext()) {
                    return true;
                }
                return false;
            default:
                zg7 zg7Var = (zg7) abstractMap;
                if (this.y + 1 < zg7Var.y) {
                    return true;
                }
                if (!zg7Var.z.isEmpty() && b().hasNext()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.x;
        AbstractMap abstractMap = this.B;
        switch (b) {
            case 0:
                this.z = true;
                int i = this.y + 1;
                this.y = i;
                fs5 fs5Var = (fs5) abstractMap;
                if (i < fs5Var.y.size()) {
                    return (Map.Entry) fs5Var.y.get(this.y);
                }
                return (Map.Entry) a().next();
            case 1:
                this.z = true;
                int i2 = this.y + 1;
                this.y = i2;
                gs5 gs5Var = (gs5) abstractMap;
                if (i2 < gs5Var.x.size()) {
                    return (Map.Entry) gs5Var.x.get(this.y);
                }
                return (Map.Entry) a().next();
            default:
                this.z = true;
                int i3 = this.y + 1;
                this.y = i3;
                zg7 zg7Var = (zg7) abstractMap;
                if (i3 < zg7Var.y) {
                    return (ah7) zg7Var.x[i3];
                }
                return (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.x;
        AbstractMap abstractMap = this.B;
        switch (b) {
            case 0:
                fs5 fs5Var = (fs5) abstractMap;
                if (this.z) {
                    this.z = false;
                    int i = fs5.E;
                    fs5Var.b();
                    if (this.y < fs5Var.y.size()) {
                        int i2 = this.y;
                        this.y = i2 - 1;
                        fs5Var.g(i2);
                        return;
                    }
                    a().remove();
                    return;
                }
                ze0.m("remove() was called before next()");
                return;
            case 1:
                gs5 gs5Var = (gs5) abstractMap;
                if (this.z) {
                    this.z = false;
                    int i3 = gs5.C;
                    gs5Var.b();
                    if (this.y < gs5Var.x.size()) {
                        int i4 = this.y;
                        this.y = i4 - 1;
                        gs5Var.h(i4);
                        return;
                    }
                    a().remove();
                    return;
                }
                ze0.m("remove() was called before next()");
                return;
            default:
                if (this.z) {
                    this.z = false;
                    zg7 zg7Var = (zg7) abstractMap;
                    zg7Var.f();
                    int i5 = this.y;
                    if (i5 < zg7Var.y) {
                        this.y = i5 - 1;
                        zg7Var.d(i5);
                        return;
                    } else {
                        b().remove();
                        return;
                    }
                }
                ze0.m("remove() was called before next()");
                return;
        }
    }
}
