.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzags;
.super Lc5/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzacr;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzags;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Ljava/lang/String;

.field private zzc:Ljava/lang/String;

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:Z

.field private zzj:Z

.field private zzk:Ljava/lang/String;

.field private zzl:Ljava/lang/String;

.field private zzm:Ljava/lang/String;

.field private zzn:Ljava/lang/String;

.field private zzo:Z

.field private zzp:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzagr;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagr;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc5/a;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzi:Z

    .line 3
    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzj:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/auth/internal/zzr;Ljava/lang/String;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Lc5/a;-><init>()V

    .line 5
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzr;->zzd()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw7/b;->o(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzl:Ljava/lang/String;

    .line 7
    invoke-static {p2}, Lw7/b;->o(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzm:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Lcom/google/firebase/auth/internal/zzr;->zzc()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw7/b;->o(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zze:Ljava/lang/String;

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzi:Z

    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "providerId="

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zze:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzg:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lc5/a;-><init>()V

    const-string p4, "http://localhost"

    .line 14
    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zza:Ljava/lang/String;

    .line 15
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzc:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzd:Ljava/lang/String;

    .line 17
    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzh:Ljava/lang/String;

    .line 18
    iput-object p6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzk:Ljava/lang/String;

    .line 19
    iput-object p7, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzn:Ljava/lang/String;

    .line 20
    iput-object p8, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzp:Ljava/lang/String;

    const/4 p2, 0x1

    .line 21
    iput-boolean p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzi:Z

    .line 22
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzd:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzk:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "idToken, accessToken and authCode cannot all be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :cond_1
    :goto_0
    invoke-static {p3}, Lw7/b;->o(Ljava/lang/String;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zze:Ljava/lang/String;

    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzf:Ljava/lang/String;

    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzc:Ljava/lang/String;

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    const-string p4, "&"

    if-nez p3, :cond_2

    const-string p3, "id_token="

    .line 28
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzc:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    :cond_2
    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzd:Ljava/lang/String;

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_3

    const-string p3, "access_token="

    .line 30
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzd:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    :cond_3
    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzf:Ljava/lang/String;

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_4

    const-string p3, "identifier="

    .line 32
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzf:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    :cond_4
    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzh:Ljava/lang/String;

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_5

    const-string p3, "oauth_token_secret="

    .line 34
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzh:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    :cond_5
    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzk:Ljava/lang/String;

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_6

    const-string p3, "code="

    .line 36
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzk:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    :cond_6
    invoke-static {p9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_7

    const-string p3, "nonce="

    .line 38
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    const-string p3, "providerId="

    .line 39
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zze:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzg:Ljava/lang/String;

    .line 41
    iput-boolean p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzj:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 2

    move-object v0, p0

    .line 42
    invoke-direct {p0}, Lc5/a;-><init>()V

    move-object v1, p1

    .line 43
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zza:Ljava/lang/String;

    move-object v1, p2

    .line 44
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzb:Ljava/lang/String;

    move-object v1, p3

    .line 45
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzc:Ljava/lang/String;

    move-object v1, p4

    .line 46
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzd:Ljava/lang/String;

    move-object v1, p5

    .line 47
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zze:Ljava/lang/String;

    move-object v1, p6

    .line 48
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzf:Ljava/lang/String;

    move-object v1, p7

    .line 49
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzg:Ljava/lang/String;

    move-object v1, p8

    .line 50
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzh:Ljava/lang/String;

    move v1, p9

    .line 51
    iput-boolean v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzi:Z

    move v1, p10

    .line 52
    iput-boolean v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzj:Z

    move-object v1, p11

    .line 53
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzk:Ljava/lang/String;

    move-object v1, p12

    .line 54
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzl:Ljava/lang/String;

    move-object v1, p13

    .line 55
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzm:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 56
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzn:Ljava/lang/String;

    move/from16 v1, p15

    .line 57
    iput-boolean v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzo:Z

    move-object/from16 v1, p16

    .line 58
    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzp:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p2, p1}, Lp7/a0;->t0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x2

    .line 8
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zza:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzb:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzc:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x5

    .line 27
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzd:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x6

    .line 33
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zze:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x7

    .line 39
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzf:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const/16 v0, 0x8

    .line 45
    .line 46
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzg:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 49
    .line 50
    .line 51
    const/16 v0, 0x9

    .line 52
    .line 53
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzh:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const/16 v0, 0xa

    .line 59
    .line 60
    iget-boolean v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzi:Z

    .line 61
    .line 62
    invoke-static {p1, v0, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 63
    .line 64
    .line 65
    const/16 v0, 0xb

    .line 66
    .line 67
    iget-boolean v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzj:Z

    .line 68
    .line 69
    invoke-static {p1, v0, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 70
    .line 71
    .line 72
    const/16 v0, 0xc

    .line 73
    .line 74
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzk:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const/16 v0, 0xd

    .line 80
    .line 81
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzl:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 84
    .line 85
    .line 86
    const/16 v0, 0xe

    .line 87
    .line 88
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzm:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    const/16 v0, 0xf

    .line 94
    .line 95
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzn:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 98
    .line 99
    .line 100
    const/16 v0, 0x10

    .line 101
    .line 102
    iget-boolean v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzo:Z

    .line 103
    .line 104
    invoke-static {p1, v0, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 105
    .line 106
    .line 107
    const/16 v0, 0x11

    .line 108
    .line 109
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzp:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    invoke-static {p2, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzags;
    .locals 0

    .line 2
    invoke-static {p1}, Lw7/b;->o(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzb:Ljava/lang/String;

    return-object p0
.end method

.method public final zza(Z)Lcom/google/android/gms/internal/firebase-auth-api/zzags;
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzj:Z

    return-object p0
.end method

.method public final zza()Ljava/lang/String;
    .locals 3

    .line 3
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "autoCreate"

    .line 4
    iget-boolean v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzj:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "returnSecureToken"

    .line 5
    iget-boolean v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzi:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzb:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "idToken"

    .line 7
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzg:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v2, "postBody"

    .line 9
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzn:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v2, "tenantId"

    .line 11
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 12
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzp:Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v2, "pendingToken"

    .line 13
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzl:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "sessionId"

    .line 15
    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzl:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 16
    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzm:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "requestUri"

    if-nez v1, :cond_5

    .line 17
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzm:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 18
    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zza:Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 19
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    :goto_0
    const-string v1, "returnIdpCredential"

    .line 20
    iget-boolean v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzo:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 21
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzags;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzn:Ljava/lang/String;

    return-object p0
.end method

.method public final zzb(Z)Lcom/google/android/gms/internal/firebase-auth-api/zzags;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzo:Z

    return-object p0
.end method

.method public final zzc(Z)Lcom/google/android/gms/internal/firebase-auth-api/zzags;
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzi:Z

    .line 3
    .line 4
    return-object p0
.end method
