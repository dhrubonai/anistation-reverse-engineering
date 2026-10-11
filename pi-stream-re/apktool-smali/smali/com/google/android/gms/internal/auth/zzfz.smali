.class final Lcom/google/android/gms/internal/auth/zzfz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/zzgh;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/auth/zzgh<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final zza:[I

.field private static final zzb:Lsun/misc/Unsafe;


# instance fields
.field private final zzc:[I

.field private final zzd:[Ljava/lang/Object;

.field private final zze:I

.field private final zzf:I

.field private final zzg:Lcom/google/android/gms/internal/auth/zzfw;

.field private final zzh:Z

.field private final zzi:[I

.field private final zzj:I

.field private final zzk:I

.field private final zzl:Lcom/google/android/gms/internal/auth/zzfk;

.field private final zzm:Lcom/google/android/gms/internal/auth/zzgy;

.field private final zzn:Lcom/google/android/gms/internal/auth/zzel;

.field private final zzo:Lcom/google/android/gms/internal/auth/zzgb;

.field private final zzp:Lcom/google/android/gms/internal/auth/zzfr;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lcom/google/android/gms/internal/auth/zzfz;->zza:[I

    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhi;->zzg()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/google/android/gms/internal/auth/zzfz;->zzb:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/auth/zzfw;ZZ[IIILcom/google/android/gms/internal/auth/zzgb;Lcom/google/android/gms/internal/auth/zzfk;Lcom/google/android/gms/internal/auth/zzgy;Lcom/google/android/gms/internal/auth/zzel;Lcom/google/android/gms/internal/auth/zzfr;[B)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    move-object v1, p2

    iput-object v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzd:[Ljava/lang/Object;

    move v1, p3

    iput v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zze:I

    move v1, p4

    iput v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzf:I

    move v1, p6

    iput-boolean v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzh:Z

    move-object v1, p8

    iput-object v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzi:[I

    move v1, p9

    iput v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzj:I

    move v1, p10

    iput v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzk:I

    move-object v1, p11

    iput-object v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzo:Lcom/google/android/gms/internal/auth/zzgb;

    move-object v1, p12

    iput-object v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzl:Lcom/google/android/gms/internal/auth/zzfk;

    move-object v1, p13

    iput-object v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzm:Lcom/google/android/gms/internal/auth/zzgy;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzn:Lcom/google/android/gms/internal/auth/zzel;

    move-object v1, p5

    iput-object v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzg:Lcom/google/android/gms/internal/auth/zzfw;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzp:Lcom/google/android/gms/internal/auth/zzfr;

    return-void
.end method

.method private static zzA(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v3, "Field "

    .line 43
    .line 44
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p1, " for "

    .line 51
    .line 52
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p0, " not found. Known fields are "

    .line 59
    .line 60
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1
.end method

.method private final zzB(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 3

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzv(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, v1

    .line 9
    int-to-long v0, v0

    .line 10
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {p2, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {v2, p2}, Lcom/google/android/gms/internal/auth/zzez;->zzg(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/auth/zzhi;->zzp(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 42
    .line 43
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/auth/zzhi;->zzp(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    :cond_3
    return-void
.end method

.method private final zzC(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 4

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzv(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 6
    .line 7
    aget v1, v1, p3

    .line 8
    .line 9
    const v2, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v2

    .line 13
    int-to-long v2, v0

    .line 14
    invoke-direct {p0, p2, v1, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-direct {p0, p1, v1, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_0
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    if-nez p2, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/auth/zzez;->zzg(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p1, v2, v3, p2}, Lcom/google/android/gms/internal/auth/zzhi;->zzp(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1, v1, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzE(Ljava/lang/Object;II)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    .line 54
    .line 55
    invoke-static {p1, v2, v3, p2}, Lcom/google/android/gms/internal/auth/zzhi;->zzp(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, p1, v1, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzE(Ljava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    :cond_4
    return-void
.end method

.method private final zzD(Ljava/lang/Object;I)V
    .locals 4

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/zzfz;->zzs(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, p2

    .line 9
    int-to-long v0, v0

    .line 10
    const-wide/32 v2, 0xfffff

    .line 11
    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    ushr-int/lit8 p2, p2, 0x14

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    shl-int p2, v3, p2

    .line 26
    .line 27
    or-int/2addr p2, v2

    .line 28
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/auth/zzhi;->zzn(Ljava/lang/Object;JI)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private final zzE(Ljava/lang/Object;II)V
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzs(I)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p3, v0

    .line 9
    int-to-long v0, p3

    .line 10
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/auth/zzhi;->zzn(Ljava/lang/Object;JI)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method private final zzG(Ljava/lang/Object;I)Z
    .locals 7

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/zzfz;->zzs(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int v2, v0, v1

    .line 9
    .line 10
    int-to-long v2, v2

    .line 11
    const-wide/32 v4, 0xfffff

    .line 12
    .line 13
    .line 14
    cmp-long v4, v2, v4

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x1

    .line 18
    if-nez v4, :cond_14

    .line 19
    .line 20
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/zzfz;->zzv(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    and-int v0, p2, v1

    .line 25
    .line 26
    int-to-long v0, v0

    .line 27
    invoke-static {p2}, Lcom/google/android/gms/internal/auth/zzfz;->zzu(I)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    packed-switch p2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    return v6

    .line 49
    :cond_0
    return v5

    .line 50
    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    cmp-long p1, p1, v2

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    return v6

    .line 59
    :cond_1
    return v5

    .line 60
    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    return v6

    .line 67
    :cond_2
    return v5

    .line 68
    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 69
    .line 70
    .line 71
    move-result-wide p1

    .line 72
    cmp-long p1, p1, v2

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    return v6

    .line 77
    :cond_3
    return v5

    .line 78
    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    return v6

    .line 85
    :cond_4
    return v5

    .line 86
    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    return v6

    .line 93
    :cond_5
    return v5

    .line 94
    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    return v6

    .line 101
    :cond_6
    return v5

    .line 102
    :pswitch_7
    sget-object p2, Lcom/google/android/gms/internal/auth/zzee;->zzb:Lcom/google/android/gms/internal/auth/zzee;

    .line 103
    .line 104
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/auth/zzee;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_7

    .line 113
    .line 114
    return v6

    .line 115
    :cond_7
    return v5

    .line 116
    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_8

    .line 121
    .line 122
    return v6

    .line 123
    :cond_8
    return v5

    .line 124
    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    instance-of p2, p1, Ljava/lang/String;

    .line 129
    .line 130
    if-eqz p2, :cond_a

    .line 131
    .line 132
    check-cast p1, Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-nez p1, :cond_9

    .line 139
    .line 140
    return v6

    .line 141
    :cond_9
    return v5

    .line 142
    :cond_a
    instance-of p2, p1, Lcom/google/android/gms/internal/auth/zzee;

    .line 143
    .line 144
    if-eqz p2, :cond_c

    .line 145
    .line 146
    sget-object p2, Lcom/google/android/gms/internal/auth/zzee;->zzb:Lcom/google/android/gms/internal/auth/zzee;

    .line 147
    .line 148
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/auth/zzee;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-nez p1, :cond_b

    .line 153
    .line 154
    return v6

    .line 155
    :cond_b
    return v5

    .line 156
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzt(Ljava/lang/Object;J)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    return p1

    .line 167
    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_d

    .line 172
    .line 173
    return v6

    .line 174
    :cond_d
    return v5

    .line 175
    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 176
    .line 177
    .line 178
    move-result-wide p1

    .line 179
    cmp-long p1, p1, v2

    .line 180
    .line 181
    if-eqz p1, :cond_e

    .line 182
    .line 183
    return v6

    .line 184
    :cond_e
    return v5

    .line 185
    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_f

    .line 190
    .line 191
    return v6

    .line 192
    :cond_f
    return v5

    .line 193
    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 194
    .line 195
    .line 196
    move-result-wide p1

    .line 197
    cmp-long p1, p1, v2

    .line 198
    .line 199
    if-eqz p1, :cond_10

    .line 200
    .line 201
    return v6

    .line 202
    :cond_10
    return v5

    .line 203
    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 204
    .line 205
    .line 206
    move-result-wide p1

    .line 207
    cmp-long p1, p1, v2

    .line 208
    .line 209
    if-eqz p1, :cond_11

    .line 210
    .line 211
    return v6

    .line 212
    :cond_11
    return v5

    .line 213
    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzb(Ljava/lang/Object;J)F

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-eqz p1, :cond_12

    .line 222
    .line 223
    return v6

    .line 224
    :cond_12
    return v5

    .line 225
    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zza(Ljava/lang/Object;J)D

    .line 226
    .line 227
    .line 228
    move-result-wide p1

    .line 229
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 230
    .line 231
    .line 232
    move-result-wide p1

    .line 233
    cmp-long p1, p1, v2

    .line 234
    .line 235
    if-eqz p1, :cond_13

    .line 236
    .line 237
    return v6

    .line 238
    :cond_13
    return v5

    .line 239
    :cond_14
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    ushr-int/lit8 p2, v0, 0x14

    .line 244
    .line 245
    shl-int p2, v6, p2

    .line 246
    .line 247
    and-int/2addr p1, p2

    .line 248
    if-eqz p1, :cond_15

    .line 249
    .line 250
    return v6

    .line 251
    :cond_15
    return v5

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zzH(Ljava/lang/Object;IIII)Z
    .locals 1

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    if-ne p3, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    and-int p1, p4, p5

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private static zzI(Ljava/lang/Object;ILcom/google/android/gms/internal/auth/zzgh;)Z
    .locals 2

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    int-to-long v0, p1

    .line 6
    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/auth/zzgh;->zzi(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private final zzJ(Ljava/lang/Object;II)Z
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/auth/zzfz;->zzs(I)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p3, v0

    .line 9
    int-to-long v0, p3

    .line 10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-ne p1, p2, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public static zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/zzgz;
    .locals 2

    .line 1
    check-cast p0, Lcom/google/android/gms/internal/auth/zzeu;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzeu;->zzc:Lcom/google/android/gms/internal/auth/zzgz;

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzgz;->zza()Lcom/google/android/gms/internal/auth/zzgz;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzgz;->zzc()Lcom/google/android/gms/internal/auth/zzgz;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/google/android/gms/internal/auth/zzeu;->zzc:Lcom/google/android/gms/internal/auth/zzgz;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public static zzj(Ljava/lang/Class;Lcom/google/android/gms/internal/auth/zzft;Lcom/google/android/gms/internal/auth/zzgb;Lcom/google/android/gms/internal/auth/zzfk;Lcom/google/android/gms/internal/auth/zzgy;Lcom/google/android/gms/internal/auth/zzel;Lcom/google/android/gms/internal/auth/zzfr;)Lcom/google/android/gms/internal/auth/zzfz;
    .locals 6

    .line 1
    instance-of p0, p1, Lcom/google/android/gms/internal/auth/zzgg;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/google/android/gms/internal/auth/zzgg;

    .line 7
    .line 8
    move-object v1, p2

    .line 9
    move-object v2, p3

    .line 10
    move-object v3, p4

    .line 11
    move-object v4, p5

    .line 12
    move-object v5, p6

    .line 13
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/zzfz;->zzk(Lcom/google/android/gms/internal/auth/zzgg;Lcom/google/android/gms/internal/auth/zzgb;Lcom/google/android/gms/internal/auth/zzfk;Lcom/google/android/gms/internal/auth/zzgy;Lcom/google/android/gms/internal/auth/zzel;Lcom/google/android/gms/internal/auth/zzfr;)Lcom/google/android/gms/internal/auth/zzfz;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/auth/zzgv;

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0
.end method

.method public static zzk(Lcom/google/android/gms/internal/auth/zzgg;Lcom/google/android/gms/internal/auth/zzgb;Lcom/google/android/gms/internal/auth/zzfk;Lcom/google/android/gms/internal/auth/zzgy;Lcom/google/android/gms/internal/auth/zzel;Lcom/google/android/gms/internal/auth/zzfr;)Lcom/google/android/gms/internal/auth/zzfz;
    .locals 33

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/auth/zzgg;->zzc()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v10, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v10, v2

    .line 12
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/auth/zzgg;->zzd()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const v5, 0xd800

    .line 25
    .line 26
    .line 27
    if-lt v4, v5, :cond_1

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    :goto_1
    add-int/lit8 v6, v4, 0x1

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-lt v4, v5, :cond_2

    .line 37
    .line 38
    move v4, v6

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v6, 0x1

    .line 41
    :cond_2
    add-int/lit8 v4, v6, 0x1

    .line 42
    .line 43
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-lt v6, v5, :cond_4

    .line 48
    .line 49
    and-int/lit16 v6, v6, 0x1fff

    .line 50
    .line 51
    const/16 v8, 0xd

    .line 52
    .line 53
    :goto_2
    add-int/lit8 v9, v4, 0x1

    .line 54
    .line 55
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-lt v4, v5, :cond_3

    .line 60
    .line 61
    and-int/lit16 v4, v4, 0x1fff

    .line 62
    .line 63
    shl-int/2addr v4, v8

    .line 64
    or-int/2addr v6, v4

    .line 65
    add-int/lit8 v8, v8, 0xd

    .line 66
    .line 67
    move v4, v9

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    shl-int/2addr v4, v8

    .line 70
    or-int/2addr v6, v4

    .line 71
    move v4, v9

    .line 72
    :cond_4
    if-nez v6, :cond_5

    .line 73
    .line 74
    sget-object v6, Lcom/google/android/gms/internal/auth/zzfz;->zza:[I

    .line 75
    .line 76
    move v8, v2

    .line 77
    move v9, v8

    .line 78
    move v11, v9

    .line 79
    move v12, v11

    .line 80
    move v14, v12

    .line 81
    move/from16 v16, v14

    .line 82
    .line 83
    move-object v13, v6

    .line 84
    move/from16 v6, v16

    .line 85
    .line 86
    goto/16 :goto_b

    .line 87
    .line 88
    :cond_5
    add-int/lit8 v6, v4, 0x1

    .line 89
    .line 90
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-lt v4, v5, :cond_7

    .line 95
    .line 96
    and-int/lit16 v4, v4, 0x1fff

    .line 97
    .line 98
    const/16 v8, 0xd

    .line 99
    .line 100
    :goto_3
    add-int/lit8 v9, v6, 0x1

    .line 101
    .line 102
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-lt v6, v5, :cond_6

    .line 107
    .line 108
    and-int/lit16 v6, v6, 0x1fff

    .line 109
    .line 110
    shl-int/2addr v6, v8

    .line 111
    or-int/2addr v4, v6

    .line 112
    add-int/lit8 v8, v8, 0xd

    .line 113
    .line 114
    move v6, v9

    .line 115
    goto :goto_3

    .line 116
    :cond_6
    shl-int/2addr v6, v8

    .line 117
    or-int/2addr v4, v6

    .line 118
    move v6, v9

    .line 119
    :cond_7
    add-int/lit8 v8, v6, 0x1

    .line 120
    .line 121
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-lt v6, v5, :cond_9

    .line 126
    .line 127
    and-int/lit16 v6, v6, 0x1fff

    .line 128
    .line 129
    const/16 v9, 0xd

    .line 130
    .line 131
    :goto_4
    add-int/lit8 v11, v8, 0x1

    .line 132
    .line 133
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-lt v8, v5, :cond_8

    .line 138
    .line 139
    and-int/lit16 v8, v8, 0x1fff

    .line 140
    .line 141
    shl-int/2addr v8, v9

    .line 142
    or-int/2addr v6, v8

    .line 143
    add-int/lit8 v9, v9, 0xd

    .line 144
    .line 145
    move v8, v11

    .line 146
    goto :goto_4

    .line 147
    :cond_8
    shl-int/2addr v8, v9

    .line 148
    or-int/2addr v6, v8

    .line 149
    move v8, v11

    .line 150
    :cond_9
    add-int/lit8 v9, v8, 0x1

    .line 151
    .line 152
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-lt v8, v5, :cond_b

    .line 157
    .line 158
    and-int/lit16 v8, v8, 0x1fff

    .line 159
    .line 160
    const/16 v11, 0xd

    .line 161
    .line 162
    :goto_5
    add-int/lit8 v12, v9, 0x1

    .line 163
    .line 164
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-lt v9, v5, :cond_a

    .line 169
    .line 170
    and-int/lit16 v9, v9, 0x1fff

    .line 171
    .line 172
    shl-int/2addr v9, v11

    .line 173
    or-int/2addr v8, v9

    .line 174
    add-int/lit8 v11, v11, 0xd

    .line 175
    .line 176
    move v9, v12

    .line 177
    goto :goto_5

    .line 178
    :cond_a
    shl-int/2addr v9, v11

    .line 179
    or-int/2addr v8, v9

    .line 180
    move v9, v12

    .line 181
    :cond_b
    add-int/lit8 v11, v9, 0x1

    .line 182
    .line 183
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    if-lt v9, v5, :cond_d

    .line 188
    .line 189
    and-int/lit16 v9, v9, 0x1fff

    .line 190
    .line 191
    const/16 v12, 0xd

    .line 192
    .line 193
    :goto_6
    add-int/lit8 v13, v11, 0x1

    .line 194
    .line 195
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 196
    .line 197
    .line 198
    move-result v11

    .line 199
    if-lt v11, v5, :cond_c

    .line 200
    .line 201
    and-int/lit16 v11, v11, 0x1fff

    .line 202
    .line 203
    shl-int/2addr v11, v12

    .line 204
    or-int/2addr v9, v11

    .line 205
    add-int/lit8 v12, v12, 0xd

    .line 206
    .line 207
    move v11, v13

    .line 208
    goto :goto_6

    .line 209
    :cond_c
    shl-int/2addr v11, v12

    .line 210
    or-int/2addr v9, v11

    .line 211
    move v11, v13

    .line 212
    :cond_d
    add-int/lit8 v12, v11, 0x1

    .line 213
    .line 214
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    if-lt v11, v5, :cond_f

    .line 219
    .line 220
    and-int/lit16 v11, v11, 0x1fff

    .line 221
    .line 222
    const/16 v13, 0xd

    .line 223
    .line 224
    :goto_7
    add-int/lit8 v14, v12, 0x1

    .line 225
    .line 226
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    if-lt v12, v5, :cond_e

    .line 231
    .line 232
    and-int/lit16 v12, v12, 0x1fff

    .line 233
    .line 234
    shl-int/2addr v12, v13

    .line 235
    or-int/2addr v11, v12

    .line 236
    add-int/lit8 v13, v13, 0xd

    .line 237
    .line 238
    move v12, v14

    .line 239
    goto :goto_7

    .line 240
    :cond_e
    shl-int/2addr v12, v13

    .line 241
    or-int/2addr v11, v12

    .line 242
    move v12, v14

    .line 243
    :cond_f
    add-int/lit8 v13, v12, 0x1

    .line 244
    .line 245
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 246
    .line 247
    .line 248
    move-result v12

    .line 249
    if-lt v12, v5, :cond_11

    .line 250
    .line 251
    and-int/lit16 v12, v12, 0x1fff

    .line 252
    .line 253
    const/16 v14, 0xd

    .line 254
    .line 255
    :goto_8
    add-int/lit8 v15, v13, 0x1

    .line 256
    .line 257
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    .line 258
    .line 259
    .line 260
    move-result v13

    .line 261
    if-lt v13, v5, :cond_10

    .line 262
    .line 263
    and-int/lit16 v13, v13, 0x1fff

    .line 264
    .line 265
    shl-int/2addr v13, v14

    .line 266
    or-int/2addr v12, v13

    .line 267
    add-int/lit8 v14, v14, 0xd

    .line 268
    .line 269
    move v13, v15

    .line 270
    goto :goto_8

    .line 271
    :cond_10
    shl-int/2addr v13, v14

    .line 272
    or-int/2addr v12, v13

    .line 273
    move v13, v15

    .line 274
    :cond_11
    add-int/lit8 v14, v13, 0x1

    .line 275
    .line 276
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    .line 277
    .line 278
    .line 279
    move-result v13

    .line 280
    if-lt v13, v5, :cond_13

    .line 281
    .line 282
    and-int/lit16 v13, v13, 0x1fff

    .line 283
    .line 284
    const/16 v15, 0xd

    .line 285
    .line 286
    :goto_9
    add-int/lit8 v16, v14, 0x1

    .line 287
    .line 288
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 289
    .line 290
    .line 291
    move-result v14

    .line 292
    if-lt v14, v5, :cond_12

    .line 293
    .line 294
    and-int/lit16 v14, v14, 0x1fff

    .line 295
    .line 296
    shl-int/2addr v14, v15

    .line 297
    or-int/2addr v13, v14

    .line 298
    add-int/lit8 v15, v15, 0xd

    .line 299
    .line 300
    move/from16 v14, v16

    .line 301
    .line 302
    goto :goto_9

    .line 303
    :cond_12
    shl-int/2addr v14, v15

    .line 304
    or-int/2addr v13, v14

    .line 305
    move/from16 v14, v16

    .line 306
    .line 307
    :cond_13
    add-int/lit8 v15, v14, 0x1

    .line 308
    .line 309
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 310
    .line 311
    .line 312
    move-result v14

    .line 313
    if-lt v14, v5, :cond_15

    .line 314
    .line 315
    and-int/lit16 v14, v14, 0x1fff

    .line 316
    .line 317
    const/16 v16, 0xd

    .line 318
    .line 319
    :goto_a
    add-int/lit8 v17, v15, 0x1

    .line 320
    .line 321
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 322
    .line 323
    .line 324
    move-result v15

    .line 325
    if-lt v15, v5, :cond_14

    .line 326
    .line 327
    and-int/lit16 v15, v15, 0x1fff

    .line 328
    .line 329
    shl-int v15, v15, v16

    .line 330
    .line 331
    or-int/2addr v14, v15

    .line 332
    add-int/lit8 v16, v16, 0xd

    .line 333
    .line 334
    move/from16 v15, v17

    .line 335
    .line 336
    goto :goto_a

    .line 337
    :cond_14
    shl-int v15, v15, v16

    .line 338
    .line 339
    or-int/2addr v14, v15

    .line 340
    move/from16 v15, v17

    .line 341
    .line 342
    :cond_15
    add-int v16, v14, v12

    .line 343
    .line 344
    add-int v13, v16, v13

    .line 345
    .line 346
    new-array v13, v13, [I

    .line 347
    .line 348
    add-int v16, v4, v4

    .line 349
    .line 350
    add-int v16, v16, v6

    .line 351
    .line 352
    move v6, v4

    .line 353
    move v4, v15

    .line 354
    move/from16 v32, v12

    .line 355
    .line 356
    move v12, v9

    .line 357
    move/from16 v9, v32

    .line 358
    .line 359
    :goto_b
    sget-object v15, Lcom/google/android/gms/internal/auth/zzfz;->zzb:Lsun/misc/Unsafe;

    .line 360
    .line 361
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/auth/zzgg;->zze()[Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v17

    .line 365
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/auth/zzgg;->zza()Lcom/google/android/gms/internal/auth/zzfw;

    .line 366
    .line 367
    .line 368
    move-result-object v18

    .line 369
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    mul-int/lit8 v7, v11, 0x3

    .line 374
    .line 375
    new-array v7, v7, [I

    .line 376
    .line 377
    add-int/2addr v11, v11

    .line 378
    new-array v11, v11, [Ljava/lang/Object;

    .line 379
    .line 380
    add-int v21, v14, v9

    .line 381
    .line 382
    move/from16 v22, v14

    .line 383
    .line 384
    move/from16 v23, v21

    .line 385
    .line 386
    const/4 v9, 0x0

    .line 387
    const/16 v20, 0x0

    .line 388
    .line 389
    :goto_c
    if-ge v4, v1, :cond_32

    .line 390
    .line 391
    add-int/lit8 v24, v4, 0x1

    .line 392
    .line 393
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    if-lt v4, v5, :cond_17

    .line 398
    .line 399
    and-int/lit16 v4, v4, 0x1fff

    .line 400
    .line 401
    move/from16 v3, v24

    .line 402
    .line 403
    const/16 v24, 0xd

    .line 404
    .line 405
    :goto_d
    add-int/lit8 v26, v3, 0x1

    .line 406
    .line 407
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    if-lt v3, v5, :cond_16

    .line 412
    .line 413
    and-int/lit16 v3, v3, 0x1fff

    .line 414
    .line 415
    shl-int v3, v3, v24

    .line 416
    .line 417
    or-int/2addr v4, v3

    .line 418
    add-int/lit8 v24, v24, 0xd

    .line 419
    .line 420
    move/from16 v3, v26

    .line 421
    .line 422
    goto :goto_d

    .line 423
    :cond_16
    shl-int v3, v3, v24

    .line 424
    .line 425
    or-int/2addr v4, v3

    .line 426
    move/from16 v3, v26

    .line 427
    .line 428
    goto :goto_e

    .line 429
    :cond_17
    move/from16 v3, v24

    .line 430
    .line 431
    :goto_e
    add-int/lit8 v24, v3, 0x1

    .line 432
    .line 433
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    if-lt v3, v5, :cond_19

    .line 438
    .line 439
    and-int/lit16 v3, v3, 0x1fff

    .line 440
    .line 441
    move/from16 v5, v24

    .line 442
    .line 443
    const/16 v24, 0xd

    .line 444
    .line 445
    :goto_f
    add-int/lit8 v27, v5, 0x1

    .line 446
    .line 447
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    move/from16 v28, v1

    .line 452
    .line 453
    const v1, 0xd800

    .line 454
    .line 455
    .line 456
    if-lt v5, v1, :cond_18

    .line 457
    .line 458
    and-int/lit16 v1, v5, 0x1fff

    .line 459
    .line 460
    shl-int v1, v1, v24

    .line 461
    .line 462
    or-int/2addr v3, v1

    .line 463
    add-int/lit8 v24, v24, 0xd

    .line 464
    .line 465
    move/from16 v5, v27

    .line 466
    .line 467
    move/from16 v1, v28

    .line 468
    .line 469
    goto :goto_f

    .line 470
    :cond_18
    shl-int v1, v5, v24

    .line 471
    .line 472
    or-int/2addr v3, v1

    .line 473
    move/from16 v1, v27

    .line 474
    .line 475
    goto :goto_10

    .line 476
    :cond_19
    move/from16 v28, v1

    .line 477
    .line 478
    move/from16 v1, v24

    .line 479
    .line 480
    :goto_10
    and-int/lit16 v5, v3, 0xff

    .line 481
    .line 482
    move/from16 v24, v14

    .line 483
    .line 484
    and-int/lit16 v14, v3, 0x400

    .line 485
    .line 486
    if-eqz v14, :cond_1a

    .line 487
    .line 488
    add-int/lit8 v14, v20, 0x1

    .line 489
    .line 490
    aput v9, v13, v20

    .line 491
    .line 492
    move/from16 v20, v14

    .line 493
    .line 494
    :cond_1a
    const/16 v14, 0x33

    .line 495
    .line 496
    if-lt v5, v14, :cond_22

    .line 497
    .line 498
    add-int/lit8 v14, v1, 0x1

    .line 499
    .line 500
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    move/from16 v27, v14

    .line 505
    .line 506
    const v14, 0xd800

    .line 507
    .line 508
    .line 509
    if-lt v1, v14, :cond_1c

    .line 510
    .line 511
    and-int/lit16 v1, v1, 0x1fff

    .line 512
    .line 513
    move/from16 v14, v27

    .line 514
    .line 515
    const/16 v27, 0xd

    .line 516
    .line 517
    :goto_11
    add-int/lit8 v30, v14, 0x1

    .line 518
    .line 519
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 520
    .line 521
    .line 522
    move-result v14

    .line 523
    move/from16 v31, v12

    .line 524
    .line 525
    const v12, 0xd800

    .line 526
    .line 527
    .line 528
    if-lt v14, v12, :cond_1b

    .line 529
    .line 530
    and-int/lit16 v12, v14, 0x1fff

    .line 531
    .line 532
    shl-int v12, v12, v27

    .line 533
    .line 534
    or-int/2addr v1, v12

    .line 535
    add-int/lit8 v27, v27, 0xd

    .line 536
    .line 537
    move/from16 v14, v30

    .line 538
    .line 539
    move/from16 v12, v31

    .line 540
    .line 541
    goto :goto_11

    .line 542
    :cond_1b
    shl-int v12, v14, v27

    .line 543
    .line 544
    or-int/2addr v1, v12

    .line 545
    move/from16 v14, v30

    .line 546
    .line 547
    goto :goto_12

    .line 548
    :cond_1c
    move/from16 v31, v12

    .line 549
    .line 550
    move/from16 v14, v27

    .line 551
    .line 552
    :goto_12
    add-int/lit8 v12, v5, -0x33

    .line 553
    .line 554
    move/from16 v27, v14

    .line 555
    .line 556
    const/16 v14, 0x9

    .line 557
    .line 558
    if-eq v12, v14, :cond_1e

    .line 559
    .line 560
    const/16 v14, 0x11

    .line 561
    .line 562
    if-ne v12, v14, :cond_1d

    .line 563
    .line 564
    goto :goto_13

    .line 565
    :cond_1d
    const/16 v14, 0xc

    .line 566
    .line 567
    if-ne v12, v14, :cond_1f

    .line 568
    .line 569
    if-nez v10, :cond_1f

    .line 570
    .line 571
    div-int/lit8 v12, v9, 0x3

    .line 572
    .line 573
    add-int/lit8 v14, v16, 0x1

    .line 574
    .line 575
    add-int/2addr v12, v12

    .line 576
    const/16 v25, 0x1

    .line 577
    .line 578
    add-int/lit8 v12, v12, 0x1

    .line 579
    .line 580
    aget-object v16, v17, v16

    .line 581
    .line 582
    aput-object v16, v11, v12

    .line 583
    .line 584
    goto :goto_14

    .line 585
    :cond_1e
    :goto_13
    div-int/lit8 v12, v9, 0x3

    .line 586
    .line 587
    add-int/lit8 v14, v16, 0x1

    .line 588
    .line 589
    add-int/2addr v12, v12

    .line 590
    const/16 v25, 0x1

    .line 591
    .line 592
    add-int/lit8 v12, v12, 0x1

    .line 593
    .line 594
    aget-object v16, v17, v16

    .line 595
    .line 596
    aput-object v16, v11, v12

    .line 597
    .line 598
    :goto_14
    move/from16 v16, v14

    .line 599
    .line 600
    :cond_1f
    add-int/2addr v1, v1

    .line 601
    aget-object v12, v17, v1

    .line 602
    .line 603
    instance-of v14, v12, Ljava/lang/reflect/Field;

    .line 604
    .line 605
    if-eqz v14, :cond_20

    .line 606
    .line 607
    check-cast v12, Ljava/lang/reflect/Field;

    .line 608
    .line 609
    goto :goto_15

    .line 610
    :cond_20
    check-cast v12, Ljava/lang/String;

    .line 611
    .line 612
    invoke-static {v2, v12}, Lcom/google/android/gms/internal/auth/zzfz;->zzA(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 613
    .line 614
    .line 615
    move-result-object v12

    .line 616
    aput-object v12, v17, v1

    .line 617
    .line 618
    :goto_15
    move-object/from16 v30, v7

    .line 619
    .line 620
    move v14, v8

    .line 621
    invoke-virtual {v15, v12}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 622
    .line 623
    .line 624
    move-result-wide v7

    .line 625
    long-to-int v7, v7

    .line 626
    add-int/lit8 v1, v1, 0x1

    .line 627
    .line 628
    aget-object v8, v17, v1

    .line 629
    .line 630
    instance-of v12, v8, Ljava/lang/reflect/Field;

    .line 631
    .line 632
    if-eqz v12, :cond_21

    .line 633
    .line 634
    check-cast v8, Ljava/lang/reflect/Field;

    .line 635
    .line 636
    goto :goto_16

    .line 637
    :cond_21
    check-cast v8, Ljava/lang/String;

    .line 638
    .line 639
    invoke-static {v2, v8}, Lcom/google/android/gms/internal/auth/zzfz;->zzA(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 640
    .line 641
    .line 642
    move-result-object v8

    .line 643
    aput-object v8, v17, v1

    .line 644
    .line 645
    :goto_16
    move v1, v7

    .line 646
    invoke-virtual {v15, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 647
    .line 648
    .line 649
    move-result-wide v7

    .line 650
    long-to-int v7, v7

    .line 651
    move v8, v7

    .line 652
    move-object/from16 v29, v11

    .line 653
    .line 654
    const/16 v25, 0x1

    .line 655
    .line 656
    move v7, v1

    .line 657
    const/4 v1, 0x0

    .line 658
    goto/16 :goto_21

    .line 659
    .line 660
    :cond_22
    move-object/from16 v30, v7

    .line 661
    .line 662
    move v14, v8

    .line 663
    move/from16 v31, v12

    .line 664
    .line 665
    add-int/lit8 v7, v16, 0x1

    .line 666
    .line 667
    aget-object v8, v17, v16

    .line 668
    .line 669
    check-cast v8, Ljava/lang/String;

    .line 670
    .line 671
    invoke-static {v2, v8}, Lcom/google/android/gms/internal/auth/zzfz;->zzA(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 672
    .line 673
    .line 674
    move-result-object v8

    .line 675
    const/16 v12, 0x9

    .line 676
    .line 677
    if-eq v5, v12, :cond_2a

    .line 678
    .line 679
    const/16 v12, 0x11

    .line 680
    .line 681
    if-ne v5, v12, :cond_23

    .line 682
    .line 683
    goto :goto_1a

    .line 684
    :cond_23
    const/16 v12, 0x1b

    .line 685
    .line 686
    if-eq v5, v12, :cond_29

    .line 687
    .line 688
    const/16 v12, 0x31

    .line 689
    .line 690
    if-ne v5, v12, :cond_24

    .line 691
    .line 692
    goto :goto_18

    .line 693
    :cond_24
    const/16 v12, 0xc

    .line 694
    .line 695
    if-eq v5, v12, :cond_28

    .line 696
    .line 697
    const/16 v12, 0x1e

    .line 698
    .line 699
    if-eq v5, v12, :cond_28

    .line 700
    .line 701
    const/16 v12, 0x2c

    .line 702
    .line 703
    if-ne v5, v12, :cond_25

    .line 704
    .line 705
    goto :goto_17

    .line 706
    :cond_25
    const/16 v12, 0x32

    .line 707
    .line 708
    if-ne v5, v12, :cond_26

    .line 709
    .line 710
    add-int/lit8 v12, v22, 0x1

    .line 711
    .line 712
    aput v9, v13, v22

    .line 713
    .line 714
    div-int/lit8 v22, v9, 0x3

    .line 715
    .line 716
    add-int v22, v22, v22

    .line 717
    .line 718
    add-int/lit8 v27, v7, 0x1

    .line 719
    .line 720
    aget-object v7, v17, v7

    .line 721
    .line 722
    aput-object v7, v11, v22

    .line 723
    .line 724
    and-int/lit16 v7, v3, 0x800

    .line 725
    .line 726
    if-eqz v7, :cond_27

    .line 727
    .line 728
    add-int/lit8 v7, v27, 0x1

    .line 729
    .line 730
    add-int/lit8 v22, v22, 0x1

    .line 731
    .line 732
    aget-object v27, v17, v27

    .line 733
    .line 734
    aput-object v27, v11, v22

    .line 735
    .line 736
    move/from16 v22, v12

    .line 737
    .line 738
    :cond_26
    const/16 v25, 0x1

    .line 739
    .line 740
    goto :goto_1b

    .line 741
    :cond_27
    move/from16 v22, v12

    .line 742
    .line 743
    move/from16 v12, v27

    .line 744
    .line 745
    const/16 v25, 0x1

    .line 746
    .line 747
    goto :goto_1c

    .line 748
    :cond_28
    :goto_17
    if-nez v10, :cond_26

    .line 749
    .line 750
    div-int/lit8 v12, v9, 0x3

    .line 751
    .line 752
    add-int/lit8 v27, v7, 0x1

    .line 753
    .line 754
    add-int/2addr v12, v12

    .line 755
    const/16 v25, 0x1

    .line 756
    .line 757
    add-int/lit8 v12, v12, 0x1

    .line 758
    .line 759
    aget-object v7, v17, v7

    .line 760
    .line 761
    aput-object v7, v11, v12

    .line 762
    .line 763
    goto :goto_19

    .line 764
    :cond_29
    :goto_18
    const/16 v25, 0x1

    .line 765
    .line 766
    div-int/lit8 v12, v9, 0x3

    .line 767
    .line 768
    add-int/lit8 v27, v7, 0x1

    .line 769
    .line 770
    add-int/2addr v12, v12

    .line 771
    add-int/lit8 v12, v12, 0x1

    .line 772
    .line 773
    aget-object v7, v17, v7

    .line 774
    .line 775
    aput-object v7, v11, v12

    .line 776
    .line 777
    :goto_19
    move/from16 v12, v27

    .line 778
    .line 779
    goto :goto_1c

    .line 780
    :cond_2a
    :goto_1a
    const/16 v25, 0x1

    .line 781
    .line 782
    div-int/lit8 v12, v9, 0x3

    .line 783
    .line 784
    add-int/2addr v12, v12

    .line 785
    add-int/lit8 v12, v12, 0x1

    .line 786
    .line 787
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    move-result-object v27

    .line 791
    aput-object v27, v11, v12

    .line 792
    .line 793
    :goto_1b
    move v12, v7

    .line 794
    :goto_1c
    invoke-virtual {v15, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 795
    .line 796
    .line 797
    move-result-wide v7

    .line 798
    long-to-int v7, v7

    .line 799
    and-int/lit16 v8, v3, 0x1000

    .line 800
    .line 801
    const v27, 0xfffff

    .line 802
    .line 803
    .line 804
    move-object/from16 v29, v11

    .line 805
    .line 806
    const/16 v11, 0x1000

    .line 807
    .line 808
    if-ne v8, v11, :cond_2e

    .line 809
    .line 810
    const/16 v8, 0x11

    .line 811
    .line 812
    if-gt v5, v8, :cond_2e

    .line 813
    .line 814
    add-int/lit8 v8, v1, 0x1

    .line 815
    .line 816
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 817
    .line 818
    .line 819
    move-result v1

    .line 820
    const v11, 0xd800

    .line 821
    .line 822
    .line 823
    if-lt v1, v11, :cond_2c

    .line 824
    .line 825
    and-int/lit16 v1, v1, 0x1fff

    .line 826
    .line 827
    const/16 v26, 0xd

    .line 828
    .line 829
    :goto_1d
    add-int/lit8 v27, v8, 0x1

    .line 830
    .line 831
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 832
    .line 833
    .line 834
    move-result v8

    .line 835
    if-lt v8, v11, :cond_2b

    .line 836
    .line 837
    and-int/lit16 v8, v8, 0x1fff

    .line 838
    .line 839
    shl-int v8, v8, v26

    .line 840
    .line 841
    or-int/2addr v1, v8

    .line 842
    add-int/lit8 v26, v26, 0xd

    .line 843
    .line 844
    move/from16 v8, v27

    .line 845
    .line 846
    goto :goto_1d

    .line 847
    :cond_2b
    shl-int v8, v8, v26

    .line 848
    .line 849
    or-int/2addr v1, v8

    .line 850
    goto :goto_1e

    .line 851
    :cond_2c
    move/from16 v27, v8

    .line 852
    .line 853
    :goto_1e
    add-int v8, v6, v6

    .line 854
    .line 855
    div-int/lit8 v26, v1, 0x20

    .line 856
    .line 857
    add-int v26, v26, v8

    .line 858
    .line 859
    aget-object v8, v17, v26

    .line 860
    .line 861
    instance-of v11, v8, Ljava/lang/reflect/Field;

    .line 862
    .line 863
    if-eqz v11, :cond_2d

    .line 864
    .line 865
    check-cast v8, Ljava/lang/reflect/Field;

    .line 866
    .line 867
    goto :goto_1f

    .line 868
    :cond_2d
    check-cast v8, Ljava/lang/String;

    .line 869
    .line 870
    invoke-static {v2, v8}, Lcom/google/android/gms/internal/auth/zzfz;->zzA(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 871
    .line 872
    .line 873
    move-result-object v8

    .line 874
    aput-object v8, v17, v26

    .line 875
    .line 876
    :goto_1f
    move/from16 v26, v12

    .line 877
    .line 878
    invoke-virtual {v15, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 879
    .line 880
    .line 881
    move-result-wide v11

    .line 882
    long-to-int v8, v11

    .line 883
    rem-int/lit8 v1, v1, 0x20

    .line 884
    .line 885
    goto :goto_20

    .line 886
    :cond_2e
    move/from16 v26, v12

    .line 887
    .line 888
    move/from16 v8, v27

    .line 889
    .line 890
    move/from16 v27, v1

    .line 891
    .line 892
    const/4 v1, 0x0

    .line 893
    :goto_20
    const/16 v11, 0x12

    .line 894
    .line 895
    if-lt v5, v11, :cond_2f

    .line 896
    .line 897
    const/16 v11, 0x31

    .line 898
    .line 899
    if-gt v5, v11, :cond_2f

    .line 900
    .line 901
    add-int/lit8 v11, v23, 0x1

    .line 902
    .line 903
    aput v7, v13, v23

    .line 904
    .line 905
    move/from16 v23, v11

    .line 906
    .line 907
    :cond_2f
    move/from16 v16, v26

    .line 908
    .line 909
    :goto_21
    add-int/lit8 v11, v9, 0x1

    .line 910
    .line 911
    aput v4, v30, v9

    .line 912
    .line 913
    add-int/lit8 v4, v11, 0x1

    .line 914
    .line 915
    and-int/lit16 v9, v3, 0x200

    .line 916
    .line 917
    if-eqz v9, :cond_30

    .line 918
    .line 919
    const/high16 v9, 0x20000000

    .line 920
    .line 921
    goto :goto_22

    .line 922
    :cond_30
    const/4 v9, 0x0

    .line 923
    :goto_22
    and-int/lit16 v3, v3, 0x100

    .line 924
    .line 925
    if-eqz v3, :cond_31

    .line 926
    .line 927
    const/high16 v3, 0x10000000

    .line 928
    .line 929
    goto :goto_23

    .line 930
    :cond_31
    const/4 v3, 0x0

    .line 931
    :goto_23
    or-int/2addr v3, v9

    .line 932
    shl-int/lit8 v5, v5, 0x14

    .line 933
    .line 934
    or-int/2addr v3, v5

    .line 935
    or-int/2addr v3, v7

    .line 936
    aput v3, v30, v11

    .line 937
    .line 938
    add-int/lit8 v9, v4, 0x1

    .line 939
    .line 940
    shl-int/lit8 v1, v1, 0x14

    .line 941
    .line 942
    or-int/2addr v1, v8

    .line 943
    aput v1, v30, v4

    .line 944
    .line 945
    move v8, v14

    .line 946
    move/from16 v14, v24

    .line 947
    .line 948
    move/from16 v4, v27

    .line 949
    .line 950
    move/from16 v1, v28

    .line 951
    .line 952
    move-object/from16 v11, v29

    .line 953
    .line 954
    move-object/from16 v7, v30

    .line 955
    .line 956
    move/from16 v12, v31

    .line 957
    .line 958
    const v5, 0xd800

    .line 959
    .line 960
    .line 961
    goto/16 :goto_c

    .line 962
    .line 963
    :cond_32
    move-object/from16 v30, v7

    .line 964
    .line 965
    move-object/from16 v29, v11

    .line 966
    .line 967
    move/from16 v31, v12

    .line 968
    .line 969
    move/from16 v24, v14

    .line 970
    .line 971
    move v14, v8

    .line 972
    new-instance v0, Lcom/google/android/gms/internal/auth/zzfz;

    .line 973
    .line 974
    move-object v4, v0

    .line 975
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/auth/zzgg;->zza()Lcom/google/android/gms/internal/auth/zzfw;

    .line 976
    .line 977
    .line 978
    move-result-object v9

    .line 979
    const/4 v11, 0x0

    .line 980
    move-object/from16 v1, v29

    .line 981
    .line 982
    const/16 v20, 0x0

    .line 983
    .line 984
    move-object/from16 v5, v30

    .line 985
    .line 986
    move-object v6, v1

    .line 987
    move v7, v14

    .line 988
    move/from16 v8, v31

    .line 989
    .line 990
    move-object v12, v13

    .line 991
    move/from16 v13, v24

    .line 992
    .line 993
    move/from16 v14, v21

    .line 994
    .line 995
    move-object/from16 v15, p1

    .line 996
    .line 997
    move-object/from16 v16, p2

    .line 998
    .line 999
    move-object/from16 v17, p3

    .line 1000
    .line 1001
    move-object/from16 v18, p4

    .line 1002
    .line 1003
    move-object/from16 v19, p5

    .line 1004
    .line 1005
    invoke-direct/range {v4 .. v20}, Lcom/google/android/gms/internal/auth/zzfz;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/auth/zzfw;ZZ[IIILcom/google/android/gms/internal/auth/zzgb;Lcom/google/android/gms/internal/auth/zzfk;Lcom/google/android/gms/internal/auth/zzgy;Lcom/google/android/gms/internal/auth/zzel;Lcom/google/android/gms/internal/auth/zzfr;[B)V

    .line 1006
    .line 1007
    .line 1008
    return-object v0
.end method

.method private static zzl(Ljava/lang/Object;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private final zzm(Ljava/lang/Object;[BIIIJLcom/google/android/gms/internal/auth/zzds;)I
    .locals 0

    .line 1
    sget-object p2, Lcom/google/android/gms/internal/auth/zzfz;->zzb:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-direct {p0, p5}, Lcom/google/android/gms/internal/auth/zzfz;->zzz(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-virtual {p2, p1, p6, p7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    move-object p5, p4

    .line 12
    check-cast p5, Lcom/google/android/gms/internal/auth/zzfq;

    .line 13
    .line 14
    invoke-virtual {p5}, Lcom/google/android/gms/internal/auth/zzfq;->zze()Z

    .line 15
    .line 16
    .line 17
    move-result p5

    .line 18
    if-eqz p5, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfq;->zza()Lcom/google/android/gms/internal/auth/zzfq;

    .line 22
    .line 23
    .line 24
    move-result-object p5

    .line 25
    invoke-virtual {p5}, Lcom/google/android/gms/internal/auth/zzfq;->zzb()Lcom/google/android/gms/internal/auth/zzfq;

    .line 26
    .line 27
    .line 28
    move-result-object p5

    .line 29
    invoke-static {p5, p4}, Lcom/google/android/gms/internal/auth/zzfr;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p1, p6, p7, p5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    check-cast p3, Lcom/google/android/gms/internal/auth/zzfp;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    throw p1
.end method

.method private final zzn(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/auth/zzds;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v2, p5

    move/from16 v8, p6

    move/from16 v5, p7

    move-wide/from16 v9, p10

    move/from16 v6, p12

    move-object/from16 v11, p13

    .line 1
    sget-object v12, Lcom/google/android/gms/internal/auth/zzfz;->zzb:Lsun/misc/Unsafe;

    iget-object v7, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    add-int/lit8 v13, v6, 0x2

    aget v7, v7, v13

    const v13, 0xfffff

    and-int/2addr v7, v13

    int-to-long v13, v7

    const/4 v7, 0x5

    const/4 v15, 0x2

    packed-switch p9, :pswitch_data_0

    goto/16 :goto_9

    :pswitch_0
    const/4 v7, 0x3

    if-ne v5, v7, :cond_13

    .line 2
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    move-result-object v5

    and-int/lit8 v2, v2, -0x8

    or-int/lit8 v6, v2, 0x4

    move-object v2, v5

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v7, p13

    .line 3
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzc(Lcom/google/android/gms/internal/auth/zzgh;[BIIILcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    .line 4
    invoke-virtual {v12, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    if-ne v3, v8, :cond_0

    .line 5
    invoke-virtual {v12, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v15

    goto :goto_0

    :cond_0
    const/4 v15, 0x0

    :goto_0
    if-nez v15, :cond_1

    iget-object v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 6
    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    .line 7
    :cond_1
    iget-object v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 8
    invoke-static {v15, v3}, Lcom/google/android/gms/internal/auth/zzez;->zzg(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 9
    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 10
    :goto_1
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_a

    :pswitch_1
    if-eqz v5, :cond_2

    goto/16 :goto_9

    .line 11
    :cond_2
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    iget-wide v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 12
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzei;->zzc(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_2
    if-eqz v5, :cond_3

    goto/16 :goto_9

    .line 14
    :cond_3
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    iget v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 15
    invoke-static {v3}, Lcom/google/android/gms/internal/auth/zzei;->zzb(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 16
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_3
    if-nez v5, :cond_13

    .line 17
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v3

    iget v4, v11, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 18
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzx(I)Lcom/google/android/gms/internal/auth/zzex;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 19
    invoke-interface {v5}, Lcom/google/android/gms/internal/auth/zzex;->zza()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_2

    .line 20
    :cond_4
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/auth/zzfz;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/zzgz;

    move-result-object v1

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lcom/google/android/gms/internal/auth/zzgz;->zzf(ILjava/lang/Object;)V

    goto :goto_3

    .line 21
    :cond_5
    :goto_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v12, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 22
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_3
    move v2, v3

    goto/16 :goto_a

    :pswitch_4
    if-eq v5, v15, :cond_6

    goto/16 :goto_9

    .line 23
    :cond_6
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zza([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    iget-object v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 24
    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 25
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_5
    if-ne v5, v15, :cond_13

    .line 26
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    move-result-object v2

    move/from16 v5, p4

    .line 27
    invoke-static {v2, v3, v4, v5, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzd(Lcom/google/android/gms/internal/auth/zzgh;[BIILcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    .line 28
    invoke-virtual {v12, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    if-ne v3, v8, :cond_7

    .line 29
    invoke-virtual {v12, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v15

    goto :goto_4

    :cond_7
    const/4 v15, 0x0

    :goto_4
    if-nez v15, :cond_8

    iget-object v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 30
    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    .line 31
    :cond_8
    iget-object v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 32
    invoke-static {v15, v3}, Lcom/google/android/gms/internal/auth/zzez;->zzg(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 33
    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 34
    :goto_5
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_a

    :pswitch_6
    if-ne v5, v15, :cond_13

    .line 35
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    iget v4, v11, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-nez v4, :cond_9

    const-string v3, ""

    .line 36
    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :cond_9
    const/high16 v5, 0x20000000

    and-int v5, p8, v5

    if-eqz v5, :cond_b

    add-int v5, v2, v4

    .line 37
    invoke-static {v3, v2, v5}, Lcom/google/android/gms/internal/auth/zzhm;->zzd([BII)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_6

    .line 38
    :cond_a
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzb()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    .line 39
    :cond_b
    :goto_6
    new-instance v5, Ljava/lang/String;

    .line 40
    sget-object v6, Lcom/google/android/gms/internal/auth/zzez;->zzb:Ljava/nio/charset/Charset;

    invoke-direct {v5, v3, v2, v4, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 41
    invoke-virtual {v12, v1, v9, v10, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v2, v4

    .line 42
    :goto_7
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_a

    :pswitch_7
    if-nez v5, :cond_13

    .line 43
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    iget-wide v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-eqz v3, :cond_c

    const/4 v15, 0x1

    goto :goto_8

    :cond_c
    const/4 v15, 0x0

    .line 44
    :goto_8
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 45
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_8
    if-eq v5, v7, :cond_d

    goto/16 :goto_9

    .line 46
    :cond_d
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v12, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 47
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v4, 0x4

    return v1

    :pswitch_9
    const/4 v2, 0x1

    if-eq v5, v2, :cond_e

    goto :goto_9

    .line 48
    :cond_e
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v12, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 49
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v4, 0x8

    return v1

    :pswitch_a
    if-eqz v5, :cond_f

    goto :goto_9

    .line 50
    :cond_f
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    iget v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 51
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 52
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_b
    if-eqz v5, :cond_10

    goto :goto_9

    .line 53
    :cond_10
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    iget-wide v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 54
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v12, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 55
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_c
    if-eq v5, v7, :cond_11

    goto :goto_9

    .line 56
    :cond_11
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 57
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v12, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 58
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v4, 0x4

    return v1

    :pswitch_d
    const/4 v2, 0x1

    if-eq v5, v2, :cond_12

    goto :goto_9

    .line 59
    :cond_12
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    .line 60
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v12, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 61
    invoke-virtual {v12, v1, v13, v14, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v4, 0x8

    return v1

    :cond_13
    :goto_9
    move v2, v4

    :goto_a
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zzo(Ljava/lang/Object;[BIILcom/google/android/gms/internal/auth/zzds;)I
    .locals 29

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    move-object/from16 v12, p2

    .line 6
    .line 7
    move/from16 v13, p4

    .line 8
    .line 9
    move-object/from16 v11, p5

    .line 10
    .line 11
    sget-object v9, Lcom/google/android/gms/internal/auth/zzfz;->zzb:Lsun/misc/Unsafe;

    .line 12
    .line 13
    const v10, 0xfffff

    .line 14
    .line 15
    .line 16
    const/16 v16, 0x0

    .line 17
    .line 18
    const/4 v8, -0x1

    .line 19
    move/from16 v0, p3

    .line 20
    .line 21
    move v1, v8

    .line 22
    move v7, v10

    .line 23
    move/from16 v2, v16

    .line 24
    .line 25
    move v6, v2

    .line 26
    :goto_0
    if-ge v0, v13, :cond_15

    .line 27
    .line 28
    add-int/lit8 v3, v0, 0x1

    .line 29
    .line 30
    aget-byte v0, v12, v0

    .line 31
    .line 32
    if-gez v0, :cond_0

    .line 33
    .line 34
    invoke-static {v0, v12, v3, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzk(I[BILcom/google/android/gms/internal/auth/zzds;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 39
    .line 40
    move v4, v0

    .line 41
    move/from16 v17, v3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    move/from16 v17, v0

    .line 45
    .line 46
    move v4, v3

    .line 47
    :goto_1
    ushr-int/lit8 v5, v17, 0x3

    .line 48
    .line 49
    and-int/lit8 v3, v17, 0x7

    .line 50
    .line 51
    if-le v5, v1, :cond_1

    .line 52
    .line 53
    div-int/lit8 v2, v2, 0x3

    .line 54
    .line 55
    invoke-direct {v15, v5, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzr(II)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    invoke-direct {v15, v5}, Lcom/google/android/gms/internal/auth/zzfz;->zzq(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    :goto_2
    move v2, v0

    .line 65
    if-ne v2, v8, :cond_2

    .line 66
    .line 67
    move v2, v4

    .line 68
    move/from16 v21, v5

    .line 69
    .line 70
    move/from16 v18, v8

    .line 71
    .line 72
    move-object/from16 v28, v9

    .line 73
    .line 74
    move/from16 v24, v16

    .line 75
    .line 76
    goto/16 :goto_10

    .line 77
    .line 78
    :cond_2
    iget-object v0, v15, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 79
    .line 80
    add-int/lit8 v1, v2, 0x1

    .line 81
    .line 82
    aget v1, v0, v1

    .line 83
    .line 84
    invoke-static {v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzu(I)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    move/from16 p3, v5

    .line 89
    .line 90
    and-int v5, v1, v10

    .line 91
    .line 92
    int-to-long v10, v5

    .line 93
    const/16 v5, 0x11

    .line 94
    .line 95
    move-wide/from16 v20, v10

    .line 96
    .line 97
    if-gt v8, v5, :cond_c

    .line 98
    .line 99
    add-int/lit8 v5, v2, 0x2

    .line 100
    .line 101
    aget v0, v0, v5

    .line 102
    .line 103
    ushr-int/lit8 v5, v0, 0x14

    .line 104
    .line 105
    const/4 v11, 0x1

    .line 106
    shl-int v22, v11, v5

    .line 107
    .line 108
    const v5, 0xfffff

    .line 109
    .line 110
    .line 111
    and-int/2addr v0, v5

    .line 112
    if-eq v0, v7, :cond_5

    .line 113
    .line 114
    if-eq v7, v5, :cond_3

    .line 115
    .line 116
    int-to-long v10, v7

    .line 117
    invoke-virtual {v9, v14, v10, v11, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 118
    .line 119
    .line 120
    :cond_3
    if-eq v0, v5, :cond_4

    .line 121
    .line 122
    int-to-long v6, v0

    .line 123
    invoke-virtual {v9, v14, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    :cond_4
    move v7, v0

    .line 128
    :cond_5
    const/4 v0, 0x5

    .line 129
    packed-switch v8, :pswitch_data_0

    .line 130
    .line 131
    .line 132
    move/from16 v21, p3

    .line 133
    .line 134
    move-object/from16 v11, p5

    .line 135
    .line 136
    move v10, v2

    .line 137
    move v8, v4

    .line 138
    move/from16 v24, v5

    .line 139
    .line 140
    goto/16 :goto_a

    .line 141
    .line 142
    :pswitch_0
    if-nez v3, :cond_6

    .line 143
    .line 144
    move-object/from16 v11, p5

    .line 145
    .line 146
    move-wide/from16 v0, v20

    .line 147
    .line 148
    invoke-static {v12, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    iget-wide v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 153
    .line 154
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzei;->zzc(J)J

    .line 155
    .line 156
    .line 157
    move-result-wide v19

    .line 158
    move-wide v3, v0

    .line 159
    move-object v0, v9

    .line 160
    move-object/from16 v1, p1

    .line 161
    .line 162
    move v10, v2

    .line 163
    move-wide v2, v3

    .line 164
    move/from16 v21, p3

    .line 165
    .line 166
    move/from16 v24, v5

    .line 167
    .line 168
    move-wide/from16 v4, v19

    .line 169
    .line 170
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_7

    .line 174
    .line 175
    :cond_6
    move/from16 v21, p3

    .line 176
    .line 177
    move-object/from16 v11, p5

    .line 178
    .line 179
    move v10, v2

    .line 180
    move/from16 v24, v5

    .line 181
    .line 182
    goto/16 :goto_6

    .line 183
    .line 184
    :pswitch_1
    move-object/from16 v11, p5

    .line 185
    .line 186
    move v10, v2

    .line 187
    move/from16 v24, v5

    .line 188
    .line 189
    move-wide/from16 v0, v20

    .line 190
    .line 191
    move/from16 v21, p3

    .line 192
    .line 193
    if-nez v3, :cond_a

    .line 194
    .line 195
    invoke-static {v12, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    iget v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 200
    .line 201
    invoke-static {v3}, Lcom/google/android/gms/internal/auth/zzei;->zzb(I)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :pswitch_2
    move-object/from16 v11, p5

    .line 210
    .line 211
    move v10, v2

    .line 212
    move/from16 v24, v5

    .line 213
    .line 214
    move-wide/from16 v0, v20

    .line 215
    .line 216
    move/from16 v21, p3

    .line 217
    .line 218
    if-nez v3, :cond_a

    .line 219
    .line 220
    invoke-static {v12, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    iget v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 225
    .line 226
    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :pswitch_3
    move-object/from16 v11, p5

    .line 231
    .line 232
    move v10, v2

    .line 233
    move/from16 v24, v5

    .line 234
    .line 235
    move-wide/from16 v0, v20

    .line 236
    .line 237
    const/4 v2, 0x2

    .line 238
    move/from16 v21, p3

    .line 239
    .line 240
    if-ne v3, v2, :cond_a

    .line 241
    .line 242
    invoke-static {v12, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zza([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    iget-object v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 247
    .line 248
    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    :goto_3
    or-int v6, v6, v22

    .line 252
    .line 253
    move v0, v2

    .line 254
    goto/16 :goto_c

    .line 255
    .line 256
    :pswitch_4
    move-object/from16 v11, p5

    .line 257
    .line 258
    move v10, v2

    .line 259
    move/from16 v24, v5

    .line 260
    .line 261
    move-wide/from16 v0, v20

    .line 262
    .line 263
    const/4 v2, 0x2

    .line 264
    move/from16 v21, p3

    .line 265
    .line 266
    if-ne v3, v2, :cond_a

    .line 267
    .line 268
    invoke-direct {v15, v10}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    invoke-static {v2, v12, v4, v13, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzd(Lcom/google/android/gms/internal/auth/zzgh;[BIILcom/google/android/gms/internal/auth/zzds;)I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    invoke-virtual {v9, v14, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    if-nez v3, :cond_7

    .line 281
    .line 282
    iget-object v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 283
    .line 284
    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_7
    iget-object v4, v11, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 289
    .line 290
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzg(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-virtual {v9, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    goto :goto_3

    .line 298
    :pswitch_5
    move-object/from16 v11, p5

    .line 299
    .line 300
    move v10, v2

    .line 301
    move/from16 v24, v5

    .line 302
    .line 303
    move-wide/from16 v25, v20

    .line 304
    .line 305
    const/4 v0, 0x2

    .line 306
    move/from16 v21, p3

    .line 307
    .line 308
    if-ne v3, v0, :cond_a

    .line 309
    .line 310
    const/high16 v0, 0x20000000

    .line 311
    .line 312
    and-int/2addr v0, v1

    .line 313
    if-nez v0, :cond_8

    .line 314
    .line 315
    invoke-static {v12, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzg([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    goto :goto_4

    .line 320
    :cond_8
    invoke-static {v12, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzh([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    :goto_4
    iget-object v1, v11, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 325
    .line 326
    move-wide/from16 v2, v25

    .line 327
    .line 328
    invoke-virtual {v9, v14, v2, v3, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    goto/16 :goto_9

    .line 332
    .line 333
    :pswitch_6
    move-object/from16 v11, p5

    .line 334
    .line 335
    move v10, v2

    .line 336
    move/from16 v24, v5

    .line 337
    .line 338
    move-wide/from16 v1, v20

    .line 339
    .line 340
    move/from16 v21, p3

    .line 341
    .line 342
    if-nez v3, :cond_a

    .line 343
    .line 344
    invoke-static {v12, v4, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    iget-wide v3, v11, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 349
    .line 350
    const-wide/16 v19, 0x0

    .line 351
    .line 352
    cmp-long v3, v3, v19

    .line 353
    .line 354
    if-eqz v3, :cond_9

    .line 355
    .line 356
    const/4 v3, 0x1

    .line 357
    goto :goto_5

    .line 358
    :cond_9
    move/from16 v3, v16

    .line 359
    .line 360
    :goto_5
    invoke-static {v14, v1, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzk(Ljava/lang/Object;JZ)V

    .line 361
    .line 362
    .line 363
    goto/16 :goto_9

    .line 364
    .line 365
    :pswitch_7
    move-object/from16 v11, p5

    .line 366
    .line 367
    move v10, v2

    .line 368
    move/from16 v24, v5

    .line 369
    .line 370
    move-wide/from16 v1, v20

    .line 371
    .line 372
    move/from16 v21, p3

    .line 373
    .line 374
    if-ne v3, v0, :cond_a

    .line 375
    .line 376
    invoke-static {v12, v4}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    invoke-virtual {v9, v14, v1, v2, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 381
    .line 382
    .line 383
    add-int/lit8 v0, v4, 0x4

    .line 384
    .line 385
    goto/16 :goto_9

    .line 386
    .line 387
    :pswitch_8
    move-object/from16 v11, p5

    .line 388
    .line 389
    move v10, v2

    .line 390
    move/from16 v24, v5

    .line 391
    .line 392
    move-wide/from16 v1, v20

    .line 393
    .line 394
    const/4 v0, 0x1

    .line 395
    move/from16 v21, p3

    .line 396
    .line 397
    if-ne v3, v0, :cond_a

    .line 398
    .line 399
    invoke-static {v12, v4}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    .line 400
    .line 401
    .line 402
    move-result-wide v19

    .line 403
    move-object v0, v9

    .line 404
    move-wide v2, v1

    .line 405
    move-object/from16 v1, p1

    .line 406
    .line 407
    move v8, v4

    .line 408
    move-wide/from16 v4, v19

    .line 409
    .line 410
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 411
    .line 412
    .line 413
    goto/16 :goto_8

    .line 414
    .line 415
    :cond_a
    :goto_6
    move v8, v4

    .line 416
    goto/16 :goto_a

    .line 417
    .line 418
    :pswitch_9
    move-object/from16 v11, p5

    .line 419
    .line 420
    move v10, v2

    .line 421
    move v8, v4

    .line 422
    move/from16 v24, v5

    .line 423
    .line 424
    move-wide/from16 v4, v20

    .line 425
    .line 426
    move/from16 v21, p3

    .line 427
    .line 428
    if-nez v3, :cond_b

    .line 429
    .line 430
    invoke-static {v12, v8, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    iget v1, v11, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 435
    .line 436
    invoke-virtual {v9, v14, v4, v5, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 437
    .line 438
    .line 439
    goto/16 :goto_9

    .line 440
    .line 441
    :pswitch_a
    move-object/from16 v11, p5

    .line 442
    .line 443
    move v10, v2

    .line 444
    move v8, v4

    .line 445
    move/from16 v24, v5

    .line 446
    .line 447
    move-wide/from16 v4, v20

    .line 448
    .line 449
    move/from16 v21, p3

    .line 450
    .line 451
    if-nez v3, :cond_b

    .line 452
    .line 453
    invoke-static {v12, v8, v11}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 454
    .line 455
    .line 456
    move-result v8

    .line 457
    iget-wide v2, v11, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 458
    .line 459
    move-object v0, v9

    .line 460
    move-object/from16 v1, p1

    .line 461
    .line 462
    move-wide/from16 v19, v2

    .line 463
    .line 464
    move-wide v2, v4

    .line 465
    move-wide/from16 v4, v19

    .line 466
    .line 467
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 468
    .line 469
    .line 470
    :goto_7
    or-int v6, v6, v22

    .line 471
    .line 472
    move v0, v8

    .line 473
    goto/16 :goto_c

    .line 474
    .line 475
    :pswitch_b
    move-object/from16 v11, p5

    .line 476
    .line 477
    move v10, v2

    .line 478
    move v8, v4

    .line 479
    move/from16 v24, v5

    .line 480
    .line 481
    move-wide/from16 v4, v20

    .line 482
    .line 483
    move/from16 v21, p3

    .line 484
    .line 485
    if-ne v3, v0, :cond_b

    .line 486
    .line 487
    invoke-static {v12, v8}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    invoke-static {v14, v4, v5, v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzm(Ljava/lang/Object;JF)V

    .line 496
    .line 497
    .line 498
    add-int/lit8 v0, v8, 0x4

    .line 499
    .line 500
    goto :goto_9

    .line 501
    :pswitch_c
    move-object/from16 v11, p5

    .line 502
    .line 503
    move v10, v2

    .line 504
    move v8, v4

    .line 505
    move/from16 v24, v5

    .line 506
    .line 507
    move-wide/from16 v4, v20

    .line 508
    .line 509
    const/4 v0, 0x1

    .line 510
    move/from16 v21, p3

    .line 511
    .line 512
    if-ne v3, v0, :cond_b

    .line 513
    .line 514
    invoke-static {v12, v8}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    .line 515
    .line 516
    .line 517
    move-result-wide v0

    .line 518
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 519
    .line 520
    .line 521
    move-result-wide v0

    .line 522
    invoke-static {v14, v4, v5, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzl(Ljava/lang/Object;JD)V

    .line 523
    .line 524
    .line 525
    :goto_8
    add-int/lit8 v0, v8, 0x8

    .line 526
    .line 527
    :goto_9
    or-int v6, v6, v22

    .line 528
    .line 529
    goto :goto_c

    .line 530
    :cond_b
    :goto_a
    move v2, v8

    .line 531
    move-object/from16 v28, v9

    .line 532
    .line 533
    move/from16 v24, v10

    .line 534
    .line 535
    const/16 v18, -0x1

    .line 536
    .line 537
    goto/16 :goto_10

    .line 538
    .line 539
    :cond_c
    move-object/from16 v11, p5

    .line 540
    .line 541
    move v10, v2

    .line 542
    move v2, v4

    .line 543
    move-wide/from16 v4, v20

    .line 544
    .line 545
    const v24, 0xfffff

    .line 546
    .line 547
    .line 548
    move/from16 v21, p3

    .line 549
    .line 550
    const/16 v0, 0x1b

    .line 551
    .line 552
    if-ne v8, v0, :cond_10

    .line 553
    .line 554
    const/4 v0, 0x2

    .line 555
    if-ne v3, v0, :cond_f

    .line 556
    .line 557
    invoke-virtual {v9, v14, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    check-cast v0, Lcom/google/android/gms/internal/auth/zzey;

    .line 562
    .line 563
    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/zzey;->zzc()Z

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    if-nez v1, :cond_e

    .line 568
    .line 569
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    if-nez v1, :cond_d

    .line 574
    .line 575
    const/16 v1, 0xa

    .line 576
    .line 577
    goto :goto_b

    .line 578
    :cond_d
    add-int/2addr v1, v1

    .line 579
    :goto_b
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/auth/zzey;->zzd(I)Lcom/google/android/gms/internal/auth/zzey;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-virtual {v9, v14, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    :cond_e
    move-object v5, v0

    .line 587
    invoke-direct {v15, v10}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    move/from16 v1, v17

    .line 592
    .line 593
    move v3, v2

    .line 594
    move-object/from16 v2, p2

    .line 595
    .line 596
    move/from16 v4, p4

    .line 597
    .line 598
    move v8, v6

    .line 599
    move-object/from16 v6, p5

    .line 600
    .line 601
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/auth/zzdt;->zze(Lcom/google/android/gms/internal/auth/zzgh;I[BIILcom/google/android/gms/internal/auth/zzey;Lcom/google/android/gms/internal/auth/zzds;)I

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    move v6, v8

    .line 606
    :goto_c
    move v2, v10

    .line 607
    move/from16 v1, v21

    .line 608
    .line 609
    move/from16 v10, v24

    .line 610
    .line 611
    const/4 v8, -0x1

    .line 612
    goto/16 :goto_0

    .line 613
    .line 614
    :cond_f
    move v14, v2

    .line 615
    move/from16 v23, v6

    .line 616
    .line 617
    move v15, v7

    .line 618
    move-object/from16 v28, v9

    .line 619
    .line 620
    move/from16 v24, v10

    .line 621
    .line 622
    const/16 v18, -0x1

    .line 623
    .line 624
    goto/16 :goto_e

    .line 625
    .line 626
    :cond_10
    const/16 v0, 0x31

    .line 627
    .line 628
    if-gt v8, v0, :cond_12

    .line 629
    .line 630
    int-to-long v0, v1

    .line 631
    move-wide/from16 v19, v0

    .line 632
    .line 633
    move-object/from16 v0, p0

    .line 634
    .line 635
    move-object/from16 v1, p1

    .line 636
    .line 637
    move/from16 p3, v2

    .line 638
    .line 639
    move-object/from16 v2, p2

    .line 640
    .line 641
    move/from16 v22, v3

    .line 642
    .line 643
    move/from16 v3, p3

    .line 644
    .line 645
    move-wide/from16 v25, v4

    .line 646
    .line 647
    move/from16 v4, p4

    .line 648
    .line 649
    move/from16 v5, v17

    .line 650
    .line 651
    move v15, v6

    .line 652
    move/from16 v6, v21

    .line 653
    .line 654
    move/from16 v23, v15

    .line 655
    .line 656
    move v15, v7

    .line 657
    move/from16 v7, v22

    .line 658
    .line 659
    move/from16 v27, v8

    .line 660
    .line 661
    const/16 v18, -0x1

    .line 662
    .line 663
    move v8, v10

    .line 664
    move-object/from16 v28, v9

    .line 665
    .line 666
    move/from16 v24, v10

    .line 667
    .line 668
    move-wide/from16 v9, v19

    .line 669
    .line 670
    move/from16 v11, v27

    .line 671
    .line 672
    move-wide/from16 v12, v25

    .line 673
    .line 674
    move-object/from16 v14, p5

    .line 675
    .line 676
    invoke-direct/range {v0 .. v14}, Lcom/google/android/gms/internal/auth/zzfz;->zzp(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/auth/zzds;)I

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    move/from16 v14, p3

    .line 681
    .line 682
    if-eq v0, v14, :cond_11

    .line 683
    .line 684
    :goto_d
    move-object/from16 v14, p1

    .line 685
    .line 686
    move-object/from16 v12, p2

    .line 687
    .line 688
    move/from16 v13, p4

    .line 689
    .line 690
    move-object/from16 v11, p5

    .line 691
    .line 692
    move v7, v15

    .line 693
    move/from16 v8, v18

    .line 694
    .line 695
    move/from16 v1, v21

    .line 696
    .line 697
    move/from16 v6, v23

    .line 698
    .line 699
    move/from16 v2, v24

    .line 700
    .line 701
    move-object/from16 v9, v28

    .line 702
    .line 703
    const v10, 0xfffff

    .line 704
    .line 705
    .line 706
    move-object/from16 v15, p0

    .line 707
    .line 708
    goto/16 :goto_0

    .line 709
    .line 710
    :cond_11
    move v2, v0

    .line 711
    goto :goto_f

    .line 712
    :cond_12
    move v14, v2

    .line 713
    move/from16 v22, v3

    .line 714
    .line 715
    move-wide/from16 v25, v4

    .line 716
    .line 717
    move/from16 v23, v6

    .line 718
    .line 719
    move v15, v7

    .line 720
    move/from16 v27, v8

    .line 721
    .line 722
    move-object/from16 v28, v9

    .line 723
    .line 724
    move/from16 v24, v10

    .line 725
    .line 726
    const/16 v18, -0x1

    .line 727
    .line 728
    const/16 v0, 0x32

    .line 729
    .line 730
    move/from16 v9, v27

    .line 731
    .line 732
    if-ne v9, v0, :cond_14

    .line 733
    .line 734
    move/from16 v7, v22

    .line 735
    .line 736
    const/4 v0, 0x2

    .line 737
    if-ne v7, v0, :cond_13

    .line 738
    .line 739
    move-object/from16 v0, p0

    .line 740
    .line 741
    move-object/from16 v1, p1

    .line 742
    .line 743
    move-object/from16 v2, p2

    .line 744
    .line 745
    move v3, v14

    .line 746
    move/from16 v4, p4

    .line 747
    .line 748
    move/from16 v5, v24

    .line 749
    .line 750
    move-wide/from16 v6, v25

    .line 751
    .line 752
    move-object/from16 v8, p5

    .line 753
    .line 754
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/auth/zzfz;->zzm(Ljava/lang/Object;[BIIIJLcom/google/android/gms/internal/auth/zzds;)I

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    if-eq v0, v14, :cond_11

    .line 759
    .line 760
    goto :goto_d

    .line 761
    :cond_13
    :goto_e
    move v2, v14

    .line 762
    :goto_f
    move v7, v15

    .line 763
    move/from16 v6, v23

    .line 764
    .line 765
    goto :goto_10

    .line 766
    :cond_14
    move/from16 v7, v22

    .line 767
    .line 768
    move-object/from16 v0, p0

    .line 769
    .line 770
    move v8, v1

    .line 771
    move-object/from16 v1, p1

    .line 772
    .line 773
    move-object/from16 v2, p2

    .line 774
    .line 775
    move v3, v14

    .line 776
    move/from16 v4, p4

    .line 777
    .line 778
    move/from16 v5, v17

    .line 779
    .line 780
    move/from16 v6, v21

    .line 781
    .line 782
    move-wide/from16 v10, v25

    .line 783
    .line 784
    move/from16 v12, v24

    .line 785
    .line 786
    move-object/from16 v13, p5

    .line 787
    .line 788
    invoke-direct/range {v0 .. v13}, Lcom/google/android/gms/internal/auth/zzfz;->zzn(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/auth/zzds;)I

    .line 789
    .line 790
    .line 791
    move-result v0

    .line 792
    if-eq v0, v14, :cond_11

    .line 793
    .line 794
    goto :goto_d

    .line 795
    :goto_10
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/auth/zzfz;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/zzgz;

    .line 796
    .line 797
    .line 798
    move-result-object v4

    .line 799
    move/from16 v0, v17

    .line 800
    .line 801
    move-object/from16 v1, p2

    .line 802
    .line 803
    move/from16 v3, p4

    .line 804
    .line 805
    move-object/from16 v5, p5

    .line 806
    .line 807
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/zzdt;->zzi(I[BIILcom/google/android/gms/internal/auth/zzgz;Lcom/google/android/gms/internal/auth/zzds;)I

    .line 808
    .line 809
    .line 810
    move-result v0

    .line 811
    move-object/from16 v15, p0

    .line 812
    .line 813
    move-object/from16 v14, p1

    .line 814
    .line 815
    move-object/from16 v12, p2

    .line 816
    .line 817
    move/from16 v13, p4

    .line 818
    .line 819
    move-object/from16 v11, p5

    .line 820
    .line 821
    move/from16 v8, v18

    .line 822
    .line 823
    move/from16 v1, v21

    .line 824
    .line 825
    move/from16 v2, v24

    .line 826
    .line 827
    move-object/from16 v9, v28

    .line 828
    .line 829
    const v10, 0xfffff

    .line 830
    .line 831
    .line 832
    goto/16 :goto_0

    .line 833
    .line 834
    :cond_15
    move/from16 v23, v6

    .line 835
    .line 836
    move v15, v7

    .line 837
    move-object/from16 v28, v9

    .line 838
    .line 839
    move v1, v10

    .line 840
    if-eq v15, v1, :cond_16

    .line 841
    .line 842
    int-to-long v1, v15

    .line 843
    move-object/from16 v3, p1

    .line 844
    .line 845
    move/from16 v6, v23

    .line 846
    .line 847
    move-object/from16 v4, v28

    .line 848
    .line 849
    invoke-virtual {v4, v3, v1, v2, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 850
    .line 851
    .line 852
    :cond_16
    move/from16 v1, p4

    .line 853
    .line 854
    if-ne v0, v1, :cond_17

    .line 855
    .line 856
    return v0

    .line 857
    :cond_17
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzd()Lcom/google/android/gms/internal/auth/zzfa;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    throw v0

    .line 862
    nop

    .line 863
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zzp(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/auth/zzds;)I
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v2, p5

    move/from16 v6, p7

    move/from16 v8, p8

    move-wide/from16 v9, p12

    move-object/from16 v7, p14

    .line 1
    sget-object v11, Lcom/google/android/gms/internal/auth/zzfz;->zzb:Lsun/misc/Unsafe;

    invoke-virtual {v11, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/auth/zzey;

    .line 2
    invoke-interface {v12}, Lcom/google/android/gms/internal/auth/zzey;->zzc()Z

    move-result v13

    if-nez v13, :cond_1

    .line 3
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    if-nez v13, :cond_0

    const/16 v13, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v13, v13

    .line 4
    :goto_0
    invoke-interface {v12, v13}, Lcom/google/android/gms/internal/auth/zzey;->zzd(I)Lcom/google/android/gms/internal/auth/zzey;

    move-result-object v12

    .line 5
    invoke-virtual {v11, v1, v9, v10, v12}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    const/4 v9, 0x5

    const-wide/16 v10, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x2

    packed-switch p11, :pswitch_data_0

    const/4 v1, 0x3

    if-ne v6, v1, :cond_48

    .line 6
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    move-result-object v1

    and-int/lit8 v6, v2, -0x8

    or-int/lit8 v6, v6, 0x4

    move-object/from16 p6, v1

    move-object/from16 p7, p2

    move/from16 p8, p3

    move/from16 p9, p4

    move/from16 p10, v6

    move-object/from16 p11, p14

    .line 7
    invoke-static/range {p6 .. p11}, Lcom/google/android/gms/internal/auth/zzdt;->zzc(Lcom/google/android/gms/internal/auth/zzgh;[BIIILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget-object v8, v7, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 8
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_25

    :pswitch_0
    if-ne v6, v14, :cond_4

    .line 9
    check-cast v12, Lcom/google/android/gms/internal/auth/zzfl;

    .line 10
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    add-int/2addr v2, v1

    :goto_1
    if-ge v1, v2, :cond_2

    .line 11
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget-wide v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 12
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/auth/zzei;->zzc(J)J

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, Lcom/google/android/gms/internal/auth/zzfl;->zze(J)V

    goto :goto_1

    :cond_2
    if-ne v1, v2, :cond_3

    goto/16 :goto_28

    .line 13
    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzf()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    :cond_4
    if-nez v6, :cond_48

    .line 14
    check-cast v12, Lcom/google/android/gms/internal/auth/zzfl;

    .line 15
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget-wide v8, v7, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 16
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/auth/zzei;->zzc(J)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/auth/zzfl;->zze(J)V

    :goto_2
    if-ge v1, v5, :cond_6

    .line 17
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-eq v2, v6, :cond_5

    goto :goto_3

    .line 18
    :cond_5
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget-wide v8, v7, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    invoke-static {v8, v9}, Lcom/google/android/gms/internal/auth/zzei;->zzc(J)J

    move-result-wide v8

    .line 19
    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/auth/zzfl;->zze(J)V

    goto :goto_2

    :cond_6
    :goto_3
    return v1

    :pswitch_1
    if-ne v6, v14, :cond_9

    .line 20
    check-cast v12, Lcom/google/android/gms/internal/auth/zzev;

    .line 21
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    add-int/2addr v2, v1

    :goto_4
    if-ge v1, v2, :cond_7

    .line 22
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 23
    invoke-static {v4}, Lcom/google/android/gms/internal/auth/zzei;->zzb(I)I

    move-result v4

    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/auth/zzev;->zze(I)V

    goto :goto_4

    :cond_7
    if-ne v1, v2, :cond_8

    goto/16 :goto_28

    .line 24
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzf()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    :cond_9
    if-nez v6, :cond_48

    .line 25
    check-cast v12, Lcom/google/android/gms/internal/auth/zzev;

    .line 26
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 27
    invoke-static {v4}, Lcom/google/android/gms/internal/auth/zzei;->zzb(I)I

    move-result v4

    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/auth/zzev;->zze(I)V

    :goto_5
    if-ge v1, v5, :cond_b

    .line 28
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-eq v2, v6, :cond_a

    goto :goto_6

    .line 29
    :cond_a
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    invoke-static {v4}, Lcom/google/android/gms/internal/auth/zzei;->zzb(I)I

    move-result v4

    .line 30
    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/auth/zzev;->zze(I)V

    goto :goto_5

    :cond_b
    :goto_6
    return v1

    :pswitch_2
    if-ne v6, v14, :cond_c

    .line 31
    invoke-static {v3, v4, v12, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzf([BILcom/google/android/gms/internal/auth/zzey;Lcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    goto :goto_7

    :cond_c
    if-nez v6, :cond_48

    move/from16 v2, p5

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object v6, v12

    move-object/from16 v7, p14

    .line 32
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzl(I[BIILcom/google/android/gms/internal/auth/zzey;Lcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    .line 33
    :goto_7
    check-cast v1, Lcom/google/android/gms/internal/auth/zzeu;

    iget-object v3, v1, Lcom/google/android/gms/internal/auth/zzeu;->zzc:Lcom/google/android/gms/internal/auth/zzgz;

    invoke-static {}, Lcom/google/android/gms/internal/auth/zzgz;->zza()Lcom/google/android/gms/internal/auth/zzgz;

    move-result-object v4

    if-ne v3, v4, :cond_d

    const/4 v3, 0x0

    .line 34
    :cond_d
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/auth/zzfz;->zzx(I)Lcom/google/android/gms/internal/auth/zzex;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/internal/auth/zzfz;->zzm:Lcom/google/android/gms/internal/auth/zzgy;

    move/from16 v6, p6

    .line 35
    invoke-static {v6, v12, v4, v3, v5}, Lcom/google/android/gms/internal/auth/zzgj;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/auth/zzex;Ljava/lang/Object;Lcom/google/android/gms/internal/auth/zzgy;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_e

    goto/16 :goto_11

    :cond_e
    check-cast v3, Lcom/google/android/gms/internal/auth/zzgz;

    .line 36
    iput-object v3, v1, Lcom/google/android/gms/internal/auth/zzeu;->zzc:Lcom/google/android/gms/internal/auth/zzgz;

    return v2

    :pswitch_3
    if-ne v6, v14, :cond_48

    .line 37
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-ltz v4, :cond_16

    .line 38
    array-length v6, v3

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_15

    if-nez v4, :cond_f

    .line 39
    sget-object v4, Lcom/google/android/gms/internal/auth/zzee;->zzb:Lcom/google/android/gms/internal/auth/zzee;

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 40
    :cond_f
    invoke-static {v3, v1, v4}, Lcom/google/android/gms/internal/auth/zzee;->zzk([BII)Lcom/google/android/gms/internal/auth/zzee;

    move-result-object v6

    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_8
    add-int/2addr v1, v4

    :goto_9
    if-ge v1, v5, :cond_14

    .line 41
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-eq v2, v6, :cond_10

    goto :goto_a

    .line 42
    :cond_10
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-ltz v4, :cond_13

    .line 43
    array-length v6, v3

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_12

    if-nez v4, :cond_11

    .line 44
    sget-object v4, Lcom/google/android/gms/internal/auth/zzee;->zzb:Lcom/google/android/gms/internal/auth/zzee;

    .line 45
    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 46
    :cond_11
    invoke-static {v3, v1, v4}, Lcom/google/android/gms/internal/auth/zzee;->zzk([BII)Lcom/google/android/gms/internal/auth/zzee;

    move-result-object v6

    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 47
    :cond_12
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzf()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    .line 48
    :cond_13
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzc()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    :cond_14
    :goto_a
    return v1

    .line 49
    :cond_15
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzf()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    .line 50
    :cond_16
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzc()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    :pswitch_4
    if-eq v6, v14, :cond_17

    goto/16 :goto_27

    .line 51
    :cond_17
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    move-result-object v1

    move-object/from16 p6, v1

    move/from16 p7, p5

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p11, v12

    move-object/from16 p12, p14

    .line 52
    invoke-static/range {p6 .. p12}, Lcom/google/android/gms/internal/auth/zzdt;->zze(Lcom/google/android/gms/internal/auth/zzgh;I[BIILcom/google/android/gms/internal/auth/zzey;Lcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    return v1

    :pswitch_5
    if-ne v6, v14, :cond_48

    const-wide/32 v8, 0x20000000

    and-long v8, p9, v8

    cmp-long v1, v8, v10

    const-string v6, ""

    if-nez v1, :cond_1c

    .line 53
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-ltz v4, :cond_1b

    if-nez v4, :cond_18

    .line 54
    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 55
    :cond_18
    new-instance v8, Ljava/lang/String;

    .line 56
    sget-object v9, Lcom/google/android/gms/internal/auth/zzez;->zzb:Ljava/nio/charset/Charset;

    invoke-direct {v8, v3, v1, v4, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 57
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_b
    add-int/2addr v1, v4

    :goto_c
    if-ge v1, v5, :cond_49

    .line 58
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget v8, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-ne v2, v8, :cond_49

    .line 59
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-ltz v4, :cond_1a

    if-nez v4, :cond_19

    .line 60
    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_19
    new-instance v8, Ljava/lang/String;

    .line 61
    sget-object v9, Lcom/google/android/gms/internal/auth/zzez;->zzb:Ljava/nio/charset/Charset;

    invoke-direct {v8, v3, v1, v4, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 62
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 63
    :cond_1a
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzc()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    .line 64
    :cond_1b
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzc()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    .line 65
    :cond_1c
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-ltz v4, :cond_22

    if-nez v4, :cond_1d

    .line 66
    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1d
    add-int v8, v1, v4

    .line 67
    invoke-static {v3, v1, v8}, Lcom/google/android/gms/internal/auth/zzhm;->zzd([BII)Z

    move-result v9

    if-eqz v9, :cond_21

    .line 68
    new-instance v9, Ljava/lang/String;

    .line 69
    sget-object v10, Lcom/google/android/gms/internal/auth/zzez;->zzb:Ljava/nio/charset/Charset;

    invoke-direct {v9, v3, v1, v4, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 70
    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_d
    move v1, v8

    :goto_e
    if-ge v1, v5, :cond_49

    .line 71
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget v8, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-ne v2, v8, :cond_49

    .line 72
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-ltz v4, :cond_20

    if-nez v4, :cond_1e

    .line 73
    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1e
    add-int v8, v1, v4

    .line 74
    invoke-static {v3, v1, v8}, Lcom/google/android/gms/internal/auth/zzhm;->zzd([BII)Z

    move-result v9

    if-eqz v9, :cond_1f

    .line 75
    new-instance v9, Ljava/lang/String;

    .line 76
    sget-object v10, Lcom/google/android/gms/internal/auth/zzez;->zzb:Ljava/nio/charset/Charset;

    invoke-direct {v9, v3, v1, v4, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 77
    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 78
    :cond_1f
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzb()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    .line 79
    :cond_20
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzc()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    .line 80
    :cond_21
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzb()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    .line 81
    :cond_22
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzc()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    :pswitch_6
    const/4 v1, 0x0

    if-ne v6, v14, :cond_26

    .line 82
    check-cast v12, Lcom/google/android/gms/internal/auth/zzdu;

    .line 83
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    iget v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    add-int/2addr v4, v2

    :goto_f
    if-ge v2, v4, :cond_24

    .line 84
    invoke-static {v3, v2, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v2

    iget-wide v5, v7, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    cmp-long v5, v5, v10

    if-eqz v5, :cond_23

    move v5, v13

    goto :goto_10

    :cond_23
    move v5, v1

    .line 85
    :goto_10
    invoke-virtual {v12, v5}, Lcom/google/android/gms/internal/auth/zzdu;->zze(Z)V

    goto :goto_f

    :cond_24
    if-ne v2, v4, :cond_25

    :goto_11
    move v1, v2

    goto/16 :goto_28

    .line 86
    :cond_25
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzf()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    :cond_26
    if-nez v6, :cond_48

    .line 87
    check-cast v12, Lcom/google/android/gms/internal/auth/zzdu;

    .line 88
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget-wide v8, v7, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    cmp-long v6, v8, v10

    if-eqz v6, :cond_27

    move v6, v13

    goto :goto_12

    :cond_27
    move v6, v1

    .line 89
    :goto_12
    invoke-virtual {v12, v6}, Lcom/google/android/gms/internal/auth/zzdu;->zze(Z)V

    :goto_13
    if-ge v4, v5, :cond_2a

    .line 90
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v6

    iget v8, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-eq v2, v8, :cond_28

    goto :goto_15

    .line 91
    :cond_28
    invoke-static {v3, v6, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget-wide v8, v7, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    cmp-long v6, v8, v10

    if-eqz v6, :cond_29

    move v6, v13

    goto :goto_14

    :cond_29
    move v6, v1

    .line 92
    :goto_14
    invoke-virtual {v12, v6}, Lcom/google/android/gms/internal/auth/zzdu;->zze(Z)V

    goto :goto_13

    :cond_2a
    :goto_15
    return v4

    :pswitch_7
    if-ne v6, v14, :cond_2d

    .line 93
    check-cast v12, Lcom/google/android/gms/internal/auth/zzev;

    .line 94
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    add-int/2addr v2, v1

    :goto_16
    if-ge v1, v2, :cond_2b

    .line 95
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    move-result v4

    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/auth/zzev;->zze(I)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_16

    :cond_2b
    if-ne v1, v2, :cond_2c

    goto/16 :goto_28

    .line 96
    :cond_2c
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzf()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    :cond_2d
    if-ne v6, v9, :cond_48

    .line 97
    check-cast v12, Lcom/google/android/gms/internal/auth/zzev;

    .line 98
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    move-result v1

    invoke-virtual {v12, v1}, Lcom/google/android/gms/internal/auth/zzev;->zze(I)V

    :goto_17
    add-int/lit8 v1, v4, 0x4

    if-ge v1, v5, :cond_2f

    .line 99
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-eq v2, v6, :cond_2e

    goto :goto_18

    .line 100
    :cond_2e
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    move-result v1

    invoke-virtual {v12, v1}, Lcom/google/android/gms/internal/auth/zzev;->zze(I)V

    goto :goto_17

    :cond_2f
    :goto_18
    return v1

    :pswitch_8
    if-ne v6, v14, :cond_32

    .line 101
    check-cast v12, Lcom/google/android/gms/internal/auth/zzfl;

    .line 102
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    add-int/2addr v2, v1

    :goto_19
    if-ge v1, v2, :cond_30

    .line 103
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, Lcom/google/android/gms/internal/auth/zzfl;->zze(J)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_19

    :cond_30
    if-ne v1, v2, :cond_31

    goto/16 :goto_28

    .line 104
    :cond_31
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzf()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    :cond_32
    if-ne v6, v13, :cond_48

    .line 105
    check-cast v12, Lcom/google/android/gms/internal/auth/zzfl;

    .line 106
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/auth/zzfl;->zze(J)V

    :goto_1a
    add-int/lit8 v1, v4, 0x8

    if-ge v1, v5, :cond_34

    .line 107
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-eq v2, v6, :cond_33

    goto :goto_1b

    .line 108
    :cond_33
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/auth/zzfl;->zze(J)V

    goto :goto_1a

    :cond_34
    :goto_1b
    return v1

    :pswitch_9
    if-ne v6, v14, :cond_35

    .line 109
    invoke-static {v3, v4, v12, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzf([BILcom/google/android/gms/internal/auth/zzey;Lcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    goto/16 :goto_28

    :cond_35
    if-eqz v6, :cond_36

    goto/16 :goto_27

    :cond_36
    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v12

    move-object/from16 p10, p14

    .line 110
    invoke-static/range {p5 .. p10}, Lcom/google/android/gms/internal/auth/zzdt;->zzl(I[BIILcom/google/android/gms/internal/auth/zzey;Lcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    return v1

    :pswitch_a
    if-ne v6, v14, :cond_39

    .line 111
    check-cast v12, Lcom/google/android/gms/internal/auth/zzfl;

    .line 112
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    add-int/2addr v2, v1

    :goto_1c
    if-ge v1, v2, :cond_37

    .line 113
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget-wide v4, v7, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 114
    invoke-virtual {v12, v4, v5}, Lcom/google/android/gms/internal/auth/zzfl;->zze(J)V

    goto :goto_1c

    :cond_37
    if-ne v1, v2, :cond_38

    goto/16 :goto_28

    .line 115
    :cond_38
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzf()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    :cond_39
    if-nez v6, :cond_48

    .line 116
    check-cast v12, Lcom/google/android/gms/internal/auth/zzfl;

    .line 117
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget-wide v8, v7, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 118
    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/auth/zzfl;->zze(J)V

    :goto_1d
    if-ge v1, v5, :cond_3b

    .line 119
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-eq v2, v6, :cond_3a

    goto :goto_1e

    .line 120
    :cond_3a
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget-wide v8, v7, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 121
    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/auth/zzfl;->zze(J)V

    goto :goto_1d

    :cond_3b
    :goto_1e
    return v1

    :pswitch_b
    if-ne v6, v14, :cond_3e

    .line 122
    check-cast v12, Lcom/google/android/gms/internal/auth/zzeq;

    .line 123
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    add-int/2addr v2, v1

    :goto_1f
    if-ge v1, v2, :cond_3c

    .line 124
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    .line 125
    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/auth/zzeq;->zze(F)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_1f

    :cond_3c
    if-ne v1, v2, :cond_3d

    goto/16 :goto_28

    .line 126
    :cond_3d
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzf()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    :cond_3e
    if-ne v6, v9, :cond_48

    .line 127
    check-cast v12, Lcom/google/android/gms/internal/auth/zzeq;

    .line 128
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 129
    invoke-virtual {v12, v1}, Lcom/google/android/gms/internal/auth/zzeq;->zze(F)V

    :goto_20
    add-int/lit8 v1, v4, 0x4

    if-ge v1, v5, :cond_40

    .line 130
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-eq v2, v6, :cond_3f

    goto :goto_21

    .line 131
    :cond_3f
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 132
    invoke-virtual {v12, v1}, Lcom/google/android/gms/internal/auth/zzeq;->zze(F)V

    goto :goto_20

    :cond_40
    :goto_21
    return v1

    :pswitch_c
    if-ne v6, v14, :cond_43

    .line 133
    check-cast v12, Lcom/google/android/gms/internal/auth/zzej;

    .line 134
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    add-int/2addr v2, v1

    :goto_22
    if-ge v1, v2, :cond_41

    .line 135
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    .line 136
    invoke-virtual {v12, v4, v5}, Lcom/google/android/gms/internal/auth/zzej;->zze(D)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_22

    :cond_41
    if-ne v1, v2, :cond_42

    goto :goto_28

    .line 137
    :cond_42
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzf()Lcom/google/android/gms/internal/auth/zzfa;

    move-result-object v1

    throw v1

    :cond_43
    if-ne v6, v13, :cond_48

    .line 138
    check-cast v12, Lcom/google/android/gms/internal/auth/zzej;

    .line 139
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    .line 140
    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/auth/zzej;->zze(D)V

    :goto_23
    add-int/lit8 v1, v4, 0x8

    if-ge v1, v5, :cond_45

    .line 141
    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-eq v2, v6, :cond_44

    goto :goto_24

    .line 142
    :cond_44
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    .line 143
    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/auth/zzej;->zze(D)V

    goto :goto_23

    :cond_45
    :goto_24
    return v1

    :goto_25
    if-ge v4, v5, :cond_47

    .line 144
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    move-result v8

    iget v9, v7, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    if-eq v2, v9, :cond_46

    goto :goto_26

    :cond_46
    move-object/from16 p6, v1

    move-object/from16 p7, p2

    move/from16 p8, v8

    move/from16 p9, p4

    move/from16 p10, v6

    move-object/from16 p11, p14

    .line 145
    invoke-static/range {p6 .. p11}, Lcom/google/android/gms/internal/auth/zzdt;->zzc(Lcom/google/android/gms/internal/auth/zzgh;[BIIILcom/google/android/gms/internal/auth/zzds;)I

    move-result v4

    iget-object v8, v7, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 146
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_47
    :goto_26
    return v4

    :cond_48
    :goto_27
    move v1, v4

    :cond_49
    :goto_28
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zzq(I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zze:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzf:I

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzt(II)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, -0x1

    .line 16
    return p1
.end method

.method private final zzr(II)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zze:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzf:I

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzfz;->zzt(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, -0x1

    .line 15
    return p1
.end method

.method private final zzs(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method private final zzt(II)I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    div-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    add-int/2addr v0, v1

    .line 8
    :goto_0
    if-gt p2, v0, :cond_2

    .line 9
    .line 10
    add-int v2, v0, p2

    .line 11
    .line 12
    ushr-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    mul-int/lit8 v3, v2, 0x3

    .line 15
    .line 16
    iget-object v4, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 17
    .line 18
    aget v4, v4, v3

    .line 19
    .line 20
    if-ne p1, v4, :cond_0

    .line 21
    .line 22
    return v3

    .line 23
    :cond_0
    if-ge p1, v4, :cond_1

    .line 24
    .line 25
    add-int/lit8 v2, v2, -0x1

    .line 26
    .line 27
    move v0, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    move p2, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    return v1
.end method

.method private static zzu(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method private final zzv(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method private static zzw(Ljava/lang/Object;J)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private final zzx(I)Lcom/google/android/gms/internal/auth/zzex;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzd:[Ljava/lang/Object;

    .line 4
    .line 5
    add-int/2addr p1, p1

    .line 6
    add-int/lit8 p1, p1, 0x1

    .line 7
    .line 8
    aget-object p1, v0, p1

    .line 9
    .line 10
    check-cast p1, Lcom/google/android/gms/internal/auth/zzex;

    .line 11
    .line 12
    return-object p1
.end method

.method private final zzy(I)Lcom/google/android/gms/internal/auth/zzgh;
    .locals 3

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    add-int/2addr p1, p1

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzd:[Ljava/lang/Object;

    .line 5
    .line 6
    aget-object v0, v0, p1

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/internal/auth/zzgh;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzge;->zza()Lcom/google/android/gms/internal/auth/zzge;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzd:[Ljava/lang/Object;

    .line 18
    .line 19
    add-int/lit8 v2, p1, 0x1

    .line 20
    .line 21
    aget-object v1, v1, v2

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/auth/zzge;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/zzgh;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzd:[Ljava/lang/Object;

    .line 30
    .line 31
    aput-object v0, v1, p1

    .line 32
    .line 33
    return-object v0
.end method

.method private final zzz(I)Ljava/lang/Object;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzd:[Ljava/lang/Object;

    .line 4
    .line 5
    add-int/2addr p1, p1

    .line 6
    aget-object p1, v0, p1

    .line 7
    .line 8
    return-object p1
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)I
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzv(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    iget-object v4, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 13
    .line 14
    aget v4, v4, v1

    .line 15
    .line 16
    const v5, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v5, v3

    .line 20
    int-to-long v5, v5

    .line 21
    invoke-static {v3}, Lcom/google/android/gms/internal/auth/zzfz;->zzu(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/16 v7, 0x25

    .line 26
    .line 27
    packed-switch v3, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :pswitch_0
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    mul-int/lit8 v2, v2, 0x35

    .line 39
    .line 40
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :pswitch_1
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    mul-int/lit8 v2, v2, 0x35

    .line 57
    .line 58
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzw(Ljava/lang/Object;J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :pswitch_2
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_1

    .line 73
    .line 74
    mul-int/lit8 v2, v2, 0x35

    .line 75
    .line 76
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzl(Ljava/lang/Object;J)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :pswitch_3
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_1

    .line 87
    .line 88
    mul-int/lit8 v2, v2, 0x35

    .line 89
    .line 90
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzw(Ljava/lang/Object;J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    goto/16 :goto_3

    .line 99
    .line 100
    :pswitch_4
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_1

    .line 105
    .line 106
    mul-int/lit8 v2, v2, 0x35

    .line 107
    .line 108
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzl(Ljava/lang/Object;J)I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    goto/16 :goto_2

    .line 113
    .line 114
    :pswitch_5
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_1

    .line 119
    .line 120
    mul-int/lit8 v2, v2, 0x35

    .line 121
    .line 122
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzl(Ljava/lang/Object;J)I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    goto/16 :goto_2

    .line 127
    .line 128
    :pswitch_6
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_1

    .line 133
    .line 134
    mul-int/lit8 v2, v2, 0x35

    .line 135
    .line 136
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzl(Ljava/lang/Object;J)I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    goto/16 :goto_2

    .line 141
    .line 142
    :pswitch_7
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-eqz v3, :cond_1

    .line 147
    .line 148
    mul-int/lit8 v2, v2, 0x35

    .line 149
    .line 150
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    goto/16 :goto_3

    .line 159
    .line 160
    :pswitch_8
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_1

    .line 165
    .line 166
    mul-int/lit8 v2, v2, 0x35

    .line 167
    .line 168
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    goto/16 :goto_3

    .line 177
    .line 178
    :pswitch_9
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_1

    .line 183
    .line 184
    mul-int/lit8 v2, v2, 0x35

    .line 185
    .line 186
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    check-cast v3, Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    goto/16 :goto_3

    .line 197
    .line 198
    :pswitch_a
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_1

    .line 203
    .line 204
    mul-int/lit8 v2, v2, 0x35

    .line 205
    .line 206
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    invoke-static {v3}, Lcom/google/android/gms/internal/auth/zzez;->zza(Z)I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    goto/16 :goto_3

    .line 221
    .line 222
    :pswitch_b
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eqz v3, :cond_1

    .line 227
    .line 228
    mul-int/lit8 v2, v2, 0x35

    .line 229
    .line 230
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzl(Ljava/lang/Object;J)I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    goto/16 :goto_2

    .line 235
    .line 236
    :pswitch_c
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-eqz v3, :cond_1

    .line 241
    .line 242
    mul-int/lit8 v2, v2, 0x35

    .line 243
    .line 244
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzw(Ljava/lang/Object;J)J

    .line 245
    .line 246
    .line 247
    move-result-wide v3

    .line 248
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    goto/16 :goto_3

    .line 253
    .line 254
    :pswitch_d
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-eqz v3, :cond_1

    .line 259
    .line 260
    mul-int/lit8 v2, v2, 0x35

    .line 261
    .line 262
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzl(Ljava/lang/Object;J)I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    goto/16 :goto_2

    .line 267
    .line 268
    :pswitch_e
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    if-eqz v3, :cond_1

    .line 273
    .line 274
    mul-int/lit8 v2, v2, 0x35

    .line 275
    .line 276
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzw(Ljava/lang/Object;J)J

    .line 277
    .line 278
    .line 279
    move-result-wide v3

    .line 280
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    goto/16 :goto_3

    .line 285
    .line 286
    :pswitch_f
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    if-eqz v3, :cond_1

    .line 291
    .line 292
    mul-int/lit8 v2, v2, 0x35

    .line 293
    .line 294
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzfz;->zzw(Ljava/lang/Object;J)J

    .line 295
    .line 296
    .line 297
    move-result-wide v3

    .line 298
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    goto/16 :goto_3

    .line 303
    .line 304
    :pswitch_10
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    if-eqz v3, :cond_1

    .line 309
    .line 310
    mul-int/lit8 v2, v2, 0x35

    .line 311
    .line 312
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    check-cast v3, Ljava/lang/Float;

    .line 317
    .line 318
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    goto/16 :goto_3

    .line 327
    .line 328
    :pswitch_11
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    if-eqz v3, :cond_1

    .line 333
    .line 334
    mul-int/lit8 v2, v2, 0x35

    .line 335
    .line 336
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    check-cast v3, Ljava/lang/Double;

    .line 341
    .line 342
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 343
    .line 344
    .line 345
    move-result-wide v3

    .line 346
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 347
    .line 348
    .line 349
    move-result-wide v3

    .line 350
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    goto/16 :goto_3

    .line 355
    .line 356
    :pswitch_12
    mul-int/lit8 v2, v2, 0x35

    .line 357
    .line 358
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    goto/16 :goto_3

    .line 367
    .line 368
    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    .line 369
    .line 370
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    goto/16 :goto_3

    .line 379
    .line 380
    :pswitch_14
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    if-eqz v3, :cond_0

    .line 385
    .line 386
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    goto :goto_1

    .line 391
    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    .line 392
    .line 393
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 394
    .line 395
    .line 396
    move-result-wide v3

    .line 397
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    goto/16 :goto_3

    .line 402
    .line 403
    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    .line 404
    .line 405
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    goto/16 :goto_2

    .line 410
    .line 411
    :pswitch_17
    mul-int/lit8 v2, v2, 0x35

    .line 412
    .line 413
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 414
    .line 415
    .line 416
    move-result-wide v3

    .line 417
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    goto/16 :goto_3

    .line 422
    .line 423
    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    .line 424
    .line 425
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    goto :goto_2

    .line 430
    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    .line 431
    .line 432
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    goto :goto_2

    .line 437
    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    .line 438
    .line 439
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    goto :goto_2

    .line 444
    :pswitch_1b
    mul-int/lit8 v2, v2, 0x35

    .line 445
    .line 446
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    goto/16 :goto_3

    .line 455
    .line 456
    :pswitch_1c
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    if-eqz v3, :cond_0

    .line 461
    .line 462
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 463
    .line 464
    .line 465
    move-result v7

    .line 466
    :cond_0
    :goto_1
    mul-int/lit8 v2, v2, 0x35

    .line 467
    .line 468
    add-int/2addr v2, v7

    .line 469
    goto :goto_4

    .line 470
    :pswitch_1d
    mul-int/lit8 v2, v2, 0x35

    .line 471
    .line 472
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    check-cast v3, Ljava/lang/String;

    .line 477
    .line 478
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    goto :goto_3

    .line 483
    :pswitch_1e
    mul-int/lit8 v2, v2, 0x35

    .line 484
    .line 485
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzt(Ljava/lang/Object;J)Z

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    invoke-static {v3}, Lcom/google/android/gms/internal/auth/zzez;->zza(Z)I

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    goto :goto_3

    .line 494
    :pswitch_1f
    mul-int/lit8 v2, v2, 0x35

    .line 495
    .line 496
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 497
    .line 498
    .line 499
    move-result v3

    .line 500
    goto :goto_2

    .line 501
    :pswitch_20
    mul-int/lit8 v2, v2, 0x35

    .line 502
    .line 503
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 504
    .line 505
    .line 506
    move-result-wide v3

    .line 507
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    goto :goto_3

    .line 512
    :pswitch_21
    mul-int/lit8 v2, v2, 0x35

    .line 513
    .line 514
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 515
    .line 516
    .line 517
    move-result v3

    .line 518
    :goto_2
    add-int/2addr v2, v3

    .line 519
    goto :goto_4

    .line 520
    :pswitch_22
    mul-int/lit8 v2, v2, 0x35

    .line 521
    .line 522
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 523
    .line 524
    .line 525
    move-result-wide v3

    .line 526
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    goto :goto_3

    .line 531
    :pswitch_23
    mul-int/lit8 v2, v2, 0x35

    .line 532
    .line 533
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 534
    .line 535
    .line 536
    move-result-wide v3

    .line 537
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    goto :goto_3

    .line 542
    :pswitch_24
    mul-int/lit8 v2, v2, 0x35

    .line 543
    .line 544
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzb(Ljava/lang/Object;J)F

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    goto :goto_3

    .line 553
    :pswitch_25
    mul-int/lit8 v2, v2, 0x35

    .line 554
    .line 555
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zza(Ljava/lang/Object;J)D

    .line 556
    .line 557
    .line 558
    move-result-wide v3

    .line 559
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 560
    .line 561
    .line 562
    move-result-wide v3

    .line 563
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzez;->zzc(J)I

    .line 564
    .line 565
    .line 566
    move-result v3

    .line 567
    :goto_3
    add-int/2addr v3, v2

    .line 568
    move v2, v3

    .line 569
    :cond_1
    :goto_4
    add-int/lit8 v1, v1, 0x3

    .line 570
    .line 571
    goto/16 :goto_0

    .line 572
    .line 573
    :cond_2
    mul-int/lit8 v2, v2, 0x35

    .line 574
    .line 575
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzm:Lcom/google/android/gms/internal/auth/zzgy;

    .line 576
    .line 577
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/zzgy;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 582
    .line 583
    .line 584
    move-result p1

    .line 585
    add-int/2addr p1, v2

    .line 586
    return p1

    .line 587
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzb(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/auth/zzds;)I
    .locals 29

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    move-object/from16 v12, p2

    .line 6
    .line 7
    move/from16 v13, p4

    .line 8
    .line 9
    move/from16 v11, p5

    .line 10
    .line 11
    move-object/from16 v9, p6

    .line 12
    .line 13
    sget-object v10, Lcom/google/android/gms/internal/auth/zzfz;->zzb:Lsun/misc/Unsafe;

    .line 14
    .line 15
    const/16 v16, 0x0

    .line 16
    .line 17
    move/from16 v0, p3

    .line 18
    .line 19
    move/from16 v1, v16

    .line 20
    .line 21
    move v3, v1

    .line 22
    move v5, v3

    .line 23
    const/4 v2, -0x1

    .line 24
    const v6, 0xfffff

    .line 25
    .line 26
    .line 27
    :goto_0
    if-ge v0, v13, :cond_18

    .line 28
    .line 29
    add-int/lit8 v1, v0, 0x1

    .line 30
    .line 31
    aget-byte v0, v12, v0

    .line 32
    .line 33
    if-gez v0, :cond_0

    .line 34
    .line 35
    invoke-static {v0, v12, v1, v9}, Lcom/google/android/gms/internal/auth/zzdt;->zzk(I[BILcom/google/android/gms/internal/auth/zzds;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget v1, v9, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 40
    .line 41
    move v4, v1

    .line 42
    move v1, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    move v4, v0

    .line 45
    :goto_1
    ushr-int/lit8 v0, v4, 0x3

    .line 46
    .line 47
    and-int/lit8 v8, v4, 0x7

    .line 48
    .line 49
    const/4 v7, 0x3

    .line 50
    if-le v0, v2, :cond_1

    .line 51
    .line 52
    div-int/2addr v3, v7

    .line 53
    invoke-direct {v15, v0, v3}, Lcom/google/android/gms/internal/auth/zzfz;->zzr(II)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    goto :goto_2

    .line 58
    :cond_1
    invoke-direct {v15, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzq(I)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    :goto_2
    const/4 v3, -0x1

    .line 63
    if-ne v2, v3, :cond_2

    .line 64
    .line 65
    move/from16 v19, v0

    .line 66
    .line 67
    move v2, v1

    .line 68
    move/from16 v20, v3

    .line 69
    .line 70
    move v8, v4

    .line 71
    move/from16 v22, v5

    .line 72
    .line 73
    move-object/from16 v28, v10

    .line 74
    .line 75
    move v7, v11

    .line 76
    move/from16 v21, v16

    .line 77
    .line 78
    goto/16 :goto_14

    .line 79
    .line 80
    :cond_2
    iget-object v3, v15, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 81
    .line 82
    add-int/lit8 v19, v2, 0x1

    .line 83
    .line 84
    aget v7, v3, v19

    .line 85
    .line 86
    invoke-static {v7}, Lcom/google/android/gms/internal/auth/zzfz;->zzu(I)I

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    move/from16 v19, v0

    .line 91
    .line 92
    const v17, 0xfffff

    .line 93
    .line 94
    .line 95
    and-int v0, v7, v17

    .line 96
    .line 97
    move/from16 v20, v1

    .line 98
    .line 99
    int-to-long v0, v0

    .line 100
    move-wide/from16 v21, v0

    .line 101
    .line 102
    const/16 v0, 0x11

    .line 103
    .line 104
    if-gt v11, v0, :cond_e

    .line 105
    .line 106
    add-int/lit8 v0, v2, 0x2

    .line 107
    .line 108
    aget v0, v3, v0

    .line 109
    .line 110
    ushr-int/lit8 v3, v0, 0x14

    .line 111
    .line 112
    const/4 v1, 0x1

    .line 113
    shl-int v23, v1, v3

    .line 114
    .line 115
    const v3, 0xfffff

    .line 116
    .line 117
    .line 118
    and-int/2addr v0, v3

    .line 119
    if-eq v0, v6, :cond_4

    .line 120
    .line 121
    move/from16 v17, v4

    .line 122
    .line 123
    if-eq v6, v3, :cond_3

    .line 124
    .line 125
    int-to-long v3, v6

    .line 126
    invoke-virtual {v10, v14, v3, v4, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 127
    .line 128
    .line 129
    :cond_3
    int-to-long v3, v0

    .line 130
    invoke-virtual {v10, v14, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    move/from16 v25, v0

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_4
    move/from16 v17, v4

    .line 138
    .line 139
    move/from16 v25, v6

    .line 140
    .line 141
    :goto_3
    move v6, v5

    .line 142
    const/4 v0, 0x5

    .line 143
    packed-switch v11, :pswitch_data_0

    .line 144
    .line 145
    .line 146
    move v11, v2

    .line 147
    move/from16 v13, v20

    .line 148
    .line 149
    move-wide/from16 v2, v21

    .line 150
    .line 151
    const/4 v0, 0x3

    .line 152
    const v18, 0xfffff

    .line 153
    .line 154
    .line 155
    const/16 v20, -0x1

    .line 156
    .line 157
    if-ne v8, v0, :cond_d

    .line 158
    .line 159
    invoke-direct {v15, v11}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    shl-int/lit8 v1, v19, 0x3

    .line 164
    .line 165
    or-int/lit8 v4, v1, 0x4

    .line 166
    .line 167
    move-object/from16 v1, p2

    .line 168
    .line 169
    move-wide v7, v2

    .line 170
    move v2, v13

    .line 171
    move/from16 v3, p4

    .line 172
    .line 173
    move-object/from16 v5, p6

    .line 174
    .line 175
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/zzdt;->zzc(Lcom/google/android/gms/internal/auth/zzgh;[BIIILcom/google/android/gms/internal/auth/zzds;)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    and-int v1, v6, v23

    .line 180
    .line 181
    if-nez v1, :cond_c

    .line 182
    .line 183
    iget-object v1, v9, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 184
    .line 185
    invoke-virtual {v10, v14, v7, v8, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_c

    .line 189
    .line 190
    :pswitch_0
    if-nez v8, :cond_5

    .line 191
    .line 192
    move/from16 v3, v20

    .line 193
    .line 194
    invoke-static {v12, v3, v9}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    iget-wide v0, v9, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 199
    .line 200
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/auth/zzei;->zzc(J)J

    .line 201
    .line 202
    .line 203
    move-result-wide v4

    .line 204
    move-object v0, v10

    .line 205
    move-object/from16 v1, p1

    .line 206
    .line 207
    move v11, v2

    .line 208
    const v18, 0xfffff

    .line 209
    .line 210
    .line 211
    const/16 v20, -0x1

    .line 212
    .line 213
    move-wide/from16 v2, v21

    .line 214
    .line 215
    move/from16 v8, v17

    .line 216
    .line 217
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 218
    .line 219
    .line 220
    or-int v5, v6, v23

    .line 221
    .line 222
    move v0, v7

    .line 223
    move v1, v8

    .line 224
    goto/16 :goto_a

    .line 225
    .line 226
    :cond_5
    move v11, v2

    .line 227
    move/from16 v3, v20

    .line 228
    .line 229
    const v18, 0xfffff

    .line 230
    .line 231
    .line 232
    const/16 v20, -0x1

    .line 233
    .line 234
    move v13, v3

    .line 235
    goto/16 :goto_f

    .line 236
    .line 237
    :pswitch_1
    move v11, v2

    .line 238
    move/from16 v4, v17

    .line 239
    .line 240
    move/from16 v3, v20

    .line 241
    .line 242
    const v18, 0xfffff

    .line 243
    .line 244
    .line 245
    const/16 v20, -0x1

    .line 246
    .line 247
    if-nez v8, :cond_b

    .line 248
    .line 249
    invoke-static {v12, v3, v9}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    iget v1, v9, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 254
    .line 255
    invoke-static {v1}, Lcom/google/android/gms/internal/auth/zzei;->zzb(I)I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    move-wide/from16 v7, v21

    .line 260
    .line 261
    invoke-virtual {v10, v14, v7, v8, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_8

    .line 265
    .line 266
    :pswitch_2
    move v11, v2

    .line 267
    move/from16 v4, v17

    .line 268
    .line 269
    move/from16 v3, v20

    .line 270
    .line 271
    move-wide/from16 v0, v21

    .line 272
    .line 273
    const v18, 0xfffff

    .line 274
    .line 275
    .line 276
    const/16 v20, -0x1

    .line 277
    .line 278
    if-nez v8, :cond_b

    .line 279
    .line 280
    invoke-static {v12, v3, v9}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    iget v3, v9, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 285
    .line 286
    invoke-direct {v15, v11}, Lcom/google/android/gms/internal/auth/zzfz;->zzx(I)Lcom/google/android/gms/internal/auth/zzex;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    if-eqz v5, :cond_7

    .line 291
    .line 292
    invoke-interface {v5}, Lcom/google/android/gms/internal/auth/zzex;->zza()Z

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    if-eqz v5, :cond_6

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_6
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/auth/zzfz;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/zzgz;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    int-to-long v7, v3

    .line 304
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-virtual {v0, v4, v1}, Lcom/google/android/gms/internal/auth/zzgz;->zzf(ILjava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    move v0, v2

    .line 312
    move v1, v4

    .line 313
    move v5, v6

    .line 314
    goto/16 :goto_a

    .line 315
    .line 316
    :cond_7
    :goto_4
    invoke-virtual {v10, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 317
    .line 318
    .line 319
    goto :goto_5

    .line 320
    :pswitch_3
    move v11, v2

    .line 321
    move/from16 v4, v17

    .line 322
    .line 323
    move/from16 v3, v20

    .line 324
    .line 325
    move-wide/from16 v0, v21

    .line 326
    .line 327
    const/4 v2, 0x2

    .line 328
    const v18, 0xfffff

    .line 329
    .line 330
    .line 331
    const/16 v20, -0x1

    .line 332
    .line 333
    if-ne v8, v2, :cond_b

    .line 334
    .line 335
    invoke-static {v12, v3, v9}, Lcom/google/android/gms/internal/auth/zzdt;->zza([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    iget-object v3, v9, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 340
    .line 341
    invoke-virtual {v10, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    :goto_5
    or-int v5, v6, v23

    .line 345
    .line 346
    move v0, v2

    .line 347
    goto/16 :goto_9

    .line 348
    .line 349
    :pswitch_4
    move v11, v2

    .line 350
    move/from16 v4, v17

    .line 351
    .line 352
    move/from16 v3, v20

    .line 353
    .line 354
    move-wide/from16 v0, v21

    .line 355
    .line 356
    const/4 v2, 0x2

    .line 357
    const v18, 0xfffff

    .line 358
    .line 359
    .line 360
    const/16 v20, -0x1

    .line 361
    .line 362
    if-ne v8, v2, :cond_b

    .line 363
    .line 364
    invoke-direct {v15, v11}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-static {v2, v12, v3, v13, v9}, Lcom/google/android/gms/internal/auth/zzdt;->zzd(Lcom/google/android/gms/internal/auth/zzgh;[BIILcom/google/android/gms/internal/auth/zzds;)I

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    and-int v3, v6, v23

    .line 373
    .line 374
    if-nez v3, :cond_8

    .line 375
    .line 376
    iget-object v3, v9, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 377
    .line 378
    invoke-virtual {v10, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_8
    invoke-virtual {v10, v14, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    iget-object v5, v9, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 387
    .line 388
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/auth/zzez;->zzg(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-virtual {v10, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    goto :goto_5

    .line 396
    :pswitch_5
    move v11, v2

    .line 397
    move/from16 v4, v17

    .line 398
    .line 399
    move/from16 v3, v20

    .line 400
    .line 401
    move-wide/from16 v0, v21

    .line 402
    .line 403
    const/4 v2, 0x2

    .line 404
    const v18, 0xfffff

    .line 405
    .line 406
    .line 407
    const/16 v20, -0x1

    .line 408
    .line 409
    if-ne v8, v2, :cond_b

    .line 410
    .line 411
    const/high16 v2, 0x20000000

    .line 412
    .line 413
    and-int/2addr v2, v7

    .line 414
    if-nez v2, :cond_9

    .line 415
    .line 416
    invoke-static {v12, v3, v9}, Lcom/google/android/gms/internal/auth/zzdt;->zzg([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    goto :goto_6

    .line 421
    :cond_9
    invoke-static {v12, v3, v9}, Lcom/google/android/gms/internal/auth/zzdt;->zzh([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    :goto_6
    iget-object v3, v9, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 426
    .line 427
    invoke-virtual {v10, v14, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    goto :goto_5

    .line 431
    :pswitch_6
    move v11, v2

    .line 432
    move/from16 v4, v17

    .line 433
    .line 434
    move/from16 v3, v20

    .line 435
    .line 436
    move-wide/from16 v1, v21

    .line 437
    .line 438
    const v18, 0xfffff

    .line 439
    .line 440
    .line 441
    const/16 v20, -0x1

    .line 442
    .line 443
    if-nez v8, :cond_b

    .line 444
    .line 445
    invoke-static {v12, v3, v9}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    iget-wide v7, v9, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 450
    .line 451
    const-wide/16 v21, 0x0

    .line 452
    .line 453
    cmp-long v3, v7, v21

    .line 454
    .line 455
    if-eqz v3, :cond_a

    .line 456
    .line 457
    const/4 v3, 0x1

    .line 458
    goto :goto_7

    .line 459
    :cond_a
    move/from16 v3, v16

    .line 460
    .line 461
    :goto_7
    invoke-static {v14, v1, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzk(Ljava/lang/Object;JZ)V

    .line 462
    .line 463
    .line 464
    goto :goto_8

    .line 465
    :pswitch_7
    move v11, v2

    .line 466
    move/from16 v4, v17

    .line 467
    .line 468
    move/from16 v3, v20

    .line 469
    .line 470
    move-wide/from16 v1, v21

    .line 471
    .line 472
    const v18, 0xfffff

    .line 473
    .line 474
    .line 475
    const/16 v20, -0x1

    .line 476
    .line 477
    if-ne v8, v0, :cond_b

    .line 478
    .line 479
    invoke-static {v12, v3}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    invoke-virtual {v10, v14, v1, v2, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 484
    .line 485
    .line 486
    add-int/lit8 v0, v3, 0x4

    .line 487
    .line 488
    :goto_8
    or-int v5, v6, v23

    .line 489
    .line 490
    :goto_9
    move v1, v4

    .line 491
    :goto_a
    move v3, v11

    .line 492
    goto/16 :goto_e

    .line 493
    .line 494
    :pswitch_8
    move v0, v1

    .line 495
    move v11, v2

    .line 496
    move/from16 v4, v17

    .line 497
    .line 498
    move/from16 v3, v20

    .line 499
    .line 500
    move-wide/from16 v1, v21

    .line 501
    .line 502
    const v18, 0xfffff

    .line 503
    .line 504
    .line 505
    const/16 v20, -0x1

    .line 506
    .line 507
    if-ne v8, v0, :cond_b

    .line 508
    .line 509
    invoke-static {v12, v3}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    .line 510
    .line 511
    .line 512
    move-result-wide v7

    .line 513
    move-object v0, v10

    .line 514
    move v5, v3

    .line 515
    move-wide v2, v1

    .line 516
    move-object/from16 v1, p1

    .line 517
    .line 518
    move/from16 v17, v4

    .line 519
    .line 520
    move v13, v5

    .line 521
    move-wide v4, v7

    .line 522
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 523
    .line 524
    .line 525
    goto/16 :goto_b

    .line 526
    .line 527
    :cond_b
    move v13, v3

    .line 528
    move/from16 v17, v4

    .line 529
    .line 530
    goto/16 :goto_f

    .line 531
    .line 532
    :pswitch_9
    move v11, v2

    .line 533
    move/from16 v13, v20

    .line 534
    .line 535
    move-wide/from16 v2, v21

    .line 536
    .line 537
    const v18, 0xfffff

    .line 538
    .line 539
    .line 540
    const/16 v20, -0x1

    .line 541
    .line 542
    if-nez v8, :cond_d

    .line 543
    .line 544
    invoke-static {v12, v13, v9}, Lcom/google/android/gms/internal/auth/zzdt;->zzj([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    iget v1, v9, Lcom/google/android/gms/internal/auth/zzds;->zza:I

    .line 549
    .line 550
    invoke-virtual {v10, v14, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 551
    .line 552
    .line 553
    goto :goto_c

    .line 554
    :pswitch_a
    move v11, v2

    .line 555
    move/from16 v13, v20

    .line 556
    .line 557
    move-wide/from16 v2, v21

    .line 558
    .line 559
    const v18, 0xfffff

    .line 560
    .line 561
    .line 562
    const/16 v20, -0x1

    .line 563
    .line 564
    if-nez v8, :cond_d

    .line 565
    .line 566
    invoke-static {v12, v13, v9}, Lcom/google/android/gms/internal/auth/zzdt;->zzm([BILcom/google/android/gms/internal/auth/zzds;)I

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    iget-wide v4, v9, Lcom/google/android/gms/internal/auth/zzds;->zzb:J

    .line 571
    .line 572
    move-object v0, v10

    .line 573
    move-object/from16 v1, p1

    .line 574
    .line 575
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 576
    .line 577
    .line 578
    or-int v5, v6, v23

    .line 579
    .line 580
    move/from16 v13, p4

    .line 581
    .line 582
    move v0, v7

    .line 583
    goto :goto_d

    .line 584
    :pswitch_b
    move v11, v2

    .line 585
    move/from16 v13, v20

    .line 586
    .line 587
    move-wide/from16 v2, v21

    .line 588
    .line 589
    const v18, 0xfffff

    .line 590
    .line 591
    .line 592
    const/16 v20, -0x1

    .line 593
    .line 594
    if-ne v8, v0, :cond_d

    .line 595
    .line 596
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/auth/zzdt;->zzb([BI)I

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 601
    .line 602
    .line 603
    move-result v0

    .line 604
    invoke-static {v14, v2, v3, v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzm(Ljava/lang/Object;JF)V

    .line 605
    .line 606
    .line 607
    add-int/lit8 v0, v13, 0x4

    .line 608
    .line 609
    goto :goto_c

    .line 610
    :pswitch_c
    move v0, v1

    .line 611
    move v11, v2

    .line 612
    move/from16 v13, v20

    .line 613
    .line 614
    move-wide/from16 v2, v21

    .line 615
    .line 616
    const v18, 0xfffff

    .line 617
    .line 618
    .line 619
    const/16 v20, -0x1

    .line 620
    .line 621
    if-ne v8, v0, :cond_d

    .line 622
    .line 623
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/auth/zzdt;->zzn([BI)J

    .line 624
    .line 625
    .line 626
    move-result-wide v0

    .line 627
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 628
    .line 629
    .line 630
    move-result-wide v0

    .line 631
    invoke-static {v14, v2, v3, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzl(Ljava/lang/Object;JD)V

    .line 632
    .line 633
    .line 634
    :goto_b
    add-int/lit8 v0, v13, 0x8

    .line 635
    .line 636
    :goto_c
    or-int v5, v6, v23

    .line 637
    .line 638
    move/from16 v13, p4

    .line 639
    .line 640
    :goto_d
    move v3, v11

    .line 641
    move/from16 v1, v17

    .line 642
    .line 643
    :goto_e
    move/from16 v2, v19

    .line 644
    .line 645
    move/from16 v6, v25

    .line 646
    .line 647
    move/from16 v11, p5

    .line 648
    .line 649
    goto/16 :goto_0

    .line 650
    .line 651
    :cond_c
    invoke-virtual {v10, v14, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    iget-object v2, v9, Lcom/google/android/gms/internal/auth/zzds;->zzc:Ljava/lang/Object;

    .line 656
    .line 657
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/auth/zzez;->zzg(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    invoke-virtual {v10, v14, v7, v8, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    goto :goto_c

    .line 665
    :cond_d
    :goto_f
    move/from16 v7, p5

    .line 666
    .line 667
    move/from16 v22, v6

    .line 668
    .line 669
    move-object/from16 v28, v10

    .line 670
    .line 671
    move/from16 v21, v11

    .line 672
    .line 673
    move v2, v13

    .line 674
    goto/16 :goto_13

    .line 675
    .line 676
    :cond_e
    move/from16 v17, v4

    .line 677
    .line 678
    move/from16 v13, v20

    .line 679
    .line 680
    const v18, 0xfffff

    .line 681
    .line 682
    .line 683
    const/16 v20, -0x1

    .line 684
    .line 685
    move v4, v2

    .line 686
    move-wide/from16 v2, v21

    .line 687
    .line 688
    const/16 v0, 0x1b

    .line 689
    .line 690
    if-ne v11, v0, :cond_12

    .line 691
    .line 692
    const/4 v0, 0x2

    .line 693
    if-ne v8, v0, :cond_11

    .line 694
    .line 695
    invoke-virtual {v10, v14, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    check-cast v0, Lcom/google/android/gms/internal/auth/zzey;

    .line 700
    .line 701
    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/zzey;->zzc()Z

    .line 702
    .line 703
    .line 704
    move-result v1

    .line 705
    if-nez v1, :cond_10

    .line 706
    .line 707
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 708
    .line 709
    .line 710
    move-result v1

    .line 711
    if-nez v1, :cond_f

    .line 712
    .line 713
    const/16 v1, 0xa

    .line 714
    .line 715
    goto :goto_10

    .line 716
    :cond_f
    add-int/2addr v1, v1

    .line 717
    :goto_10
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/auth/zzey;->zzd(I)Lcom/google/android/gms/internal/auth/zzey;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-virtual {v10, v14, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 722
    .line 723
    .line 724
    :cond_10
    move-object v7, v0

    .line 725
    invoke-direct {v15, v4}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    move/from16 v1, v17

    .line 730
    .line 731
    move-object/from16 v2, p2

    .line 732
    .line 733
    move v3, v13

    .line 734
    move/from16 v21, v4

    .line 735
    .line 736
    move/from16 v4, p4

    .line 737
    .line 738
    move/from16 v22, v5

    .line 739
    .line 740
    move-object v5, v7

    .line 741
    move/from16 v25, v6

    .line 742
    .line 743
    move-object/from16 v6, p6

    .line 744
    .line 745
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/auth/zzdt;->zze(Lcom/google/android/gms/internal/auth/zzgh;I[BIILcom/google/android/gms/internal/auth/zzey;Lcom/google/android/gms/internal/auth/zzds;)I

    .line 746
    .line 747
    .line 748
    move-result v0

    .line 749
    move/from16 v13, p4

    .line 750
    .line 751
    move/from16 v11, p5

    .line 752
    .line 753
    move/from16 v2, v19

    .line 754
    .line 755
    move/from16 v3, v21

    .line 756
    .line 757
    move/from16 v5, v22

    .line 758
    .line 759
    move/from16 v6, v25

    .line 760
    .line 761
    goto/16 :goto_0

    .line 762
    .line 763
    :cond_11
    move/from16 v21, v4

    .line 764
    .line 765
    move/from16 v22, v5

    .line 766
    .line 767
    move/from16 v25, v6

    .line 768
    .line 769
    move-object/from16 v28, v10

    .line 770
    .line 771
    move v15, v13

    .line 772
    goto/16 :goto_12

    .line 773
    .line 774
    :cond_12
    move/from16 v21, v4

    .line 775
    .line 776
    move/from16 v22, v5

    .line 777
    .line 778
    move/from16 v25, v6

    .line 779
    .line 780
    const/16 v0, 0x31

    .line 781
    .line 782
    if-gt v11, v0, :cond_14

    .line 783
    .line 784
    int-to-long v6, v7

    .line 785
    move-object/from16 v0, p0

    .line 786
    .line 787
    move-object/from16 v1, p1

    .line 788
    .line 789
    move-wide/from16 v23, v2

    .line 790
    .line 791
    move-object/from16 v2, p2

    .line 792
    .line 793
    move v3, v13

    .line 794
    move/from16 v4, p4

    .line 795
    .line 796
    move/from16 v5, v17

    .line 797
    .line 798
    move-wide/from16 v26, v6

    .line 799
    .line 800
    move/from16 v6, v19

    .line 801
    .line 802
    move v7, v8

    .line 803
    move/from16 v15, v18

    .line 804
    .line 805
    move/from16 v8, v21

    .line 806
    .line 807
    move-object/from16 v28, v10

    .line 808
    .line 809
    move-wide/from16 v9, v26

    .line 810
    .line 811
    move/from16 v15, p5

    .line 812
    .line 813
    move v15, v13

    .line 814
    move-wide/from16 v12, v23

    .line 815
    .line 816
    move-object/from16 v14, p6

    .line 817
    .line 818
    invoke-direct/range {v0 .. v14}, Lcom/google/android/gms/internal/auth/zzfz;->zzp(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/auth/zzds;)I

    .line 819
    .line 820
    .line 821
    move-result v0

    .line 822
    if-eq v0, v15, :cond_13

    .line 823
    .line 824
    :goto_11
    move-object/from16 v15, p0

    .line 825
    .line 826
    move-object/from16 v14, p1

    .line 827
    .line 828
    move-object/from16 v12, p2

    .line 829
    .line 830
    move/from16 v13, p4

    .line 831
    .line 832
    move/from16 v11, p5

    .line 833
    .line 834
    move-object/from16 v9, p6

    .line 835
    .line 836
    move/from16 v1, v17

    .line 837
    .line 838
    move/from16 v2, v19

    .line 839
    .line 840
    move/from16 v3, v21

    .line 841
    .line 842
    move/from16 v5, v22

    .line 843
    .line 844
    move/from16 v6, v25

    .line 845
    .line 846
    goto/16 :goto_15

    .line 847
    .line 848
    :cond_13
    move/from16 v7, p5

    .line 849
    .line 850
    move v2, v0

    .line 851
    goto :goto_13

    .line 852
    :cond_14
    move-wide/from16 v23, v2

    .line 853
    .line 854
    move-object/from16 v28, v10

    .line 855
    .line 856
    move v15, v13

    .line 857
    const/16 v0, 0x32

    .line 858
    .line 859
    if-ne v11, v0, :cond_16

    .line 860
    .line 861
    const/4 v0, 0x2

    .line 862
    if-ne v8, v0, :cond_15

    .line 863
    .line 864
    move-object/from16 v0, p0

    .line 865
    .line 866
    move-object/from16 v1, p1

    .line 867
    .line 868
    move-object/from16 v2, p2

    .line 869
    .line 870
    move v3, v15

    .line 871
    move/from16 v4, p4

    .line 872
    .line 873
    move/from16 v5, v21

    .line 874
    .line 875
    move-wide/from16 v6, v23

    .line 876
    .line 877
    move-object/from16 v8, p6

    .line 878
    .line 879
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/auth/zzfz;->zzm(Ljava/lang/Object;[BIIIJLcom/google/android/gms/internal/auth/zzds;)I

    .line 880
    .line 881
    .line 882
    move-result v0

    .line 883
    if-eq v0, v15, :cond_13

    .line 884
    .line 885
    goto :goto_11

    .line 886
    :cond_15
    :goto_12
    move/from16 v7, p5

    .line 887
    .line 888
    move v2, v15

    .line 889
    :goto_13
    move/from16 v8, v17

    .line 890
    .line 891
    move/from16 v6, v25

    .line 892
    .line 893
    goto :goto_14

    .line 894
    :cond_16
    move-object/from16 v0, p0

    .line 895
    .line 896
    move-object/from16 v1, p1

    .line 897
    .line 898
    move-object/from16 v2, p2

    .line 899
    .line 900
    move v3, v15

    .line 901
    move/from16 v4, p4

    .line 902
    .line 903
    move/from16 v5, v17

    .line 904
    .line 905
    move/from16 v6, v19

    .line 906
    .line 907
    move v9, v7

    .line 908
    move v7, v8

    .line 909
    move v8, v9

    .line 910
    move v9, v11

    .line 911
    move-wide/from16 v10, v23

    .line 912
    .line 913
    move/from16 v12, v21

    .line 914
    .line 915
    move-object/from16 v13, p6

    .line 916
    .line 917
    invoke-direct/range {v0 .. v13}, Lcom/google/android/gms/internal/auth/zzfz;->zzn(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/auth/zzds;)I

    .line 918
    .line 919
    .line 920
    move-result v0

    .line 921
    if-eq v0, v15, :cond_13

    .line 922
    .line 923
    goto :goto_11

    .line 924
    :goto_14
    if-ne v8, v7, :cond_17

    .line 925
    .line 926
    if-eqz v7, :cond_17

    .line 927
    .line 928
    move v0, v2

    .line 929
    move v1, v8

    .line 930
    move/from16 v5, v22

    .line 931
    .line 932
    goto :goto_16

    .line 933
    :cond_17
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/auth/zzfz;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/zzgz;

    .line 934
    .line 935
    .line 936
    move-result-object v4

    .line 937
    move v0, v8

    .line 938
    move-object/from16 v1, p2

    .line 939
    .line 940
    move/from16 v3, p4

    .line 941
    .line 942
    move-object/from16 v5, p6

    .line 943
    .line 944
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/zzdt;->zzi(I[BIILcom/google/android/gms/internal/auth/zzgz;Lcom/google/android/gms/internal/auth/zzds;)I

    .line 945
    .line 946
    .line 947
    move-result v0

    .line 948
    move-object/from16 v15, p0

    .line 949
    .line 950
    move-object/from16 v14, p1

    .line 951
    .line 952
    move-object/from16 v12, p2

    .line 953
    .line 954
    move/from16 v13, p4

    .line 955
    .line 956
    move-object/from16 v9, p6

    .line 957
    .line 958
    move v11, v7

    .line 959
    move v1, v8

    .line 960
    move/from16 v2, v19

    .line 961
    .line 962
    move/from16 v3, v21

    .line 963
    .line 964
    move/from16 v5, v22

    .line 965
    .line 966
    :goto_15
    move-object/from16 v10, v28

    .line 967
    .line 968
    goto/16 :goto_0

    .line 969
    .line 970
    :cond_18
    move/from16 v22, v5

    .line 971
    .line 972
    move/from16 v25, v6

    .line 973
    .line 974
    move-object/from16 v28, v10

    .line 975
    .line 976
    move v7, v11

    .line 977
    :goto_16
    const v2, 0xfffff

    .line 978
    .line 979
    .line 980
    if-eq v6, v2, :cond_19

    .line 981
    .line 982
    int-to-long v3, v6

    .line 983
    move-object/from16 v6, p1

    .line 984
    .line 985
    move-object/from16 v8, v28

    .line 986
    .line 987
    invoke-virtual {v8, v6, v3, v4, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 988
    .line 989
    .line 990
    goto :goto_17

    .line 991
    :cond_19
    move-object/from16 v6, p1

    .line 992
    .line 993
    :goto_17
    move v3, v2

    .line 994
    move-object/from16 v2, p0

    .line 995
    .line 996
    iget v4, v2, Lcom/google/android/gms/internal/auth/zzfz;->zzj:I

    .line 997
    .line 998
    :goto_18
    iget v5, v2, Lcom/google/android/gms/internal/auth/zzfz;->zzk:I

    .line 999
    .line 1000
    if-ge v4, v5, :cond_1c

    .line 1001
    .line 1002
    iget-object v5, v2, Lcom/google/android/gms/internal/auth/zzfz;->zzi:[I

    .line 1003
    .line 1004
    aget v5, v5, v4

    .line 1005
    .line 1006
    iget-object v8, v2, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 1007
    .line 1008
    aget v8, v8, v5

    .line 1009
    .line 1010
    invoke-direct {v2, v5}, Lcom/google/android/gms/internal/auth/zzfz;->zzv(I)I

    .line 1011
    .line 1012
    .line 1013
    move-result v8

    .line 1014
    and-int/2addr v8, v3

    .line 1015
    int-to-long v8, v8

    .line 1016
    invoke-static {v6, v8, v9}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v8

    .line 1020
    if-nez v8, :cond_1a

    .line 1021
    .line 1022
    goto :goto_19

    .line 1023
    :cond_1a
    invoke-direct {v2, v5}, Lcom/google/android/gms/internal/auth/zzfz;->zzx(I)Lcom/google/android/gms/internal/auth/zzex;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v9

    .line 1027
    if-nez v9, :cond_1b

    .line 1028
    .line 1029
    :goto_19
    add-int/lit8 v4, v4, 0x1

    .line 1030
    .line 1031
    goto :goto_18

    .line 1032
    :cond_1b
    check-cast v8, Lcom/google/android/gms/internal/auth/zzfq;

    .line 1033
    .line 1034
    invoke-direct {v2, v5}, Lcom/google/android/gms/internal/auth/zzfz;->zzz(I)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    check-cast v0, Lcom/google/android/gms/internal/auth/zzfp;

    .line 1039
    .line 1040
    const/4 v0, 0x0

    .line 1041
    throw v0

    .line 1042
    :cond_1c
    if-nez v7, :cond_1e

    .line 1043
    .line 1044
    move/from16 v3, p4

    .line 1045
    .line 1046
    if-ne v0, v3, :cond_1d

    .line 1047
    .line 1048
    goto :goto_1a

    .line 1049
    :cond_1d
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzd()Lcom/google/android/gms/internal/auth/zzfa;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    throw v0

    .line 1054
    :cond_1e
    move/from16 v3, p4

    .line 1055
    .line 1056
    if-gt v0, v3, :cond_1f

    .line 1057
    .line 1058
    if-ne v1, v7, :cond_1f

    .line 1059
    .line 1060
    :goto_1a
    return v0

    .line 1061
    :cond_1f
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzd()Lcom/google/android/gms/internal/auth/zzfa;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    throw v0

    .line 1066
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzd()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzg:Lcom/google/android/gms/internal/auth/zzfw;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/auth/zzeu;

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/auth/zzeu;->zzi(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final zze(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzj:I

    .line 2
    .line 3
    :goto_0
    iget v1, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzk:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzi:[I

    .line 8
    .line 9
    aget v1, v1, v0

    .line 10
    .line 11
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzv(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const v2, 0xfffff

    .line 16
    .line 17
    .line 18
    and-int/2addr v1, v2

    .line 19
    int-to-long v1, v1

    .line 20
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    check-cast v4, Lcom/google/android/gms/internal/auth/zzfq;

    .line 28
    .line 29
    invoke-virtual {v4}, Lcom/google/android/gms/internal/auth/zzfq;->zzc()V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzp(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzi:[I

    .line 39
    .line 40
    array-length v0, v0

    .line 41
    :goto_1
    if-ge v1, v0, :cond_2

    .line 42
    .line 43
    iget-object v2, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzl:Lcom/google/android/gms/internal/auth/zzfk;

    .line 44
    .line 45
    iget-object v3, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzi:[I

    .line 46
    .line 47
    aget v3, v3, v1

    .line 48
    .line 49
    int-to-long v3, v3

    .line 50
    invoke-virtual {v2, p1, v3, v4}, Lcom/google/android/gms/internal/auth/zzfk;->zza(Ljava/lang/Object;J)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzm:Lcom/google/android/gms/internal/auth/zzgy;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/zzgy;->zze(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final zzf(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 6
    .line 7
    array-length v1, v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzv(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const v2, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v2, v1

    .line 18
    int-to-long v2, v2

    .line 19
    iget-object v4, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 20
    .line 21
    aget v4, v4, v0

    .line 22
    .line 23
    invoke-static {v1}, Lcom/google/android/gms/internal/auth/zzfz;->zzu(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :pswitch_0
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzC(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :pswitch_1
    invoke-direct {p0, p2, v4, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzp(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, p1, v4, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzE(Ljava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :pswitch_2
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzC(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    :pswitch_3
    invoke-direct {p0, p2, v4, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzp(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, p1, v4, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzE(Ljava/lang/Object;II)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_1

    .line 77
    .line 78
    :pswitch_4
    iget-object v1, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzp:Lcom/google/android/gms/internal/auth/zzfr;

    .line 79
    .line 80
    invoke-static {v1, p1, p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzgj;->zzi(Lcom/google/android/gms/internal/auth/zzfr;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :pswitch_5
    iget-object v1, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzl:Lcom/google/android/gms/internal/auth/zzfk;

    .line 86
    .line 87
    invoke-virtual {v1, p1, p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzfk;->zzb(Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_1

    .line 91
    .line 92
    :pswitch_6
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzB(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_1

    .line 96
    .line 97
    :pswitch_7
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_0

    .line 102
    .line 103
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/auth/zzhi;->zzo(Ljava/lang/Object;JJ)V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_1

    .line 114
    .line 115
    :pswitch_8
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_0

    .line 120
    .line 121
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzn(Ljava/lang/Object;JI)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_1

    .line 132
    .line 133
    :pswitch_9
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_0

    .line 138
    .line 139
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/auth/zzhi;->zzo(Ljava/lang/Object;JJ)V

    .line 144
    .line 145
    .line 146
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_1

    .line 150
    .line 151
    :pswitch_a
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_0

    .line 156
    .line 157
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzn(Ljava/lang/Object;JI)V

    .line 162
    .line 163
    .line 164
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_1

    .line 168
    .line 169
    :pswitch_b
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_0

    .line 174
    .line 175
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzn(Ljava/lang/Object;JI)V

    .line 180
    .line 181
    .line 182
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :pswitch_c
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_0

    .line 192
    .line 193
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzn(Ljava/lang/Object;JI)V

    .line 198
    .line 199
    .line 200
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :pswitch_d
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-eqz v1, :cond_0

    .line 210
    .line 211
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzp(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 219
    .line 220
    .line 221
    goto/16 :goto_1

    .line 222
    .line 223
    :pswitch_e
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzB(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_1

    .line 227
    .line 228
    :pswitch_f
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_0

    .line 233
    .line 234
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzp(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_1

    .line 245
    .line 246
    :pswitch_10
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_0

    .line 251
    .line 252
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzt(Ljava/lang/Object;J)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzk(Ljava/lang/Object;JZ)V

    .line 257
    .line 258
    .line 259
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_1

    .line 263
    .line 264
    :pswitch_11
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-eqz v1, :cond_0

    .line 269
    .line 270
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzn(Ljava/lang/Object;JI)V

    .line 275
    .line 276
    .line 277
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 278
    .line 279
    .line 280
    goto :goto_1

    .line 281
    :pswitch_12
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-eqz v1, :cond_0

    .line 286
    .line 287
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 288
    .line 289
    .line 290
    move-result-wide v4

    .line 291
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/auth/zzhi;->zzo(Ljava/lang/Object;JJ)V

    .line 292
    .line 293
    .line 294
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 295
    .line 296
    .line 297
    goto :goto_1

    .line 298
    :pswitch_13
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_0

    .line 303
    .line 304
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzn(Ljava/lang/Object;JI)V

    .line 309
    .line 310
    .line 311
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 312
    .line 313
    .line 314
    goto :goto_1

    .line 315
    :pswitch_14
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_0

    .line 320
    .line 321
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 322
    .line 323
    .line 324
    move-result-wide v4

    .line 325
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/auth/zzhi;->zzo(Ljava/lang/Object;JJ)V

    .line 326
    .line 327
    .line 328
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 329
    .line 330
    .line 331
    goto :goto_1

    .line 332
    :pswitch_15
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    if-eqz v1, :cond_0

    .line 337
    .line 338
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 339
    .line 340
    .line 341
    move-result-wide v4

    .line 342
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/auth/zzhi;->zzo(Ljava/lang/Object;JJ)V

    .line 343
    .line 344
    .line 345
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 346
    .line 347
    .line 348
    goto :goto_1

    .line 349
    :pswitch_16
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-eqz v1, :cond_0

    .line 354
    .line 355
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zzb(Ljava/lang/Object;J)F

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzm(Ljava/lang/Object;JF)V

    .line 360
    .line 361
    .line 362
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 363
    .line 364
    .line 365
    goto :goto_1

    .line 366
    :pswitch_17
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzG(Ljava/lang/Object;I)Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eqz v1, :cond_0

    .line 371
    .line 372
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/auth/zzhi;->zza(Ljava/lang/Object;J)D

    .line 373
    .line 374
    .line 375
    move-result-wide v4

    .line 376
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/auth/zzhi;->zzl(Ljava/lang/Object;JD)V

    .line 377
    .line 378
    .line 379
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzD(Ljava/lang/Object;I)V

    .line 380
    .line 381
    .line 382
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x3

    .line 383
    .line 384
    goto/16 :goto_0

    .line 385
    .line 386
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzm:Lcom/google/android/gms/internal/auth/zzgy;

    .line 387
    .line 388
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/auth/zzgj;->zzf(Lcom/google/android/gms/internal/auth/zzgy;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    return-void

    .line 392
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzg(Ljava/lang/Object;[BIILcom/google/android/gms/internal/auth/zzds;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzh:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/internal/auth/zzfz;->zzo(Ljava/lang/Object;[BIILcom/google/android/gms/internal/auth/zzds;)I

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v6, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move-object v3, p2

    .line 13
    move v4, p3

    .line 14
    move v5, p4

    .line 15
    move-object v7, p5

    .line 16
    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/auth/zzfz;->zzb(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/auth/zzds;)I

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final zzh(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_2

    .line 7
    .line 8
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzv(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const v4, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int v5, v3, v4

    .line 16
    .line 17
    int-to-long v5, v5

    .line 18
    invoke-static {v3}, Lcom/google/android/gms/internal/auth/zzfz;->zzu(I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    packed-switch v3, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :pswitch_0
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzs(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    and-int/2addr v3, v4

    .line 32
    int-to-long v3, v3

    .line 33
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-ne v7, v3, :cond_0

    .line 42
    .line 43
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzgj;->zzh(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_1

    .line 56
    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :pswitch_1
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzgj;->zzh(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    goto :goto_1

    .line 72
    :pswitch_2
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzgj;->zzh(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    :goto_1
    if-nez v3, :cond_1

    .line 85
    .line 86
    goto/16 :goto_2

    .line 87
    .line 88
    :pswitch_3
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_0

    .line 93
    .line 94
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzgj;->zzh(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_0

    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :pswitch_4
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_0

    .line 115
    .line 116
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v3

    .line 120
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    cmp-long v3, v3, v5

    .line 125
    .line 126
    if-nez v3, :cond_0

    .line 127
    .line 128
    goto/16 :goto_3

    .line 129
    .line 130
    :pswitch_5
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_0

    .line 135
    .line 136
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-ne v3, v4, :cond_0

    .line 145
    .line 146
    goto/16 :goto_3

    .line 147
    .line 148
    :pswitch_6
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_0

    .line 153
    .line 154
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 155
    .line 156
    .line 157
    move-result-wide v3

    .line 158
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v5

    .line 162
    cmp-long v3, v3, v5

    .line 163
    .line 164
    if-nez v3, :cond_0

    .line 165
    .line 166
    goto/16 :goto_3

    .line 167
    .line 168
    :pswitch_7
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-eqz v3, :cond_0

    .line 173
    .line 174
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-ne v3, v4, :cond_0

    .line 183
    .line 184
    goto/16 :goto_3

    .line 185
    .line 186
    :pswitch_8
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_0

    .line 191
    .line 192
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-ne v3, v4, :cond_0

    .line 201
    .line 202
    goto/16 :goto_3

    .line 203
    .line 204
    :pswitch_9
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eqz v3, :cond_0

    .line 209
    .line 210
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-ne v3, v4, :cond_0

    .line 219
    .line 220
    goto/16 :goto_3

    .line 221
    .line 222
    :pswitch_a
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eqz v3, :cond_0

    .line 227
    .line 228
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzgj;->zzh(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-eqz v3, :cond_0

    .line 241
    .line 242
    goto/16 :goto_3

    .line 243
    .line 244
    :pswitch_b
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    if-eqz v3, :cond_0

    .line 249
    .line 250
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzgj;->zzh(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_0

    .line 263
    .line 264
    goto/16 :goto_3

    .line 265
    .line 266
    :pswitch_c
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-eqz v3, :cond_0

    .line 271
    .line 272
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/auth/zzgj;->zzh(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-eqz v3, :cond_0

    .line 285
    .line 286
    goto/16 :goto_3

    .line 287
    .line 288
    :pswitch_d
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    if-eqz v3, :cond_0

    .line 293
    .line 294
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzt(Ljava/lang/Object;J)Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzt(Ljava/lang/Object;J)Z

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    if-ne v3, v4, :cond_0

    .line 303
    .line 304
    goto/16 :goto_3

    .line 305
    .line 306
    :pswitch_e
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-eqz v3, :cond_0

    .line 311
    .line 312
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    if-ne v3, v4, :cond_0

    .line 321
    .line 322
    goto/16 :goto_3

    .line 323
    .line 324
    :pswitch_f
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_0

    .line 329
    .line 330
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 331
    .line 332
    .line 333
    move-result-wide v3

    .line 334
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 335
    .line 336
    .line 337
    move-result-wide v5

    .line 338
    cmp-long v3, v3, v5

    .line 339
    .line 340
    if-nez v3, :cond_0

    .line 341
    .line 342
    goto/16 :goto_3

    .line 343
    .line 344
    :pswitch_10
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    if-eqz v3, :cond_0

    .line 349
    .line 350
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzc(Ljava/lang/Object;J)I

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    if-ne v3, v4, :cond_0

    .line 359
    .line 360
    goto :goto_3

    .line 361
    :pswitch_11
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    if-eqz v3, :cond_0

    .line 366
    .line 367
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 368
    .line 369
    .line 370
    move-result-wide v3

    .line 371
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 372
    .line 373
    .line 374
    move-result-wide v5

    .line 375
    cmp-long v3, v3, v5

    .line 376
    .line 377
    if-nez v3, :cond_0

    .line 378
    .line 379
    goto :goto_3

    .line 380
    :pswitch_12
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    if-eqz v3, :cond_0

    .line 385
    .line 386
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 387
    .line 388
    .line 389
    move-result-wide v3

    .line 390
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzd(Ljava/lang/Object;J)J

    .line 391
    .line 392
    .line 393
    move-result-wide v5

    .line 394
    cmp-long v3, v3, v5

    .line 395
    .line 396
    if-nez v3, :cond_0

    .line 397
    .line 398
    goto :goto_3

    .line 399
    :pswitch_13
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    if-eqz v3, :cond_0

    .line 404
    .line 405
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzb(Ljava/lang/Object;J)F

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zzb(Ljava/lang/Object;J)F

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 418
    .line 419
    .line 420
    move-result v4

    .line 421
    if-ne v3, v4, :cond_0

    .line 422
    .line 423
    goto :goto_3

    .line 424
    :pswitch_14
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/auth/zzfz;->zzF(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    if-eqz v3, :cond_0

    .line 429
    .line 430
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zza(Ljava/lang/Object;J)D

    .line 431
    .line 432
    .line 433
    move-result-wide v3

    .line 434
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 435
    .line 436
    .line 437
    move-result-wide v3

    .line 438
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/auth/zzhi;->zza(Ljava/lang/Object;J)D

    .line 439
    .line 440
    .line 441
    move-result-wide v5

    .line 442
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 443
    .line 444
    .line 445
    move-result-wide v5

    .line 446
    cmp-long v3, v3, v5

    .line 447
    .line 448
    if-nez v3, :cond_0

    .line 449
    .line 450
    goto :goto_3

    .line 451
    :cond_0
    :goto_2
    return v1

    .line 452
    :cond_1
    :goto_3
    add-int/lit8 v2, v2, 0x3

    .line 453
    .line 454
    goto/16 :goto_0

    .line 455
    .line 456
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzm:Lcom/google/android/gms/internal/auth/zzgy;

    .line 457
    .line 458
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/zzgy;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzfz;->zzm:Lcom/google/android/gms/internal/auth/zzgy;

    .line 463
    .line 464
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/auth/zzgy;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object p2

    .line 468
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result p1

    .line 472
    if-nez p1, :cond_3

    .line 473
    .line 474
    return v1

    .line 475
    :cond_3
    const/4 p1, 0x1

    .line 476
    return p1

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final zzi(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    const v8, 0xfffff

    .line 6
    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    move v0, v8

    .line 10
    move v1, v9

    .line 11
    move v10, v1

    .line 12
    :goto_0
    iget v2, v6, Lcom/google/android/gms/internal/auth/zzfz;->zzj:I

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-ge v10, v2, :cond_b

    .line 16
    .line 17
    iget-object v2, v6, Lcom/google/android/gms/internal/auth/zzfz;->zzi:[I

    .line 18
    .line 19
    aget v11, v2, v10

    .line 20
    .line 21
    iget-object v2, v6, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 22
    .line 23
    aget v12, v2, v11

    .line 24
    .line 25
    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/auth/zzfz;->zzv(I)I

    .line 26
    .line 27
    .line 28
    move-result v13

    .line 29
    iget-object v2, v6, Lcom/google/android/gms/internal/auth/zzfz;->zzc:[I

    .line 30
    .line 31
    add-int/lit8 v4, v11, 0x2

    .line 32
    .line 33
    aget v2, v2, v4

    .line 34
    .line 35
    and-int v4, v2, v8

    .line 36
    .line 37
    ushr-int/lit8 v2, v2, 0x14

    .line 38
    .line 39
    shl-int v14, v3, v2

    .line 40
    .line 41
    if-eq v4, v0, :cond_1

    .line 42
    .line 43
    if-eq v4, v8, :cond_0

    .line 44
    .line 45
    sget-object v0, Lcom/google/android/gms/internal/auth/zzfz;->zzb:Lsun/misc/Unsafe;

    .line 46
    .line 47
    int-to-long v1, v4

    .line 48
    invoke-virtual {v0, v7, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_0
    move/from16 v16, v1

    .line 53
    .line 54
    move v15, v4

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v15, v0

    .line 57
    move/from16 v16, v1

    .line 58
    .line 59
    :goto_1
    const/high16 v0, 0x10000000

    .line 60
    .line 61
    and-int/2addr v0, v13

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    move-object/from16 v0, p0

    .line 65
    .line 66
    move-object/from16 v1, p1

    .line 67
    .line 68
    move v2, v11

    .line 69
    move v3, v15

    .line 70
    move/from16 v4, v16

    .line 71
    .line 72
    move v5, v14

    .line 73
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/zzfz;->zzH(Ljava/lang/Object;IIII)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    return v9

    .line 81
    :cond_3
    :goto_2
    invoke-static {v13}, Lcom/google/android/gms/internal/auth/zzfz;->zzu(I)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const/16 v1, 0x9

    .line 86
    .line 87
    if-eq v0, v1, :cond_9

    .line 88
    .line 89
    const/16 v1, 0x11

    .line 90
    .line 91
    if-eq v0, v1, :cond_9

    .line 92
    .line 93
    const/16 v1, 0x1b

    .line 94
    .line 95
    if-eq v0, v1, :cond_7

    .line 96
    .line 97
    const/16 v1, 0x3c

    .line 98
    .line 99
    if-eq v0, v1, :cond_6

    .line 100
    .line 101
    const/16 v1, 0x44

    .line 102
    .line 103
    if-eq v0, v1, :cond_6

    .line 104
    .line 105
    const/16 v1, 0x31

    .line 106
    .line 107
    if-eq v0, v1, :cond_7

    .line 108
    .line 109
    const/16 v1, 0x32

    .line 110
    .line 111
    if-eq v0, v1, :cond_4

    .line 112
    .line 113
    goto/16 :goto_4

    .line 114
    .line 115
    :cond_4
    and-int v0, v13, v8

    .line 116
    .line 117
    int-to-long v0, v0

    .line 118
    invoke-static {v7, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Lcom/google/android/gms/internal/auth/zzfq;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_5
    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/auth/zzfz;->zzz(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Lcom/google/android/gms/internal/auth/zzfp;

    .line 136
    .line 137
    const/4 v0, 0x0

    .line 138
    throw v0

    .line 139
    :cond_6
    invoke-direct {v6, v7, v12, v11}, Lcom/google/android/gms/internal/auth/zzfz;->zzJ(Ljava/lang/Object;II)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_a

    .line 144
    .line 145
    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v7, v13, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzI(Ljava/lang/Object;ILcom/google/android/gms/internal/auth/zzgh;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_a

    .line 154
    .line 155
    return v9

    .line 156
    :cond_7
    and-int v0, v13, v8

    .line 157
    .line 158
    int-to-long v0, v0

    .line 159
    invoke-static {v7, v0, v1}, Lcom/google/android/gms/internal/auth/zzhi;->zzf(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, Ljava/util/List;

    .line 164
    .line 165
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-nez v1, :cond_a

    .line 170
    .line 171
    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    move v2, v9

    .line 176
    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-ge v2, v3, :cond_a

    .line 181
    .line 182
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/auth/zzgh;->zzi(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-nez v3, :cond_8

    .line 191
    .line 192
    return v9

    .line 193
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_9
    move-object/from16 v0, p0

    .line 197
    .line 198
    move-object/from16 v1, p1

    .line 199
    .line 200
    move v2, v11

    .line 201
    move v3, v15

    .line 202
    move/from16 v4, v16

    .line 203
    .line 204
    move v5, v14

    .line 205
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/zzfz;->zzH(Ljava/lang/Object;IIII)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_a

    .line 210
    .line 211
    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/auth/zzfz;->zzy(I)Lcom/google/android/gms/internal/auth/zzgh;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v7, v13, v0}, Lcom/google/android/gms/internal/auth/zzfz;->zzI(Ljava/lang/Object;ILcom/google/android/gms/internal/auth/zzgh;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-nez v0, :cond_a

    .line 220
    .line 221
    return v9

    .line 222
    :cond_a
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 223
    .line 224
    move v0, v15

    .line 225
    move/from16 v1, v16

    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_b
    return v3
.end method
