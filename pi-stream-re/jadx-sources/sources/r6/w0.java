package r6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f9559a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ w0[] f9560b;

    static {
        w0 w0Var = new w0();
        f9559a = w0Var;
        f9560b = new w0[]{w0Var};
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) f9560b.clone();
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
        h0.x("no calls to next() since the last call to remove()", false);
    }
}
