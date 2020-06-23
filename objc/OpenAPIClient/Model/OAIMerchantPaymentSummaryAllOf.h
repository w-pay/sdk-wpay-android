#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* Village Wallet
* APIs for Village Wallet
*
* The version of the OpenAPI document: 0.0.4
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/





@protocol OAIMerchantPaymentSummaryAllOf
@end

@interface OAIMerchantPaymentSummaryAllOf : OAIObject

/* The number of times that the payment request can be used to create a payment. If basent then request can be used an unlimited number of times [optional]
 */
@property(nonatomic) NSNumber* usesRemaining;
/* The ISO date/time for when the payment request will expire and become unusable for payments.  If absent then the payment request will not expire until it is deleted [optional]
 */
@property(nonatomic) NSString* expiryTime;
/* The ID of a specific wallet for which the payment is intended.  If present then the payment can only be used by the intended wallet.  If absent then any wallet can create a payment against the payment request [optional]
 */
@property(nonatomic) NSString* specificWalletId;

@end