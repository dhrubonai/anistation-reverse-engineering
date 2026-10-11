.class public Lcom/google/firebase/auth/PhoneAuthCredential;
.super Lcom/google/firebase/auth/AuthCredential;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/auth/PhoneAuthCredential;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Ljava/lang/String;

.field private zzc:Ljava/lang/String;

.field private zzd:Z

.field private zze:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/firebase/auth/zzap;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/firebase/auth/zzap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/firebase/auth/PhoneAuthCredential;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/auth/AuthCredential;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    :cond_1
    const/4 v0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    :goto_0
    const-string v1, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber."

    .line 32
    .line 33
    invoke-static {v1, v0}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zza:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p2, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zzb:Ljava/lang/String;

    .line 39
    .line 40
    iput-object p3, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zzc:Ljava/lang/String;

    .line 41
    .line 42
    iput-boolean p4, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zzd:Z

    .line 43
    .line 44
    iput-object p5, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zze:Ljava/lang/String;

    .line 45
    .line 46
    return-void
.end method

.method public static zza(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/PhoneAuthCredential;
    .locals 7

    .line 2
    new-instance v6, Lcom/google/firebase/auth/PhoneAuthCredential;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/auth/PhoneAuthCredential;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v6
.end method

.method public static zzb(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/PhoneAuthCredential;
    .locals 7

    .line 1
    new-instance v6, Lcom/google/firebase/auth/PhoneAuthCredential;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    move-object v0, v6

    move-object v3, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/auth/PhoneAuthCredential;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v6, Lcom/google/firebase/auth/PhoneAuthCredential;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zza:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/firebase/auth/PhoneAuthCredential;->getSmsCode()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zzc:Ljava/lang/String;

    .line 10
    .line 11
    iget-boolean v4, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zzd:Z

    .line 12
    .line 13
    iget-object v5, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zze:Ljava/lang/String;

    .line 14
    .line 15
    move-object v0, v6

    .line 16
    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/auth/PhoneAuthCredential;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v6
.end method

.method public getProvider()Ljava/lang/String;
    .locals 1

    const-string v0, "phone"

    return-object v0
.end method

.method public getSignInMethod()Ljava/lang/String;
    .locals 1

    const-string v0, "phone"

    return-object v0
.end method

.method public getSmsCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zzb:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
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
    const/4 v0, 0x1

    .line 8
    iget-object v1, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zza:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    invoke-virtual {p0}, Lcom/google/firebase/auth/PhoneAuthCredential;->getSmsCode()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    iget-object v1, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zzc:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x5

    .line 29
    iget-boolean v1, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zzd:Z

    .line 30
    .line 31
    invoke-static {p1, v0, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x6

    .line 35
    iget-object v1, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zze:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    invoke-static {p2, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final zza()Lcom/google/firebase/auth/AuthCredential;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/auth/PhoneAuthCredential;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/PhoneAuthCredential;

    return-object v0
.end method

.method public final zza(Z)Lcom/google/firebase/auth/PhoneAuthCredential;
    .locals 0

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zzd:Z

    return-object p0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zza:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zze:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zze()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/auth/PhoneAuthCredential;->zzd:Z

    .line 2
    .line 3
    return v0
.end method
