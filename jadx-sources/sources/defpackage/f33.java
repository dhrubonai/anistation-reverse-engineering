package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f33 {
    public static final f33 A;
    public static final /* synthetic */ f33[] B;
    public static final f33 x;
    public static final f33 y;
    public static final f33 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f33] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f33] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, f33] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, f33] */
    static {
        ?? r0 = new Enum("IGNORED", 0);
        x = r0;
        ?? r1 = new Enum("SCHEDULED", 1);
        y = r1;
        ?? r2 = new Enum("DEFERRED", 2);
        z = r2;
        ?? r3 = new Enum("IMMINENT", 3);
        A = r3;
        B = new f33[]{r0, r1, r2, r3};
    }

    public static f33 valueOf(String str) {
        return (f33) Enum.valueOf(f33.class, str);
    }

    public static f33[] values() {
        return (f33[]) B.clone();
    }
}
