package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ch0 implements Iterator, j73 {
    public final /* synthetic */ gh0 A;
    public final /* synthetic */ byte x;
    public int y;
    public String z;

    public ch0(gh0 gh0Var, byte b) {
        this.x = b;
        switch (b) {
            case 1:
                this.A = gh0Var;
                while (true) {
                    int i = this.y;
                    gh0 gh0Var2 = this.A;
                    if (i < gh0Var2.B) {
                        int i2 = gh0Var2.A[i];
                        if (i2 < 0 || gh0Var2.x[i2] == null) {
                            this.y = i + 1;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 2:
                this.A = gh0Var;
                while (true) {
                    int i3 = this.y;
                    gh0 gh0Var3 = this.A;
                    if (i3 < gh0Var3.B) {
                        int i4 = gh0Var3.A[i3];
                        if (i4 < 0 || gh0Var3.x[i4] == null) {
                            this.y = i3 + 1;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            default:
                this.A = gh0Var;
                while (true) {
                    int i5 = this.y;
                    gh0 gh0Var4 = this.A;
                    if (i5 < gh0Var4.B) {
                        int i6 = gh0Var4.A[i5];
                        if (i6 < 0 || gh0Var4.x[i6] == null) {
                            this.y = i5 + 1;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.x;
        gh0 gh0Var = this.A;
        switch (b) {
            case 0:
                if (this.y >= gh0Var.B) {
                    return false;
                }
                return true;
            case 1:
                if (this.y >= gh0Var.B) {
                    return false;
                }
                return true;
            default:
                if (this.y >= gh0Var.B) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        int i2;
        int i3;
        byte b = this.x;
        Object obj = null;
        gh0 gh0Var = this.A;
        switch (b) {
            case 0:
                if (hasNext()) {
                    int i4 = gh0Var.A[this.y];
                    String str = gh0Var.x[i4];
                    str.getClass();
                    this.z = str;
                    Object obj2 = gh0Var.y[i4];
                    obj2.getClass();
                    eh0 eh0Var = new eh0(gh0Var, str, obj2);
                    this.y++;
                    while (true) {
                        int i5 = this.y;
                        if (i5 < gh0Var.B && ((i = gh0Var.A[i5]) < 0 || gh0Var.x[i] == null)) {
                            this.y = i5 + 1;
                        }
                    }
                    return eh0Var;
                }
                qi2.e();
                return null;
            case 1:
                if (hasNext()) {
                    String str2 = gh0Var.x[gh0Var.A[this.y]];
                    str2.getClass();
                    this.z = str2;
                    this.y++;
                    while (true) {
                        int i6 = this.y;
                        if (i6 < gh0Var.B && ((i2 = gh0Var.A[i6]) < 0 || gh0Var.x[i2] == null)) {
                            this.y = i6 + 1;
                        }
                    }
                    String str3 = this.z;
                    str3.getClass();
                    return str3;
                }
                qi2.e();
                return null;
            default:
                if (hasNext()) {
                    int i7 = gh0Var.A[this.y];
                    String str4 = gh0Var.x[i7];
                    str4.getClass();
                    this.z = str4;
                    obj = gh0Var.y[i7];
                    obj.getClass();
                    this.y++;
                    while (true) {
                        int i8 = this.y;
                        if (i8 < gh0Var.B && ((i3 = gh0Var.A[i8]) < 0 || gh0Var.x[i3] == null)) {
                            this.y = i8 + 1;
                        }
                    }
                } else {
                    qi2.e();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.x;
        gh0 gh0Var = this.A;
        switch (b) {
            case 0:
                String str = this.z;
                if (str != null) {
                    gh0Var.remove(str);
                    this.z = null;
                    return;
                } else {
                    ze0.m("next() must be called before remove()");
                    return;
                }
            case 1:
                String str2 = this.z;
                if (str2 != null) {
                    gh0Var.remove(str2);
                    this.z = null;
                    return;
                } else {
                    ze0.m("next() must be called before remove()");
                    return;
                }
            default:
                String str3 = this.z;
                if (str3 != null) {
                    gh0Var.remove(str3);
                    this.z = null;
                    return;
                } else {
                    ze0.m("next() must be called before remove()");
                    return;
                }
        }
    }
}
