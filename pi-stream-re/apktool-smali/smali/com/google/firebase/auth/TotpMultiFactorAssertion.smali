.class public Lcom/google/firebase/auth/TotpMultiFactorAssertion;
.super Lcom/google/firebase/auth/MultiFactorAssertion;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Lcom/google/firebase/auth/TotpSecret;

.field private final zzc:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/firebase/auth/TotpSecret;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/auth/MultiFactorAssertion;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lw7/b;->o(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zza:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zzb:Lcom/google/firebase/auth/TotpSecret;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zzc:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public getFactorId()Ljava/lang/String;
    .locals 1

    const-string v0, "totp"

    return-object v0
.end method

.method public final zza()Lcom/google/firebase/auth/TotpSecret;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zzb:Lcom/google/firebase/auth/TotpSecret;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zzc:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zza:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
