package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(csvservices.actions.CsvExportInitializeAction.class);
    registrator.registerUserAction(csvservices.actions.ImportCsvData.class);
    registrator.registerUserAction(csvservices.actions.ImportCsvResourceData.class);
    registrator.registerUserAction(emailtemplate.actions.ConvertHTMLBodyToPlainText.class);
    registrator.registerUserAction(emailtemplate.actions.CopyAttachmentContent.class);
    registrator.registerUserAction(emailtemplate.actions.ReplaceCustomToken.class);
    registrator.registerUserAction(emailtemplate.actions.ReplaceEmailTemplateTokens.class);
    registrator.registerUserAction(emailtemplate.actions.SendEmail.class);
    registrator.registerUserAction(encryption.actions.DecryptString.class);
    registrator.registerUserAction(encryption.actions.EncryptString.class);
    registrator.registerUserAction(encryption.actions.GeneratePGPKeyRing.class);
    registrator.registerUserAction(encryption.actions.PGPDecryptDocument.class);
    registrator.registerUserAction(encryption.actions.PGPEncryptDocument.class);
    registrator.registerUserAction(encryption.actions.ValidatePrivateKeyRing.class);
    registrator.registerUserAction(excelimporter.actions.GetHeaderInformationFromExcelFile.class);
    registrator.registerUserAction(excelimporter.actions.RefreshClass.class);
    registrator.registerUserAction(excelimporter.actions.StartImportByTemplate.class);
    registrator.registerUserAction(mxmodelreflection.actions.ReplaceToken.class);
    registrator.registerUserAction(mxmodelreflection.actions.SyncObjects.class);
    registrator.registerUserAction(mxmodelreflection.actions.TestThePattern.class);
    registrator.registerUserAction(mxmodelreflection.actions.ValidateTokensInMessage.class);
    registrator.registerUserAction(objecthandling.actions.clone.class);
    registrator.registerUserAction(objecthandling.actions.commitInSeparateDatabaseTransaction.class);
    registrator.registerUserAction(objecthandling.actions.copyAttributes.class);
    registrator.registerUserAction(objecthandling.actions.createObjectListFromObject.class);
    registrator.registerUserAction(objecthandling.actions.deepClone.class);
    registrator.registerUserAction(objecthandling.actions.deleteAll.class);
    registrator.registerUserAction(objecthandling.actions.deleteInSeparateTransaction.class);
    registrator.registerUserAction(objecthandling.actions.deleteWithoutEvents.class);
    registrator.registerUserAction(objecthandling.actions.EndTransaction.class);
    registrator.registerUserAction(objecthandling.actions.getCreatedByUser.class);
    registrator.registerUserAction(objecthandling.actions.getGUID.class);
    registrator.registerUserAction(objecthandling.actions.getLastChangedByUser.class);
    registrator.registerUserAction(objecthandling.actions.getOriginalValueAsString.class);
    registrator.registerUserAction(objecthandling.actions.getTypeAsString.class);
    registrator.registerUserAction(objecthandling.actions.memberHasChanged.class);
    registrator.registerUserAction(objecthandling.actions.objectHasChanged.class);
    registrator.registerUserAction(objecthandling.actions.refreshClassByObject.class);
    registrator.registerUserAction(objecthandling.actions.StartTransaction.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
    registrator.registerUserAction(unittesting.actions.FindAllUnitTests.class);
    registrator.registerUserAction(unittesting.actions.ReportStepJava.class);
    registrator.registerUserAction(unittesting.actions.RunAllUnitTestsWrapper.class);
    registrator.registerUserAction(unittesting.actions.RunUnitTest.class);
    registrator.registerUserAction(unittesting.actions.StartRemoteApiServlet.class);
    registrator.registerUserAction(unittesting.actions.StartRunAllSuites.class);
    registrator.registerUserAction(unittesting.actions.ThrowAssertionFailed.class);
  }
}
