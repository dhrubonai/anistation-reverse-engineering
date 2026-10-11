package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v33 implements Iterator {
    public static final v33 x;
    public static final /* synthetic */ v33[] y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v33] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        x = r0;
        y = new v33[]{r0};
    }

    public static v33 valueOf(String str) {
        return (v33) Enum.valueOf(v33.class, str);
    }

    public static v33[] values() {
        return (v33[]) y.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        io3.A("no calls to next() since the last call to remove()", false);
    }
}
