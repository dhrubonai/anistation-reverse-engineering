package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s65 {
    public static final s65 x;
    public static final s65 y;
    public static final /* synthetic */ s65[] z;

    /* JADX INFO: Fake field, exist only in values array */
    s65 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [s65, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [s65, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [s65, java.lang.Enum] */
    static {
        ?? r0 = new Enum("AUTOMATIC", 0);
        ?? r1 = new Enum("TRUNCATE", 1);
        x = r1;
        ?? r2 = new Enum("WRITE_AHEAD_LOGGING", 2);
        y = r2;
        z = new s65[]{r0, r1, r2};
    }

    public static s65 valueOf(String str) {
        return (s65) Enum.valueOf(s65.class, str);
    }

    public static s65[] values() {
        return (s65[]) z.clone();
    }
}
