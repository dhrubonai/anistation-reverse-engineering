package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ym3 implements Map.Entry, m73 {
    public final an3 x;
    public final int y;
    public final int z;

    public ym3(an3 an3Var, int i) {
        this.x = an3Var;
        this.y = i;
        this.z = an3Var.E;
    }

    public final void a() {
        if (this.x.E == this.z) {
        } else {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (a34.i(entry.getKey(), getKey()) && a34.i(entry.getValue(), getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.x.x[this.y];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.x.y;
        objArr.getClass();
        return objArr[this.y];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i;
        Object key = getKey();
        int i2 = 0;
        if (key != null) {
            i = key.hashCode();
        } else {
            i = 0;
        }
        Object value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        an3 an3Var = this.x;
        an3Var.c();
        Object[] objArr = an3Var.y;
        if (objArr == null) {
            int length = an3Var.x.length;
            if (length >= 0) {
                objArr = new Object[length];
                an3Var.y = objArr;
            } else {
                ze0.k("capacity must be non-negative.");
                return null;
            }
        }
        int i = this.y;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
