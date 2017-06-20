# IMG_REC

We recieved the Travis County Clerk's index and images from 1974 - 1982.  We used the index to target a subset of document types to rename the images in document number format and to geneate image only souce type 'I' records on the title plant.  This was done to index these images to our system.  We also have some pre-1982 survey records keyed on our system.  This project is designed to identify source type 'I' records that also exist as source type 'R' in the survey records.

The CSV files were created from the sql queries outlined in the misc directory.  Basically, we matched 'I' records to 'R' records.

This program reads the CSV file, does some QC between the 'I' and 'R' record like confirming the volume/pages match, etc.  Then, it copies the source type 'I' images from the Image Repostiory to the preindex directory.

After this program completes, the target 'R' images are ready to index in the preindex directory.