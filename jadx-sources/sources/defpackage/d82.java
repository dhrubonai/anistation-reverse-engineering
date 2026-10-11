package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d82 {
    public static final /* synthetic */ d82[] A;
    public static final d82 x;
    public static final d82 y;
    public static final d82 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d82] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d82] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, d82] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, d82] */
    static {
        ?? r0 = new Enum("Active", 0);
        x = r0;
        ?? r1 = new Enum("ActiveParent", 1);
        y = r1;
        ?? r2 = new Enum("Captured", 2);
        ?? r3 = new Enum("Inactive", 3);
        z = r3;
        A = new d82[]{r0, r1, r2, r3};
    }

    public static d82 valueOf(String str) {
        return (d82) Enum.valueOf(d82.class, str);
    }

    public static d82[] values() {
        return (d82[]) A.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        ze0.l();
                        return false;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
